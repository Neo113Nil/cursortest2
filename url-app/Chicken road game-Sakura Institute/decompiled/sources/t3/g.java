package t3;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;
import z3.C1451i;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1451i f10783a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f10784b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f10785c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f10786d;

    static {
        C1451i c1451i = C1451i.f12000j;
        f10783a = H1.f.n("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f10784b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f10785c = new String[64];
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            String h4 = n3.b.h("%8s", binaryString);
            Intrinsics.checkNotNullParameter(h4, "<this>");
            String replace = h4.replace(' ', '0');
            Intrinsics.checkNotNullExpressionValue(replace, "replace(...)");
            strArr[i2] = replace;
        }
        f10786d = strArr;
        String[] strArr2 = f10785c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i4 = iArr[0];
        strArr2[i4 | 8] = AbstractC0017m.n(new StringBuilder(), strArr2[i4], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            int i7 = iArr[0];
            String[] strArr3 = f10785c;
            int i8 = i7 | i6;
            strArr3[i8] = strArr3[i7] + '|' + strArr3[i6];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i7]);
            sb.append('|');
            strArr3[i8 | 8] = AbstractC0017m.n(sb, strArr3[i6], "|PADDED");
        }
        int length = f10785c.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr4 = f10785c;
            if (strArr4[i9] == null) {
                strArr4[i9] = f10786d[i9];
            }
        }
    }

    public static String a(boolean z4, int i2, int i4, int i5, int i6) {
        String str;
        String str2;
        String[] strArr = f10784b;
        String h4 = i5 < strArr.length ? strArr[i5] : n3.b.h("0x%02x", Integer.valueOf(i5));
        if (i6 == 0) {
            str = "";
        } else {
            String[] strArr2 = f10786d;
            if (i5 != 2 && i5 != 3) {
                if (i5 == 4 || i5 == 6) {
                    str = i6 == 1 ? "ACK" : strArr2[i6];
                } else if (i5 != 7 && i5 != 8) {
                    String[] strArr3 = f10785c;
                    if (i6 < strArr3.length) {
                        str2 = strArr3[i6];
                        Intrinsics.c(str2);
                    } else {
                        str2 = strArr2[i6];
                    }
                    str = (i5 != 5 || (i6 & 4) == 0) ? (i5 != 0 || (i6 & 32) == 0) ? str2 : kotlin.text.u.l(str2, "PRIORITY", "COMPRESSED") : kotlin.text.u.l(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[i6];
        }
        return n3.b.h("%s 0x%08x %5d %-13s %s", z4 ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i4), h4, str);
    }
}
