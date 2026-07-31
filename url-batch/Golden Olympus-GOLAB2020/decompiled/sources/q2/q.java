package q2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import o2.AbstractC3315I;
import q2.u;

/* loaded from: classes3.dex */
final class q extends e implements r {
    public q(CoroutineContext coroutineContext, d dVar) {
        super(coroutineContext, dVar, true, true);
    }

    @Override // o2.AbstractC3317a
    protected void P0(Throwable th, boolean z4) {
        if (T0().j(th) || z4) {
            return;
        }
        AbstractC3315I.a(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o2.AbstractC3317a
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public void Q0(Unit unit) {
        u.a.a(T0(), null, 1, null);
    }

    @Override // o2.AbstractC3317a, o2.D0, o2.InterfaceC3359v0
    public boolean isActive() {
        return super.isActive();
    }

    @Override // q2.r
    public /* bridge */ /* synthetic */ u m() {
        return S0();
    }
}
