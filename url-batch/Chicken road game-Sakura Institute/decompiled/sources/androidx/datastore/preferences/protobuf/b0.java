package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 extends b implements c0, RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f795g;

    static {
        new b0(10).f794f = false;
    }

    public b0(int i7) {
        this(new ArrayList(i7));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        a();
        this.f795g.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f795g.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f795g.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final w e(int i7) {
        ArrayList arrayList = this.f795g;
        if (i7 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i7);
        arrayList2.addAll(arrayList);
        return new b0(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        ArrayList arrayList = this.f795g;
        Object obj = arrayList.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof g)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, x.f922a);
            if (u1.f915a.e(bArr, 0, bArr.length) == 0) {
                arrayList.set(i7, str);
            }
            return str;
        }
        g gVar = (g) obj;
        String str2 = gVar.size() == 0 ? "" : new String(gVar.f819g, gVar.x(), gVar.size(), x.f922a);
        int x8 = gVar.x();
        if (u1.f915a.e(gVar.f819g, x8, gVar.size() + x8) == 0) {
            arrayList.set(i7, str2);
        }
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void h(g gVar) {
        a();
        this.f795g.add(gVar);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final c0 l() {
        return this.f794f ? new m1(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final Object p(int i7) {
        return this.f795g.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final List q() {
        return Collections.unmodifiableList(this.f795g);
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        a();
        Object remove = this.f795g.remove(i7);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof g)) {
            return new String((byte[]) remove, x.f922a);
        }
        g gVar = (g) remove;
        return gVar.size() == 0 ? "" : new String(gVar.f819g, gVar.x(), gVar.size(), x.f922a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        a();
        Object obj2 = this.f795g.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof g)) {
            return new String((byte[]) obj2, x.f922a);
        }
        g gVar = (g) obj2;
        return gVar.size() == 0 ? "" : new String(gVar.f819g, gVar.x(), gVar.size(), x.f922a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f795g.size();
    }

    public b0(ArrayList arrayList) {
        this.f795g = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        a();
        if (collection instanceof c0) {
            collection = ((c0) collection).q();
        }
        boolean addAll = this.f795g.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
