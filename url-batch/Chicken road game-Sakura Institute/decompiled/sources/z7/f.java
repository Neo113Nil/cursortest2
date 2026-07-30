package z7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f8.i f10159a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f10160b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f10161c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f10162d;

    static {
        f8.i iVar = f8.i.f3600i;
        f10159a = m4.f.j("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f10160b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f10161c = new String[64];
        String[] strArr = new String[256];
        for (int i7 = 0; i7 < 256; i7++) {
            String binaryString = Integer.toBinaryString(i7);
            r6.k.e(binaryString, "toBinaryString(it)");
            String replace = t7.b.g("%8s", binaryString).replace(' ', '0');
            r6.k.e(replace, "replace(...)");
            strArr[i7] = replace;
        }
        f10162d = strArr;
        String[] strArr2 = f10161c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i8 = iArr[0];
        strArr2[i8 | 8] = a0.m.m(new StringBuilder(), strArr2[i8], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i9 = 0; i9 < 3; i9++) {
            int i10 = iArr2[i9];
            int i11 = iArr[0];
            String[] strArr3 = f10161c;
            int i12 = i11 | i10;
            strArr3[i12] = strArr3[i11] + '|' + strArr3[i10];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i11]);
            sb.append('|');
            strArr3[i12 | 8] = a0.m.m(sb, strArr3[i10], "|PADDED");
        }
        int length = f10161c.length;
        for (int i13 = 0; i13 < length; i13++) {
            String[] strArr4 = f10161c;
            if (strArr4[i13] == null) {
                strArr4[i13] = f10162d[i13];
            }
        }
    }

    public static String a(boolean z8, int i7, int i8, int i9, int i10) {
        String str;
        String str2;
        String[] strArr = f10160b;
        String g9 = i9 < strArr.length ? strArr[i9] : t7.b.g("0x%02x", Integer.valueOf(i9));
        if (i10 == 0) {
            str = "";
        } else {
            String[] strArr2 = f10162d;
            if (i9 != 2 && i9 != 3) {
                if (i9 == 4 || i9 == 6) {
                    str = i10 == 1 ? "ACK" : strArr2[i10];
                } else if (i9 != 7 && i9 != 8) {
                    String[] strArr3 = f10161c;
                    if (i10 < strArr3.length) {
                        str2 = strArr3[i10];
                        r6.k.c(str2);
                    } else {
                        str2 = strArr2[i10];
                    }
                    str = (i9 != 5 || (i10 & 4) == 0) ? (i9 != 0 || (i10 & 32) == 0) ? str2 : z6.o.t(str2, "PRIORITY", "COMPRESSED") : z6.o.t(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[i10];
        }
        return t7.b.g("%s 0x%08x %5d %-13s %s", z8 ? "<<" : ">>", Integer.valueOf(i7), Integer.valueOf(i8), g9, str);
    }
}
