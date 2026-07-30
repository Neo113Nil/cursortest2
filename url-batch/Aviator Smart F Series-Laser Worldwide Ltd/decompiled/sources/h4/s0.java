package h4;

import com.crrepa.ble.conn.bean.CRPJieliPhotoWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceConfigInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceLayoutInfo;
import com.crrepa.ble.conn.type.CRPPhotoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPVideoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    private static int f16784a;

    /* renamed from: b, reason: collision with root package name */
    private static int f16785b;

    /* renamed from: c, reason: collision with root package name */
    private static int f16786c;

    /* renamed from: d, reason: collision with root package name */
    private static int f16787d;

    private s0() {
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 7) {
            return 0;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 1, bArr2, 0, 4);
        int f8 = (int) (com.crrepa.g1.c.f(bArr2) / 1024);
        f16784a = bArr[5];
        f16785b = bArr[6];
        return f8;
    }

    public static CRPJieliWatchFaceConfigInfo b(byte[] bArr) {
        if (bArr.length < 20) {
            return null;
        }
        CRPJieliWatchFaceConfigInfo cRPJieliWatchFaceConfigInfo = new CRPJieliWatchFaceConfigInfo();
        cRPJieliWatchFaceConfigInfo.setApiVersion(f16786c);
        cRPJieliWatchFaceConfigInfo.setSupportType(f16787d);
        cRPJieliWatchFaceConfigInfo.setMaxPhotoCount(f16784a);
        cRPJieliWatchFaceConfigInfo.setCurrentPhotoCount(f16785b);
        int b8 = com.crrepa.g1.c.b(bArr[2], bArr[1]);
        int b9 = com.crrepa.g1.c.b(bArr[4], bArr[3]);
        int b10 = com.crrepa.g1.c.b(bArr[6], bArr[5]);
        int b11 = com.crrepa.g1.c.b(bArr[8], bArr[7]);
        int b12 = com.crrepa.g1.c.b(bArr[10], bArr[9]);
        int b13 = com.crrepa.g1.c.b(bArr[12], bArr[11]);
        cRPJieliWatchFaceConfigInfo.setWidth(b8);
        cRPJieliWatchFaceConfigInfo.setHeight(b9);
        cRPJieliWatchFaceConfigInfo.setCornerRadius(b10);
        cRPJieliWatchFaceConfigInfo.setThumbWidth(b11);
        cRPJieliWatchFaceConfigInfo.setThumbHeight(b12);
        cRPJieliWatchFaceConfigInfo.setThumbCornerRadius(b13);
        int b14 = com.crrepa.g1.c.b(bArr[14], bArr[13]);
        int b15 = com.crrepa.g1.c.b(bArr[16], bArr[15]);
        int b16 = com.crrepa.g1.c.b(bArr[18], bArr[17]);
        int b17 = com.crrepa.g1.c.b(bArr[20], bArr[19]);
        cRPJieliWatchFaceConfigInfo.setTimeWidth(b14);
        cRPJieliWatchFaceConfigInfo.setTimeHeight(b15);
        cRPJieliWatchFaceConfigInfo.setOtherWidth(b16);
        cRPJieliWatchFaceConfigInfo.setOtherHeight(b17);
        return cRPJieliWatchFaceConfigInfo;
    }

    public static CRPJieliWatchFaceLayoutInfo c(byte[] bArr) {
        if (bArr.length < 28) {
            return null;
        }
        CRPWatchFaceType cRPWatchFaceType = CRPWatchFaceType.getInstance(bArr[1]);
        int i8 = 0;
        CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo = new CRPJieliWatchFaceLayoutInfo(cRPWatchFaceType, bArr[2] > 0);
        if (cRPWatchFaceType == CRPWatchFaceType.PHOTO_WATCH_FACE) {
            cRPJieliWatchFaceLayoutInfo.setPhotoDisplayMode(CRPPhotoWatchFaceDisplayMode.getInstance(bArr[3]));
            cRPJieliWatchFaceLayoutInfo.setFixedPhotoIndex(bArr[4]);
        } else if (cRPWatchFaceType == CRPWatchFaceType.VIDEO_WATCH_FACE) {
            cRPJieliWatchFaceLayoutInfo.setVideoDisplayMode(CRPVideoWatchFaceDisplayMode.getInstance(bArr[3]));
        }
        cRPJieliWatchFaceLayoutInfo.setElementColor(((bArr[5] & 255) << 24) | ((bArr[6] & 255) << 16) | ((bArr[7] & 255) << 8) | (bArr[8] & 255));
        CRPJieliWatchFaceLayoutInfo.ElementBean[] elementBeanArr = new CRPJieliWatchFaceLayoutInfo.ElementBean[4];
        for (int i9 = 9; i9 < bArr.length; i9 += 5) {
            byte b8 = bArr[i9];
            int a8 = com.crrepa.g1.c.a(bArr[i9 + 2], bArr[i9 + 1]);
            int a9 = com.crrepa.g1.c.a(bArr[i9 + 4], bArr[i9 + 3]);
            if (i8 < 4) {
                elementBeanArr[i8] = new CRPJieliWatchFaceLayoutInfo.ElementBean(b8, a8, a9);
                i8++;
            }
        }
        cRPJieliWatchFaceLayoutInfo.setElementArray(elementBeanArr);
        return cRPJieliWatchFaceLayoutInfo;
    }

    public static CRPJieliPhotoWatchFaceInfo d(byte[] bArr) {
        if (bArr == null || bArr.length < 12) {
            return null;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, bArr.length);
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

    public static void e(byte[] bArr) {
        if (bArr.length < 2) {
            return;
        }
        f16786c = com.crrepa.g1.c.a(bArr[1]);
        f16787d = com.crrepa.g1.c.a(bArr[2]);
    }
}
