package o4;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import n4.a0;
import n4.g0;
import n4.h0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lo4/o;", "Ln4/h0;", "Lo4/n;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@g0("dialog")
/* loaded from: classes.dex */
public final class o extends h0 {
    @Override // n4.h0
    public final n4.s a() {
        x0.d dVar = e.f7475a;
        return new n(this);
    }

    @Override // n4.h0
    public final void d(List list, a0 a0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((n4.h) it.next());
        }
    }

    @Override // n4.h0
    public final void e(n4.h hVar, boolean z10) {
        b().e(hVar, z10);
        int z11 = CollectionsKt.z((Iterable) b().f7082f.f5239d.getValue(), hVar);
        int i3 = 0;
        for (Object obj : (Iterable) b().f7082f.f5239d.getValue()) {
            int i10 = i3 + 1;
            if (i3 < 0) {
                y.i();
                throw null;
            }
            n4.h hVar2 = (n4.h) obj;
            if (i3 > z11) {
                b().c(hVar2);
            }
            i3 = i10;
        }
    }
}
