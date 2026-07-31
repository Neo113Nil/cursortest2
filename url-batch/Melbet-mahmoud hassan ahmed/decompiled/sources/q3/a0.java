package q3;

/* loaded from: classes.dex */
final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final b<?> f20220a;

    /* renamed from: b, reason: collision with root package name */
    private final o3.d f20221b;

    /* synthetic */ a0(b bVar, o3.d dVar, u uVar) {
        this.f20220a = bVar;
        this.f20221b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof a0)) {
            a0 a0Var = (a0) obj;
            if (r3.n.a(this.f20220a, a0Var.f20220a) && r3.n.a(this.f20221b, a0Var.f20221b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return r3.n.b(this.f20220a, this.f20221b);
    }

    public final String toString() {
        return r3.n.c(this).a("key", this.f20220a).a("feature", this.f20221b).toString();
    }
}
