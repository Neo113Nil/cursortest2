package com.haibin.calendarview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.haibin.calendarview.CalendarView;
import java.util.List;

/* loaded from: classes4.dex */
public final class MonthViewPager extends ViewPager {
    private boolean isUpdateMonthView;
    private boolean isUsingScrollToCalendar;
    private int mCurrentViewHeight;
    private c mDelegate;
    private int mMonthCount;
    private int mNextViewHeight;
    CalendarLayout mParentLayout;
    private int mPreViewHeight;
    WeekBar mWeekBar;
    WeekViewPager mWeekPager;

    class a implements ViewPager.OnPageChangeListener {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i8) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i8, float f8, int i9) {
            float f9;
            int i10;
            if (MonthViewPager.this.mDelegate.getMonthViewShowMode() == 0) {
                return;
            }
            if (i8 < MonthViewPager.this.getCurrentItem()) {
                f9 = MonthViewPager.this.mPreViewHeight * (1.0f - f8);
                i10 = MonthViewPager.this.mCurrentViewHeight;
            } else {
                f9 = MonthViewPager.this.mCurrentViewHeight * (1.0f - f8);
                i10 = MonthViewPager.this.mNextViewHeight;
            }
            int i11 = (int) (f9 + (i10 * f8));
            ViewGroup.LayoutParams layoutParams = MonthViewPager.this.getLayoutParams();
            layoutParams.height = i11;
            MonthViewPager.this.setLayoutParams(layoutParams);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i8) {
            CalendarLayout calendarLayout;
            Calendar firstCalendarFromMonthViewPager = com.haibin.calendarview.b.getFirstCalendarFromMonthViewPager(i8, MonthViewPager.this.mDelegate);
            if (MonthViewPager.this.getVisibility() == 0) {
                if (!MonthViewPager.this.mDelegate.isShowYearSelectedLayout && MonthViewPager.this.mDelegate.mIndexCalendar != null && firstCalendarFromMonthViewPager.getYear() != MonthViewPager.this.mDelegate.mIndexCalendar.getYear()) {
                    MonthViewPager.this.mDelegate.getClass();
                }
                MonthViewPager.this.mDelegate.mIndexCalendar = firstCalendarFromMonthViewPager;
            }
            if (MonthViewPager.this.mDelegate.mMonthChangeListener != null) {
                MonthViewPager.this.mDelegate.mMonthChangeListener.onMonthChange(firstCalendarFromMonthViewPager.getYear(), firstCalendarFromMonthViewPager.getMonth());
            }
            if (MonthViewPager.this.mWeekPager.getVisibility() == 0) {
                MonthViewPager.this.updateMonthViewHeight(firstCalendarFromMonthViewPager.getYear(), firstCalendarFromMonthViewPager.getMonth());
                return;
            }
            if (MonthViewPager.this.mDelegate.getSelectMode() == 0) {
                if (firstCalendarFromMonthViewPager.isCurrentMonth()) {
                    MonthViewPager.this.mDelegate.mSelectedCalendar = com.haibin.calendarview.b.getRangeEdgeCalendar(firstCalendarFromMonthViewPager, MonthViewPager.this.mDelegate);
                } else {
                    MonthViewPager.this.mDelegate.mSelectedCalendar = firstCalendarFromMonthViewPager;
                }
                MonthViewPager.this.mDelegate.mIndexCalendar = MonthViewPager.this.mDelegate.mSelectedCalendar;
            } else if (MonthViewPager.this.mDelegate.mSelectedStartRangeCalendar != null && MonthViewPager.this.mDelegate.mSelectedStartRangeCalendar.isSameMonth(MonthViewPager.this.mDelegate.mIndexCalendar)) {
                MonthViewPager.this.mDelegate.mIndexCalendar = MonthViewPager.this.mDelegate.mSelectedStartRangeCalendar;
            } else if (firstCalendarFromMonthViewPager.isSameMonth(MonthViewPager.this.mDelegate.mSelectedCalendar)) {
                MonthViewPager.this.mDelegate.mIndexCalendar = MonthViewPager.this.mDelegate.mSelectedCalendar;
            }
            MonthViewPager.this.mDelegate.updateSelectCalendarScheme();
            if (!MonthViewPager.this.isUsingScrollToCalendar && MonthViewPager.this.mDelegate.getSelectMode() == 0) {
                MonthViewPager monthViewPager = MonthViewPager.this;
                monthViewPager.mWeekBar.onDateSelected(monthViewPager.mDelegate.mSelectedCalendar, MonthViewPager.this.mDelegate.getWeekStart(), false);
                if (MonthViewPager.this.mDelegate.mCalendarSelectListener != null) {
                    MonthViewPager.this.mDelegate.mCalendarSelectListener.onCalendarSelect(MonthViewPager.this.mDelegate.mSelectedCalendar, false);
                }
            }
            BaseMonthView baseMonthView = (BaseMonthView) MonthViewPager.this.findViewWithTag(Integer.valueOf(i8));
            if (baseMonthView != null) {
                int selectedIndex = baseMonthView.getSelectedIndex(MonthViewPager.this.mDelegate.mIndexCalendar);
                if (MonthViewPager.this.mDelegate.getSelectMode() == 0) {
                    baseMonthView.mCurrentItem = selectedIndex;
                }
                if (selectedIndex >= 0 && (calendarLayout = MonthViewPager.this.mParentLayout) != null) {
                    calendarLayout.updateSelectPosition(selectedIndex);
                }
                baseMonthView.invalidate();
            }
            MonthViewPager monthViewPager2 = MonthViewPager.this;
            monthViewPager2.mWeekPager.updateSelected(monthViewPager2.mDelegate.mIndexCalendar, false);
            MonthViewPager.this.updateMonthViewHeight(firstCalendarFromMonthViewPager.getYear(), firstCalendarFromMonthViewPager.getMonth());
            MonthViewPager.this.isUsingScrollToCalendar = false;
        }
    }

    private final class b extends PagerAdapter {
        private b() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NonNull ViewGroup viewGroup, int i8, @NonNull Object obj) {
            BaseView baseView = (BaseView) obj;
            baseView.onDestroy();
            viewGroup.removeView(baseView);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return MonthViewPager.this.mMonthCount;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NonNull Object obj) {
            if (MonthViewPager.this.isUpdateMonthView) {
                return -2;
            }
            return super.getItemPosition(obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i8) {
            int minYearMonth = (((MonthViewPager.this.mDelegate.getMinYearMonth() + i8) - 1) / 12) + MonthViewPager.this.mDelegate.getMinYear();
            int minYearMonth2 = (((MonthViewPager.this.mDelegate.getMinYearMonth() + i8) - 1) % 12) + 1;
            try {
                BaseMonthView baseMonthView = (BaseMonthView) MonthViewPager.this.mDelegate.getMonthViewClass().getConstructor(Context.class).newInstance(MonthViewPager.this.getContext());
                MonthViewPager monthViewPager = MonthViewPager.this;
                baseMonthView.mMonthViewPager = monthViewPager;
                baseMonthView.mParentLayout = monthViewPager.mParentLayout;
                baseMonthView.setup(monthViewPager.mDelegate);
                baseMonthView.setTag(Integer.valueOf(i8));
                baseMonthView.initMonthWithDate(minYearMonth, minYearMonth2);
                baseMonthView.setSelectedCalendar(MonthViewPager.this.mDelegate.mSelectedCalendar);
                viewGroup.addView(baseMonthView);
                return baseMonthView;
            } catch (Exception e8) {
                e8.printStackTrace();
                return new DefaultMonthView(MonthViewPager.this.getContext());
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, @NonNull Object obj) {
            return view.equals(obj);
        }

        /* synthetic */ b(MonthViewPager monthViewPager, a aVar) {
            this();
        }
    }

    public MonthViewPager(Context context) {
        this(context, null);
    }

    private void init() {
        this.mMonthCount = (((this.mDelegate.getMaxYear() - this.mDelegate.getMinYear()) * 12) - this.mDelegate.getMinYearMonth()) + 1 + this.mDelegate.getMaxYearMonth();
        setAdapter(new b(this, null));
        addOnPageChangeListener(new a());
    }

    private void notifyAdapterDataSetChanged() {
        if (getAdapter() == null) {
            return;
        }
        getAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMonthViewHeight(int i8, int i9) {
        if (this.mDelegate.getMonthViewShowMode() == 0) {
            this.mCurrentViewHeight = this.mDelegate.getCalendarItemHeight() * 6;
            getLayoutParams().height = this.mCurrentViewHeight;
            return;
        }
        if (this.mParentLayout != null) {
            if (getVisibility() != 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = com.haibin.calendarview.b.getMonthViewHeight(i8, i9, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
                setLayoutParams(layoutParams);
            }
            this.mParentLayout.updateContentViewTranslateY();
        }
        this.mCurrentViewHeight = com.haibin.calendarview.b.getMonthViewHeight(i8, i9, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        if (i9 == 1) {
            this.mPreViewHeight = com.haibin.calendarview.b.getMonthViewHeight(i8 - 1, 12, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
            this.mNextViewHeight = com.haibin.calendarview.b.getMonthViewHeight(i8, 2, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
            return;
        }
        this.mPreViewHeight = com.haibin.calendarview.b.getMonthViewHeight(i8, i9 - 1, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        if (i9 == 12) {
            this.mNextViewHeight = com.haibin.calendarview.b.getMonthViewHeight(i8 + 1, 1, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        } else {
            this.mNextViewHeight = com.haibin.calendarview.b.getMonthViewHeight(i8, i9 + 1, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        }
    }

    final void clearMultiSelect() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i8);
            baseMonthView.mCurrentItem = -1;
            baseMonthView.invalidate();
        }
    }

    final void clearSelectRange() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            ((BaseMonthView) getChildAt(i8)).invalidate();
        }
    }

    final void clearSingleSelect() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i8);
            baseMonthView.mCurrentItem = -1;
            baseMonthView.invalidate();
        }
    }

    List<Calendar> getCurrentMonthCalendars() {
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (baseMonthView == null) {
            return null;
        }
        return baseMonthView.mItems;
    }

    void notifyDataSetChanged() {
        this.mMonthCount = (((this.mDelegate.getMaxYear() - this.mDelegate.getMinYear()) * 12) - this.mDelegate.getMinYearMonth()) + 1 + this.mDelegate.getMaxYearMonth();
        notifyAdapterDataSetChanged();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mDelegate.isMonthViewScrollable() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mDelegate.isMonthViewScrollable() && super.onTouchEvent(motionEvent);
    }

    void scrollToCalendar(int i8, int i9, int i10, boolean z7, boolean z8) {
        this.isUsingScrollToCalendar = true;
        Calendar calendar = new Calendar();
        calendar.setYear(i8);
        calendar.setMonth(i9);
        calendar.setDay(i10);
        calendar.setCurrentDay(calendar.equals(this.mDelegate.getCurrentDay()));
        d.setupLunarCalendar(calendar);
        c cVar = this.mDelegate;
        cVar.mIndexCalendar = calendar;
        cVar.mSelectedCalendar = calendar;
        cVar.updateSelectCalendarScheme();
        int year = (((calendar.getYear() - this.mDelegate.getMinYear()) * 12) + calendar.getMonth()) - this.mDelegate.getMinYearMonth();
        if (getCurrentItem() == year) {
            this.isUsingScrollToCalendar = false;
        }
        setCurrentItem(year, z7);
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(year));
        if (baseMonthView != null) {
            baseMonthView.setSelectedCalendar(this.mDelegate.mIndexCalendar);
            baseMonthView.invalidate();
            CalendarLayout calendarLayout = this.mParentLayout;
            if (calendarLayout != null) {
                calendarLayout.updateSelectPosition(baseMonthView.getSelectedIndex(this.mDelegate.mIndexCalendar));
            }
        }
        if (this.mParentLayout != null) {
            this.mParentLayout.updateSelectWeek(com.haibin.calendarview.b.getWeekFromDayInMonth(calendar, this.mDelegate.getWeekStart()));
        }
        CalendarView.l lVar = this.mDelegate.mCalendarSelectListener;
        if (lVar != null && z8) {
            lVar.onCalendarSelect(calendar, false);
        }
        CalendarView.n nVar = this.mDelegate.mInnerListener;
        if (nVar != null) {
            nVar.onMonthDateSelected(calendar, false);
        }
        updateSelected();
    }

    void scrollToCurrent(boolean z7) {
        this.isUsingScrollToCalendar = true;
        int year = (((this.mDelegate.getCurrentDay().getYear() - this.mDelegate.getMinYear()) * 12) + this.mDelegate.getCurrentDay().getMonth()) - this.mDelegate.getMinYearMonth();
        if (getCurrentItem() == year) {
            this.isUsingScrollToCalendar = false;
        }
        setCurrentItem(year, z7);
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(year));
        if (baseMonthView != null) {
            baseMonthView.setSelectedCalendar(this.mDelegate.getCurrentDay());
            baseMonthView.invalidate();
            CalendarLayout calendarLayout = this.mParentLayout;
            if (calendarLayout != null) {
                calendarLayout.updateSelectPosition(baseMonthView.getSelectedIndex(this.mDelegate.getCurrentDay()));
            }
        }
        if (this.mDelegate.mCalendarSelectListener == null || getVisibility() != 0) {
            return;
        }
        c cVar = this.mDelegate;
        cVar.mCalendarSelectListener.onCalendarSelect(cVar.mSelectedCalendar, false);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i8) {
        setCurrentItem(i8, true);
    }

    void setup(c cVar) {
        this.mDelegate = cVar;
        updateMonthViewHeight(cVar.getCurrentDay().getYear(), this.mDelegate.getCurrentDay().getMonth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.mCurrentViewHeight;
        setLayoutParams(layoutParams);
        init();
    }

    void updateCurrentDate() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            ((BaseMonthView) getChildAt(i8)).updateCurrentDate();
        }
    }

    void updateDefaultSelect() {
        CalendarLayout calendarLayout;
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (baseMonthView != null) {
            int selectedIndex = baseMonthView.getSelectedIndex(this.mDelegate.mSelectedCalendar);
            baseMonthView.mCurrentItem = selectedIndex;
            if (selectedIndex >= 0 && (calendarLayout = this.mParentLayout) != null) {
                calendarLayout.updateSelectPosition(selectedIndex);
            }
            baseMonthView.invalidate();
        }
    }

    final void updateItemHeight() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i8);
            baseMonthView.updateItemHeight();
            baseMonthView.requestLayout();
        }
        int year = this.mDelegate.mIndexCalendar.getYear();
        int month = this.mDelegate.mIndexCalendar.getMonth();
        this.mCurrentViewHeight = com.haibin.calendarview.b.getMonthViewHeight(year, month, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        if (month == 1) {
            this.mPreViewHeight = com.haibin.calendarview.b.getMonthViewHeight(year - 1, 12, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
            this.mNextViewHeight = com.haibin.calendarview.b.getMonthViewHeight(year, 2, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        } else {
            this.mPreViewHeight = com.haibin.calendarview.b.getMonthViewHeight(year, month - 1, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
            if (month == 12) {
                this.mNextViewHeight = com.haibin.calendarview.b.getMonthViewHeight(year + 1, 1, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
            } else {
                this.mNextViewHeight = com.haibin.calendarview.b.getMonthViewHeight(year, month + 1, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.mCurrentViewHeight;
        setLayoutParams(layoutParams);
    }

    void updateMonthViewClass() {
        this.isUpdateMonthView = true;
        notifyAdapterDataSetChanged();
        this.isUpdateMonthView = false;
    }

    final void updateRange() {
        this.isUpdateMonthView = true;
        notifyDataSetChanged();
        this.isUpdateMonthView = false;
        if (getVisibility() != 0) {
            return;
        }
        this.isUsingScrollToCalendar = false;
        Calendar calendar = this.mDelegate.mSelectedCalendar;
        int year = (((calendar.getYear() - this.mDelegate.getMinYear()) * 12) + calendar.getMonth()) - this.mDelegate.getMinYearMonth();
        setCurrentItem(year, false);
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(year));
        if (baseMonthView != null) {
            baseMonthView.setSelectedCalendar(this.mDelegate.mIndexCalendar);
            baseMonthView.invalidate();
            CalendarLayout calendarLayout = this.mParentLayout;
            if (calendarLayout != null) {
                calendarLayout.updateSelectPosition(baseMonthView.getSelectedIndex(this.mDelegate.mIndexCalendar));
            }
        }
        if (this.mParentLayout != null) {
            this.mParentLayout.updateSelectWeek(com.haibin.calendarview.b.getWeekFromDayInMonth(calendar, this.mDelegate.getWeekStart()));
        }
        CalendarView.n nVar = this.mDelegate.mInnerListener;
        if (nVar != null) {
            nVar.onMonthDateSelected(calendar, false);
        }
        CalendarView.l lVar = this.mDelegate.mCalendarSelectListener;
        if (lVar != null) {
            lVar.onCalendarSelect(calendar, false);
        }
        updateSelected();
    }

    void updateScheme() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            ((BaseMonthView) getChildAt(i8)).update();
        }
    }

    void updateSelected() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i8);
            baseMonthView.setSelectedCalendar(this.mDelegate.mSelectedCalendar);
            baseMonthView.invalidate();
        }
    }

    void updateShowMode() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i8);
            baseMonthView.updateShowMode();
            baseMonthView.requestLayout();
        }
        if (this.mDelegate.getMonthViewShowMode() == 0) {
            int calendarItemHeight = this.mDelegate.getCalendarItemHeight() * 6;
            this.mCurrentViewHeight = calendarItemHeight;
            this.mNextViewHeight = calendarItemHeight;
            this.mPreViewHeight = calendarItemHeight;
        } else {
            updateMonthViewHeight(this.mDelegate.mSelectedCalendar.getYear(), this.mDelegate.mSelectedCalendar.getMonth());
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.mCurrentViewHeight;
        setLayoutParams(layoutParams);
        CalendarLayout calendarLayout = this.mParentLayout;
        if (calendarLayout != null) {
            calendarLayout.updateContentViewTranslateY();
        }
    }

    final void updateStyle() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i8);
            baseMonthView.updateStyle();
            baseMonthView.invalidate();
        }
    }

    void updateWeekStart() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i8);
            baseMonthView.updateWeekStart();
            baseMonthView.requestLayout();
        }
        updateMonthViewHeight(this.mDelegate.mSelectedCalendar.getYear(), this.mDelegate.mSelectedCalendar.getMonth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.mCurrentViewHeight;
        setLayoutParams(layoutParams);
        if (this.mParentLayout != null) {
            c cVar = this.mDelegate;
            this.mParentLayout.updateSelectWeek(com.haibin.calendarview.b.getWeekFromDayInMonth(cVar.mSelectedCalendar, cVar.getWeekStart()));
        }
        updateSelected();
    }

    public MonthViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isUsingScrollToCalendar = false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i8, boolean z7) {
        if (Math.abs(getCurrentItem() - i8) > 1) {
            super.setCurrentItem(i8, false);
        } else {
            super.setCurrentItem(i8, z7);
        }
    }
}
