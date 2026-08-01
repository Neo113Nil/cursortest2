package X0;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class i extends z1.d {
    public static void g0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        g1.d.e(bArr, "<this>");
        g1.d.e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void h0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        g1.d.e(objArr, "<this>");
        g1.d.e(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void i0(Object[] objArr, int i, int i2) {
        g1.d.e(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static ArrayList j0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
