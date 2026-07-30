package com.just.agentweb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class WebIndicator extends BaseIndicatorView {
    public static final int DO_END_ANIMATION_DURATION = 600;
    public static final int FINISH = 2;
    public static final int MAX_DECELERATE_SPEED_DURATION = 450;
    public static final int MAX_UNIFORM_SPEED_DURATION = 8000;
    public static final int STARTED = 1;
    public static final int UN_START = 0;
    private int indicatorStatus;
    private Animator mAnimator;
    private AnimatorListenerAdapter mAnimatorListenerAdapter;
    private ValueAnimator.AnimatorUpdateListener mAnimatorUpdateListener;
    private int mColor;
    private int mCurrentDoEndAnimationDuration;
    private int mCurrentMaxDecelerateSpeedDuration;
    private int mCurrentMaxUniformSpeedDuration;
    private float mCurrentProgress;
    private Paint mPaint;
    private int mTargetWidth;
    public int mWebIndicatorDefaultHeight;

    public WebIndicator(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doEnd() {
        if (this.indicatorStatus == 2 && this.mCurrentProgress == 100.0f) {
            setVisibility(8);
            this.mCurrentProgress = 0.0f;
            setAlpha(1.0f);
        }
        this.indicatorStatus = 0;
    }

    private void init(Context context, AttributeSet attributeSet, int i8) {
        this.mPaint = new Paint();
        this.mColor = Color.parseColor("#1aad19");
        this.mPaint.setAntiAlias(true);
        this.mPaint.setColor(this.mColor);
        this.mPaint.setDither(true);
        this.mPaint.setStrokeCap(Paint.Cap.SQUARE);
        this.mTargetWidth = context.getResources().getDisplayMetrics().widthPixels;
        this.mWebIndicatorDefaultHeight = AgentWebUtils.dp2px(context, 3.0f);
    }

    private void startAnim(boolean z7) {
        ValueAnimator valueAnimator;
        float f8 = z7 ? 100.0f : 95.0f;
        Animator animator = this.mAnimator;
        if (animator != null && animator.isStarted()) {
            this.mAnimator.cancel();
        }
        float f9 = this.mCurrentProgress;
        if (f9 == 0.0f) {
            f9 = 1.0E-8f;
        }
        this.mCurrentProgress = f9;
        if (z7) {
            if (f9 < 95.0f) {
                valueAnimator = ValueAnimator.ofFloat(f9, 95.0f);
                valueAnimator.setDuration((long) (((1.0f - (this.mCurrentProgress / 100.0f)) - 0.05f) * this.mCurrentMaxDecelerateSpeedDuration));
                valueAnimator.setInterpolator(new DecelerateInterpolator());
                valueAnimator.addUpdateListener(this.mAnimatorUpdateListener);
            } else {
                valueAnimator = null;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(this.mCurrentDoEndAnimationDuration);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(95.0f, 100.0f);
            ofFloat2.setDuration(this.mCurrentDoEndAnimationDuration);
            ofFloat2.addUpdateListener(this.mAnimatorUpdateListener);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            if (valueAnimator != null) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(animatorSet).after(valueAnimator);
                animatorSet = animatorSet2;
            }
            animatorSet.addListener(this.mAnimatorListenerAdapter);
            animatorSet.start();
            this.mAnimator = animatorSet;
        } else {
            AnimatorSet animatorSet3 = new AnimatorSet();
            float f10 = f8 * 0.6f;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.mCurrentProgress, f10);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, f8);
            float f11 = (long) (((1.0f - (this.mCurrentProgress / 100.0f)) - 0.05f) * this.mCurrentMaxUniformSpeedDuration);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setDuration((long) (f11 * 0.4f));
            ofFloat3.addUpdateListener(this.mAnimatorUpdateListener);
            ofFloat4.setInterpolator(new LinearInterpolator());
            ofFloat4.setDuration((long) (0.6f * f11));
            ofFloat4.addUpdateListener(this.mAnimatorUpdateListener);
            animatorSet3.play(ofFloat4).after(ofFloat3);
            animatorSet3.start();
            this.mAnimator = animatorSet3;
        }
        this.indicatorStatus = 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, (this.mCurrentProgress / 100.0f) * Float.valueOf(getWidth()).floatValue(), getHeight(), this.mPaint);
    }

    @Override // com.just.agentweb.BaseIndicatorView, com.just.agentweb.BaseIndicatorSpec
    public void hide() {
        this.indicatorStatus = 2;
    }

    @Override // com.just.agentweb.LayoutParamsOffer
    public FrameLayout.LayoutParams offerLayoutParams() {
        return new FrameLayout.LayoutParams(-1, this.mWebIndicatorDefaultHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.mAnimator;
        if (animator == null || !animator.isStarted()) {
            return;
        }
        this.mAnimator.cancel();
        this.mAnimator = null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i9);
        if (mode == Integer.MIN_VALUE && size > getContext().getResources().getDisplayMetrics().widthPixels) {
            size = getContext().getResources().getDisplayMetrics().widthPixels;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = this.mWebIndicatorDefaultHeight;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        int i12;
        super.onSizeChanged(i8, i9, i10, i11);
        this.mTargetWidth = getMeasuredWidth();
        int i13 = getContext().getResources().getDisplayMetrics().widthPixels;
        int i14 = this.mTargetWidth;
        if (i14 >= i13) {
            i12 = 450;
            this.mCurrentMaxDecelerateSpeedDuration = 450;
            this.mCurrentMaxUniformSpeedDuration = 8000;
        } else {
            float floatValue = i14 / Float.valueOf(i13).floatValue();
            this.mCurrentMaxUniformSpeedDuration = (int) (8000.0f * floatValue);
            this.mCurrentMaxDecelerateSpeedDuration = (int) (450.0f * floatValue);
            i12 = (int) (floatValue * 600.0f);
        }
        this.mCurrentDoEndAnimationDuration = i12;
        LogUtils.i("WebProgress", "CURRENT_MAX_UNIFORM_SPEED_DURATION" + this.mCurrentMaxUniformSpeedDuration);
    }

    @Override // com.just.agentweb.BaseIndicatorView, com.just.agentweb.BaseIndicatorSpec
    public void reset() {
        this.mCurrentProgress = 0.0f;
        Animator animator = this.mAnimator;
        if (animator == null || !animator.isStarted()) {
            return;
        }
        this.mAnimator.cancel();
    }

    public void setColor(int i8) {
        this.mColor = i8;
        this.mPaint.setColor(i8);
    }

    public void setProgress(float f8) {
        if (getVisibility() == 8) {
            setVisibility(0);
        }
        if (f8 >= 95.0f && this.indicatorStatus != 2) {
            startAnim(true);
        }
    }

    @Override // com.just.agentweb.BaseIndicatorView, com.just.agentweb.BaseIndicatorSpec
    public void show() {
        if (getVisibility() == 8) {
            setVisibility(0);
            this.mCurrentProgress = 0.0f;
            startAnim(false);
        }
    }

    public WebIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setColor(String str) {
        setColor(Color.parseColor(str));
    }

    @Override // com.just.agentweb.BaseIndicatorView, com.just.agentweb.BaseIndicatorSpec
    public void setProgress(int i8) {
        setProgress(Float.valueOf(i8).floatValue());
    }

    public WebIndicator(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mTargetWidth = 0;
        this.mCurrentMaxUniformSpeedDuration = 8000;
        this.mCurrentMaxDecelerateSpeedDuration = 450;
        this.mCurrentDoEndAnimationDuration = 600;
        this.indicatorStatus = 0;
        this.mCurrentProgress = 0.0f;
        this.mWebIndicatorDefaultHeight = 3;
        this.mAnimatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.just.agentweb.WebIndicator.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                WebIndicator.this.mCurrentProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WebIndicator.this.invalidate();
            }
        };
        this.mAnimatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.just.agentweb.WebIndicator.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                WebIndicator.this.doEnd();
            }
        };
        init(context, attributeSet, i8);
    }
}
