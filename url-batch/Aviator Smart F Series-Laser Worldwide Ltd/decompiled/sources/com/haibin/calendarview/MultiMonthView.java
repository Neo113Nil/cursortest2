package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.haibin.calendarview.CalendarView;

/* loaded from: classes4.dex */
public abstract class MultiMonthView extends BaseMonthView {
    public MultiMonthView(Context context) {
        super(context);
    }

    private void draw(Canvas canvas, Calendar calendar, int i8, int i9, int i10) {
        int calendarPaddingLeft = (i10 * this.mItemWidth) + this.mDelegate.getCalendarPaddingLeft();
        int i11 = i9 * this.mItemHeight;
        onLoopStart(calendarPaddingLeft, i11);
        boolean isCalendarSelected = isCalendarSelected(calendar);
        boolean hasScheme = calendar.hasScheme();
        boolean isSelectPreCalendar = isSelectPreCalendar(calendar, i8);
        boolean isSelectNextCalendar = isSelectNextCalendar(calendar, i8);
        if (hasScheme) {
            if ((isCalendarSelected && onDrawSelected(canvas, calendar, calendarPaddingLeft, i11, true, isSelectPreCalendar, isSelectNextCalendar)) || !isCalendarSelected) {
                this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.mDelegate.getSchemeThemeColor());
                onDrawScheme(canvas, calendar, calendarPaddingLeft, i11, true);
            }
        } else if (isCalendarSelected) {
            onDrawSelected(canvas, calendar, calendarPaddingLeft, i11, false, isSelectPreCalendar, isSelectNextCalendar);
        }
        onDrawText(canvas, calendar, calendarPaddingLeft, i11, hasScheme, isCalendarSelected);
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
        MonthViewPager monthViewPager;
        if (this.isClick && (index = getIndex()) != null) {
            if (this.mDelegate.getMonthViewShowMode() != 1 || index.isCurrentMonth()) {
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
                if (!index.isCurrentMonth() && (monthViewPager = this.mMonthViewPager) != null) {
                    int currentItem = monthViewPager.getCurrentItem();
                    this.mMonthViewPager.setCurrentItem(this.mCurrentItem < 7 ? currentItem - 1 : currentItem + 1);
                }
                CalendarView.n nVar = this.mDelegate.mInnerListener;
                if (nVar != null) {
                    nVar.onMonthDateSelected(index, true);
                }
                if (this.mParentLayout != null) {
                    if (index.isCurrentMonth()) {
                        this.mParentLayout.updateSelectPosition(this.mItems.indexOf(index));
                    } else {
                        this.mParentLayout.updateSelectWeek(b.getWeekFromDayInMonth(index, this.mDelegate.getWeekStart()));
                    }
                }
                this.mDelegate.getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r5.isCurrentMonth() == false) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(Canvas canvas) {
        if (this.mLineCount == 0) {
            return;
        }
        this.mItemWidth = ((getWidth() - this.mDelegate.getCalendarPaddingLeft()) - this.mDelegate.getCalendarPaddingRight()) / 7;
        onPreviewHook();
        int i8 = this.mLineCount * 7;
        int i9 = 0;
        int i10 = 0;
        while (i10 < this.mLineCount) {
            int i11 = i9;
            for (int i12 = 0; i12 < 7; i12++) {
                Calendar calendar = this.mItems.get(i11);
                if (this.mDelegate.getMonthViewShowMode() == 1) {
                    if (i11 > this.mItems.size() - this.mNextDiff) {
                        return;
                    }
                } else if (this.mDelegate.getMonthViewShowMode() == 2 && i11 >= i8) {
                    return;
                }
                draw(canvas, calendar, i11, i10, i12);
                i11++;
            }
            i10++;
            i9 = i11;
        }
    }

    protected abstract void onDrawScheme(Canvas canvas, Calendar calendar, int i8, int i9, boolean z7);

    protected abstract boolean onDrawSelected(Canvas canvas, Calendar calendar, int i8, int i9, boolean z7, boolean z8, boolean z9);

    protected abstract void onDrawText(Canvas canvas, Calendar calendar, int i8, int i9, boolean z7, boolean z8);

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return false;
    }
}
