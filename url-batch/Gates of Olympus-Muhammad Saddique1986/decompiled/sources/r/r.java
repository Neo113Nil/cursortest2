package r;

import h2.AbstractC0508a;
import java.util.List;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0885G;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;

/* loaded from: classes.dex */
public final class r implements InterfaceC0885G {

    /* renamed from: a, reason: collision with root package name */
    public final U.i f8081a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8082b;

    public r(U.i iVar, boolean z3) {
        this.f8081a = iVar;
        this.f8082b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f8081a.equals(rVar.f8081a) && this.f8082b == rVar.f8082b;
    }

    @Override // r0.InterfaceC0885G
    public final InterfaceC0886H f(InterfaceC0887I interfaceC0887I, List list, long j3) {
        int j4;
        int i3;
        AbstractC0893O b3;
        boolean isEmpty = list.isEmpty();
        S1.v vVar = S1.v.f4321d;
        if (isEmpty) {
            return interfaceC0887I.i0(O0.a.j(j3), O0.a.i(j3), vVar, C0866m.f8060g);
        }
        long a3 = this.f8082b ? j3 : O0.a.a(j3, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            InterfaceC0884F interfaceC0884F = (InterfaceC0884F) list.get(0);
            Object t3 = interfaceC0884F.t();
            C0865l c0865l = t3 instanceof C0865l ? (C0865l) t3 : null;
            if (c0865l != null ? c0865l.f8058r : false) {
                j4 = O0.a.j(j3);
                i3 = O0.a.i(j3);
                int j5 = O0.a.j(j3);
                int i4 = O0.a.i(j3);
                if (!(j5 >= 0 && i4 >= 0)) {
                    AbstractC0508a.X("width(" + j5 + ") and height(" + i4 + ") must be >= 0");
                    throw null;
                }
                b3 = interfaceC0884F.b(O2.d.H(j5, j5, i4, i4));
            } else {
                b3 = interfaceC0884F.b(a3);
                j4 = Math.max(O0.a.j(j3), b3.f8126d);
                i3 = Math.max(O0.a.i(j3), b3.f8127e);
            }
            int i5 = j4;
            int i6 = i3;
            return interfaceC0887I.i0(i5, i6, vVar, new C0869p(b3, interfaceC0884F, interfaceC0887I, i5, i6, this));
        }
        AbstractC0893O[] abstractC0893OArr = new AbstractC0893O[list.size()];
        f2.s sVar = new f2.s();
        sVar.f5830d = O0.a.j(j3);
        f2.s sVar2 = new f2.s();
        sVar2.f5830d = O0.a.i(j3);
        int size = list.size();
        boolean z3 = false;
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC0884F interfaceC0884F2 = (InterfaceC0884F) list.get(i7);
            Object t4 = interfaceC0884F2.t();
            C0865l c0865l2 = t4 instanceof C0865l ? (C0865l) t4 : null;
            if (c0865l2 != null ? c0865l2.f8058r : false) {
                z3 = true;
            } else {
                AbstractC0893O b4 = interfaceC0884F2.b(a3);
                abstractC0893OArr[i7] = b4;
                sVar.f5830d = Math.max(sVar.f5830d, b4.f8126d);
                sVar2.f5830d = Math.max(sVar2.f5830d, b4.f8127e);
            }
        }
        if (z3) {
            int i8 = sVar.f5830d;
            int i9 = i8 != Integer.MAX_VALUE ? i8 : 0;
            int i10 = sVar2.f5830d;
            long a4 = O2.d.a(i9, i8, i10 != Integer.MAX_VALUE ? i10 : 0, i10);
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                InterfaceC0884F interfaceC0884F3 = (InterfaceC0884F) list.get(i11);
                Object t5 = interfaceC0884F3.t();
                C0865l c0865l3 = t5 instanceof C0865l ? (C0865l) t5 : null;
                if (c0865l3 != null ? c0865l3.f8058r : false) {
                    abstractC0893OArr[i11] = interfaceC0884F3.b(a4);
                }
            }
        }
        return interfaceC0887I.i0(sVar.f5830d, sVar2.f5830d, vVar, new C0870q(abstractC0893OArr, list, interfaceC0887I, sVar, sVar2, this));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8082b) + (this.f8081a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f8081a + ", propagateMinConstraints=" + this.f8082b + ')';
    }
}
