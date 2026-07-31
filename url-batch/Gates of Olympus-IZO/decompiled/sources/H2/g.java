package H2;

import N2.C0153i;
import h2.AbstractC0454p;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0153i f1955a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1956b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f1957c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f1958d;

    static {
        C0153i c0153i = C0153i.f2930g;
        f1955a = F0.a.k("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f1956b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f1957c = new String[64];
        String[] strArr = new String[256];
        for (int i3 = 0; i3 < 256; i3++) {
            String binaryString = Integer.toBinaryString(i3);
            Z1.i.e(binaryString, "toBinaryString(it)");
            String replace = B2.c.h("%8s", binaryString).replace(' ', '0');
            Z1.i.e(replace, "replace(...)");
            strArr[i3] = replace;
        }
        f1958d = strArr;
        String[] strArr2 = f1957c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i4 = iArr[0];
        strArr2[i4 | 8] = strArr2[i4] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            int i7 = iArr[0];
            String[] strArr3 = f1957c;
            int i8 = i7 | i6;
            strArr3[i8] = strArr3[i7] + '|' + strArr3[i6];
            strArr3[i8 | 8] = strArr3[i7] + '|' + strArr3[i6] + "|PADDED";
        }
        int length = f1957c.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr4 = f1957c;
            if (strArr4[i9] == null) {
                strArr4[i9] = f1958d[i9];
            }
        }
    }

    public static String a(boolean z3, int i3, int i4, int i5, int i6) {
        String str;
        String str2;
        String[] strArr = f1956b;
        String h3 = i5 < strArr.length ? strArr[i5] : B2.c.h("0x%02x", Integer.valueOf(i5));
        if (i6 == 0) {
            str = "";
        } else {
            String[] strArr2 = f1958d;
            if (i5 != 2 && i5 != 3) {
                if (i5 == 4 || i5 == 6) {
                    str = i6 == 1 ? "ACK" : strArr2[i6];
                } else if (i5 != 7 && i5 != 8) {
                    String[] strArr3 = f1957c;
                    if (i6 < strArr3.length) {
                        str2 = strArr3[i6];
                        Z1.i.c(str2);
                    } else {
                        str2 = strArr2[i6];
                    }
                    str = (i5 != 5 || (i6 & 4) == 0) ? (i5 != 0 || (i6 & 32) == 0) ? str2 : AbstractC0454p.g0(str2, "PRIORITY", "COMPRESSED") : AbstractC0454p.g0(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[i6];
        }
        return B2.c.h("%s 0x%08x %5d %-13s %s", z3 ? "<<" : ">>", Integer.valueOf(i3), Integer.valueOf(i4), h3, str);
    }
}
