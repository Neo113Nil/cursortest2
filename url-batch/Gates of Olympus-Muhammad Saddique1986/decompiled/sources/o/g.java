package o;

import R0.D;
import n.AbstractC0695v;

/* loaded from: classes.dex */
public final class g implements D {

    /* renamed from: a, reason: collision with root package name */
    public final long f7395a;

    public g(long j3) {
        this.f7395a = j3;
    }

    @Override // R0.D
    public final long a(O0.i iVar, long j3, O0.k kVar, long j4) {
        int i3 = iVar.f3736a;
        long j5 = this.f7395a;
        return l0.c.c(AbstractC0695v.f(i3 + ((int) (j5 >> 32)), (int) (j4 >> 32), (int) (j3 >> 32), kVar == O0.k.f3741d), AbstractC0695v.f(iVar.f3737b + ((int) (j5 & 4294967295L)), (int) (j4 & 4294967295L), (int) (j3 & 4294967295L), true));
    }
}
