package m6;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19367a;

    /* renamed from: b, reason: collision with root package name */
    public final f6.l<Throwable, v5.q> f19368b;

    /* JADX WARN: Multi-variable type inference failed */
    public z(Object obj, f6.l<? super Throwable, v5.q> lVar) {
        this.f19367a = obj;
        this.f19368b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.i.a(this.f19367a, zVar.f19367a) && kotlin.jvm.internal.i.a(this.f19368b, zVar.f19368b);
    }

    public int hashCode() {
        Object obj = this.f19367a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f19368b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f19367a + ", onCancellation=" + this.f19368b + ')';
    }
}
