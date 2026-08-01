package u;

import c2.x0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import v.z0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lu/x;", "Lc2/x0;", "Lu/g0;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class x extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f9559a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f9560b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f9561c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f9562d;

    /* renamed from: e, reason: collision with root package name */
    public final y f9563e;

    public x(z0 z0Var, h0 h0Var, i0 i0Var, Function0 function0, y yVar) {
        this.f9559a = z0Var;
        this.f9560b = h0Var;
        this.f9561c = i0Var;
        this.f9562d = function0;
        this.f9563e = yVar;
    }

    @Override // c2.x0
    public final d1.k d() {
        g0 g0Var = new g0();
        g0Var.C = this.f9559a;
        g0Var.D = this.f9561c;
        g0Var.E = this.f9562d;
        g0Var.F = this.f9563e;
        g0Var.G = u.f9550a;
        x2.b.b(0, 0, 15);
        new f0(g0Var, 0);
        new f0(g0Var, 1);
        return g0Var;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        g0 g0Var = (g0) kVar;
        g0Var.C = this.f9559a;
        g0Var.D = this.f9561c;
        g0Var.E = this.f9562d;
        g0Var.F = this.f9563e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return xVar.f9559a.equals(this.f9559a) && xVar.f9560b.equals(this.f9560b) && Intrinsics.a(xVar.f9561c, this.f9561c) && xVar.f9562d == this.f9562d && Intrinsics.a(xVar.f9563e, this.f9563e);
    }

    public final int hashCode() {
        return this.f9563e.hashCode() + ((this.f9562d.hashCode() + ((this.f9561c.f9520a.hashCode() + ((this.f9560b.f9517a.hashCode() + (this.f9559a.hashCode() * 923521)) * 31)) * 31)) * 31);
    }
}
