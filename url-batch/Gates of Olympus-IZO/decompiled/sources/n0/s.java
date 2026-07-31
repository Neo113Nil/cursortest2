package n0;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f6253a = new StackTraceElement[0];

    public static final boolean a(m mVar) {
        return !mVar.f6230h && mVar.f6226d;
    }

    public static final boolean b(m mVar) {
        return mVar.f6230h && !mVar.f6226d;
    }

    public static final boolean c(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean d(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean e(m mVar, long j3) {
        long j4 = mVar.f6225c;
        float d3 = a0.c.d(j4);
        float e3 = a0.c.e(j4);
        return d3 < 0.0f || d3 > ((float) ((int) (j3 >> 32))) || e3 < 0.0f || e3 > ((float) ((int) (j3 & 4294967295L)));
    }

    public static final long f(m mVar, boolean z3) {
        long g3 = a0.c.g(mVar.f6225c, mVar.f6229g);
        if (z3 || !mVar.b()) {
            return g3;
        }
        return 0L;
    }
}
