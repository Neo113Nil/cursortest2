package l1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5827a = new a(1000);

    /* renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f5828b;

    static {
        new a(1007);
        new a(1008);
        new a(1002);
        f5828b = new StackTraceElement[0];
    }

    public static final boolean a(v vVar) {
        return !vVar.f5837h && vVar.f5833d;
    }

    public static final boolean b(v vVar) {
        return (vVar.b() || !vVar.f5837h || vVar.f5833d) ? false : true;
    }

    public static final boolean c(v vVar) {
        return vVar.f5837h && !vVar.f5833d;
    }

    public static final boolean d(v vVar, long j8) {
        long j9 = vVar.f5832c;
        float d8 = y0.c.d(j9);
        float e9 = y0.c.e(j9);
        return d8 < 0.0f || d8 > ((float) ((int) (j8 >> 32))) || e9 < 0.0f || e9 > ((float) ((int) (j8 & 4294967295L)));
    }

    public static final boolean e(v vVar, long j8, long j9) {
        if (vVar.f5838i != 1) {
            return d(vVar, j8);
        }
        long j10 = vVar.f5832c;
        float d8 = y0.c.d(j10);
        float e9 = y0.c.e(j10);
        return d8 < (-y0.f.d(j9)) || d8 > y0.f.d(j9) + ((float) ((int) (j8 >> 32))) || e9 < (-y0.f.b(j9)) || e9 > y0.f.b(j9) + ((float) ((int) (j8 & 4294967295L)));
    }

    public static final long f(v vVar, boolean z8) {
        long g9 = y0.c.g(vVar.f5832c, vVar.f5836g);
        if (z8 || !vVar.b()) {
            return g9;
        }
        return 0L;
    }
}
