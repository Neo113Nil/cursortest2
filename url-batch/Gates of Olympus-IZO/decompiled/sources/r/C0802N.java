package r;

import h.AbstractC0416e;
import java.util.List;
import r0.InterfaceC0827A;

/* renamed from: r.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0802N implements InterfaceC0827A, InterfaceC0799K {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0808e f7014a;

    /* renamed from: b, reason: collision with root package name */
    public final U.c f7015b;

    public C0802N(InterfaceC0808e interfaceC0808e, U.c cVar) {
        this.f7014a = interfaceC0808e;
        this.f7015b = cVar;
    }

    @Override // r.InterfaceC0799K
    public final int a(r0.H h3) {
        return h3.f7114d;
    }

    @Override // r.InterfaceC0799K
    public final void b(int i3, int[] iArr, int[] iArr2, t0.O o3) {
        this.f7014a.b(o3, i3, iArr, o3.getLayoutDirection(), iArr2);
    }

    @Override // r.InterfaceC0799K
    public final int c(r0.H h3) {
        return h3.f7115e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r.InterfaceC0799K
    public final r0.B d(r0.H[] hArr, t0.O o3, int[] iArr, int i3, int i4) {
        return o3.Y(i3, i4, M1.v.f2804d, new I.F(hArr, this, i4, iArr, 3));
    }

    @Override // r.InterfaceC0799K
    public final long e(int i3, int i4, int i5, boolean z3) {
        if (!z3) {
            return I2.l.a(i3, i4, 0, i5);
        }
        int min = Math.min(i3, 262142);
        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int h3 = I2.l.h(min2 == Integer.MAX_VALUE ? min : min2);
        return I2.l.a(min, min2, Math.min(h3, 0), i5 != Integer.MAX_VALUE ? Math.min(h3, i5) : Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0802N)) {
            return false;
        }
        C0802N c0802n = (C0802N) obj;
        return Z1.i.a(this.f7014a, c0802n.f7014a) && this.f7015b.equals(c0802n.f7015b);
    }

    @Override // r0.InterfaceC0827A
    public final r0.B f(t0.O o3, List list, long j3) {
        return AbstractC0416e.w(this, M0.a.j(j3), M0.a.i(j3), M0.a.h(j3), M0.a.g(j3), o3.k(this.f7014a.a()), o3, list, new r0.H[list.size()], list.size());
    }

    public final int hashCode() {
        return Float.hashCode(this.f7015b.f3294a) + (this.f7014a.hashCode() * 31);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f7014a + ", verticalAlignment=" + this.f7015b + ')';
    }
}
