package k3;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f7433a = new char[117];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f7434b = new byte[126];

    static {
        int i2 = 0;
        for (int i4 = 0; i4 < 32; i4++) {
        }
        a(8, 'b');
        a(9, 't');
        a(10, 'n');
        a(12, 'f');
        a(13, 'r');
        a(47, '/');
        a(34, '\"');
        a(92, '\\');
        while (true) {
            byte[] bArr = f7434b;
            if (i2 >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i2] = Byte.MAX_VALUE;
            i2++;
        }
    }

    public static void a(int i2, char c4) {
        if (c4 != 'u') {
            f7433a[c4] = (char) i2;
        }
    }
}
