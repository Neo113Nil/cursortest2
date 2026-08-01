package v;

import kotlin.jvm.functions.Function1;
import n0.j1;
import n0.m2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements m2 {

    /* renamed from: d, reason: collision with root package name */
    public final c6.s f9797d;

    /* renamed from: e, reason: collision with root package name */
    public final j1 f9798e;

    /* renamed from: i, reason: collision with root package name */
    public l f9799i;

    /* renamed from: r, reason: collision with root package name */
    public long f9800r;

    /* renamed from: s, reason: collision with root package name */
    public long f9801s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9802t;

    public g(c6.s sVar, Object obj, l lVar, long j, long j3, boolean z10) {
        l lVar2;
        this.f9797d = sVar;
        this.f9798e = n0.h.r(obj);
        if (lVar != null) {
            lVar2 = c.c(lVar);
        } else {
            lVar2 = (l) ((Function1) sVar.f1868d).invoke(obj);
            lVar2.d();
        }
        this.f9799i = lVar2;
        this.f9800r = j;
        this.f9801s = j3;
        this.f9802t = z10;
    }

    @Override // n0.m2
    public final Object getValue() {
        return this.f9798e.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f9798e.getValue() + ", velocity=" + ((Function1) this.f9797d.f1869e).invoke(this.f9799i) + ", isRunning=" + this.f9802t + ", lastFrameTimeNanos=" + this.f9800r + ", finishedTimeNanos=" + this.f9801s + ')';
    }

    public /* synthetic */ g(Float f3, l lVar, int i3) {
        this(c.f9754k, f3, (i3 & 4) != 0 ? null : lVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
