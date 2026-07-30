package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.haibin.calendarview.CalendarView;

/* loaded from: classes4.dex */
public abstract class RangeWeekView extends BaseWeekView {
    public RangeWeekView(Context context) {
        super(context);
    }

    protected boolean isCalendarSelected(Calendar calendar) {
        if (this.mDelegate.mSelectedStartRangeCalendar == null || onCalendarIntercept(calendar)) {
            return false;
        }
        c cVar = this.mDelegate;
        return cVar.mSelectedEndRangeCalendar == null ? calendar.compareTo(cVar.mSelectedStartRangeCalendar) == 0 : calendar.compareTo(cVar.mSelectedStartRangeCalendar) >= 0 && calendar.compareTo(this.mDelegate.mSelectedEndRangeCalendar) <= 0;
    }

    protected final boolean isSelectNextCalendar(Calendar calendar, int i8) {
        Calendar calendar2;
        if (i8 == this.mItems.size() - 1) {
            calendar2 = b.getNextCalendar(calendar);
            this.mDelegate.updateCalendarScheme(calendar2);
        } else {
            calendar2 = this.mItems.get(i8 + 1);
        }
        return this.mDelegate.mSelectedStartRangeCalendar != null && isCalendarSelected(calendar2);
    }

    protected final boolean isSelectPreCalendar(Calendar calendar, int i8) {
        Calendar calendar2;
        if (i8 == 0) {
            calendar2 = b.getPreCalendar(calendar);
            this.mDelegate.updateCalendarScheme(calendar2);
        } else {
            calendar2 = this.mItems.get(i8 - 1);
        }
        return this.mDelegate.mSelectedStartRangeCalendar != null && isCalendarSelected(calendar2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Calendar index;
        if (this.isClick && (index = getIndex()) != null) {
            if (onCalendarIntercept(index)) {
                this.mDelegate.getClass();
                throw null;
            }
            if (!isInRange(index)) {
                this.mDelegate.getClass();
                return;
            }
            c cVar = this.mDelegate;
            Calendar calendar = cVar.mSelectedStartRangeCalendar;
            if (calendar != null && cVar.mSelectedEndRangeCalendar == null) {
                int differ = b.differ(index, calendar);
                if (differ >= 0 && this.mDelegate.getMinSelectRange() != -1 && this.mDelegate.getMinSelectRange() > differ + 1) {
                    this.mDelegate.getClass();
                    return;
                } else if (this.mDelegate.getMaxSelectRange() != -1 && this.mDelegate.getMaxSelectRange() < b.differ(index, this.mDelegate.mSelectedStartRangeCalendar) + 1) {
                    this.mDelegate.getClass();
                    return;
                }
            }
            c cVar2 = this.mDelegate;
            Calendar calendar2 = cVar2.mSelectedStartRangeCalendar;
            if (calendar2 == null || cVar2.mSelectedEndRangeCalendar != null) {
                cVar2.mSelectedStartRangeCalendar = index;
                cVar2.mSelectedEndRangeCalendar = null;
            } else {
                int compareTo = index.compareTo(calendar2);
                if (this.mDelegate.getMinSelectRange() == -1 && compareTo <= 0) {
                    c cVar3 = this.mDelegate;
                    cVar3.mSelectedStartRangeCalendar = index;
                    cVar3.mSelectedEndRangeCalendar = null;
                } else if (compareTo < 0) {
                    c cVar4 = this.mDelegate;
                    cVar4.mSelectedStartRangeCalendar = index;
                    cVar4.mSelectedEndRangeCalendar = null;
                } else if (compareTo == 0 && this.mDelegate.getMinSelectRange() == 1) {
                    this.mDelegate.mSelectedEndRangeCalendar = index;
                } else {
                    this.mDelegate.mSelectedEndRangeCalendar = index;
                }
            }
            this.mCurrentItem = this.mItems.indexOf(index);
            CalendarView.n nVar = this.mDelegate.mInnerListener;
            if (nVar != null) {
                nVar.onWeekDateSelected(index, true);
            }
            if (this.mParentLayout != null) {
                this.mParentLayout.updateSelectWeek(b.getWeekFromDayInMonth(index, this.mDelegate.getWeekStart()));
            }
            this.mDelegate.getClass();
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mItems.size() == 0) {
            return;
        }
        this.mItemWidth = ((getWidth() - this.mDelegate.getCalendarPaddingLeft()) - this.mDelegate.getCalendarPaddingRight()) / 7;
        onPreviewHook();
        for (int i8 = 0; i8 < 7; i8++) {
            int calendarPaddingLeft = (this.mItemWidth * i8) + this.mDelegate.getCalendarPaddingLeft();
            onLoopStart(calendarPaddingLeft);
            Calendar calendar = this.mItems.get(i8);
            boolean isCalendarSelected = isCalendarSelected(calendar);
            boolean isSelectPreCalendar = isSelectPreCalendar(calendar, i8);
            boolean isSelectNextCalendar = isSelectNextCalendar(calendar, i8);
            boolean hasScheme = calendar.hasScheme();
            if (hasScheme) {
                if ((isCalendarSelected && onDrawSelected(canvas, calendar, calendarPaddingLeft, true, isSelectPreCalendar, isSelectNextCalendar)) || !isCalendarSelected) {
                    this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.mDelegate.getSchemeThemeColor());
                    onDrawScheme(canvas, calendar, calendarPaddingLeft, isCalendarSelected);
                }
            } else if (isCalendarSelected) {
                onDrawSelected(canvas, calendar, calendarPaddingLeft, false, isSelectPreCalendar, isSelectNextCalendar);
            }
            onDrawText(canvas, calendar, calendarPaddingLeft, hasScheme, isCalendarSelected);
        }
    }

    protected abstract void onDrawScheme(Canvas canvas, Calendar calendar, int i8, boolean z7);

    protected abstract boolean onDrawSelected(Canvas canvas, Calendar calendar, int i8, boolean z7, boolean z8, boolean z9);

    protected abstract void onDrawText(Canvas canvas, Calendar calendar, int i8, boolean z7, boolean z8);

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return false;
    }
}
