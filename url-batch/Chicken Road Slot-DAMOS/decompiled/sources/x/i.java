package x;

import c2.x0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lx/i;", "Lc2/x0;", "Lx/l;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class i extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final z.f f10190a;

    /* renamed from: b, reason: collision with root package name */
    public final x f10191b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10192c;

    /* renamed from: d, reason: collision with root package name */
    public final j2.g f10193d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f10194e;

    public i(z.f fVar, x xVar, boolean z10, j2.g gVar, Function0 function0) {
        this.f10190a = fVar;
        this.f10191b = xVar;
        this.f10192c = z10;
        this.f10193d = gVar;
        this.f10194e = function0;
    }

    @Override // c2.x0
    public final d1.k d() {
        return new l(this.f10190a, this.f10191b, this.f10192c, this.f10193d, this.f10194e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r8.L == null) goto L31;
     */
    @Override // c2.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(d1.k kVar) {
        boolean z10;
        c2.i iVar;
        l lVar = (l) kVar;
        p pVar = lVar.J;
        z.f fVar = lVar.R;
        z.f fVar2 = this.f10190a;
        boolean z11 = true;
        if (Intrinsics.a(fVar, fVar2)) {
            z10 = false;
        } else {
            lVar.M();
            lVar.R = fVar2;
            lVar.E = fVar2;
            z10 = true;
        }
        x xVar = lVar.F;
        x xVar2 = this.f10191b;
        if (!Intrinsics.a(xVar, xVar2)) {
            lVar.F = xVar2;
            z10 = true;
        }
        boolean z12 = lVar.H;
        boolean z13 = this.f10192c;
        if (z12 != z13) {
            if (z13) {
                lVar.I(pVar);
            } else {
                lVar.J(pVar);
                lVar.M();
            }
            c2.k.n(lVar);
            lVar.H = z13;
        }
        j2.g gVar = lVar.G;
        j2.g gVar2 = this.f10193d;
        if (!Intrinsics.a(gVar, gVar2)) {
            lVar.G = gVar2;
            c2.k.n(lVar);
        }
        lVar.I = this.f10194e;
        boolean z14 = lVar.S;
        z.f fVar3 = lVar.R;
        if (z14 != (fVar3 == null)) {
            boolean z15 = fVar3 == null;
            lVar.S = z15;
            if (!z15) {
            }
        }
        z11 = z10;
        if (z11 && ((iVar = lVar.L) != null || !lVar.S)) {
            if (iVar != null) {
                lVar.J(iVar);
            }
            lVar.L = null;
            lVar.O();
        }
        pVar.M(lVar.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.a(this.f10190a, iVar.f10190a) && Intrinsics.a(this.f10191b, iVar.f10191b) && this.f10192c == iVar.f10192c && Intrinsics.a(this.f10193d, iVar.f10193d) && this.f10194e == iVar.f10194e;
    }

    public final int hashCode() {
        z.f fVar = this.f10190a;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        x xVar = this.f10191b;
        int d10 = n0.l.d(n0.l.d((hashCode + (xVar != null ? xVar.hashCode() : 0)) * 31, 31, false), 961, this.f10192c);
        j2.g gVar = this.f10193d;
        return this.f10194e.hashCode() + ((d10 + (gVar != null ? Integer.hashCode(gVar.f4938a) : 0)) * 31);
    }
}
