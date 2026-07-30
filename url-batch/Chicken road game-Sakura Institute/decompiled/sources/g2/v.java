package g2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f4063a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4064b;

    public v(int i7, int i8) {
        this.f4063a = i7;
        this.f4064b = i8;
    }

    @Override // g2.i
    public final void a(j jVar) {
        int e9 = v1.g.e(this.f4063a, 0, jVar.f4035a.b());
        int e10 = v1.g.e(this.f4064b, 0, jVar.f4035a.b());
        if (e9 < e10) {
            jVar.f(e9, e10);
        } else {
            jVar.f(e10, e9);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f4063a == vVar.f4063a && this.f4064b == vVar.f4064b;
    }

    public final int hashCode() {
        return (this.f4063a * 31) + this.f4064b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f4063a);
        sb.append(", end=");
        return a0.m.l(sb, this.f4064b, ')');
    }
}
