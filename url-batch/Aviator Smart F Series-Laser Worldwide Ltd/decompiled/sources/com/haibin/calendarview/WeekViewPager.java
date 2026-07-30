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
public final class WeekViewPager extends ViewPager {
    private boolean isUpdateWeekView;
    private boolean isUsingScrollToCalendar;
    private c mDelegate;
    CalendarLayout mParentLayout;
    private int mWeekCount;

    class a implements ViewPager.OnPageChangeListener {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i8) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i8, float f8, int i9) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i8) {
            if (WeekViewPager.this.getVisibility() != 0) {
                WeekViewPager.this.isUsingScrollToCalendar = false;
                return;
            }
            if (WeekViewPager.this.isUsingScrollToCalendar) {
                WeekViewPager.this.isUsingScrollToCalendar = false;
                return;
            }
            BaseWeekView baseWeekView = (BaseWeekView) WeekViewPager.this.findViewWithTag(Integer.valueOf(i8));
            if (baseWeekView != null) {
                baseWeekView.performClickCalendar(WeekViewPager.this.mDelegate.getSelectMode() != 0 ? WeekViewPager.this.mDelegate.mIndexCalendar : WeekViewPager.this.mDelegate.mSelectedCalendar, !WeekViewPager.this.isUsingScrollToCalendar);
                WeekViewPager.this.mDelegate.getClass();
            }
            WeekViewPager.this.isUsingScrollToCalendar = false;
        }
    }

    private class b extends PagerAdapter {
        private b() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NonNull ViewGroup viewGroup, int i8, @NonNull Object obj) {
            BaseWeekView baseWeekView = (BaseWeekView) obj;
            baseWeekView.onDestroy();
            viewGroup.removeView(baseWeekView);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return WeekViewPager.this.mWeekCount;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NonNull Object obj) {
            if (WeekViewPager.this.isUpdateWeekView) {
                return -2;
            }
            return super.getItemPosition(obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i8) {
            Calendar firstCalendarStartWithMinCalendar = com.haibin.calendarview.b.getFirstCalendarStartWithMinCalendar(WeekViewPager.this.mDelegate.getMinYear(), WeekViewPager.this.mDelegate.getMinYearMonth(), WeekViewPager.this.mDelegate.getMinYearDay(), i8 + 1, WeekViewPager.this.mDelegate.getWeekStart());
            try {
                BaseWeekView baseWeekView = (BaseWeekView) WeekViewPager.this.mDelegate.getWeekViewClass().getConstructor(Context.class).newInstance(WeekViewPager.this.getContext());
                WeekViewPager weekViewPager = WeekViewPager.this;
                baseWeekView.mParentLayout = weekViewPager.mParentLayout;
                baseWeekView.setup(weekViewPager.mDelegate);
                baseWeekView.setup(firstCalendarStartWithMinCalendar);
                baseWeekView.setTag(Integer.valueOf(i8));
                baseWeekView.setSelectedCalendar(WeekViewPager.this.mDelegate.mSelectedCalendar);
                viewGroup.addView(baseWeekView);
                return baseWeekView;
            } catch (Exception e8) {
                e8.printStackTrace();
                return new DefaultWeekView(WeekViewPager.this.getContext());
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view.equals(obj);
        }

        /* synthetic */ b(WeekViewPager weekViewPager, a aVar) {
            this();
        }
    }

    public WeekViewPager(Context context) {
        this(context, null);
    }

    private void init() {
        this.mWeekCount = com.haibin.calendarview.b.getWeekCountBetweenBothCalendar(this.mDelegate.getMinYear(), this.mDelegate.getMinYearMonth(), this.mDelegate.getMinYearDay(), this.mDelegate.getMaxYear(), this.mDelegate.getMaxYearMonth(), this.mDelegate.getMaxYearDay(), this.mDelegate.getWeekStart());
        setAdapter(new b(this, null));
        addOnPageChangeListener(new a());
    }

    private void notifyAdapterDataSetChanged() {
        if (getAdapter() == null) {
            return;
        }
        getAdapter().notifyDataSetChanged();
    }

    final void clearMultiSelect() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            BaseWeekView baseWeekView = (BaseWeekView) getChildAt(i8);
            baseWeekView.mCurrentItem = -1;
            baseWeekView.invalidate();
        }
    }

    final void clearSelectRange() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            ((BaseWeekView) getChildAt(i8)).invalidate();
        }
    }

    final void clearSingleSelect() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            BaseWeekView baseWeekView = (BaseWeekView) getChildAt(i8);
            baseWeekView.mCurrentItem = -1;
            baseWeekView.invalidate();
        }
    }

    List<Calendar> getCurrentWeekCalendars() {
        c cVar = this.mDelegate;
        List<Calendar> weekCalendars = com.haibin.calendarview.b.getWeekCalendars(cVar.mIndexCalendar, cVar);
        this.mDelegate.addSchemesFromMap(weekCalendars);
        return weekCalendars;
    }

    void notifyDataSetChanged() {
        this.mWeekCount = com.haibin.calendarview.b.getWeekCountBetweenBothCalendar(this.mDelegate.getMinYear(), this.mDelegate.getMinYearMonth(), this.mDelegate.getMinYearDay(), this.mDelegate.getMaxYear(), this.mDelegate.getMaxYearMonth(), this.mDelegate.getMaxYearDay(), this.mDelegate.getWeekStart());
        notifyAdapterDataSetChanged();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mDelegate.isWeekViewScrollable() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, View.MeasureSpec.makeMeasureSpec(this.mDelegate.getCalendarItemHeight(), 1073741824));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mDelegate.isWeekViewScrollable() && super.onTouchEvent(motionEvent);
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
        updateSelected(calendar, z7);
        CalendarView.n nVar = this.mDelegate.mInnerListener;
        if (nVar != null) {
            nVar.onWeekDateSelected(calendar, false);
        }
        CalendarView.l lVar = this.mDelegate.mCalendarSelectListener;
        if (lVar != null && z8) {
            lVar.onCalendarSelect(calendar, false);
        }
        this.mParentLayout.updateSelectWeek(com.haibin.calendarview.b.getWeekFromDayInMonth(calendar, this.mDelegate.getWeekStart()));
    }

    void scrollToCurrent(boolean z7) {
        this.isUsingScrollToCalendar = true;
        int weekFromCalendarStartWithMinCalendar = com.haibin.calendarview.b.getWeekFromCalendarStartWithMinCalendar(this.mDelegate.getCurrentDay(), this.mDelegate.getMinYear(), this.mDelegate.getMinYearMonth(), this.mDelegate.getMinYearDay(), this.mDelegate.getWeekStart()) - 1;
        if (getCurrentItem() == weekFromCalendarStartWithMinCalendar) {
            this.isUsingScrollToCalendar = false;
        }
        setCurrentItem(weekFromCalendarStartWithMinCalendar, z7);
        BaseWeekView baseWeekView = (BaseWeekView) findViewWithTag(Integer.valueOf(weekFromCalendarStartWithMinCalendar));
        if (baseWeekView != null) {
            baseWeekView.performClickCalendar(this.mDelegate.getCurrentDay(), false);
            baseWeekView.setSelectedCalendar(this.mDelegate.getCurrentDay());
            baseWeekView.invalidate();
        }
        if (this.mDelegate.mCalendarSelectListener != null && getVisibility() == 0) {
            c cVar = this.mDelegate;
            cVar.mCalendarSelectListener.onCalendarSelect(cVar.mSelectedCalendar, false);
        }
        if (getVisibility() == 0) {
            c cVar2 = this.mDelegate;
            cVar2.mInnerListener.onWeekDateSelected(cVar2.getCurrentDay(), false);
        }
        this.mParentLayout.updateSelectWeek(com.haibin.calendarview.b.getWeekFromDayInMonth(this.mDelegate.getCurrentDay(), this.mDelegate.getWeekStart()));
    }

    void setup(c cVar) {
        this.mDelegate = cVar;
        init();
    }

    void updateCurrentDate() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            ((BaseWeekView) getChildAt(i8)).updateCurrentDate();
        }
    }

    void updateDefaultSelect() {
        BaseWeekView baseWeekView = (BaseWeekView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (baseWeekView != null) {
            baseWeekView.setSelectedCalendar(this.mDelegate.mSelectedCalendar);
            baseWeekView.invalidate();
        }
    }

    final void updateItemHeight() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            BaseWeekView baseWeekView = (BaseWeekView) getChildAt(i8);
            baseWeekView.updateItemHeight();
            baseWeekView.requestLayout();
        }
    }

    void updateRange() {
        this.isUpdateWeekView = true;
        notifyDataSetChanged();
        this.isUpdateWeekView = false;
        if (getVisibility() != 0) {
            return;
        }
        this.isUsingScrollToCalendar = true;
        Calendar calendar = this.mDelegate.mSelectedCalendar;
        updateSelected(calendar, false);
        CalendarView.n nVar = this.mDelegate.mInnerListener;
        if (nVar != null) {
            nVar.onWeekDateSelected(calendar, false);
        }
        CalendarView.l lVar = this.mDelegate.mCalendarSelectListener;
        if (lVar != null) {
            lVar.onCalendarSelect(calendar, false);
        }
        this.mParentLayout.updateSelectWeek(com.haibin.calendarview.b.getWeekFromDayInMonth(calendar, this.mDelegate.getWeekStart()));
    }

    void updateScheme() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            ((BaseWeekView) getChildAt(i8)).update();
        }
    }

    void updateSelected(Calendar calendar, boolean z7) {
        int weekFromCalendarStartWithMinCalendar = com.haibin.calendarview.b.getWeekFromCalendarStartWithMinCalendar(calendar, this.mDelegate.getMinYear(), this.mDelegate.getMinYearMonth(), this.mDelegate.getMinYearDay(), this.mDelegate.getWeekStart()) - 1;
        this.isUsingScrollToCalendar = getCurrentItem() != weekFromCalendarStartWithMinCalendar;
        setCurrentItem(weekFromCalendarStartWithMinCalendar, z7);
        BaseWeekView baseWeekView = (BaseWeekView) findViewWithTag(Integer.valueOf(weekFromCalendarStartWithMinCalendar));
        if (baseWeekView != null) {
            baseWeekView.setSelectedCalendar(calendar);
            baseWeekView.invalidate();
        }
    }

    void updateShowMode() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            ((BaseWeekView) getChildAt(i8)).updateShowMode();
        }
    }

    void updateSingleSelect() {
        if (this.mDelegate.getSelectMode() == 0) {
            return;
        }
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            ((BaseWeekView) getChildAt(i8)).updateSingleSelect();
        }
    }

    final void updateStyle() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            BaseWeekView baseWeekView = (BaseWeekView) getChildAt(i8);
            baseWeekView.updateStyle();
            baseWeekView.invalidate();
        }
    }

    void updateWeekStart() {
        if (getAdapter() == null) {
            return;
        }
        int count = getAdapter().getCount();
        int weekCountBetweenBothCalendar = com.haibin.calendarview.b.getWeekCountBetweenBothCalendar(this.mDelegate.getMinYear(), this.mDelegate.getMinYearMonth(), this.mDelegate.getMinYearDay(), this.mDelegate.getMaxYear(), this.mDelegate.getMaxYearMonth(), this.mDelegate.getMaxYearDay(), this.mDelegate.getWeekStart());
        this.mWeekCount = weekCountBetweenBothCalendar;
        if (count != weekCountBetweenBothCalendar) {
            this.isUpdateWeekView = true;
            getAdapter().notifyDataSetChanged();
        }
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            ((BaseWeekView) getChildAt(i8)).updateWeekStart();
        }
        this.isUpdateWeekView = false;
        updateSelected(this.mDelegate.mSelectedCalendar, false);
    }

    void updateWeekViewClass() {
        this.isUpdateWeekView = true;
        notifyAdapterDataSetChanged();
        this.isUpdateWeekView = false;
    }

    public WeekViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isUsingScrollToCalendar = false;
    }

    void updateSelected() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            BaseWeekView baseWeekView = (BaseWeekView) getChildAt(i8);
            baseWeekView.setSelectedCalendar(this.mDelegate.mSelectedCalendar);
            baseWeekView.invalidate();
        }
    }
}
