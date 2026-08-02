package G1;

import E1.AbstractC0033i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f531a;

    /* renamed from: b, reason: collision with root package name */
    public final String f532b;

    /* renamed from: c, reason: collision with root package name */
    public final String f533c;

    public a(String str, String str2) {
        this.f531a = str;
        this.f532b = null;
        this.f533c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f531a.equals(aVar.f531a)) {
            return this.f533c.equals(aVar.f533c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f533c.hashCode() + (this.f531a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f531a);
        sb.append(", function: ");
        return AbstractC0033i.m(sb, this.f533c, " )");
    }

    public a(String str, String str2, String str3) {
        this.f531a = str;
        this.f532b = str2;
        this.f533c = str3;
    }
}
