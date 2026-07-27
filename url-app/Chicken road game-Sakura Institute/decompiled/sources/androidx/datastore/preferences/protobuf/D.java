package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class D extends F {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f5267c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(int i2, long j4, Object obj) {
        B b4;
        List list = (List) s0.f5400c.i(j4, obj);
        if (list.isEmpty()) {
            List b5 = list instanceof C ? new B(i2) : new ArrayList(i2);
            s0.s(j4, obj, b5);
            return b5;
        }
        if (f5267c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i2);
            arrayList.addAll(list);
            s0.s(j4, obj, arrayList);
            b4 = arrayList;
        } else {
            if (!(list instanceof n0)) {
                return list;
            }
            B b6 = new B(list.size() + i2);
            b6.addAll((n0) list);
            s0.s(j4, obj, b6);
            b4 = b6;
        }
        return b4;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final void a(long j4, Object obj) {
        Object unmodifiableList;
        List list = (List) s0.f5400c.i(j4, obj);
        if (list instanceof C) {
            unmodifiableList = ((C) list).c();
        } else {
            if (f5267c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
        }
        s0.s(j4, obj, unmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final void b(long j4, Object obj, Object obj2) {
        List list = (List) s0.f5400c.i(j4, obj2);
        List d4 = d(list.size(), j4, obj);
        int size = d4.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d4.addAll(list);
        }
        if (size > 0) {
            list = d4;
        }
        s0.s(j4, obj, list);
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final List c(long j4, Object obj) {
        return d(10, j4, obj);
    }
}
