package F3;

import N.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f709a;

    /* renamed from: b, reason: collision with root package name */
    public final String f710b;

    /* renamed from: c, reason: collision with root package name */
    public final String f711c;

    public a(String str, String str2) {
        this.f709a = str;
        this.f710b = null;
        this.f711c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f709a.equals(aVar.f709a)) {
            return this.f711c.equals(aVar.f711c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f711c.hashCode() + (this.f709a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f709a);
        sb.append(", function: ");
        return p.b(sb, this.f711c, " )");
    }

    public a(String str, String str2, String str3) {
        this.f709a = str;
        this.f710b = str2;
        this.f711c = str3;
    }
}
