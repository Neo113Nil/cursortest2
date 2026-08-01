package o1;

/* renamed from: o1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3349a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.l f3350b;

    public C0292k(Object obj, f1.l lVar) {
        this.f3349a = obj;
        this.f3350b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0292k)) {
            return false;
        }
        C0292k c0292k = (C0292k) obj;
        return g1.f.a(this.f3349a, c0292k.f3349a) && g1.f.a(this.f3350b, c0292k.f3350b);
    }

    public final int hashCode() {
        Object obj = this.f3349a;
        return this.f3350b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f3349a + ", onCancellation=" + this.f3350b + ')';
    }
}
