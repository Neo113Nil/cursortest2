package G;

/* renamed from: G.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final U.g f1970a;

    /* renamed from: b, reason: collision with root package name */
    public final U.g f1971b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1972c;

    public C0134a(U.g gVar, U.g gVar2, int i3) {
        this.f1970a = gVar;
        this.f1971b = gVar2;
        this.f1972c = i3;
    }

    @Override // G.j
    public final int a(O0.i iVar, long j3, int i3, O0.k kVar) {
        int i4 = iVar.f3738c;
        int i5 = iVar.f3736a;
        int a3 = this.f1971b.a(0, i4 - i5, kVar);
        int i6 = -this.f1970a.a(0, i3, kVar);
        O0.k kVar2 = O0.k.f3741d;
        int i7 = this.f1972c;
        if (kVar != kVar2) {
            i7 = -i7;
        }
        return i5 + a3 + i6 + i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0134a)) {
            return false;
        }
        C0134a c0134a = (C0134a) obj;
        return this.f1970a.equals(c0134a.f1970a) && this.f1971b.equals(c0134a.f1971b) && this.f1972c == c0134a.f1972c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1972c) + A.k.a(this.f1971b.f4479a, Float.hashCode(this.f1970a.f4479a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.f1970a);
        sb.append(", anchorAlignment=");
        sb.append(this.f1971b);
        sb.append(", offset=");
        return A.k.j(sb, this.f1972c, ')');
    }
}
