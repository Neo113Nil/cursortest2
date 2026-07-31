package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class B extends AbstractC0247b implements C, RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4982e;

    static {
        new B(10).f5043d = false;
    }

    public B(int i3) {
        this(new ArrayList(i3));
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final C a() {
        return this.f5043d ? new n0(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        b();
        this.f4982e.add(i3, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0247b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f4982e.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0247b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f4982e.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final Object e(int i3) {
        return this.f4982e.get(i3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0268w
    public final InterfaceC0268w f(int i3) {
        ArrayList arrayList = this.f4982e;
        if (i3 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i3);
        arrayList2.addAll(arrayList);
        return new B(arrayList2);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final List g() {
        return Collections.unmodifiableList(this.f4982e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        String str;
        ArrayList arrayList = this.f4982e;
        Object obj = arrayList.get(i3);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0253g) {
            C0253g c0253g = (C0253g) obj;
            c0253g.getClass();
            Charset charset = AbstractC0269x.f5135a;
            if (c0253g.size() == 0) {
                str = "";
            } else {
                str = new String(c0253g.f5067e, c0253g.j(), c0253g.size(), charset);
            }
            int j3 = c0253g.j();
            if (v0.f5134a.e(c0253g.f5067e, j3, c0253g.size() + j3) == 0) {
                arrayList.set(i3, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AbstractC0269x.f5135a);
            e0 e0Var = v0.f5134a;
            if (v0.f5134a.e(bArr, 0, bArr.length) == 0) {
                arrayList.set(i3, str);
            }
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final void h(C0253g c0253g) {
        b();
        this.f4982e.add(c0253g);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0247b, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        b();
        Object remove = this.f4982e.remove(i3);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof C0253g)) {
            return new String((byte[]) remove, AbstractC0269x.f5135a);
        }
        C0253g c0253g = (C0253g) remove;
        c0253g.getClass();
        Charset charset = AbstractC0269x.f5135a;
        if (c0253g.size() == 0) {
            return "";
        }
        return new String(c0253g.f5067e, c0253g.j(), c0253g.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        b();
        Object obj2 = this.f4982e.set(i3, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C0253g)) {
            return new String((byte[]) obj2, AbstractC0269x.f5135a);
        }
        C0253g c0253g = (C0253g) obj2;
        c0253g.getClass();
        Charset charset = AbstractC0269x.f5135a;
        if (c0253g.size() == 0) {
            return "";
        }
        return new String(c0253g.f5067e, c0253g.j(), c0253g.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4982e.size();
    }

    public B(ArrayList arrayList) {
        this.f4982e = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0247b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        b();
        if (collection instanceof C) {
            collection = ((C) collection).g();
        }
        boolean addAll = this.f4982e.addAll(i3, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
