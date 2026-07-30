package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPHisiliconWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceLayoutInfo;
import com.crrepa.ble.conn.type.CRPPhotoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPVideoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPWatchFaceTimeStyle;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import java.util.List;

/* loaded from: classes3.dex */
public class q0 {
    public static final int A = 25;
    public static final int B = 26;
    public static final int C = 27;
    public static final int D = 29;
    public static final int E = 30;
    public static final int F = 31;
    public static final int G = 33;
    public static final int H = 34;
    public static final int I = 36;
    public static final int J = 35;

    /* renamed from: a, reason: collision with root package name */
    public static final int f12702a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12703b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12704c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12705d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f12706e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f12707f = 7;

    /* renamed from: g, reason: collision with root package name */
    public static final int f12708g = 16;

    /* renamed from: h, reason: collision with root package name */
    public static final int f12709h = 17;

    /* renamed from: i, reason: collision with root package name */
    public static final int f12710i = 18;

    /* renamed from: j, reason: collision with root package name */
    public static final int f12711j = 19;

    /* renamed from: k, reason: collision with root package name */
    public static final int f12712k = 2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f12713l = 38;

    /* renamed from: m, reason: collision with root package name */
    public static final int f12714m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f12715n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f12716o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f12717p = 3;

    /* renamed from: q, reason: collision with root package name */
    public static final int f12718q = 4;

    /* renamed from: r, reason: collision with root package name */
    public static final int f12719r = 5;

    /* renamed from: s, reason: collision with root package name */
    public static final int f12720s = 6;

    /* renamed from: t, reason: collision with root package name */
    public static final int f12721t = 32;

    /* renamed from: u, reason: collision with root package name */
    public static final int f12722u = 28;

    /* renamed from: v, reason: collision with root package name */
    public static final int f12723v = 20;

    /* renamed from: w, reason: collision with root package name */
    public static final int f12724w = 21;

    /* renamed from: x, reason: collision with root package name */
    public static final int f12725x = 22;

    /* renamed from: y, reason: collision with root package name */
    public static final int f12726y = 23;

    /* renamed from: z, reason: collision with root package name */
    public static final int f12727z = 24;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12728a;

