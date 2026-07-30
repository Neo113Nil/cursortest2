package g2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f4033a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4034b;

    public h(int i7, int i8) {
        this.f4033a = i7;
        this.f4034b = i8;
        if (i7 < 0 || i8 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i7 + " and " + i8 + " respectively.").toString());
        }
    }

    @Override // g2.i
    public final void a(j jVar) {
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 < this.f4033a) {
                int i10 = i9 + 1;
                int i11 = jVar.f4036b;
                if (i11 <= i10) {
                    i9 = i11;
                    break;
                } else {
                    i9 = (Character.isHighSurrogate(jVar.b((i11 - i10) + (-1))) && Character.isLowSurrogate(jVar.b(jVar.f4036b - i10))) ? i9 + 2 : i10;
                    i8++;
                }
            } else {
                break;
            }
        }
        int i12 = 0;
        while (true) {
            if (i7 >= this.f4034b) {
                break;
            }
            int i13 = i12 + 1;
            int i14 = jVar.f4037c;
            c2.f fVar = jVar.f4035a;
            if (i14 + i13 >= fVar.b()) {
                i12 = fVar.b() - jVar.f4037c;
                break;
            } else {
                i12 = (Character.isHighSurrogate(jVar.b((jVar.f4037c + i13) + (-1))) && Character.isLowSurrogate(jVar.b(jVar.f4037c + i13))) ? i12 + 2 : i13;
                i7++;
            }
        }
        int i15 = jVar.f4037c;
        jVar.a(i15, i12 + i15);
        int i16 = jVar.f4036b;
        jVar.a(i16 - i9, i16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f4033a == hVar.f4033a && this.f4034b == hVar.f4034b;
    }

    public final int hashCode() {
        return (this.f4033a * 31) + this.f4034b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f4033a);
        sb.append(", lengthAfterCursor=");
        return a0.m.l(sb, this.f4034b, ')');
    }
}
