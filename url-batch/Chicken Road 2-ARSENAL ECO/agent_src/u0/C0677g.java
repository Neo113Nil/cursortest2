package u0;

/* renamed from: u0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677g {

    /* renamed from: a, reason: collision with root package name */
    public final String f5977a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5978b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5979c;

    public C0677g(String workSpecId, int i7, int i8) {
        kotlin.jvm.internal.i.e(workSpecId, "workSpecId");
        this.f5977a = workSpecId;
        this.f5978b = i7;
        this.f5979c = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0677g)) {
            return false;
        }
        C0677g c0677g = (C0677g) obj;
        return kotlin.jvm.internal.i.a(this.f5977a, c0677g.f5977a) && this.f5978b == c0677g.f5978b && this.f5979c == c0677g.f5979c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5979c) + ((Integer.hashCode(this.f5978b) + (this.f5977a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.f5977a + ", generation=" + this.f5978b + ", systemId=" + this.f5979c + ')';
    }
}
