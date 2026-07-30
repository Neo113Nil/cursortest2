package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.haibin.calendarview.CalendarView;

/* loaded from: classes4.dex */
public abstract class MultiWeekView extends BaseWeekView {
    public MultiWeekView(Context context) {
        super(context);
    }

    protected boolean isCalendarSelected(Calendar calendar) {
        return !onCalendarIntercept(calendar) && this.mDelegate.mSelectedCalendars.containsKey(calendar.toString());
    }

    protected final boolean isSelectNextCalendar(Calendar calendar, int i8) {
        Calendar calendar2;
        if (i8 == this.mItems.size() - 1) {
            calendar2 = b.getNextCalendar(calendar);
            this.mDelegate.updateCalendarScheme(calendar2);
        } else {
            calendar2 = this.mItems.get(i8 + 1);
        }
        return isCalendarSelected(calendar2);
    }

    protected final boolean isSelectPreCalendar(Calendar calendar, int i8) {
        Calendar calendar2;
        if (i8 == 0) {
            calendar2 = b.getPreCalendar(calendar);
            this.mDelegate.updateCalendarScheme(calendar2);
        } else {
            calendar2 = this.mItems.get(i8 - 1);
        }
        return isCalendarSelected(calendar2);
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
            String calendar = index.toString();
            if (this.mDelegate.mSelectedCalendars.containsKey(calendar)) {
                this.mDelegate.mSelectedCalendars.remove(calendar);
            } else {
                if (this.mDelegate.mSelectedCalendars.size() >= this.mDelegate.getMaxMultiSelectSize()) {
                    this.mDelegate.getClass();
                    return;
                }
                this.mDelegate.mSelectedCalendars.put(calendar, index);
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
