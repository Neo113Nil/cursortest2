package j3;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final p3.i f2422a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f2423b;
    public static final String[] c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f2424d;

    static {
        p3.i iVar = p3.i.f3029i;
        f2422a = g2.f.k("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f2423b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[256];
        for (int i4 = 0; i4 < 256; i4++) {
            String binaryString = Integer.toBinaryString(i4);
            u2.c.d(binaryString, "toBinaryString(it)");
            String replace = d3.c.f("%8s", binaryString).replace(' ', '0');
            u2.c.d(replace, "replace(...)");
            strArr[i4] = replace;
        }
        f2424d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i5 = iArr[0];
        strArr2[i5 | 8] = strArr2[i5] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr2[i6];
            int i8 = iArr[0];
            String[] strArr3 = c;
            int i9 = i8 | i7;
            strArr3[i9] = strArr3[i8] + '|' + strArr3[i7];
            strArr3[i9 | 8] = strArr3[i8] + '|' + strArr3[i7] + "|PADDED";
        }
        int length = c.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr4 = c;
            if (strArr4[i10] == null) {
                strArr4[i10] = f2424d[i10];
            }
        }
    }

    public static String a(boolean z3, int i4, int i5, int i6, int i7) {
        String str;
        String str2;
        String[] strArr = f2423b;
        String f4 = i6 < strArr.length ? strArr[i6] : d3.c.f("0x%02x", Integer.valueOf(i6));
        if (i7 == 0) {
            str = "";
        } else {
            String[] strArr2 = f2424d;
            if (i6 != 2 && i6 != 3) {
                if (i6 == 4 || i6 == 6) {
                    str = i7 == 1 ? "ACK" : strArr2[i7];
                } else if (i6 != 7 && i6 != 8) {
                    String[] strArr3 = c;
                    if (i7 < strArr3.length) {
                        str2 = strArr3[i7];
                        u2.c.b(str2);
                    } else {
                        str2 = strArr2[i7];
                    }
                    str = (i6 != 5 || (i7 & 4) == 0) ? (i6 != 0 || (i7 & 32) == 0) ? str2 : b3.m.Z(str2, "PRIORITY", "COMPRESSED") : b3.m.Z(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[i7];
        }
        return d3.c.f("%s 0x%08x %5d %-13s %s", z3 ? "<<" : ">>", Integer.valueOf(i4), Integer.valueOf(i5), f4, str);
    }
}
