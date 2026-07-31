package I0;

/* loaded from: classes.dex */
public final class w implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3091a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3092b;

    public w(int i3, int i4) {
        this.f3091a = i3;
        this.f3092b = i4;
    }

    @Override // I0.i
    public final void a(j jVar) {
        if (jVar.f3068d != -1) {
            jVar.f3068d = -1;
            jVar.f3069e = -1;
        }
        E0.f fVar = jVar.f3065a;
        int y3 = O2.d.y(this.f3091a, 0, fVar.b());
        int y4 = O2.d.y(this.f3092b, 0, fVar.b());
        if (y3 != y4) {
            if (y3 < y4) {
                jVar.e(y3, y4);
            } else {
                jVar.e(y4, y3);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f3091a == wVar.f3091a && this.f3092b == wVar.f3092b;
    }

    public final int hashCode() {
        return (this.f3091a * 31) + this.f3092b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f3091a);
        sb.append(", end=");
        return A.k.j(sb, this.f3092b, ')');
    }
}
