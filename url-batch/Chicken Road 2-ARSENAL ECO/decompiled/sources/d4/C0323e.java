package d4;

/* renamed from: d4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323e implements InterfaceC0328j {

    /* renamed from: c, reason: collision with root package name */
    public static final C0323e[] f3952c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0323e f3953d;

    /* renamed from: a, reason: collision with root package name */
    public final String f3954a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f3955b;

    static {
        C0323e[] c0323eArr = new C0323e[256];
        for (int i7 = 0; i7 < 256; i7++) {
            c0323eArr[i7] = new C0323e((byte) i7);
        }
        f3952c = c0323eArr;
        f3953d = c0323eArr[0];
    }

    public C0323e(byte b7) {
        int i7 = b7 & 255;
        char[] cArr = a4.f.f3143a;
        this.f3954a = new String(new char[]{cArr[i7], cArr[i7 | 256]});
        this.f3955b = b7;
    }

    public final String toString() {
        return this.f3954a;
    }
}
