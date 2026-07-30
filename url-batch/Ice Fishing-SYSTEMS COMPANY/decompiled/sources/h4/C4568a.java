package h4;

import t0.AbstractC5051n;

/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4568a {

    /* renamed from: a, reason: collision with root package name */
    public final String f38226a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38227b;

    public C4568a(String str, String str2) {
        this.f38226a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f38227b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4568a) {
            C4568a c4568a = (C4568a) obj;
            if (this.f38226a.equals(c4568a.f38226a) && this.f38227b.equals(c4568a.f38227b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f38226a.hashCode() ^ 1000003) * 1000003) ^ this.f38227b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f38226a);
        sb.append(", version=");
        return AbstractC5051n.g(sb, this.f38227b, "}");
    }
}
