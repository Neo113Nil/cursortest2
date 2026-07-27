package l;

import G.C0192d;
import G.C0205j0;
import G.X0;

/* renamed from: l.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788n implements X0 {

    /* renamed from: d, reason: collision with root package name */
    public final v0 f7812d;

    /* renamed from: e, reason: collision with root package name */
    public final C0205j0 f7813e;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC0792s f7814i;

    /* renamed from: j, reason: collision with root package name */
    public long f7815j;

    /* renamed from: k, reason: collision with root package name */
    public long f7816k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7817l;

    public /* synthetic */ C0788n(v0 v0Var, Object obj, AbstractC0792s abstractC0792s, int i2) {
        this(v0Var, obj, (i2 & 4) != 0 ? null : abstractC0792s, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // G.X0
    public final Object getValue() {
        return this.f7813e.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f7813e.getValue() + ", velocity=" + this.f7812d.f7854b.invoke(this.f7814i) + ", isRunning=" + this.f7817l + ", lastFrameTimeNanos=" + this.f7815j + ", finishedTimeNanos=" + this.f7816k + ')';
    }

    public C0788n(v0 v0Var, Object obj, AbstractC0792s abstractC0792s, long j4, long j5, boolean z4) {
        AbstractC0792s abstractC0792s2;
        this.f7812d = v0Var;
        this.f7813e = C0192d.K(obj, G.W.f2779l);
        if (abstractC0792s != null) {
            abstractC0792s2 = AbstractC0779e.f(abstractC0792s);
        } else {
            abstractC0792s2 = (AbstractC0792s) v0Var.f7853a.invoke(obj);
            abstractC0792s2.d();
        }
        this.f7814i = abstractC0792s2;
        this.f7815j = j4;
        this.f7816k = j5;
        this.f7817l = z4;
    }
}
