package h4;

import com.crrepa.ble.conn.bean.CRPDeviceInfo;

/* loaded from: classes3.dex */
public class w {
    private w() {
    }

    public static CRPDeviceInfo a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 7) {
            return null;
        }
        byte[] bArr2 = new byte[3];
        System.arraycopy(bArr, 1, bArr2, 0, 3);
        String str = new String(bArr2);
        byte b8 = bArr[4];
        byte b9 = bArr[5];
        int length = bArr.length - 6;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 6, bArr3, 0, length);
        return new CRPDeviceInfo(str, b8, b9, 1 < length ? com.crrepa.g1.c.b(bArr3[1], bArr3[0]) : com.crrepa.g1.c.a(bArr3[0]));
    }
}
