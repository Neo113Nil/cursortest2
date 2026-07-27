package q;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: q.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1046y implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f9348a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f9349b;

    public C1046y(m0 m0Var, m0 m0Var2) {
        this.f9348a = m0Var;
        this.f9349b = m0Var2;
    }

    @Override // q.m0
    public final int a(M0.b bVar) {
        int a4 = this.f9348a.a(bVar) - this.f9349b.a(bVar);
        if (a4 < 0) {
            return 0;
        }
        return a4;
    }

    @Override // q.m0
    public final int b(M0.b bVar, M0.k kVar) {
        int b4 = this.f9348a.b(bVar, kVar) - this.f9349b.b(bVar, kVar);
        if (b4 < 0) {
            return 0;
        }
        return b4;
    }

    @Override // q.m0
    public final int c(M0.b bVar) {
        int c4 = this.f9348a.c(bVar) - this.f9349b.c(bVar);
        if (c4 < 0) {
            return 0;
        }
        return c4;
    }

    @Override // q.m0
    public final int d(M0.b bVar, M0.k kVar) {
        int d4 = this.f9348a.d(bVar, kVar) - this.f9349b.d(bVar, kVar);
        if (d4 < 0) {
            return 0;
        }
        return d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1046y)) {
            return false;
        }
        C1046y c1046y = (C1046y) obj;
        return Intrinsics.a(c1046y.f9348a, this.f9348a) && Intrinsics.a(c1046y.f9349b, this.f9349b);
    }

    public final int hashCode() {
        return this.f9349b.hashCode() + (this.f9348a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f9348a + " - " + this.f9349b + ')';
    }
}
