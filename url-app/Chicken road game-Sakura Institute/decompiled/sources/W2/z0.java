package W2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class z0 extends AbstractC0298u {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f4309i = 0;

    static {
        new z0();
    }

    @Override // W2.AbstractC0298u
    public final void t(CoroutineContext coroutineContext, Runnable runnable) {
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // W2.AbstractC0298u
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
