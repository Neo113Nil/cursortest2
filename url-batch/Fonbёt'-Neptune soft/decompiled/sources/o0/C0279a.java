package o0;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3325a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3326b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3327c;

    public C0279a(String str, String str2) {
        this.f3325a = str;
        this.f3326b = null;
        this.f3327c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0279a.class != obj.getClass()) {
            return false;
        }
        C0279a c0279a = (C0279a) obj;
        if (this.f3325a.equals(c0279a.f3325a)) {
            return this.f3327c.equals(c0279a.f3327c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3327c.hashCode() + (this.f3325a.hashCode() * 31);
    }

    public final String toString() {
        return "DartEntrypoint( bundle path: " + this.f3325a + ", function: " + this.f3327c + " )";
    }

    public C0279a(String str, String str2, String str3) {
        this.f3325a = str;
        this.f3326b = str2;
        this.f3327c = str3;
    }
}
