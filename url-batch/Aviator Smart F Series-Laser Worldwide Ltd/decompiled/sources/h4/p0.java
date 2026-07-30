package h4;

import com.crrepa.ble.conn.bean.CRPBluetrumWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPHisiliconWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPHisiliconWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPJieliSupportWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPSifliSupportWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPSupportWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceElementInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceListInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceScreenInfo;
import com.crrepa.ble.conn.type.CRPPhotoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPVideoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.crrepa.ble.util.BleLog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16769a = 2;

    /* renamed from: b, reason: collision with root package name */
    private static final int f16770b = 2;

    private p0() {
    }

    public static CRPBluetrumWatchFaceInfo a(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return null;
        }
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 2, bArr2, 0, length);
        return new CRPBluetrumWatchFaceInfo(bArr[0], bArr[1], bArr2);
    }

    public static List<Integer> b(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[4];
        for (int i8 = 0; i8 < bArr.length; i8 += 4) {
            System.arraycopy(bArr, i8, bArr2, 0, 4);
            arrayList.add(Integer.valueOf((int) com.crrepa.g1.c.f(bArr2)));
        }
        return arrayList;
    }

    public static CRPHisiliconWatchFaceInfo c(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return null;
        }
        int a8 = com.crrepa.g1.c.a(bArr[0]);
        int a9 = com.crrepa.g1.c.a(bArr[1]);
        int a10 = com.crrepa.g1.c.a(bArr[2]);
        int a11 = com.crrepa.g1.c.a(bArr[3]);
        ArrayList arrayList = new ArrayList();
        if (5 < bArr.length) {
            for (int i8 = 5; i8 < bArr.length; i8 += 4) {
                byte[] bArr2 = new byte[4];
                System.arraycopy(bArr, i8, bArr2, 0, 4);
                arrayList.add(Integer.valueOf((int) com.crrepa.g1.c.f(bArr2)));
            }
        }
        return new CRPHisiliconWatchFaceInfo(a8, a9, a10, a11, arrayList);
    }

    public static CRPHisiliconWatchFaceLayoutInfo d(byte[] bArr) {
        if (bArr == null || bArr.length < 11) {
            return null;
        }
        CRPHisiliconWatchFaceLayoutInfo cRPHisiliconWatchFaceLayoutInfo = new CRPHisiliconWatchFaceLayoutInfo();
        cRPHisiliconWatchFaceLayoutInfo.setWatchFaceType(CRPWatchFaceType.getInstance(bArr[0]));
        cRPHisiliconWatchFaceLayoutInfo.setX(com.crrepa.g1.c.b(bArr[2], bArr[1]));
        cRPHisiliconWatchFaceLayoutInfo.setY(com.crrepa.g1.c.b(bArr[4], bArr[3]));
        cRPHisiliconWatchFaceLayoutInfo.setTimeTopContent(bArr[5]);
        cRPHisiliconWatchFaceLayoutInfo.setTimeBottomContent(bArr[6]);
        cRPHisiliconWatchFaceLayoutInfo.setTextColor((bArr[10] & 255) | ((bArr[7] & 255) << 24) | ((bArr[8] & 255) << 16) | ((bArr[9] & 255) << 8));
        return cRPHisiliconWatchFaceLayoutInfo;
    }

    public static CRPJieliSupportWatchFaceInfo e(byte[] bArr) {
        if (bArr == null || bArr.length < 9) {
            return null;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        int f8 = (int) com.crrepa.g1.c.f(bArr2);
        System.arraycopy(bArr, 4, bArr2, 0, 4);
        int f9 = (int) com.crrepa.g1.c.f(bArr2);
        ArrayList arrayList = new ArrayList();
        for (int i8 = 8; i8 < bArr.length; i8++) {
            arrayList.add(Integer.valueOf(com.crrepa.g1.c.a(bArr[i8])));
        }
        return new CRPJieliSupportWatchFaceInfo(f8, f9, arrayList);
    }

    public static List<String> f(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length % 4 != 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 < bArr.length; i8 += 4) {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, i8, bArr2, 0, 4);
            arrayList.add(String.valueOf(com.crrepa.g1.c.f(bArr2)));
        }
        return arrayList;
    }

    public static CRPPhotoWatchFaceDisplayMode g(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return CRPPhotoWatchFaceDisplayMode.getInstance(bArr[0]);
    }

    public static CRPSifliSupportWatchFaceInfo h(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length < 2) {
            return null;
        }
        int a8 = com.crrepa.g1.c.a(bArr[0]);
        ArrayList arrayList = new ArrayList();
        if (bArr[1] > 0) {
            for (int i8 = 2; i8 < bArr.length; i8 += 4) {
                CRPSifliSupportWatchFaceInfo.InstalledState installedState = CRPSifliSupportWatchFaceInfo.InstalledState.getInstance(bArr[i8]);
                byte[] bArr2 = new byte[3];
                System.arraycopy(bArr, i8 + 1, bArr2, 0, 3);
                arrayList.add(new CRPSifliSupportWatchFaceInfo.WatchFace(installedState, com.crrepa.g1.c.k(bArr2)));
            }
        }
        return new CRPSifliSupportWatchFaceInfo(a8, arrayList);
    }

    public static CRPSupportWatchFaceInfo i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length < 2) {
            return null;
        }
        int b8 = com.crrepa.g1.c.b(bArr[0], bArr[1]);
        BleLog.i("watch face index: " + b8);
        ArrayList arrayList = new ArrayList();
        for (int i8 = 2; i8 < bArr.length; i8++) {
            arrayList.add(Integer.valueOf(com.crrepa.g1.c.a(bArr[i8])));
        }
        return new CRPSupportWatchFaceInfo(b8, arrayList);
    }

    public static CRPVideoWatchFaceDisplayMode j(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return CRPVideoWatchFaceDisplayMode.getInstance(bArr[0]);
    }

    public static CRPWatchFaceElementInfo k(byte[] bArr) {
        if (bArr == null || bArr.length < 9) {
            return null;
        }
        CRPWatchFaceElementInfo cRPWatchFaceElementInfo = new CRPWatchFaceElementInfo();
        cRPWatchFaceElementInfo.setWatchFaceType(CRPWatchFaceType.getInstance(bArr[0]));
        cRPWatchFaceElementInfo.setTimeWidth(com.crrepa.g1.c.b(bArr[2], bArr[1]));
        cRPWatchFaceElementInfo.setTimeHeight(com.crrepa.g1.c.b(bArr[4], bArr[3]));
        cRPWatchFaceElementInfo.setDateWidth(com.crrepa.g1.c.b(bArr[6], bArr[5]));
        cRPWatchFaceElementInfo.setDateHeight(com.crrepa.g1.c.b(bArr[8], bArr[7]));
        return cRPWatchFaceElementInfo;
    }

    public static int l(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return -1;
        }
        return bArr[0];
    }

    public static CRPWatchFaceListInfo m(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length < 2) {
            return null;
        }
        int a8 = com.crrepa.g1.c.a(bArr[1]);
        ArrayList arrayList = new ArrayList();
        for (int i8 = 2; i8 < bArr.length; i8 += 4) {
            arrayList.add(new CRPWatchFaceListInfo.WatchFaceBean(bArr[i8], new String(new byte[]{bArr[i8 + 1]}), com.crrepa.g1.c.b(bArr[i8 + 2], bArr[i8 + 3])));
        }
        return new CRPWatchFaceListInfo(a8, arrayList);
    }

    public static CRPWatchFaceScreenInfo n(byte[] bArr) {
        if (bArr == null || bArr.length < 12) {
            return null;
        }
        CRPWatchFaceScreenInfo cRPWatchFaceScreenInfo = new CRPWatchFaceScreenInfo();
        cRPWatchFaceScreenInfo.setWidth(com.crrepa.g1.c.b(bArr[1], bArr[0]));
        cRPWatchFaceScreenInfo.setHeight(com.crrepa.g1.c.b(bArr[3], bArr[2]));
        cRPWatchFaceScreenInfo.setCornerRadius(com.crrepa.g1.c.b(bArr[5], bArr[4]));
        cRPWatchFaceScreenInfo.setThumbWidth(com.crrepa.g1.c.b(bArr[7], bArr[6]));
        cRPWatchFaceScreenInfo.setThumbHeight(com.crrepa.g1.c.b(bArr[9], bArr[8]));
        cRPWatchFaceScreenInfo.setThumbCornerRadius(com.crrepa.g1.c.b(bArr[11], bArr[10]));
        return cRPWatchFaceScreenInfo;
    }
}
