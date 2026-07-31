package r;

import m0.t2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k implements t2 {

    /* renamed from: d, reason: collision with root package name */
    public final r1 f6330d;

    /* renamed from: e, reason: collision with root package name */
    public final m0.h1 f6331e;

    /* renamed from: f, reason: collision with root package name */
    public p f6332f;

    /* renamed from: g, reason: collision with root package name */
    public long f6333g;

    /* renamed from: h, reason: collision with root package name */
    public long f6334h;
    public boolean i;

    public /* synthetic */ k(r1 r1Var, Object obj, p pVar, int i) {
        this(r1Var, obj, (i & 4) != 0 ? null : pVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // m0.t2
    public final Object getValue() {
        return this.f6331e.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f6331e.getValue() + ", velocity=" + this.f6330d.f6414b.i(this.f6332f) + ", isRunning=" + this.i + ", lastFrameTimeNanos=" + this.f6333g + ", finishedTimeNanos=" + this.f6334h + ')';
    }

    public k(r1 r1Var, Object obj, p pVar, long j7, long j8, boolean z3) {
        p pVar2;
        this.f6330d = r1Var;
        this.f6331e = m0.b.q(obj);
        if (pVar != null) {
            pVar2 = d.f(pVar);
        } else {
            pVar2 = (p) r1Var.f6413a.i(obj);
            pVar2.d();
        }
        this.f6332f = pVar2;
        this.f6333g = j7;
        this.f6334h = j8;
        this.i = z3;
    }
}
