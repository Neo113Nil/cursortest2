package I0;

import I.C0089d;
import I.G;
import I2.l;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import b0.AbstractC0259J;
import b0.C0262M;
import b0.C0265P;
import b0.C0276i;
import b0.C0284q;
import d0.AbstractC0322c;
import d0.C0325f;
import d0.C0326g;

/* loaded from: classes.dex */
public final class e extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public C0276i f2440a;

    /* renamed from: b, reason: collision with root package name */
    public L0.g f2441b;

    /* renamed from: c, reason: collision with root package name */
    public int f2442c;

    /* renamed from: d, reason: collision with root package name */
    public C0262M f2443d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0259J f2444e;

    /* renamed from: f, reason: collision with root package name */
    public G f2445f;

    /* renamed from: g, reason: collision with root package name */
    public a0.f f2446g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC0322c f2447h;

    public final C0276i a() {
        C0276i c0276i = this.f2440a;
        if (c0276i != null) {
            return c0276i;
        }
        C0276i c0276i2 = new C0276i(this);
        this.f2440a = c0276i2;
        return c0276i2;
    }

    public final void b(int i3) {
        if (AbstractC0259J.n(i3, this.f2442c)) {
            return;
        }
        a().d(i3);
        this.f2442c = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r1 == null ? false : a0.f.a(r1.f3503a, r7)) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(AbstractC0259J abstractC0259J, long j3, float f3) {
        if (abstractC0259J == null) {
            this.f2445f = null;
            this.f2444e = null;
            this.f2446g = null;
            setShader(null);
            return;
        }
        if (abstractC0259J instanceof C0265P) {
            d(l.I(((C0265P) abstractC0259J).f4257e, f3));
            return;
        }
        if (abstractC0259J instanceof C0284q) {
            if (Z1.i.a(this.f2444e, abstractC0259J)) {
                a0.f fVar = this.f2446g;
            }
            if (j3 != 9205357640488583168L) {
                this.f2444e = abstractC0259J;
                this.f2446g = new a0.f(j3);
                this.f2445f = C0089d.D(new A2.l(abstractC0259J, j3));
            }
            C0276i a3 = a();
            G g3 = this.f2445f;
            a3.g(g3 != null ? (Shader) g3.getValue() : null);
            j.b(this, f3);
        }
    }

    public final void d(long j3) {
        if (j3 != 16) {
            setColor(AbstractC0259J.E(j3));
            this.f2445f = null;
            this.f2444e = null;
            this.f2446g = null;
            setShader(null);
        }
    }

    public final void e(AbstractC0322c abstractC0322c) {
        if (abstractC0322c == null || Z1.i.a(this.f2447h, abstractC0322c)) {
            return;
        }
        this.f2447h = abstractC0322c;
        if (abstractC0322c.equals(C0325f.f4448b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (abstractC0322c instanceof C0326g) {
            a().j(1);
            C0326g c0326g = (C0326g) abstractC0322c;
            ((Paint) a().f4273b).setStrokeWidth(c0326g.f4449b);
            ((Paint) a().f4273b).setStrokeMiter(c0326g.f4450c);
            a().i(c0326g.f4452e);
            a().h(c0326g.f4451d);
            ((Paint) a().f4273b).setPathEffect(null);
        }
    }

    public final void f(C0262M c0262m) {
        if (c0262m == null || Z1.i.a(this.f2443d, c0262m)) {
            return;
        }
        this.f2443d = c0262m;
        if (c0262m.equals(C0262M.f4239d)) {
            clearShadowLayer();
            return;
        }
        C0262M c0262m2 = this.f2443d;
        float f3 = c0262m2.f4242c;
        if (f3 == 0.0f) {
            f3 = Float.MIN_VALUE;
        }
        setShadowLayer(f3, a0.c.d(c0262m2.f4241b), a0.c.e(this.f2443d.f4241b), AbstractC0259J.E(this.f2443d.f4240a));
    }

    public final void g(L0.g gVar) {
        if (gVar == null || Z1.i.a(this.f2441b, gVar)) {
            return;
        }
        this.f2441b = gVar;
        int i3 = gVar.f2684a;
        setUnderlineText((i3 | 1) == i3);
        L0.g gVar2 = this.f2441b;
        gVar2.getClass();
        int i4 = gVar2.f2684a;
        setStrikeThruText((i4 | 2) == i4);
    }
}
