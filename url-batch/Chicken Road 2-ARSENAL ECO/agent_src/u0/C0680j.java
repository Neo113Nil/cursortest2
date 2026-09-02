package u0;

/* renamed from: u0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0680j {

    /* renamed from: a, reason: collision with root package name */
    public final String f5985a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5986b;

    public C0680j(String workSpecId, int i7) {
        kotlin.jvm.internal.i.e(workSpecId, "workSpecId");
        this.f5985a = workSpecId;
        this.f5986b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0680j)) {
            return false;
        }
        C0680j c0680j = (C0680j) obj;
        return kotlin.jvm.internal.i.a(this.f5985a, c0680j.f5985a) && this.f5986b == c0680j.f5986b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5986b) + (this.f5985a.hashCode() * 31);
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f5985a + ", generation=" + this.f5986b + ')';
    }
}
