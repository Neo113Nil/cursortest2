package k5;

import java.io.Serializable;

/* renamed from: k5.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0482l implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final String f5207f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5208g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5209h;

    public C0482l(String str, String str2, String str3) {
        this.f5207f = str;
        this.f5208g = str2;
        this.f5209h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0482l)) {
            return false;
        }
        C0482l c0482l = (C0482l) obj;
        return this.f5207f.equals(c0482l.f5207f) && kotlin.jvm.internal.i.a(this.f5208g, c0482l.f5208g) && kotlin.jvm.internal.i.a(this.f5209h, c0482l.f5209h);
    }

    public final int hashCode() {
        int hashCode = this.f5207f.hashCode() * 31;
        Object obj = this.f5208g;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f5209h;
        return hashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + ((Object) this.f5207f) + ", " + this.f5208g + ", " + this.f5209h + ')';
    }
}
