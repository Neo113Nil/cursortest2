package d4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.A;
import kotlin.collections.AbstractC0629h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends AbstractC0629h implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final List f4660d;

    /* renamed from: e, reason: collision with root package name */
    public List f4661e;

    public d(A immutableList) {
        Intrinsics.checkNotNullParameter(immutableList, "immutableList");
        this.f4660d = immutableList;
        this.f4661e = immutableList;
    }

    @Override // kotlin.collections.AbstractC0629h
    public final int a() {
        return this.f4661e.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        List list = this.f4661e;
        List list2 = this.f4660d;
        if (list == list2) {
            this.f4661e = new ArrayList(list2);
        }
        List list3 = this.f4661e;
        Intrinsics.c(list3, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        ((ArrayList) list3).add(i2, obj);
    }

    @Override // kotlin.collections.AbstractC0629h
    public final Object b(int i2) {
        List list = this.f4661e;
        List list2 = this.f4660d;
        if (list == list2) {
            this.f4661e = new ArrayList(list2);
        }
        List list3 = this.f4661e;
        Intrinsics.c(list3, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return ((ArrayList) list3).remove(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return this.f4661e.get(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        List list = this.f4661e;
        List list2 = this.f4660d;
        if (list == list2) {
            this.f4661e = new ArrayList(list2);
        }
        List list3 = this.f4661e;
        Intrinsics.c(list3, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return ((ArrayList) list3).set(i2, obj);
    }
}
