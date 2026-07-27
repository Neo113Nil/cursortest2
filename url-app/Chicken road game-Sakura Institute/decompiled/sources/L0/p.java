package L0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f3521c = new p(u3.l.k0(0), u3.l.k0(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f3522a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3523b;

    public p(long j4, long j5) {
        this.f3522a = j4;
        this.f3523b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return M0.m.a(this.f3522a, pVar.f3522a) && M0.m.a(this.f3523b, pVar.f3523b);
    }

    public final int hashCode() {
        M0.n[] nVarArr = M0.m.f3559b;
        return Long.hashCode(this.f3523b) + (Long.hashCode(this.f3522a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) M0.m.d(this.f3522a)) + ", restLine=" + ((Object) M0.m.d(this.f3523b)) + ')';
    }
}
