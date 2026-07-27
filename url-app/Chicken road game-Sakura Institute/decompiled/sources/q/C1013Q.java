package q;

import D.C0174u0;
import G.C0192d;
import G.C0205j0;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import p0.InterfaceC0982r;
import q0.C1055h;
import q0.InterfaceC1050c;
import q0.InterfaceC1053f;
import q0.InterfaceC1054g;
import z2.C1412P;

/* renamed from: q.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1013Q implements InterfaceC0982r, InterfaceC1050c, InterfaceC1053f {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f9208a;

    /* renamed from: b, reason: collision with root package name */
    public final C0205j0 f9209b;

    /* renamed from: c, reason: collision with root package name */
    public final C0205j0 f9210c;

    public C1013Q(m0 m0Var) {
        this.f9208a = m0Var;
        G.W w4 = G.W.f2779l;
        this.f9209b = C0192d.K(m0Var, w4);
        this.f9210c = C0192d.K(m0Var, w4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1013Q) {
            return Intrinsics.a(((C1013Q) obj).f9208a, this.f9208a);
        }
        return false;
    }

    @Override // q0.InterfaceC1053f
    public final C1055h getKey() {
        return q0.f9327a;
    }

    @Override // q0.InterfaceC1053f
    public final Object getValue() {
        return (m0) this.f9210c.getValue();
    }

    public final int hashCode() {
        return this.f9208a.hashCode();
    }

    @Override // p0.InterfaceC0982r
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        InterfaceC0946G t4;
        C0205j0 c0205j0 = this.f9209b;
        int d4 = ((m0) c0205j0.getValue()).d(interfaceC0947H, interfaceC0947H.getLayoutDirection());
        int a4 = ((m0) c0205j0.getValue()).a(interfaceC0947H);
        int b4 = ((m0) c0205j0.getValue()).b(interfaceC0947H, interfaceC0947H.getLayoutDirection()) + d4;
        int c4 = ((m0) c0205j0.getValue()).c(interfaceC0947H) + a4;
        AbstractC0954O a5 = interfaceC0944E.a(u3.d.Q(-b4, -c4, j4));
        t4 = interfaceC0947H.t(u3.d.s(j4, a5.f9005d + b4), u3.d.r(j4, a5.f9006e + c4), C1412P.c(), new C0174u0(a5, d4, a4, 2));
        return t4;
    }

    @Override // q0.InterfaceC1050c
    public final void k(InterfaceC1054g interfaceC1054g) {
        m0 m0Var = (m0) interfaceC1054g.g(q0.f9327a);
        m0 m0Var2 = this.f9208a;
        this.f9209b.setValue(new C1046y(m0Var2, m0Var));
        this.f9210c.setValue(new j0(m0Var, m0Var2));
    }
}
