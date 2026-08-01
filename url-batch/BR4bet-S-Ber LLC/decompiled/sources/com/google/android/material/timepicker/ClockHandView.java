package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.moontiko.really.admiralcasino.R;
import defpackage.g3;
import defpackage.kr;
import defpackage.qb;
import defpackage.rb;
import defpackage.y00;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int s = 0;
    public final ValueAnimator f;
    public boolean g;
    public final ArrayList h;
    public final int i;
    public final float j;
    public final Paint k;
    public final RectF l;
    public final int m;
    public float n;
    public boolean o;
    public double p;
    public int q;
    public int r;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f = valueAnimator;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.k = paint;
        this.l = new RectF();
        this.r = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.h, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        kr.W(context, R.attr.motionDurationLong2, 200);
        kr.X(context, R.attr.motionEasingEmphasizedInterpolator, g3.b);
        this.q = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.m = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.j = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.s;
                ClockHandView.this.b(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new qb());
    }

    public final void a(float f) {
        this.f.cancel();
        b(f);
    }

    public final void b(float f) {
        float f2 = f % 360.0f;
        this.n = f2;
        this.p = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.r;
        int i2 = this.q;
        if (i == 2) {
            i2 = Math.round(i2 * 0.66f);
        }
        float f3 = width;
        float f4 = i2;
        float cos = (((float) Math.cos(this.p)) * f4) + f3;
        float sin = (f4 * ((float) Math.sin(this.p))) + height;
        float f5 = this.i;
        this.l.set(cos - f5, sin - f5, cos + f5, sin + f5);
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ClockFaceView clockFaceView = (ClockFaceView) ((rb) obj);
            if (Math.abs(clockFaceView.L - f2) > 0.001f) {
                clockFaceView.L = f2;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.r;
        int i2 = this.q;
        if (i == 2) {
            i2 = Math.round(i2 * 0.66f);
        }
        float f = width;
        float f2 = i2;
        float cos = (((float) Math.cos(this.p)) * f2) + f;
        float f3 = height;
        float sin = (f2 * ((float) Math.sin(this.p))) + f3;
        Paint paint = this.k;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.i, paint);
        double sin2 = Math.sin(this.p);
        paint.setStrokeWidth(this.m);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.p) * r3)), height + ((int) (r3 * sin2)), paint);
        canvas.drawCircle(f, f3, this.j, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f.isRunning()) {
            return;
        }
        a(this.n);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.o = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.o;
            if (this.g) {
                this.r = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) Math.round(((float) this.q) * 0.66f)) + TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.o;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.n != f;
        if (!z || !z5) {
            if (z5 || z2) {
                a(f);
            }
            this.o = z4 | z3;
            return true;
        }
        z3 = true;
        this.o = z4 | z3;
        return true;
    }
}
