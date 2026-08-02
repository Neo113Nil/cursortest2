package defpackage;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class jjc extends AbstractList implements jkx {
    private boolean a;

    public jjc(boolean z) {
        this.a = z;
    }

    private void e() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        bM();
        return super.add(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        bM();
        return super.addAll(i, collection);
    }

    @Override // defpackage.jkx
    public final void b() {
        if (this.a) {
            this.a = false;
        }
    }

    protected final void bM() {
        if (this.a) {
            return;
        }
        e();
    }

    @Override // defpackage.jkx
    public final boolean c() {
        return this.a;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        bM();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
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
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        bM();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        bM();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        bM();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        bM();
        return super.set(i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        bM();
        super.add(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        bM();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        bM();
        return super.remove(i);
    }
}
