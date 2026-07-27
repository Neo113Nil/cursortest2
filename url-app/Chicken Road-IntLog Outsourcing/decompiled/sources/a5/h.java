package a5;

import b2.AbstractC0279e;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final j5.i f3953a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f3954b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f3955c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f3956d;

    static {
        j5.i iVar = j5.i.f10496d;
        f3953a = l1.j.h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f3954b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f3955c = new String[64];
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            kotlin.jvm.internal.i.d(binaryString, "toBinaryString(...)");
            strArr[i2] = B4.r.L(U4.e.e("%8s", binaryString), ' ', '0');
        }
        f3956d = strArr;
        String[] strArr2 = f3955c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = AbstractC0279e.h(new StringBuilder(), strArr2[i3], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr2[i6];
            int i8 = iArr[0];
            String[] strArr3 = f3955c;
            int i9 = i8 | i7;
            strArr3[i9] = strArr3[i8] + '|' + strArr3[i7];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i8]);
            sb.append('|');
            strArr3[i9 | 8] = AbstractC0279e.h(sb, strArr3[i7], "|PADDED");
        }
        int length = f3955c.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr4 = f3955c;
            if (strArr4[i10] == null) {
                strArr4[i10] = f3956d[i10];
            }
        }
    }

    public static String a(int i2) {
        String[] strArr = f3954b;
        return i2 < strArr.length ? strArr[i2] : U4.e.e("0x%02x", Integer.valueOf(i2));
    }

    public static String b(boolean z, int i2, int i3, int i6, int i7) {
        String str;
        String str2;
        String a6 = a(i6);
        if (i7 == 0) {
            str = "";
        } else {
            String[] strArr = f3956d;
            if (i6 != 2 && i6 != 3) {
                if (i6 == 4 || i6 == 6) {
                    str = i7 == 1 ? "ACK" : strArr[i7];
                } else if (i6 != 7 && i6 != 8) {
                    String[] strArr2 = f3955c;
                    if (i7 < strArr2.length) {
                        str2 = strArr2[i7];
                        kotlin.jvm.internal.i.b(str2);
                    } else {
                        str2 = strArr[i7];
                    }
                    str = (i6 != 5 || (i7 & 4) == 0) ? (i6 != 0 || (i7 & 32) == 0) ? str2 : B4.r.M(str2, "PRIORITY", "COMPRESSED") : B4.r.M(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr[i7];
        }
        return U4.e.e("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), a6, str);
    }

    public static String c(long j2, int i2, int i3, boolean z) {
        return U4.e.e("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), a(8), Long.valueOf(j2));
    }
}