        static {
            int[] iArr = new int[CRPWatchFaceType.values().length];
            f12728a = iArr;
            try {
                iArr[CRPWatchFaceType.PHOTO_WATCH_FACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12728a[CRPWatchFaceType.VIDEO_WATCH_FACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private q0() {
    }

    public static byte[] a() {
        return g.a(-76, new byte[]{a4.a.f50j0, 6});
    }

    public static byte[] b() {
        return g.a(-76, new byte[]{18});
    }

    public static byte[] c() {
        return g.a(-76, new byte[]{16});
    }

    public static byte[] d() {
        return g.a(-76, new byte[]{0});
    }

    public static byte[] e() {
        return g.a(-124, null);
    }

    public static byte[] f() {
        return g.a(41, null);
    }

    public static byte[] g() {
        return g.a(-90, new byte[]{1});
    }

    public static byte[] h() {
        return g.a(-76, new byte[]{7});
    }

    public static byte[] i() {
        return g.a(-76, new byte[]{32});
    }

    public static byte[] j() {
        return g.a(-76, new byte[]{a4.a.f50j0, 5});
    }

    public static byte[] k() {
        return g.a(-76, new byte[]{a4.a.f50j0, 4});
    }

    public static byte[] l() {
        return g.a(-76, new byte[]{a4.a.f50j0, 0});
    }

    public static byte[] m() {
        return g.a(-76, new byte[]{a4.a.f50j0, 2});
    }

    public static byte[] n() {
        return g.a(-76, new byte[]{a4.a.f50j0, 1});
    }

    public static byte[] o() {
        return g.a(-70, new byte[]{2});
    }

    public static byte[] p() {
        return g.a(-76, new byte[]{21});
    }

    public static byte[] q() {
        return g.a(-76, new byte[]{26});
    }

    public static byte[] r() {
        return g.a(-76, new byte[]{34});
    }

    public static byte[] s() {
        return g.a(-76, new byte[]{28});
    }

    public static byte[] t() {
        return g.a(-76, new byte[]{29, CRPWatchFaceType.PHOTO_WATCH_FACE.getValue()});
    }

    public static byte[] u() {
        return g.a(-76, new byte[]{20});
    }

    public static byte[] a(int i8) {
        byte[] bArr = new byte[5];
        bArr[0] = 4;
        byte[] b8 = com.crrepa.g1.c.b(i8);
        System.arraycopy(b8, 0, bArr, 1, b8.length);
        return g.a(-76, bArr);
    }

    public static byte[] b(int i8) {
        return g.a(25, new byte[]{(byte) i8});
    }

    public static byte[] c(int i8) {
        return g.a(-76, new byte[]{27, (byte) i8});
    }

    public static byte[] a(int i8, boolean z7) {
        byte[] bArr = new byte[z7 ? 6 : 5];
        bArr[0] = 17;
        byte[] b8 = com.crrepa.g1.c.b(i8);
        System.arraycopy(b8, 0, bArr, 1, b8.length);
        if (z7) {
            bArr[5] = 1;
        }
        return g.a(-76, bArr);
    }

    public static byte[] b(CRPWatchFaceType cRPWatchFaceType) {
        return g.a(-76, new byte[]{35, cRPWatchFaceType.getValue()});
    }

    public static byte[] c(CRPWatchFaceType cRPWatchFaceType) {
        return g.a(-76, new byte[]{22, cRPWatchFaceType.getValue()});
    }

    public static byte[] a(CRPHisiliconWatchFaceLayoutInfo cRPHisiliconWatchFaceLayoutInfo) {
        byte[] a8 = com.crrepa.g1.c.a(cRPHisiliconWatchFaceLayoutInfo.getX());
        byte[] a9 = com.crrepa.g1.c.a(cRPHisiliconWatchFaceLayoutInfo.getY());
        int textColor = cRPHisiliconWatchFaceLayoutInfo.getTextColor();
        return g.a(-76, new byte[]{30, cRPHisiliconWatchFaceLayoutInfo.getWatchFaceType().getValue(), a8[0], a8[1], a9[0], a9[1], (byte) cRPHisiliconWatchFaceLayoutInfo.getTimeTopContent(), (byte) cRPHisiliconWatchFaceLayoutInfo.getTimeBottomContent(), (byte) ((textColor >> 24) & 255), (byte) ((textColor >> 16) & 255), (byte) ((textColor >> 8) & 255), (byte) (textColor & 255)});
    }

    public static byte[] a(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo) {
        byte[] bArr = new byte[30];
        bArr[0] = a4.a.f50j0;
        bArr[1] = 3;
        CRPWatchFaceType watchFaceType = cRPJieliWatchFaceLayoutInfo.getWatchFaceType();
        bArr[2] = watchFaceType.getValue();
        bArr[3] = cRPJieliWatchFaceLayoutInfo.isShowPointer();
        int i8 = a.f12728a[watchFaceType.ordinal()];
        if (i8 == 1) {
            bArr[4] = cRPJieliWatchFaceLayoutInfo.getPhotoDisplayMode().getValue();
            bArr[5] = cRPJieliWatchFaceLayoutInfo.getFixedPhotoIndex();
        } else if (i8 == 2) {
            bArr[4] = cRPJieliWatchFaceLayoutInfo.getVideoDisplayMode().getValue();
        }
        int elementColor = cRPJieliWatchFaceLayoutInfo.getElementColor();
        bArr[6] = (byte) ((elementColor >> 24) & 255);
        bArr[7] = (byte) ((elementColor >> 16) & 255);
        bArr[8] = (byte) ((elementColor >> 8) & 255);
        bArr[9] = (byte) (elementColor & 255);
        int i9 = 10;
        for (CRPJieliWatchFaceLayoutInfo.ElementBean elementBean : cRPJieliWatchFaceLayoutInfo.getElementArray()) {
            bArr[i9] = elementBean.getType();
            byte[] a8 = com.crrepa.g1.c.a(elementBean.getX());
            bArr[i9 + 1] = a8[0];
            bArr[i9 + 2] = a8[1];
            byte[] a9 = com.crrepa.g1.c.a(elementBean.getY());
            int i10 = i9 + 4;
            bArr[i9 + 3] = a9[0];
            i9 += 5;
            bArr[i10] = a9[1];
        }
        return g.a(-76, bArr);
    }

    public static byte[] a(CRPPhotoWatchFaceDisplayMode cRPPhotoWatchFaceDisplayMode) {
        return g.a(-76, new byte[]{25, cRPPhotoWatchFaceDisplayMode.getValue()});
    }

    public static byte[] a(CRPVideoWatchFaceDisplayMode cRPVideoWatchFaceDisplayMode) {
        return g.a(-76, new byte[]{33, cRPVideoWatchFaceDisplayMode.getValue()});
    }

    public static byte[] a(CRPWatchFaceType cRPWatchFaceType) {
        return g.a(-76, new byte[]{31, cRPWatchFaceType.getValue()});
    }

    public static byte[] a(CRPWatchFaceType cRPWatchFaceType, CRPWatchFaceTimeStyle cRPWatchFaceTimeStyle) {
        return g.a(-76, new byte[]{36, cRPWatchFaceType.getValue(), cRPWatchFaceTimeStyle.getValue()});
    }

    public static byte[] a(String str) {
        byte[] bArr = new byte[5];
        bArr[0] = 23;
        try {
            byte[] b8 = com.crrepa.g1.c.b(Long.parseLong(str));
            System.arraycopy(b8, 0, bArr, 1, b8.length);
            return g.a(-76, bArr);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static byte[] a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            byte[] bArr = new byte[(list.size() * 4) + 2];
            bArr[0] = 24;
            bArr[1] = (byte) list.size();
            for (int i8 = 0; i8 < list.size(); i8++) {
                try {
                    byte[] b8 = com.crrepa.g1.c.b(Long.parseLong(list.get(i8)));
                    System.arraycopy(b8, 0, bArr, (i8 * 4) + 2, b8.length);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            return g.a(-76, bArr);
        }
        return null;
    }

    public static byte[] a(int[] iArr) {
        if (iArr == null || iArr.length < 1) {
            return null;
        }
        byte[] bArr = new byte[(iArr.length * 4) + 2];
        bArr[0] = 19;
        bArr[1] = (byte) iArr.length;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            byte[] b8 = com.crrepa.g1.c.b(iArr[i8]);
            System.arraycopy(b8, 0, bArr, (i8 * 4) + 2, b8.length);
        }
        return g.a(-76, bArr);
    }
}
