package l0;

/* renamed from: l0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0819q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0803a f7920a = new C0803a(1000);

    /* renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f7921b;

    static {
        new C0803a(1007);
        new C0803a(1008);
        new C0803a(1002);
        f7921b = new StackTraceElement[0];
    }

    public static final boolean a(s sVar) {
        return !sVar.f7930h && sVar.f7926d;
    }

    public static final boolean b(s sVar) {
        return (sVar.b() || !sVar.f7930h || sVar.f7926d) ? false : true;
    }

    public static final boolean c(s sVar) {
        return sVar.f7930h && !sVar.f7926d;
    }

    public static final boolean d(int i2, int i4) {
        return i2 == i4;
    }

    public static final boolean e(int i2, int i4) {
        return i2 == i4;
    }

    public static final boolean f(s sVar, long j4) {
        long j5 = sVar.f7925c;
        float d4 = Y.c.d(j5);
        float e4 = Y.c.e(j5);
        return d4 < 0.0f || d4 > ((float) ((int) (j4 >> 32))) || e4 < 0.0f || e4 > ((float) ((int) (j4 & 4294967295L)));
    }

    public static final boolean g(s sVar, long j4, long j5) {
        if (!e(sVar.f7931i, 1)) {
            return f(sVar, j4);
        }
        long j6 = sVar.f7925c;
        float d4 = Y.c.d(j6);
        float e4 = Y.c.e(j6);
        return d4 < (-Y.f.d(j5)) || d4 > Y.f.d(j5) + ((float) ((int) (j4 >> 32))) || e4 < (-Y.f.b(j5)) || e4 > Y.f.b(j5) + ((float) ((int) (j4 & 4294967295L)));
    }

    public static final long h(s sVar, boolean z4) {
        long g4 = Y.c.g(sVar.f7925c, sVar.f7929g);
        if (z4 || !sVar.b()) {
            return g4;
        }
        return 0L;
    }
}
