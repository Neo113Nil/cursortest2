package d2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q1 extends androidx.lifecycle.u0 {

    /* renamed from: b, reason: collision with root package name */
    public final s.w f3511b;

    public q1() {
        s.w wVar = s.l.f8343a;
        this.f3511b = new s.w();
    }

    @Override // androidx.lifecycle.u0
    public final void d() {
        s.w wVar = this.f3511b;
        int[] iArr = wVar.f8337b;
        Object[] objArr = wVar.f8338c;
        long[] jArr = wVar.f8336a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8;
                int i11 = 8 - ((~(i3 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((255 & j) < 128) {
                        int i13 = (i3 << 3) + i12;
                        int i14 = iArr[i13];
                        s.d0 d0Var = (s.d0) objArr[i13];
                        Object[] objArr2 = d0Var.f8284a;
                        int i15 = d0Var.f8285b;
                        int i16 = 0;
                        while (i16 < i15) {
                            p1 p1Var = (p1) objArr2[i16];
                            int i17 = i10;
                            n0.f fVar = p1Var.f3506d;
                            if (fVar != null) {
                                fVar.cancel();
                            }
                            p1Var.f3506d = null;
                            y0.c cVar = (y0.c) p1Var.f3503a.f3701e;
                            cVar.f10572e = true;
                            cVar.f10571d = false;
                            cVar.a();
                            i16++;
                            i10 = i17;
                        }
                    }
                    int i18 = i10;
                    j >>= i18;
                    i12++;
                    i10 = i18;
                }
                if (i11 != i10) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }
}
