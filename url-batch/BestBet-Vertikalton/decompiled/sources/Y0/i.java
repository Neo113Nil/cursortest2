package Y0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i extends H1.l {
    public static List i0(Object[] objArr) {
        k1.e.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        k1.e.d(asList, "asList(...)");
        return asList;
    }

    public static void j0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        k1.e.e(bArr, "<this>");
        k1.e.e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void k0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        k1.e.e(objArr, "<this>");
        k1.e.e(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void l0(Object[] objArr, int i, int i2) {
        k1.e.e(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static ArrayList m0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
