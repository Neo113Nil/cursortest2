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
import com.gdmhkmf.belbet.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f1247s = 0;

    /* renamed from: f, reason: collision with root package name */
    public final ValueAnimator f1248f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1249g;
    public final ArrayList h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1250j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f1251k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f1252l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1253m;

    /* renamed from: n, reason: collision with root package name */
    public float f1254n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1255o;

    /* renamed from: p, reason: collision with root package name */
    public double f1256p;

    /* renamed from: q, reason: collision with root package name */
    public int f1257q;

    /* renamed from: r, reason: collision with root package name */
    public int f1258r;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f1248f = valueAnimator;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.f1251k = paint;
        this.f1252l = new RectF();
        this.f1258r = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q1.a.f3144f, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        b4.l.V(context, R.attr.motionDurationLong2, 200);
        b4.l.W(context, R.attr.motionEasingEmphasizedInterpolator, r1.a.f3206b);
        this.f1257q = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f1253m = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f1250j = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
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
                int i = ClockHandView.f1247s;
                ClockHandView.this.c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new e());
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.f1257q * 0.66f) : this.f1257q;
    }

    public final void b(float f5) {
        this.f1248f.cancel();
        c(f5);
    }

    public final void c(float f5) {
        float f6 = f5 % 360.0f;
        this.f1254n = f6;
        this.f1256p = Math.toRadians(f6 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a5 = a(this.f1258r);
        float cos = (((float) Math.cos(this.f1256p)) * a5) + width;
        float sin = (a5 * ((float) Math.sin(this.f1256p))) + height;
        float f7 = this.i;
        this.f1252l.set(cos - f7, sin - f7, cos + f7, sin + f7);
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ClockFaceView clockFaceView = (ClockFaceView) ((f) obj);
            if (Math.abs(clockFaceView.L - f6) > 0.001f) {
                clockFaceView.L = f6;
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
        float f5 = width;
        float a5 = a(this.f1258r);
        float cos = (((float) Math.cos(this.f1256p)) * a5) + f5;
        float f6 = height;
        float sin = (a5 * ((float) Math.sin(this.f1256p))) + f6;
        Paint paint = this.f1251k;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.i, paint);
        double sin2 = Math.sin(this.f1256p);
        paint.setStrokeWidth(this.f1253m);
        canvas.drawLine(f5, f6, width + ((int) (Math.cos(this.f1256p) * r2)), height + ((int) (r2 * sin2)), paint);
        canvas.drawCircle(f5, f6, this.f1250j, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        super.onLayout(z4, i, i4, i5, i6);
        if (this.f1248f.isRunning()) {
            return;
        }
        b(this.f1254n);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        boolean z6 = false;
        if (actionMasked == 0) {
            this.f1255o = false;
            z4 = true;
            z5 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z5 = this.f1255o;
            if (this.f1249g) {
                this.f1258r = ((float) Math.hypot((double) (x4 - ((float) (getWidth() / 2))), (double) (y4 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z4 = false;
        } else {
            z5 = false;
            z4 = false;
        }
        boolean z7 = this.f1255o;
        int degrees = (int) Math.toDegrees(Math.atan2(y4 - (getHeight() / 2), x4 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f5 = i;
        boolean z8 = this.f1254n != f5;
        if (!z4 || !z8) {
            if (z8 || z5) {
                b(f5);
            }
            this.f1255o = z7 | z6;
            return true;
        }
        z6 = true;
        this.f1255o = z7 | z6;
        return true;
    }
}
