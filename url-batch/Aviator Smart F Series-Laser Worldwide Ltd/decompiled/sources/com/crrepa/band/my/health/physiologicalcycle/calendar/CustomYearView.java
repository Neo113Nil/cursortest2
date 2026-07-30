package com.crrepa.band.my.health.physiologicalcycle.calendar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.crrepa.band.aviator.R;
import com.haibin.calendarview.Calendar;
import com.haibin.calendarview.YearView;

/* loaded from: classes2.dex */
public class CustomYearView extends YearView {
    private Paint mLeapYearTextPaint;
    private int mTextPadding;

    public CustomYearView(Context context) {
        super(context);
        this.mLeapYearTextPaint = new Paint(1);
        this.mTextPadding = dipToPx(context, 3.0f);
        this.mLeapYearTextPaint.setTextSize(dipToPx(context, 12.0f));
        this.mLeapYearTextPaint.setColor(-3026479);
        this.mLeapYearTextPaint.setAntiAlias(true);
        this.mLeapYearTextPaint.setFakeBoldText(true);
    }

    private static int dipToPx(Context context, float f8) {
        return (int) ((f8 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private float getTextWidth(Paint paint, String str) {
        return paint.measureText(str);
    }

    private static boolean isLeapYear(int i8) {
        return (i8 % 4 == 0 && i8 % 100 != 0) || i8 % 400 == 0;
    }

    @Override // com.haibin.calendarview.YearView
    protected void onDrawMonth(Canvas canvas, int i8, int i9, int i10, int i11, int i12, int i13) {
        String str = getContext().getResources().getStringArray(R.array.month_string_array)[i9 - 1];
        float f8 = i11;
        canvas.drawText(str, ((this.mItemWidth / 2) + i10) - this.mTextPadding, this.mMonthTextBaseLine + f8, this.mMonthTextPaint);
        if (i9 == 2 && isLeapYear(i8)) {
            canvas.drawText("闰年", ((i10 + (this.mItemWidth / 2)) - this.mTextPadding) + getTextWidth(this.mMonthTextPaint, str) + dipToPx(getContext(), 6.0f), f8 + this.mMonthTextBaseLine, this.mLeapYearTextPaint);
        }
    }

    @Override // com.haibin.calendarview.YearView
    protected void onDrawScheme(Canvas canvas, Calendar calendar, int i8, int i9) {
    }

    @Override // com.haibin.calendarview.YearView
    protected boolean onDrawSelected(Canvas canvas, Calendar calendar, int i8, int i9, boolean z7) {
        int i10 = this.mItemWidth;
        int i11 = this.mItemHeight;
        canvas.drawCircle(i8 + (i10 / 2), i9 + (i11 / 2), (Math.min(i10, i11) / 8) * 5, this.mSelectedPaint);
        return true;
    }

    @Override // com.haibin.calendarview.YearView
    protected void onDrawText(Canvas canvas, Calendar calendar, int i8, int i9, boolean z7, boolean z8) {
        float f8 = this.mTextBaseLine + i9;
        int i10 = i8 + (this.mItemWidth / 2);
        if (z8) {
            canvas.drawText(String.valueOf(calendar.getDay()), i10, f8, z7 ? this.mSchemeTextPaint : this.mSelectTextPaint);
        } else if (z7) {
            canvas.drawText(String.valueOf(calendar.getDay()), i10, f8, calendar.isCurrentDay() ? this.mCurDayTextPaint : this.mSchemeTextPaint);
        } else {
            canvas.drawText(String.valueOf(calendar.getDay()), i10, f8, calendar.isCurrentDay() ? this.mCurDayTextPaint : this.mCurMonthTextPaint);
        }
    }

    @Override // com.haibin.calendarview.YearView
    protected void onDrawWeek(Canvas canvas, int i8, int i9, int i10, int i11, int i12) {
        canvas.drawText(getContext().getResources().getStringArray(R.array.year_view_week_string_array)[i8], i9 + (i11 / 2), i10 + this.mWeekTextBaseLine, this.mWeekTextPaint);
    }
}
