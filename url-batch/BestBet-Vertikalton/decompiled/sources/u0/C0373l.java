package u0;

/* renamed from: u0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373l {

    /* renamed from: a, reason: collision with root package name */
    public final long f4193a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4194b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4195c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4196e;

    public C0373l(long j2, String str, int i, long j3, boolean z2) {
        k1.e.e(str, "title");
        this.f4193a = j2;
        this.f4194b = str;
        this.f4195c = i;
        this.d = j3;
        this.f4196e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0373l)) {
            return false;
        }
        C0373l c0373l = (C0373l) obj;
        return this.f4193a == c0373l.f4193a && k1.e.a(this.f4194b, c0373l.f4194b) && this.f4195c == c0373l.f4195c && this.d == c0373l.d && this.f4196e == c0373l.f4196e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4196e) + ((Long.hashCode(this.d) + ((Integer.hashCode(this.f4195c) + ((this.f4194b.hashCode() + (Long.hashCode(this.f4193a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "HabitEntity(id=" + this.f4193a + ", title=" + this.f4194b + ", symbolIndex=" + this.f4195c + ", createdAt=" + this.d + ", active=" + this.f4196e + ")";
    }
}
