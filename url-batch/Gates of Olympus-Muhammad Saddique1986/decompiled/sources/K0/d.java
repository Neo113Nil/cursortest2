package K0;

import I.C0143d;
import I.F;
import O2.l;
import a0.C0238c;
import a0.C0241f;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import b0.AbstractC0347p;
import b0.C0339h;
import b0.C0348q;
import b0.M;
import b0.P;
import b0.T;
import d0.AbstractC0404e;
import d0.C0406g;
import d0.C0407h;

/* loaded from: classes.dex */
public final class d extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public C0339h f3241a;

    /* renamed from: b, reason: collision with root package name */
    public N0.j f3242b;

    /* renamed from: c, reason: collision with root package name */
    public int f3243c;

    /* renamed from: d, reason: collision with root package name */
    public P f3244d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0347p f3245e;

    /* renamed from: f, reason: collision with root package name */
    public F f3246f;

    /* renamed from: g, reason: collision with root package name */
    public C0241f f3247g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC0404e f3248h;

    public final C0339h a() {
        C0339h c0339h = this.f3241a;
        if (c0339h != null) {
            return c0339h;
        }
        C0339h c0339h2 = new C0339h(this);
        this.f3241a = c0339h2;
        return c0339h2;
    }

    public final void b(int i3) {
        if (M.p(i3, this.f3243c)) {
            return;
        }
        a().d(i3);
        this.f3243c = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r1 == null ? false : a0.C0241f.a(r1.f4736a, r7)) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(AbstractC0347p abstractC0347p, long j3, float f3) {
        if (abstractC0347p == null) {
            this.f3246f = null;
            this.f3245e = null;
            this.f3247g = null;
            setShader(null);
            return;
        }
        if (abstractC0347p instanceof T) {
            d(l.m0(((T) abstractC0347p).f5399a, f3));
            return;
        }
        if (abstractC0347p instanceof C0348q) {
            if (f2.j.a(this.f3245e, abstractC0347p)) {
                C0241f c0241f = this.f3247g;
            }
            if (j3 != 9205357640488583168L) {
                this.f3245e = abstractC0347p;
                this.f3247g = new C0241f(j3);
                this.f3246f = C0143d.D(new A.h(abstractC0347p, j3));
            }
            C0339h a3 = a();
            F f4 = this.f3246f;
            Shader shader = f4 != null ? (Shader) f4.getValue() : null;
            a3.f5416c = shader;
            ((Paint) a3.f5415b).setShader(shader);
            i.b(this, f3);
        }
    }

    public final void d(long j3) {
        if (j3 != 16) {
            setColor(M.D(j3));
            this.f3246f = null;
            this.f3245e = null;
            this.f3247g = null;
            setShader(null);
        }
    }

    public final void e(AbstractC0404e abstractC0404e) {
        if (abstractC0404e == null || f2.j.a(this.f3248h, abstractC0404e)) {
            return;
        }
        this.f3248h = abstractC0404e;
        if (abstractC0404e.equals(C0406g.f5653a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (abstractC0404e instanceof C0407h) {
            a().i(1);
            C0407h c0407h = (C0407h) abstractC0404e;
            ((Paint) a().f5415b).setStrokeWidth(c0407h.f5654a);
            ((Paint) a().f5415b).setStrokeMiter(c0407h.f5655b);
            a().h(c0407h.f5657d);
            a().g(c0407h.f5656c);
            ((Paint) a().f5415b).setPathEffect(null);
        }
    }

    public final void f(P p3) {
        if (p3 == null || f2.j.a(this.f3244d, p3)) {
            return;
        }
        this.f3244d = p3;
        if (p3.equals(P.f5380d)) {
            clearShadowLayer();
            return;
        }
        P p4 = this.f3244d;
        float f3 = p4.f5383c;
        if (f3 == 0.0f) {
            f3 = Float.MIN_VALUE;
        }
        setShadowLayer(f3, C0238c.d(p4.f5382b), C0238c.e(this.f3244d.f5382b), M.D(this.f3244d.f5381a));
    }

    public final void g(N0.j jVar) {
        if (jVar == null || f2.j.a(this.f3242b, jVar)) {
            return;
        }
        this.f3242b = jVar;
        int i3 = jVar.f3551a;
        setUnderlineText((i3 | 1) == i3);
        N0.j jVar2 = this.f3242b;
        jVar2.getClass();
        int i4 = jVar2.f3551a;
        setStrikeThruText((i4 | 2) == i4);
    }
}
