package u0;

/* renamed from: u0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0674d {

    /* renamed from: a, reason: collision with root package name */
    public final String f5970a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f5971b;

    public C0674d(String str, Long l7) {
        this.f5970a = str;
        this.f5971b = l7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0674d)) {
            return false;
        }
        C0674d c0674d = (C0674d) obj;
        return kotlin.jvm.internal.i.a(this.f5970a, c0674d.f5970a) && kotlin.jvm.internal.i.a(this.f5971b, c0674d.f5971b);
    }

    public final int hashCode() {
        int hashCode = this.f5970a.hashCode() * 31;
        Long l7 = this.f5971b;
        return hashCode + (l7 == null ? 0 : l7.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f5970a + ", value=" + this.f5971b + ')';
    }
}
