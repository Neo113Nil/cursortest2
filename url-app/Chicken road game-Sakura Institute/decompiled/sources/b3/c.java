package b3;

import W2.InterfaceC0302y;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class c implements InterfaceC0302y {

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f5651d;

    public c(CoroutineContext coroutineContext) {
        this.f5651d = coroutineContext;
    }

    @Override // W2.InterfaceC0302y
    public final CoroutineContext q() {
        return this.f5651d;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f5651d + ')';
    }
}
