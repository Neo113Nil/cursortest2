package h4;

import com.crrepa.ble.conn.bean.CRPContactConfigInfo;

/* loaded from: classes3.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f16765a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f16766b = -2;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f16767c = -18;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f16768d = 5;

    private p() {
    }

    public static CRPContactConfigInfo a(byte[] bArr) {
        if (bArr == null || 3 >= bArr.length) {
            return null;
        }
        CRPContactConfigInfo cRPContactConfigInfo = new CRPContactConfigInfo();
        byte b8 = bArr[1];
        cRPContactConfigInfo.setSupported(b8 != 0);
        cRPContactConfigInfo.setCount(b8);
        cRPContactConfigInfo.setWidth(bArr[2]);
        cRPContactConfigInfo.setHeight(bArr[3]);
        if (5 > bArr.length) {
            return cRPContactConfigInfo;
        }
        cRPContactConfigInfo.setNameLength(com.crrepa.g1.c.a(bArr[4]));
        return cRPContactConfigInfo;
    }
}
