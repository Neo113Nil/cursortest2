package Y2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e[] f3689c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f3690d;

    /* renamed from: a, reason: collision with root package name */
    public final String f3691a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f3692b;

    static {
        e[] eVarArr = new e[256];
        for (int i2 = 0; i2 < 256; i2++) {
            eVarArr[i2] = new e((byte) i2);
        }
        f3689c = eVarArr;
        f3690d = eVarArr[0];
    }

    public e(byte b6) {
        int i2 = b6 & 255;
        char[] cArr = V2.f.f3240a;
        this.f3691a = new String(new char[]{cArr[i2], cArr[i2 | 256]});
        this.f3692b = b6;
    }

    public final String toString() {
        return this.f3691a;
    }
}
