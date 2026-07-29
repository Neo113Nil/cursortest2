package b.a.e;

import java.io.IOException;

/* compiled from: Http2.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    static final c.f f1913a = c.f.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f1916d = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: b, reason: collision with root package name */
    static final String[] f1914b = new String[64];

    /* renamed from: c, reason: collision with root package name */
    static final String[] f1915c = new String[256];

    static {
        for (int i = 0; i < f1915c.length; i++) {
            f1915c[i] = b.a.c.a("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        f1914b[0] = "";
        f1914b[1] = "END_STREAM";
        int[] iArr = {1};
        f1914b[8] = "PADDED";
        for (int i2 : iArr) {
            f1914b[i2 | 8] = f1914b[i2] + "|PADDED";
        }
        f1914b[4] = "END_HEADERS";
        f1914b[32] = "PRIORITY";
        f1914b[36] = "END_HEADERS|PRIORITY";
        for (int i3 : new int[]{4, 32, 36}) {
            for (int i4 : iArr) {
                int i5 = i4 | i3;
                f1914b[i5] = f1914b[i4] + '|' + f1914b[i3];
                f1914b[i5 | 8] = f1914b[i4] + '|' + f1914b[i3] + "|PADDED";
            }
        }
        for (int i6 = 0; i6 < f1914b.length; i6++) {
            if (f1914b[i6] == null) {
                f1914b[i6] = f1915c[i6];
            }
        }
    }

    private e() {
    }

    static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(b.a.c.a(str, objArr));
    }

    static IOException b(String str, Object... objArr) throws IOException {
        throw new IOException(b.a.c.a(str, objArr));
    }

    static String a(boolean z, int i, int i2, byte b2, byte b3) {
        String a2 = b2 < f1916d.length ? f1916d[b2] : b.a.c.a("0x%02x", Byte.valueOf(b2));
        String a3 = a(b2, b3);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = a2;
        objArr[4] = a3;
        return b.a.c.a("%s 0x%08x %5d %-13s %s", objArr);
    }

    static String a(byte b2, byte b3) {
        if (b3 == 0) {
            return "";
        }
        switch (b2) {
            case 2:
            case 3:
            case 7:
            case 8:
                return f1915c[b3];
            case 4:
            case 6:
                return b3 == 1 ? "ACK" : f1915c[b3];
            case 5:
            default:
                String str = b3 < f1914b.length ? f1914b[b3] : f1915c[b3];
                if (b2 != 5 || (b3 & 4) == 0) {
                    return (b2 != 0 || (b3 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                }
                return str.replace("HEADERS", "PUSH_PROMISE");
        }
    }
}
