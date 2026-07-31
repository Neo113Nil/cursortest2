package t2;

import kotlin.coroutines.CoroutineContext;
import o2.InterfaceC3316J;

/* renamed from: t2.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3436g implements InterfaceC3316J {

    /* renamed from: b, reason: collision with root package name */
    private final CoroutineContext f46228b;

    public C3436g(CoroutineContext coroutineContext) {
        this.f46228b = coroutineContext;
    }

    @Override // o2.InterfaceC3316J
    public CoroutineContext n() {
        return this.f46228b;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + n() + ')';
    }
}
