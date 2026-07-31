package o2;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f19706a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f19707b = {"", "A", "B", "C"};

    public static String a(int i7, int i8, int i9) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
    }

    public static List<byte[]> b(boolean z6) {
        return Collections.singletonList(z6 ? new byte[]{1} : new byte[]{0});
    }

    public static String c(int i7, boolean z6, int i8, int i9, int[] iArr, int i10) {
        Object[] objArr = new Object[5];
        objArr[0] = f19707b[i7];
        objArr[1] = Integer.valueOf(i8);
        objArr[2] = Integer.valueOf(i9);
        objArr[3] = Character.valueOf(z6 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i10);
        StringBuilder sb = new StringBuilder(m0.C("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i11 = 0; i11 < length; i11++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i11])));
        }
        return sb.toString();
    }

    public static byte[] d(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = f19706a;
        byte[] bArr3 = new byte[bArr2.length + i8];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i7, bArr3, bArr2.length, i8);
        return bArr3;
    }

    private static int e(byte[] bArr, int i7) {
        int length = bArr.length - f19706a.length;
        while (i7 <= length) {
            if (f(bArr, i7)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    private static boolean f(byte[] bArr, int i7) {
        if (bArr.length - i7 <= f19706a.length) {
            return false;
        }
        int i8 = 0;
        while (true) {
            byte[] bArr2 = f19706a;
            if (i8 >= bArr2.length) {
                return true;
            }
            if (bArr[i7 + i8] != bArr2[i8]) {
                return false;
            }
            i8++;
        }
    }

    public static Pair<Integer, Integer> g(byte[] bArr) {
        a0 a0Var = new a0(bArr);
        a0Var.O(9);
        int C = a0Var.C();
        a0Var.O(20);
        return Pair.create(Integer.valueOf(a0Var.G()), Integer.valueOf(C));
    }

    public static boolean h(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static byte[][] i(byte[] bArr) {
        if (!f(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        do {
            arrayList.add(Integer.valueOf(i7));
            i7 = e(bArr, i7 + f19706a.length);
        } while (i7 != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i8 = 0;
        while (i8 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i8)).intValue();
            int intValue2 = (i8 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i8 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i8] = bArr3;
            i8++;
        }
        return bArr2;
    }
}
