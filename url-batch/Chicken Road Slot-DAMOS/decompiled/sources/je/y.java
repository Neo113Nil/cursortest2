package je;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y implements ge.m0 {

    /* renamed from: d, reason: collision with root package name */
    public final a0 f5242d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5243e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5244i;

    /* renamed from: r, reason: collision with root package name */
    public final ge.h f5245r;

    public y(a0 a0Var, long j, Object obj, ge.h hVar) {
        this.f5242d = a0Var;
        this.f5243e = j;
        this.f5244i = obj;
        this.f5245r = hVar;
    }

    @Override // ge.m0
    public final void a() {
        a0 a0Var = this.f5242d;
        synchronized (a0Var) {
            if (this.f5243e >= a0Var.o()) {
                Object[] objArr = a0Var.f5133v;
                objArr.getClass();
                long j = this.f5243e;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    b0.d(objArr, j, b0.f5141a);
                    a0Var.j();
                }
            }
        }
    }
}
