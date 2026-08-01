package x;

import c2.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lx/v;", "Lc2/x0;", "Lx/w;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class v extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final z.f f10213a;

    /* renamed from: b, reason: collision with root package name */
    public final x f10214b;

    public v(z.f fVar, x xVar) {
        this.f10213a = fVar;
        this.f10214b = xVar;
    }

    @Override // c2.x0
    public final d1.k d() {
        c2.i a9 = this.f10214b.a(this.f10213a);
        w wVar = new w();
        wVar.E = a9;
        wVar.I(a9);
        return wVar;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        w wVar = (w) kVar;
        c2.i a9 = this.f10214b.a(this.f10213a);
        wVar.J(wVar.E);
        wVar.E = a9;
        wVar.I(a9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.a(this.f10213a, vVar.f10213a) && Intrinsics.a(this.f10214b, vVar.f10214b);
    }

    public final int hashCode() {
        return this.f10214b.hashCode() + (this.f10213a.hashCode() * 31);
    }
}
