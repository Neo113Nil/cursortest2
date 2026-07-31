package k5;

import java.io.Serializable;

/* renamed from: k5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477g implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final Object f5198f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5199g;

    public C0477g(Object obj, Object obj2) {
        this.f5198f = obj;
        this.f5199g = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0477g)) {
            return false;
        }
        C0477g c0477g = (C0477g) obj;
        return kotlin.jvm.internal.i.a(this.f5198f, c0477g.f5198f) && kotlin.jvm.internal.i.a(this.f5199g, c0477g.f5199g);
    }

    public final int hashCode() {
        Object obj = this.f5198f;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f5199g;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f5198f + ", " + this.f5199g + ')';
    }
}
