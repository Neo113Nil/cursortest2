package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class D extends F {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f3793c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(Object obj, long j3, int i3) {
        B b2;
        List list = (List) s0.f3925c.i(j3, obj);
        if (list.isEmpty()) {
            List b3 = list instanceof C ? new B(i3) : new ArrayList(i3);
            s0.s(j3, obj, b3);
            return b3;
        }
        if (f3793c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i3);
            arrayList.addAll(list);
            s0.s(j3, obj, arrayList);
            b2 = arrayList;
        } else {
            if (!(list instanceof n0)) {
                return list;
            }
            B b4 = new B(list.size() + i3);
            b4.addAll((n0) list);
            s0.s(j3, obj, b4);
            b2 = b4;
        }
        return b2;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final void a(long j3, Object obj) {
        Object unmodifiableList;
        List list = (List) s0.f3925c.i(j3, obj);
        if (list instanceof C) {
            unmodifiableList = ((C) list).a();
        } else {
            if (f3793c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
        }
        s0.s(j3, obj, unmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final void b(long j3, Object obj, Object obj2) {
        List list = (List) s0.f3925c.i(j3, obj2);
        List d3 = d(obj, j3, list.size());
        int size = d3.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d3.addAll(list);
        }
        if (size > 0) {
            list = d3;
        }
        s0.s(j3, obj, list);
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final List c(long j3, Object obj) {
        return d(obj, j3, 10);
    }
}
