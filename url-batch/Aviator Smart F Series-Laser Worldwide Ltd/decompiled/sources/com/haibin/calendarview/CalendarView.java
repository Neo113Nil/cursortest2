package com.haibin.calendarview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.haibin.calendarview.YearRecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class CalendarView extends FrameLayout {
    private final com.haibin.calendarview.c mDelegate;
    private MonthViewPager mMonthPager;
    CalendarLayout mParentLayout;
    private WeekBar mWeekBar;
    private View mWeekLine;
    private WeekViewPager mWeekPager;
    private YearViewPager mYearViewPager;

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
            if (CalendarView.this.mWeekPager.getVisibility() == 0) {
                return;
            }
            CalendarView.this.mDelegate.getClass();
        }
    }

    class b implements n {
        b() {
        }

        @Override // com.haibin.calendarview.CalendarView.n
        public void onMonthDateSelected(Calendar calendar, boolean z7) {
            if (calendar.getYear() == CalendarView.this.mDelegate.getCurrentDay().getYear() && calendar.getMonth() == CalendarView.this.mDelegate.getCurrentDay().getMonth() && CalendarView.this.mMonthPager.getCurrentItem() != CalendarView.this.mDelegate.mCurrentMonthViewItem) {
                return;
            }
            CalendarView.this.mDelegate.mIndexCalendar = calendar;
            if (CalendarView.this.mDelegate.getSelectMode() == 0 || z7) {
                CalendarView.this.mDelegate.mSelectedCalendar = calendar;
            }
            CalendarView.this.mWeekPager.updateSelected(CalendarView.this.mDelegate.mIndexCalendar, false);
            CalendarView.this.mMonthPager.updateSelected();
            if (CalendarView.this.mWeekBar != null) {
                if (CalendarView.this.mDelegate.getSelectMode() == 0 || z7) {
                    CalendarView.this.mWeekBar.onDateSelected(calendar, CalendarView.this.mDelegate.getWeekStart(), z7);
                }
            }
        }

        @Override // com.haibin.calendarview.CalendarView.n
        public void onWeekDateSelected(Calendar calendar, boolean z7) {
            CalendarView.this.mDelegate.mIndexCalendar = calendar;
            if (CalendarView.this.mDelegate.getSelectMode() == 0 || z7 || CalendarView.this.mDelegate.mIndexCalendar.equals(CalendarView.this.mDelegate.mSelectedCalendar)) {
                CalendarView.this.mDelegate.mSelectedCalendar = calendar;
            }
            int year = (((calendar.getYear() - CalendarView.this.mDelegate.getMinYear()) * 12) + CalendarView.this.mDelegate.mIndexCalendar.getMonth()) - CalendarView.this.mDelegate.getMinYearMonth();
            CalendarView.this.mWeekPager.updateSingleSelect();
            CalendarView.this.mMonthPager.setCurrentItem(year, false);
            CalendarView.this.mMonthPager.updateSelected();
            if (CalendarView.this.mWeekBar != null) {
                if (CalendarView.this.mDelegate.getSelectMode() == 0 || z7 || CalendarView.this.mDelegate.mIndexCalendar.equals(CalendarView.this.mDelegate.mSelectedCalendar)) {
                    CalendarView.this.mWeekBar.onDateSelected(calendar, CalendarView.this.mDelegate.getWeekStart(), z7);
                }
            }
        }
    }

    class c implements YearRecyclerView.b {
        c() {
        }

        @Override // com.haibin.calendarview.YearRecyclerView.b
        public void onMonthSelected(int i8, int i9) {
            CalendarView.this.closeSelectLayout((((i8 - CalendarView.this.mDelegate.getMinYear()) * 12) + i9) - CalendarView.this.mDelegate.getMinYearMonth());
            CalendarView.this.mDelegate.isShowYearSelectedLayout = false;
        }
    }

    class d extends AnimatorListenerAdapter {
        final /* synthetic */ int val$year;

        d(int i8) {
            this.val$year = i8;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CalendarView.this.mWeekBar.setVisibility(8);
            CalendarView.this.mYearViewPager.setVisibility(0);
            CalendarView.this.mYearViewPager.scrollToYear(this.val$year, false);
            CalendarLayout calendarLayout = CalendarView.this.mParentLayout;
            if (calendarLayout == null || calendarLayout.mContentView == null) {
                return;
            }
            calendarLayout.expand();
        }
    }

    class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CalendarView.this.mDelegate.getClass();
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CalendarView.this.mWeekBar.setVisibility(0);
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CalendarView.this.mDelegate.getClass();
            CalendarView calendarView = CalendarView.this;
            CalendarLayout calendarLayout = calendarView.mParentLayout;
            if (calendarLayout != null) {
                calendarLayout.showContentView();
                if (CalendarView.this.mParentLayout.isExpand()) {
                    CalendarView.this.mMonthPager.setVisibility(0);
                } else {
                    CalendarView.this.mWeekPager.setVisibility(0);
                    CalendarView.this.mParentLayout.shrink();
                }
            } else {
                calendarView.mMonthPager.setVisibility(0);
            }
            CalendarView.this.mMonthPager.clearAnimation();
        }
    }

    public interface h {
        boolean a(Calendar calendar);
    }

    public interface i {
    }

    public interface j {
    }

    public interface k {
    }

    public interface l {
        void onCalendarOutOfRange(Calendar calendar);

        void onCalendarSelect(Calendar calendar, boolean z7);
    }

    public interface m {
    }

    interface n {
        void onMonthDateSelected(Calendar calendar, boolean z7);

        void onWeekDateSelected(Calendar calendar, boolean z7);
    }

    public interface o {
        void onMonthChange(int i8, int i9);
    }

    public interface p {
    }

    public interface q {
    }

    public interface r {
    }

    public interface s {
    }

    public CalendarView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeSelectLayout(int i8) {
        this.mYearViewPager.setVisibility(8);
        this.mWeekBar.setVisibility(0);
        if (i8 == this.mMonthPager.getCurrentItem()) {
            com.haibin.calendarview.c cVar = this.mDelegate;
            if (cVar.mCalendarSelectListener != null && cVar.getSelectMode() != 1) {
                com.haibin.calendarview.c cVar2 = this.mDelegate;
                cVar2.mCalendarSelectListener.onCalendarSelect(cVar2.mSelectedCalendar, false);
            }
        } else {
            this.mMonthPager.setCurrentItem(i8, false);
        }
        this.mWeekBar.animate().translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(280L).setListener(new f());
        this.mMonthPager.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).setInterpolator(new LinearInterpolator()).setListener(new g());
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R$layout.cv_layout_calendar_view, (ViewGroup) this, true);
        FrameLayout frameLayout = (FrameLayout) findViewById(R$id.frameContent);
        WeekViewPager weekViewPager = (WeekViewPager) findViewById(R$id.vp_week);
        this.mWeekPager = weekViewPager;
        weekViewPager.setup(this.mDelegate);
        try {
            this.mWeekBar = (WeekBar) this.mDelegate.getWeekBarClass().getConstructor(Context.class).newInstance(getContext());
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        frameLayout.addView(this.mWeekBar, 2);
        this.mWeekBar.setup(this.mDelegate);
        this.mWeekBar.onWeekStartChange(this.mDelegate.getWeekStart());
        View findViewById = findViewById(R$id.line);
        this.mWeekLine = findViewById;
        findViewById.setBackgroundColor(this.mDelegate.getWeekLineBackground());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mWeekLine.getLayoutParams();
        layoutParams.setMargins(this.mDelegate.getWeekLineMargin(), this.mDelegate.getWeekBarHeight(), this.mDelegate.getWeekLineMargin(), 0);
        this.mWeekLine.setLayoutParams(layoutParams);
        MonthViewPager monthViewPager = (MonthViewPager) findViewById(R$id.vp_month);
        this.mMonthPager = monthViewPager;
        monthViewPager.mWeekPager = this.mWeekPager;
        monthViewPager.mWeekBar = this.mWeekBar;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) monthViewPager.getLayoutParams();
        layoutParams2.setMargins(0, this.mDelegate.getWeekBarHeight() + com.haibin.calendarview.b.dipToPx(context, 1.0f), 0, 0);
        this.mWeekPager.setLayoutParams(layoutParams2);
        YearViewPager yearViewPager = (YearViewPager) findViewById(R$id.selectLayout);
        this.mYearViewPager = yearViewPager;
        yearViewPager.setPadding(this.mDelegate.getYearViewPaddingLeft(), 0, this.mDelegate.getYearViewPaddingRight(), 0);
        this.mYearViewPager.setBackgroundColor(this.mDelegate.getYearViewBackground());
        this.mYearViewPager.addOnPageChangeListener(new a());
        this.mDelegate.mInnerListener = new b();
        if (this.mDelegate.getSelectMode() != 0) {
            this.mDelegate.mSelectedCalendar = new Calendar();
        } else if (isInRange(this.mDelegate.getCurrentDay())) {
            com.haibin.calendarview.c cVar = this.mDelegate;
            cVar.mSelectedCalendar = cVar.createCurrentDate();
        } else {
            com.haibin.calendarview.c cVar2 = this.mDelegate;
            cVar2.mSelectedCalendar = cVar2.getMinRangeCalendar();
        }
        com.haibin.calendarview.c cVar3 = this.mDelegate;
        Calendar calendar = cVar3.mSelectedCalendar;
        cVar3.mIndexCalendar = calendar;
        this.mWeekBar.onDateSelected(calendar, cVar3.getWeekStart(), false);
        this.mMonthPager.setup(this.mDelegate);
        this.mMonthPager.setCurrentItem(this.mDelegate.mCurrentMonthViewItem);
        this.mYearViewPager.setOnMonthSelectedListener(new c());
        this.mYearViewPager.setup(this.mDelegate);
        this.mWeekPager.updateSelected(this.mDelegate.createCurrentDate(), false);
    }

    private void setShowMode(int i8) {
        if ((i8 == 0 || i8 == 1 || i8 == 2) && this.mDelegate.getMonthViewShowMode() != i8) {
            this.mDelegate.setMonthViewShowMode(i8);
            this.mWeekPager.updateShowMode();
            this.mMonthPager.updateShowMode();
            this.mWeekPager.notifyDataSetChanged();
        }
    }

    private void setWeekStart(int i8) {
        if ((i8 == 1 || i8 == 2 || i8 == 7) && i8 != this.mDelegate.getWeekStart()) {
            this.mDelegate.setWeekStart(i8);
            this.mWeekBar.onWeekStartChange(i8);
            this.mWeekBar.onDateSelected(this.mDelegate.mSelectedCalendar, i8, false);
            this.mWeekPager.updateWeekStart();
            this.mMonthPager.updateWeekStart();
            this.mYearViewPager.updateWeekStart();
        }
    }

    private void showSelectLayout(int i8) {
        CalendarLayout calendarLayout = this.mParentLayout;
        if (calendarLayout != null && calendarLayout.mContentView != null && !calendarLayout.isExpand()) {
            this.mParentLayout.expand();
        }
        this.mWeekPager.setVisibility(8);
        this.mDelegate.isShowYearSelectedLayout = true;
        CalendarLayout calendarLayout2 = this.mParentLayout;
        if (calendarLayout2 != null) {
            calendarLayout2.hideContentView();
        }
        this.mWeekBar.animate().translationY(-this.mWeekBar.getHeight()).setInterpolator(new LinearInterpolator()).setDuration(260L).setListener(new d(i8));
        this.mMonthPager.animate().scaleX(0.0f).scaleY(0.0f).setDuration(260L).setInterpolator(new LinearInterpolator()).setListener(new e());
    }

    public final void addSchemeDate(Calendar calendar) {
        if (calendar == null || !calendar.isAvailable()) {
            return;
        }
        com.haibin.calendarview.c cVar = this.mDelegate;
        if (cVar.mSchemeDatesMap == null) {
            cVar.mSchemeDatesMap = new HashMap();
        }
        this.mDelegate.mSchemeDatesMap.remove(calendar.toString());
        this.mDelegate.mSchemeDatesMap.put(calendar.toString(), calendar);
        this.mDelegate.updateSelectCalendarScheme();
        this.mYearViewPager.update();
        this.mMonthPager.updateScheme();
        this.mWeekPager.updateScheme();
    }

    public final void clearMultiSelect() {
        this.mDelegate.mSelectedCalendars.clear();
        this.mMonthPager.clearMultiSelect();
        this.mWeekPager.clearMultiSelect();
    }

    public final void clearSchemeDate() {
        com.haibin.calendarview.c cVar = this.mDelegate;
        cVar.mSchemeDatesMap = null;
        cVar.clearSelectedScheme();
        this.mYearViewPager.update();
        this.mMonthPager.updateScheme();
        this.mWeekPager.updateScheme();
    }

    public final void clearSelectRange() {
        this.mDelegate.clearSelectRange();
        this.mMonthPager.clearSelectRange();
        this.mWeekPager.clearSelectRange();
    }

    public final void clearSingleSelect() {
        this.mDelegate.mSelectedCalendar = new Calendar();
        this.mMonthPager.clearSingleSelect();
        this.mWeekPager.clearSingleSelect();
    }

    public void closeYearSelectLayout() {
        if (this.mYearViewPager.getVisibility() == 8) {
            return;
        }
        closeSelectLayout((((this.mDelegate.mSelectedCalendar.getYear() - this.mDelegate.getMinYear()) * 12) + this.mDelegate.mSelectedCalendar.getMonth()) - this.mDelegate.getMinYearMonth());
        this.mDelegate.isShowYearSelectedLayout = false;
    }

    public int getCurDay() {
        return this.mDelegate.getCurrentDay().getDay();
    }

    public int getCurMonth() {
        return this.mDelegate.getCurrentDay().getMonth();
    }

    public int getCurYear() {
        return this.mDelegate.getCurrentDay().getYear();
    }

    public List<Calendar> getCurrentMonthCalendars() {
        return this.mMonthPager.getCurrentMonthCalendars();
    }

    public List<Calendar> getCurrentWeekCalendars() {
        return this.mWeekPager.getCurrentWeekCalendars();
    }

    public final int getMaxMultiSelectSize() {
        return this.mDelegate.getMaxMultiSelectSize();
    }

    public Calendar getMaxRangeCalendar() {
        return this.mDelegate.getMaxRangeCalendar();
    }

    public final int getMaxSelectRange() {
        return this.mDelegate.getMaxSelectRange();
    }

    public Calendar getMinRangeCalendar() {
        return this.mDelegate.getMinRangeCalendar();
    }

    public final int getMinSelectRange() {
        return this.mDelegate.getMinSelectRange();
    }

    public MonthViewPager getMonthViewPager() {
        return this.mMonthPager;
    }

    public final List<Calendar> getMultiSelectCalendars() {
        ArrayList arrayList = new ArrayList();
        if (this.mDelegate.mSelectedCalendars.size() == 0) {
            return arrayList;
        }
        arrayList.addAll(this.mDelegate.mSelectedCalendars.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    public final List<Calendar> getSelectCalendarRange() {
        return this.mDelegate.getSelectCalendarRange();
    }

    public Calendar getSelectedCalendar() {
        return this.mDelegate.mSelectedCalendar;
    }

    public WeekViewPager getWeekViewPager() {
        return this.mWeekPager;
    }

    protected final boolean isInRange(Calendar calendar) {
        com.haibin.calendarview.c cVar = this.mDelegate;
        return cVar != null && com.haibin.calendarview.b.isCalendarInRange(calendar, cVar);
    }

    public boolean isSingleSelectMode() {
        return this.mDelegate.getSelectMode() == 1;
    }

    public boolean isYearSelectLayoutVisible() {
        return this.mYearViewPager.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() == null || !(getParent() instanceof CalendarLayout)) {
            return;
        }
        CalendarLayout calendarLayout = (CalendarLayout) getParent();
        this.mParentLayout = calendarLayout;
        this.mMonthPager.mParentLayout = calendarLayout;
        this.mWeekPager.mParentLayout = calendarLayout;
        calendarLayout.mWeekBar = this.mWeekBar;
        calendarLayout.setup(this.mDelegate);
        this.mParentLayout.initStatus();
    }

    protected final boolean onCalendarIntercept(Calendar calendar) {
        this.mDelegate.getClass();
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        int size = View.MeasureSpec.getSize(i9);
        com.haibin.calendarview.c cVar = this.mDelegate;
        if (cVar == null || !cVar.isFullScreenCalendar()) {
            super.onMeasure(i8, i9);
        } else {
            setCalendarItemHeight((size - this.mDelegate.getWeekBarHeight()) / 6);
            super.onMeasure(i8, i9);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("super");
        this.mDelegate.mSelectedCalendar = (Calendar) bundle.getSerializable("selected_calendar");
        this.mDelegate.mIndexCalendar = (Calendar) bundle.getSerializable("index_calendar");
        com.haibin.calendarview.c cVar = this.mDelegate;
        l lVar = cVar.mCalendarSelectListener;
        if (lVar != null) {
            lVar.onCalendarSelect(cVar.mSelectedCalendar, false);
        }
        Calendar calendar = this.mDelegate.mIndexCalendar;
        if (calendar != null) {
            scrollToCalendar(calendar.getYear(), this.mDelegate.mIndexCalendar.getMonth(), this.mDelegate.mIndexCalendar.getDay());
        }
        update();
        super.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    @Nullable
    protected Parcelable onSaveInstanceState() {
        if (this.mDelegate == null) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putSerializable("selected_calendar", this.mDelegate.mSelectedCalendar);
        bundle.putSerializable("index_calendar", this.mDelegate.mIndexCalendar);
        return bundle;
    }

    public final void putMultiSelect(Calendar... calendarArr) {
        if (calendarArr == null || calendarArr.length == 0) {
            return;
        }
        for (Calendar calendar : calendarArr) {
            if (calendar != null && !this.mDelegate.mSelectedCalendars.containsKey(calendar.toString())) {
                this.mDelegate.mSelectedCalendars.put(calendar.toString(), calendar);
            }
        }
        update();
    }

    public final void removeMultiSelect(Calendar... calendarArr) {
        if (calendarArr == null || calendarArr.length == 0) {
            return;
        }
        for (Calendar calendar : calendarArr) {
            if (calendar != null && this.mDelegate.mSelectedCalendars.containsKey(calendar.toString())) {
                this.mDelegate.mSelectedCalendars.remove(calendar.toString());
            }
        }
        update();
    }

    public final void removeSchemeDate(Calendar calendar) {
        Map<String, Calendar> map;
        if (calendar == null || (map = this.mDelegate.mSchemeDatesMap) == null || map.size() == 0) {
            return;
        }
        this.mDelegate.mSchemeDatesMap.remove(calendar.toString());
        if (this.mDelegate.mSelectedCalendar.equals(calendar)) {
            this.mDelegate.clearSelectedScheme();
        }
        this.mYearViewPager.update();
        this.mMonthPager.updateScheme();
        this.mWeekPager.updateScheme();
    }

    public void scrollToCalendar(int i8, int i9, int i10) {
        scrollToCalendar(i8, i9, i10, false, true);
    }

    public void scrollToCurrent() {
        scrollToCurrent(false);
    }

    public void scrollToNext() {
        scrollToNext(false);
    }

    public void scrollToPre() {
        scrollToPre(false);
    }

    public void scrollToSelectCalendar() {
        if (this.mDelegate.mSelectedCalendar.isAvailable()) {
            scrollToCalendar(this.mDelegate.mSelectedCalendar.getYear(), this.mDelegate.mSelectedCalendar.getMonth(), this.mDelegate.mSelectedCalendar.getDay(), false, true);
        }
    }

    public void scrollToYear(int i8) {
        scrollToYear(i8, false);
    }

    public void setAllMode() {
        setShowMode(0);
    }

    public void setBackground(int i8, int i9, int i10) {
        this.mWeekBar.setBackgroundColor(i9);
        this.mYearViewPager.setBackgroundColor(i8);
        this.mWeekLine.setBackgroundColor(i10);
    }

    public final void setCalendarItemHeight(int i8) {
        if (this.mDelegate.getCalendarItemHeight() == i8) {
            return;
        }
        this.mDelegate.setCalendarItemHeight(i8);
        this.mMonthPager.updateItemHeight();
        this.mWeekPager.updateItemHeight();
        CalendarLayout calendarLayout = this.mParentLayout;
        if (calendarLayout == null) {
            return;
        }
        calendarLayout.updateCalendarItemHeight();
    }

    public void setCalendarPadding(int i8) {
        com.haibin.calendarview.c cVar = this.mDelegate;
        if (cVar == null) {
            return;
        }
        cVar.setCalendarPadding(i8);
        update();
    }

    public void setCalendarPaddingLeft(int i8) {
        com.haibin.calendarview.c cVar = this.mDelegate;
        if (cVar == null) {
            return;
        }
        cVar.setCalendarPaddingLeft(i8);
        update();
    }

    public void setCalendarPaddingRight(int i8) {
        com.haibin.calendarview.c cVar = this.mDelegate;
        if (cVar == null) {
            return;
        }
        cVar.setCalendarPaddingRight(i8);
        update();
    }

    public final void setDefaultMonthViewSelectDay() {
        this.mDelegate.setDefaultCalendarSelectDay(0);
    }

    public void setFixMode() {
        setShowMode(2);
    }

    public final void setLastMonthViewSelectDay() {
        this.mDelegate.setDefaultCalendarSelectDay(1);
    }

    public final void setLastMonthViewSelectDayIgnoreCurrent() {
        this.mDelegate.setDefaultCalendarSelectDay(2);
    }

    public final void setMaxMultiSelectSize(int i8) {
        this.mDelegate.setMaxMultiSelectSize(i8);
    }

    public final void setMonthView(Class<?> cls) {
        if (cls == null || this.mDelegate.getMonthViewClass().equals(cls)) {
            return;
        }
        this.mDelegate.setMonthViewClass(cls);
        this.mMonthPager.updateMonthViewClass();
    }

    public final void setMonthViewScrollable(boolean z7) {
        this.mDelegate.setMonthViewScrollable(z7);
    }

    public final void setOnCalendarInterceptListener(h hVar) {
        if (hVar == null) {
            this.mDelegate.getClass();
        }
        if (hVar == null || this.mDelegate.getSelectMode() == 0) {
            return;
        }
        this.mDelegate.getClass();
        if (hVar.a(this.mDelegate.mSelectedCalendar)) {
            this.mDelegate.mSelectedCalendar = new Calendar();
        }
    }

    public void setOnCalendarLongClickListener(i iVar) {
        this.mDelegate.getClass();
    }

    public final void setOnCalendarMultiSelectListener(j jVar) {
        this.mDelegate.getClass();
    }

    public final void setOnCalendarRangeSelectListener(k kVar) {
        this.mDelegate.getClass();
    }

    public void setOnCalendarSelectListener(l lVar) {
        com.haibin.calendarview.c cVar = this.mDelegate;
        cVar.mCalendarSelectListener = lVar;
        if (lVar != null && cVar.getSelectMode() == 0 && isInRange(this.mDelegate.mSelectedCalendar)) {
            this.mDelegate.updateSelectCalendarScheme();
        }
    }

    public final void setOnClickCalendarPaddingListener(m mVar) {
        if (mVar == null) {
            this.mDelegate.getClass();
        }
        if (mVar == null) {
            return;
        }
        this.mDelegate.getClass();
    }

    public void setOnMonthChangeListener(o oVar) {
        this.mDelegate.mMonthChangeListener = oVar;
    }

    public void setOnViewChangeListener(p pVar) {
        this.mDelegate.getClass();
    }

    public void setOnWeekChangeListener(q qVar) {
        this.mDelegate.getClass();
    }

    public void setOnYearChangeListener(r rVar) {
        this.mDelegate.getClass();
    }

    public void setOnYearViewChangeListener(s sVar) {
        this.mDelegate.getClass();
    }

    public void setOnlyCurrentMode() {
        setShowMode(1);
    }

    public void setRange(int i8, int i9, int i10, int i11, int i12, int i13) {
        if (com.haibin.calendarview.b.compareTo(i8, i9, i10, i11, i12, i13) > 0) {
            return;
        }
        this.mDelegate.setRange(i8, i9, i10, i11, i12, i13);
        this.mWeekPager.notifyDataSetChanged();
        this.mYearViewPager.notifyDataSetChanged();
        this.mMonthPager.notifyDataSetChanged();
        if (!isInRange(this.mDelegate.mSelectedCalendar)) {
            com.haibin.calendarview.c cVar = this.mDelegate;
            cVar.mSelectedCalendar = cVar.getMinRangeCalendar();
            this.mDelegate.updateSelectCalendarScheme();
            com.haibin.calendarview.c cVar2 = this.mDelegate;
            cVar2.mIndexCalendar = cVar2.mSelectedCalendar;
        }
        this.mWeekPager.updateRange();
        this.mMonthPager.updateRange();
        this.mYearViewPager.updateRange();
    }

    public void setSchemeColor(int i8, int i9, int i10) {
        com.haibin.calendarview.c cVar = this.mDelegate;
        if (cVar == null || this.mMonthPager == null || this.mWeekPager == null) {
            return;
        }
        cVar.setSchemeColor(i8, i9, i10);
        this.mMonthPager.updateStyle();
        this.mWeekPager.updateStyle();
    }

    public final void setSchemeDate(Map<String, Calendar> map) {
        com.haibin.calendarview.c cVar = this.mDelegate;
        cVar.mSchemeDatesMap = map;
        cVar.updateSelectCalendarScheme();
        this.mYearViewPager.update();
        this.mMonthPager.updateScheme();
        this.mWeekPager.updateScheme();
    }

    public final void setSelectCalendarRange(int i8, int i9, int i10, int i11, int i12, int i13) {
        if (this.mDelegate.getSelectMode() != 2) {
            return;
        }
        Calendar calendar = new Calendar();
        calendar.setYear(i8);
        calendar.setMonth(i9);
        calendar.setDay(i10);
        Calendar calendar2 = new Calendar();
        calendar2.setYear(i11);
        calendar2.setMonth(i12);
        calendar2.setDay(i13);
        setSelectCalendarRange(calendar, calendar2);
    }

    public final void setSelectDefaultMode() {
        if (this.mDelegate.getSelectMode() == 0) {
            return;
        }
        com.haibin.calendarview.c cVar = this.mDelegate;
        cVar.mSelectedCalendar = cVar.mIndexCalendar;
        cVar.setSelectMode(0);
        WeekBar weekBar = this.mWeekBar;
        com.haibin.calendarview.c cVar2 = this.mDelegate;
        weekBar.onDateSelected(cVar2.mSelectedCalendar, cVar2.getWeekStart(), false);
        this.mMonthPager.updateDefaultSelect();
        this.mWeekPager.updateDefaultSelect();
    }

    public final void setSelectEndCalendar(int i8, int i9, int i10) {
        if (this.mDelegate.getSelectMode() == 2 && this.mDelegate.mSelectedStartRangeCalendar != null) {
            Calendar calendar = new Calendar();
            calendar.setYear(i8);
            calendar.setMonth(i9);
            calendar.setDay(i10);
            setSelectEndCalendar(calendar);
        }
    }

    public void setSelectMultiMode() {
        if (this.mDelegate.getSelectMode() == 3) {
            return;
        }
        this.mDelegate.setSelectMode(3);
        clearMultiSelect();
    }

    public final void setSelectRange(int i8, int i9) {
        if (i8 > i9) {
            return;
        }
        this.mDelegate.setSelectRange(i8, i9);
    }

    public void setSelectRangeMode() {
        if (this.mDelegate.getSelectMode() == 2) {
            return;
        }
        this.mDelegate.setSelectMode(2);
        clearSelectRange();
    }

    public void setSelectSingleMode() {
        if (this.mDelegate.getSelectMode() == 1) {
            return;
        }
        this.mDelegate.setSelectMode(1);
        this.mWeekPager.updateSelected();
        this.mMonthPager.updateSelected();
    }

    public final void setSelectStartCalendar(int i8, int i9, int i10) {
        if (this.mDelegate.getSelectMode() != 2) {
            return;
        }
        Calendar calendar = new Calendar();
        calendar.setYear(i8);
        calendar.setMonth(i9);
        calendar.setDay(i10);
        setSelectStartCalendar(calendar);
    }

    public void setSelectedColor(int i8, int i9, int i10) {
        com.haibin.calendarview.c cVar = this.mDelegate;
        if (cVar == null || this.mMonthPager == null || this.mWeekPager == null) {
            return;
        }
        cVar.setSelectColor(i8, i9, i10);
        this.mMonthPager.updateStyle();
        this.mWeekPager.updateStyle();
    }

    public void setTextColor(int i8, int i9, int i10, int i11, int i12) {
        com.haibin.calendarview.c cVar = this.mDelegate;
        if (cVar == null || this.mMonthPager == null || this.mWeekPager == null) {
            return;
        }
        cVar.setTextColor(i8, i9, i10, i11, i12);
        this.mMonthPager.updateStyle();
        this.mWeekPager.updateStyle();
    }

    public void setThemeColor(int i8, int i9) {
        com.haibin.calendarview.c cVar = this.mDelegate;
        if (cVar == null || this.mMonthPager == null || this.mWeekPager == null) {
            return;
        }
        cVar.setThemeColor(i8, i9);
        this.mMonthPager.updateStyle();
        this.mWeekPager.updateStyle();
    }

    public void setWeeColor(int i8, int i9) {
        WeekBar weekBar = this.mWeekBar;
        if (weekBar == null) {
            return;
        }
        weekBar.setBackgroundColor(i8);
        this.mWeekBar.setTextColor(i9);
    }

    public final void setWeekBar(Class<?> cls) {
        if (cls == null || this.mDelegate.getWeekBarClass().equals(cls)) {
            return;
        }
        this.mDelegate.setWeekBarClass(cls);
        FrameLayout frameLayout = (FrameLayout) findViewById(R$id.frameContent);
        frameLayout.removeView(this.mWeekBar);
        try {
            this.mWeekBar = (WeekBar) cls.getConstructor(Context.class).newInstance(getContext());
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        frameLayout.addView(this.mWeekBar, 2);
        this.mWeekBar.setup(this.mDelegate);
        this.mWeekBar.onWeekStartChange(this.mDelegate.getWeekStart());
        MonthViewPager monthViewPager = this.mMonthPager;
        WeekBar weekBar = this.mWeekBar;
        monthViewPager.mWeekBar = weekBar;
        com.haibin.calendarview.c cVar = this.mDelegate;
        weekBar.onDateSelected(cVar.mSelectedCalendar, cVar.getWeekStart(), false);
    }

    public void setWeekStarWithMon() {
        setWeekStart(2);
    }

    public void setWeekStarWithSat() {
        setWeekStart(7);
    }

    public void setWeekStarWithSun() {
        setWeekStart(1);
    }

    public final void setWeekView(Class<?> cls) {
        if (cls == null || this.mDelegate.getWeekBarClass().equals(cls)) {
            return;
        }
        this.mDelegate.setWeekViewClass(cls);
        this.mWeekPager.updateWeekViewClass();
    }

    public final void setWeekViewScrollable(boolean z7) {
        this.mDelegate.setWeekViewScrollable(z7);
    }

    public final void setYearViewScrollable(boolean z7) {
        this.mDelegate.setYearViewScrollable(z7);
    }

    public void setYearViewTextColor(int i8, int i9, int i10) {
        com.haibin.calendarview.c cVar = this.mDelegate;
        if (cVar == null || this.mYearViewPager == null) {
            return;
        }
        cVar.setYearViewTextColor(i8, i9, i10);
        this.mYearViewPager.updateStyle();
    }

    public void showYearSelectLayout(int i8) {
        showSelectLayout(i8);
    }

    public final void update() {
        this.mWeekBar.onWeekStartChange(this.mDelegate.getWeekStart());
        this.mYearViewPager.update();
        this.mMonthPager.updateScheme();
        this.mWeekPager.updateScheme();
    }

    public final void updateCurrentDate() {
        if (this.mDelegate == null || this.mMonthPager == null || this.mWeekPager == null) {
            return;
        }
        if (getCurDay() == java.util.Calendar.getInstance().get(5)) {
            return;
        }
        this.mDelegate.updateCurrentDay();
        this.mMonthPager.updateCurrentDate();
        this.mWeekPager.updateCurrentDate();
    }

    public void updateWeekBar() {
        this.mWeekBar.onWeekStartChange(this.mDelegate.getWeekStart());
    }

    public CalendarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDelegate = new com.haibin.calendarview.c(context, attributeSet);
        init(context);
    }

    public void scrollToCalendar(int i8, int i9, int i10, boolean z7) {
        scrollToCalendar(i8, i9, i10, z7, true);
    }

    public void scrollToCurrent(boolean z7) {
        if (isInRange(this.mDelegate.getCurrentDay())) {
            this.mDelegate.createCurrentDate();
            this.mDelegate.getClass();
            com.haibin.calendarview.c cVar = this.mDelegate;
            cVar.mSelectedCalendar = cVar.createCurrentDate();
            com.haibin.calendarview.c cVar2 = this.mDelegate;
            cVar2.mIndexCalendar = cVar2.mSelectedCalendar;
            cVar2.updateSelectCalendarScheme();
            WeekBar weekBar = this.mWeekBar;
            com.haibin.calendarview.c cVar3 = this.mDelegate;
            weekBar.onDateSelected(cVar3.mSelectedCalendar, cVar3.getWeekStart(), false);
            if (this.mMonthPager.getVisibility() == 0) {
                this.mMonthPager.scrollToCurrent(z7);
                this.mWeekPager.updateSelected(this.mDelegate.mIndexCalendar, false);
            } else {
                this.mWeekPager.scrollToCurrent(z7);
            }
            this.mYearViewPager.scrollToYear(this.mDelegate.getCurrentDay().getYear(), z7);
        }
    }

    public void scrollToNext(boolean z7) {
        if (isYearSelectLayoutVisible()) {
            YearViewPager yearViewPager = this.mYearViewPager;
            yearViewPager.setCurrentItem(yearViewPager.getCurrentItem() + 1, z7);
        } else if (this.mWeekPager.getVisibility() == 0) {
            WeekViewPager weekViewPager = this.mWeekPager;
            weekViewPager.setCurrentItem(weekViewPager.getCurrentItem() + 1, z7);
        } else {
            MonthViewPager monthViewPager = this.mMonthPager;
            monthViewPager.setCurrentItem(monthViewPager.getCurrentItem() + 1, z7);
        }
    }

    public void scrollToPre(boolean z7) {
        if (isYearSelectLayoutVisible()) {
            this.mYearViewPager.setCurrentItem(r0.getCurrentItem() - 1, z7);
        } else if (this.mWeekPager.getVisibility() == 0) {
            this.mWeekPager.setCurrentItem(r0.getCurrentItem() - 1, z7);
        } else {
            this.mMonthPager.setCurrentItem(r0.getCurrentItem() - 1, z7);
        }
    }

    public void scrollToYear(int i8, boolean z7) {
        if (this.mYearViewPager.getVisibility() != 0) {
            return;
        }
        this.mYearViewPager.scrollToYear(i8, z7);
    }

    public void setOnCalendarLongClickListener(i iVar, boolean z7) {
        this.mDelegate.getClass();
        this.mDelegate.setPreventLongPressedSelected(z7);
    }

    public void scrollToCalendar(int i8, int i9, int i10, boolean z7, boolean z8) {
        Calendar calendar = new Calendar();
        calendar.setYear(i8);
        calendar.setMonth(i9);
        calendar.setDay(i10);
        if (calendar.isAvailable() && isInRange(calendar)) {
            this.mDelegate.getClass();
            if (this.mWeekPager.getVisibility() == 0) {
                this.mWeekPager.scrollToCalendar(i8, i9, i10, z7, z8);
            } else {
                this.mMonthPager.scrollToCalendar(i8, i9, i10, z7, z8);
            }
        }
    }

    public final void setSelectStartCalendar(Calendar calendar) {
        if (this.mDelegate.getSelectMode() == 2 && calendar != null) {
            if (!isInRange(calendar)) {
                this.mDelegate.getClass();
                return;
            }
            if (onCalendarIntercept(calendar)) {
                this.mDelegate.getClass();
                return;
            }
            com.haibin.calendarview.c cVar = this.mDelegate;
            cVar.mSelectedEndRangeCalendar = null;
            cVar.mSelectedStartRangeCalendar = calendar;
            scrollToCalendar(calendar.getYear(), calendar.getMonth(), calendar.getDay());
        }
    }

    public final void setSelectEndCalendar(Calendar calendar) {
        Calendar calendar2;
        if (this.mDelegate.getSelectMode() == 2 && (calendar2 = this.mDelegate.mSelectedStartRangeCalendar) != null) {
            setSelectCalendarRange(calendar2, calendar);
        }
    }

    public final void addSchemeDate(Map<String, Calendar> map) {
        if (this.mDelegate == null || map == null || map.size() == 0) {
            return;
        }
        com.haibin.calendarview.c cVar = this.mDelegate;
        if (cVar.mSchemeDatesMap == null) {
            cVar.mSchemeDatesMap = new HashMap();
        }
        this.mDelegate.addSchemes(map);
        this.mDelegate.updateSelectCalendarScheme();
        this.mYearViewPager.update();
        this.mMonthPager.updateScheme();
        this.mWeekPager.updateScheme();
    }

    public final void setSelectCalendarRange(Calendar calendar, Calendar calendar2) {
        if (this.mDelegate.getSelectMode() != 2 || calendar == null || calendar2 == null) {
            return;
        }
        if (onCalendarIntercept(calendar)) {
            this.mDelegate.getClass();
            return;
        }
        if (onCalendarIntercept(calendar2)) {
            this.mDelegate.getClass();
            return;
        }
        int differ = calendar2.differ(calendar);
        if (differ >= 0 && isInRange(calendar) && isInRange(calendar2)) {
            if (this.mDelegate.getMinSelectRange() != -1 && this.mDelegate.getMinSelectRange() > differ + 1) {
                this.mDelegate.getClass();
                return;
            }
            if (this.mDelegate.getMaxSelectRange() != -1 && this.mDelegate.getMaxSelectRange() < differ + 1) {
                this.mDelegate.getClass();
                return;
            }
            if (this.mDelegate.getMinSelectRange() == -1 && differ == 0) {
                com.haibin.calendarview.c cVar = this.mDelegate;
                cVar.mSelectedStartRangeCalendar = calendar;
                cVar.mSelectedEndRangeCalendar = null;
                cVar.getClass();
                scrollToCalendar(calendar.getYear(), calendar.getMonth(), calendar.getDay());
                return;
            }
            com.haibin.calendarview.c cVar2 = this.mDelegate;
            cVar2.mSelectedStartRangeCalendar = calendar;
            cVar2.mSelectedEndRangeCalendar = calendar2;
            cVar2.getClass();
            scrollToCalendar(calendar.getYear(), calendar.getMonth(), calendar.getDay());
        }
    }
}
