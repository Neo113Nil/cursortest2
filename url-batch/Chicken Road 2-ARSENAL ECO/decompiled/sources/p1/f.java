package p1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final o f5678a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5679b;

    public f(o oVar, boolean z5) {
        this.f5678a = oVar;
        this.f5679b = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.f5678a.equals(this.f5678a) && fVar.f5679b == this.f5679b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5678a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f5679b).hashCode();
    }
}
