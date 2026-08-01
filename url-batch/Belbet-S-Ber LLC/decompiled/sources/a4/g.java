package a4;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g4.i f172a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f173b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f174c;
    public static final String[] d;

    static {
        g4.i iVar = g4.i.i;
        f172a = o2.f.g("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f173b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f174c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            i3.d.d(binaryString, "toBinaryString(it)");
            String replace = u3.b.f("%8s", binaryString).replace(' ', '0');
            i3.d.d(replace, "replace(...)");
            strArr[i] = replace;
        }
        d = strArr;
        String[] strArr2 = f174c;
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
            String[] strArr3 = f174c;
            int i8 = i7 | i6;
            strArr3[i8] = strArr3[i7] + '|' + strArr3[i6];
            strArr3[i8 | 8] = strArr3[i7] + '|' + strArr3[i6] + "|PADDED";
        }
        int length = f174c.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr4 = f174c;
            if (strArr4[i9] == null) {
                strArr4[i9] = d[i9];
            }
        }
    }

    public static String a(boolean z4, int i, int i4, int i5, int i6) {
        String str;
        String str2;
        String[] strArr = f173b;
        String f5 = i5 < strArr.length ? strArr[i5] : u3.b.f("0x%02x", Integer.valueOf(i5));
        if (i6 == 0) {
            str = "";
        } else {
            String[] strArr2 = d;
            if (i5 != 2 && i5 != 3) {
                if (i5 == 4 || i5 == 6) {
                    str = i6 == 1 ? "ACK" : strArr2[i6];
                } else if (i5 != 7 && i5 != 8) {
                    String[] strArr3 = f174c;
                    if (i6 < strArr3.length) {
                        str2 = strArr3[i6];
                        i3.d.b(str2);
                    } else {
                        str2 = strArr2[i6];
                    }
                    str = (i5 != 5 || (i6 & 4) == 0) ? (i5 != 0 || (i6 & 32) == 0) ? str2 : p3.l.o0(str2, "PRIORITY", "COMPRESSED") : p3.l.o0(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[i6];
        }
        return u3.b.f("%s 0x%08x %5d %-13s %s", z4 ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i4), f5, str);
    }
}
