package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements f, h {

    /* renamed from: a, reason: collision with root package name */
    public final float f7278a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7279b;

    public g(float f9) {
        this.f7278a = f9;
        this.f7279b = f9;
    }

    @Override // q.f, q.h
    public final float a() {
        return this.f7279b;
    }

    @Override // q.f
    public final void b(m2.b bVar, int i7, int[] iArr, m2.k kVar, int[] iArr2) {
        int i8;
        int i9;
        if (iArr.length == 0) {
            return;
        }
        int K = bVar.K(this.f7278a);
        boolean z8 = kVar == m2.k.f6323g;
        b bVar2 = j.f7291a;
        if (z8) {
            i8 = 0;
            i9 = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i10 = iArr[length];
                int min = Math.min(i8, i7 - i10);
                iArr2[length] = min;
                i9 = Math.min(K, (i7 - min) - i10);
                i8 = iArr2[length] + i10 + i9;
            }
        } else {
            int length2 = iArr.length;
            int i11 = 0;
            i8 = 0;
            i9 = 0;
            int i12 = 0;
            while (i11 < length2) {
                int i13 = iArr[i11];
                int min2 = Math.min(i8, i7 - i13);
                iArr2[i12] = min2;
                int min3 = Math.min(K, (i7 - min2) - i13);
                int i14 = iArr2[i12] + i13 + min3;
                i11++;
                i9 = min3;
                i8 = i14;
                i12++;
            }
        }
        if (i8 - i9 < i7) {
            int round = Math.round((1 + (kVar != m2.k.f6322f ? (-1.0f) * (-1) : -1.0f)) * ((i7 - r5) / 2.0f));
            int length3 = iArr2.length;
            for (int i15 = 0; i15 < length3; i15++) {
                iArr2[i15] = iArr2[i15] + round;
            }
        }
    }

    @Override // q.h
    public final void c(int i7, p1.h0 h0Var, int[] iArr, int[] iArr2) {
        b(h0Var, i7, iArr, m2.k.f6322f, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g) || !m2.e.a(this.f7278a, ((g) obj).f7278a)) {
            return false;
        }
        Object obj2 = i.f7289g;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return i.f7289g.hashCode() + a0.m.e(Float.hashCode(this.f7278a) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) m2.e.e(this.f7278a)) + ", " + i.f7289g + ')';
    }
}
