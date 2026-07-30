package K6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final T6.i f1526a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1527b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f1528c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f1529d;

    static {
        T6.i iVar = T6.i.f2618l;
        f1526a = q1.h.n("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f1527b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f1528c = new String[64];
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(...)");
            strArr[i2] = kotlin.text.p.i(E6.e.d("%8s", binaryString), ' ', '0');
        }
        f1529d = strArr;
        String[] strArr2 = f1528c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i5 = iArr[0];
        strArr2[i5 | 8] = r4.f.f(new StringBuilder(), strArr2[i5], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i7 = 0; i7 < 3; i7++) {
            int i8 = iArr2[i7];
            int i9 = iArr[0];
            String[] strArr3 = f1528c;
            int i10 = i9 | i8;
            strArr3[i10] = strArr3[i9] + '|' + strArr3[i8];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i9]);
            sb.append('|');
            strArr3[i10 | 8] = r4.f.f(sb, strArr3[i8], "|PADDED");
        }
        int length = f1528c.length;
        for (int i11 = 0; i11 < length; i11++) {
            String[] strArr4 = f1528c;
            if (strArr4[i11] == null) {
                strArr4[i11] = f1529d[i11];
            }
        }
    }

    public static String a(int i2) {
        String[] strArr = f1527b;
        return i2 < strArr.length ? strArr[i2] : E6.e.d("0x%02x", Integer.valueOf(i2));
    }

    public static String b(boolean z7, int i2, int i5, int i7, int i8) {
        String str;
        String str2;
        String a7 = a(i7);
        if (i8 == 0) {
            str = "";
        } else {
            String[] strArr = f1529d;
            if (i7 != 2 && i7 != 3) {
                if (i7 == 4 || i7 == 6) {
                    str = i8 == 1 ? "ACK" : strArr[i8];
                } else if (i7 != 7 && i7 != 8) {
                    String[] strArr2 = f1528c;
                    if (i8 < strArr2.length) {
                        str2 = strArr2[i8];
                        Intrinsics.b(str2);
                    } else {
                        str2 = strArr[i8];
                    }
                    str = (i7 != 5 || (i8 & 4) == 0) ? (i7 != 0 || (i8 & 32) == 0) ? str2 : kotlin.text.p.j(str2, "PRIORITY", "COMPRESSED") : kotlin.text.p.j(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr[i8];
        }
        return E6.e.d("%s 0x%08x %5d %-13s %s", z7 ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i5), a7, str);
    }

    public static String c(boolean z7, int i2, int i5, long j) {
        return E6.e.d("%s 0x%08x %5d %-13s %d", z7 ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i5), a(8), Long.valueOf(j));
    }
}
