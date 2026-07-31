package r0;

/* loaded from: classes.dex */
public final class j3 {

    /* renamed from: c, reason: collision with root package name */
    public static final j3 f20703c;

    /* renamed from: d, reason: collision with root package name */
    public static final j3 f20704d;

    /* renamed from: e, reason: collision with root package name */
    public static final j3 f20705e;

    /* renamed from: f, reason: collision with root package name */
    public static final j3 f20706f;

    /* renamed from: g, reason: collision with root package name */
    public static final j3 f20707g;

    /* renamed from: a, reason: collision with root package name */
    public final long f20708a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20709b;

    static {
        j3 j3Var = new j3(0L, 0L);
        f20703c = j3Var;
        f20704d = new j3(Long.MAX_VALUE, Long.MAX_VALUE);
        f20705e = new j3(Long.MAX_VALUE, 0L);
        f20706f = new j3(0L, Long.MAX_VALUE);
        f20707g = j3Var;
    }

    public j3(long j7, long j8) {
        o2.a.a(j7 >= 0);
        o2.a.a(j8 >= 0);
        this.f20708a = j7;
        this.f20709b = j8;
    }

    public long a(long j7, long j8, long j9) {
        long j10 = this.f20708a;
        if (j10 == 0 && this.f20709b == 0) {
            return j7;
        }
        long T0 = o2.m0.T0(j7, j10, Long.MIN_VALUE);
        long b7 = o2.m0.b(j7, this.f20709b, Long.MAX_VALUE);
        boolean z6 = T0 <= j8 && j8 <= b7;
        boolean z7 = T0 <= j9 && j9 <= b7;
        return (z6 && z7) ? Math.abs(j8 - j7) <= Math.abs(j9 - j7) ? j8 : j9 : z6 ? j8 : z7 ? j9 : T0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j3.class != obj.getClass()) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return this.f20708a == j3Var.f20708a && this.f20709b == j3Var.f20709b;
    }

    public int hashCode() {
        return (((int) this.f20708a) * 31) + ((int) this.f20709b);
    }
}
