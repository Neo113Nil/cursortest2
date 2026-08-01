package n2;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class f extends l0.g {
    public static void B(int i4, int i5, int i6, byte[] bArr, byte[] bArr2) {
        u2.c.e(bArr, "<this>");
        u2.c.e(bArr2, "destination");
        System.arraycopy(bArr, i5, bArr2, i4, i6 - i5);
    }

    public static void C(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        u2.c.e(iArr, "<this>");
        u2.c.e(iArr2, "destination");
        System.arraycopy(iArr, i5, iArr2, i4, i6 - i5);
    }

    public static void D(Object[] objArr, Object[] objArr2, int i4, int i5, int i6) {
        u2.c.e(objArr, "<this>");
        u2.c.e(objArr2, "destination");
        System.arraycopy(objArr, i5, objArr2, i4, i6 - i5);
    }

    public static /* synthetic */ void E(Object[] objArr, Object[] objArr2, int i4, int i5, int i6) {
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        D(objArr, objArr2, 0, i4, i5);
    }

    public static void F(Object[] objArr, int i4, int i5) {
        u2.c.e(objArr, "<this>");
        Arrays.fill(objArr, i4, i5, (Object) null);
    }

    public static ArrayList G(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
