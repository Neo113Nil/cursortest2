package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class oi extends ni {
    public static boolean o(Object[] objArr, Object obj) {
        objArr.getClass();
        return u(objArr, obj) >= 0;
    }

    public static ArrayList p(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static IntRange q(int[] iArr) {
        return new IntRange(0, iArr.length - 1, 1);
    }

    public static int r(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int s(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static Object t(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int u(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String v(int i, Object[] objArr) {
        int i2 = i & 2;
        String str = BuildConfig.FLAVOR;
        String str2 = i2 != 0 ? BuildConfig.FLAVOR : "innermostOf(";
        if ((i & 4) == 0) {
            str = ")";
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i3 = 0;
        for (Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) ", ");
            }
            mp2.a(sb, obj, null);
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public static char w(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            ch2.k("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        lh.e("Array has more than one element.");
        return (char) 0;
    }

    public static final void x(Object[] objArr, HashSet hashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static List y(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new ai(objArr, false)) : pv.c(objArr[0]) : ah0.m;
    }

    public static Set z(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return fh0.m;
        }
        if (length == 1) {
            return qj2.b(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(li1.a(objArr.length));
        x(objArr, linkedHashSet);
        return linkedHashSet;
    }
}
