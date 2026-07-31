package E2;

/* renamed from: E2.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0381l {

    /* renamed from: a, reason: collision with root package name */
    public static final C0381l f610a;

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f611b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f612c;

    static {
        C0381l c0381l = new C0381l();
        f610a = c0381l;
        f611b = new char[117];
        f612c = new byte[126];
        c0381l.f();
        c0381l.e();
    }

    private C0381l() {
    }

    private final void a(char c4, char c5) {
        b(c4, c5);
    }

    private final void b(int i4, char c4) {
        if (c4 != 'u') {
            f611b[c4] = (char) i4;
        }
    }

    private final void c(char c4, byte b4) {
        d(c4, b4);
    }

    private final void d(int i4, byte b4) {
        f612c[i4] = b4;
    }

    private final void e() {
        for (int i4 = 0; i4 < 33; i4++) {
            d(i4, Byte.MAX_VALUE);
        }
        d(9, (byte) 3);
        d(10, (byte) 3);
        d(13, (byte) 3);
        d(32, (byte) 3);
        c(',', (byte) 4);
        c(':', (byte) 5);
        c('{', (byte) 6);
        c('}', (byte) 7);
        c('[', (byte) 8);
        c(']', (byte) 9);
        c('\"', (byte) 1);
        c('\\', (byte) 2);
    }

    private final void f() {
        for (int i4 = 0; i4 < 32; i4++) {
            b(i4, 'u');
        }
        b(8, 'b');
        b(9, 't');
        b(10, 'n');
        b(12, 'f');
        b(13, 'r');
        a('/', '/');
        a('\"', '\"');
        a('\\', '\\');
    }
}
