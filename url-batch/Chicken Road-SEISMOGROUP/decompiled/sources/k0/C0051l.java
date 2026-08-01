package k0;

/* renamed from: k0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f926a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.l f927b;

    public C0051l(Object obj, d0.l lVar) {
        this.f926a = obj;
        this.f927b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0051l)) {
            return false;
        }
        C0051l c0051l = (C0051l) obj;
        return e0.h.a(this.f926a, c0051l.f926a) && e0.h.a(this.f927b, c0051l.f927b);
    }

    public final int hashCode() {
        Object obj = this.f926a;
        return this.f927b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f926a + ", onCancellation=" + this.f927b + ')';
    }
}
