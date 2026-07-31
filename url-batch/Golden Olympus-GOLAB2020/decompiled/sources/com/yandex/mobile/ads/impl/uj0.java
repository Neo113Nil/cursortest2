package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class uj0<E> extends qj0<E> implements Set<E> {

    /* renamed from: c, reason: collision with root package name */
    private transient sj0<E> f33152c;

    private static class a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        final Object[] f33153b;

        a(Object[] objArr) {
            this.f33153b = objArr;
        }

        Object readResolve() {
            return uj0.a(this.f33153b);
        }
    }

    uj0() {
    }

    static int a(int i4) {
        int max = Math.max(i4, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    public sj0<E> b() {
        sj0<E> sj0Var = this.f33152c;
        if (sj0Var != null) {
            return sj0Var;
        }
        sj0<E> g4 = g();
        this.f33152c = g4;
        return g4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof uj0) && (this instanceof ho1)) {
            uj0 uj0Var = (uj0) obj;
            uj0Var.getClass();
            if ((uj0Var instanceof ho1) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return lx1.a(this, obj);
    }

    sj0<E> g() {
        Object[] array = toArray();
        int i4 = sj0.f31764d;
        return sj0.b(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return lx1.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.qj0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    Object writeReplace() {
        return new a(toArray());
    }

    private static <E> uj0<E> b(int i4, Object... objArr) {
        if (i4 == 0) {
            return ho1.f26873j;
        }
        if (i4 != 1) {
            int a4 = a(i4);
            Object[] objArr2 = new Object[a4];
            int i5 = a4 - 1;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                Object obj = objArr[i8];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int a5 = ye0.a(hashCode);
                    while (true) {
                        int i9 = a5 & i5;
                        Object obj2 = objArr2[i9];
                        if (obj2 == null) {
                            objArr[i7] = obj;
                            objArr2[i9] = obj;
                            i6 += hashCode;
                            i7++;
                            break;
                        }
                        if (obj2.equals(obj)) {
                            break;
                        }
                        a5++;
                    }
                } else {
                    throw new NullPointerException(C1877de.a("at index ", i8));
                }
            }
            Arrays.fill(objArr, i7, i4, (Object) null);
            if (i7 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new ty1(obj3);
            }
            if (a(i7) < a4 / 2) {
                return b(i7, objArr);
            }
            int length = objArr.length;
            if (i7 < (length >> 1) + (length >> 2)) {
                objArr = Arrays.copyOf(objArr, i7);
            }
            return new ho1(objArr, i6, objArr2, i5, i7);
        }
        Object obj4 = objArr[0];
        Objects.requireNonNull(obj4);
        return new ty1(obj4);
    }

    public static uj0 a(Set set) {
        if ((set instanceof uj0) && !(set instanceof SortedSet)) {
            uj0 uj0Var = (uj0) set;
            if (!uj0Var.f()) {
                return uj0Var;
            }
        }
        Object[] array = set.toArray();
        return b(array.length, array);
    }

    public static <E> uj0<E> a(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return ho1.f26873j;
        }
        if (length != 1) {
            return b(eArr.length, (Object[]) eArr.clone());
        }
        return new ty1(eArr[0]);
    }

    public static uj0 a(String str, String str2) {
        return b(2, str, str2);
    }

    public static uj0 a(String str, String str2, String str3) {
        return b(3, str, str2, str3);
    }
}
