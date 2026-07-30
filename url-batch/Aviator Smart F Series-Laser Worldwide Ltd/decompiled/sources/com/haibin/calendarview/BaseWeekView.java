package com.haibin.calendarview;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class BaseWeekView extends BaseView {
    public BaseWeekView(Context context) {
        super(context);
    }

    private void onClickCalendarPadding() {
        this.mDelegate.getClass();
    }

    protected Object getClickCalendarPaddingObject(float f8, float f9, Calendar calendar) {
        return null;
    }

    final int getEdgeIndex(boolean z7) {
        for (int i8 = 0; i8 < this.mItems.size(); i8++) {
            boolean isInRange = isInRange(this.mItems.get(i8));
            if (z7 && isInRange) {
                return i8;
            }
            if (!z7 && !isInRange) {
                return i8 - 1;
            }
        }
        return z7 ? 6 : 0;
    }

    protected Calendar getIndex() {
        if (this.mX <= this.mDelegate.getCalendarPaddingLeft() || this.mX >= getWidth() - this.mDelegate.getCalendarPaddingRight()) {
            onClickCalendarPadding();
            return null;
        }
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

    final boolean isMinRangeEdge(Calendar calendar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(this.mDelegate.getMinYear(), this.mDelegate.getMinYearMonth() - 1, this.mDelegate.getMinYearDay());
        long timeInMillis = calendar2.getTimeInMillis();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        return calendar2.getTimeInMillis() < timeInMillis;
    }

    @Override // com.haibin.calendarview.BaseView
    protected void onDestroy() {
    }

    protected void onLoopStart(int i8) {
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, View.MeasureSpec.makeMeasureSpec(this.mItemHeight, 1073741824));
    }

    @Override // com.haibin.calendarview.BaseView
    protected void onPreviewHook() {
    }

    final void performClickCalendar(Calendar calendar, boolean z7) {
        List<Calendar> list;
        if (this.mParentLayout == null || this.mDelegate.mInnerListener == null || (list = this.mItems) == null || list.size() == 0) {
            return;
        }
        int weekViewIndexFromCalendar = b.getWeekViewIndexFromCalendar(calendar, this.mDelegate.getWeekStart());
        if (this.mItems.contains(this.mDelegate.getCurrentDay())) {
            weekViewIndexFromCalendar = b.getWeekViewIndexFromCalendar(this.mDelegate.getCurrentDay(), this.mDelegate.getWeekStart());
        }
        Calendar calendar2 = this.mItems.get(weekViewIndexFromCalendar);
        if (this.mDelegate.getSelectMode() != 0) {
            if (this.mItems.contains(this.mDelegate.mSelectedCalendar)) {
                calendar2 = this.mDelegate.mSelectedCalendar;
            } else {
                this.mCurrentItem = -1;
            }
        }
        if (!isInRange(calendar2)) {
            weekViewIndexFromCalendar = getEdgeIndex(isMinRangeEdge(calendar2));
            calendar2 = this.mItems.get(weekViewIndexFromCalendar);
        }
        calendar2.setCurrentDay(calendar2.equals(this.mDelegate.getCurrentDay()));
        this.mDelegate.mInnerListener.onWeekDateSelected(calendar2, false);
        this.mParentLayout.updateSelectWeek(b.getWeekFromDayInMonth(calendar2, this.mDelegate.getWeekStart()));
        c cVar = this.mDelegate;
        if (cVar.mCalendarSelectListener != null && z7 && cVar.getSelectMode() == 0) {
            this.mDelegate.mCalendarSelectListener.onCalendarSelect(calendar2, false);
        }
        this.mParentLayout.updateContentViewTranslateY();
        if (this.mDelegate.getSelectMode() == 0) {
            this.mCurrentItem = weekViewIndexFromCalendar;
        }
        c cVar2 = this.mDelegate;
        if (!cVar2.isShowYearSelectedLayout && cVar2.mIndexCalendar != null && calendar.getYear() != this.mDelegate.mIndexCalendar.getYear()) {
            this.mDelegate.getClass();
        }
        this.mDelegate.mIndexCalendar = calendar2;
        invalidate();
    }

    final void setSelectedCalendar(Calendar calendar) {
        if (this.mDelegate.getSelectMode() != 1 || calendar.equals(this.mDelegate.mSelectedCalendar)) {
            this.mCurrentItem = this.mItems.indexOf(calendar);
        }
    }

    final void setup(Calendar calendar) {
        c cVar = this.mDelegate;
        this.mItems = b.initCalendarForWeekView(calendar, cVar, cVar.getWeekStart());
        addSchemesFromMap();
        invalidate();
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

    final void updateShowMode() {
        invalidate();
    }

    final void updateSingleSelect() {
        if (this.mItems.contains(this.mDelegate.mSelectedCalendar)) {
            return;
        }
        this.mCurrentItem = -1;
        invalidate();
    }

    final void updateWeekStart() {
        Calendar firstCalendarStartWithMinCalendar = b.getFirstCalendarStartWithMinCalendar(this.mDelegate.getMinYear(), this.mDelegate.getMinYearMonth(), this.mDelegate.getMinYearDay(), ((Integer) getTag()).intValue() + 1, this.mDelegate.getWeekStart());
        setSelectedCalendar(this.mDelegate.mSelectedCalendar);
        setup(firstCalendarStartWithMinCalendar);
    }
}
