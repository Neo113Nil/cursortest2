package r0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class K extends t0.B {

    /* renamed from: a, reason: collision with root package name */
    public static final K f7124a = new K();

    @Override // r0.InterfaceC0827A
    public final B f(t0.O o3, List list, long j3) {
        boolean isEmpty = list.isEmpty();
        M1.v vVar = M1.v.f2804d;
        if (isEmpty) {
            return o3.Y(M0.a.j(j3), M0.a.i(j3), vVar, I.f7120g);
        }
        if (list.size() == 1) {
            H b2 = ((z) list.get(0)).b(j3);
            return o3.Y(I2.l.q(j3, b2.f7114d), I2.l.p(j3, b2.f7115e), vVar, new Y.g(b2, 7));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((z) list.get(i3)).b(j3));
        }
        int size2 = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size2; i6++) {
            H h3 = (H) arrayList.get(i6);
            i4 = Math.max(h3.f7114d, i4);
            i5 = Math.max(h3.f7115e, i5);
        }
        return o3.Y(I2.l.q(j3, i4), I2.l.p(j3, i5), vVar, new P0.h(2, arrayList));
    }
}
