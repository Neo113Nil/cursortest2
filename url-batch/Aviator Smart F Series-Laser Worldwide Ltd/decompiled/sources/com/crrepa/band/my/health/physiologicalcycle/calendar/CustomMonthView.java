package com.crrepa.band.my.health.physiologicalcycle.calendar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.haibin.calendarview.Calendar;
import com.haibin.calendarview.MonthView;
import w2.a;

/* loaded from: classes2.dex */
public class CustomMonthView extends MonthView {
    private int mSafetyPeriodColor;
    private int mSchemedRadius;
    private int mSelectedRadius;
    private Paint selectPaint;

    public CustomMonthView(Context context) {
        super(context);
        this.selectPaint = new Paint();
        int color = ContextCompat.getColor(context, R.color.color_menstruation);
        this.mSchemeTextPaint.setColor(-1);
        this.mSelectedPaint.setColor(color);
        this.selectPaint.setStrokeWidth(10.0f);
        this.selectPaint.setStyle(Paint.Style.STROKE);
        this.selectPaint.setAntiAlias(true);
        this.selectPaint.setColor(-1);
    }

    @Override // com.haibin.calendarview.MonthView, android.view.View.OnClickListener
    public void onClick(View view) {
        Calendar index = getIndex();
        if (index == null || index.isCurrentDay()) {
            super.onClick(view);
        }
    }

    @Override // com.haibin.calendarview.MonthView
    protected void onDrawScheme(Canvas canvas, Calendar calendar, int i8, int i9) {
        int schemeColor = calendar.getSchemeColor();
        if (schemeColor == this.mSafetyPeriodColor) {
            return;
        }
        int i10 = i8 + (this.mItemWidth / 2);
        int i11 = i9 + (this.mItemHeight / 2);
        this.mSchemePaint.setColor(schemeColor);
        if (calendar.isCurrentMonth()) {
            this.mSchemePaint.setAlpha(255);
        } else {
            this.mSchemePaint.setAlpha(166);
        }
        canvas.drawCircle(i10, i11, this.mSchemedRadius, this.mSchemePaint);
    }

    @Override // com.haibin.calendarview.MonthView
    protected boolean onDrawSelected(Canvas canvas, Calendar calendar, int i8, int i9, boolean z7) {
        int i10 = i8 + (this.mItemWidth / 2);
        int i11 = i9 + (this.mItemHeight / 2);
        if (!calendar.isCurrentDay()) {
            return true;
        }
        if (z7) {
            this.selectPaint.setColor(a.getSelectedColor(getContext(), calendar));
        }
        canvas.drawCircle(i10, i11, this.mSelectedRadius, this.selectPaint);
        return true;
    }

    @Override // com.haibin.calendarview.MonthView
    protected void onDrawText(Canvas canvas, Calendar calendar, int i8, int i9, boolean z7, boolean z8) {
        int i10 = i8 + (this.mItemWidth / 2);
        float f8 = this.mTextBaseLine + i9;
        boolean isCurrentMonth = calendar.isCurrentMonth();
        if (!z7 || calendar.getSchemeColor() == this.mSafetyPeriodColor) {
            canvas.drawText(String.valueOf(calendar.getDay()), i10, f8, isCurrentMonth ? this.mCurMonthTextPaint : this.mOtherMonthTextPaint);
        } else {
            canvas.drawText(String.valueOf(calendar.getDay()), i10, f8, this.mSchemeTextPaint);
        }
    }

    @Override // com.haibin.calendarview.BaseMonthView, com.haibin.calendarview.BaseView
    protected void onPreviewHook() {
        this.mSelectedRadius = (Math.min(this.mItemWidth, this.mItemHeight) / 11) * 5;
        this.mSchemedRadius = (Math.min(this.mItemWidth, this.mItemHeight) / 11) * 4;
        this.mSafetyPeriodColor = ContextCompat.getColor(getContext(), R.color.color_safety_period);
    }
}
