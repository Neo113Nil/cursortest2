package x2;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class g extends r1.b {
    public static void F(int i, int i4, int i5, byte[] bArr, byte[] bArr2) {
        i3.d.e(bArr, "<this>");
        i3.d.e(bArr2, "destination");
        System.arraycopy(bArr, i4, bArr2, i, i5 - i4);
    }

    public static void G(int i, int i4, int i5, int[] iArr, int[] iArr2) {
        i3.d.e(iArr, "<this>");
        i3.d.e(iArr2, "destination");
        System.arraycopy(iArr, i4, iArr2, i, i5 - i4);
    }

    public static void H(Object[] objArr, Object[] objArr2, int i, int i4, int i5) {
        i3.d.e(objArr, "<this>");
        i3.d.e(objArr2, "destination");
        System.arraycopy(objArr, i4, objArr2, i, i5 - i4);
    }

    public static /* synthetic */ void I(Object[] objArr, Object[] objArr2, int i, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i = 0;
        }
        H(objArr, objArr2, 0, i, i4);
    }

    public static Object[] J(Object[] objArr, int i, int i4) {
        i3.d.e(objArr, "<this>");
        r1.b.h(i4, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i4);
        i3.d.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void K(Object[] objArr, int i, int i4) {
        i3.d.e(objArr, "<this>");
        Arrays.fill(objArr, i, i4, (Object) null);
    }

    public static ArrayList L(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
