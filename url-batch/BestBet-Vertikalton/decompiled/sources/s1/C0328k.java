package s1;

/* renamed from: s1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4052a;

    /* renamed from: b, reason: collision with root package name */
    public final j1.l f4053b;

    public C0328k(Object obj, j1.l lVar) {
        this.f4052a = obj;
        this.f4053b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0328k)) {
            return false;
        }
        C0328k c0328k = (C0328k) obj;
        return k1.e.a(this.f4052a, c0328k.f4052a) && k1.e.a(this.f4053b, c0328k.f4053b);
    }

    public final int hashCode() {
        Object obj = this.f4052a;
        return this.f4053b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f4052a + ", onCancellation=" + this.f4053b + ')';
    }
}
