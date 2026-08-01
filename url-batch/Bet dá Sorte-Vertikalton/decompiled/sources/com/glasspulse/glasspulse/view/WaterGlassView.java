package com.glasspulse.glasspulse.view;

import A.b;
import a1.InterfaceC0058a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import b1.d;
import com.glasspulse.glasspulse.R;
import java.util.ArrayList;
import java.util.Iterator;
import r0.C0277a;
import u1.l;

/* loaded from: classes.dex */
public final class WaterGlassView extends View implements Choreographer.FrameCallback {

    /* renamed from: A, reason: collision with root package name */
    public float f1618A;

    /* renamed from: B, reason: collision with root package name */
    public float f1619B;

    /* renamed from: C, reason: collision with root package name */
    public float f1620C;

    /* renamed from: D, reason: collision with root package name */
    public float f1621D;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC0058a f1622E;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f1623a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1624b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f1625c;
    public final Paint d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f1626e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f1627f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f1628g;
    public final Paint h;
    public final Path i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f1629j;

    /* renamed from: k, reason: collision with root package name */
    public final Path f1630k;

    /* renamed from: l, reason: collision with root package name */
    public final Path f1631l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f1632m;

    /* renamed from: n, reason: collision with root package name */
    public float f1633n;

    /* renamed from: o, reason: collision with root package name */
    public float f1634o;

    /* renamed from: p, reason: collision with root package name */
    public float f1635p;

    /* renamed from: q, reason: collision with root package name */
    public long f1636q;

    /* renamed from: r, reason: collision with root package name */
    public float f1637r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1638s;

    /* renamed from: t, reason: collision with root package name */
    public float f1639t;

    /* renamed from: u, reason: collision with root package name */
    public String f1640u;

    /* renamed from: v, reason: collision with root package name */
    public float f1641v;

    /* renamed from: w, reason: collision with root package name */
    public float f1642w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f1643x;

    /* renamed from: y, reason: collision with root package name */
    public float f1644y;

