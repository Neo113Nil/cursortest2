package M5;

import H5.InterfaceC0163x;
import o5.InterfaceC0569i;

/* loaded from: classes.dex */
public final class e implements InterfaceC0163x {

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0569i f1592f;

    public e(InterfaceC0569i interfaceC0569i) {
        this.f1592f = interfaceC0569i;
    }

    @Override // H5.InterfaceC0163x
    public final InterfaceC0569i e() {
        return this.f1592f;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f1592f + ')';
    }
}
