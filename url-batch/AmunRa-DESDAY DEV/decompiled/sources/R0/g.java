package R0;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class g extends s1.d {
    public static void n0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        Z0.d.e(bArr, "<this>");
        Z0.d.e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static final void o0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        Z0.d.e(objArr, "<this>");
        Z0.d.e(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static byte[] p0(int i, int i2, byte[] bArr) {
        Z0.d.e(bArr, "<this>");
        int length = bArr.length;
        if (i2 <= length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
            Z0.d.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public static void q0(Object[] objArr, int i, int i2) {
        Z0.d.e(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static ArrayList r0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
