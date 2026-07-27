package a3;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class y implements C2.a, E2.d {

    /* renamed from: d, reason: collision with root package name */
    public final C2.a f4995d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f4996e;

    public y(C2.a aVar, CoroutineContext coroutineContext) {
        this.f4995d = aVar;
        this.f4996e = coroutineContext;
    }

    @Override // E2.d
    public final E2.d e() {
        C2.a aVar = this.f4995d;
        if (aVar instanceof E2.d) {
            return (E2.d) aVar;
        }
        return null;
    }

    @Override // C2.a
    public final CoroutineContext p() {
        return this.f4996e;
    }

    @Override // C2.a
    public final void u(Object obj) {
        this.f4995d.u(obj);
    }
}
