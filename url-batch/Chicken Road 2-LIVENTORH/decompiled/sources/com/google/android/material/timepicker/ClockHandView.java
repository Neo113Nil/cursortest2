package com.google.android.material.timepicker;

import a.y;
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
import com.oriondriftchasers.arordrft.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f1058s = 0;

    /* renamed from: f, reason: collision with root package name */
    public final ValueAnimator f1059f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1060g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1061h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1062j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f1063k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f1064l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1065m;

    /* renamed from: n, reason: collision with root package name */
    public float f1066n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1067o;

    /* renamed from: p, reason: collision with root package name */
    public double f1068p;

    /* renamed from: q, reason: collision with root package name */
    public int f1069q;

    /* renamed from: r, reason: collision with root package name */
    public int f1070r;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f1059f = valueAnimator;
        this.f1061h = new ArrayList();
        Paint paint = new Paint();
        this.f1063k = paint;
        this.f1064l = new RectF();
        this.f1070r = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.f2815g, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        y.R(context, R.attr.motionDurationLong2, 200);
        y.S(context, R.attr.motionEasingEmphasizedInterpolator, o1.a.f2865b);
        this.f1069q = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f1065m = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f1062j = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
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
                int i = ClockHandView.f1058s;
                ClockHandView.this.c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new e());
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.f1069q * 0.66f) : this.f1069q;
    }

    public final void b(float f2) {
        this.f1059f.cancel();
        c(f2);
    }

    public final void c(float f2) {
        float f4 = f2 % 360.0f;
        this.f1066n = f4;
        this.f1068p = Math.toRadians(f4 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a2 = a(this.f1070r);
        float cos = (((float) Math.cos(this.f1068p)) * a2) + width;
        float sin = (a2 * ((float) Math.sin(this.f1068p))) + height;
        float f5 = this.i;
        this.f1064l.set(cos - f5, sin - f5, cos + f5, sin + f5);
        ArrayList arrayList = this.f1061h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ClockFaceView clockFaceView = (ClockFaceView) ((f) obj);
            if (Math.abs(clockFaceView.L - f4) > 0.001f) {
                clockFaceView.L = f4;
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
        float a2 = a(this.f1070r);
        float cos = (((float) Math.cos(this.f1068p)) * a2) + f2;
        float f4 = height;
        float sin = (a2 * ((float) Math.sin(this.f1068p))) + f4;
        Paint paint = this.f1063k;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.i, paint);
        double sin2 = Math.sin(this.f1068p);
        paint.setStrokeWidth(this.f1065m);
        canvas.drawLine(f2, f4, width + ((int) (Math.cos(this.f1068p) * r2)), height + ((int) (r2 * sin2)), paint);
        canvas.drawCircle(f2, f4, this.f1062j, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        if (this.f1059f.isRunning()) {
            return;
        }
        b(this.f1066n);
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
            this.f1067o = false;
            z3 = true;
            z4 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z4 = this.f1067o;
            if (this.f1060g) {
                this.f1070r = ((float) Math.hypot((double) (x3 - ((float) (getWidth() / 2))), (double) (y3 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z3 = false;
        } else {
            z4 = false;
            z3 = false;
        }
        boolean z6 = this.f1067o;
        int degrees = (int) Math.toDegrees(Math.atan2(y3 - (getHeight() / 2), x3 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f2 = i;
        boolean z7 = this.f1066n != f2;
        if (!z3 || !z7) {
            if (z7 || z4) {
                b(f2);
            }
            this.f1067o = z6 | z5;
            return true;
        }
        z5 = true;
        this.f1067o = z6 | z5;
        return true;
    }
}
