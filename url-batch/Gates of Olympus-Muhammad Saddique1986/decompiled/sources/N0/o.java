package N0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final o f3557c = new o(O2.l.g0(0), O2.l.g0(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f3558a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3559b;

    public o(long j3, long j4) {
        this.f3558a = j3;
        this.f3559b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return O0.m.a(this.f3558a, oVar.f3558a) && O0.m.a(this.f3559b, oVar.f3559b);
    }

    public final int hashCode() {
        O0.n[] nVarArr = O0.m.f3745b;
        return Long.hashCode(this.f3559b) + (Long.hashCode(this.f3558a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) O0.m.d(this.f3558a)) + ", restLine=" + ((Object) O0.m.d(this.f3559b)) + ')';
    }
}
