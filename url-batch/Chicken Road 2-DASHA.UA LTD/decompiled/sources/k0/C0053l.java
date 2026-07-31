package k0;

/* renamed from: k0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f873a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.l f874b;

    public C0053l(Object obj, d0.l lVar) {
        this.f873a = obj;
        this.f874b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0053l)) {
            return false;
        }
        C0053l c0053l = (C0053l) obj;
        return e0.h.a(this.f873a, c0053l.f873a) && e0.h.a(this.f874b, c0053l.f874b);
    }

    public final int hashCode() {
        Object obj = this.f873a;
        return this.f874b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f873a + ", onCancellation=" + this.f874b + ')';
    }
}
