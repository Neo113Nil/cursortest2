package G;

/* loaded from: classes.dex */
public final class B implements j {

    /* renamed from: a, reason: collision with root package name */
    public final U.e f1967a;

    public B(U.e eVar) {
        this.f1967a = eVar;
    }

    @Override // G.j
    public final int a(O0.i iVar, long j3, int i3, O0.k kVar) {
        int i4 = (int) (j3 >> 32);
        if (i3 >= i4) {
            return Math.round((1 + (kVar != O0.k.f3741d ? 0.0f * (-1) : 0.0f)) * ((i4 - i3) / 2.0f));
        }
        return O2.d.y(this.f1967a.a(i3, i4, kVar), 0, i4 - i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof B) {
            return this.f1967a.equals(((B) obj).f1967a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.f1967a.f4477a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.f1967a + ", margin=0)";
    }
}
