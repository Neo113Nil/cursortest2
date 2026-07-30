package h4;

import com.crrepa.ble.util.BleLog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static int f16692a = 4;

    private e0() {
    }

    public static int a(byte[] bArr) {
        byte b8 = bArr[2];
        com.crrepa.e.d.b().a((int) b8);
        return b8;
    }

    public static List<Integer> b(byte[] bArr) {
        if (bArr.length < 5) {
            return null;
        }
        byte b8 = bArr[2];
        if (b8 == 0) {
            com.crrepa.e.d.b().a().clear();
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = f16692a; i8 < bArr.length; i8 += 4) {
            int i9 = f16692a;
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            int i10 = i9 - 1;
            int i11 = i10;
            int i12 = 0;
            while (i10 >= 0) {
                byte b9 = bArr2[i10];
                if (b9 != 0) {
                    i12 += (b9 & 255) << (i11 * 8);
                }
                i11--;
                i10--;
            }
            BleLog.d("code: " + Integer.toHexString(i12));
            arrayList.add(Integer.valueOf(i12));
        }
        com.crrepa.e.d.b().a(arrayList);
        if (bArr[3] == 0) {
            return com.crrepa.e.d.b().a();
        }
        com.crrepa.e.d.b().a((byte) (b8 + 1));
        return null;
    }
}
