package G;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f272a;

    /* renamed from: b, reason: collision with root package name */
    public final String f273b;

    /* renamed from: c, reason: collision with root package name */
    public final String f274c;

    public a(String str, String str2) {
        this.f272a = str;
        this.f273b = null;
        this.f274c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f272a.equals(aVar.f272a)) {
            return this.f274c.equals(aVar.f274c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f274c.hashCode() + (this.f272a.hashCode() * 31);
    }

    public final String toString() {
        return "DartEntrypoint( bundle path: " + this.f272a + ", function: " + this.f274c + " )";
    }

    public a(String str, String str2, String str3) {
        this.f272a = str;
        this.f273b = str2;
        this.f274c = str3;
    }
}
