package com.haibin.calendarview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class BaseMonthView extends BaseView {
    protected int mHeight;
    protected int mLineCount;
    protected int mMonth;
    MonthViewPager mMonthViewPager;
    protected int mNextDiff;
    protected int mYear;

    public BaseMonthView(Context context) {
        super(context);
    }

    @SuppressLint({"WrongConstant"})
    private void initCalendar() {
        this.mNextDiff = b.getMonthEndDiff(this.mYear, this.mMonth, this.mDelegate.getWeekStart());
        int monthViewStartDiff = b.getMonthViewStartDiff(this.mYear, this.mMonth, this.mDelegate.getWeekStart());
        int monthDaysCount = b.getMonthDaysCount(this.mYear, this.mMonth);
        List<Calendar> initCalendarForMonthView = b.initCalendarForMonthView(this.mYear, this.mMonth, this.mDelegate.getCurrentDay(), this.mDelegate.getWeekStart());
        this.mItems = initCalendarForMonthView;
        if (initCalendarForMonthView.contains(this.mDelegate.getCurrentDay())) {
            this.mCurrentItem = this.mItems.indexOf(this.mDelegate.getCurrentDay());
        } else {
            this.mCurrentItem = this.mItems.indexOf(this.mDelegate.mSelectedCalendar);
        }
        if (this.mCurrentItem > 0) {
            this.mDelegate.getClass();
        }
        if (this.mDelegate.getMonthViewShowMode() == 0) {
            this.mLineCount = 6;
        } else {
            this.mLineCount = ((monthViewStartDiff + monthDaysCount) + this.mNextDiff) / 7;
        }
        addSchemesFromMap();
        invalidate();
    }

    private void onClickCalendarPadding() {
        this.mDelegate.getClass();
    }

    protected Object getClickCalendarPaddingObject(float f8, float f9, Calendar calendar) {
        return null;
    }

    protected Calendar getIndex() {
        if (this.mItemWidth != 0 && this.mItemHeight != 0) {
            if (this.mX > this.mDelegate.getCalendarPaddingLeft() && this.mX < getWidth() - this.mDelegate.getCalendarPaddingRight()) {
                int calendarPaddingLeft = ((int) (this.mX - this.mDelegate.getCalendarPaddingLeft())) / this.mItemWidth;
                if (calendarPaddingLeft >= 7) {
                    calendarPaddingLeft = 6;
                }
                int i8 = ((((int) this.mY) / this.mItemHeight) * 7) + calendarPaddingLeft;
                if (i8 < 0 || i8 >= this.mItems.size()) {
                    return null;
                }
                return this.mItems.get(i8);
            }
            onClickCalendarPadding();
        }
        return null;
    }

    protected final int getSelectedIndex(Calendar calendar) {
        return this.mItems.indexOf(calendar);
    }

    final void initMonthWithDate(int i8, int i9) {
        this.mYear = i8;
        this.mMonth = i9;
        initCalendar();
        this.mHeight = b.getMonthViewHeight(i8, i9, this.mItemHeight, this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
    }

    @Override // com.haibin.calendarview.BaseView
    protected void onDestroy() {
    }

    protected void onLoopStart(int i8, int i9) {
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        if (this.mLineCount != 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(this.mHeight, 1073741824);
        }
        super.onMeasure(i8, i9);
    }

    @Override // com.haibin.calendarview.BaseView
    protected void onPreviewHook() {
    }

    final void setSelectedCalendar(Calendar calendar) {
        this.mCurrentItem = this.mItems.indexOf(calendar);
    }

    @Override // com.haibin.calendarview.BaseView
    void updateCurrentDate() {
        List<Calendar> list = this.mItems;
        if (list == null) {
            return;
        }
        if (list.contains(this.mDelegate.getCurrentDay())) {
            Iterator<Calendar> it = this.mItems.iterator();
            while (it.hasNext()) {
                it.next().setCurrentDay(false);
            }
            this.mItems.get(this.mItems.indexOf(this.mDelegate.getCurrentDay())).setCurrentDay(true);
        }
        invalidate();
    }

    @Override // com.haibin.calendarview.BaseView
    void updateItemHeight() {
        super.updateItemHeight();
        this.mHeight = b.getMonthViewHeight(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
    }

    final void updateShowMode() {
        this.mLineCount = b.getMonthViewLineCount(this.mYear, this.mMonth, this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        this.mHeight = b.getMonthViewHeight(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        invalidate();
    }

    final void updateWeekStart() {
        initCalendar();
        this.mHeight = b.getMonthViewHeight(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
    }
}
