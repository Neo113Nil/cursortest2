package x;

import c2.x0;
import hd.a0;
import hd.z;
import k1.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lx/f;", "Lc2/x0;", "Lx/h;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class f extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f10187a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10188b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f10189c;

    public f(long j, f0 f0Var) {
        this.f10187a = j;
        this.f10189c = f0Var;
    }

    @Override // c2.x0
    public final d1.k d() {
        h hVar = new h();
        hVar.C = this.f10187a;
        hVar.D = this.f10189c;
        hVar.E = 9205357640488583168L;
        return hVar;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        h hVar = (h) kVar;
        hVar.C = this.f10187a;
        f0 f0Var = hVar.D;
        f0 f0Var2 = this.f10189c;
        if (!Intrinsics.a(f0Var, f0Var2)) {
            hVar.D = f0Var2;
            c2.k.n(hVar);
        }
        c2.k.l(hVar);
    }

    public final boolean equals(Object obj) {
        f fVar = obj instanceof f ? (f) obj : null;
        return fVar != null && k1.p.c(this.f10187a, fVar.f10187a) && this.f10188b == fVar.f10188b && Intrinsics.a(this.f10189c, fVar.f10189c);
    }

    public final int hashCode() {
        int i3 = k1.p.f5341h;
        z zVar = a0.f4495e;
        return this.f10189c.hashCode() + n0.l.b(this.f10188b, Long.hashCode(this.f10187a) * 961, 31);
    }
}
