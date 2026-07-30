package h4;

import com.crrepa.ble.conn.bean.CRPHandWashingPeriodInfo;

/* loaded from: classes3.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16743a = 6;

    private m0() {
    }

    public static CRPHandWashingPeriodInfo a(byte[] bArr) {
        if (bArr.length < 6) {
            return null;
        }
        return new CRPHandWashingPeriodInfo(bArr[1] == 1, bArr[2], bArr[3], bArr[4], bArr[5] & 255);
    }
}
