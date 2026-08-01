package u;

import c2.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n0.z0;
import v.t0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Lu/k;", "S", "Lc2/x0;", "Lu/n;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class k<S> extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f9523a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f9524b;

    /* renamed from: c, reason: collision with root package name */
    public final o f9525c;

    public k(t0 t0Var, z0 z0Var, o oVar) {
        this.f9523a = t0Var;
        this.f9524b = z0Var;
        this.f9525c = oVar;
    }

    @Override // c2.x0
    public final d1.k d() {
        n nVar = new n();
        nVar.C = this.f9523a;
        nVar.D = this.f9524b;
        nVar.E = this.f9525c;
        nVar.F = f.f9507a;
        return nVar;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        n nVar = (n) kVar;
        nVar.C = this.f9523a;
        nVar.D = this.f9524b;
        nVar.E = this.f9525c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.a(kVar.f9523a, this.f9523a) && kVar.f9524b.equals(this.f9524b);
    }

    public final int hashCode() {
        int hashCode = this.f9525c.hashCode() * 31;
        t0 t0Var = this.f9523a;
        return this.f9524b.hashCode() + ((hashCode + (t0Var != null ? t0Var.hashCode() : 0)) * 31);
    }
}
