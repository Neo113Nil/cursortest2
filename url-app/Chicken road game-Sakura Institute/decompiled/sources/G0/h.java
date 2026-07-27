package G0;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3059a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3060b;

    public h(int i2, int i4) {
        this.f3059a = i2;
        this.f3060b = i4;
        if (i2 < 0 || i4 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i4 + " respectively.").toString());
        }
    }

    @Override // G0.i
    public final void a(j jVar) {
        int i2 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 < this.f3059a) {
                int i6 = i5 + 1;
                int i7 = jVar.f3062b;
                if (i7 <= i6) {
                    i5 = i7;
                    break;
                } else {
                    i5 = (Character.isHighSurrogate(jVar.b((i7 - i6) + (-1))) && Character.isLowSurrogate(jVar.b(jVar.f3062b - i6))) ? i5 + 2 : i6;
                    i4++;
                }
            } else {
                break;
            }
        }
        int i8 = 0;
        while (true) {
            if (i2 >= this.f3060b) {
                break;
            }
            int i9 = i8 + 1;
            int i10 = jVar.f3063c + i9;
            C0.f fVar = jVar.f3061a;
            if (i10 >= fVar.b()) {
                i8 = fVar.b() - jVar.f3063c;
                break;
            } else {
                i8 = (Character.isHighSurrogate(jVar.b((jVar.f3063c + i9) + (-1))) && Character.isLowSurrogate(jVar.b(jVar.f3063c + i9))) ? i8 + 2 : i9;
                i2++;
            }
        }
        int i11 = jVar.f3063c;
        jVar.a(i11, i8 + i11);
        int i12 = jVar.f3062b;
        jVar.a(i12 - i5, i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f3059a == hVar.f3059a && this.f3060b == hVar.f3060b;
    }

    public final int hashCode() {
        return (this.f3059a * 31) + this.f3060b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f3059a);
        sb.append(", lengthAfterCursor=");
        return AbstractC0017m.l(sb, this.f3060b, ')');
    }
}
