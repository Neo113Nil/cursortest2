package M0;

/* renamed from: M0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f677a;

    /* renamed from: b, reason: collision with root package name */
    public final E0.l f678b;

    public C0057o(Object obj, E0.l lVar) {
        this.f677a = obj;
        this.f678b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0057o)) {
            return false;
        }
        C0057o c0057o = (C0057o) obj;
        return F0.i.a(this.f677a, c0057o.f677a) && F0.i.a(this.f678b, c0057o.f678b);
    }

    public final int hashCode() {
        Object obj = this.f677a;
        return this.f678b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f677a + ", onCancellation=" + this.f678b + ')';
    }
}
