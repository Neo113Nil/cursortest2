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
import com.snovikpovik.vuevnxsj.R;
import java.util.ArrayList;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f2017q = 0;

    /* renamed from: d, reason: collision with root package name */
    public final ValueAnimator f2018d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2019e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2020f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2021g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2022h;
    public final Paint i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f2023j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2024k;

    /* renamed from: l, reason: collision with root package name */
    public float f2025l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2026m;

    /* renamed from: n, reason: collision with root package name */
    public double f2027n;

    /* renamed from: o, reason: collision with root package name */
    public int f2028o;

    /* renamed from: p, reason: collision with root package name */
    public int f2029p;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f2018d = valueAnimator;
        this.f2020f = new ArrayList();
        Paint paint = new Paint();
        this.i = paint;
        this.f2023j = new RectF();
        this.f2029p = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5.a.f2740e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        r.Q(context, R.attr.motionDurationLong2, 200);
        r.R(context, R.attr.motionEasingEmphasizedInterpolator, g5.a.f3032b);
        this.f2028o = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2021g = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f2024k = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f2022h = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
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
                int i = ClockHandView.f2017q;
                ClockHandView.this.c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new e());
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.f2028o * 0.66f) : this.f2028o;
    }

    public final void b(float f6) {
        this.f2018d.cancel();
        c(f6);
    }

    public final void c(float f6) {
        float f8 = f6 % 360.0f;
        this.f2025l = f8;
        this.f2027n = Math.toRadians(f8 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a8 = a(this.f2029p);
        float cos = (((float) Math.cos(this.f2027n)) * a8) + width;
        float sin = (a8 * ((float) Math.sin(this.f2027n))) + height;
        float f9 = this.f2021g;
        this.f2023j.set(cos - f9, sin - f9, cos + f9, sin + f9);
        ArrayList arrayList = this.f2020f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ClockFaceView clockFaceView = (ClockFaceView) ((f) obj);
            if (Math.abs(clockFaceView.J - f8) > 0.001f) {
                clockFaceView.J = f8;
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
        float a8 = a(this.f2029p);
        float cos = (((float) Math.cos(this.f2027n)) * a8) + f6;
        float f8 = height;
        float sin = (a8 * ((float) Math.sin(this.f2027n))) + f8;
        Paint paint = this.i;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f2021g, paint);
        double sin2 = Math.sin(this.f2027n);
        paint.setStrokeWidth(this.f2024k);
        canvas.drawLine(f6, f8, width + ((int) (Math.cos(this.f2027n) * r2)), height + ((int) (r2 * sin2)), paint);
        canvas.drawCircle(f6, f8, this.f2022h, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        super.onLayout(z3, i, i8, i9, i10);
        if (this.f2018d.isRunning()) {
            return;
        }
        b(this.f2025l);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z7;
        int actionMasked = motionEvent.getActionMasked();
        float x7 = motionEvent.getX();
        float y7 = motionEvent.getY();
        boolean z8 = false;
        if (actionMasked == 0) {
            this.f2026m = false;
            z3 = true;
            z7 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z7 = this.f2026m;
            if (this.f2019e) {
                this.f2029p = ((float) Math.hypot((double) (x7 - ((float) (getWidth() / 2))), (double) (y7 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z3 = false;
        } else {
            z7 = false;
            z3 = false;
        }
        boolean z9 = this.f2026m;
        int degrees = (int) Math.toDegrees(Math.atan2(y7 - (getHeight() / 2), x7 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f6 = i;
        boolean z10 = this.f2025l != f6;
        if (!z3 || !z10) {
            if (z10 || z7) {
                b(f6);
            }
            this.f2026m = z9 | z8;
            return true;
        }
        z8 = true;
        this.f2026m = z9 | z8;
        return true;
    }
}
