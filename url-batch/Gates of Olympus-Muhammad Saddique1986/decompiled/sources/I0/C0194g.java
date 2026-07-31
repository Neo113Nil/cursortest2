package I0;

/* renamed from: I0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3061a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3062b;

    public C0194g(int i3, int i4) {
        this.f3061a = i3;
        this.f3062b = i4;
        if (i3 < 0 || i4 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i4 + " respectively.").toString());
        }
    }

    @Override // I0.i
    public final void a(j jVar) {
        int i3 = jVar.f3067c;
        int i4 = this.f3062b;
        int i5 = i3 + i4;
        int i6 = (i3 ^ i5) & (i4 ^ i5);
        E0.f fVar = jVar.f3065a;
        if (i6 < 0) {
            i5 = fVar.b();
        }
        jVar.a(jVar.f3067c, Math.min(i5, fVar.b()));
        int i7 = jVar.f3066b;
        int i8 = this.f3061a;
        int i9 = i7 - i8;
        if (((i7 ^ i9) & (i8 ^ i7)) < 0) {
            i9 = 0;
        }
        jVar.a(Math.max(0, i9), jVar.f3066b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0194g)) {
            return false;
        }
        C0194g c0194g = (C0194g) obj;
        return this.f3061a == c0194g.f3061a && this.f3062b == c0194g.f3062b;
    }

    public final int hashCode() {
        return (this.f3061a * 31) + this.f3062b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f3061a);
        sb.append(", lengthAfterCursor=");
        return A.k.j(sb, this.f3062b, ')');
    }
}
