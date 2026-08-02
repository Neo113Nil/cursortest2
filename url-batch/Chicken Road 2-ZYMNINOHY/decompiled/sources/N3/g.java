package N3;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final T3.j f1854a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1855b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f1856c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f1857d;

    static {
        T3.j jVar = T3.j.f2976d;
        f1854a = a2.i.n("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f1855b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f1856c = new String[64];
        String[] strArr = new String[256];
        int i4 = 0;
        for (int i5 = 0; i5 < 256; i5++) {
            String binaryString = Integer.toBinaryString(i5);
            kotlin.jvm.internal.i.d(binaryString, "toBinaryString(it)");
            String replace = H3.b.g("%8s", binaryString).replace(' ', '0');
            kotlin.jvm.internal.i.d(replace, "replace(...)");
            strArr[i5] = replace;
        }
        f1857d = strArr;
        String[] strArr2 = f1856c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i6 = iArr[0];
        strArr2[i6 | 8] = kotlin.jvm.internal.i.h("|PADDED", strArr2[i6]);
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i7 = 0;
        while (i7 < 3) {
            int i8 = iArr2[i7];
            i7++;
            int i9 = iArr[0];
            String[] strArr3 = f1856c;
            int i10 = i9 | i8;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) strArr3[i9]);
            sb.append('|');
            sb.append((Object) strArr3[i8]);
            strArr3[i10] = sb.toString();
            strArr3[i10 | 8] = ((Object) strArr3[i9]) + '|' + ((Object) strArr3[i8]) + "|PADDED";
        }
        int length = f1856c.length;
        while (i4 < length) {
            int i11 = i4 + 1;
            String[] strArr4 = f1856c;
            if (strArr4[i4] == null) {
                strArr4[i4] = f1857d[i4];
            }
            i4 = i11;
        }
    }

    public static String a(boolean z, int i4, int i5, int i6, int i7) {
        String str;
        String str2;
        String[] strArr = f1855b;
        String g4 = i6 < strArr.length ? strArr[i6] : H3.b.g("0x%02x", Integer.valueOf(i6));
        if (i7 == 0) {
            str = "";
        } else {
            String[] strArr2 = f1857d;
            if (i6 != 2 && i6 != 3) {
                if (i6 == 4 || i6 == 6) {
                    str = i7 == 1 ? "ACK" : strArr2[i7];
                } else if (i6 != 7 && i6 != 8) {
                    String[] strArr3 = f1856c;
                    if (i7 < strArr3.length) {
                        str2 = strArr3[i7];
                        kotlin.jvm.internal.i.b(str2);
                    } else {
                        str2 = strArr2[i7];
                    }
                    str = (i6 != 5 || (i7 & 4) == 0) ? (i6 != 0 || (i7 & 32) == 0) ? str2 : w3.o.Y(str2, "PRIORITY", "COMPRESSED") : w3.o.Y(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[i7];
        }
        return H3.b.g("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i4), Integer.valueOf(i5), g4, str);
    }
}
