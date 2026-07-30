package p1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface f0 {
    g0 a(h0 h0Var, List list, long j8);

    default int b(m mVar, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new j((e0) list.get(i8), 1, 2, 0));
        }
        return a(new o(mVar, mVar.getLayoutDirection()), arrayList, r4.a.c(i7, 0, 13)).f();
    }

    default int c(m mVar, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            int i9 = 1;
            arrayList.add(new j((e0) list.get(i8), i9, i9, 0));
        }
        return a(new o(mVar, mVar.getLayoutDirection()), arrayList, r4.a.c(0, i7, 7)).n();
    }

    default int e(m mVar, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new j((e0) list.get(i8), 2, 1, 0));
        }
        return a(new o(mVar, mVar.getLayoutDirection()), arrayList, r4.a.c(0, i7, 7)).n();
    }

    default int g(m mVar, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            int i9 = 2;
            arrayList.add(new j((e0) list.get(i8), i9, i9, 0));
        }
        return a(new o(mVar, mVar.getLayoutDirection()), arrayList, r4.a.c(i7, 0, 13)).f();
    }
}
