package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class zk0 {
    public static final ah PxuCJdSBwIXG;
    public static final String[] TSizfFm2Yiuu;
    public static final String[] Y1f8riQaR6yg;
    public static final String[] lS5Rgt96tfkO;

    static {
        ah.Companion.getClass();
        PxuCJdSBwIXG = zg.lS5Rgt96tfkO("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        lS5Rgt96tfkO = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        TSizfFm2Yiuu = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String replace = mv2.Y1f8riQaR6yg("%8s", binaryString).replace(' ', '0');
            replace.getClass();
            strArr[i] = replace;
        }
        Y1f8riQaR6yg = strArr;
        String[] strArr2 = TSizfFm2Yiuu;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = o0.gPXPFXrUH4XX(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = TSizfFm2Yiuu;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = o0.gPXPFXrUH4XX(sb, strArr3[i4], "|PADDED");
        }
        int length = TSizfFm2Yiuu.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = TSizfFm2Yiuu;
            if (strArr4[i7] == null) {
                strArr4[i7] = Y1f8riQaR6yg[i7];
            }
        }
    }

    public static String PxuCJdSBwIXG(int i) {
        String[] strArr = lS5Rgt96tfkO;
        return i < strArr.length ? strArr[i] : mv2.Y1f8riQaR6yg("0x%02x", Integer.valueOf(i));
    }

    public static String TSizfFm2Yiuu(boolean z, int i, int i2, long j) {
        return mv2.Y1f8riQaR6yg("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), PxuCJdSBwIXG(8), Long.valueOf(j));
    }

    public static String lS5Rgt96tfkO(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String PxuCJdSBwIXG2 = PxuCJdSBwIXG(i3);
        if (i4 == 0) {
            str = "";
        } else {
            String[] strArr = Y1f8riQaR6yg;
            if (i3 != 2 && i3 != 3) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : strArr[i4];
                } else if (i3 != 7 && i3 != 8) {
                    String[] strArr2 = TSizfFm2Yiuu;
                    if (i4 < strArr2.length) {
                        str2 = strArr2[i4];
                        str2.getClass();
                    } else {
                        str2 = strArr[i4];
                    }
                    str = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str2 : pa2.bEKsvqmvPh2y(str2, "PRIORITY", "COMPRESSED") : pa2.bEKsvqmvPh2y(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr[i4];
        }
        return mv2.Y1f8riQaR6yg("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), PxuCJdSBwIXG2, str);
    }
}
