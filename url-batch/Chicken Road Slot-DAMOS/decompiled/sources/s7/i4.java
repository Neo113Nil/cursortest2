package s7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final j4 f8744a;

    /* renamed from: b, reason: collision with root package name */
    public int f8745b = 1;

    /* renamed from: c, reason: collision with root package name */
    public long f8746c = a();

    public i4(j4 j4Var) {
        this.f8744a = j4Var;
    }

    public final long a() {
        j4 j4Var = this.f8744a;
        c7.c0.g(j4Var);
        long longValue = ((Long) e0.f8654v.a(null)).longValue();
        long longValue2 = ((Long) e0.f8656w.a(null)).longValue();
        for (int i3 = 1; i3 < this.f8745b; i3++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        j4Var.f().getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
