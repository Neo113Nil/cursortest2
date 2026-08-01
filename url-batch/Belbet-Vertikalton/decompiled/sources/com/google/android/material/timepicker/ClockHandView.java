package com.google.android.material.timepicker;

import H1.l;
import M.P;
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
import com.winpower.neonfit.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import t0.AbstractC0383a;
import u0.AbstractC0389a;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator f2571a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2572b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2573c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2574d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f2575f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f2576g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2577h;
    public float i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public double f2578k;

    /* renamed from: l, reason: collision with root package name */
    public int f2579l;

    /* renamed from: m, reason: collision with root package name */
    public int f2580m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f2571a = new ValueAnimator();
        this.f2573c = new ArrayList();
        Paint paint = new Paint();
        this.f2575f = paint;
        this.f2576g = new RectF();
        this.f2580m = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0383a.e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        l.T(context, R.attr.motionDurationLong2, 200);
        l.U(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0389a.f4370b);
        this.f2579l = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2574d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f2577h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.e = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = P.f711a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.f2579l * 0.66f) : this.f2579l;
    }

    public final void b(float f2) {
        ValueAnimator valueAnimator = this.f2571a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f3 = f2 % 360.0f;
        this.i = f3;
        this.f2578k = Math.toRadians(f3 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a2 = a(this.f2580m);
        float cos = (((float) Math.cos(this.f2578k)) * a2) + width;
        float sin = (a2 * ((float) Math.sin(this.f2578k))) + height;
        float f4 = this.f2574d;
        this.f2576g.set(cos - f4, sin - f4, cos + f4, sin + f4);
        Iterator it = this.f2573c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f2564I - f3) > 0.001f) {
                clockFaceView.f2564I = f3;
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
        float f2 = width;
        float a2 = a(this.f2580m);
        float cos = (((float) Math.cos(this.f2578k)) * a2) + f2;
        float f3 = height;
        float sin = (a2 * ((float) Math.sin(this.f2578k))) + f3;
        Paint paint = this.f2575f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f2574d, paint);
        double sin2 = Math.sin(this.f2578k);
        paint.setStrokeWidth(this.f2577h);
        canvas.drawLine(f2, f3, width + ((int) (Math.cos(this.f2578k) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f2, f3, this.e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (this.f2571a.isRunning()) {
            return;
        }
        b(this.i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked == 0) {
            this.j = false;
            z2 = true;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z3 = this.j;
            if (this.f2572b) {
                this.f2580m = ((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y2 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z2 = false;
        } else {
            z3 = false;
            z2 = false;
        }
        boolean z5 = this.j;
        int degrees = (int) Math.toDegrees(Math.atan2(y2 - (getHeight() / 2), x2 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f2 = i;
        boolean z6 = this.i != f2;
        if (!z2 || !z6) {
            if (z6 || z3) {
                b(f2);
            }
            this.j = z5 | z4;
            return true;
        }
        z4 = true;
        this.j = z5 | z4;
        return true;
    }
}
