package q2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f6064c = new q(r2.o.Q(0), r2.o.Q(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f6065a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6066b;

    public q(long j7, long j8) {
        this.f6065a = j7;
        this.f6066b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return r2.n.a(this.f6065a, qVar.f6065a) && r2.n.a(this.f6066b, qVar.f6066b);
    }

    public final int hashCode() {
        r2.p[] pVarArr = r2.n.f6533b;
        return Long.hashCode(this.f6066b) + (Long.hashCode(this.f6065a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) r2.n.d(this.f6065a)) + ", restLine=" + ((Object) r2.n.d(this.f6066b)) + ')';
    }
}
