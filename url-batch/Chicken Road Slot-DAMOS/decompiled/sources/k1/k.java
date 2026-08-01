package k1;

import c2.i1;
import c2.x0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk1/k;", "Lc2/x0;", "Lk1/l;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class k extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f5332a;

    public k(Function1 function1) {
        this.f5332a = function1;
    }

    @Override // c2.x0
    public final d1.k d() {
        l lVar = new l();
        lVar.C = this.f5332a;
        return lVar;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        i1 i1Var;
        l lVar = (l) kVar;
        Function1 function1 = this.f5332a;
        lVar.C = function1;
        if (lVar.f3305d.B && (i1Var = c2.k.s(lVar, 2).C) != null) {
            i1Var.Z0(function1, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f5332a == ((k) obj).f5332a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5332a.hashCode();
    }
}
