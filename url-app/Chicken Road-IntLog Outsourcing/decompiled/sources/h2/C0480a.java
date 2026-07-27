package h2;

import b2.AbstractC0279e;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5777a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5778b;

    public C0480a(String str, String str2) {
        this.f5777a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f5778b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0480a)) {
            return false;
        }
        C0480a c0480a = (C0480a) obj;
        return this.f5777a.equals(c0480a.f5777a) && this.f5778b.equals(c0480a.f5778b);
    }

    public final int hashCode() {
        return ((this.f5777a.hashCode() ^ 1000003) * 1000003) ^ this.f5778b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f5777a);
        sb.append(", version=");
        return AbstractC0279e.h(sb, this.f5778b, "}");
    }
}
