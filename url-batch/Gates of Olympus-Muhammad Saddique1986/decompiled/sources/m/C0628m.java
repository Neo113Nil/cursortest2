package m;

import I.C0143d;
import I.C0156j0;
import I.W0;

/* renamed from: m.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628m implements W0 {

    /* renamed from: d, reason: collision with root package name */
    public final u0 f6848d;

    /* renamed from: e, reason: collision with root package name */
    public final C0156j0 f6849e;

    /* renamed from: f, reason: collision with root package name */
    public r f6850f;

    /* renamed from: g, reason: collision with root package name */
    public long f6851g;

    /* renamed from: h, reason: collision with root package name */
    public long f6852h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6853i;

    public /* synthetic */ C0628m(u0 u0Var, Object obj, r rVar, int i3) {
        this(u0Var, obj, (i3 & 4) != 0 ? null : rVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // I.W0
    public final Object getValue() {
        return this.f6849e.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f6849e.getValue() + ", velocity=" + this.f6848d.f6890b.n(this.f6850f) + ", isRunning=" + this.f6853i + ", lastFrameTimeNanos=" + this.f6851g + ", finishedTimeNanos=" + this.f6852h + ')';
    }

    public C0628m(u0 u0Var, Object obj, r rVar, long j3, long j4, boolean z3) {
        r rVar2;
        this.f6848d = u0Var;
        this.f6849e = C0143d.K(obj, I.W.f2783i);
        if (rVar != null) {
            rVar2 = AbstractC0620e.f(rVar);
        } else {
            rVar2 = (r) u0Var.f6889a.n(obj);
            rVar2.d();
        }
        this.f6850f = rVar2;
        this.f6851g = j3;
        this.f6852h = j4;
        this.f6853i = z3;
    }
}
