package v1;

import r0.s1;

/* loaded from: classes.dex */
public abstract class a extends n {

    /* renamed from: k, reason: collision with root package name */
    public final long f22719k;

    /* renamed from: l, reason: collision with root package name */
    public final long f22720l;

    /* renamed from: m, reason: collision with root package name */
    private c f22721m;

    /* renamed from: n, reason: collision with root package name */
    private int[] f22722n;

    public a(n2.l lVar, n2.p pVar, s1 s1Var, int i7, Object obj, long j7, long j8, long j9, long j10, long j11) {
        super(lVar, pVar, s1Var, i7, obj, j7, j8, j11);
        this.f22719k = j9;
        this.f22720l = j10;
    }

    public final int i(int i7) {
        return ((int[]) o2.a.h(this.f22722n))[i7];
    }

    protected final c j() {
        return (c) o2.a.h(this.f22721m);
    }

    public void k(c cVar) {
        this.f22721m = cVar;
        this.f22722n = cVar.a();
    }
}
