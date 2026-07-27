package R4;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2678a = new char[117];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f2679b = new byte[126];

    static {
        int i2 = 0;
        for (int i3 = 0; i3 < 32; i3++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        while (true) {
            byte[] bArr = f2679b;
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

    public static void a(char c2, int i2) {
        if (c2 != 'u') {
            f2678a[c2] = (char) i2;
        }
    }
}
