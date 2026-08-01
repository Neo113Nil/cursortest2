package w1;

import a2.a0;
import a3.o;
import c2.x0;
import d1.k;
import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw1/d;", "Lc2/x0;", "Lw1/h;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class d extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f10013a;

    public d(c cVar) {
        this.f10013a = cVar;
    }

    @Override // c2.x0
    public final k d() {
        return new h(this.f10013a);
    }

    @Override // c2.x0
    public final void e(k kVar) {
        h hVar = (h) kVar;
        hVar.getClass();
        c cVar = hVar.C;
        if (cVar.f10009a == hVar) {
            cVar.f10009a = null;
        }
        c cVar2 = this.f10013a;
        if (!cVar2.equals(cVar)) {
            hVar.C = cVar2;
        }
        if (hVar.B) {
            c cVar3 = hVar.C;
            cVar3.f10009a = hVar;
            cVar3.f10010b = null;
            hVar.D = null;
            cVar3.f10011c = new a0(14, hVar);
            cVar3.f10012d = hVar.w();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        Object obj2 = o.f245a;
        return obj2.equals(obj2) && dVar.f10013a.equals(this.f10013a);
    }

    public final int hashCode() {
        return this.f10013a.hashCode() + (o.f245a.hashCode() * 31);
    }
}
