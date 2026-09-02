package e0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f8409a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8410b;

    public q(long j4, long j5) {
        this.f8409a = j4;
        this.f8410b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f8409a == qVar.f8409a && this.f8410b == qVar.f8410b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f8409a) * 31) + ((int) this.f8410b);
    }
}
