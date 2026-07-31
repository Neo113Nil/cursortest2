package r;

import java.util.List;
import r0.InterfaceC0827A;

/* loaded from: classes.dex */
public final class r implements InterfaceC0827A {

    /* renamed from: a, reason: collision with root package name */
    public final U.d f7091a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7092b;

    public r(U.d dVar, boolean z3) {
        this.f7091a = dVar;
        this.f7092b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f7091a.equals(rVar.f7091a) && this.f7092b == rVar.f7092b;
    }

    @Override // r0.InterfaceC0827A
    public final r0.B f(t0.O o3, List list, long j3) {
        boolean isEmpty = list.isEmpty();
        M1.v vVar = M1.v.f2804d;
        if (isEmpty) {
            return o3.Y(M0.a.j(j3), M0.a.i(j3), vVar, C0816m.f7070g);
        }
        long a3 = this.f7092b ? j3 : M0.a.a(j3, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            r0.z zVar = (r0.z) list.get(0);
            boolean z3 = zVar.r() instanceof C0815l;
            r0.H b2 = zVar.b(a3);
            int max = Math.max(M0.a.j(j3), b2.f7114d);
            int max2 = Math.max(M0.a.i(j3), b2.f7115e);
            return o3.Y(max, max2, vVar, new C0819p(b2, zVar, o3, max, max2, this));
        }
        r0.H[] hArr = new r0.H[list.size()];
        Z1.r rVar = new Z1.r();
        rVar.f3478d = M0.a.j(j3);
        Z1.r rVar2 = new Z1.r();
        rVar2.f3478d = M0.a.i(j3);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            r0.z zVar2 = (r0.z) list.get(i3);
            boolean z4 = zVar2.r() instanceof C0815l;
            r0.H b3 = zVar2.b(a3);
            hArr[i3] = b3;
            rVar.f3478d = Math.max(rVar.f3478d, b3.f7114d);
            rVar2.f3478d = Math.max(rVar2.f3478d, b3.f7115e);
        }
        return o3.Y(rVar.f3478d, rVar2.f3478d, vVar, new C0820q(hArr, list, o3, rVar, rVar2, this));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7092b) + (this.f7091a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f7091a + ", propagateMinConstraints=" + this.f7092b + ')';
    }
}
