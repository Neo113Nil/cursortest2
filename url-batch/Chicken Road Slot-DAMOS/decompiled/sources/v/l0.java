package v;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l0 implements b1 {

    /* renamed from: d, reason: collision with root package name */
    public final b1 f9834d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9835e;

    public l0(b1 b1Var, long j) {
        this.f9834d = b1Var;
        this.f9835e = j;
    }

    @Override // v.b1
    public final boolean a() {
        return this.f9834d.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return l0Var.f9835e == this.f9835e && Intrinsics.a(l0Var.f9834d, this.f9834d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f9835e) + (this.f9834d.hashCode() * 31);
    }

    @Override // v.b1
    public final l i(long j, l lVar, l lVar2, l lVar3) {
        long j3 = this.f9835e;
        return j < j3 ? lVar : this.f9834d.i(j - j3, lVar, lVar2, lVar3);
    }

    @Override // v.b1
    public final long j(l lVar, l lVar2, l lVar3) {
        return this.f9834d.j(lVar, lVar2, lVar3) + this.f9835e;
    }

    @Override // v.b1
    public final l n(long j, l lVar, l lVar2, l lVar3) {
        long j3 = this.f9835e;
        return j < j3 ? lVar3 : this.f9834d.n(j - j3, lVar, lVar2, lVar3);
    }
}
