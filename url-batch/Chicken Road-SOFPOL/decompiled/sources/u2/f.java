package u2;

import d6.v;
import java.util.ArrayList;
import java.util.List;
import u1.d0;
import u1.e0;
import u1.f0;
import u1.l0;
import w1.n0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f7317a = new f();

    @Override // u1.e0
    public final f0 e(n0 n0Var, List list, long j7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            l0 e8 = ((d0) list.get(i9)).e(j7);
            i = Math.max(i, e8.f7230d);
            i8 = Math.max(i8, e8.f7231e);
            arrayList.add(e8);
        }
        if (list.isEmpty()) {
            i = r2.a.j(j7);
            i8 = r2.a.i(j7);
        }
        return n0Var.e0(i, i8, v.f2327d, new q.q(2, arrayList));
    }
}
