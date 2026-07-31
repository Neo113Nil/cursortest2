package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class pp0 extends qp0 {

    private static class a extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        final int[] f30516b;

        /* renamed from: c, reason: collision with root package name */
        final int f30517c;

        /* renamed from: d, reason: collision with root package name */
        final int f30518d;

        a(int i4, int i5, int[] iArr) {
            this.f30516b = iArr;
            this.f30517c = i4;
            this.f30518d = i5;
        }

        final int[] b() {
            return Arrays.copyOfRange(this.f30516b, this.f30517c, this.f30518d);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            int[] iArr = this.f30516b;
            int intValue = ((Integer) obj).intValue();
            int i4 = this.f30517c;
            int i5 = this.f30518d;
            while (i4 < i5) {
                if (iArr[i4] == intValue) {
                    return i4 != -1;
                }
                i4++;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int i4 = this.f30518d - this.f30517c;
            if (aVar.f30518d - aVar.f30517c != i4) {
                return false;
            }
            for (int i5 = 0; i5 < i4; i5++) {
                if (this.f30516b[this.f30517c + i5] != aVar.f30516b[aVar.f30517c + i5]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i4) {
            nj1.a(i4, this.f30518d - this.f30517c);
            return Integer.valueOf(this.f30516b[this.f30517c + i4]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i4 = 1;
            for (int i5 = this.f30517c; i5 < this.f30518d; i5++) {
                i4 = (i4 * 31) + this.f30516b[i5];
            }
            return i4;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f30516b;
                int intValue = ((Integer) obj).intValue();
                int i4 = this.f30517c;
                int i5 = this.f30518d;
                while (true) {
                    if (i4 >= i5) {
                        i4 = -1;
                        break;
                    }
                    if (iArr[i4] == intValue) {
                        break;
                    }
                    i4++;
                }
                if (i4 >= 0) {
                    return i4 - this.f30517c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f30516b;
                int intValue = ((Integer) obj).intValue();
                int i4 = this.f30517c;
                int i5 = this.f30518d - 1;
                while (true) {
                    if (i5 < i4) {
                        i5 = -1;
                        break;
                    }
                    if (iArr[i5] == intValue) {
                        break;
                    }
                    i5--;
                }
                if (i5 >= 0) {
                    return i5 - this.f30517c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i4, Object obj) {
            Integer num = (Integer) obj;
            nj1.a(i4, this.f30518d - this.f30517c);
            int[] iArr = this.f30516b;
            int i5 = this.f30517c + i4;
            int i6 = iArr[i5];
            num.getClass();
            iArr[i5] = num.intValue();
            return Integer.valueOf(i6);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f30518d - this.f30517c;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i4, int i5) {
            nj1.a(i4, i5, this.f30518d - this.f30517c);
            if (i4 == i5) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.f30516b;
            int i6 = this.f30517c;
            return new a(i4 + i6, i6 + i5, iArr);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb = new StringBuilder((this.f30518d - this.f30517c) * 5);
            sb.append('[');
            sb.append(this.f30516b[this.f30517c]);
            int i4 = this.f30517c;
            while (true) {
                i4++;
                if (i4 >= this.f30518d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f30516b[i4]);
            }
        }
    }

    public static List<Integer> a(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new a(0, iArr.length, iArr);
    }

    public static int b(long j4) {
        if (j4 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j4 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j4;
    }

    public static int a(long j4) {
        int i4 = (int) j4;
        if (((long) i4) == j4) {
            return i4;
        }
        throw new IllegalArgumentException(x22.a("Out of range: %s", Long.valueOf(j4)));
    }

    public static int[] a(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof a) {
            return ((a) abstractCollection).b();
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = array[i4];
            obj.getClass();
            iArr[i4] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
