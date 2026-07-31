package n2;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import f1.b0;
import f1.h0;
import f1.k0;
import f1.p;
import f1.s;
import m0.e0;
import q2.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public f1.h f5319a;

    /* renamed from: b, reason: collision with root package name */
    public l f5320b;

    /* renamed from: c, reason: collision with root package name */
    public int f5321c;

    /* renamed from: d, reason: collision with root package name */
    public h0 f5322d;

    /* renamed from: e, reason: collision with root package name */
    public s f5323e;

    /* renamed from: f, reason: collision with root package name */
    public p f5324f;

    /* renamed from: g, reason: collision with root package name */
    public e0 f5325g;

    /* renamed from: h, reason: collision with root package name */
    public e1.e f5326h;
    public h1.c i;

    public final f1.h a() {
        f1.h hVar = this.f5319a;
        if (hVar != null) {
            return hVar;
        }
        f1.h hVar2 = new f1.h(this);
        this.f5319a = hVar2;
        return hVar2;
    }

    public final void b(int i) {
        if (i == this.f5321c) {
            return;
        }
        a().d(i);
        this.f5321c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r1 == null ? false : e1.e.a(r1.f2469a, r7)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final p pVar, final long j7, float f6) {
        if (pVar == null) {
            this.f5325g = null;
            this.f5324f = null;
            this.f5326h = null;
            setShader(null);
            return;
        }
        if (pVar instanceof k0) {
            d(h0.a.O(((k0) pVar).f2682e, f6));
            return;
        }
        if (!(pVar instanceof b0)) {
            throw new a5.c();
        }
        if (q6.i.a(this.f5324f, pVar)) {
            e1.e eVar = this.f5326h;
        }
        if (j7 != 9205357640488583168L) {
            this.f5324f = pVar;
            this.f5326h = new e1.e(j7);
            this.f5325g = m0.b.n(new p6.a() { // from class: n2.d
                @Override // p6.a
                public final Object b() {
                    return ((b0) p.this).B(j7);
                }
            });
        }
        f1.h a8 = a();
        e0 e0Var = this.f5325g;
        a8.g(e0Var != null ? (Shader) e0Var.getValue() : null);
        this.f5323e = null;
        j.a(this, f6);
    }

    public final void d(long j7) {
        s sVar = this.f5323e;
        if (sVar == null ? false : s.c(sVar.f2705a, j7)) {
            return;
        }
        if (j7 != 16) {
            this.f5323e = new s(j7);
            setColor(p.u(j7));
            this.f5325g = null;
            this.f5324f = null;
            this.f5326h = null;
            setShader(null);
        }
    }

    public final void e(h1.c cVar) {
        if (cVar == null || q6.i.a(this.i, cVar)) {
            return;
        }
        this.i = cVar;
        if (cVar.equals(h1.f.f3080b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(cVar instanceof h1.g)) {
            throw new a5.c();
        }
        a().j(1);
        f1.h a8 = a();
        h1.g gVar = (h1.g) cVar;
        ((Paint) a8.f2660b).setStrokeWidth(gVar.f3081b);
        f1.h a9 = a();
        ((Paint) a9.f2660b).setStrokeMiter(gVar.f3082c);
        a().i(gVar.f3084e);
        a().h(gVar.f3083d);
        ((Paint) a().f2660b).setPathEffect(null);
    }

    public final void f(h0 h0Var) {
        if (h0Var == null || q6.i.a(this.f5322d, h0Var)) {
            return;
        }
        this.f5322d = h0Var;
        if (h0Var.equals(h0.f2663d)) {
            clearShadowLayer();
            return;
        }
        h0 h0Var2 = this.f5322d;
        float f6 = h0Var2.f2666c;
        if (f6 == 0.0f) {
            f6 = Float.MIN_VALUE;
        }
        setShadowLayer(f6, Float.intBitsToFloat((int) (h0Var2.f2665b >> 32)), Float.intBitsToFloat((int) (this.f5322d.f2665b & 4294967295L)), p.u(this.f5322d.f2664a));
    }

    public final void g(l lVar) {
        if (lVar == null || q6.i.a(this.f5320b, lVar)) {
            return;
        }
        this.f5320b = lVar;
        int i = lVar.f6058a;
        setUnderlineText((i | 1) == i);
        int i8 = this.f5320b.f6058a;
        setStrikeThruText((i8 | 2) == i8);
    }
}
