package com.bytedance.sdk.openadsdk.nqi;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes5.dex */
final class klz {
    private static final int[][] zmn = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] fs = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] zn = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, -1, -1}, new int[]{6, 26, 50, 74, 98, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] fb = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    private static boolean fs(int i) {
        return i == -1;
    }

    static void zmn(zn znVar) {
        znVar.zmn((byte) -1);
    }

    static void zmn(zmn zmnVar, zg zgVar, kw kwVar, int i, zn znVar) throws iqz {
        zmn(znVar);
        zmn(kwVar, znVar);
        zmn(zgVar, i, znVar);
        fs(kwVar, znVar);
        zmn(zmnVar, i, znVar);
    }

    static void zmn(kw kwVar, zn znVar) throws iqz {
        fb(znVar);
        zn(znVar);
        zn(kwVar, znVar);
        fs(znVar);
    }

    static void zmn(zg zgVar, int i, zn znVar) throws iqz {
        int zmn2;
        zmn zmnVar = new zmn();
        zmn(zgVar, i, zmnVar);
        for (int i2 = 0; i2 < zmnVar.zmn(); i2++) {
            boolean zmn3 = zmnVar.zmn((zmnVar.zmn() - 1) - i2);
            int[] iArr = fb[i2];
            znVar.zmn(iArr[0], iArr[1], zmn3);
            int i3 = 8;
            if (i2 < 8) {
                zmn2 = 8;
                i3 = (znVar.fs() - i2) - 1;
            } else {
                zmn2 = (znVar.zmn() - 7) + (i2 - 8);
            }
            znVar.zmn(i3, zmn2, zmn3);
        }
    }

    static void fs(kw kwVar, zn znVar) throws iqz {
        if (kwVar.zmn() < 7) {
            return;
        }
        zmn zmnVar = new zmn();
        zmn(kwVar, zmnVar);
        int i = 17;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                boolean zmn2 = zmnVar.zmn(i);
                i--;
                znVar.zmn(i2, (znVar.zmn() - 11) + i3, zmn2);
                znVar.zmn((znVar.zmn() - 11) + i3, i2, zmn2);
            }
        }
    }

    static void zmn(zmn zmnVar, int i, zn znVar) throws iqz {
        boolean z;
        int fs2 = znVar.fs() - 1;
        int zmn2 = znVar.zmn() - 1;
        int i2 = 0;
        int i3 = -1;
        while (fs2 > 0) {
            if (fs2 == 6) {
                fs2--;
            }
            while (zmn2 >= 0 && zmn2 < znVar.zmn()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = fs2 - i4;
                    if (fs(znVar.zmn(i5, zmn2))) {
                        if (i2 < zmnVar.zmn()) {
                            z = zmnVar.zmn(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && rc.zmn(i, i5, zmn2)) {
                            z = !z;
                        }
                        znVar.zmn(i5, zmn2, z);
                    }
                }
                zmn2 += i3;
            }
            i3 = -i3;
            zmn2 += i3;
            fs2 -= 2;
        }
        if (i2 == zmnVar.zmn()) {
            return;
        }
        throw new iqz("Not all bits consumed: " + i2 + '/' + zmnVar.zmn());
    }

    static int zmn(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    static int zmn(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int zmn2 = zmn(i2);
        int i3 = i << (zmn2 - 1);
        while (zmn(i3) >= zmn2) {
            i3 ^= i2 << (zmn(i3) - zmn2);
        }
        return i3;
    }

    static void zmn(zg zgVar, int i, zmn zmnVar) throws iqz {
        if (!cn.zmn(i)) {
            throw new iqz("Invalid mask pattern");
        }
        int zmn2 = (zgVar.zmn() << 3) | i;
        zmnVar.zmn(zmn2, 5);
        zmnVar.zmn(zmn(zmn2, 1335), 10);
        zmn zmnVar2 = new zmn();
        zmnVar2.zmn(21522, 15);
        zmnVar.fs(zmnVar2);
        if (zmnVar.zmn() == 15) {
            return;
        }
        throw new iqz("should not happen but we got: " + zmnVar.zmn());
    }

    static void zmn(kw kwVar, zmn zmnVar) throws iqz {
        zmnVar.zmn(kwVar.zmn(), 6);
        zmnVar.zmn(zmn(kwVar.zmn(), 7973), 12);
        if (zmnVar.zmn() == 18) {
            return;
        }
        throw new iqz("should not happen but we got: " + zmnVar.zmn());
    }

    private static void fs(zn znVar) {
        int i = 8;
        while (i < znVar.fs() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (fs(znVar.zmn(i, 6))) {
                znVar.zmn(i, 6, i3);
            }
            if (fs(znVar.zmn(6, i))) {
                znVar.zmn(6, i, i3);
            }
            i = i2;
        }
    }

    private static void zn(zn znVar) throws iqz {
        if (znVar.zmn(8, znVar.zmn() - 8) == 0) {
            throw new iqz();
        }
        znVar.zmn(8, znVar.zmn() - 8, 1);
    }

    private static void zmn(int i, int i2, zn znVar) throws iqz {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!fs(znVar.zmn(i4, i2))) {
                throw new iqz();
            }
            znVar.zmn(i4, i2, 0);
        }
    }

    private static void fs(int i, int i2, zn znVar) throws iqz {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!fs(znVar.zmn(i, i4))) {
                throw new iqz();
            }
            znVar.zmn(i, i4, 0);
        }
    }

    private static void zn(int i, int i2, zn znVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = fs[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                znVar.zmn(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void fb(int i, int i2, zn znVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = zmn[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                znVar.zmn(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void fb(zn znVar) throws iqz {
        int length = zmn[0].length;
        fb(0, 0, znVar);
        fb(znVar.fs() - length, 0, znVar);
        fb(0, znVar.fs() - length, znVar);
        zmn(0, 7, znVar);
        zmn(znVar.fs() - 8, 7, znVar);
        zmn(0, znVar.fs() - 8, znVar);
        fs(7, 0, znVar);
        fs(znVar.zmn() - 8, 0, znVar);
        fs(7, znVar.zmn() - 7, znVar);
    }

    private static void zn(kw kwVar, zn znVar) {
        if (kwVar.zmn() < 2) {
            return;
        }
        int[] iArr = zn[kwVar.zmn() - 1];
        for (int i : iArr) {
            if (i >= 0) {
                for (int i2 : iArr) {
                    if (i2 >= 0 && fs(znVar.zmn(i2, i))) {
                        zn(i2 - 2, i - 2, znVar);
                    }
                }
            }
        }
    }
}
