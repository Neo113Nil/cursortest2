package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.haibin.calendarview.CalendarView;

/* loaded from: classes4.dex */
public abstract class WeekView extends BaseWeekView {
    public WeekView(Context context) {
        super(context);
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
                CalendarView.l lVar = this.mDelegate.mCalendarSelectListener;
                if (lVar != null) {
                    lVar.onCalendarOutOfRange(index);
                    return;
                }
                return;
            }
            this.mCurrentItem = this.mItems.indexOf(index);
            CalendarView.n nVar = this.mDelegate.mInnerListener;
            if (nVar != null) {
                nVar.onWeekDateSelected(index, true);
            }
            if (this.mParentLayout != null) {
                this.mParentLayout.updateSelectWeek(b.getWeekFromDayInMonth(index, this.mDelegate.getWeekStart()));
            }
            CalendarView.l lVar2 = this.mDelegate.mCalendarSelectListener;
            if (lVar2 != null) {
                lVar2.onCalendarSelect(index, true);
            }
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
        int i8 = 0;
        while (i8 < this.mItems.size()) {
            int calendarPaddingLeft = (this.mItemWidth * i8) + this.mDelegate.getCalendarPaddingLeft();
            onLoopStart(calendarPaddingLeft);
            Calendar calendar = this.mItems.get(i8);
            boolean z7 = i8 == this.mCurrentItem;
            boolean hasScheme = calendar.hasScheme();
            if (hasScheme) {
                if ((z7 && onDrawSelected(canvas, calendar, calendarPaddingLeft, true)) || !z7) {
                    this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.mDelegate.getSchemeThemeColor());
                    onDrawScheme(canvas, calendar, calendarPaddingLeft);
                }
            } else if (z7) {
                onDrawSelected(canvas, calendar, calendarPaddingLeft, false);
            }
            onDrawText(canvas, calendar, calendarPaddingLeft, hasScheme, z7);
            i8++;
        }
    }

    protected abstract void onDrawScheme(Canvas canvas, Calendar calendar, int i8);

    protected abstract boolean onDrawSelected(Canvas canvas, Calendar calendar, int i8, boolean z7);

    protected abstract void onDrawText(Canvas canvas, Calendar calendar, int i8, boolean z7, boolean z8);

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.mDelegate.getClass();
        return false;
    }
}
