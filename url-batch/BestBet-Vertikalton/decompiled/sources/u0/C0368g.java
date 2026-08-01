package u0;

/* renamed from: u0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368g {

    /* renamed from: a, reason: collision with root package name */
    public final long f4183a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4184b;

    public C0368g(long j2, long j3) {
        this.f4183a = j2;
        this.f4184b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0368g)) {
            return false;
        }
        C0368g c0368g = (C0368g) obj;
        return this.f4183a == c0368g.f4183a && this.f4184b == c0368g.f4184b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4184b) + (Long.hashCode(this.f4183a) * 31);
    }

    public final String toString() {
        return "HabitCompletionEntity(habitId=" + this.f4183a + ", dayEpoch=" + this.f4184b + ")";
    }
}
