package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.haibin.calendarview.CalendarView;

/* loaded from: classes4.dex */
public abstract class MonthView extends BaseMonthView {
    public MonthView(Context context) {
        super(context);
    }

    private void draw(Canvas canvas, Calendar calendar, int i8, int i9, int i10) {
        int calendarPaddingLeft = (i9 * this.mItemWidth) + this.mDelegate.getCalendarPaddingLeft();
        int i11 = i8 * this.mItemHeight;
        onLoopStart(calendarPaddingLeft, i11);
        boolean z7 = i10 == this.mCurrentItem;
        boolean hasScheme = calendar.hasScheme();
        if (hasScheme) {
            if ((z7 && onDrawSelected(canvas, calendar, calendarPaddingLeft, i11, true)) || !z7) {
                this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.mDelegate.getSchemeThemeColor());
                onDrawScheme(canvas, calendar, calendarPaddingLeft, i11);
            }
        } else if (z7) {
            onDrawSelected(canvas, calendar, calendarPaddingLeft, i11, false);
        }
        onDrawText(canvas, calendar, calendarPaddingLeft, i11, hasScheme, z7);
    }

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
                    CalendarView.l lVar = this.mDelegate.mCalendarSelectListener;
                    if (lVar != null) {
                        lVar.onCalendarOutOfRange(index);
                        return;
                    }
                    return;
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
                CalendarView.l lVar2 = this.mDelegate.mCalendarSelectListener;
                if (lVar2 != null) {
                    lVar2.onCalendarSelect(index, true);
                }
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
                draw(canvas, calendar, i10, i12, i11);
                i11++;
            }
            i10++;
            i9 = i11;
        }
    }

    protected abstract void onDrawScheme(Canvas canvas, Calendar calendar, int i8, int i9);

    protected abstract boolean onDrawSelected(Canvas canvas, Calendar calendar, int i8, int i9, boolean z7);

    protected abstract void onDrawText(Canvas canvas, Calendar calendar, int i8, int i9, boolean z7, boolean z8);

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.mDelegate.getClass();
        return false;
    }
}
