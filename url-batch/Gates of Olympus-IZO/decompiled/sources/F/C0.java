package F;

import H2.AbstractC0080b;
import b0.C0288u;
import t0.InterfaceC0904l;

/* loaded from: classes.dex */
public final class C0 implements n.W {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f876a;

    /* renamed from: b, reason: collision with root package name */
    public final float f877b;

    /* renamed from: c, reason: collision with root package name */
    public final long f878c;

    public C0(boolean z3, float f3, long j3) {
        this.f876a = z3;
        this.f877b = f3;
        this.f878c = j3;
    }

    @Override // n.W
    public final InterfaceC0904l b(q.i iVar) {
        A2.g gVar = new A2.g(6, this);
        return new S(iVar, this.f876a, this.f877b, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        if (this.f876a == c02.f876a && M0.e.a(this.f877b, c02.f877b) && Z1.i.a(null, null)) {
            return C0288u.c(this.f878c, c02.f878c);
        }
        return false;
    }

    public final int hashCode() {
        int a3 = AbstractC0080b.a(this.f877b, Boolean.hashCode(this.f876a) * 31, 961);
        int i3 = C0288u.f4297g;
        return Long.hashCode(this.f878c) + a3;
    }
}
