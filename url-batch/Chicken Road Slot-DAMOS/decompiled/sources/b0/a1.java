package b0;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a1 implements c1 {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f800a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f801b;

    public a1(c1 c1Var, c1 c1Var2) {
        this.f800a = c1Var;
        this.f801b = c1Var2;
    }

    @Override // b0.c1
    public final int a(c2.o0 o0Var) {
        return Math.max(this.f800a.a(o0Var), this.f801b.a(o0Var));
    }

    @Override // b0.c1
    public final int b(c2.o0 o0Var, x2.l lVar) {
        return Math.max(this.f800a.b(o0Var, lVar), this.f801b.b(o0Var, lVar));
    }

    @Override // b0.c1
    public final int c(c2.o0 o0Var) {
        return Math.max(this.f800a.c(o0Var), this.f801b.c(o0Var));
    }

    @Override // b0.c1
    public final int d(c2.o0 o0Var, x2.l lVar) {
        return Math.max(this.f800a.d(o0Var, lVar), this.f801b.d(o0Var, lVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.a(a1Var.f800a, this.f800a) && Intrinsics.a(a1Var.f801b, this.f801b);
    }

    public final int hashCode() {
        return (this.f801b.hashCode() * 31) + this.f800a.hashCode();
    }

    public final String toString() {
        return "(" + this.f800a + " ∪ " + this.f801b + ')';
    }
}
