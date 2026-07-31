package w0;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f22878c = new c0(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f22879a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22880b;

    public c0(long j7, long j8) {
        this.f22879a = j7;
        this.f22880b = j8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f22879a == c0Var.f22879a && this.f22880b == c0Var.f22880b;
    }

    public int hashCode() {
        return (((int) this.f22879a) * 31) + ((int) this.f22880b);
    }

    public String toString() {
        return "[timeUs=" + this.f22879a + ", position=" + this.f22880b + "]";
    }
}
