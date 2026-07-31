package s;

import n.X;
import o.J;
import r0.B;
import u.C0930L;
import u.InterfaceC0927I;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0861d implements InterfaceC0927I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0880w f7358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7359b;

    public C0861d(C0880w c0880w, boolean z3) {
        this.f7358a = c0880w;
        this.f7359b = z3;
    }

    @Override // u.InterfaceC0927I
    public final int a() {
        long e3;
        C0880w c0880w = this.f7358a;
        if (c0880w.g().f7431n == J.f6443d) {
            B b2 = c0880w.g().f7433q;
            e3 = I2.l.e(b2.f(), b2.h()) & 4294967295L;
        } else {
            B b3 = c0880w.g().f7433q;
            e3 = I2.l.e(b3.f(), b3.h()) >> 32;
        }
        return (int) e3;
    }

    @Override // u.InterfaceC0927I
    public final float b() {
        C0880w c0880w = this.f7358a;
        return (c0880w.f7477d.f7452b.g() * 500) + c0880w.f7477d.f7453c.g();
    }

    @Override // u.InterfaceC0927I
    public final int c() {
        C0880w c0880w = this.f7358a;
        return (-c0880w.g().f7428k) + c0880w.g().f7432o;
    }

    @Override // u.InterfaceC0927I
    public final z0.b d() {
        return this.f7359b ? new z0.b(-1, 1) : new z0.b(1, -1);
    }

    @Override // u.InterfaceC0927I
    public final float e() {
        C0880w c0880w = this.f7358a;
        int g3 = c0880w.f7477d.f7452b.g();
        int g4 = c0880w.f7477d.f7453c.g();
        return c0880w.a() ? (g3 * 500) + g4 + 100 : (g3 * 500) + g4;
    }

    @Override // u.InterfaceC0927I
    public final Object f(int i3, C0930L c0930l) {
        C2.c cVar = C0880w.f7473w;
        C0880w c0880w = this.f7358a;
        c0880w.getClass();
        Object e3 = c0880w.e(X.f6036d, new C0877t(c0880w, i3, 0, null), c0930l);
        Q1.a aVar = Q1.a.f3113d;
        L1.z zVar = L1.z.f2729a;
        if (e3 != aVar) {
            e3 = zVar;
        }
        return e3 == aVar ? e3 : zVar;
    }
}
