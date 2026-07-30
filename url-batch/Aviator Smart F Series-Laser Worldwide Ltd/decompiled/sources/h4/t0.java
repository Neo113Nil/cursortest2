package h4;

import com.crrepa.ble.util.BleLog;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class t0 {
    private t0() {
    }

    public static int a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return -1;
        }
        return bArr[0];
    }

    public static int[] b(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        byte[] bArr2 = new byte[4];
        int length = (bArr.length - 1) / 4;
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < length; i8++) {
            System.arraycopy(bArr, (4 * i8) + 1, bArr2, 0, 4);
            String stringBuffer = new StringBuffer(Integer.toBinaryString(com.crrepa.g1.c.d(bArr2))).reverse().toString();
            BleLog.i("parseSupportLanguageArray: " + stringBuffer);
            int i9 = 0;
            while (i9 < stringBuffer.length()) {
                int i10 = i9 + 1;
                if (Integer.parseInt(stringBuffer.substring(i9, i10)) > 0) {
                    arrayList.add(Integer.valueOf((i8 * 32) + i9));
                }
                i9 = i10;
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr;
    }
}
