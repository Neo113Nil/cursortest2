package o4;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import l4.j;

/* loaded from: classes.dex */
public final class d extends e {

    private static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: f, reason: collision with root package name */
        final int[] f19883f;

        /* renamed from: g, reason: collision with root package name */
        final int f19884g;

        /* renamed from: h, reason: collision with root package name */
        final int f19885h;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        a(int[] iArr, int i7, int i8) {
            this.f19883f = iArr;
            this.f19884g = i7;
            this.f19885h = i8;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && d.h(this.f19883f, ((Integer) obj).intValue(), this.f19884g, this.f19885h) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                if (this.f19883f[this.f19884g + i7] != aVar.f19883f[aVar.f19884g + i7]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i7 = 1;
            for (int i8 = this.f19884g; i8 < this.f19885h; i8++) {
                i7 = (i7 * 31) + d.f(this.f19883f[i8]);
            }
            return i7;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer get(int i7) {
            j.g(i7, size());
            return Integer.valueOf(this.f19883f[this.f19884g + i7]);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int h7;
            if (!(obj instanceof Integer) || (h7 = d.h(this.f19883f, ((Integer) obj).intValue(), this.f19884g, this.f19885h)) < 0) {
                return -1;
            }
            return h7 - this.f19884g;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer set(int i7, Integer num) {
            j.g(i7, size());
            int[] iArr = this.f19883f;
            int i8 = this.f19884g;
            int i9 = iArr[i8 + i7];
            iArr[i8 + i7] = ((Integer) j.i(num)).intValue();
            return Integer.valueOf(i9);
        }

        int[] k() {
            return Arrays.copyOfRange(this.f19883f, this.f19884g, this.f19885h);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int i7;
            if (!(obj instanceof Integer) || (i7 = d.i(this.f19883f, ((Integer) obj).intValue(), this.f19884g, this.f19885h)) < 0) {
                return -1;
            }
            return i7 - this.f19884g;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f19885h - this.f19884g;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i7, int i8) {
            j.m(i7, i8, size());
            if (i7 == i8) {
                return Collections.emptyList();
            }
            int[] iArr = this.f19883f;
            int i9 = this.f19884g;
            return new a(iArr, i7 + i9, i9 + i8);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f19883f[this.f19884g]);
            int i7 = this.f19884g;
            while (true) {
                i7++;
                if (i7 >= this.f19885h) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f19883f[i7]);
            }
        }
    }

    public static List<Integer> c(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(iArr);
    }

    public static int d(long j7) {
        int i7 = (int) j7;
        j.f(((long) i7) == j7, "Out of range: %s", j7);
        return i7;
    }

    public static int e(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        return i7 > i8 ? 1 : 0;
    }

    public static int f(int i7) {
        return i7;
    }

    public static int g(int[] iArr, int i7) {
        return h(iArr, i7, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(int[] iArr, int i7, int i8, int i9) {
        while (i8 < i9) {
            if (iArr[i8] == i7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int[] iArr, int i7, int i8, int i9) {
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            if (iArr[i10] == i7) {
                return i10;
            }
        }
        return -1;
    }

    public static int j(long j7) {
        if (j7 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }

    public static int[] k(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).k();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            iArr[i7] = ((Number) j.i(array[i7])).intValue();
        }
        return iArr;
    }
}
