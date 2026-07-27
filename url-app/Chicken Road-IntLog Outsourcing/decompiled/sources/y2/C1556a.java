package y2;

import b2.AbstractC0279e;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1556a {

    /* renamed from: a, reason: collision with root package name */
    public final String f12343a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12344b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12345c;

    public C1556a(String str, String str2) {
        this.f12343a = str;
        this.f12344b = null;
        this.f12345c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1556a.class != obj.getClass()) {
            return false;
        }
        C1556a c1556a = (C1556a) obj;
        if (this.f12343a.equals(c1556a.f12343a)) {
            return this.f12345c.equals(c1556a.f12345c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12345c.hashCode() + (this.f12343a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f12343a);
        sb.append(", function: ");
        return AbstractC0279e.h(sb, this.f12345c, " )");
    }

    public C1556a(String str, String str2, String str3) {
        this.f12343a = str;
        this.f12344b = str2;
        this.f12345c = str3;
    }
}
