package h4;

import com.crrepa.ble.conn.bean.CRPPeriodTimeInfo;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16702a = 4;

    private h() {
    }

    public static CRPPeriodTimeInfo a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length != 4) {
            return null;
        }
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, 0, bArr2, 0, 2);
        long b8 = com.crrepa.g1.c.b(bArr2[1], bArr2[0]);
        System.arraycopy(bArr, 2, bArr2, 0, 2);
        long b9 = com.crrepa.g1.c.b(bArr2[1], bArr2[0]);
        return new CRPPeriodTimeInfo((int) (b8 / 60), (int) (b8 % 60), (int) (b9 / 60), (int) (b9 % 60));
    }
}
