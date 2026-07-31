package E2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f1044a = new char[117];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1045b = new byte[126];

    static {
        int i3 = 0;
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
            byte[] bArr = f1045b;
            if (i3 >= 33) {
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
            bArr[i3] = Byte.MAX_VALUE;
            i3++;
        }
    }

    public static void a(int i3, char c2) {
        if (c2 != 'u') {
            f1044a[c2] = (char) i3;
        }
    }
}
