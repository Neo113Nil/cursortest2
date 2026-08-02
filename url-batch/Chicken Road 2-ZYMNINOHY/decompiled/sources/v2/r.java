package v2;

import E.AbstractC0005f;
import a.AbstractC0124a;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class r {
    public static int a(int i4) {
        if (i4 < 3) {
            d(i4, "expectedSize");
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) Math.ceil(i4 / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void b(int i4, Object[] objArr) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (objArr[i5] == null) {
                throw new NullPointerException(AbstractC0005f.j(i5, "at index "));
            }
        }
    }

    public static void c(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void d(int i4, String str) {
        if (i4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i4);
    }

    public static Object e(int i4) {
        if (i4 < 2 || i4 > 1073741824 || Integer.highestOneBit(i4) != i4) {
            throw new IllegalArgumentException(AbstractC0005f.j(i4, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i4 <= 256 ? new byte[i4] : i4 <= 65536 ? new short[i4] : new int[i4];
    }

    public static boolean f(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean g(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static k0 h(Set set, u2.e eVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof k0)) {
                set.getClass();
                return new k0(set, eVar);
            }
            k0 k0Var = (k0) set;
            u2.e eVar2 = k0Var.f15652b;
            eVar2.getClass();
            return new k0(k0Var.f15651a, new u2.f(Arrays.asList(eVar2, eVar)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof k0)) {
            set2.getClass();
            return new l0(set2, eVar);
        }
        k0 k0Var2 = (k0) set2;
        u2.e eVar3 = k0Var2.f15652b;
        eVar3.getClass();
        return new l0((SortedSet) k0Var2.f15651a, new u2.f(Arrays.asList(eVar3, eVar)));
    }

    public static Object i(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object j(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int k(Set set) {
        Iterator it = set.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i4 = ~(~(i4 + (next != null ? next.hashCode() : 0)));
        }
        return i4;
    }

    public static j0 l(Set set, M m4) {
        AbstractC0124a.o(set, "set1");
        AbstractC0124a.o(m4, "set2");
        return new j0(set, m4);
    }

    public static int m(int i4, int i5, int i6) {
        return (i4 & (~i6)) | (i5 & i6);
    }

    public static ArrayList n(Object... objArr) {
        int length = objArr.length;
        d(length, "arraySize");
        ArrayList arrayList = new ArrayList(O3.d.z(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        t(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = m(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int o(Object obj, Object obj2, int i4, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int r4 = r(obj);
        int i5 = r4 & i4;
        int s4 = s(i5, obj3);
        if (s4 != 0) {
            int i6 = ~i4;
            int i7 = r4 & i6;
            int i8 = -1;
            while (true) {
                int i9 = s4 - 1;
                int i10 = iArr[i9];
                if ((i10 & i6) != i7 || !V3.b.n(obj, objArr[i9]) || (objArr2 != null && !V3.b.n(obj2, objArr2[i9]))) {
                    int i11 = i10 & i4;
                    if (i11 == 0) {
                        break;
                    }
                    i8 = i9;
                    s4 = i11;
                }
            }
        }
        return -1;
    }

    public static void p(List list, u2.e eVar, int i4, int i5) {
        for (int size = list.size() - 1; size > i5; size--) {
            if (eVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            list.remove(i6);
        }
    }

    public static int q(int i4) {
        return (int) (Integer.rotateLeft((int) (i4 * (-862048943)), 15) * 461845907);
    }

    public static int r(Object obj) {
        return q(obj == null ? 0 : obj.hashCode());
    }

    public static int s(int i4, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i4] & 255 : obj instanceof short[] ? ((short[]) obj)[i4] & 65535 : ((int[]) obj)[i4];
    }

    public static void t(int i4, int i5, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i4] = (byte) i5;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i4] = (short) i5;
        } else {
            ((int[]) obj)[i4] = i5;
        }
    }

    public static AbstractList u(List list, u2.d dVar) {
        return list instanceof RandomAccess ? new S(list, dVar) : new T(list, dVar);
    }
}
