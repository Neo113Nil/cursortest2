package a2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t0 extends c2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f156a = new t0();

    @Override // a2.g0
    public final h0 a(i0 i0Var, List list, long j) {
        int size = list.size();
        if (size == 0) {
            return i0.V(i0Var, x2.a.j(j), x2.a.i(j), p0.f137i);
        }
        if (size == 1) {
            o0 c10 = ((f0) list.get(0)).c(j);
            return i0.V(i0Var, x2.b.f(c10.f131d, j), x2.b.e(c10.f132e, j), new r0(c10, 0));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i3 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            o0 c11 = ((f0) list.get(i11)).c(j);
            i3 = Math.max(c11.f131d, i3);
            i10 = Math.max(c11.f132e, i10);
            arrayList.add(c11);
        }
        return i0.V(i0Var, x2.b.f(i3, j), x2.b.e(i10, j), new s0(0, arrayList));
    }
}
