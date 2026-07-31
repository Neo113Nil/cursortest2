package I0;

/* loaded from: classes.dex */
public final class y implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3095a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3096b;

    public y(int i3, int i4) {
        this.f3095a = i3;
        this.f3096b = i4;
    }

    @Override // I0.i
    public final void a(j jVar) {
        int y3 = O2.d.y(this.f3095a, 0, jVar.f3065a.b());
        int y4 = O2.d.y(this.f3096b, 0, jVar.f3065a.b());
        if (y3 < y4) {
            jVar.f(y3, y4);
        } else {
            jVar.f(y4, y3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f3095a == yVar.f3095a && this.f3096b == yVar.f3096b;
    }

    public final int hashCode() {
        return (this.f3095a * 31) + this.f3096b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f3095a);
        sb.append(", end=");
        return A.k.j(sb, this.f3096b, ')');
    }
}
