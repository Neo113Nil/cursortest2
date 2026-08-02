package r0;

import T.C0097o;

/* loaded from: classes.dex */
public abstract class m extends AbstractC1395f {

    /* renamed from: j, reason: collision with root package name */
    public final long f15183j;

    public m(Y.h hVar, Y.k kVar, C0097o c0097o, int i4, Object obj, long j4, long j5, long j6) {
        super(hVar, kVar, 1, c0097o, i4, obj, j4, j5);
        c0097o.getClass();
        this.f15183j = j6;
    }

    public long a() {
        long j4 = this.f15183j;
        if (j4 != -1) {
            return j4 + 1;
        }
        return -1L;
    }

    public abstract boolean b();
}
