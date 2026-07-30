package h4;

import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;

/* loaded from: classes3.dex */
public class n0 {
    private n0() {
    }

    public static CRPWatchFaceLayoutInfo a(byte[] bArr) {
        CRPWatchFaceLayoutInfo.CompressionType compressionType;
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo = new CRPWatchFaceLayoutInfo();
        cRPWatchFaceLayoutInfo.setTimePosition(bArr[0]);
        cRPWatchFaceLayoutInfo.setTimeTopContent(bArr[1]);
        cRPWatchFaceLayoutInfo.setTimeBottomContent(bArr[2]);
        cRPWatchFaceLayoutInfo.setTextColor(com.crrepa.g1.c.b(bArr[3], bArr[4]));
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, 5, bArr2, 0, 32);
        cRPWatchFaceLayoutInfo.setBackgroundPictureMd5(com.crrepa.g1.c.l(bArr2));
        int length = bArr.length - 37;
        if (4 == length) {
            int b8 = com.crrepa.g1.c.b(bArr[37], bArr[38]);
            int b9 = com.crrepa.g1.c.b(bArr[39], bArr[40]);
            cRPWatchFaceLayoutInfo.setHeight(b8);
            cRPWatchFaceLayoutInfo.setWidth(b8);
            cRPWatchFaceLayoutInfo.setThumHeight(b9);
            cRPWatchFaceLayoutInfo.setThumWidth(b9);
            compressionType = CRPWatchFaceLayoutInfo.CompressionType.LZO;
        } else if (9 == length) {
            int b10 = com.crrepa.g1.c.b(bArr[37], bArr[38]);
            int b11 = com.crrepa.g1.c.b(bArr[39], bArr[40]);
            int b12 = com.crrepa.g1.c.b(bArr[41], bArr[42]);
            int b13 = com.crrepa.g1.c.b(bArr[43], bArr[44]);
            compressionType = CRPWatchFaceLayoutInfo.CompressionType.valueOf(com.crrepa.g1.c.a(bArr[45]));
            cRPWatchFaceLayoutInfo.setHeight(b12);
            cRPWatchFaceLayoutInfo.setWidth(b10);
            cRPWatchFaceLayoutInfo.setThumHeight(b13);
            cRPWatchFaceLayoutInfo.setThumWidth(b11);
        } else {
            cRPWatchFaceLayoutInfo.setHeight(240);
            cRPWatchFaceLayoutInfo.setWidth(240);
            compressionType = CRPWatchFaceLayoutInfo.CompressionType.ORIGINAL;
        }
        cRPWatchFaceLayoutInfo.setCompressionType(compressionType);
        return cRPWatchFaceLayoutInfo;
    }
}
