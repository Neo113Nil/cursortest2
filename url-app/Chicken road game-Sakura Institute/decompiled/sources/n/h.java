package n;

import P0.E;
import m3.s;

/* loaded from: classes.dex */
public final class h implements E {

    /* renamed from: a, reason: collision with root package name */
    public final long f8516a;

    public h(long j4) {
        this.f8516a = j4;
    }

    @Override // P0.E
    public final long a(M0.i iVar, long j4, M0.k kVar, long j5) {
        int i2 = iVar.f3550a;
        long j6 = this.f8516a;
        return j0.c.g(s.e(i2 + ((int) (j6 >> 32)), (int) (j5 >> 32), (int) (j4 >> 32), kVar == M0.k.f3555d), s.e(iVar.f3551b + ((int) (j6 & 4294967295L)), (int) (j5 & 4294967295L), (int) (j4 & 4294967295L), true));
    }
}
