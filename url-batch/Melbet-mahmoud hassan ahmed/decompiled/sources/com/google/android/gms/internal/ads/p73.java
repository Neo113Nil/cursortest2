package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class p73<E> extends z63<E> implements Set<E> {

    /* renamed from: g, reason: collision with root package name */
    private transient e73<E> f10116g;

    p73() {
    }

    static int p(int i7) {
        double d7;
        int max = Math.max(i7, 2);
        if (max >= 751619276) {
            q43.e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
            d7 = highestOneBit;
            Double.isNaN(d7);
        } while (d7 * 0.7d < max);
        return highestOneBit;
    }

    public static <E> o73<E> r(int i7) {
        return new o73<>(i7);
    }

    public static <E> p73<E> t() {
        return z83.f15028n;
    }

    @SafeVarargs
    public static <E> p73<E> u(E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        Object[] objArr = new Object[11];
        objArr[0] = e7;
        objArr[1] = e8;
        objArr[2] = e9;
        objArr[3] = e10;
        objArr[4] = e11;
        objArr[5] = e12;
        System.arraycopy(eArr, 0, objArr, 6, 5);
        return x(11, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> p73<E> x(int i7, Object... objArr) {
        if (i7 == 0) {
            return z83.f15028n;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new e93(obj);
        }
        int p7 = p(i7);
        Object[] objArr2 = new Object[p7];
        int i8 = p7 - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj2 = objArr[i11];
            r83.a(obj2, i11);
            int hashCode = obj2.hashCode();
            int a7 = w63.a(hashCode);
            while (true) {
                int i12 = a7 & i8;
                Object obj3 = objArr2[i12];
                if (obj3 == null) {
                    objArr[i10] = obj2;
                    objArr2[i12] = obj2;
                    i9 += hashCode;
                    i10++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                a7++;
            }
        }
        Arrays.fill(objArr, i10, i7, (Object) null);
        if (i10 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new e93(obj4);
        }
        if (p(i10) < p7 / 2) {
            return x(i10, objArr);
        }
        if (y(i10, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new z83(objArr, i9, objArr2, i8, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean y(int i7, int i8) {
        return i7 < (i8 >> 1) + (i8 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof p73) && w() && ((p73) obj).w() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return d93.a(this);
    }

    @Override // com.google.android.gms.internal.ads.z63
    public e73<E> l() {
        e73<E> e73Var = this.f10116g;
        if (e73Var != null) {
            return e73Var;
        }
        e73<E> q7 = q();
        this.f10116g = q7;
        return q7;
    }

    @Override // com.google.android.gms.internal.ads.z63, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: m */
    public abstract h93<E> iterator();

    e73<E> q() {
        return e73.r(toArray());
    }

    boolean w() {
        return false;
    }
}
