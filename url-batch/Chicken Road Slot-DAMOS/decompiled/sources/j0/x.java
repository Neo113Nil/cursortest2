package j0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final n0.v f4898a = new n0.v(new a1.k(17));

    /* renamed from: b, reason: collision with root package name */
    public static final y f4899b;

    static {
        long j = k1.p.g;
        f4899b = new y(true, j);
        new y(false, j);
    }

    public static y a() {
        long j = k1.p.g;
        return (x2.f.b(Float.NaN, Float.NaN) && k1.p.c(j, j)) ? f4899b : new y(true, j);
    }
}
