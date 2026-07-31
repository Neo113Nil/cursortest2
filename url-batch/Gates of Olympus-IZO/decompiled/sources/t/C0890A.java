package t;

import n.X;
import o.J;
import r0.B;
import u.C0930L;
import u.InterfaceC0927I;

/* renamed from: t.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0890A implements InterfaceC0927I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f7570a;

    public C0890A(y yVar) {
        this.f7570a = yVar;
    }

    @Override // u.InterfaceC0927I
    public final int a() {
        long e3;
        y yVar = this.f7570a;
        if (yVar.g().f7639k == J.f6443d) {
            B b2 = yVar.g().f7642n;
            e3 = I2.l.e(b2.f(), b2.h()) & 4294967295L;
        } else {
            B b3 = yVar.g().f7642n;
            e3 = I2.l.e(b3.f(), b3.h()) >> 32;
        }
        return (int) e3;
    }

    @Override // u.InterfaceC0927I
    public final float b() {
        y yVar = this.f7570a;
        return (yVar.f7689b.f7452b.g() * 500) + yVar.f7689b.f7453c.g();
    }

    @Override // u.InterfaceC0927I
    public final int c() {
        y yVar = this.f7570a;
        return (-yVar.g().f7636h) + yVar.g().f7640l;
    }

    @Override // u.InterfaceC0927I
    public final z0.b d() {
        return new z0.b(-1, -1);
    }

    @Override // u.InterfaceC0927I
    public final float e() {
        y yVar = this.f7570a;
        int g3 = yVar.f7689b.f7452b.g();
        int g4 = yVar.f7689b.f7453c.g();
        return yVar.a() ? (g3 * 500) + g4 + 100 : (g3 * 500) + g4;
    }

    @Override // u.InterfaceC0927I
    public final Object f(int i3, C0930L c0930l) {
        C2.c cVar = y.f7687t;
        y yVar = this.f7570a;
        yVar.getClass();
        Object e3 = yVar.e(X.f6036d, new w(yVar, i3, 0, null), c0930l);
        Q1.a aVar = Q1.a.f3113d;
        L1.z zVar = L1.z.f2729a;
        if (e3 != aVar) {
            e3 = zVar;
        }
        return e3 == aVar ? e3 : zVar;
    }
}
