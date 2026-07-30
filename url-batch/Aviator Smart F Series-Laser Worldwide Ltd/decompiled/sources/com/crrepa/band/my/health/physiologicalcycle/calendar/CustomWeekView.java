package com.crrepa.band.my.health.physiologicalcycle.calendar;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.haibin.calendarview.Calendar;
import com.haibin.calendarview.WeekView;

/* loaded from: classes2.dex */
public class CustomWeekView extends WeekView {
    private float mCircleRadius;
    private Paint mCurrentDayPaint;
    private int mPadding;
    private Paint mPointPaint;
    private float mPointRadius;
    private int mRadius;
    private float mSchemeBaseLine;
    private Paint mSchemeBasicPaint;
    private Paint mSolarTermTextPaint;
    private Paint mTextPaint;

    public CustomWeekView(Context context) {
        super(context);
        this.mTextPaint = new Paint();
        this.mSolarTermTextPaint = new Paint();
        this.mPointPaint = new Paint();
        this.mCurrentDayPaint = new Paint();
        this.mSchemeBasicPaint = new Paint();
        this.mTextPaint.setTextSize(dipToPx(context, 8.0f));
        this.mTextPaint.setColor(-1);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setFakeBoldText(true);
        this.mSolarTermTextPaint.setColor(-12018177);
        this.mSolarTermTextPaint.setAntiAlias(true);
        Paint paint = this.mSolarTermTextPaint;
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        this.mSchemeBasicPaint.setAntiAlias(true);
        Paint paint2 = this.mSchemeBasicPaint;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.mSchemeBasicPaint.setTextAlign(align);
        this.mSchemeBasicPaint.setFakeBoldText(true);
        this.mSchemeBasicPaint.setColor(-1);
        this.mPointPaint.setAntiAlias(true);
        this.mPointPaint.setStyle(style);
        this.mPointPaint.setTextAlign(align);
        this.mPointPaint.setColor(SupportMenu.CATEGORY_MASK);
        this.mCurrentDayPaint.setAntiAlias(true);
        this.mCurrentDayPaint.setStyle(style);
        this.mCurrentDayPaint.setColor(-1381654);
        this.mCircleRadius = dipToPx(getContext(), 7.0f);
        this.mPadding = dipToPx(getContext(), 3.0f);
        this.mPointRadius = dipToPx(context, 2.0f);
        Paint.FontMetrics fontMetrics = this.mSchemeBasicPaint.getFontMetrics();
        this.mSchemeBaseLine = (this.mCircleRadius - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f) + dipToPx(getContext(), 1.0f);
        setLayerType(1, this.mSelectedPaint);
        Paint paint3 = this.mSelectedPaint;
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.SOLID;
        paint3.setMaskFilter(new BlurMaskFilter(28.0f, blur));
        setLayerType(1, this.mSchemeBasicPaint);
        this.mSchemeBasicPaint.setMaskFilter(new BlurMaskFilter(28.0f, blur));
    }

