package r;

import java.util.List;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0885G;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import r0.InterfaceC0916m;

/* renamed from: r.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0873u implements InterfaceC0885G, InterfaceC0852N {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0862i f8089a;

    public C0873u(InterfaceC0862i interfaceC0862i) {
        this.f8089a = interfaceC0862i;
    }

    @Override // r0.InterfaceC0885G
    public final int a(InterfaceC0916m interfaceC0916m, List list, int i3) {
        int l3 = interfaceC0916m.l(this.f8089a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        float f3 = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            InterfaceC0884F interfaceC0884F = (InterfaceC0884F) list.get(i6);
            float c2 = AbstractC0856c.c(AbstractC0856c.b(interfaceC0884F));
            int c3 = interfaceC0884F.c(i3);
            if (c2 == 0.0f) {
                i5 += c3;
            } else if (c2 > 0.0f) {
                f3 += c2;
                i4 = Math.max(i4, Math.round(c3 / c2));
            }
        }
        return ((list.size() - 1) * l3) + Math.round(i4 * f3) + i5;
    }

    @Override // r0.InterfaceC0885G
    public final int b(InterfaceC0916m interfaceC0916m, List list, int i3) {
        int l3 = interfaceC0916m.l(this.f8089a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        float f3 = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            InterfaceC0884F interfaceC0884F = (InterfaceC0884F) list.get(i6);
            float c2 = AbstractC0856c.c(AbstractC0856c.b(interfaceC0884F));
            int V2 = interfaceC0884F.V(i3);
            if (c2 == 0.0f) {
                i5 += V2;
            } else if (c2 > 0.0f) {
                f3 += c2;
                i4 = Math.max(i4, Math.round(V2 / c2));
            }
        }
        return ((list.size() - 1) * l3) + Math.round(i4 * f3) + i5;
    }

    @Override // r.InterfaceC0852N
    public final int c(AbstractC0893O abstractC0893O) {
        return abstractC0893O.f8127e;
    }

    @Override // r.InterfaceC0852N
    public final void d(int i3, InterfaceC0887I interfaceC0887I, int[] iArr, int[] iArr2) {
        this.f8089a.c(i3, interfaceC0887I, iArr, iArr2);
    }

    @Override // r0.InterfaceC0885G
    public final int e(InterfaceC0916m interfaceC0916m, List list, int i3) {
        int l3 = interfaceC0916m.l(this.f8089a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * l3, i3);
        int size = list.size();
        int i4 = 0;
        float f3 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            InterfaceC0884F interfaceC0884F = (InterfaceC0884F) list.get(i5);
            float c2 = AbstractC0856c.c(AbstractC0856c.b(interfaceC0884F));
            if (c2 == 0.0f) {
                int min2 = Math.min(interfaceC0884F.c(Integer.MAX_VALUE), i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i3 - min);
                min += min2;
                i4 = Math.max(i4, interfaceC0884F.O(min2));
            } else if (c2 > 0.0f) {
                f3 += c2;
            }
        }
        int round = f3 == 0.0f ? 0 : i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i3 - min, 0) / f3);
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            InterfaceC0884F interfaceC0884F2 = (InterfaceC0884F) list.get(i6);
            float c3 = AbstractC0856c.c(AbstractC0856c.b(interfaceC0884F2));
            if (c3 > 0.0f) {
                i4 = Math.max(i4, interfaceC0884F2.O(round != Integer.MAX_VALUE ? Math.round(round * c3) : Integer.MAX_VALUE));
            }
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0873u)) {
            return false;
        }
        if (!this.f8089a.equals(((C0873u) obj).f8089a)) {
            return false;
        }
        U.g gVar = U.b.f4473p;
        return gVar.equals(gVar);
    }

    @Override // r0.InterfaceC0885G
    public final InterfaceC0886H f(InterfaceC0887I interfaceC0887I, List list, long j3) {
        return AbstractC0856c.d(this, O0.a.i(j3), O0.a.j(j3), O0.a.g(j3), O0.a.h(j3), interfaceC0887I.l(this.f8089a.a()), interfaceC0887I, list, new AbstractC0893O[list.size()], list.size());
    }

    @Override // r.InterfaceC0852N
    public final int g(AbstractC0893O abstractC0893O) {
        return abstractC0893O.f8126d;
    }

    @Override // r0.InterfaceC0885G
    public final int h(InterfaceC0916m interfaceC0916m, List list, int i3) {
        int l3 = interfaceC0916m.l(this.f8089a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * l3, i3);
        int size = list.size();
        int i4 = 0;
        float f3 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            InterfaceC0884F interfaceC0884F = (InterfaceC0884F) list.get(i5);
            float c2 = AbstractC0856c.c(AbstractC0856c.b(interfaceC0884F));
            if (c2 == 0.0f) {
                int min2 = Math.min(interfaceC0884F.c(Integer.MAX_VALUE), i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i3 - min);
                min += min2;
                i4 = Math.max(i4, interfaceC0884F.U(min2));
            } else if (c2 > 0.0f) {
                f3 += c2;
            }
        }
        int round = f3 == 0.0f ? 0 : i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i3 - min, 0) / f3);
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            InterfaceC0884F interfaceC0884F2 = (InterfaceC0884F) list.get(i6);
            float c3 = AbstractC0856c.c(AbstractC0856c.b(interfaceC0884F2));
            if (c3 > 0.0f) {
                i4 = Math.max(i4, interfaceC0884F2.U(round != Integer.MAX_VALUE ? Math.round(round * c3) : Integer.MAX_VALUE));
            }
        }
        return i4;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (this.f8089a.hashCode() * 31);
    }

    @Override // r.InterfaceC0852N
    public final InterfaceC0886H i(AbstractC0893O[] abstractC0893OArr, InterfaceC0887I interfaceC0887I, int[] iArr, int i3, int i4) {
        return interfaceC0887I.i0(i4, i3, S1.v.f4321d, new C0872t(abstractC0893OArr, this, i4, interfaceC0887I, iArr));
    }

    @Override // r.InterfaceC0852N
    public final long j(int i3, int i4, int i5, boolean z3) {
        if (!z3) {
            return O2.d.a(0, i5, i3, i4);
        }
        int min = Math.min(i3, 262142);
        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int l3 = O2.d.l(min2 == Integer.MAX_VALUE ? min : min2);
        return O2.d.a(Math.min(l3, 0), i5 != Integer.MAX_VALUE ? Math.min(l3, i5) : Integer.MAX_VALUE, min, min2);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f8089a + ", horizontalAlignment=" + U.b.f4473p + ')';
    }
}
