package j$.time.format;

import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class o extends i {
    public static final LocalDate h = LocalDate.of(2000, 1, 1);
    public final j$.time.chrono.b g;

    public o(j$.time.temporal.q qVar, int i, int i2, j$.time.chrono.b bVar, int i3) {
        super(qVar, i, i2, f0.NOT_NEGATIVE, i3);
        this.g = bVar;
    }

    @Override // j$.time.format.i
    public final long a(y yVar, long j) {
        long abs = Math.abs(j);
        j$.time.chrono.b bVar = this.g;
        long e = bVar != null ? j$.time.chrono.m.r(yVar.a).H(bVar).e(this.a) : 0;
        long[] jArr = i.f;
        if (j >= e) {
            long j2 = jArr[this.b];
            if (j < e + j2) {
                return abs % j2;
            }
        }
        return abs % jArr[this.c];
    }

    @Override // j$.time.format.i
    public final boolean b(v vVar) {
        if (vVar.c) {
            return super.b(vVar);
        }
        return false;
    }

    @Override // j$.time.format.i
    public final int c(final v vVar, long j, final int i, final int i2) {
        final o oVar;
        v vVar2;
        final long j2;
        int i3;
        long j3;
        j$.time.chrono.b bVar = this.g;
        if (bVar != null) {
            j$.time.chrono.m mVar = vVar.c().c;
            if (mVar == null && (mVar = vVar.a.e) == null) {
                mVar = j$.time.chrono.t.c;
            }
            i3 = mVar.H(bVar).e(this.a);
            oVar = this;
            j2 = j;
            Consumer consumer = new Consumer() { // from class: j$.time.format.n
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    o.this.c(vVar, j2, i, i2);
                }
            };
            vVar2 = vVar;
            if (vVar2.e == null) {
                vVar2.e = new ArrayList();
            }
            vVar2.e.add(consumer);
        } else {
            oVar = this;
            vVar2 = vVar;
            j2 = j;
            i3 = 0;
        }
        int i4 = i2 - i;
        int i5 = oVar.b;
        if (i4 != i5 || j2 < 0) {
            j3 = j2;
        } else {
            long j4 = i.f[i5];
            long j5 = i3;
            long j6 = j5 - (j5 % j4);
            long j7 = i3 > 0 ? j6 + j2 : j6 - j2;
            j3 = j7 < j5 ? j4 + j7 : j7;
        }
        return vVar2.f(oVar.a, j3, i, i2);
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.e == -1) {
            return this;
        }
        return new o(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i) {
        return new o(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.i
    public final String toString() {
        Object obj = this.g;
        return "ReducedValue(" + this.a + "," + this.b + "," + this.c + "," + (obj != null ? obj : 0) + ")";
    }
}
