package l;

import g0.m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l implements m2 {

    /* renamed from: f, reason: collision with root package name */
    public final w1 f5562f;

    /* renamed from: g, reason: collision with root package name */
    public final g0.g1 f5563g;

    /* renamed from: h, reason: collision with root package name */
    public q f5564h;

    /* renamed from: i, reason: collision with root package name */
    public long f5565i;

    /* renamed from: j, reason: collision with root package name */
    public long f5566j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5567k;

    public /* synthetic */ l(w1 w1Var, Object obj, q qVar, int i7) {
        this(w1Var, obj, (i7 & 4) != 0 ? null : qVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // g0.m2
    public final Object getValue() {
        return this.f5563g.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f5563g.getValue() + ", velocity=" + this.f5562f.f5703b.f(this.f5564h) + ", isRunning=" + this.f5567k + ", lastFrameTimeNanos=" + this.f5565i + ", finishedTimeNanos=" + this.f5566j + ')';
    }

    public l(w1 w1Var, Object obj, q qVar, long j8, long j9, boolean z8) {
        q qVar2;
        this.f5562f = w1Var;
        this.f5563g = g0.d.J(obj, g0.t0.f3903k);
        if (qVar != null) {
            qVar2 = e.g(qVar);
        } else {
            qVar2 = (q) w1Var.f5702a.f(obj);
            qVar2.d();
        }
        this.f5564h = qVar2;
        this.f5565i = j8;
        this.f5566j = j9;
        this.f5567k = z8;
    }
}
