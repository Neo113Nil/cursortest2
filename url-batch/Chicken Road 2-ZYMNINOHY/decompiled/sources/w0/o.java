package w0;

import T.C0089g;
import T.C0096n;
import T.C0097o;
import W.AbstractC0108a;
import W.C0115h;
import W.J;
import a.AbstractC0124a;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import io.appmetrica.analytics.impl.ap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import v2.I;
import v2.a0;
import z2.EnumC1582a;

/* loaded from: classes.dex */
public final class o implements InterfaceC1493H {

    /* renamed from: a, reason: collision with root package name */
    public I f15872a;

    /* renamed from: b, reason: collision with root package name */
    public C0097o f15873b;

    /* renamed from: c, reason: collision with root package name */
    public long f15874c;

    /* renamed from: d, reason: collision with root package name */
    public long f15875d;

    /* renamed from: e, reason: collision with root package name */
    public int f15876e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f15877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f15878g;

    public o(s sVar, Context context) {
        this.f15878g = sVar;
        J.I(context);
        v2.G g4 = I.f15571b;
        this.f15872a = a0.f15605e;
        this.f15875d = -9223372036854775807L;
        this.f15877f = s.f15880r;
    }

    @Override // w0.InterfaceC1493H
    public final Surface a() {
        AbstractC0124a.t(false);
        throw null;
    }

    @Override // w0.InterfaceC1493H
    public final boolean b() {
        return false;
    }

    @Override // w0.InterfaceC1493H
    public final void c() {
        s sVar = this.f15878g;
        if (sVar.f15884d) {
            sVar.f15885e.c();
        }
    }

    @Override // w0.InterfaceC1493H
    public final void d() {
        s sVar = this.f15878g;
        if (sVar.f15884d) {
            sVar.f15885e.d();
        }
    }

