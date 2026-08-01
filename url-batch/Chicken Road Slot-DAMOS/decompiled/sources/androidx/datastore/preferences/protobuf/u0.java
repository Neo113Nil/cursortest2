package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u0 extends AbstractList implements RandomAccess, w {

    /* renamed from: r, reason: collision with root package name */
    public static final u0 f639r = new u0(new Object[0], 0, false);

    /* renamed from: d, reason: collision with root package name */
    public boolean f640d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f641e;

    /* renamed from: i, reason: collision with root package name */
    public int f642i;

    public u0(Object[] objArr, int i3, boolean z10) {
        this.f640d = z10;
        this.f641e = objArr;
        this.f642i = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        c();
        if (i3 < 0 || i3 > (i10 = this.f642i)) {
            StringBuilder i11 = n0.l.i(i3, "Index:", ", Size:");
            i11.append(this.f642i);
            throw new IndexOutOfBoundsException(i11.toString());
        }
        Object[] objArr = this.f641e;
        if (i10 < objArr.length) {
            System.arraycopy(objArr, i3, objArr, i3 + 1, i10 - i3);
        } else {
            Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i3);
            System.arraycopy(this.f641e, i3, objArr2, i3 + 1, this.f642i - i3);
            this.f641e = objArr2;
        }
        this.f641e[i3] = obj;
        this.f642i++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        return super.addAll(collection);
    }

    public final void b(int i3) {
        if (i3 < 0 || i3 >= this.f642i) {
            StringBuilder i10 = n0.l.i(i3, "Index:", ", Size:");
            i10.append(this.f642i);
            throw new IndexOutOfBoundsException(i10.toString());
        }
    }

    public final void c() {
        if (this.f640d) {
            return;
        }
        a2.r.a();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        super.clear();
    }

    public final u0 e(int i3) {
        if (i3 >= this.f642i) {
            return new u0(Arrays.copyOf(this.f641e, i3), this.f642i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < size; i3++) {
            if (!get(i3).equals(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        b(i3);
        return this.f641e[i3];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i3 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i3 = (i3 * 31) + get(i10).hashCode();
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        c();
        b(i3);
        Object[] objArr = this.f641e;
        Object obj = objArr[i3];
        if (i3 < this.f642i - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (r2 - i3) - 1);
        }
        this.f642i--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        c();
        b(i3);
        Object[] objArr = this.f641e;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f642i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        c();
        return super.addAll(i3, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i3 = this.f642i;
        Object[] objArr = this.f641e;
        if (i3 == objArr.length) {
            this.f641e = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f641e;
        int i10 = this.f642i;
        this.f642i = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
