package p1;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final v1.i f3418a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f3419b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f3420c;
    public static final String[] d;

    static {
        v1.i iVar = v1.i.d;
        f3418a = H0.e.i("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f3419b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f3420c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            X0.e.d(binaryString, "toBinaryString(it)");
            String replace = j1.b.g("%8s", binaryString).replace(' ', '0');
            X0.e.d(replace, "replace(...)");
            strArr[i] = replace;
        }
        d = strArr;
        String[] strArr2 = f3420c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = strArr2[i2] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = f3420c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            strArr3[i6 | 8] = strArr3[i5] + '|' + strArr3[i4] + "|PADDED";
        }
        int length = f3420c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = f3420c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    public static String a(boolean z2, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String[] strArr = f3419b;
        String g2 = i3 < strArr.length ? strArr[i3] : j1.b.g("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            str = "";
        } else {
            String[] strArr2 = d;
            if (i3 != 2 && i3 != 3) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : strArr2[i4];
                } else if (i3 != 7 && i3 != 8) {
                    String[] strArr3 = f3420c;
                    if (i4 < strArr3.length) {
                        str2 = strArr3[i4];
                        X0.e.b(str2);
                    } else {
                        str2 = strArr2[i4];
                    }
                    str = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str2 : e1.l.g0(str2, "PRIORITY", "COMPRESSED") : e1.l.g0(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[i4];
        }
        return j1.b.g("%s 0x%08x %5d %-13s %s", z2 ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), g2, str);
    }
}
