package l0;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public String f18449a;

    /* renamed from: b, reason: collision with root package name */
    public Long f18450b;

    public d(String str, long j7) {
        this.f18449a = str;
        this.f18450b = Long.valueOf(j7);
    }

    public d(String str, boolean z6) {
        this(str, z6 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f18449a.equals(dVar.f18449a)) {
            return false;
        }
        Long l7 = this.f18450b;
        Long l8 = dVar.f18450b;
        return l7 != null ? l7.equals(l8) : l8 == null;
    }

    public int hashCode() {
        int hashCode = this.f18449a.hashCode() * 31;
        Long l7 = this.f18450b;
        return hashCode + (l7 != null ? l7.hashCode() : 0);
    }
}
