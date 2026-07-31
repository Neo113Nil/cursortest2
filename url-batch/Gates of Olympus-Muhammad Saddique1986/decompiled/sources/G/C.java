package G;

/* loaded from: classes.dex */
public final class C implements k {

    /* renamed from: a, reason: collision with root package name */
    public final U.h f1968a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1969b;

    public C(U.h hVar, int i3) {
        this.f1968a = hVar;
        this.f1969b = i3;
    }

    @Override // G.k
    public final int a(O0.i iVar, long j3, int i3) {
        int i4 = (int) (j3 & 4294967295L);
        int i5 = this.f1969b;
        if (i3 < i4 - (i5 * 2)) {
            return O2.d.y(this.f1968a.a(i3, i4), i5, (i4 - i5) - i3);
        }
        return Math.round((1 + 0.0f) * ((i4 - i3) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        return this.f1968a.equals(c2.f1968a) && this.f1969b == c2.f1969b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1969b) + (Float.hashCode(this.f1968a.f4480a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.f1968a);
        sb.append(", margin=");
        return A.k.j(sb, this.f1969b, ')');
    }
}
