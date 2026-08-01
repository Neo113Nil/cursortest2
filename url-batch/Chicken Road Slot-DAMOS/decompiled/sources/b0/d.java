package b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements c, f {

    /* renamed from: a, reason: collision with root package name */
    public final float f812a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.r f813b;

    /* renamed from: c, reason: collision with root package name */
    public final float f814c;

    public d(float f3, a2.r rVar) {
        this.f812a = f3;
        this.f813b = rVar;
        this.f814c = f3;
    }

    @Override // b0.c, b0.f
    public final float a() {
        return this.f814c;
    }

    @Override // b0.c
    public final void b(x2.c cVar, int i3, int[] iArr, x2.l lVar, int[] iArr2) {
        int i10;
        if (iArr.length == 0) {
            return;
        }
        int y3 = cVar.y(this.f812a);
        boolean z10 = lVar == x2.l.f10331e;
        if (z10) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < length) {
                int max = Math.max(0, i3 - iArr[i11]);
                iArr2[i13] = max;
                i12 = Math.min(y3, max);
                i3 = iArr2[i13] - i12;
                i11++;
                i13++;
            }
            i10 = i3 + i12;
        } else {
            int length2 = iArr.length;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i14 < length2) {
                int i18 = iArr[i14];
                int min = Math.min(i15, i3 - i18);
                iArr2[i17] = min;
                int min2 = Math.min(y3, (i3 - min) - i18);
                int i19 = iArr2[i17] + i18 + min2;
                i14++;
                i16 = min2;
                i15 = i19;
                i17++;
            }
            i10 = i3 - (i15 - i16);
        }
        if (i10 > 0) {
            int round = Math.round((1 + (lVar != x2.l.f10330d ? (-1.0f) * (-1) : -1.0f)) * (i10 / 2.0f));
            if (z10) {
                round -= i10;
            }
            if (round != 0) {
                int length3 = iArr2.length;
                for (int i20 = 0; i20 < length3; i20++) {
                    iArr2[i20] = iArr2[i20] + round;
                }
            }
        }
    }

    @Override // b0.f
    public final void c(int i3, a2.i0 i0Var, int[] iArr, int[] iArr2) {
        b(i0Var, i3, iArr, x2.l.f10330d, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return x2.f.b(this.f812a, dVar.f812a) && this.f813b.equals(dVar.f813b);
    }

    public final int hashCode() {
        return this.f813b.hashCode() + n0.l.d(Float.hashCode(this.f812a) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) x2.f.c(this.f812a)) + ", " + this.f813b + ')';
    }
}
