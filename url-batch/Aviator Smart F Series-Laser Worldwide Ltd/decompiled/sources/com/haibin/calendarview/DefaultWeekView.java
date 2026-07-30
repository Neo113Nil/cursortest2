package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes4.dex */
public final class DefaultWeekView extends WeekView {
    private int mPadding;
    private float mRadio;
    private float mSchemeBaseLine;
    private Paint mSchemeBasicPaint;
    private Paint mTextPaint;

    public DefaultWeekView(Context context) {
        super(context);
        this.mTextPaint = new Paint();
        this.mSchemeBasicPaint = new Paint();
        this.mTextPaint.setTextSize(b.dipToPx(context, 8.0f));
        this.mTextPaint.setColor(-1);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setFakeBoldText(true);
        this.mSchemeBasicPaint.setAntiAlias(true);
        this.mSchemeBasicPaint.setStyle(Paint.Style.FILL);
        this.mSchemeBasicPaint.setTextAlign(Paint.Align.CENTER);
        this.mSchemeBasicPaint.setColor(-1223853);
        this.mSchemeBasicPaint.setFakeBoldText(true);
        this.mRadio = b.dipToPx(getContext(), 7.0f);
        this.mPadding = b.dipToPx(getContext(), 4.0f);
        Paint.FontMetrics fontMetrics = this.mSchemeBasicPaint.getFontMetrics();
        this.mSchemeBaseLine = (this.mRadio - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f) + b.dipToPx(getContext(), 1.0f);
    }

    private float getTextWidth(String str) {
        return this.mTextPaint.measureText(str);
    }

    @Override // com.haibin.calendarview.WeekView
    protected void onDrawScheme(Canvas canvas, Calendar calendar, int i8) {
        this.mSchemeBasicPaint.setColor(calendar.getSchemeColor());
        int i9 = this.mItemWidth + i8;
        int i10 = this.mPadding;
        float f8 = this.mRadio;
        canvas.drawCircle((i9 - i10) - (f8 / 2.0f), i10 + f8, f8, this.mSchemeBasicPaint);
        canvas.drawText(calendar.getScheme(), (((i8 + this.mItemWidth) - this.mPadding) - (this.mRadio / 2.0f)) - (getTextWidth(calendar.getScheme()) / 2.0f), this.mPadding + this.mSchemeBaseLine, this.mTextPaint);
    }

    @Override // com.haibin.calendarview.WeekView
    protected boolean onDrawSelected(Canvas canvas, Calendar calendar, int i8, boolean z7) {
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(i8 + r8, this.mPadding, (i8 + this.mItemWidth) - r8, this.mItemHeight - r8, this.mSelectedPaint);
        return true;
    }

    @Override // com.haibin.calendarview.WeekView
    protected void onDrawText(Canvas canvas, Calendar calendar, int i8, boolean z7, boolean z8) {
        int i9 = i8 + (this.mItemWidth / 2);
        int i10 = (-this.mItemHeight) / 6;
        if (z8) {
            float f8 = i9;
            canvas.drawText(String.valueOf(calendar.getDay()), f8, this.mTextBaseLine + i10, this.mSelectTextPaint);
            canvas.drawText(calendar.getLunar(), f8, this.mTextBaseLine + (this.mItemHeight / 10), this.mSelectedLunarTextPaint);
        } else if (z7) {
            float f9 = i9;
            canvas.drawText(String.valueOf(calendar.getDay()), f9, this.mTextBaseLine + i10, calendar.isCurrentDay() ? this.mCurDayTextPaint : calendar.isCurrentMonth() ? this.mSchemeTextPaint : this.mOtherMonthTextPaint);
            canvas.drawText(calendar.getLunar(), f9, this.mTextBaseLine + (this.mItemHeight / 10), calendar.isCurrentDay() ? this.mCurDayLunarTextPaint : this.mSchemeLunarTextPaint);
        } else {
            float f10 = i9;
            canvas.drawText(String.valueOf(calendar.getDay()), f10, this.mTextBaseLine + i10, calendar.isCurrentDay() ? this.mCurDayTextPaint : calendar.isCurrentMonth() ? this.mCurMonthTextPaint : this.mOtherMonthTextPaint);
            canvas.drawText(calendar.getLunar(), f10, this.mTextBaseLine + (this.mItemHeight / 10), calendar.isCurrentDay() ? this.mCurDayLunarTextPaint : calendar.isCurrentMonth() ? this.mCurMonthLunarTextPaint : this.mOtherMonthLunarTextPaint);
        }
    }
}
