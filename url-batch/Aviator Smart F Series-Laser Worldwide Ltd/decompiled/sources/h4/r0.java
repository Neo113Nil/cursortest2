package h4;

import com.crrepa.ble.conn.bean.CRPSupportWorldClockInfo;
import com.crrepa.ble.conn.bean.CRPWorldClockInfo;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class r0 {
    private r0() {
    }

    public static CRPSupportWorldClockInfo a(byte[] bArr) {
        if (bArr.length < 3) {
            return null;
        }
        byte b8 = bArr[2];
        ArrayList arrayList = new ArrayList();
        if (4 < bArr.length) {
            for (int i8 = 4; i8 < bArr.length; i8++) {
                arrayList.add(Integer.valueOf(bArr[i8]));
            }
        }
        return new CRPSupportWorldClockInfo(b8, arrayList);
    }

    public static CRPWorldClockInfo b(byte[] bArr) {
        if (bArr.length < 19) {
            return null;
        }
        CRPWorldClockInfo cRPWorldClockInfo = new CRPWorldClockInfo();
        cRPWorldClockInfo.setId(bArr[2]);
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 3, bArr2, 0, 4);
        cRPWorldClockInfo.setTimeZone((int) com.crrepa.g1.c.f(bArr2));
        System.arraycopy(bArr, 7, bArr2, 0, 4);
        cRPWorldClockInfo.setLongitude(com.crrepa.g1.c.g(bArr2) / 1000000.0d);
        System.arraycopy(bArr, 11, bArr2, 0, 4);
        cRPWorldClockInfo.setLatitude(com.crrepa.g1.c.g(bArr2) / 1000000.0d);
        System.arraycopy(bArr, 15, bArr2, 0, 4);
        cRPWorldClockInfo.setJetLag((int) com.crrepa.g1.c.f(bArr2));
        int length = bArr.length - 19;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 19, bArr3, 0, length);
        cRPWorldClockInfo.setCity(new String(bArr3));
        return cRPWorldClockInfo;
    }
}
