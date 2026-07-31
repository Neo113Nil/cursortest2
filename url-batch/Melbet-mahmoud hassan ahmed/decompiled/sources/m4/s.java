package m4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class s<E> extends o<E> implements Set<E> {

    /* renamed from: g, reason: collision with root package name */
    private transient q<E> f19209g;

    s() {
    }

    static int p(int i7) {
        int max = Math.max(i7, 2);
        if (max >= 751619276) {
            l4.j.e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (true) {
            double d7 = highestOneBit;
            Double.isNaN(d7);
            if (d7 * 0.7d >= max) {
                return highestOneBit;
            }
            highestOneBit <<= 1;
        }
    }

    private static <E> s<E> q(int i7, Object... objArr) {
        if (i7 == 0) {
            return v();
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return w(obj);
        }
        int p7 = p(i7);
        Object[] objArr2 = new Object[p7];
        int i8 = p7 - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object a7 = g0.a(objArr[i11], i11);
            int hashCode = a7.hashCode();
            int a8 = n.a(hashCode);
            while (true) {
                int i12 = a8 & i8;
                Object obj2 = objArr2[i12];
                if (obj2 == null) {
                    objArr[i10] = a7;
                    objArr2[i12] = a7;
                    i9 += hashCode;
                    i10++;
                    break;
                }
                if (obj2.equals(a7)) {
                    break;
                }
                a8++;
            }
        }
        Arrays.fill(objArr, i10, i7, (Object) null);
        if (i10 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new q0(obj3);
        }
        if (p(i10) < p7 / 2) {
            return q(i10, objArr);
        }
        if (z(i10, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new l0(objArr, i9, objArr2, i8, i10);
    }

    public static <E> s<E> r(Collection<? extends E> collection) {
        if ((collection instanceof s) && !(collection instanceof SortedSet)) {
            s<E> sVar = (s) collection;
            if (!sVar.n()) {
                return sVar;
            }
        }
        Object[] array = collection.toArray();
        return q(array.length, array);
    }

    public static <E> s<E> s(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? q(eArr.length, (Object[]) eArr.clone()) : w(eArr[0]) : v();
    }

    public static <E> s<E> v() {
        return l0.f19176n;
    }

    public static <E> s<E> w(E e7) {
        return new q0(e7);
    }

    public static <E> s<E> x(E e7, E e8) {
        return q(2, e7, e8);
    }

    public static <E> s<E> y(E e7, E e8, E e9) {
        return q(3, e7, e8, e9);
    }

    private static boolean z(int i7, int i8) {
        return i7 < (i8 >> 1) + (i8 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof s) && u() && ((s) obj).u() && hashCode() != obj.hashCode()) {
            return false;
        }
        return p0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return p0.d(this);
    }

    @Override // m4.o
    public q<E> i() {
        q<E> qVar = this.f19209g;
        if (qVar != null) {
            return qVar;
        }
        q<E> t6 = t();
        this.f19209g = t6;
        return t6;
    }

    @Override // m4.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public abstract s0<E> iterator();

    q<E> t() {
        return q.p(toArray());
    }

    boolean u() {
        return false;
    }
}
