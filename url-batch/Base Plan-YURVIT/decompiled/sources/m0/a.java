package m0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2854a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2855b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2856c;

    public a(String str, String str2) {
        this.f2854a = str;
        this.f2855b = null;
        this.f2856c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2854a.equals(aVar.f2854a)) {
            return this.f2856c.equals(aVar.f2856c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2856c.hashCode() + (this.f2854a.hashCode() * 31);
    }

    public final String toString() {
        return "DartEntrypoint( bundle path: " + this.f2854a + ", function: " + this.f2856c + " )";
    }

    public a(String str, String str2, String str3) {
        this.f2854a = str;
        this.f2855b = str2;
        this.f2856c = str3;
    }
}
