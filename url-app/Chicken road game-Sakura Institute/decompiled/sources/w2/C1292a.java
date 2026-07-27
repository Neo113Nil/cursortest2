package w2;

import A.AbstractC0017m;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1292a {

    /* renamed from: a, reason: collision with root package name */
    public final String f11383a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11384b;

    public C1292a(String str, String str2) {
        this.f11383a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f11384b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1292a)) {
            return false;
        }
        C1292a c1292a = (C1292a) obj;
        return this.f11383a.equals(c1292a.f11383a) && this.f11384b.equals(c1292a.f11384b);
    }

    public final int hashCode() {
        return ((this.f11383a.hashCode() ^ 1000003) * 1000003) ^ this.f11384b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f11383a);
        sb.append(", version=");
        return AbstractC0017m.n(sb, this.f11384b, "}");
    }
}
