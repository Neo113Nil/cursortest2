package z4;

/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1059a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8716a;

    public C1059a(boolean z7) {
        this.f8716a = z7;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(C1059a.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return V6.b.u(Boolean.valueOf(this.f8716a), Boolean.valueOf(((C1059a) obj).f8716a));
    }

    public final int hashCode() {
        return V6.b.v(Boolean.valueOf(this.f8716a)) + (C1059a.class.hashCode() * 31);
    }

    public final String toString() {
        return "BrowserOptions(showTitle=" + this.f8716a + ")";
    }
}
