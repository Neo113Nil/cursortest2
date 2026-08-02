package defpackage;

import j$.util.List;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hel extends heb implements List, RandomAccess, j$.util.List {
    private static final hjs a = new heh(his.a, 0);
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = -889275714;

    public static heg d(int i) {
        hnu.ap(i, "expectedSize");
        return new heg(i);
    }

    public static hel h(Object[] objArr) {
        return i(objArr, objArr.length);
    }

    static hel i(Object[] objArr, int i) {
        return i == 0 ? his.a : new his(objArr, i);
    }

    public static hel j(Object... objArr) {
        hnu.t(objArr);
        return h(objArr);
    }

    public static hel n(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return his.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return q(next);
        }
        heg hegVar = new heg(4);
        hegVar.h(next);
        hegVar.k(it);
        return hegVar.g();
    }

    public static hel o(Collection collection) {
        if (!(collection instanceof heb)) {
            return j(collection.toArray());
        }
        hel g = ((heb) collection).g();
        return g.l() ? h(g.toArray()) : g;
    }

    public static hel p(Object[] objArr) {
        return objArr.length == 0 ? his.a : j((Object[]) objArr.clone());
    }

    public static hel q(Object obj) {
        return j(obj);
    }

    public static hel r(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static hel s(Object obj, Object obj2, Object obj3) {
        return j(obj, obj2, obj3);
    }

    public static hel t(Comparator comparator, Iterable iterable) {
        comparator.getClass();
        Object[] aa = hnu.aa(iterable);
        hnu.t(aa);
        Arrays.sort(aa, comparator);
        return h(aa);
    }

    public hel a() {
        return size() <= 1 ? this : new hei(this);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public hel subList(int i, int i2) {
        hoq.G(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? his.a : new hek(this, i, i3);
    }

    @Override // defpackage.heb
    public int c(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return hnu.H(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.heb
    /* renamed from: k */
    public final hjr iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final hjs listIterator(int i) {
        hoq.P(i, size());
        return isEmpty() ? a : new heh(this, i);
    }

    @Override // defpackage.heb
    public Object writeReplace() {
        return new hej(toArray());
    }

    @Override // defpackage.heb
    @Deprecated
    public final hel g() {
        return this;
    }
}
