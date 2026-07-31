package e6;

import y1.C0760d;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final n6.i f4073a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f4074b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f4075c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f4076d;

    static {
        n6.i iVar = n6.i.f5525i;
        f4073a = C0760d.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f4074b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f4075c = new String[64];
        String[] strArr = new String[256];
        for (int i7 = 0; i7 < 256; i7++) {
            String binaryString = Integer.toBinaryString(i7);
            kotlin.jvm.internal.i.d(binaryString, "toBinaryString(...)");
            strArr[i7] = F5.q.F(Y5.e.d("%8s", binaryString), ' ', '0');
        }
        f4076d = strArr;
        String[] strArr2 = f4075c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i8 = iArr[0];
        strArr2[i8 | 8] = N.p.b(new StringBuilder(), strArr2[i8], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i9 = 0; i9 < 3; i9++) {
            int i10 = iArr2[i9];
            int i11 = iArr[0];
            String[] strArr3 = f4075c;
            int i12 = i11 | i10;
            strArr3[i12] = strArr3[i11] + '|' + strArr3[i10];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i11]);
            sb.append('|');
            strArr3[i12 | 8] = N.p.b(sb, strArr3[i10], "|PADDED");
        }
        int length = f4075c.length;
        for (int i13 = 0; i13 < length; i13++) {
            String[] strArr4 = f4075c;
            if (strArr4[i13] == null) {
                strArr4[i13] = f4076d[i13];
            }
        }
    }

    public static String a(int i7) {
        String[] strArr = f4074b;
        return i7 < strArr.length ? strArr[i7] : Y5.e.d("0x%02x", Integer.valueOf(i7));
    }

    public static String b(boolean z5, int i7, int i8, int i9, int i10) {
        String str;
        String str2;
        String a7 = a(i9);
        if (i10 == 0) {
            str = "";
        } else {
            String[] strArr = f4076d;
            if (i9 != 2 && i9 != 3) {
                if (i9 == 4 || i9 == 6) {
                    str = i10 == 1 ? "ACK" : strArr[i10];
                } else if (i9 != 7 && i9 != 8) {
                    String[] strArr2 = f4075c;
                    if (i10 < strArr2.length) {
                        str2 = strArr2[i10];
                        kotlin.jvm.internal.i.b(str2);
                    } else {
                        str2 = strArr[i10];
                    }
                    str = (i9 != 5 || (i10 & 4) == 0) ? (i9 != 0 || (i10 & 32) == 0) ? str2 : F5.q.G(str2, "PRIORITY", "COMPRESSED") : F5.q.G(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr[i10];
        }
        return Y5.e.d("%s 0x%08x %5d %-13s %s", z5 ? "<<" : ">>", Integer.valueOf(i7), Integer.valueOf(i8), a7, str);
    }

    public static String c(boolean z5, int i7, int i8, long j4) {
        return Y5.e.d("%s 0x%08x %5d %-13s %d", z5 ? "<<" : ">>", Integer.valueOf(i7), Integer.valueOf(i8), a(8), Long.valueOf(j4));
    }
}
