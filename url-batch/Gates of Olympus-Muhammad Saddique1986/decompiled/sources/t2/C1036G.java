package t2;

import q2.C0821h;
import u2.AbstractC1150b;
import u2.AbstractC1152d;

/* renamed from: t2.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1036G extends AbstractC1152d {

    /* renamed from: a, reason: collision with root package name */
    public long f8979a;

    /* renamed from: b, reason: collision with root package name */
    public C0821h f8980b;

    @Override // u2.AbstractC1152d
    public final boolean a(AbstractC1150b abstractC1150b) {
        C1034E c1034e = (C1034E) abstractC1150b;
        if (this.f8979a >= 0) {
            return false;
        }
        long j3 = c1034e.f8972l;
        if (j3 < c1034e.f8973m) {
            c1034e.f8973m = j3;
        }
        this.f8979a = j3;
        return true;
    }

    @Override // u2.AbstractC1152d
    public final V1.d[] b(AbstractC1150b abstractC1150b) {
        long j3 = this.f8979a;
        this.f8979a = -1L;
        this.f8980b = null;
        return ((C1034E) abstractC1150b).w(j3);
    }
}
