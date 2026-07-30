package g2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f4059a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4060b;

    public t(int i7, int i8) {
        this.f4059a = i7;
        this.f4060b = i8;
    }

    @Override // g2.i
    public final void a(j jVar) {
        boolean z8 = jVar.f4038d != -1;
        c2.f fVar = jVar.f4035a;
        if (z8) {
            jVar.f4038d = -1;
            jVar.f4039e = -1;
        }
        int e9 = v1.g.e(this.f4059a, 0, fVar.b());
        int e10 = v1.g.e(this.f4060b, 0, fVar.b());
        if (e9 != e10) {
            if (e9 < e10) {
                jVar.e(e9, e10);
            } else {
                jVar.e(e10, e9);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f4059a == tVar.f4059a && this.f4060b == tVar.f4060b;
    }

    public final int hashCode() {
        return (this.f4059a * 31) + this.f4060b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f4059a);
        sb.append(", end=");
        return a0.m.l(sb, this.f4060b, ')');
    }
}
