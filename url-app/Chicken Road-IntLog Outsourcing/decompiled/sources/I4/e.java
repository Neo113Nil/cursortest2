package I4;

import D4.InterfaceC0022w;
import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public final class e implements InterfaceC0022w {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1223i f1290a;

    public e(InterfaceC1223i interfaceC1223i) {
        this.f1290a = interfaceC1223i;
    }

    @Override // D4.InterfaceC0022w
    public final InterfaceC1223i g() {
        return this.f1290a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f1290a + ')';
    }
}
