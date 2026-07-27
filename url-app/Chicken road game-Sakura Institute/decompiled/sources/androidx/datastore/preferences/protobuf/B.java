package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class B extends AbstractC0436b implements C, RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5256e;

    static {
        new B(10).f5317d = false;
    }

    public B(int i2) {
        this(new ArrayList(i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        e();
        this.f5256e.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0436b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f5256e.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final C c() {
        return this.f5317d ? new n0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0436b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.f5256e.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        String str;
        ArrayList arrayList = this.f5256e;
        Object obj = arrayList.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0442g) {
            C0442g c0442g = (C0442g) obj;
            c0442g.getClass();
            Charset charset = AbstractC0458x.f5409a;
            if (c0442g.size() == 0) {
                str = "";
            } else {
                str = new String(c0442g.f5341e, c0442g.w(), c0442g.size(), charset);
            }
            int w4 = c0442g.w();
            if (v0.f5408a.e(c0442g.f5341e, w4, c0442g.size() + w4) == 0) {
                arrayList.set(i2, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AbstractC0458x.f5409a);
            e0 e0Var = v0.f5408a;
            if (v0.f5408a.e(bArr, 0, bArr.length) == 0) {
                arrayList.set(i2, str);
            }
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final Object n(int i2) {
        return this.f5256e.get(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0457w
    public final InterfaceC0457w q(int i2) {
        ArrayList arrayList = this.f5256e;
        if (i2 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.addAll(arrayList);
        return new B(arrayList2);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final List r() {
        return Collections.unmodifiableList(this.f5256e);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0436b, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        e();
        Object remove = this.f5256e.remove(i2);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof C0442g)) {
            return new String((byte[]) remove, AbstractC0458x.f5409a);
        }
        C0442g c0442g = (C0442g) remove;
        c0442g.getClass();
        Charset charset = AbstractC0458x.f5409a;
        if (c0442g.size() == 0) {
            return "";
        }
        return new String(c0442g.f5341e, c0442g.w(), c0442g.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        e();
        Object obj2 = this.f5256e.set(i2, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C0442g)) {
            return new String((byte[]) obj2, AbstractC0458x.f5409a);
        }
        C0442g c0442g = (C0442g) obj2;
        c0442g.getClass();
        Charset charset = AbstractC0458x.f5409a;
        if (c0442g.size() == 0) {
            return "";
        }
        return new String(c0442g.f5341e, c0442g.w(), c0442g.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5256e.size();
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final void v(C0442g c0442g) {
        e();
        this.f5256e.add(c0442g);
        ((AbstractList) this).modCount++;
    }

    public B(ArrayList arrayList) {
        this.f5256e = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0436b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        e();
        if (collection instanceof C) {
            collection = ((C) collection).r();
        }
        boolean addAll = this.f5256e.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
