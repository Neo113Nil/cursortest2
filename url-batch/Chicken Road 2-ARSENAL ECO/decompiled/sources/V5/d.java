package V5;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2729a = new char[117];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f2730b = new byte[126];

    static {
        for (int i7 = 0; i7 < 32; i7++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        byte[] bArr = f2730b;
        for (int i8 = 0; i8 < 33; i8++) {
            bArr[i8] = Byte.MAX_VALUE;
        }
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
    }

    public static void a(char c7, int i7) {
        if (c7 != 'u') {
            f2729a[c7] = (char) i7;
        }
    }
}
