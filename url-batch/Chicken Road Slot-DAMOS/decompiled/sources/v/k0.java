package v;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k0 implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f9832a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9833b;

    public k0(p pVar, long j) {
        this.f9832a = pVar;
        this.f9833b = j;
    }

    @Override // v.f
    public final b1 a(c6.s sVar) {
        return new l0(this.f9832a.a(sVar), this.f9833b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return k0Var.f9833b == this.f9833b && Intrinsics.a(k0Var.f9832a, this.f9832a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f9833b) + (this.f9832a.hashCode() * 31);
    }
}
