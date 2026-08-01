package b3;

import a2.f0;
import a2.g0;
import a2.h0;
import a2.i0;
import a2.o0;
import a2.s0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1064a = new g();

    @Override // a2.g0
    public final h0 a(i0 i0Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i3 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            o0 c10 = ((f0) list.get(i11)).c(j);
            i3 = Math.max(i3, c10.f131d);
            i10 = Math.max(i10, c10.f132e);
            arrayList.add(c10);
        }
        if (list.isEmpty()) {
            i3 = x2.a.j(j);
            i10 = x2.a.i(j);
        }
        return i0.V(i0Var, i3, i10, new s0(1, arrayList));
    }
}
