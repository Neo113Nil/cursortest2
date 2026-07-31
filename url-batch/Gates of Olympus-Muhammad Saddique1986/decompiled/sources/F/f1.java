package F;

import b0.C0352v;
import t0.InterfaceC0999l;

/* loaded from: classes.dex */
public final class f1 implements n.Z {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1537a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1538b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1539c;

    public f1(boolean z3, float f3, long j3) {
        this.f1537a = z3;
        this.f1538b = f3;
        this.f1539c = j3;
    }

    @Override // n.Z
    public final InterfaceC0999l b(q.j jVar) {
        W w2 = new W(1, this);
        return new Y(jVar, this.f1537a, this.f1538b, w2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (this.f1537a == f1Var.f1537a && O0.e.a(this.f1538b, f1Var.f1538b) && f2.j.a(null, null)) {
            return C0352v.c(this.f1539c, f1Var.f1539c);
        }
        return false;
    }

    public final int hashCode() {
        int a3 = A.k.a(this.f1538b, Boolean.hashCode(this.f1537a) * 31, 961);
        int i3 = C0352v.f5440h;
        return Long.hashCode(this.f1539c) + a3;
    }
}
