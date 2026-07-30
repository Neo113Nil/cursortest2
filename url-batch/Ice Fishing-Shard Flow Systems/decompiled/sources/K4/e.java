package K4;

/* loaded from: classes.dex */
public final class e implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final e[] f1456c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f1457d;

    /* renamed from: a, reason: collision with root package name */
    public final String f1458a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f1459b;

    static {
        e[] eVarArr = new e[256];
        for (int i2 = 0; i2 < 256; i2++) {
            eVarArr[i2] = new e((byte) i2);
        }
        f1456c = eVarArr;
        f1457d = eVarArr[0];
    }

    public e(byte b7) {
        int i2 = b7 & 255;
        char[] cArr = H4.f.f994a;
        this.f1458a = new String(new char[]{cArr[i2], cArr[i2 | 256]});
        this.f1459b = b7;
    }

    public final String toString() {
        return this.f1458a;
    }
}
