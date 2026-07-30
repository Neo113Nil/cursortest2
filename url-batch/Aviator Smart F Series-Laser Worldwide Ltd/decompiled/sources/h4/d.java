package h4;

import com.crrepa.ble.conn.bean.CRPAiWatchFacePreviewInfo;
import com.crrepa.ble.conn.bean.CRPJieliPhotoWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPPhotoWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.crrepa.ble.conn.type.CRPPhotoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static int f16687a;

    /* renamed from: b, reason: collision with root package name */
    private static int f16688b;

    /* renamed from: c, reason: collision with root package name */
    private static int f16689c;

    private d() {
    }

    public static void a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 9) {
            return;
        }
        f16687a = (int) (com.crrepa.g1.c.f(Arrays.copyOfRange(bArr, 3, 7)) / 1024);
        f16688b = com.crrepa.g1.c.a(bArr[7]);
        f16689c = com.crrepa.g1.c.a(bArr[8]);
    }

    public static CRPJieliPhotoWatchFaceInfo b(byte[] bArr) {
        if (bArr == null || bArr.length < 16) {
            return null;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 3, bArr.length);
        CRPJieliPhotoWatchFaceInfo cRPJieliPhotoWatchFaceInfo = new CRPJieliPhotoWatchFaceInfo();
        cRPJieliPhotoWatchFaceInfo.setPhotoCount(copyOfRange[0]);
        cRPJieliPhotoWatchFaceInfo.setSupportPointer(copyOfRange[1] == 1);
        cRPJieliPhotoWatchFaceInfo.setSupportSecondHand(copyOfRange[2] == 1);
        cRPJieliPhotoWatchFaceInfo.setSupportSecondHand(copyOfRange[3] == 1);
        int b8 = com.crrepa.g1.c.b(copyOfRange[5], copyOfRange[4]);
        int b9 = com.crrepa.g1.c.b(copyOfRange[7], copyOfRange[6]);
        cRPJieliPhotoWatchFaceInfo.setHandX(b8);
        cRPJieliPhotoWatchFaceInfo.setHandY(b9);
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[4];
        int i8 = 8;
        for (int i9 = 0; i9 < cRPJieliPhotoWatchFaceInfo.getPhotoCount(); i9++) {
            System.arraycopy(copyOfRange, i8, bArr2, 0, 4);
            arrayList.add(String.valueOf(com.crrepa.g1.c.f(bArr2)));
            i8 += 4;
        }
        cRPJieliPhotoWatchFaceInfo.setPhotoList(arrayList);
        if (cRPJieliPhotoWatchFaceInfo.isSupportPointer()) {
            System.arraycopy(copyOfRange, i8 + (cRPJieliPhotoWatchFaceInfo.getPhotoCount() * 4), bArr2, 0, 4);
            cRPJieliPhotoWatchFaceInfo.setWatchHandID((int) com.crrepa.g1.c.f(bArr2));
        }
        return cRPJieliPhotoWatchFaceInfo;
    }

    public static CRPPhotoWatchFaceLayoutInfo c(byte[] bArr) {
        if (bArr.length < 30) {
            return null;
        }
        int i8 = 0;
        CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo = new CRPJieliWatchFaceLayoutInfo(CRPWatchFaceType.getInstance(bArr[3]), bArr[4] > 0);
        cRPJieliWatchFaceLayoutInfo.setPhotoDisplayMode(CRPPhotoWatchFaceDisplayMode.getInstance(bArr[5]));
        cRPJieliWatchFaceLayoutInfo.setFixedPhotoIndex(bArr[6]);
        cRPJieliWatchFaceLayoutInfo.setElementColor(((bArr[7] & 255) << 24) | ((bArr[8] & 255) << 16) | ((bArr[9] & 255) << 8) | (bArr[10] & 255));
        CRPJieliWatchFaceLayoutInfo.ElementBean[] elementBeanArr = new CRPJieliWatchFaceLayoutInfo.ElementBean[4];
        for (int i9 = 11; i9 < bArr.length; i9 += 5) {
            byte b8 = bArr[i9];
            int a8 = com.crrepa.g1.c.a(bArr[i9 + 2], bArr[i9 + 1]);
            int a9 = com.crrepa.g1.c.a(bArr[i9 + 4], bArr[i9 + 3]);
            if (i8 < 4) {
                elementBeanArr[i8] = new CRPJieliWatchFaceLayoutInfo.ElementBean(b8, a8, a9);
                i8++;
            }
        }
        cRPJieliWatchFaceLayoutInfo.setElementArray(elementBeanArr);
        return new CRPPhotoWatchFaceLayoutInfo(f16687a, f16688b, f16689c, cRPJieliWatchFaceLayoutInfo);
    }

    public static CRPAiWatchFacePreviewInfo d(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 9) {
            return null;
        }
        return new CRPAiWatchFacePreviewInfo(com.crrepa.g1.c.b(bArr[4], bArr[3]), com.crrepa.g1.c.b(bArr[6], bArr[5]), com.crrepa.g1.c.b(bArr[8], bArr[7]));
    }

    public static CRPWatchFaceLayoutInfo e(byte[] bArr) {
        CRPWatchFaceLayoutInfo.CompressionType compressionType;
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo = new CRPWatchFaceLayoutInfo();
        cRPWatchFaceLayoutInfo.setTimePosition(bArr[3]);
        cRPWatchFaceLayoutInfo.setTimeTopContent(bArr[4]);
        cRPWatchFaceLayoutInfo.setTimeBottomContent(bArr[5]);
        cRPWatchFaceLayoutInfo.setTextColor(com.crrepa.g1.c.b(bArr[6], bArr[7]));
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, 8, bArr2, 0, 32);
        cRPWatchFaceLayoutInfo.setBackgroundPictureMd5(com.crrepa.g1.c.l(bArr2));
        int length = bArr.length - 40;
        if (4 == length) {
            int b8 = com.crrepa.g1.c.b(bArr[40], bArr[41]);
            int b9 = com.crrepa.g1.c.b(bArr[42], bArr[43]);
            cRPWatchFaceLayoutInfo.setHeight(b8);
            cRPWatchFaceLayoutInfo.setWidth(b8);
            cRPWatchFaceLayoutInfo.setThumHeight(b9);
            cRPWatchFaceLayoutInfo.setThumWidth(b9);
            compressionType = CRPWatchFaceLayoutInfo.CompressionType.LZO;
        } else if (9 == length) {
            int b10 = com.crrepa.g1.c.b(bArr[40], bArr[41]);
            int b11 = com.crrepa.g1.c.b(bArr[42], bArr[43]);
            int b12 = com.crrepa.g1.c.b(bArr[44], bArr[45]);
            int b13 = com.crrepa.g1.c.b(bArr[46], bArr[47]);
            compressionType = CRPWatchFaceLayoutInfo.CompressionType.valueOf(com.crrepa.g1.c.a(bArr[48]));
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
