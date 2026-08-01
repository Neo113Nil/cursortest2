package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class w extends v {
    public static boolean k(int[] iArr, int i3) {
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (i3 == iArr[i10]) {
                break;
            }
            i10++;
        }
        return i10 >= 0;
    }

    public static boolean l(Object[] objArr, Object obj) {
        objArr.getClass();
        return p(objArr, obj) >= 0;
    }

    public static ArrayList m(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object n(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int o(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int p(Object[] objArr, Object obj) {
        objArr.getClass();
        int i3 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i3 < length) {
                if (objArr[i3] == null) {
                    return i3;
                }
                i3++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i3 < length2) {
            if (obj.equals(objArr[i3])) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static String q(int i3, Object[] objArr) {
        String str = (i3 & 2) != 0 ? "" : "innermostOf(";
        String str2 = (i3 & 4) == 0 ? ")" : "";
        objArr.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str);
        int i10 = 0;
        for (Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) ", ");
            }
            kotlin.text.h.a(sb2, obj, null);
        }
        sb2.append((CharSequence) str2);
        return sb2.toString();
    }

    public static List r(double[] dArr) {
        dArr.getClass();
        int length = dArr.length;
        if (length == 0) {
            return j0.f5574d;
        }
        if (length == 1) {
            return x.c(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static List s(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length == 0) {
            return j0.f5574d;
        }
        if (length == 1) {
            return x.c(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f3 : fArr) {
            arrayList.add(Float.valueOf(f3));
        }
        return arrayList;
    }

    public static List t(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return j0.f5574d;
        }
        if (length == 1) {
            return x.c(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i3 : iArr) {
            arrayList.add(Integer.valueOf(i3));
        }
        return arrayList;
    }

    public static List u(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length == 0) {
            return j0.f5574d;
        }
        if (length == 1) {
            return x.c(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List v(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return j0.f5574d;
        }
        if (length == 1) {
            return x.c(objArr[0]);
        }
        List asList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        asList.getClass();
        return asList;
    }

    public static List w(boolean[] zArr) {
        zArr.getClass();
        int length = zArr.length;
        if (length == 0) {
            return j0.f5574d;
        }
        if (length == 1) {
            return x.c(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static Set x(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return l0.f5576d;
        }
        if (length == 1) {
            return u0.b(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(o0.a(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }
}
