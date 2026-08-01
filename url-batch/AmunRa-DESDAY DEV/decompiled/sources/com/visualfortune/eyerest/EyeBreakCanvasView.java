package com.visualfortune.eyerest;

import O0.b;
import O0.c;
import O0.i;
import O0.o;
import Z0.d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import b1.e;
import java.util.List;
import s1.l;

/* loaded from: classes.dex */
public final class EyeBreakCanvasView extends View implements Choreographer.FrameCallback {

    /* renamed from: A, reason: collision with root package name */
    public final Paint f1896A;

    /* renamed from: B, reason: collision with root package name */
    public final Paint f1897B;

    /* renamed from: C, reason: collision with root package name */
    public final Paint f1898C;

    /* renamed from: D, reason: collision with root package name */
    public final Path f1899D;

    /* renamed from: a, reason: collision with root package name */
    public c f1900a;

    /* renamed from: b, reason: collision with root package name */
    public i f1901b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1902c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public float f1903e;

    /* renamed from: f, reason: collision with root package name */
    public int f1904f;

    /* renamed from: g, reason: collision with root package name */
    public b f1905g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public int f1906j;

    /* renamed from: k, reason: collision with root package name */
    public float f1907k;

    /* renamed from: l, reason: collision with root package name */
    public int f1908l;

    /* renamed from: m, reason: collision with root package name */
    public final Path f1909m;

    /* renamed from: n, reason: collision with root package name */
    public final PathMeasure f1910n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f1911o;

    /* renamed from: p, reason: collision with root package name */
    public final RectF f1912p;

    /* renamed from: q, reason: collision with root package name */
    public final RectF[] f1913q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f1914r;

    /* renamed from: s, reason: collision with root package name */
    public final Paint f1915s;

    /* renamed from: t, reason: collision with root package name */
    public final Paint f1916t;

    /* renamed from: u, reason: collision with root package name */
    public final Paint f1917u;

    /* renamed from: v, reason: collision with root package name */
    public final Paint f1918v;

    /* renamed from: w, reason: collision with root package name */
    public final Paint f1919w;

    /* renamed from: x, reason: collision with root package name */
    public final Paint f1920x;

    /* renamed from: y, reason: collision with root package name */
    public final Paint f1921y;

