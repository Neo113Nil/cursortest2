package q;

import java.util.List;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0945F;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import z2.C1412P;

/* renamed from: q.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1038q implements InterfaceC0945F {

    /* renamed from: a, reason: collision with root package name */
    public final S.g f9325a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9326b;

    public C1038q(S.g gVar, boolean z4) {
        this.f9325a = gVar;
        this.f9326b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1038q)) {
            return false;
        }
        C1038q c1038q = (C1038q) obj;
        return this.f9325a.equals(c1038q.f9325a) && this.f9326b == c1038q.f9326b;
    }

    @Override // p0.InterfaceC0945F
    public final InterfaceC0946G f(InterfaceC0947H interfaceC0947H, List list, long j4) {
        InterfaceC0946G t4;
        InterfaceC0946G t5;
        InterfaceC0946G t6;
        if (list.isEmpty()) {
            t6 = interfaceC0947H.t(M0.a.k(j4), M0.a.j(j4), C1412P.c(), C1033l.f9275i);
            return t6;
        }
        long b4 = this.f9326b ? j4 : M0.a.b(j4, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            InterfaceC0944E interfaceC0944E = (InterfaceC0944E) list.get(0);
            boolean z4 = interfaceC0944E.r() instanceof C1032k;
            AbstractC0954O a4 = interfaceC0944E.a(b4);
            int max = Math.max(M0.a.k(j4), a4.f9005d);
            int max2 = Math.max(M0.a.j(j4), a4.f9006e);
            t5 = interfaceC0947H.t(max, max2, C1412P.c(), new C1036o(a4, interfaceC0944E, interfaceC0947H, max, max2, this));
            return t5;
        }
        AbstractC0954O[] abstractC0954OArr = new AbstractC0954O[list.size()];
        M2.C c4 = new M2.C();
        c4.f3578d = M0.a.k(j4);
        M2.C c5 = new M2.C();
        c5.f3578d = M0.a.j(j4);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC0944E interfaceC0944E2 = (InterfaceC0944E) list.get(i2);
            boolean z5 = interfaceC0944E2.r() instanceof C1032k;
            AbstractC0954O a5 = interfaceC0944E2.a(b4);
            abstractC0954OArr[i2] = a5;
            c4.f3578d = Math.max(c4.f3578d, a5.f9005d);
            c5.f3578d = Math.max(c5.f3578d, a5.f9006e);
        }
        t4 = interfaceC0947H.t(c4.f3578d, c5.f3578d, C1412P.c(), new C1037p(abstractC0954OArr, list, interfaceC0947H, c4, c5, this));
        return t4;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9326b) + (this.f9325a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f9325a + ", propagateMinConstraints=" + this.f9326b + ')';
    }
}
