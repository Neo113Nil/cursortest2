package C3;

import f3.InterfaceC0430h;
import x3.InterfaceC1560u;

/* loaded from: classes.dex */
public final class e implements InterfaceC1560u {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0430h f289a;

    public e(InterfaceC0430h interfaceC0430h) {
        this.f289a = interfaceC0430h;
    }

    @Override // x3.InterfaceC1560u
    public final InterfaceC0430h g() {
        return this.f289a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f289a + ')';
    }
}
