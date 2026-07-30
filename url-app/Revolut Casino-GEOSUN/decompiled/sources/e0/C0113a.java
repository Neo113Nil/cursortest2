package e0;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1848a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1849b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1850c;

    public C0113a(String str, String str2) {
        this.f1848a = str;
        this.f1849b = null;
        this.f1850c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0113a.class != obj.getClass()) {
            return false;
        }
        C0113a c0113a = (C0113a) obj;
        if (this.f1848a.equals(c0113a.f1848a)) {
            return this.f1850c.equals(c0113a.f1850c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1850c.hashCode() + (this.f1848a.hashCode() * 31);
    }

    public final String toString() {
        return "DartEntrypoint( bundle path: " + this.f1848a + ", function: " + this.f1850c + " )";
    }

    public C0113a(String str, String str2, String str3) {
        this.f1848a = str;
        this.f1849b = str2;
        this.f1850c = str3;
    }
}
