package r;

import F.C0093f;
import java.io.Serializable;
import java.util.List;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0885G;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import r0.InterfaceC0916m;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0885G, InterfaceC0852N {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0859f f7988a;

    /* renamed from: b, reason: collision with root package name */
    public final U.h f7989b;

    public Q(InterfaceC0859f interfaceC0859f, U.h hVar) {
        this.f7988a = interfaceC0859f;
        this.f7989b = hVar;
    }

    @Override // r0.InterfaceC0885G
    public final int a(InterfaceC0916m interfaceC0916m, List list, int i3) {
        int l3 = interfaceC0916m.l(this.f7988a.a());
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
                int min2 = Math.min(interfaceC0884F.U(Integer.MAX_VALUE), i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i3 - min);
                min += min2;
                i4 = Math.max(i4, interfaceC0884F.c(min2));
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
                i4 = Math.max(i4, interfaceC0884F2.c(round != Integer.MAX_VALUE ? Math.round(round * c3) : Integer.MAX_VALUE));
            }
        }
        return i4;
    }

    @Override // r0.InterfaceC0885G
    public final int b(InterfaceC0916m interfaceC0916m, List list, int i3) {
        int l3 = interfaceC0916m.l(this.f7988a.a());
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
                int min2 = Math.min(interfaceC0884F.U(Integer.MAX_VALUE), i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i3 - min);
                min += min2;
                i4 = Math.max(i4, interfaceC0884F.V(min2));
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
                i4 = Math.max(i4, interfaceC0884F2.V(round != Integer.MAX_VALUE ? Math.round(round * c3) : Integer.MAX_VALUE));
            }
        }
        return i4;
    }

    @Override // r.InterfaceC0852N
    public final int c(AbstractC0893O abstractC0893O) {
        return abstractC0893O.f8126d;
    }

    @Override // r.InterfaceC0852N
    public final void d(int i3, InterfaceC0887I interfaceC0887I, int[] iArr, int[] iArr2) {
        this.f7988a.b(interfaceC0887I, i3, iArr, interfaceC0887I.getLayoutDirection(), iArr2);
    }

    @Override // r0.InterfaceC0885G
    public final int e(InterfaceC0916m interfaceC0916m, List list, int i3) {
        int l3 = interfaceC0916m.l(this.f7988a.a());
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
            int O3 = interfaceC0884F.O(i3);
            if (c2 == 0.0f) {
                i5 += O3;
            } else if (c2 > 0.0f) {
                f3 += c2;
                i4 = Math.max(i4, Math.round(O3 / c2));
            }
        }
        return ((list.size() - 1) * l3) + Math.round(i4 * f3) + i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q3 = (Q) obj;
        return f2.j.a(this.f7988a, q3.f7988a) && f2.j.a(this.f7989b, q3.f7989b);
    }

    @Override // r0.InterfaceC0885G
    public final InterfaceC0886H f(InterfaceC0887I interfaceC0887I, List list, long j3) {
        return AbstractC0856c.d(this, O0.a.j(j3), O0.a.i(j3), O0.a.h(j3), O0.a.g(j3), interfaceC0887I.l(this.f7988a.a()), interfaceC0887I, list, new AbstractC0893O[list.size()], list.size());
    }

    @Override // r.InterfaceC0852N
    public final int g(AbstractC0893O abstractC0893O) {
        return abstractC0893O.f8127e;
    }

    @Override // r0.InterfaceC0885G
    public final int h(InterfaceC0916m interfaceC0916m, List list, int i3) {
        int l3 = interfaceC0916m.l(this.f7988a.a());
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
            int U3 = interfaceC0884F.U(i3);
            if (c2 == 0.0f) {
                i5 += U3;
            } else if (c2 > 0.0f) {
                f3 += c2;
                i4 = Math.max(i4, Math.round(U3 / c2));
            }
        }
        return ((list.size() - 1) * l3) + Math.round(i4 * f3) + i5;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7989b.f4480a) + (this.f7988a.hashCode() * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r.InterfaceC0852N
    public final InterfaceC0886H i(AbstractC0893O[] abstractC0893OArr, InterfaceC0887I interfaceC0887I, int[] iArr, int i3, int i4) {
        return interfaceC0887I.i0(i3, i4, S1.v.f4321d, new C0093f((Object) abstractC0893OArr, (Object) this, i4, (Serializable) iArr, 4));
    }

    @Override // r.InterfaceC0852N
    public final long j(int i3, int i4, int i5, boolean z3) {
        if (!z3) {
            return O2.d.a(i3, i4, 0, i5);
        }
        int min = Math.min(i3, 262142);
        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int l3 = O2.d.l(min2 == Integer.MAX_VALUE ? min : min2);
        return O2.d.a(min, min2, Math.min(l3, 0), i5 != Integer.MAX_VALUE ? Math.min(l3, i5) : Integer.MAX_VALUE);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f7988a + ", verticalAlignment=" + this.f7989b + ')';
    }
}
