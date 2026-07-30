package com.haibin.calendarview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.haibin.calendarview.YearRecyclerView;

/* loaded from: classes4.dex */
public final class YearViewPager extends ViewPager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean isUpdateYearView;
    private c mDelegate;
    private YearRecyclerView.b mListener;
    private int mYearCount;

    class a extends PagerAdapter {
        a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NonNull ViewGroup viewGroup, int i8, @NonNull Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return YearViewPager.this.mYearCount;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NonNull Object obj) {
            if (YearViewPager.this.isUpdateYearView) {
                return -2;
            }
            return super.getItemPosition(obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i8) {
            YearRecyclerView yearRecyclerView = new YearRecyclerView(YearViewPager.this.getContext());
            viewGroup.addView(yearRecyclerView);
            yearRecyclerView.setup(YearViewPager.this.mDelegate);
            yearRecyclerView.setOnMonthSelectedListener(YearViewPager.this.mListener);
            yearRecyclerView.init(i8 + YearViewPager.this.mDelegate.getMinYear());
            return yearRecyclerView;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }
    }

    public YearViewPager(Context context) {
        this(context, null);
    }

    private static int getHeight(Context context, View view) {
        int height = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        view.getLocationOnScreen(iArr);
        return height - iArr[1];
    }

    void notifyDataSetChanged() {
        this.mYearCount = (this.mDelegate.getMaxYear() - this.mDelegate.getMinYear()) + 1;
        if (getAdapter() != null) {
            getAdapter().notifyDataSetChanged();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mDelegate.isYearViewScrollable() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mDelegate.isYearViewScrollable() && super.onTouchEvent(motionEvent);
    }

    void scrollToYear(int i8, boolean z7) {
        setCurrentItem(i8 - this.mDelegate.getMinYear(), z7);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i8) {
        setCurrentItem(i8, false);
    }

    final void setOnMonthSelectedListener(YearRecyclerView.b bVar) {
        this.mListener = bVar;
    }

    void setup(c cVar) {
        this.mDelegate = cVar;
        this.mYearCount = (cVar.getMaxYear() - this.mDelegate.getMinYear()) + 1;
        setAdapter(new a());
        setCurrentItem(this.mDelegate.getCurrentDay().getYear() - this.mDelegate.getMinYear());
    }

    final void update() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            ((YearRecyclerView) getChildAt(i8)).notifyAdapterDataSetChanged();
        }
    }

    final void updateRange() {
        this.isUpdateYearView = true;
        notifyDataSetChanged();
        this.isUpdateYearView = false;
    }

    final void updateStyle() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            ((YearRecyclerView) getChildAt(i8)).updateStyle();
        }
    }

    final void updateWeekStart() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            YearRecyclerView yearRecyclerView = (YearRecyclerView) getChildAt(i8);
            yearRecyclerView.updateWeekStart();
            yearRecyclerView.notifyAdapterDataSetChanged();
        }
    }

    public YearViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i8, boolean z7) {
        if (Math.abs(getCurrentItem() - i8) > 1) {
            super.setCurrentItem(i8, false);
        } else {
            super.setCurrentItem(i8, false);
        }
    }
}
