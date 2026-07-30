package com.haibin.calendarview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class CalendarLayout extends LinearLayout {
    private static final int ACTIVE_POINTER = 1;
    private static final int CALENDAR_SHOW_MODE_BOTH_MONTH_WEEK_VIEW = 0;
    private static final int CALENDAR_SHOW_MODE_ONLY_MONTH_VIEW = 2;
    private static final int CALENDAR_SHOW_MODE_ONLY_WEEK_VIEW = 1;
    private static final int GESTURE_MODE_DEFAULT = 0;
    private static final int GESTURE_MODE_DISABLED = 2;
    private static final int INVALID_POINTER = -1;
    private static final int STATUS_EXPAND = 0;
    private static final int STATUS_SHRINK = 1;
    private float downY;
    private boolean isAnimating;
    private boolean isWeekView;
    private int mActivePointerId;
    private int mCalendarShowMode;
    CalendarView mCalendarView;
    ViewGroup mContentView;
    private int mContentViewId;
    private int mContentViewTranslateY;
    private int mDefaultStatus;
    private com.haibin.calendarview.c mDelegate;
    private int mGestureMode;
    private int mItemHeight;
    private float mLastX;
    private float mLastY;
    private int mMaximumVelocity;
    MonthViewPager mMonthView;
    private VelocityTracker mVelocityTracker;
    private int mViewPagerTranslateY;
    WeekBar mWeekBar;
    WeekViewPager mWeekPager;
    YearViewPager mYearView;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CalendarLayout.this.expand(0);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CalendarLayout.this.shrink(0);
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = (((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f) / CalendarLayout.this.mContentViewTranslateY;
            CalendarLayout.this.mMonthView.setTranslationY(r0.mViewPagerTranslateY * floatValue);
            CalendarLayout.this.isAnimating = true;
        }
    }

    class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CalendarLayout.this.isAnimating = false;
            if (CalendarLayout.this.mGestureMode == 2) {
                CalendarLayout.this.requestLayout();
            }
            CalendarLayout.this.hideWeek(true);
            CalendarLayout.this.mDelegate.getClass();
            CalendarLayout.this.isWeekView = false;
        }
    }

    class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = (((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f) / CalendarLayout.this.mContentViewTranslateY;
            CalendarLayout.this.mMonthView.setTranslationY(r0.mViewPagerTranslateY * floatValue);
            CalendarLayout.this.isAnimating = true;
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CalendarLayout.this.isAnimating = false;
            CalendarLayout.this.showWeek();
            CalendarLayout.this.isWeekView = true;
        }
    }

    class h implements Runnable {

        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = (((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f) / CalendarLayout.this.mContentViewTranslateY;
                CalendarLayout.this.mMonthView.setTranslationY(r0.mViewPagerTranslateY * floatValue);
                CalendarLayout.this.isAnimating = true;
            }
        }

        class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                CalendarLayout.this.isAnimating = false;
                CalendarLayout.this.isWeekView = true;
                CalendarLayout.this.showWeek();
                if (CalendarLayout.this.mDelegate != null) {
                    CalendarLayout.this.mDelegate.getClass();
                }
            }
        }

        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup viewGroup = CalendarLayout.this.mContentView;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", viewGroup.getTranslationY(), -CalendarLayout.this.mContentViewTranslateY);
            ofFloat.setDuration(0L);
            ofFloat.addUpdateListener(new a());
            ofFloat.addListener(new b());
            ofFloat.start();
        }
    }

    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CalendarLayout.this.mContentView.setVisibility(4);
            CalendarLayout.this.mContentView.clearAnimation();
        }
    }

    public CalendarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mViewPagerTranslateY = 0;
        this.isAnimating = false;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CalendarLayout);
        this.mContentViewId = obtainStyledAttributes.getResourceId(R$styleable.CalendarLayout_calendar_content_view_id, 0);
        this.mDefaultStatus = obtainStyledAttributes.getInt(R$styleable.CalendarLayout_default_status, 0);
        this.mCalendarShowMode = obtainStyledAttributes.getInt(R$styleable.CalendarLayout_calendar_show_mode, 0);
        this.mGestureMode = obtainStyledAttributes.getInt(R$styleable.CalendarLayout_gesture_mode, 0);
        obtainStyledAttributes.recycle();
        this.mVelocityTracker = VelocityTracker.obtain();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        viewConfiguration.getScaledTouchSlop();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private int getCalendarViewHeight() {
        int weekBarHeight;
        int calendarItemHeight;
        if (this.mMonthView.getVisibility() == 0) {
            weekBarHeight = this.mDelegate.getWeekBarHeight();
            calendarItemHeight = this.mMonthView.getHeight();
        } else {
            weekBarHeight = this.mDelegate.getWeekBarHeight();
            calendarItemHeight = this.mDelegate.getCalendarItemHeight();
        }
        return weekBarHeight + calendarItemHeight;
    }

    private int getPointerIndex(MotionEvent motionEvent, int i8) {
        int findPointerIndex = motionEvent.findPointerIndex(i8);
        if (findPointerIndex == -1) {
            this.mActivePointerId = -1;
        }
        return findPointerIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideWeek(boolean z7) {
        if (z7) {
            onShowMonthView();
        }
        this.mWeekPager.setVisibility(8);
        this.mMonthView.setVisibility(0);
    }

    private void initCalendarPosition(Calendar calendar) {
        updateSelectPosition((com.haibin.calendarview.b.getMonthViewStartDiff(calendar, this.mDelegate.getWeekStart()) + calendar.getDay()) - 1);
    }

    private void onShowMonthView() {
        com.haibin.calendarview.c cVar;
        if (this.mMonthView.getVisibility() == 0 || (cVar = this.mDelegate) == null) {
            return;
        }
        cVar.getClass();
    }

    private void onShowWeekView() {
        com.haibin.calendarview.c cVar;
        if (this.mWeekPager.getVisibility() == 0 || (cVar = this.mDelegate) == null) {
            return;
        }
        cVar.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showWeek() {
        onShowWeekView();
        WeekViewPager weekViewPager = this.mWeekPager;
        if (weekViewPager != null && weekViewPager.getAdapter() != null) {
            this.mWeekPager.getAdapter().notifyDataSetChanged();
            this.mWeekPager.setVisibility(0);
        }
        this.mMonthView.setVisibility(4);
    }

    private void translationViewPager() {
        this.mMonthView.setTranslationY(this.mViewPagerTranslateY * ((this.mContentView.getTranslationY() * 1.0f) / this.mContentViewTranslateY));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CalendarView calendarView;
        ViewGroup viewGroup;
        if (this.isAnimating) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.mGestureMode == 2) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.mYearView == null || (calendarView = this.mCalendarView) == null || calendarView.getVisibility() == 8 || (viewGroup = this.mContentView) == null || viewGroup.getVisibility() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int i8 = this.mCalendarShowMode;
        if (i8 == 2 || i8 == 1) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.mYearView.getVisibility() == 0 || this.mDelegate.isShowYearSelectedLayout) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        float y7 = motionEvent.getY();
        if (action != 2 || y7 - this.mLastY <= 0.0f || this.mContentView.getTranslationY() != (-this.mContentViewTranslateY) || !isScrollTop()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        requestDisallowInterceptTouchEvent(false);
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean expand() {
        return expand(240);
    }

    public void hideCalendarView() {
        CalendarView calendarView = this.mCalendarView;
        if (calendarView == null) {
            return;
        }
        calendarView.setVisibility(8);
        if (!isExpand()) {
            expand(0);
        }
        requestLayout();
    }

    @SuppressLint({"NewApi"})
    final void hideContentView() {
        ViewGroup viewGroup = this.mContentView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.animate().translationY(getHeight() - this.mMonthView.getHeight()).setDuration(220L).setInterpolator(new LinearInterpolator()).setListener(new i());
    }

    final void initStatus() {
        if ((this.mDefaultStatus != 1 && this.mCalendarShowMode != 1) || this.mCalendarShowMode == 2) {
            this.mDelegate.getClass();
        } else if (this.mContentView != null) {
            post(new h());
        } else {
            this.mWeekPager.setVisibility(0);
            this.mMonthView.setVisibility(8);
        }
    }

    public final boolean isExpand() {
        return this.mMonthView.getVisibility() == 0;
    }

    protected boolean isScrollTop() {
        ViewGroup viewGroup = this.mContentView;
        if (viewGroup instanceof RecyclerView) {
            return ((RecyclerView) viewGroup).computeVerticalScrollOffset() == 0;
        }
        if (!(viewGroup instanceof AbsListView)) {
            return viewGroup.getScrollY() == 0;
        }
        AbsListView absListView = (AbsListView) viewGroup;
        if (absListView.getFirstVisiblePosition() == 0) {
            return absListView.getChildAt(0).getTop() == 0;
        }
        return false;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.mMonthView = (MonthViewPager) findViewById(R$id.vp_month);
        this.mWeekPager = (WeekViewPager) findViewById(R$id.vp_week);
        if (getChildCount() > 0) {
            this.mCalendarView = (CalendarView) getChildAt(0);
        }
        this.mContentView = (ViewGroup) findViewById(this.mContentViewId);
        this.mYearView = (YearViewPager) findViewById(R$id.selectLayout);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        CalendarView calendarView;
        ViewGroup viewGroup;
        if (this.isAnimating) {
            return true;
        }
        if (this.mGestureMode == 2) {
            return false;
        }
        if (this.mYearView == null || (calendarView = this.mCalendarView) == null || calendarView.getVisibility() == 8 || (viewGroup = this.mContentView) == null || viewGroup.getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i8 = this.mCalendarShowMode;
        if (i8 == 2 || i8 == 1) {
            return false;
        }
        if (this.mYearView.getVisibility() == 0 || this.mDelegate.isShowYearSelectedLayout) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        float y7 = motionEvent.getY();
        float x7 = motionEvent.getX();
        if (action == 0) {
            this.mActivePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.downY = y7;
            this.mLastY = y7;
            this.mLastX = x7;
        } else if (action == 2) {
            float f8 = y7 - this.mLastY;
            float f9 = x7 - this.mLastX;
            if (f8 < 0.0f && this.mContentView.getTranslationY() == (-this.mContentViewTranslateY)) {
                return false;
            }
            if (f8 > 0.0f && this.mContentView.getTranslationY() == (-this.mContentViewTranslateY) && y7 >= this.mDelegate.getCalendarItemHeight() + this.mDelegate.getWeekBarHeight() && !isScrollTop()) {
                return false;
            }
            if (f8 > 0.0f && this.mContentView.getTranslationY() == 0.0f && y7 >= com.haibin.calendarview.b.dipToPx(getContext(), 98.0f)) {
                return false;
            }
            if (Math.abs(f8) > Math.abs(f9) && ((f8 > 0.0f && this.mContentView.getTranslationY() <= 0.0f) || (f8 < 0.0f && this.mContentView.getTranslationY() >= (-this.mContentViewTranslateY)))) {
                this.mLastY = y7;
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        if (this.mContentView == null || this.mCalendarView == null) {
            super.onMeasure(i8, i9);
            return;
        }
        int year = this.mDelegate.mIndexCalendar.getYear();
        int month = this.mDelegate.mIndexCalendar.getMonth();
        int dipToPx = com.haibin.calendarview.b.dipToPx(getContext(), 1.0f) + this.mDelegate.getWeekBarHeight();
        int monthViewHeight = com.haibin.calendarview.b.getMonthViewHeight(year, month, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode()) + dipToPx;
        int size = View.MeasureSpec.getSize(i9);
        if (this.mDelegate.isFullScreenCalendar()) {
            super.onMeasure(i8, i9);
            this.mContentView.measure(i8, View.MeasureSpec.makeMeasureSpec((size - dipToPx) - this.mDelegate.getCalendarItemHeight(), 1073741824));
            ViewGroup viewGroup = this.mContentView;
            viewGroup.layout(viewGroup.getLeft(), this.mContentView.getTop(), this.mContentView.getRight(), this.mContentView.getBottom());
            return;
        }
        if (monthViewHeight >= size && this.mMonthView.getHeight() > 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(monthViewHeight + dipToPx + this.mDelegate.getWeekBarHeight(), 1073741824);
            size = monthViewHeight;
        } else if (monthViewHeight < size && this.mMonthView.getHeight() > 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        if (this.mCalendarShowMode == 2 || this.mCalendarView.getVisibility() == 8) {
            monthViewHeight = this.mCalendarView.getVisibility() == 8 ? 0 : this.mCalendarView.getHeight();
        } else if (this.mGestureMode != 2 || this.isAnimating) {
            size -= dipToPx;
            monthViewHeight = this.mItemHeight;
        } else if (!isExpand()) {
            size -= dipToPx;
            monthViewHeight = this.mItemHeight;
        }
        int i10 = size - monthViewHeight;
        super.onMeasure(i8, i9);
        this.mContentView.measure(i8, View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        ViewGroup viewGroup2 = this.mContentView;
        viewGroup2.layout(viewGroup2.getLeft(), this.mContentView.getTop(), this.mContentView.getRight(), this.mContentView.getBottom());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("super");
        if (bundle.getBoolean("isExpand")) {
            post(new b());
        } else {
            post(new c());
        }
        super.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    @Nullable
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putBoolean("isExpand", isExpand());
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r0 != 6) goto L84;
     */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i8;
        com.haibin.calendarview.c cVar;
        CalendarView calendarView;
        if (this.mGestureMode == 2 || (i8 = this.mCalendarShowMode) == 2 || i8 == 1 || (cVar = this.mDelegate) == null || cVar.isShowYearSelectedLayout || this.mContentView == null || (calendarView = this.mCalendarView) == null || calendarView.getVisibility() == 8) {
            return false;
        }
        int action = motionEvent.getAction();
        float y7 = motionEvent.getY();
        this.mVelocityTracker.addMovement(motionEvent);
        if (action == 0) {
            this.mActivePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.downY = y7;
            this.mLastY = y7;
            return true;
        }
        if (action == 1) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            float yVelocity = velocityTracker.getYVelocity();
            if (this.mContentView.getTranslationY() == 0.0f || this.mContentView.getTranslationY() == this.mContentViewTranslateY) {
                expand();
            } else {
                if (Math.abs(yVelocity) >= 800.0f) {
                    if (yVelocity < 0.0f) {
                        shrink();
                    } else {
                        expand();
                    }
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getY() - this.downY > 0.0f) {
                    expand();
                } else {
                    shrink();
                }
            }
        } else if (action != 2) {
            if (action != 3) {
                if (action == 5) {
                    int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.mActivePointerId = pointerId;
                    if (pointerId == 0) {
                        this.mLastY = motionEvent.getY(pointerId);
                    }
                }
            }
            int pointerIndex = getPointerIndex(motionEvent, this.mActivePointerId);
            if (this.mActivePointerId != -1) {
                this.mLastY = motionEvent.getY(pointerIndex);
            }
        } else {
            getPointerIndex(motionEvent, this.mActivePointerId);
            if (this.mActivePointerId == -1) {
                this.mLastY = y7;
                this.mActivePointerId = 1;
            }
            float f8 = y7 - this.mLastY;
            if (f8 < 0.0f && this.mContentView.getTranslationY() == (-this.mContentViewTranslateY)) {
                this.mLastY = y7;
                motionEvent.setAction(0);
                dispatchTouchEvent(motionEvent);
                this.mWeekPager.setVisibility(0);
                this.mMonthView.setVisibility(4);
                if (!this.isWeekView) {
                    this.mDelegate.getClass();
                }
                this.isWeekView = true;
                return true;
            }
            hideWeek(false);
            if (f8 > 0.0f && this.mContentView.getTranslationY() + f8 >= 0.0f) {
                this.mContentView.setTranslationY(0.0f);
                translationViewPager();
                this.mLastY = y7;
                return super.onTouchEvent(motionEvent);
            }
            if (f8 < 0.0f) {
                float translationY = this.mContentView.getTranslationY() + f8;
                int i9 = this.mContentViewTranslateY;
                if (translationY <= (-i9)) {
                    this.mContentView.setTranslationY(-i9);
                    translationViewPager();
                    this.mLastY = y7;
                    return super.onTouchEvent(motionEvent);
                }
            }
            ViewGroup viewGroup = this.mContentView;
            viewGroup.setTranslationY(viewGroup.getTranslationY() + f8);
            translationViewPager();
            this.mLastY = y7;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setModeBothMonthWeekView() {
        this.mCalendarShowMode = 0;
        requestLayout();
    }

    public void setModeOnlyMonthView() {
        this.mCalendarShowMode = 2;
        requestLayout();
    }

    public void setModeOnlyWeekView() {
        this.mCalendarShowMode = 1;
        requestLayout();
    }

    final void setup(com.haibin.calendarview.c cVar) {
        this.mDelegate = cVar;
        this.mItemHeight = cVar.getCalendarItemHeight();
        initCalendarPosition(cVar.mSelectedCalendar.isAvailable() ? cVar.mSelectedCalendar : cVar.createCurrentDate());
        updateContentViewTranslateY();
    }

    public void showCalendarView() {
        this.mCalendarView.setVisibility(0);
        requestLayout();
    }

    @SuppressLint({"NewApi"})
    final void showContentView() {
        ViewGroup viewGroup = this.mContentView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTranslationY(getHeight() - this.mMonthView.getHeight());
        this.mContentView.setVisibility(0);
        this.mContentView.animate().translationY(0.0f).setDuration(180L).setInterpolator(new LinearInterpolator()).setListener(new a());
    }

    public boolean shrink() {
        return shrink(240);
    }

    final void updateCalendarItemHeight() {
        this.mItemHeight = this.mDelegate.getCalendarItemHeight();
        if (this.mContentView == null) {
            return;
        }
        com.haibin.calendarview.c cVar = this.mDelegate;
        Calendar calendar = cVar.mIndexCalendar;
        updateSelectWeek(com.haibin.calendarview.b.getWeekFromDayInMonth(calendar, cVar.getWeekStart()));
        if (this.mDelegate.getMonthViewShowMode() == 0) {
            this.mContentViewTranslateY = this.mItemHeight * 5;
        } else {
            this.mContentViewTranslateY = com.haibin.calendarview.b.getMonthViewHeight(calendar.getYear(), calendar.getMonth(), this.mItemHeight, this.mDelegate.getWeekStart()) - this.mItemHeight;
        }
        translationViewPager();
        if (this.mWeekPager.getVisibility() == 0) {
            this.mContentView.setTranslationY(-this.mContentViewTranslateY);
        }
    }

    void updateContentViewTranslateY() {
        ViewGroup viewGroup;
        com.haibin.calendarview.c cVar = this.mDelegate;
        Calendar calendar = cVar.mIndexCalendar;
        if (cVar.getMonthViewShowMode() == 0) {
            this.mContentViewTranslateY = this.mItemHeight * 5;
        } else {
            this.mContentViewTranslateY = com.haibin.calendarview.b.getMonthViewHeight(calendar.getYear(), calendar.getMonth(), this.mItemHeight, this.mDelegate.getWeekStart()) - this.mItemHeight;
        }
        if (this.mWeekPager.getVisibility() != 0 || (viewGroup = this.mContentView) == null) {
            return;
        }
        viewGroup.setTranslationY(-this.mContentViewTranslateY);
    }

    final void updateSelectPosition(int i8) {
        this.mViewPagerTranslateY = (((i8 + 7) / 7) - 1) * this.mItemHeight;
    }

    final void updateSelectWeek(int i8) {
        this.mViewPagerTranslateY = (i8 - 1) * this.mItemHeight;
    }

    public boolean expand(int i8) {
        if (this.isAnimating || this.mCalendarShowMode == 1 || this.mContentView == null) {
            return false;
        }
        if (this.mMonthView.getVisibility() != 0) {
            this.mWeekPager.setVisibility(8);
            onShowMonthView();
            this.isWeekView = false;
            this.mMonthView.setVisibility(0);
        }
        ViewGroup viewGroup = this.mContentView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", viewGroup.getTranslationY(), 0.0f);
        ofFloat.setDuration(i8);
        ofFloat.addUpdateListener(new d());
        ofFloat.addListener(new e());
        ofFloat.start();
        return true;
    }

    public boolean shrink(int i8) {
        ViewGroup viewGroup;
        if (this.mGestureMode == 2) {
            requestLayout();
        }
        if (this.isAnimating || (viewGroup = this.mContentView) == null) {
            return false;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", viewGroup.getTranslationY(), -this.mContentViewTranslateY);
        ofFloat.setDuration(i8);
        ofFloat.addUpdateListener(new f());
        ofFloat.addListener(new g());
        ofFloat.start();
        return true;
    }
}
