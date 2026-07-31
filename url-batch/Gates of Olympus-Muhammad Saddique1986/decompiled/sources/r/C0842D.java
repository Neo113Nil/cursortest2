package r;

import F.C0;
import I.C0143d;
import I.C0156j0;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import r0.InterfaceC0921r;
import s0.C0962h;
import s0.InterfaceC0957c;
import s0.InterfaceC0960f;
import s0.InterfaceC0961g;

/* renamed from: r.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0842D implements InterfaceC0921r, InterfaceC0957c, InterfaceC0960f {

    /* renamed from: a, reason: collision with root package name */
    public final X f7959a;

    /* renamed from: b, reason: collision with root package name */
    public final C0156j0 f7960b;

    /* renamed from: c, reason: collision with root package name */
    public final C0156j0 f7961c;

    public C0842D(X x3) {
        this.f7959a = x3;
        I.W w2 = I.W.f2783i;
        this.f7960b = C0143d.K(x3, w2);
        this.f7961c = C0143d.K(x3, w2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0842D) {
            return f2.j.a(((C0842D) obj).f7959a, this.f7959a);
        }
        return false;
    }

    @Override // r0.InterfaceC0921r
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        C0156j0 c0156j0 = this.f7960b;
        int a3 = ((X) c0156j0.getValue()).a(interfaceC0887I, interfaceC0887I.getLayoutDirection());
        int b3 = ((X) c0156j0.getValue()).b(interfaceC0887I);
        int c2 = ((X) c0156j0.getValue()).c(interfaceC0887I, interfaceC0887I.getLayoutDirection()) + a3;
        int d3 = ((X) c0156j0.getValue()).d(interfaceC0887I) + b3;
        AbstractC0893O b4 = interfaceC0884F.b(O2.d.Y(-c2, -d3, j3));
        return interfaceC0887I.i0(O2.d.D(j3, b4.f8126d + c2), O2.d.C(j3, b4.f8127e + d3), S1.v.f4321d, new C0(b4, a3, b3, 1));
    }

    @Override // s0.InterfaceC0960f
    public final C0962h getKey() {
        return a0.f8028a;
    }

    @Override // s0.InterfaceC0960f
    public final Object getValue() {
        return (X) this.f7961c.getValue();
    }

    public final int hashCode() {
        return this.f7959a.hashCode();
    }

    @Override // s0.InterfaceC0957c
    public final void j(InterfaceC0961g interfaceC0961g) {
        X x3 = (X) interfaceC0961g.i(a0.f8028a);
        X x4 = this.f7959a;
        this.f7960b.setValue(new C0877y(x4, x3));
        this.f7961c.setValue(new U(x3, x4));
    }
}
