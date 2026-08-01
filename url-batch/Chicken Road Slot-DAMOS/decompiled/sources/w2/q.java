package w2;

import z4.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f10052c = new q(v.c(0), v.c(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f10053a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10054b;

    public q(long j, long j3) {
        this.f10053a = j;
        this.f10054b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return x2.n.a(this.f10053a, qVar.f10053a) && x2.n.a(this.f10054b, qVar.f10054b);
    }

    public final int hashCode() {
        x2.o[] oVarArr = x2.n.f10334b;
        return Long.hashCode(this.f10054b) + (Long.hashCode(this.f10053a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) x2.n.d(this.f10053a)) + ", restLine=" + ((Object) x2.n.d(this.f10054b)) + ')';
    }
}
