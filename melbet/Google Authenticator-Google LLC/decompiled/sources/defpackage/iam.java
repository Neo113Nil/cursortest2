package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iam {
    public final boolean a;
    private final iaz b;

    public iam(iaz iazVar, boolean z) {
        this.b = iazVar;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iam) {
            iam iamVar = (iam) obj;
            if (iamVar.b.equals(this.b) && iamVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode() ^ ((this.b.hashCode() ^ 1000003) * 1000003);
    }
}