    /* renamed from: z, reason: collision with root package name */
    public float f1645z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaterGlassView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        d.e(context, "context");
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(4.0f);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f1623a = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(3.0f);
        this.f1624b = paint2;
        Paint paint3 = new Paint(1);
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        this.f1625c = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style2);
        this.d = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(style);
        paint5.setStrokeWidth(2.0f);
        this.f1626e = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStyle(style2);
        this.f1627f = paint6;
        Paint paint7 = new Paint(1);
        paint7.setStyle(style);
        paint7.setStrokeWidth(2.0f);
        this.f1628g = paint7;
        Paint paint8 = new Paint(1);
        paint8.setStyle(style2);
        paint8.setTextAlign(Paint.Align.CENTER);
        paint8.setTextSize(44.0f);
        paint8.setFakeBoldText(true);
        this.h = paint8;
        this.i = new Path();
        this.f1629j = new Path();
        this.f1630k = new Path();
        this.f1631l = new Path();
        this.f1632m = new RectF();
        this.f1637r = 1.0f;
        this.f1640u = "";
        this.f1643x = new ArrayList(6);
        paint.setColor(b.a(context, R.color.neon_cyan));
        paint2.setColor(b.a(context, R.color.glass_stroke));
        paint3.setColor(b.a(context, R.color.water_fill));
        paint4.setColor(b.a(context, R.color.water_pour));
        paint5.setColor(b.a(context, R.color.splash_cyan));
        paint6.setColor(b.a(context, R.color.water_fill_solid));
        paint7.setColor(b.a(context, R.color.glass_stroke));
        paint8.setColor(b.a(context, R.color.neon_cyan));
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        if (this.f1636q == 0) {
            this.f1636q = j2;
        }
        float l2 = l.l((j2 - this.f1636q) / 1.0E9f, 0.05f);
        this.f1636q = j2;
        float f2 = this.f1633n - this.f1634o;
        if (Math.abs(f2) < 0.002f) {
            this.f1634o = this.f1633n;
        } else {
            this.f1634o = (Math.min(1.0f, 8.0f * l2) * f2) + this.f1634o;
        }
        if (this.f1638s) {
            float f3 = (2.8f * l2) + this.f1637r;
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            this.f1637r = f3;
            if (f3 >= 1.0f) {
                this.f1638s = false;
                this.f1639t = 1.0f;
            }
        }
        float f4 = this.f1639t;
        if (f4 > 0.0f) {
            float f5 = f4 - (2.4f * l2);
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            this.f1639t = f5;
        }
        float f6 = this.f1641v;
        if (f6 > 0.0f) {
            float f7 = f6 - (1.1f * l2);
            if (f7 < 0.0f) {
                f7 = 0.0f;
            }
            this.f1641v = f7;
        }
        ArrayList arrayList = this.f1643x;
        Iterator it = arrayList.iterator();
        d.d(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            d.d(next, "next(...)");
            C0277a c0277a = (C0277a) next;
            float f8 = c0277a.f3567b - ((c0277a.d * l2) / (getHeight() >= 1 ? r8 : 1));
            c0277a.f3567b = f8;
            float f9 = c0277a.f3569e - (0.9f * l2);
            c0277a.f3569e = f9;
            if (f9 <= 0.0f || f8 < this.f1634o * 0.5f) {
                it.remove();
            }
        }
        this.f1635p = (l2 * 2.2f) + this.f1635p;
        invalidate();
        boolean z2 = Math.abs(this.f1633n - this.f1634o) >= 0.002f;
        boolean z3 = this.f1638s || this.f1639t > 0.01f || this.f1641v > 0.01f || !arrayList.isEmpty();
        if (z2 || this.f1634o > 0.01f || z3) {
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Choreographer.getInstance().removeFrameCallback(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        d.e(canvas, "canvas");
        float width = getWidth();
        float height = getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        this.f1644y = 8.0f;
        this.f1645z = height - 8.0f;
        this.f1618A = 0.18f * width;
        this.f1619B = 0.82f * width;
        this.f1620C = 0.28f * width;
        this.f1621D = 0.72f * width;
        this.f1642w = -20.0f;
        Path path = this.i;
        path.reset();
        path.moveTo(this.f1618A, this.f1644y);
        path.lineTo(this.f1619B, this.f1644y);
        path.lineTo(this.f1621D, this.f1645z);
        float f2 = width * 0.5f;
        float f3 = this.f1645z;
        path.quadTo(f2, f3 + 6.0f, this.f1620C, f3);
        path.close();
        Path path2 = this.f1631l;
        path2.reset();
        path2.set(path);
        if (this.f1638s || this.f1637r < 1.0f) {
            float f4 = this.f1644y;
            float f5 = f4 - 42.0f;
            float l2 = (l.l(this.f1637r, 1.0f) * (this.f1645z - f4) * this.f1634o) + f4;
            if (l2 > f5 + 4.0f) {
                Path path3 = this.f1630k;
                path3.reset();
                path3.moveTo(f2 - 5.0f, f5);
                path3.lineTo(f2 + 5.0f, f5);
                path3.lineTo(f2 + 2.0f, l2);
                path3.lineTo(f2 - 2.0f, l2);
                path3.close();
                canvas.drawPath(path3, this.d);
            }
        }
        float f6 = this.f1634o;
        RectF rectF = this.f1632m;
        if (f6 > 0.001f) {
            float f7 = this.f1645z;
            float f8 = this.f1644y;
            float f9 = f7 - f8;
            float f10 = f7 - (f6 * f9);
            float f11 = f10 - f8;
            if (f9 < 1.0f) {
                f9 = 1.0f;
            }
            float l3 = l.l(f11 / f9, 1.0f);
            float f12 = this.f1618A;
            float f13 = ((this.f1620C - f12) * l3) + f12;
            float f14 = this.f1619B;
            float f15 = ((this.f1621D - f14) * l3) + f14;
            Float valueOf = Float.valueOf(f13);
            Float valueOf2 = Float.valueOf(f15);
            float floatValue = valueOf.floatValue();
            float floatValue2 = valueOf2.floatValue();
            float f16 = (this.f1639t * 4.0f) + 2.5f;
            Path path4 = this.f1629j;
            path4.reset();
            path4.moveTo(this.f1620C, this.f1645z);
            float f17 = this.f1645z;
            path4.quadTo(f2, 6.0f + f17, this.f1621D, f17);
            path4.lineTo(floatValue2, f10);
            int i = 20;
            int i2 = 20;
            while (-1 < i2) {
                path4.lineTo(((floatValue2 - floatValue) * (i2 / i)) + floatValue, (((float) Math.sin((r10 * 6.28f) + this.f1635p)) * f16) + f10);
                i2--;
                floatValue = floatValue;
                i = 20;
            }
            path4.close();
            int save = canvas.save();
            canvas.clipPath(path2);
            canvas.drawPath(path4, this.f1625c);
            ArrayList arrayList = this.f1643x;
            if (!arrayList.isEmpty()) {
                float f18 = this.f1645z;
                float f19 = f18 - ((f18 - this.f1644y) * this.f1634o);
                Iterator it = arrayList.iterator();
                d.d(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    d.d(next, "next(...)");
                    C0277a c0277a = (C0277a) next;
                    float f20 = this.f1618A;
                    float f21 = ((this.f1619B - f20) * c0277a.f3566a) + f20;
                    float f22 = this.f1645z;
                    float f23 = f22 - ((f22 - f19) * c0277a.f3567b);
                    if (f23 > f19) {
                        Paint paint = this.f1627f;
                        paint.setAlpha(l.m((int) (c0277a.f3569e * 255), 255));
                        canvas.drawCircle(f21, f23, c0277a.f3568c, paint);
                    }
                }
            }
            canvas.restoreToCount(save);
            float f24 = this.f1639t;
            if (f24 > 0.01f) {
                Paint paint2 = this.f1626e;
                paint2.setAlpha(l.m((int) (f24 * 180), 255));
                for (int i3 = 0; i3 < 3; i3++) {
                    float f25 = i3;
                    float f26 = (f25 * 10.0f) + ((1.0f - this.f1639t) * 34.0f);
                    float f27 = f25 * 2.0f;
                    rectF.set(f2 - f26, (f10 - 5.0f) - f27, f26 + f2, f10 + 5.0f + f27);
                    canvas.drawOval(rectF, paint2);
                }
            }
        }
        canvas.drawPath(path, this.f1623a);
        float f28 = this.f1618A + 4.0f;
        float f29 = this.f1644y + 10.0f;
        canvas.drawLine(f28, f29, this.f1619B - 4.0f, f29, this.f1624b);
        float f30 = this.f1644y;
        float f31 = this.f1645z - f30;
        canvas.drawLine(14.0f + this.f1618A, (0.2f * f31) + f30, 12.0f + this.f1620C, (f31 * 0.7f) + f30, this.f1628g);
        if (this.f1641v > 0.01f && this.f1640u.length() != 0) {
            Paint paint3 = this.h;
            paint3.setAlpha(l.m((int) (this.f1641v * 255), 255));
            canvas.drawText(this.f1640u, f2, this.f1642w - ((1.0f - this.f1641v) * 36.0f), paint3);
        }
        rectF.set(this.f1618A, this.f1644y, this.f1619B, this.f1645z);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d.e(motionEvent, "event");
        if (!isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                return true;
            }
            InterfaceC0058a interfaceC0058a = this.f1622E;
            if (interfaceC0058a != null) {
                interfaceC0058a.a();
            }
            super.performClick();
        }
        return true;
    }

    public final void setOnGlassTapListener(InterfaceC0058a interfaceC0058a) {
        d.e(interfaceC0058a, "listener");
        this.f1622E = interfaceC0058a;
        setClickable(true);
        setFocusable(true);
    }
}
