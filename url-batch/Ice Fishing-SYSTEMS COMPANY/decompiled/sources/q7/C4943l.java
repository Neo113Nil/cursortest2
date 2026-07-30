package q7;

import java.io.Serializable;

/* renamed from: q7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4943l implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final String f40171n;

    /* renamed from: u, reason: collision with root package name */
    public final String f40172u;

    /* renamed from: v, reason: collision with root package name */
    public final String f40173v;

    public C4943l(String str, String str2, String str3) {
        this.f40171n = str;
        this.f40172u = str2;
        this.f40173v = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4943l)) {
            return false;
        }
        C4943l c4943l = (C4943l) obj;
        return this.f40171n.equals(c4943l.f40171n) && kotlin.jvm.internal.h.a(this.f40172u, c4943l.f40172u) && kotlin.jvm.internal.h.a(this.f40173v, c4943l.f40173v);
    }

    public final int hashCode() {
        int hashCode = this.f40171n.hashCode() * 31;
        String str = this.f40172u;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f40173v;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + ((Object) this.f40171n) + ", " + ((Object) this.f40172u) + ", " + ((Object) this.f40173v) + ')';
    }
}
