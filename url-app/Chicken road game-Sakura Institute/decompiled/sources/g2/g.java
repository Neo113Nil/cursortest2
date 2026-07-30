package g2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f4031a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4032b;

    public g(int i7, int i8) {
        this.f4031a = i7;
        this.f4032b = i8;
        if (i7 < 0 || i8 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i7 + " and " + i8 + " respectively.").toString());
        }
    }

    @Override // g2.i
    public final void a(j jVar) {
        int i7 = jVar.f4037c;
        c2.f fVar = jVar.f4035a;
        int i8 = this.f4032b;
        int i9 = i7 + i8;
        if (((i7 ^ i9) & (i8 ^ i9)) < 0) {
            i9 = fVar.b();
        }
        jVar.a(jVar.f4037c, Math.min(i9, fVar.b()));
        int i10 = jVar.f4036b;
        int i11 = this.f4031a;
        int i12 = i10 - i11;
        if (((i10 ^ i12) & (i11 ^ i10)) < 0) {
            i12 = 0;
        }
        jVar.a(Math.max(0, i12), jVar.f4036b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f4031a == gVar.f4031a && this.f4032b == gVar.f4032b;
    }

    public final int hashCode() {
        return (this.f4031a * 31) + this.f4032b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f4031a);
        sb.append(", lengthAfterCursor=");
        return a0.m.l(sb, this.f4032b, ')');
    }
}
