package o4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import je.l0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.w0;
import n0.j1;
import n4.a0;
import n4.g0;
import n4.h0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lo4/i;", "Ln4/h0;", "Lo4/h;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@g0("composable")
/* loaded from: classes.dex */
public final class i extends h0 {

    /* renamed from: c, reason: collision with root package name */
    public final j1 f7477c = n0.h.r(Boolean.FALSE);

    @Override // n4.h0
    public final n4.s a() {
        return new h(this, c.f7473a);
    }

    @Override // n4.h0
    public final void d(List list, a0 a0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n4.h hVar = (n4.h) it.next();
            n4.k b10 = b();
            je.w wVar = b10.f7081e;
            hVar.getClass();
            l0 l0Var = b10.f7079c;
            Iterable iterable = (Iterable) l0Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((n4.h) it2.next()) == hVar) {
                        Iterable iterable2 = (Iterable) wVar.f5239d.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((n4.h) it3.next()) == hVar) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            n4.h hVar2 = (n4.h) CollectionsKt.D((List) wVar.f5239d.getValue());
            if (hVar2 != null) {
                l0Var.k(null, w0.c((Set) l0Var.getValue(), hVar2));
            }
            l0Var.k(null, w0.c((Set) l0Var.getValue(), hVar));
            b10.f(hVar);
        }
        this.f7477c.setValue(Boolean.FALSE);
    }

    @Override // n4.h0
    public final void e(n4.h hVar, boolean z10) {
        b().e(hVar, z10);
        this.f7477c.setValue(Boolean.TRUE);
    }

    public final void g(n4.h hVar) {
        n4.k b10 = b();
        hVar.getClass();
        l0 l0Var = b10.f7079c;
        l0Var.k(null, w0.c((Set) l0Var.getValue(), hVar));
        q4.h hVar2 = b10.f7083h.f7130b;
        hVar2.getClass();
        if (!hVar2.f7999f.contains(hVar)) {
            i0.l("Cannot transition entry that is not in the back stack");
            return;
        }
        androidx.lifecycle.p pVar = androidx.lifecycle.p.f710r;
        q4.c cVar = hVar.f7069v;
        cVar.getClass();
        cVar.f7978k = pVar;
        cVar.b();
    }
}
