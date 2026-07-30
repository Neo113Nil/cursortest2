package h4;

import com.crrepa.ble.conn.bean.CRPStepInfo;

/* loaded from: classes3.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16690a = 3;

    /* renamed from: b, reason: collision with root package name */
    private static final int f16691b = 4;

    private d0() {
    }

    public static CRPStepInfo a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length % 4 != 0) {
            return null;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        int k8 = com.crrepa.g1.c.k(bArr2);
        System.arraycopy(bArr, 4, bArr2, 0, 4);
        int k9 = com.crrepa.g1.c.k(bArr2) / 10000;
        System.arraycopy(bArr, 8, bArr2, 0, 4);
        CRPStepInfo cRPStepInfo = new CRPStepInfo(k8, com.crrepa.g1.c.k(bArr2) / 100, k9);
        if (12 < bArr.length) {
            System.arraycopy(bArr, 12, bArr2, 0, 4);
            cRPStepInfo.setTime(com.crrepa.g1.c.k(bArr2));
        }
        return cRPStepInfo;
    }

    public static CRPStepInfo b(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length % 3 != 0) {
            return null;
        }
        byte[] bArr2 = new byte[3];
        System.arraycopy(bArr, 0, bArr2, 0, 3);
        int k8 = com.crrepa.g1.c.k(bArr2);
        System.arraycopy(bArr, 3, bArr2, 0, 3);
        int k9 = com.crrepa.g1.c.k(bArr2);
        System.arraycopy(bArr, 6, bArr2, 0, 3);
        CRPStepInfo cRPStepInfo = new CRPStepInfo(k8, k9, com.crrepa.g1.c.k(bArr2));
        if (9 < bArr.length) {
            System.arraycopy(bArr, 9, bArr2, 0, 3);
            cRPStepInfo.setTime(com.crrepa.g1.c.k(bArr2));
        }
        return cRPStepInfo;
    }
}
