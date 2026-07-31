package G;

/* renamed from: G.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final U.h f1973a;

    /* renamed from: b, reason: collision with root package name */
    public final U.h f1974b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1975c;

    public C0135b(U.h hVar, U.h hVar2, int i3) {
        this.f1973a = hVar;
        this.f1974b = hVar2;
        this.f1975c = i3;
    }

    @Override // G.k
    public final int a(O0.i iVar, long j3, int i3) {
        int a3 = this.f1974b.a(0, iVar.a());
        return iVar.f3737b + a3 + (-this.f1973a.a(0, i3)) + this.f1975c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0135b)) {
            return false;
        }
        C0135b c0135b = (C0135b) obj;
        return this.f1973a.equals(c0135b.f1973a) && this.f1974b.equals(c0135b.f1974b) && this.f1975c == c0135b.f1975c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1975c) + A.k.a(this.f1974b.f4480a, Float.hashCode(this.f1973a.f4480a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.f1973a);
        sb.append(", anchorAlignment=");
        sb.append(this.f1974b);
        sb.append(", offset=");
        return A.k.j(sb, this.f1975c, ')');
    }
}
