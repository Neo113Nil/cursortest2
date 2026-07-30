package j6;

/* renamed from: j6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4603e {

    /* renamed from: c, reason: collision with root package name */
    public static final C4603e[] f38572c;

    /* renamed from: d, reason: collision with root package name */
    public static final C4603e f38573d;

    /* renamed from: a, reason: collision with root package name */
    public final String f38574a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f38575b;

    static {
        C4603e[] c4603eArr = new C4603e[256];
        for (int i = 0; i < 256; i++) {
            c4603eArr[i] = new C4603e((byte) i);
        }
        f38572c = c4603eArr;
        f38573d = c4603eArr[0];
    }

    public C4603e(byte b9) {
        int i = b9 & 255;
        char[] cArr = g6.f.f37935a;
        this.f38574a = new String(new char[]{cArr[i], cArr[i | 256]});
        this.f38575b = b9;
    }

    public final String toString() {
        return this.f38574a;
    }
}