    @Override // w0.InterfaceC1493H
    public final void e(Surface surface, W.v vVar) {
        s sVar = this.f15878g;
        Pair pair = sVar.f15892l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((W.v) sVar.f15892l.second).equals(vVar)) {
            return;
        }
        sVar.f15892l = Pair.create(surface, vVar);
        int i4 = vVar.f3355a;
    }

    @Override // w0.InterfaceC1493H
    public final void f(long j4) {
        this.f15874c = j4;
    }

    @Override // w0.InterfaceC1493H
    public final void g(C0097o c0097o, long j4, int i4, List list) {
        AbstractC0124a.t(false);
        this.f15872a = I.k(list);
        this.f15873b = c0097o;
        this.f15878g.f15894p = false;
        C0096n a3 = c0097o.a();
        C0089g c0089g = c0097o.f2844D;
        if (c0089g == null || !c0089g.d()) {
            c0089g = C0089g.f2784h;
        }
        a3.f2808C = c0089g;
        a3.a();
        throw null;
    }

    @Override // w0.InterfaceC1493H
    public final void h() {
        long j4 = this.f15875d;
        s sVar = this.f15878g;
        if (sVar.o >= j4) {
            sVar.f15885e.h();
            sVar.f15894p = true;
        }
    }

    @Override // w0.InterfaceC1493H
    public final void i(int i4) {
        this.f15878g.f15885e.i(i4);
    }

    @Override // w0.InterfaceC1493H
    public final void j(float f4) {
        s sVar = this.f15878g;
        sVar.f15889i.c(f4);
        sVar.f15885e.j(f4);
    }

    @Override // w0.InterfaceC1493H
    public final void k() {
        int i4 = W.v.f3354c.f3355a;
        this.f15878g.f15892l = null;
    }

    @Override // w0.InterfaceC1493H
    public final void l(boolean z) {
        this.f15875d = -9223372036854775807L;
        s sVar = this.f15878g;
        C1496c c1496c = sVar.f15885e;
        if (sVar.n == 1) {
            sVar.f15893m++;
            c1496c.l(z);
            while (sVar.f15890j.f() > 1) {
                sVar.f15890j.c();
            }
            if (sVar.f15890j.f() == 1) {
                ((r) sVar.f15890j.c()).getClass();
                throw null;
            }
            sVar.o = -9223372036854775807L;
            if (z) {
                sVar.f15894p = false;
            }
            W.F f4 = sVar.f15891k;
            f4.getClass();
            f4.c(new ap(7, sVar));
        }
    }

    @Override // w0.InterfaceC1493H
    public final void m(List list) {
        if (this.f15872a.equals(list)) {
            return;
        }
        this.f15872a = I.k(list);
        C0097o c0097o = this.f15873b;
        if (c0097o == null) {
            return;
        }
        C0096n a3 = c0097o.a();
        C0089g c0089g = c0097o.f2844D;
        if (c0089g == null || !c0089g.d()) {
            c0089g = C0089g.f2784h;
        }
        a3.f2808C = c0089g;
        a3.a();
        throw null;
    }

    @Override // w0.InterfaceC1493H
    public final void n(t tVar) {
        this.f15878g.f15885e.f15784j = tVar;
    }

    @Override // w0.InterfaceC1493H
    public final void o(long j4, long j5) {
        this.f15878g.f15885e.o(j4 + this.f15874c, j5);
    }

    @Override // w0.InterfaceC1493H
    public final void p(C1500g c1500g) {
        this.f15877f = EnumC1582a.f16288a;
    }

    @Override // w0.InterfaceC1493H
    public final boolean q(long j4, C1501h c1501h) {
        int i4;
        AbstractC0124a.t(false);
        long j5 = j4 + this.f15874c;
        s sVar = this.f15878g;
        v vVar = sVar.f15889i;
        long j6 = vVar.f15909a == -9223372036854775807L ? -9223372036854775807L : (long) (((j5 - r2) * vVar.f15911c) + vVar.f15910b);
        if (j6 != -9223372036854775807L) {
            long j7 = sVar.f15888h;
            if (j7 != -9223372036854775807L && j6 < j7 && (i4 = this.f15876e) < 2) {
                this.f15876e = i4 + 1;
                k kVar = c1501h.f15801c;
                j0.l lVar = c1501h.f15799a;
                int i5 = c1501h.f15800b;
                Trace.beginSection("dropVideoBuffer");
                lVar.f(i5);
                Trace.endSection();
                kVar.R0(0, 1);
                return true;
            }
        }
        int i6 = sVar.f15895q;
        if (i6 == -1 || i6 != 0) {
            return false;
        }
        throw null;
    }

    @Override // w0.InterfaceC1493H
    public final void r(boolean z) {
        s sVar = this.f15878g;
        if (sVar.f15884d) {
            sVar.f15885e.r(z);
        }
    }

    @Override // w0.InterfaceC1493H
    public final void release() {
        s sVar = this.f15878g;
        if (sVar.n == 2) {
            return;
        }
        W.F f4 = sVar.f15891k;
        if (f4 != null) {
            f4.f3257a.removeCallbacksAndMessages(null);
        }
        sVar.f15892l = null;
        sVar.n = 2;
    }

    @Override // w0.InterfaceC1493H
    public final boolean s(boolean z) {
        return this.f15878g.f15885e.f15775a.b(false);
    }

    @Override // w0.InterfaceC1493H
    public final boolean u(C0097o c0097o) {
        boolean z = true;
        AbstractC0124a.t(!false);
        s sVar = this.f15878g;
        AbstractC0124a.t(sVar.n == 0);
        C0089g c0089g = c0097o.f2844D;
        if (c0089g == null || !c0089g.d()) {
            c0089g = C0089g.f2784h;
        }
        int i4 = c0089g.f2787c;
        if (i4 == 7) {
            try {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 34 && i5 >= 33 && AbstractC0108a.l("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    W.D d4 = sVar.f15886f;
                    Looper myLooper = Looper.myLooper();
                    myLooper.getClass();
                    sVar.f15891k = d4.a(myLooper, null);
                    sVar.f15882b.a();
                    throw null;
                }
            } catch (C0115h e4) {
                throw new C1492G(e4, c0097o);
            }
        }
        if (i4 == 6) {
            if (Build.VERSION.SDK_INT < 33 || !AbstractC0108a.l("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z = false;
            }
        } else if (i4 == 7) {
            z = AbstractC0108a.l("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            AbstractC0108a.s("PlaybackVidGraphWrapper", "Color transfer " + i4 + " is not supported. Falling back to OpenGl tone mapping.");
            C0089g c0089g2 = C0089g.f2784h;
            W.D d42 = sVar.f15886f;
            Looper myLooper2 = Looper.myLooper();
            myLooper2.getClass();
            sVar.f15891k = d42.a(myLooper2, null);
            sVar.f15882b.a();
            throw null;
        }
        if (i4 == 2 || i4 == 10) {
            C0089g c0089g3 = C0089g.f2784h;
        }
        W.D d422 = sVar.f15886f;
        Looper myLooper22 = Looper.myLooper();
        myLooper22.getClass();
        sVar.f15891k = d422.a(myLooper22, null);
        sVar.f15882b.a();
        throw null;
    }

    @Override // w0.InterfaceC1493H
    public final boolean v() {
        return false;
    }

    @Override // w0.InterfaceC1493H
    public final void w() {
        s sVar = this.f15878g;
        if (sVar.f15890j.f() == 0) {
            sVar.f15885e.w();
            return;
        }
        S0.g gVar = new S0.g();
        if (sVar.f15890j.f() <= 0) {
            sVar.f15890j = gVar;
        } else {
            ((r) sVar.f15890j.c()).getClass();
            throw null;
        }
    }

    @Override // w0.InterfaceC1493H
    public final void t() {
    }
}
