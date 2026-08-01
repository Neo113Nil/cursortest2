package com.google.android.material.timepicker;

import K.S;
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
import com.neonpulse.gridlogic.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o0.AbstractC0277a;
import p0.AbstractC0280a;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator f1944a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1945b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1946c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1947e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f1948f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f1949g;
    public final int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1950j;

    /* renamed from: k, reason: collision with root package name */
    public double f1951k;

    /* renamed from: l, reason: collision with root package name */
    public int f1952l;

    /* renamed from: m, reason: collision with root package name */
    public int f1953m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f1944a = new ValueAnimator();
        this.f1946c = new ArrayList();
        Paint paint = new Paint();
        this.f1948f = paint;
        this.f1949g = new RectF();
        this.f1953m = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0277a.f3243e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        x1.d.Z(context, R.attr.motionDurationLong2, 200);
        x1.d.a0(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0280a.f3287b);
        this.f1952l = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f1947e = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = S.f422a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.f1952l * 0.66f) : this.f1952l;
    }

    public final void b(float f2) {
        ValueAnimator valueAnimator = this.f1944a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f3 = f2 % 360.0f;
        this.i = f3;
        this.f1951k = Math.toRadians(f3 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a2 = a(this.f1953m);
        float cos = (((float) Math.cos(this.f1951k)) * a2) + width;
        float sin = (a2 * ((float) Math.sin(this.f1951k))) + height;
        float f4 = this.d;
        this.f1949g.set(cos - f4, sin - f4, cos + f4, sin + f4);
        Iterator it = this.f1946c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f1937I - f3) > 0.001f) {
                clockFaceView.f1937I = f3;
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
        float a2 = a(this.f1953m);
        float cos = (((float) Math.cos(this.f1951k)) * a2) + f2;
        float f3 = height;
        float sin = (a2 * ((float) Math.sin(this.f1951k))) + f3;
        Paint paint = this.f1948f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.d, paint);
        double sin2 = Math.sin(this.f1951k);
        paint.setStrokeWidth(this.h);
        canvas.drawLine(f2, f3, width + ((int) (Math.cos(this.f1951k) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f2, f3, this.f1947e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (this.f1944a.isRunning()) {
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
            this.f1950j = false;
            z2 = true;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z3 = this.f1950j;
            if (this.f1945b) {
                this.f1953m = ((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y2 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z2 = false;
        } else {
            z3 = false;
            z2 = false;
        }
        boolean z5 = this.f1950j;
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
            this.f1950j = z5 | z4;
            return true;
        }
        z4 = true;
        this.f1950j = z5 | z4;
        return true;
    }
}
