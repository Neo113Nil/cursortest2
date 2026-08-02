package q0;

import T.C0097o;
import T.C0104w;
import T.C0107z;
import android.net.Uri;
import android.os.Looper;
import t0.C1427b;

/* loaded from: classes.dex */
public final class W extends AbstractC1359a {

    /* renamed from: h, reason: collision with root package name */
    public final Y.g f14925h;

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.flutter.pigeon.a f14926i;

    /* renamed from: j, reason: collision with root package name */
    public final f0.i f14927j;

    /* renamed from: k, reason: collision with root package name */
    public final C1427b f14928k;

    /* renamed from: l, reason: collision with root package name */
    public final int f14929l;

    /* renamed from: m, reason: collision with root package name */
    public final C0097o f14930m;
    public boolean n = true;
    public long o = -9223372036854775807L;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14931p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14932q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14933r;

    /* renamed from: s, reason: collision with root package name */
    public Y.A f14934s;

    /* renamed from: t, reason: collision with root package name */
    public C0107z f14935t;

    public W(C0107z c0107z, Y.g gVar, io.appmetrica.analytics.flutter.pigeon.a aVar, f0.i iVar, C1427b c1427b, int i4, C0097o c0097o) {
        this.f14935t = c0107z;
        this.f14925h = gVar;
        this.f14926i = aVar;
        this.f14927j = iVar;
        this.f14928k = c1427b;
        this.f14929l = i4;
        this.f14930m = c0097o;
    }

    @Override // q0.AbstractC1359a
    public final InterfaceC1383z b(C1353B c1353b, B1.j jVar, long j4) {
        Y.h f4 = this.f14925h.f();
        Y.A a3 = this.f14934s;
        if (a3 != null) {
            f4.y(a3);
        }
        C0104w c0104w = i().f2900b;
        c0104w.getClass();
        Uri uri = c0104w.f2893a;
        this.f14951g.getClass();
        return new U(uri, f4, new B1.j((y0.q) this.f14926i.f9832b), this.f14927j, new f0.e(this.f14948d.f8493c, 0, c1353b), this.f14928k, a(c1353b), this, jVar, this.f14929l, this.f14930m, W.J.M(c0104w.f2897e), null);
    }

    @Override // q0.AbstractC1359a
    public final synchronized C0107z i() {
        return this.f14935t;
    }

    @Override // q0.AbstractC1359a
    public final void n(Y.A a3) {
        this.f14934s = a3;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        b0.i iVar = this.f14951g;
        iVar.getClass();
        f0.i iVar2 = this.f14927j;
        iVar2.c(myLooper, iVar);
        iVar2.a();
        x();
    }

    @Override // q0.AbstractC1359a
    public final void r(InterfaceC1383z interfaceC1383z) {
        U u4 = (U) interfaceC1383z;
        if (u4.f14918x) {
            for (a0 a0Var : u4.f14916u) {
                a0Var.k();
                e0.t tVar = a0Var.f14966h;
                if (tVar != null) {
                    tVar.H(a0Var.f14963e);
                    a0Var.f14966h = null;
                    a0Var.f14965g = null;
                }
            }
        }
        u4.f14909l.e(u4);
        u4.f14912q.removeCallbacksAndMessages(null);
        u4.f14913r = null;
        u4.f14897P = true;
    }

    @Override // q0.AbstractC1359a
    public final void t() {
        this.f14927j.release();
    }

    @Override // q0.AbstractC1359a
    public final synchronized void w(C0107z c0107z) {
        this.f14935t = c0107z;
    }

    public final void x() {
        T.T f0Var = new f0(this.o, this.f14931p, this.f14932q, i());
        if (this.n) {
            f0Var = new m0.s(f0Var, 1);
        }
        q(f0Var);
    }

    public final void y(long j4, y0.y yVar, boolean z) {
        if (this.f14933r && yVar.d()) {
            return;
        }
        this.f14933r = !yVar.d();
        if (j4 == -9223372036854775807L) {
            j4 = this.o;
        }
        boolean c4 = yVar.c();
        if (!this.n && this.o == j4 && this.f14931p == c4 && this.f14932q == z) {
            return;
        }
        this.o = j4;
        this.f14931p = c4;
        this.f14932q = z;
        this.n = false;
        x();
    }

    @Override // q0.AbstractC1359a
    public final void k() {
    }
}
