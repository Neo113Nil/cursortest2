package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class D extends F {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f4993c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(int i3, long j3, Object obj) {
        B b3;
        List list = (List) s0.f5126c.i(j3, obj);
        if (list.isEmpty()) {
            List b4 = list instanceof C ? new B(i3) : new ArrayList(i3);
            s0.s(j3, obj, b4);
            return b4;
        }
        if (f4993c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i3);
            arrayList.addAll(list);
            s0.s(j3, obj, arrayList);
            b3 = arrayList;
        } else {
            if (!(list instanceof n0)) {
                return list;
            }
            B b5 = new B(list.size() + i3);
            b5.addAll((n0) list);
            s0.s(j3, obj, b5);
            b3 = b5;
        }
        return b3;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final void a(long j3, Object obj) {
        Object unmodifiableList;
        List list = (List) s0.f5126c.i(j3, obj);
        if (list instanceof C) {
            unmodifiableList = ((C) list).a();
        } else {
            if (f4993c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
        }
        s0.s(j3, obj, unmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final void b(long j3, Object obj, Object obj2) {
        List list = (List) s0.f5126c.i(j3, obj2);
        List d3 = d(list.size(), j3, obj);
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
        return d(10, j3, obj);
    }
}
