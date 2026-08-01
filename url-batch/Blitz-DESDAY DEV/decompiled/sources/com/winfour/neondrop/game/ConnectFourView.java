package com.winfour.neondrop.game;

import D.j;
import U0.b;
import U0.c;
import U0.g;
import X0.s;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import com.winfour.neondrop.R;
import f1.InterfaceC0099a;
import g1.d;
import h0.a0;
import java.util.List;

/* loaded from: classes.dex */
public final class ConnectFourView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final j f2082a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2083b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f2084c;
    public final Paint d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f2085e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f2086f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f2087g;
    public final Paint h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public b f2088j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2089k;

    /* renamed from: l, reason: collision with root package name */
    public List f2090l;

    /* renamed from: m, reason: collision with root package name */
    public int f2091m;

    /* renamed from: n, reason: collision with root package name */
    public int f2092n;

    /* renamed from: o, reason: collision with root package name */
    public g f2093o;

    /* renamed from: p, reason: collision with root package name */
    public float f2094p;

    /* renamed from: q, reason: collision with root package name */
    public float f2095q;

    /* renamed from: r, reason: collision with root package name */
    public float f2096r;

    /* renamed from: s, reason: collision with root package name */
    public final long f2097s;

    /* renamed from: t, reason: collision with root package name */
    public long f2098t;

    /* renamed from: u, reason: collision with root package name */
    public float f2099u;

    /* renamed from: v, reason: collision with root package name */
    public final c f2100v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectFourView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        d.e(context, "context");
        this.f2082a = new j(4);
        Paint paint = new Paint(1);
        this.f2083b = paint;
        Paint paint2 = new Paint(1);
        this.f2084c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        Paint paint4 = new Paint(1);
        this.f2085e = paint4;
        Paint paint5 = new Paint(1);
        this.f2086f = paint5;
        Paint paint6 = new Paint(1);
        this.f2087g = paint6;
        Paint paint7 = new Paint(1);
        this.h = paint7;
        this.i = new RectF();
        this.f2089k = true;
        this.f2090l = s.f992a;
        this.f2091m = -1;
        this.f2092n = -1;
        this.f2093o = g.f873a;
        this.f2096r = 1.0f;
        this.f2097s = 260L;
        this.f2100v = new c(this);
        paint.setColor(C.b.a(context, R.color.board_bg));
        paint2.setColor(C.b.a(context, R.color.grid_line));
        paint2.setStrokeWidth(2.0f);
        paint3.setColor(C.b.a(context, R.color.piece_player));
        paint4.setColor(C.b.a(context, R.color.piece_player_glow));
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        paint4.setStrokeWidth(4.0f);
        paint5.setColor(C.b.a(context, R.color.piece_ai));
        paint6.setColor(C.b.a(context, R.color.piece_ai_glow));
        paint6.setStyle(style);
        paint6.setStrokeWidth(4.0f);
        paint7.setColor(C.b.a(context, R.color.win_highlight));
        paint7.setStyle(style);
        paint7.setStrokeWidth(5.0f);
    }

    public final void a(int i, int i2, g gVar, InterfaceC0099a interfaceC0099a) {
        this.f2091m = i2;
        this.f2092n = i;
        this.f2093o = gVar;
        this.f2096r = 0.0f;
        this.f2098t = System.currentTimeMillis();
        this.f2089k = false;
        float width = getWidth() * 0.04f * 2;
        float width2 = getWidth() - width;
        float height = getHeight() - width;
        float f2 = 6;
        float min = Math.min(width2 / 7, height / f2);
        float height2 = (getHeight() - (f2 * min)) / 2.0f;
        getWidth();
        this.f2094p = height2 - min;
        this.f2095q = (this.f2092n * min) + height2;
        this.f2088j = new A1.j(this, this.f2088j, interfaceC0099a, 2);
        Choreographer.getInstance().postFrameCallback(this.f2100v);
        invalidate();
    }

    public final void b(Canvas canvas, float f2, float f3, float f4, g gVar, boolean z2) {
        float f5 = f4 / 2.0f;
        float f6 = f2 + f5;
        float f7 = f3 + f5;
        float f8 = f4 * 0.38f;
        int ordinal = gVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                canvas.drawCircle(f6, f7, 2.0f + f8, this.f2085e);
                canvas.drawCircle(f6, f7, f8, this.d);
            } else {
                if (ordinal != 2) {
                    throw new W0.b();
                }
                canvas.drawCircle(f6, f7, 2.0f + f8, this.f2087g);
                canvas.drawCircle(f6, f7, f8, this.f2086f);
            }
        }
        if (z2) {
            canvas.drawCircle(f6, f7, f8 + 6.0f, this.h);
        }
    }

    public final void c() {
        j jVar = this.f2082a;
        jVar.getClass();
        int i = 0;
        while (true) {
            g gVar = g.f873a;
            if (i >= 6) {
                jVar.f134c = g.f874b;
                this.f2090l = s.f992a;
                this.f2091m = -1;
                this.f2092n = -1;
                this.f2093o = gVar;
                this.f2096r = 1.0f;
                this.f2089k = true;
                invalidate();
                return;
            }
            for (int i2 = 0; i2 < 7; i2++) {
                ((g[][]) jVar.f133b)[i][i2] = gVar;
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        g gVar;
        int i;
        int i2;
        boolean z2;
        d.e(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth() * 0.04f * 2;
        float width2 = getWidth() - width;
        float height = getHeight() - width;
        int i3 = 7;
        float f2 = 7;
        float f3 = 6;
        float min = Math.min(width2 / f2, height / f3);
        float f4 = f2 * min;
        float f5 = f3 * min;
        float width3 = (getWidth() - f4) / 2.0f;
        float height2 = (getHeight() - f5) / 2.0f;
        RectF rectF = this.i;
        float f6 = width3 + f4;
        float f7 = height2 + f5;
        rectF.set(width3 - 8.0f, height2 - 8.0f, f6 + 8.0f, f7 + 8.0f);
        canvas.drawRoundRect(rectF, 16.0f, 16.0f, this.f2083b);
        int i4 = 0;
        while (true) {
            paint = this.f2084c;
            if (i4 >= 8) {
                break;
            }
            float f8 = (i4 * min) + width3;
            canvas.drawLine(f8, height2, f8, f7, paint);
            i4++;
        }
        for (int i5 = 0; i5 < 7; i5++) {
            float f9 = (i5 * min) + height2;
            canvas.drawLine(width3, f9, f6, f9, paint);
        }
        int i6 = 0;
        while (i6 < 6) {
            int i7 = 0;
            while (i7 < i3) {
                g gVar2 = ((g[][]) this.f2082a.f133b)[i6][i7];
                if (gVar2 == g.f873a || (this.f2091m == i7 && this.f2092n == i6 && this.f2096r < 1.0f)) {
                    i = i7;
                    i2 = i6;
                } else {
                    float f10 = (i7 * min) + width3;
                    float f11 = (i6 * min) + height2;
                    List<W0.c> list = this.f2090l;
                    if (list == null || !list.isEmpty()) {
                        for (W0.c cVar : list) {
                            if (((Number) cVar.f950a).intValue() == i6 && ((Number) cVar.f951b).intValue() == i7) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    i = i7;
                    i2 = i6;
                    b(canvas, f10, f11, min, gVar2, z2);
                }
                i7 = i + 1;
                i6 = i2;
                i3 = 7;
            }
            i6++;
            i3 = 7;
        }
        float f12 = this.f2096r;
        if (f12 < 1.0f && (gVar = this.f2093o) != g.f873a) {
            float f13 = this.f2094p;
            float f14 = 1.0f - f12;
            b(canvas, (this.f2091m * min) + width3, ((1.0f - (f14 * f14)) * (this.f2095q - f13)) + f13, min, gVar, false);
        }
        if (this.f2090l.isEmpty()) {
            return;
        }
        double sin = Math.sin(this.f2099u * 3.141592653589793d * 2) * 80;
        Paint paint2 = this.h;
        paint2.setAlpha((int) (sin + 120));
        for (W0.c cVar2 : this.f2090l) {
            float f15 = min / 2.0f;
            canvas.drawCircle((((Number) cVar2.f951b).intValue() * min) + width3 + f15, (((Number) cVar2.f950a).intValue() * min) + height2 + f15, (0.38f * min) + 6.0f, paint2);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        d.e(motionEvent, "event");
        if (this.f2089k && this.f2096r >= 1.0f && motionEvent.getAction() == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float width = getWidth() * 0.04f * 2;
            float width2 = getWidth() - width;
            float height = getHeight() - width;
            float f2 = 7;
            float f3 = 6;
            float min = Math.min(width2 / f2, height / f3);
            float f4 = f2 * min;
            float f5 = f3 * min;
            float width3 = (getWidth() - f4) / 2.0f;
            float height2 = (getHeight() - f5) / 2.0f;
            Integer valueOf = (x2 < width3 || x2 > f4 + width3 || y2 < height2 || y2 > height2 + f5) ? null : Integer.valueOf(a0.e((int) ((x2 - width3) / min), 0, 6));
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                j jVar = this.f2082a;
                if (((g[][]) jVar.f133b)[0][intValue] == g.f873a && ((g) jVar.f134c) == g.f874b && (bVar = this.f2088j) != null) {
                    bVar.e(valueOf.intValue());
                }
            }
        }
        return true;
    }

    public final void setInputEnabled(boolean z2) {
        this.f2089k = z2;
    }

    public final void setListener(b bVar) {
        this.f2088j = bVar;
    }
}
