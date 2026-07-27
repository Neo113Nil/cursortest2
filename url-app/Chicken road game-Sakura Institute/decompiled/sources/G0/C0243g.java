package G0;

import A.AbstractC0017m;

/* renamed from: G0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3057a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3058b;

    public C0243g(int i2, int i4) {
        this.f3057a = i2;
        this.f3058b = i4;
        if (i2 < 0 || i4 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i4 + " respectively.").toString());
        }
    }

    @Override // G0.i
    public final void a(j jVar) {
        int i2 = jVar.f3063c;
        int i4 = this.f3058b;
        int i5 = i2 + i4;
        int i6 = (i2 ^ i5) & (i4 ^ i5);
        C0.f fVar = jVar.f3061a;
        if (i6 < 0) {
            i5 = fVar.b();
        }
        jVar.a(jVar.f3063c, Math.min(i5, fVar.b()));
        int i7 = jVar.f3062b;
        int i8 = this.f3057a;
        int i9 = i7 - i8;
        if (((i7 ^ i9) & (i8 ^ i7)) < 0) {
            i9 = 0;
        }
        jVar.a(Math.max(0, i9), jVar.f3062b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0243g)) {
            return false;
        }
        C0243g c0243g = (C0243g) obj;
        return this.f3057a == c0243g.f3057a && this.f3058b == c0243g.f3058b;
    }

    public final int hashCode() {
        return (this.f3057a * 31) + this.f3058b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f3057a);
        sb.append(", lengthAfterCursor=");
        return AbstractC0017m.l(sb, this.f3058b, ')');
    }
}
