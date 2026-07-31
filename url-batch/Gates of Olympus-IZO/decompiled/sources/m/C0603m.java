package m;

import I.C0089d;
import I.C0102j0;
import I.X0;

/* renamed from: m.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603m implements X0 {

    /* renamed from: d, reason: collision with root package name */
    public final y0 f5802d;

    /* renamed from: e, reason: collision with root package name */
    public final C0102j0 f5803e;

    /* renamed from: f, reason: collision with root package name */
    public r f5804f;

    /* renamed from: g, reason: collision with root package name */
    public long f5805g;

    /* renamed from: h, reason: collision with root package name */
    public long f5806h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5807i;

    public /* synthetic */ C0603m(y0 y0Var, Object obj, r rVar, int i3) {
        this(y0Var, obj, (i3 & 4) != 0 ? null : rVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // I.X0
    public final Object getValue() {
        return this.f5803e.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f5803e.getValue() + ", velocity=" + this.f5802d.f5884b.j(this.f5804f) + ", isRunning=" + this.f5807i + ", lastFrameTimeNanos=" + this.f5805g + ", finishedTimeNanos=" + this.f5806h + ')';
    }

    public C0603m(y0 y0Var, Object obj, r rVar, long j3, long j4, boolean z3) {
        r rVar2;
        this.f5802d = y0Var;
        this.f5803e = C0089d.J(obj, I.X.f2228i);
        if (rVar != null) {
            rVar2 = AbstractC0595e.e(rVar);
        } else {
            rVar2 = (r) y0Var.f5883a.j(obj);
            rVar2.d();
        }
        this.f5804f = rVar2;
        this.f5805g = j3;
        this.f5806h = j4;
        this.f5807i = z3;
    }
}
