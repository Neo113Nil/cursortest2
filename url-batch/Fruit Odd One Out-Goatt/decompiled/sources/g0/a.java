package g0;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f331a;

    /* renamed from: b, reason: collision with root package name */
    public final String f332b;

    /* renamed from: c, reason: collision with root package name */
    public final String f333c;

    public a(String str, String str2) {
        this.f331a = str;
        this.f332b = null;
        this.f333c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f331a.equals(aVar.f331a)) {
            return this.f333c.equals(aVar.f333c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f333c.hashCode() + (this.f331a.hashCode() * 31);
    }

    public final String toString() {
        return "DartEntrypoint( bundle path: " + this.f331a + ", function: " + this.f333c + " )";
    }

    public a(String str, String str2, String str3) {
        this.f331a = str;
        this.f332b = str2;
        this.f333c = str3;
    }
}
