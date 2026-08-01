package S0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f extends w1.l {
    public static List b0(Object[] objArr) {
        d1.d.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        d1.d.d(asList, "asList(...)");
        return asList;
    }

    public static void c0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        d1.d.e(bArr, "<this>");
        d1.d.e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static final void d0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        d1.d.e(objArr, "<this>");
        d1.d.e(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static byte[] e0(int i, int i2, byte[] bArr) {
        d1.d.e(bArr, "<this>");
        int length = bArr.length;
        if (i2 <= length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
            d1.d.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public static void f0(Object[] objArr, int i, int i2) {
        d1.d.e(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static ArrayList g0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