    private static int dipToPx(Context context, float f8) {
        return (int) ((f8 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // com.haibin.calendarview.WeekView
    protected void onDrawScheme(Canvas canvas, Calendar calendar, int i8) {
        if (isSelected(calendar)) {
            this.mPointPaint.setColor(-1);
        } else {
            this.mPointPaint.setColor(-7829368);
        }
        canvas.drawCircle(i8 + (this.mItemWidth / 2), this.mItemHeight - (this.mPadding * 3), this.mPointRadius, this.mPointPaint);
    }

    @Override // com.haibin.calendarview.WeekView
    protected boolean onDrawSelected(Canvas canvas, Calendar calendar, int i8, boolean z7) {
        canvas.drawCircle(i8 + (this.mItemWidth / 2), this.mItemHeight / 2, this.mRadius, this.mSelectedPaint);
        return true;
    }

    @Override // com.haibin.calendarview.WeekView
    protected void onDrawText(Canvas canvas, Calendar calendar, int i8, boolean z7, boolean z8) {
        int i9 = (this.mItemWidth / 2) + i8;
        int i10 = this.mItemHeight;
        int i11 = i10 / 2;
        int i12 = (-i10) / 6;
        if (calendar.isCurrentDay() && !z8) {
            canvas.drawCircle(i9, i11, this.mRadius, this.mCurrentDayPaint);
        }
        if (z7) {
            int i13 = this.mItemWidth + i8;
            int i14 = this.mPadding;
            float f8 = this.mCircleRadius;
            canvas.drawCircle((i13 - i14) - (f8 / 2.0f), i14 + f8, f8, this.mSchemeBasicPaint);
            this.mTextPaint.setColor(calendar.getSchemeColor());
            String scheme = calendar.getScheme();
            int i15 = i8 + this.mItemWidth;
            canvas.drawText(scheme, (i15 - r3) - this.mCircleRadius, this.mPadding + this.mSchemeBaseLine, this.mTextPaint);
        }
        if (calendar.isWeekend() && calendar.isCurrentMonth()) {
            this.mCurMonthTextPaint.setColor(-12018177);
            this.mCurMonthLunarTextPaint.setColor(-12018177);
            this.mSchemeTextPaint.setColor(-12018177);
            this.mSchemeLunarTextPaint.setColor(-12018177);
            this.mOtherMonthLunarTextPaint.setColor(-12018177);
            this.mOtherMonthTextPaint.setColor(-12018177);
        } else {
            this.mCurMonthTextPaint.setColor(-13421773);
            this.mCurMonthLunarTextPaint.setColor(-3158065);
            this.mSchemeTextPaint.setColor(-13421773);
            this.mSchemeLunarTextPaint.setColor(-3158065);
            this.mOtherMonthTextPaint.setColor(-1973791);
            this.mOtherMonthLunarTextPaint.setColor(-1973791);
        }
        if (z8) {
            float f9 = i9;
            canvas.drawText(String.valueOf(calendar.getDay()), f9, this.mTextBaseLine + i12, this.mSelectTextPaint);
            canvas.drawText(calendar.getLunar(), f9, this.mTextBaseLine + (this.mItemHeight / 10), this.mSelectedLunarTextPaint);
        } else if (z7) {
            float f10 = i9;
            canvas.drawText(String.valueOf(calendar.getDay()), f10, this.mTextBaseLine + i12, calendar.isCurrentMonth() ? this.mSchemeTextPaint : this.mOtherMonthTextPaint);
            canvas.drawText(calendar.getLunar(), f10, this.mTextBaseLine + (this.mItemHeight / 10), !TextUtils.isEmpty(calendar.getSolarTerm()) ? this.mSolarTermTextPaint : this.mSchemeLunarTextPaint);
        } else {
            float f11 = i9;
            canvas.drawText(String.valueOf(calendar.getDay()), f11, this.mTextBaseLine + i12, calendar.isCurrentDay() ? this.mCurDayTextPaint : calendar.isCurrentMonth() ? this.mCurMonthTextPaint : this.mOtherMonthTextPaint);
            canvas.drawText(calendar.getLunar(), f11, this.mTextBaseLine + (this.mItemHeight / 10), calendar.isCurrentDay() ? this.mCurDayLunarTextPaint : !TextUtils.isEmpty(calendar.getSolarTerm()) ? this.mSolarTermTextPaint : calendar.isCurrentMonth() ? this.mCurMonthLunarTextPaint : this.mOtherMonthLunarTextPaint);
        }
    }

    @Override // com.haibin.calendarview.BaseWeekView, com.haibin.calendarview.BaseView
    protected void onPreviewHook() {
        this.mSolarTermTextPaint.setTextSize(this.mCurMonthLunarTextPaint.getTextSize());
        this.mRadius = (Math.min(this.mItemWidth, this.mItemHeight) / 11) * 5;
    }
}
