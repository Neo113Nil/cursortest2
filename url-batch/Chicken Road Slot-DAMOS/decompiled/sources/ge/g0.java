package ge;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g0 extends Exception {

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f4351d;

    public g0(Throwable th, t tVar, CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + tVar + " threw an exception, context = " + coroutineContext, th);
        this.f4351d = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f4351d;
    }
}
