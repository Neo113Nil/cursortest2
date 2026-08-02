package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gen {
    public static final gel a = new gem();
    public final long b;
    public final gel c;
    public final boolean d;
    public final gzp e;
    public final gzp f;

    public gen(long j, gel gelVar, boolean z, gzp gzpVar, gzp gzpVar2) {
        this.b = j;
        if (gelVar == null) {
            throw new NullPointerException("Null callbacks");
        }
        this.c = gelVar;
        this.d = z;
        this.e = gzpVar;
        this.f = gzpVar2;
    }

    final gen a(gdy gdyVar) {
        return new gen(this.b, this.c, this.d, gzp.h(gdyVar), gzp.h(gdyVar));
    }

    public final gen b(boolean z) {
        gel gelVar = this.c;
        hoq.I(gelVar instanceof gdl, "Non-BackgroundFetchCallbacks shouldn't be mutating around background fetch callbacks.");
        hoq.I(z != this.d, "Double-open or double-close on background fetch callbacks.");
        return new gen(this.b, gelVar, z, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gen) {
            gen genVar = (gen) obj;
            if (this.b == genVar.b && this.c.equals(genVar.c) && this.d == genVar.d && this.e.equals(genVar.e) && this.f.equals(genVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return this.f.hashCode() ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003);
    }

    public final String toString() {
        gzp gzpVar = this.f;
        gzp gzpVar2 = this.e;
        return "SubscriptionCallbacksState{index=" + this.b + ", callbacks=" + this.c.toString() + ", openBackgroundFetch=" + this.d + ", maybeTopicData=" + gzpVar2.toString() + ", maybeInstanceData=" + gzpVar.toString() + "}";
    }

    public gen() {
        throw null;
    }
}
