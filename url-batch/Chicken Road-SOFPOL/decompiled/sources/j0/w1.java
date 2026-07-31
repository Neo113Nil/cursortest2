package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0.b0 f3934a = new m0.b0(new c.e(12));

    /* renamed from: b, reason: collision with root package name */
    public static final x1 f3935b;

    static {
        long j7 = f1.s.f2704h;
        f3935b = new x1(j7, true);
        new x1(j7, false);
    }

    public static x1 a() {
        long j7 = f1.s.f2704h;
        return (r2.f.a(Float.NaN, Float.NaN) && f1.s.c(j7, j7)) ? f3935b : new x1(j7, true);
    }
}
