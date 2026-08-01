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
import com.gglhk.bofio.fortunetiger.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f1440s = 0;

    /* renamed from: f, reason: collision with root package name */
    public final ValueAnimator f1441f;
    public boolean g;
    public final ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1442i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1443j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f1444k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f1445l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1446m;

    /* renamed from: n, reason: collision with root package name */
    public float f1447n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1448o;

    /* renamed from: p, reason: collision with root package name */
    public double f1449p;

    /* renamed from: q, reason: collision with root package name */
    public int f1450q;

    /* renamed from: r, reason: collision with root package name */
    public int f1451r;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f1441f = valueAnimator;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.f1444k = paint;
        this.f1445l = new RectF();
        this.f1451r = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l1.a.f2861e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        k3.m.Q(context, R.attr.motionDurationLong2, 200);
        k3.m.R(context, R.attr.motionEasingEmphasizedInterpolator, m1.a.f2906b);
        this.f1450q = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f1442i = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f1446m = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f1443j = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i4 = ClockHandView.f1440s;
                ClockHandView.this.c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new e());
    }

    public final int a(int i4) {
        return i4 == 2 ? Math.round(this.f1450q * 0.66f) : this.f1450q;
    }

    public final void b(float f4) {
        this.f1441f.cancel();
        c(f4);
    }

    public final void c(float f4) {
        float f5 = f4 % 360.0f;
        this.f1447n = f5;
        this.f1449p = Math.toRadians(f5 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a4 = a(this.f1451r);
        float cos = (((float) Math.cos(this.f1449p)) * a4) + width;
        float sin = (a4 * ((float) Math.sin(this.f1449p))) + height;
        float f6 = this.f1442i;
        this.f1445l.set(cos - f6, sin - f6, cos + f6, sin + f6);
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ClockFaceView clockFaceView = (ClockFaceView) ((f) obj);
            if (Math.abs(clockFaceView.L - f5) > 0.001f) {
                clockFaceView.L = f5;
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
        float f4 = width;
        float a4 = a(this.f1451r);
        float cos = (((float) Math.cos(this.f1449p)) * a4) + f4;
        float f5 = height;
        float sin = (a4 * ((float) Math.sin(this.f1449p))) + f5;
        Paint paint = this.f1444k;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f1442i, paint);
        double sin2 = Math.sin(this.f1449p);
        paint.setStrokeWidth(this.f1446m);
        canvas.drawLine(f4, f5, width + ((int) (Math.cos(this.f1449p) * r2)), height + ((int) (r2 * sin2)), paint);
        canvas.drawCircle(f4, f5, this.f1443j, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        if (this.f1441f.isRunning()) {
            return;
        }
        b(this.f1447n);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        boolean z5 = false;
        if (actionMasked == 0) {
            this.f1448o = false;
            z3 = true;
            z4 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z4 = this.f1448o;
            if (this.g) {
                this.f1451r = ((float) Math.hypot((double) (x3 - ((float) (getWidth() / 2))), (double) (y3 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z3 = false;
        } else {
            z4 = false;
            z3 = false;
        }
        boolean z6 = this.f1448o;
        int degrees = (int) Math.toDegrees(Math.atan2(y3 - (getHeight() / 2), x3 - (getWidth() / 2)));
        int i4 = degrees + 90;
        if (i4 < 0) {
            i4 = degrees + 450;
        }
        float f4 = i4;
        boolean z7 = this.f1447n != f4;
        if (!z3 || !z7) {
            if (z7 || z4) {
                b(f4);
            }
            this.f1448o = z6 | z5;
            return true;
        }
        z5 = true;
        this.f1448o = z6 | z5;
        return true;
    }
}
