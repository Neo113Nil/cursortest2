package q7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f7544a = new char[117];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f7545b = new byte[126];

    static {
        for (int i7 = 0; i7 < 32; i7++) {
        }
        a(8, 'b');
        a(9, 't');
        a(10, 'n');
        a(12, 'f');
        a(13, 'r');
        a(47, '/');
        a(34, '\"');
        a(92, '\\');
        byte[] bArr = f7545b;
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

    public static void a(int i7, char c4) {
        if (c4 != 'u') {
            f7544a[c4] = (char) i7;
        }
    }
}
