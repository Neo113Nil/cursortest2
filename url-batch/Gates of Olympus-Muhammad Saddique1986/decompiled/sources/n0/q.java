package n0;

import a0.C0238c;
import a0.C0241f;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0703a f7305a = new C0703a(1000);

    /* renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f7306b;

    static {
        new C0703a(1007);
        new C0703a(1008);
        new C0703a(1002);
        f7306b = new StackTraceElement[0];
    }

    public static final boolean a(s sVar) {
        return !sVar.f7315h && sVar.f7311d;
    }

    public static final boolean b(s sVar) {
        return (sVar.b() || !sVar.f7315h || sVar.f7311d) ? false : true;
    }

    public static final boolean c(s sVar) {
        return sVar.f7315h && !sVar.f7311d;
    }

    public static final boolean d(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean e(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean f(s sVar, long j3) {
        long j4 = sVar.f7310c;
        float d3 = C0238c.d(j4);
        float e3 = C0238c.e(j4);
        return d3 < 0.0f || d3 > ((float) ((int) (j3 >> 32))) || e3 < 0.0f || e3 > ((float) ((int) (j3 & 4294967295L)));
    }

    public static final boolean g(s sVar, long j3, long j4) {
        if (!e(sVar.f7316i, 1)) {
            return f(sVar, j3);
        }
        long j5 = sVar.f7310c;
        float d3 = C0238c.d(j5);
        float e3 = C0238c.e(j5);
        return d3 < (-C0241f.d(j4)) || d3 > C0241f.d(j4) + ((float) ((int) (j3 >> 32))) || e3 < (-C0241f.b(j4)) || e3 > C0241f.b(j4) + ((float) ((int) (j3 & 4294967295L)));
    }

    public static final long h(s sVar, boolean z3) {
        long g3 = C0238c.g(sVar.f7310c, sVar.f7314g);
        if (z3 || !sVar.b()) {
            return g3;
        }
        return 0L;
    }
}
