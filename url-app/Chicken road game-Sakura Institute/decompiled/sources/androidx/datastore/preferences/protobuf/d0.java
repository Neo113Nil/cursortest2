package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f801c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i7, long j8, Object obj) {
        List list = (List) r1.f903c.i(j8, obj);
        if (list.isEmpty()) {
            List b0Var = list instanceof c0 ? new b0(i7) : new ArrayList(i7);
            r1.p(j8, obj, b0Var);
            return b0Var;
        }
        if (f801c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i7);
            arrayList.addAll(list);
            r1.p(j8, obj, arrayList);
            return arrayList;
        }
        if (!(list instanceof m1)) {
            return list;
        }
        b0 b0Var2 = new b0(list.size() + i7);
        b0Var2.addAll((m1) list);
        r1.p(j8, obj, b0Var2);
        return b0Var2;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void a(long j8, Object obj) {
        Object unmodifiableList;
        List list = (List) r1.f903c.i(j8, obj);
        if (list instanceof c0) {
            unmodifiableList = ((c0) list).l();
        } else if (f801c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        r1.p(j8, obj, unmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void b(long j8, Object obj, Object obj2) {
        List list = (List) r1.f903c.i(j8, obj2);
        List d8 = d(list.size(), j8, obj);
        int size = d8.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d8.addAll(list);
        }
        if (size > 0) {
            list = d8;
        }
        r1.p(j8, obj, list);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final List c(long j8, Object obj) {
        return d(10, j8, obj);
    }
}
