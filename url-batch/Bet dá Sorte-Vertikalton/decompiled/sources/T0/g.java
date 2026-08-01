package T0;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class g extends u1.l {
    public static void r0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        b1.d.e(bArr, "<this>");
        b1.d.e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static final void s0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        b1.d.e(objArr, "<this>");
        b1.d.e(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static byte[] t0(int i, int i2, byte[] bArr) {
        b1.d.e(bArr, "<this>");
        int length = bArr.length;
        if (i2 <= length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
            b1.d.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public static void u0(Object[] objArr, int i, int i2) {
        b1.d.e(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static ArrayList v0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