    /* renamed from: z, reason: collision with root package name */
    public final Paint f1922z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EyeBreakCanvasView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        d.e(context, "context");
        List list = o.f637a;
        this.f1901b = (i) list.get(l.o(0, 0, R0.i.k0(list)));
        this.f1905g = b.f605a;
        this.f1909m = new Path();
        this.f1910n = new PathMeasure();
        this.f1911o = new float[2];
        this.f1912p = new RectF();
        RectF[] rectFArr = new RectF[4];
        for (int i = 0; i < 4; i++) {
            rectFArr[i] = new RectF();
        }
        this.f1913q = rectFArr;
        Paint paint = new Paint(1);
        paint.setColor(-15921894);
        this.f1914r = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(587202559);
        paint2.setStrokeWidth(1.5f);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f1915s = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(-16718337);
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setShadowLayer(18.0f, 0.0f, 0.0f, -16718337);
        this.f1916t = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(1711334911);
        paint4.setStyle(style);
        paint4.setStrokeWidth(3.0f);
        this.f1917u = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(-12976364);
        paint5.setStyle(style);
        paint5.setStrokeWidth(3.0f);
        this.f1918v = paint5;
        Paint paint6 = new Paint(1);
        paint6.setColor(-65366);
        paint6.setStyle(style);
        paint6.setStrokeWidth(8.0f);
        this.f1919w = paint6;
        Paint paint7 = new Paint(1);
        paint7.setColor(-16718337);
        paint7.setStyle(style);
        paint7.setStrokeWidth(6.0f);
        paint7.setShadowLayer(12.0f, 0.0f, 0.0f, -16718337);
        this.f1920x = paint7;
        Paint paint8 = new Paint(1);
        paint8.setColor(-65366);
        paint8.setStyle(style);
        paint8.setStrokeWidth(4.0f);
        paint8.setShadowLayer(10.0f, 0.0f, 0.0f, -65366);
        this.f1921y = paint8;
        Paint paint9 = new Paint(1);
        paint9.setColor(-16718337);
        paint9.setStyle(style2);
        paint9.setShadowLayer(12.0f, 0.0f, 0.0f, -16718337);
        this.f1922z = paint9;
        Paint paint10 = new Paint(1);
        paint10.setColor(872415231);
        paint10.setStyle(style2);
        this.f1896A = paint10;
        Paint paint11 = new Paint(1);
        paint11.setColor(1426122239);
        paint11.setStyle(style2);
        this.f1897B = paint11;
        Paint paint12 = new Paint(1);
        paint12.setColor(-1513240);
        paint12.setTextAlign(Paint.Align.CENTER);
        paint12.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        paint12.setTextSize(36.0f);
        this.f1898C = paint12;
        this.f1899D = new Path();
        setLayerType(1, null);
    }

    public final void a() {
        this.f1904f++;
        c cVar = this.f1900a;
        if (cVar != null) {
            SessionActivity sessionActivity = (SessionActivity) cVar;
            if (!sessionActivity.f1940C) {
                sessionActivity.f1943G++;
                sessionActivity.v();
            }
        }
        if (this.f1904f >= this.f1901b.f627g.size()) {
            this.f1904f = 0;
        }
        d();
    }

    public final void b() {
        float min = Math.min(getWidth(), getHeight()) * 0.18f;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RectF[] rectFArr = this.f1913q;
        float f2 = min / 2.0f;
        float f3 = height - f2;
        float f4 = height + f2;
        rectFArr[0].set(24.0f, f3, min + 24.0f, f4);
        rectFArr[1].set((getWidth() - 24.0f) - min, f3, getWidth() - 24.0f, f4);
        float f5 = width - f2;
        float f6 = width + f2;
        rectFArr[2].set(f5, 144.0f, f6, 144.0f + min);
        rectFArr[3].set(f5, (getHeight() - 24.0f) - min, f6, getHeight() - 24.0f);
    }

    public final void c() {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        e.f1541a.getClass();
        this.f1908l = e.f1542b.a().nextInt(3);
        Path path = this.f1909m;
        path.reset();
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = Math.min(getWidth(), getHeight()) * 0.28f;
        int i = this.f1908l;
        RectF rectF = this.f1912p;
        if (i == 0) {
            path.addCircle(width, height, min, Path.Direction.CW);
            float f2 = width + min;
            rectF.set(f2 - 50.0f, height - 50.0f, f2 + 50.0f, height + 50.0f);
        } else if (i != 1) {
            float f3 = 0.6f * min;
            path.moveTo(width - min, height + f3);
            float f4 = width + min;
            float f5 = height - f3;
            path.lineTo(f4, f5);
            rectF.set(f4 - 55.0f, f5 - 45.0f, f4 + 45.0f, f5 + 45.0f);
        } else {
            path.moveTo(width - min, height);
            float f6 = width + min;
            path.lineTo(f6, height);
            rectF.set(f6 - 60.0f, height - 50.0f, f6 + 40.0f, height + 50.0f);
        }
        this.f1910n.setPath(path, false);
        c cVar = this.f1900a;
        if (cVar != null) {
            String string = getContext().getString(R.string.instruction_follow);
            d.d(string, "getString(...)");
            ((SessionActivity) cVar).u().d.setText(string);
        }
    }

    public final void d() {
        this.f1903e = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f1907k = 0.0f;
        List list = this.f1901b.f627g;
        b bVar = (b) list.get(this.f1904f % list.size());
        this.f1905g = bVar;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            c();
            return;
        }
        if (ordinal == 1) {
            c cVar = this.f1900a;
            if (cVar != null) {
                String string = getContext().getString(R.string.instruction_blink);
                d.d(string, "getString(...)");
                ((SessionActivity) cVar).u().d.setText(string);
                return;
            }
            return;
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                throw new Q0.b();
            }
            c cVar2 = this.f1900a;
            if (cVar2 != null) {
                String string2 = getContext().getString(R.string.instruction_focus);
                d.d(string2, "getString(...)");
                ((SessionActivity) cVar2).u().d.setText(string2);
                return;
            }
            return;
        }
        e.f1541a.getClass();
        this.f1906j = e.f1542b.a().nextInt(4);
        b();
        int i = this.f1906j;
        int i2 = i != 0 ? i != 1 ? i != 2 ? R.string.direction_down : R.string.direction_up : R.string.direction_right : R.string.direction_left;
        c cVar3 = this.f1900a;
        if (cVar3 != null) {
            String string3 = getContext().getString(R.string.instruction_look, getContext().getString(i2));
            d.d(string3, "getString(...)");
            ((SessionActivity) cVar3).u().d.setText(string3);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        if (this.f1902c) {
            if (this.d == 0) {
                this.d = j2;
            }
            float f2 = (j2 - this.d) / 1000000.0f;
            if (f2 > 50.0f) {
                f2 = 50.0f;
            }
            this.d = j2;
            this.f1903e += f2;
            int ordinal = this.f1905g.ordinal();
            if (ordinal == 0) {
                this.h = (f2 * 3.5E-4f * this.f1901b.f626f) + this.h;
            } else if (ordinal == 1) {
                this.i = (f2 * 0.006f) + this.i;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new Q0.b();
                }
                this.f1907k = (f2 * 0.0012f * this.f1901b.f626f) + this.f1907k;
            }
            if (this.f1903e >= this.f1901b.f625e) {
                a();
            }
            invalidate();
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final c getListener() {
        return this.f1900a;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f1902c = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        d.e(canvas, "canvas");
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f1914r);
        float f2 = 0.0f;
        while (true) {
            float width = getWidth();
            paint = this.f1915s;
            if (f2 >= width) {
                break;
            }
            canvas.drawLine(f2, 0.0f, f2, getHeight(), paint);
            f2 += 64.0f;
        }
        for (float f3 = 0.0f; f3 < getHeight(); f3 += 64.0f) {
            canvas.drawLine(0.0f, f3, getWidth(), f3, paint);
        }
        int ordinal = this.f1905g.ordinal();
        Paint paint2 = this.f1916t;
        if (ordinal == 0) {
            canvas.drawPath(this.f1909m, this.f1917u);
            canvas.drawRoundRect(this.f1912p, 16.0f, 16.0f, this.f1918v);
            PathMeasure pathMeasure = this.f1910n;
            if (pathMeasure.getLength() > 0.0f) {
                float f4 = this.h % 1.0f;
                float length = pathMeasure.getLength() * (f4 >= 0.0f ? f4 > 1.0f ? 1.0f : f4 : 0.0f);
                float[] fArr = this.f1911o;
                pathMeasure.getPosTan(length, fArr, null);
                canvas.drawCircle(fArr[0], fArr[1], 22.0f, paint2);
                return;
            }
            return;
        }
        Paint paint3 = this.f1898C;
        if (ordinal == 1) {
            float width2 = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            float min = Math.min(getWidth(), getHeight()) * 0.22f;
            float sin = (((float) Math.sin(this.i)) * 0.12f) + 1.0f;
            Paint paint4 = this.f1919w;
            paint4.setAlpha(l.o((int) ((100 * ((float) Math.sin(this.i * 1.4f))) + 140), 80, 255));
            canvas.drawCircle(width2, height, min * sin, paint4);
            canvas.drawCircle(width2, height, min * 0.45f * sin, paint2);
            paint3.setTextSize(42.0f);
            canvas.drawText("BLINK", width2, height + 12.0f, paint3);
            return;
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                throw new Q0.b();
            }
            float width3 = getWidth() / 2.0f;
            float height2 = getHeight() / 2.0f;
            float min2 = Math.min(getWidth(), getHeight()) * 0.12f;
            float min3 = Math.min(getWidth(), getHeight()) * 0.32f;
            float sin2 = (((float) Math.sin((this.f1907k * 3.141592653589793d) * 2)) + 1.0f) / 2.0f;
            float f5 = ((min3 - min2) * sin2) + min2;
            boolean z2 = sin2 < 0.5f;
            Paint paint5 = this.f1921y;
            Paint paint6 = this.f1920x;
            if (z2) {
                canvas.drawCircle(width3, height2, (((1.0f - sin2) * 0.15f) + 0.9f) * min2, paint6);
                canvas.drawCircle(width3, height2, min3, paint5);
                paint3.setTextSize(36.0f);
                canvas.drawText("NEAR", width3, height2 + 12.0f, paint3);
                return;
            }
            canvas.drawCircle(width3, height2, min2, paint6);
            canvas.drawCircle(width3, height2, f5, paint5);
            paint3.setTextSize(36.0f);
            canvas.drawText("FAR", width3, height2 + 12.0f, paint3);
            return;
        }
        RectF[] rectFArr = this.f1913q;
        int length2 = rectFArr.length;
        int i = 0;
        while (i < length2) {
            canvas.drawRoundRect(rectFArr[i], 20.0f, 20.0f, i == this.f1906j ? this.f1897B : this.f1896A);
            i++;
        }
        float width4 = getWidth() / 2.0f;
        float height3 = getHeight() / 2.0f;
        Path path = this.f1899D;
        path.reset();
        int i2 = this.f1906j;
        if (i2 == 0) {
            float f6 = width4 + 70.0f;
            path.moveTo(f6, height3 - 38.5f);
            path.lineTo(width4 - 70.0f, height3);
            path.lineTo(f6, height3 + 38.5f);
        } else if (i2 == 1) {
            float f7 = width4 - 70.0f;
            path.moveTo(f7, height3 - 38.5f);
            path.lineTo(width4 + 70.0f, height3);
            path.lineTo(f7, height3 + 38.5f);
        } else if (i2 != 2) {
            float f8 = height3 - 70.0f;
            path.moveTo(width4 - 38.5f, f8);
            path.lineTo(width4, height3 + 70.0f);
            path.lineTo(width4 + 38.5f, f8);
        } else {
            float f9 = height3 + 70.0f;
            path.moveTo(width4 - 38.5f, f9);
            path.lineTo(width4, height3 - 70.0f);
            path.lineTo(width4 + 38.5f, f9);
        }
        path.close();
        canvas.drawPath(path, this.f1922z);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f1902c) {
            int ordinal = this.f1905g.ordinal();
            if (ordinal == 0) {
                c();
            } else {
                if (ordinal != 2) {
                    return;
                }
                b();
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d.e(motionEvent, "event");
        if (!this.f1902c || motionEvent.getAction() != 0 || !this.f1902c) {
            return true;
        }
        a();
        return true;
    }

    public final void setListener(c cVar) {
        this.f1900a = cVar;
    }
}
