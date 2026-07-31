package kotlinx.coroutines.internal;

import m6.l0;

/* loaded from: classes.dex */
public final class e implements l0 {

    /* renamed from: f, reason: collision with root package name */
    private final y5.g f18330f;

    public e(y5.g gVar) {
        this.f18330f = gVar;
    }

    @Override // m6.l0
    public y5.g c() {
        return this.f18330f;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + c() + ')';
    }
}
