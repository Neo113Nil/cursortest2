package I0;

import G.C0192d;
import G.F;
import Z.AbstractC0319p;
import Z.C0311h;
import Z.K;
import Z.N;
import Z.O;
import Z.S;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import b0.AbstractC0497e;
import b0.C0499g;
import b0.C0500h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public C0311h f3360a;

    /* renamed from: b, reason: collision with root package name */
    public L0.j f3361b;

    /* renamed from: c, reason: collision with root package name */
    public int f3362c;

    /* renamed from: d, reason: collision with root package name */
    public O f3363d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0319p f3364e;

    /* renamed from: f, reason: collision with root package name */
    public F f3365f;

    /* renamed from: g, reason: collision with root package name */
    public Y.f f3366g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC0497e f3367h;

    public final C0311h a() {
        C0311h c0311h = this.f3360a;
        if (c0311h != null) {
            return c0311h;
        }
        C0311h c0311h2 = new C0311h(this);
        this.f3360a = c0311h2;
        return c0311h2;
    }

    public final void b(int i2) {
        if (K.o(i2, this.f3362c)) {
            return;
        }
        a().d(i2);
        this.f3362c = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r1 == null ? false : Y.f.a(r1.f4386a, r7)) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(AbstractC0319p abstractC0319p, long j4, float f4) {
        if (abstractC0319p == null) {
            this.f3365f = null;
            this.f3364e = null;
            this.f3366g = null;
            setShader(null);
            return;
        }
        if (abstractC0319p instanceof S) {
            d(u3.d.P(f4, ((S) abstractC0319p).f4508a));
            return;
        }
        if (abstractC0319p instanceof N) {
            if (Intrinsics.a(this.f3364e, abstractC0319p)) {
                Y.f fVar = this.f3366g;
            }
            if (j4 != 9205357640488583168L) {
                this.f3364e = abstractC0319p;
                this.f3366g = new Y.f(j4);
                this.f3365f = C0192d.D(new d(0, j4, abstractC0319p));
            }
            C0311h a4 = a();
            F f5 = this.f3365f;
            a4.h(f5 != null ? (Shader) f5.getValue() : null);
            j.b(this, f4);
        }
    }

    public final void d(long j4) {
        if (j4 != 16) {
            setColor(K.D(j4));
            this.f3365f = null;
            this.f3364e = null;
            this.f3366g = null;
            setShader(null);
        }
    }

    public final void e(AbstractC0497e abstractC0497e) {
        if (abstractC0497e == null || Intrinsics.a(this.f3367h, abstractC0497e)) {
            return;
        }
        this.f3367h = abstractC0497e;
        if (abstractC0497e.equals(C0499g.f5607a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (abstractC0497e instanceof C0500h) {
            a().l(1);
            C0500h c0500h = (C0500h) abstractC0497e;
            a().k(c0500h.f5608a);
            ((Paint) a().f4525b).setStrokeMiter(c0500h.f5609b);
            a().j(c0500h.f5611d);
            a().i(c0500h.f5610c);
            ((Paint) a().f4525b).setPathEffect(null);
        }
    }

    public final void f(O o4) {
        if (o4 == null || Intrinsics.a(this.f3363d, o4)) {
            return;
        }
        this.f3363d = o4;
        if (o4.equals(O.f4488d)) {
            clearShadowLayer();
            return;
        }
        O o5 = this.f3363d;
        float f4 = o5.f4491c;
        if (f4 == 0.0f) {
            f4 = Float.MIN_VALUE;
        }
        setShadowLayer(f4, Y.c.d(o5.f4490b), Y.c.e(this.f3363d.f4490b), K.D(this.f3363d.f4489a));
    }

    public final void g(L0.j jVar) {
        if (jVar == null || Intrinsics.a(this.f3361b, jVar)) {
            return;
        }
        this.f3361b = jVar;
        int i2 = jVar.f3513a;
        setUnderlineText((i2 | 1) == i2);
        L0.j jVar2 = this.f3361b;
        jVar2.getClass();
        int i4 = jVar2.f3513a;
        setStrikeThruText((i4 | 2) == i4);
    }
}
