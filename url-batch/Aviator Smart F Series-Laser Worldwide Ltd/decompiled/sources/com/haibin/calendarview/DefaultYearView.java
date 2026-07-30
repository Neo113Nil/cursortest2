package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;

/* loaded from: classes4.dex */
public class DefaultYearView extends YearView {
    private int mTextPadding;

    public DefaultYearView(Context context) {
        super(context);
        this.mTextPadding = b.dipToPx(context, 3.0f);
    }

    @Override // com.haibin.calendarview.YearView
    protected void onDrawMonth(Canvas canvas, int i8, int i9, int i10, int i11, int i12, int i13) {
        canvas.drawText(getContext().getResources().getStringArray(R$array.month_string_array)[i9 - 1], (i10 + (this.mItemWidth / 2)) - this.mTextPadding, i11 + this.mMonthTextBaseLine, this.mMonthTextPaint);
    }

    @Override // com.haibin.calendarview.YearView
    protected void onDrawScheme(Canvas canvas, Calendar calendar, int i8, int i9) {
    }

    @Override // com.haibin.calendarview.YearView
    protected boolean onDrawSelected(Canvas canvas, Calendar calendar, int i8, int i9, boolean z7) {
        return false;
    }

    @Override // com.haibin.calendarview.YearView
    protected void onDrawText(Canvas canvas, Calendar calendar, int i8, int i9, boolean z7, boolean z8) {
        float f8 = this.mTextBaseLine + i9;
        int i10 = i8 + (this.mItemWidth / 2);
        if (z8) {
            canvas.drawText(String.valueOf(calendar.getDay()), i10, f8, z7 ? this.mSchemeTextPaint : this.mSelectTextPaint);
        } else if (z7) {
            canvas.drawText(String.valueOf(calendar.getDay()), i10, f8, calendar.isCurrentDay() ? this.mCurDayTextPaint : calendar.isCurrentMonth() ? this.mSchemeTextPaint : this.mOtherMonthTextPaint);
        } else {
            canvas.drawText(String.valueOf(calendar.getDay()), i10, f8, calendar.isCurrentDay() ? this.mCurDayTextPaint : calendar.isCurrentMonth() ? this.mCurMonthTextPaint : this.mOtherMonthTextPaint);
        }
    }

    @Override // com.haibin.calendarview.YearView
    protected void onDrawWeek(Canvas canvas, int i8, int i9, int i10, int i11, int i12) {
        canvas.drawText(getContext().getResources().getStringArray(R$array.year_view_week_string_array)[i8], i9 + (i11 / 2), i10 + this.mWeekTextBaseLine, this.mWeekTextPaint);
    }
}
