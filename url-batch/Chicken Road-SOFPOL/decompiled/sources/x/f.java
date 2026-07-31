package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final float f8213a;

    /* renamed from: b, reason: collision with root package name */
    public final g2.v f8214b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8215c;

    public f(float f6, g2.v vVar) {
        this.f8213a = f6;
        this.f8214b = vVar;
        this.f8215c = f6;
    }

    @Override // x.d, x.h
    public final float a() {
        return this.f8215c;
    }

    @Override // x.h
    public final void b(u1.g0 g0Var, int i, int[] iArr, int[] iArr2) {
        c(g0Var, i, iArr, r2.l.f6529d, iArr2);
    }

    @Override // x.d
    public final void c(u1.g0 g0Var, int i, int[] iArr, r2.l lVar, int[] iArr2) {
        int i8;
        int i9;
        if (iArr.length == 0) {
            return;
        }
        int H = g0Var.H(this.f8213a);
        boolean z3 = lVar == r2.l.f6530e;
        c cVar = i.f8221a;
        if (z3) {
            i8 = 0;
            i9 = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i10 = iArr[length];
                int min = Math.min(i8, i - i10);
                iArr2[length] = min;
                i9 = Math.min(H, (i - min) - i10);
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
                int min2 = Math.min(i8, i - i13);
                iArr2[i12] = min2;
                int min3 = Math.min(H, (i - min2) - i13);
                int i14 = iArr2[i12] + i13 + min3;
                i11++;
                i9 = min3;
                i8 = i14;
                i12++;
            }
        }
        int i15 = i8 - i9;
        if (i15 < i) {
            int intValue = ((Number) this.f8214b.g(Integer.valueOf(i - i15), lVar)).intValue();
            int length3 = iArr2.length;
            for (int i16 = 0; i16 < length3; i16++) {
                iArr2[i16] = iArr2[i16] + intValue;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return r2.f.a(this.f8213a, fVar.f8213a) && this.f8214b.equals(fVar.f8214b);
    }

    public final int hashCode() {
        return this.f8214b.hashCode() + a0.q.d(Float.hashCode(this.f8213a) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) r2.f.b(this.f8213a)) + ", " + this.f8214b + ')';
    }
}
