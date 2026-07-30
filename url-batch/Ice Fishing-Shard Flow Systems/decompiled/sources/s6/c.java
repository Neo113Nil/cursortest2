package s6;

import kotlin.coroutines.CoroutineContext;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class c implements InterfaceC0789w {

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f7823d;

    public c(CoroutineContext coroutineContext) {
        this.f7823d = coroutineContext;
    }

    @Override // n6.InterfaceC0789w
    public final CoroutineContext h() {
        return this.f7823d;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f7823d + ')';
    }
}
