package O0;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class g extends q1.l {
    public static void u0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        X0.f.e(bArr, "<this>");
        X0.f.e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static final void v0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        X0.f.e(objArr, "<this>");
        X0.f.e(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static byte[] w0(int i, int i2, byte[] bArr) {
        X0.f.e(bArr, "<this>");
        int length = bArr.length;
        if (i2 <= length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
            X0.f.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public static void x0(Object[] objArr, int i, int i2) {
        X0.f.e(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static ArrayList y0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
