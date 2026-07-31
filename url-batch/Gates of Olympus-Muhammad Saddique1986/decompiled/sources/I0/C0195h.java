package I0;

/* renamed from: I0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3063a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3064b;

    public C0195h(int i3, int i4) {
        this.f3063a = i3;
        this.f3064b = i4;
        if (i3 < 0 || i4 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i4 + " respectively.").toString());
        }
    }

    @Override // I0.i
    public final void a(j jVar) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 < this.f3063a) {
                int i6 = i5 + 1;
                int i7 = jVar.f3066b;
                if (i7 <= i6) {
                    i5 = i7;
                    break;
                } else {
                    i5 = (Character.isHighSurrogate(jVar.b((i7 - i6) + (-1))) && Character.isLowSurrogate(jVar.b(jVar.f3066b - i6))) ? i5 + 2 : i6;
                    i4++;
                }
            } else {
                break;
            }
        }
        int i8 = 0;
        while (true) {
            if (i3 >= this.f3064b) {
                break;
            }
            int i9 = i8 + 1;
            int i10 = jVar.f3067c + i9;
            E0.f fVar = jVar.f3065a;
            if (i10 >= fVar.b()) {
                i8 = fVar.b() - jVar.f3067c;
                break;
            } else {
                i8 = (Character.isHighSurrogate(jVar.b((jVar.f3067c + i9) + (-1))) && Character.isLowSurrogate(jVar.b(jVar.f3067c + i9))) ? i8 + 2 : i9;
                i3++;
            }
        }
        int i11 = jVar.f3067c;
        jVar.a(i11, i8 + i11);
        int i12 = jVar.f3066b;
        jVar.a(i12 - i5, i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0195h)) {
            return false;
        }
        C0195h c0195h = (C0195h) obj;
        return this.f3063a == c0195h.f3063a && this.f3064b == c0195h.f3064b;
    }

    public final int hashCode() {
        return (this.f3063a * 31) + this.f3064b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f3063a);
        sb.append(", lengthAfterCursor=");
        return A.k.j(sb, this.f3064b, ')');
    }
}
