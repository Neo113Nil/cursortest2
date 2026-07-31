package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.AbstractC1281a0;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class ClockHandView extends View {
    private boolean animatingOnTouchUp;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private final List<OnRotateListener> listeners;
    private float originalDeg;
    private final Paint paint;
    private ValueAnimator rotationAnimator;
    private int scaledTouchSlop;
    private final RectF selectorBox;
    private final int selectorRadius;
    private final int selectorStrokeWidth;

    public interface OnRotateListener {
        void onRotate(float f4, boolean z4);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialClockStyle);
    }

    private void drawSelector(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float cos = (this.circleRadius * ((float) Math.cos(this.degRad))) + width;
        float f4 = height;
        float sin = (this.circleRadius * ((float) Math.sin(this.degRad))) + f4;
        this.paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.selectorRadius, this.paint);
        double sin2 = Math.sin(this.degRad);
        double cos2 = Math.cos(this.degRad);
        this.paint.setStrokeWidth(this.selectorStrokeWidth);
        canvas.drawLine(width, f4, r1 + ((int) (cos2 * r9)), height + ((int) (r9 * sin2)), this.paint);
        canvas.drawCircle(width, f4, this.centerDotRadius, this.paint);
    }

    private int getDegreesFromXY(float f4, float f5) {
        int degrees = (int) Math.toDegrees(Math.atan2(f5 - (getHeight() / 2), f4 - (getWidth() / 2)));
        int i4 = degrees + 90;
        return i4 < 0 ? degrees + 450 : i4;
    }

    private Pair<Float, Float> getValuesForAnimation(float f4) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f4) > 180.0f) {
            if (handRotation > 180.0f && f4 < 180.0f) {
                f4 += 360.0f;
            }
            if (handRotation < 180.0f && f4 > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(handRotation), Float.valueOf(f4));
    }

    private boolean handleTouchInput(float f4, float f5, boolean z4, boolean z5, boolean z6) {
        float degreesFromXY = getDegreesFromXY(f4, f5);
        boolean z7 = false;
        boolean z8 = getHandRotation() != degreesFromXY;
        if (z5 && z8) {
            return true;
        }
        if (!z8 && !z4) {
            return false;
        }
        if (z6 && this.animatingOnTouchUp) {
            z7 = true;
        }
        setHandRotation(degreesFromXY, z7);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHandRotationInternal(float f4, boolean z4) {
        float f5 = f4 % 360.0f;
        this.originalDeg = f5;
        this.degRad = Math.toRadians(f5 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.circleRadius * ((float) Math.cos(this.degRad)));
        float sin = height + (this.circleRadius * ((float) Math.sin(this.degRad)));
        RectF rectF = this.selectorBox;
        int i4 = this.selectorRadius;
        rectF.set(width - i4, sin - i4, width + i4, sin + i4);
        Iterator<OnRotateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRotate(f5, z4);
        }
        invalidate();
    }

    public void addOnRotateListener(OnRotateListener onRotateListener) {
        this.listeners.add(onRotateListener);
    }

    public RectF getCurrentSelectorBox() {
        return this.selectorBox;
    }

    public float getHandRotation() {
        return this.originalDeg;
    }

    public int getSelectorRadius() {
        return this.selectorRadius;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSelector(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        setHandRotation(getHandRotation());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        if (actionMasked == 0) {
            this.downX = x4;
            this.downY = y4;
            this.isInTapRegion = true;
            this.changedDuringTouch = false;
            z4 = true;
            z5 = false;
            z6 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i4 = (int) (x4 - this.downX);
            int i5 = (int) (y4 - this.downY);
            this.isInTapRegion = (i4 * i4) + (i5 * i5) > this.scaledTouchSlop;
            z5 = this.changedDuringTouch;
            z6 = actionMasked == 1;
            z4 = false;
        } else {
            z5 = false;
            z4 = false;
            z6 = false;
        }
        this.changedDuringTouch |= handleTouchInput(x4, y4, z5, z4, z6);
        return true;
    }

    public void setCircleRadius(int i4) {
        this.circleRadius = i4;
        invalidate();
    }

    public void setHandRotation(float f4) {
        setHandRotation(f4, false);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.listeners = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.selectorBox = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClockHandView, i4, R$style.Widget_MaterialComponents_TimePicker_Clock);
        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockHandView_materialCircleRadius, 0);
        this.selectorRadius = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockHandView_selectorSize, 0);
        this.selectorStrokeWidth = getResources().getDimensionPixelSize(R$dimen.material_clock_hand_stroke_width);
        this.centerDotRadius = r6.getDimensionPixelSize(R$dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(R$styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        AbstractC1281a0.z0(this, 2);
        obtainStyledAttributes.recycle();
    }

    public void setHandRotation(float f4, boolean z4) {
        ValueAnimator valueAnimator = this.rotationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z4) {
            setHandRotationInternal(f4, false);
            return;
        }
        Pair<Float, Float> valuesForAnimation = getValuesForAnimation(f4);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) valuesForAnimation.first).floatValue(), ((Float) valuesForAnimation.second).floatValue());
        this.rotationAnimator = ofFloat;
        ofFloat.setDuration(200L);
        this.rotationAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.ClockHandView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.this.setHandRotationInternal(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        this.rotationAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.timepicker.ClockHandView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
        this.rotationAnimator.start();
    }
}
