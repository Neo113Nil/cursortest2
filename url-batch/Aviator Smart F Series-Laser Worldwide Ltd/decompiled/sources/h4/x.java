package h4;

import com.crrepa.ble.conn.bean.CRPPeriodTimeInfo;

/* loaded from: classes3.dex */
public class x {
    private x() {
    }

    public static CRPPeriodTimeInfo a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length != 6) {
            return null;
        }
        return new CRPPeriodTimeInfo(bArr[2], bArr[3], bArr[4], bArr[5]);
    }
}
