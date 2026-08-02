package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gfp {
    public final gzp a;
    public final gzp b;
    public final gzp c;
    public final gzp d;

    public gfp(gzp gzpVar, gzp gzpVar2, gzp gzpVar3, gzp gzpVar4) {
        this.a = gzpVar;
        this.b = gzpVar2;
        this.c = gzpVar3;
        this.d = gzpVar4;
    }

    public final gfp a(gft gftVar) {
        return new gfp(this.a, this.b, gyf.a, gzp.h(gftVar));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gfp) {
            gfp gfpVar = (gfp) obj;
            if (this.a.equals(gfpVar.a) && this.b.equals(gfpVar.b) && this.c.equals(gfpVar.c) && this.d.equals(gfpVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        gzp gzpVar = this.d;
        gzp gzpVar2 = this.c;
        gzp gzpVar3 = this.b;
        return "LocalSubscriptionState{maybeLocalDataSource=" + this.a.toString() + ", executingLoad=" + gzpVar3.toString() + ", pendingTopicResult=" + gzpVar2.toString() + ", publishedTopicResult=" + gzpVar.toString() + "}";
    }

    public gfp() {
        throw null;
    }
}
