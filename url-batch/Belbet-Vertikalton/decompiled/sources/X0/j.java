package X0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j extends H1.d {
    public static List l0(Object[] objArr) {
        j1.h.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        j1.h.d(asList, "asList(...)");
        return asList;
    }

    public static void m0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        j1.h.e(bArr, "<this>");
        j1.h.e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void n0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        j1.h.e(objArr, "<this>");
        j1.h.e(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void o0(Object[] objArr, int i, int i2) {
        j1.h.e(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static ArrayList p0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
