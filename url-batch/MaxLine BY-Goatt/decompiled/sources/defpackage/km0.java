package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class km0 extends uq0 {
    public final long n;
    public final boolean o;
    public long p;

    public km0(pn2 pn2Var, long j, boolean z) {
        super(pn2Var);
        this.n = j;
        this.o = z;
    }

    @Override // defpackage.uq0, defpackage.pn2
    public final long h(long j, fq fqVar) {
        fqVar.getClass();
        long j2 = this.p;
        long j3 = this.n;
        if (j2 > j3) {
            j = 0;
        } else if (this.o) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long h = this.m.h(j, fqVar);
        if (h != -1) {
            this.p += h;
        }
        long j5 = this.p;
        if ((j5 >= j3 || h != -1) && j5 <= j3) {
            return h;
        }
        if (h > 0 && j5 > j3) {
            long j6 = fqVar.n - (j5 - j3);
            fq fqVar2 = new fq();
            fqVar2.J(fqVar);
            fqVar.u(j6, fqVar2);
            fqVar2.skip(fqVar2.n);
        }
        throw new IOException("expected " + j3 + " bytes but got " + this.p);
    }
}
