package q;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f9269a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f9270b;

    public j0(m0 m0Var, m0 m0Var2) {
        this.f9269a = m0Var;
        this.f9270b = m0Var2;
    }

    @Override // q.m0
    public final int a(M0.b bVar) {
        return Math.max(this.f9269a.a(bVar), this.f9270b.a(bVar));
    }

    @Override // q.m0
    public final int b(M0.b bVar, M0.k kVar) {
        return Math.max(this.f9269a.b(bVar, kVar), this.f9270b.b(bVar, kVar));
    }

    @Override // q.m0
    public final int c(M0.b bVar) {
        return Math.max(this.f9269a.c(bVar), this.f9270b.c(bVar));
    }

    @Override // q.m0
    public final int d(M0.b bVar, M0.k kVar) {
        return Math.max(this.f9269a.d(bVar, kVar), this.f9270b.d(bVar, kVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.a(j0Var.f9269a, this.f9269a) && Intrinsics.a(j0Var.f9270b, this.f9270b);
    }

    public final int hashCode() {
        return (this.f9270b.hashCode() * 31) + this.f9269a.hashCode();
    }

    public final String toString() {
        return "(" + this.f9269a + " ∪ " + this.f9270b + ')';
    }
}
