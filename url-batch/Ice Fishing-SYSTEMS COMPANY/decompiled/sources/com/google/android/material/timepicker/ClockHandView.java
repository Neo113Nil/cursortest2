package com.google.android.material.timepicker;

import O.X;
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
import com.icefishing.icefishingliveapp.C5284R;
import i3.AbstractC4576a;
import j3.AbstractC4596a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
class ClockHandView extends View {

    /* renamed from: A, reason: collision with root package name */
    public final int f36323A;

    /* renamed from: B, reason: collision with root package name */
    public float f36324B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f36325C;

    /* renamed from: D, reason: collision with root package name */
    public double f36326D;

    /* renamed from: E, reason: collision with root package name */
    public int f36327E;

    /* renamed from: F, reason: collision with root package name */
    public int f36328F;

    /* renamed from: n, reason: collision with root package name */
    public final ValueAnimator f36329n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f36330u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f36331v;

    /* renamed from: w, reason: collision with root package name */
    public final int f36332w;

    /* renamed from: x, reason: collision with root package name */
    public final float f36333x;

    /* renamed from: y, reason: collision with root package name */
    public final Paint f36334y;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f36335z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.materialClockStyle);
        this.f36329n = new ValueAnimator();
        this.f36331v = new ArrayList();
        Paint paint = new Paint();
        this.f36334y = paint;
        this.f36335z = new RectF();
        this.f36328F = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4576a.f38296e, C5284R.attr.materialClockStyle, C5284R.style.Widget_MaterialComponents_TimePicker_Clock);
        K3.b.y(context, C5284R.attr.motionDurationLong2, 200);
        K3.b.z(context, C5284R.attr.motionEasingEmphasizedInterpolator, AbstractC4596a.f38542b);
        this.f36327E = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f36332w = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f36323A = getResources().getDimensionPixelSize(C5284R.dimen.material_clock_hand_stroke_width);
        this.f36333x = r4.getDimensionPixelSize(C5284R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = X.f2240a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.f36327E * 0.66f) : this.f36327E;
    }

    public final void b(float f6) {
        ValueAnimator valueAnimator = this.f36329n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f9 = f6 % 360.0f;
        this.f36324B = f9;
        this.f36326D = Math.toRadians(f9 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a9 = a(this.f36328F);
        float cos = (((float) Math.cos(this.f36326D)) * a9) + width;
        float sin = (a9 * ((float) Math.sin(this.f36326D))) + height;
        float f10 = this.f36332w;
        this.f36335z.set(cos - f10, sin - f10, cos + f10, sin + f10);
        Iterator it = this.f36331v.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f36321p0 - f9) > 0.001f) {
                clockFaceView.f36321p0 = f9;
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
        float f6 = width;
        float a9 = a(this.f36328F);
        float cos = (((float) Math.cos(this.f36326D)) * a9) + f6;
        float f9 = height;
        float sin = (a9 * ((float) Math.sin(this.f36326D))) + f9;
        Paint paint = this.f36334y;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f36332w, paint);
        double sin2 = Math.sin(this.f36326D);
        paint.setStrokeWidth(this.f36323A);
        canvas.drawLine(f6, f9, width + ((int) (Math.cos(this.f36326D) * r2)), height + ((int) (r2 * sin2)), paint);
        canvas.drawCircle(f6, f9, this.f36333x, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
        if (this.f36329n.isRunning()) {
            return;
        }
        b(this.f36324B);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        float x3 = motionEvent.getX();
        float y6 = motionEvent.getY();
        boolean z10 = false;
        if (actionMasked == 0) {
            this.f36325C = false;
            z8 = true;
            z9 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z9 = this.f36325C;
            if (this.f36330u) {
                this.f36328F = ((float) Math.hypot((double) (x3 - ((float) (getWidth() / 2))), (double) (y6 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z8 = false;
        } else {
            z9 = false;
            z8 = false;
        }
        boolean z11 = this.f36325C;
        int degrees = (int) Math.toDegrees(Math.atan2(y6 - (getHeight() / 2), x3 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f6 = i;
        boolean z12 = this.f36324B != f6;
        if (!z8 || !z12) {
            if (z12 || z9) {
                b(f6);
            }
            this.f36325C = z11 | z10;
            return true;
        }
        z10 = true;
        this.f36325C = z11 | z10;
        return true;
    }
}
