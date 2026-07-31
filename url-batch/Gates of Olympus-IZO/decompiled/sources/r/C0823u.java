package r;

import h.AbstractC0416e;
import java.util.List;
import r0.InterfaceC0827A;

/* renamed from: r.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0823u implements InterfaceC0827A, InterfaceC0799K {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0811h f7099a;

    /* renamed from: b, reason: collision with root package name */
    public final U.b f7100b;

    public C0823u(InterfaceC0811h interfaceC0811h, U.b bVar) {
        this.f7099a = interfaceC0811h;
        this.f7100b = bVar;
    }

    @Override // r.InterfaceC0799K
    public final int a(r0.H h3) {
        return h3.f7115e;
    }

    @Override // r.InterfaceC0799K
    public final void b(int i3, int[] iArr, int[] iArr2, t0.O o3) {
        this.f7099a.c(o3, i3, iArr, iArr2);
    }

    @Override // r.InterfaceC0799K
    public final int c(r0.H h3) {
        return h3.f7114d;
    }

    @Override // r.InterfaceC0799K
    public final r0.B d(r0.H[] hArr, t0.O o3, int[] iArr, int i3, int i4) {
        return o3.Y(i4, i3, M1.v.f2804d, new C0822t(hArr, this, i4, o3, iArr));
    }

    @Override // r.InterfaceC0799K
    public final long e(int i3, int i4, int i5, boolean z3) {
        if (!z3) {
            return I2.l.a(0, i5, i3, i4);
        }
        int min = Math.min(i3, 262142);
        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int h3 = I2.l.h(min2 == Integer.MAX_VALUE ? min : min2);
        return I2.l.a(Math.min(h3, 0), i5 != Integer.MAX_VALUE ? Math.min(h3, i5) : Integer.MAX_VALUE, min, min2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0823u)) {
            return false;
        }
        C0823u c0823u = (C0823u) obj;
        return this.f7099a.equals(c0823u.f7099a) && this.f7100b.equals(c0823u.f7100b);
    }

    @Override // r0.InterfaceC0827A
    public final r0.B f(t0.O o3, List list, long j3) {
        return AbstractC0416e.w(this, M0.a.i(j3), M0.a.j(j3), M0.a.g(j3), M0.a.h(j3), o3.k(this.f7099a.a()), o3, list, new r0.H[list.size()], list.size());
    }

    public final int hashCode() {
        return Float.hashCode(this.f7100b.f3293a) + (this.f7099a.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f7099a + ", horizontalAlignment=" + this.f7100b + ')';
    }
}
