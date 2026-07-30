package j4;

/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5952a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5953b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5954c;

    public C0572a(String str, String str2) {
        this.f5952a = str;
        this.f5953b = null;
        this.f5954c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0572a.class != obj.getClass()) {
            return false;
        }
        C0572a c0572a = (C0572a) obj;
        if (this.f5952a.equals(c0572a.f5952a)) {
            return this.f5954c.equals(c0572a.f5954c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5954c.hashCode() + (this.f5952a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f5952a);
        sb.append(", function: ");
        return r4.f.f(sb, this.f5954c, " )");
    }

    public C0572a(String str, String str2, String str3) {
        this.f5952a = str;
        this.f5953b = str2;
        this.f5954c = str3;
    }
}
