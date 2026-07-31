package v5;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class j<A, B> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    private final A f22830f;

    /* renamed from: g, reason: collision with root package name */
    private final B f22831g;

    public j(A a7, B b7) {
        this.f22830f = a7;
        this.f22831g = b7;
    }

    public final A a() {
        return this.f22830f;
    }

    public final B b() {
        return this.f22831g;
    }

    public final A c() {
        return this.f22830f;
    }

    public final B d() {
        return this.f22831g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.i.a(this.f22830f, jVar.f22830f) && kotlin.jvm.internal.i.a(this.f22831g, jVar.f22831g);
    }

    public int hashCode() {
        A a7 = this.f22830f;
        int hashCode = (a7 == null ? 0 : a7.hashCode()) * 31;
        B b7 = this.f22831g;
        return hashCode + (b7 != null ? b7.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f22830f + ", " + this.f22831g + ')';
    }
}
