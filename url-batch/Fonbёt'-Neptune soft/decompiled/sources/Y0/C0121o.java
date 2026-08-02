package Y0;

/* renamed from: Y0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1220a;

    /* renamed from: b, reason: collision with root package name */
    public final P0.l f1221b;

    public C0121o(Object obj, P0.l lVar) {
        this.f1220a = obj;
        this.f1221b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0121o)) {
            return false;
        }
        C0121o c0121o = (C0121o) obj;
        return Q0.h.a(this.f1220a, c0121o.f1220a) && Q0.h.a(this.f1221b, c0121o.f1221b);
    }

    public final int hashCode() {
        Object obj = this.f1220a;
        return this.f1221b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f1220a + ", onCancellation=" + this.f1221b + ')';
    }
}
