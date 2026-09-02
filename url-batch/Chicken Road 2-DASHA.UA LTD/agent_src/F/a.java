package F;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f197a;

    /* renamed from: b, reason: collision with root package name */
    public final String f198b;

    /* renamed from: c, reason: collision with root package name */
    public final String f199c;

    public a(String str, String str2) {
        this.f197a = str;
        this.f198b = null;
        this.f199c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f197a.equals(aVar.f197a)) {
            return this.f199c.equals(aVar.f199c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f199c.hashCode() + (this.f197a.hashCode() * 31);
    }

    public final String toString() {
        return "DartEntrypoint( bundle path: " + this.f197a + ", function: " + this.f199c + " )";
    }

    public a(String str, String str2, String str3) {
        this.f197a = str;
        this.f198b = str2;
        this.f199c = str3;
    }
}
