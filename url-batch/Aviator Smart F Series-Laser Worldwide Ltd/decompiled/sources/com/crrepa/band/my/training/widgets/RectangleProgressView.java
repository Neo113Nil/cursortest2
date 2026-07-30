package com.crrepa.band.my.training.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.google.android.exoplayer2.ExoPlayer;
import com.moyoung.dafit.module.common.utils.o;
import com.moyoung.dafit.module.common.widgets.d;
import com.orhanobut.logger.f;

/* loaded from: classes3.dex */
public class RectangleProgressView extends View {
    private static final int DEFAULT_ANIMATION_DURATION = 2000;
    private static final int MAX_PERCENT = 100;
    private int cornersPercent;
    private int height;
    private ValueAnimator mAnimator;
    private d.b onCompleteListener;
    private Paint outlinePaint;
    private int percent;
    private int progressBgColor;
    private int progressColor;
    private Paint progressPaint;
    private int radius;
    private int state;
    private int width;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RectangleProgressView.this.percent = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            RectangleProgressView.this.postInvalidate();
        }
    }

    public RectangleProgressView(Context context) {
        super(context);
        this.outlinePaint = new Paint();
        this.progressPaint = new Paint();
        this.state = 1;
        this.progressBgColor = ContextCompat.getColor(getContext(), R.color.color_gps_training_goal);
        this.progressColor = ContextCompat.getColor(getContext(), R.color.color_gps_training);
        this.mAnimator = ValueAnimator.ofInt(0, 100);
        init();
    }

    private void drawOutline(Canvas canvas, Paint paint) {
        int paddingStart = getPaddingStart();
        Path path = new Path();
        float f8 = paddingStart;
        path.moveTo(this.radius, f8);
        path.lineTo(this.width - this.radius, f8);
        canvas.drawPath(path, paint);
        int i8 = this.width;
        int i9 = this.height;
        canvas.drawArc(new RectF(i8 - i9, f8, i8 - paddingStart, i9 - paddingStart), 270.0f, 180.0f, false, paint);
        path.reset();
        path.moveTo(this.width - this.radius, this.height - paddingStart);
        path.lineTo(this.radius, this.height - paddingStart);
        canvas.drawPath(path, paint);
        canvas.drawArc(new RectF(f8, f8, this.height, r1 - paddingStart), 90.0f, 180.0f, false, paint);
    }

    private void drawProgressLine(Canvas canvas, Paint paint) {
        int i8;
        int i9;
        d.b bVar;
        this.progressPaint.setColor(this.progressColor);
        int paddingStart = getPaddingStart();
        Path path = new Path();
        int i10 = this.width;
        int i11 = this.height;
        float f8 = paddingStart;
        RectF rectF = new RectF(i10 - i11, f8, i10 - paddingStart, i11 - paddingStart);
        RectF rectF2 = new RectF(f8, f8, this.height, r1 - paddingStart);
        path.moveTo(this.width >> 1, f8);
        int i12 = this.width;
        int i13 = i12 - this.radius;
        int i14 = (50 - this.cornersPercent) >> 1;
        if (this.percent <= i14) {
            float f9 = ((int) (((r3 * ((i12 - this.height) >> 1)) * 1.0f) / i14)) + (i12 >> 1);
            path.lineTo(f9, f8);
            canvas.drawPath(path, paint);
            this.progressPaint.setColor(this.progressBgColor);
            path.reset();
            path.moveTo(f9, f8);
            path.lineTo(i13, f8);
        } else {
            path.lineTo(i13, f8);
        }
        canvas.drawPath(path, paint);
        int i15 = this.cornersPercent;
        int i16 = i14 + i15;
        int i17 = this.percent;
        if (i14 >= i17 || i17 >= i16) {
            i8 = i14;
            i9 = i16;
            canvas.drawArc(rectF, 270.0f, 180.0f, false, paint);
        } else {
            int i18 = (int) ((((i17 - i14) * 1.0f) / i15) * 180.0f);
            i8 = i14;
            i9 = i16;
            canvas.drawArc(rectF, 270.0f, i18, false, paint);
            this.progressPaint.setColor(this.progressBgColor);
            canvas.drawArc(rectF, i18 + 270, 180 - i18, false, paint);
        }
        int i19 = (i9 + 50) - this.cornersPercent;
        path.reset();
        path.moveTo(this.width - this.radius, this.height - paddingStart);
        int i20 = this.percent;
        if (i9 > i20 || i20 > i19) {
            path.lineTo(this.radius, this.height - paddingStart);
        } else {
            int i21 = this.width;
            float f10 = (i21 - this.radius) - (((i20 - i9) * (i21 - this.height)) / (50 - this.cornersPercent));
            path.lineTo(f10, r4 - paddingStart);
            canvas.drawPath(path, paint);
            this.progressPaint.setColor(this.progressBgColor);
            path.reset();
            path.moveTo(f10, this.height - paddingStart);
            path.lineTo(this.radius, this.height - paddingStart);
        }
        canvas.drawPath(path, paint);
        int i22 = this.cornersPercent;
        int i23 = i19 + i22;
        int i24 = this.percent;
        if (i19 >= i24 || i24 >= i23) {
            canvas.drawArc(rectF2, 90.0f, 180.0f, false, paint);
        } else {
            canvas.drawArc(rectF2, 90.0f, (int) ((((i24 - i19) * 1.0f) / i22) * 180.0f), false, paint);
            this.progressPaint.setColor(this.progressBgColor);
            canvas.drawArc(rectF2, r11 + 90, 180 - r11, false, paint);
        }
        path.reset();
        path.moveTo(this.radius, f8);
        int i25 = this.percent;
        if (i23 > i25 || i25 >= 100) {
            path.lineTo(this.width >> 1, f8);
        } else {
            float f11 = (((i25 - i23) * ((this.width - this.height) >> 1)) / i8) + this.radius;
            path.lineTo(f11, f8);
            canvas.drawPath(path, paint);
            this.progressPaint.setColor(this.progressBgColor);
            path.reset();
            path.moveTo(f11, f8);
            path.lineTo(this.width >> 1, f8);
        }
        canvas.drawPath(path, paint);
        if (this.percent != 100 || (bVar = this.onCompleteListener) == null) {
            return;
        }
        bVar.onComplete();
    }

    private void init() {
        this.outlinePaint.setColor(ContextCompat.getColor(getContext(), R.color.color_remove_band_button_bg));
        this.outlinePaint.setStrokeWidth(o.dp2px(getContext(), 1.0f));
        this.outlinePaint.setAntiAlias(true);
        Paint paint = this.outlinePaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.progressPaint.setStrokeWidth(o.dp2px(getContext(), 3.0f));
        this.progressPaint.setAntiAlias(true);
        this.progressPaint.setStyle(style);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.state == 1) {
            drawOutline(canvas, this.outlinePaint);
        } else {
            drawProgressLine(canvas, this.progressPaint);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        this.width = i8;
        this.height = i9;
        int i12 = i9 / 2;
        this.radius = i12;
        this.cornersPercent = (int) (((i12 * 3.141592653589793d) / (((i8 - i9) * 2) + (i12 * 6.283185307179586d))) * 100.0d);
        f.d("cornersPrecent: " + this.cornersPercent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        f.d("onTouchEvent: " + motionEvent.getAction());
        int action = motionEvent.getAction();
        if (action == 0) {
            this.state = 0;
            this.percent = 0;
            this.mAnimator.setDuration(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
            this.mAnimator.setInterpolator(new LinearInterpolator());
            this.mAnimator.addUpdateListener(new a());
            this.mAnimator.start();
        } else if (action == 1) {
            this.mAnimator.cancel();
            this.state = 1;
            invalidate();
        }
        return true;
    }

    public RectangleProgressView setOnCompleteListener(d.b bVar) {
        this.onCompleteListener = bVar;
        return this;
    }

    public RectangleProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.outlinePaint = new Paint();
        this.progressPaint = new Paint();
        this.state = 1;
        this.progressBgColor = ContextCompat.getColor(getContext(), R.color.color_gps_training_goal);
        this.progressColor = ContextCompat.getColor(getContext(), R.color.color_gps_training);
        this.mAnimator = ValueAnimator.ofInt(0, 100);
        init();
    }

    public RectangleProgressView(Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.outlinePaint = new Paint();
        this.progressPaint = new Paint();
        this.state = 1;
        this.progressBgColor = ContextCompat.getColor(getContext(), R.color.color_gps_training_goal);
        this.progressColor = ContextCompat.getColor(getContext(), R.color.color_gps_training);
        this.mAnimator = ValueAnimator.ofInt(0, 100);
        init();
    }
}
