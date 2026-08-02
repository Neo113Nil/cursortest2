package S0;

/* loaded from: classes.dex */
public final class q implements y0.y {

    /* renamed from: a, reason: collision with root package name */
    public final long f2491a;

    /* renamed from: b, reason: collision with root package name */
    public final r[] f2492b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2493c;

    public q(long j4, r[] rVarArr, int i4) {
        this.f2491a = j4;
        this.f2492b = rVarArr;
        this.f2493c = i4;
    }

    @Override // y0.y
    public final boolean c() {
        return true;
    }

    @Override // y0.y
    public final y0.x e(long j4) {
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        int b4;
        long j10 = j4;
        r[] rVarArr = this.f2492b;
        int length = rVarArr.length;
        y0.z zVar = y0.z.f16224c;
        if (length == 0) {
            return new y0.x(zVar, zVar);
        }
        int i4 = this.f2493c;
        int i5 = -1;
        if (i4 != -1) {
            A a3 = rVarArr[i4].f2495b;
            int a4 = a3.a(j10);
            if (a4 == -1) {
                a4 = a3.b(j10);
            }
            long[] jArr = a3.f2384c;
            long[] jArr2 = a3.f2387f;
            if (a4 == -1) {
                return new y0.x(zVar, zVar);
            }
            long j11 = jArr2[a4];
            j5 = jArr[a4];
            if (j11 >= j10 || a4 >= a3.f2383b - 1 || (b4 = a3.b(j10)) == -1 || b4 == a4) {
                j9 = -1;
                j7 = -9223372036854775807L;
            } else {
                j7 = jArr2[b4];
                j9 = jArr[b4];
            }
            j6 = j9;
            j10 = j11;
        } else {
            j5 = Long.MAX_VALUE;
            j6 = -1;
            j7 = -9223372036854775807L;
        }
        int i6 = 0;
        long j12 = j5;
        while (i6 < rVarArr.length) {
            if (i6 != i4) {
                A a5 = rVarArr[i6].f2495b;
                long[] jArr3 = a5.f2384c;
                int a6 = a5.a(j10);
                if (a6 == i5) {
                    a6 = a5.b(j10);
                }
                if (a6 == i5) {
                    j8 = j7;
                } else {
                    j8 = j7;
                    j12 = Math.min(jArr3[a6], j12);
                }
                if (j8 != -9223372036854775807L) {
                    long j13 = j8;
                    int a7 = a5.a(j13);
                    if (a7 == -1) {
                        a7 = a5.b(j13);
                    }
                    if (a7 == -1) {
                        j8 = j13;
                    } else {
                        j8 = j13;
                        j6 = Math.min(jArr3[a7], j6);
                    }
                }
            } else {
                j8 = j7;
            }
            i6++;
            j7 = j8;
            i5 = -1;
        }
        long j14 = j7;
        y0.z zVar2 = new y0.z(j10, j12);
        return j14 == -9223372036854775807L ? new y0.x(zVar2, zVar2) : new y0.x(zVar2, new y0.z(j14, j6));
    }

    @Override // y0.y
    public final long g() {
        return this.f2491a;
    }
}
