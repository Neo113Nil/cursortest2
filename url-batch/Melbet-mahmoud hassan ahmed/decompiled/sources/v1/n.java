package v1;

import r0.s1;

/* loaded from: classes.dex */
public abstract class n extends f {

    /* renamed from: j, reason: collision with root package name */
    public final long f22796j;

    public n(n2.l lVar, n2.p pVar, s1 s1Var, int i7, Object obj, long j7, long j8, long j9) {
        super(lVar, pVar, 1, s1Var, i7, obj, j7, j8);
        o2.a.e(s1Var);
        this.f22796j = j9;
    }

    public long g() {
        long j7 = this.f22796j;
        if (j7 != -1) {
            return 1 + j7;
        }
        return -1L;
    }

    public abstract boolean h();
}
