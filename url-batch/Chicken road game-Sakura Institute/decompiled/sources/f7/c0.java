package f7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 implements c7.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final e0 f3446f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3447g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3448h;

    /* renamed from: i, reason: collision with root package name */
    public final c7.h f3449i;

    public c0(e0 e0Var, long j8, Object obj, c7.h hVar) {
        this.f3446f = e0Var;
        this.f3447g = j8;
        this.f3448h = obj;
        this.f3449i = hVar;
    }

    @Override // c7.i0
    public final void a() {
        e0 e0Var = this.f3446f;
        synchronized (e0Var) {
            if (this.f3447g < e0Var.q()) {
                return;
            }
            Object[] objArr = e0Var.f3464m;
            r6.k.c(objArr);
            long j8 = this.f3447g;
            if (objArr[((int) j8) & (objArr.length - 1)] != this) {
                return;
            }
            f0.e(objArr, j8, f0.f3469a);
            e0Var.l();
        }
    }
}
