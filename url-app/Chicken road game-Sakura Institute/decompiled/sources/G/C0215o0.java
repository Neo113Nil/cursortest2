package G;

import W2.InterfaceC0302y;
import kotlin.coroutines.CoroutineContext;

/* renamed from: G.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215o0 implements InterfaceC0191c0, InterfaceC0302y {

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f2845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f2846e;

    public C0215o0(InterfaceC0191c0 interfaceC0191c0, CoroutineContext coroutineContext) {
        this.f2845d = coroutineContext;
        this.f2846e = interfaceC0191c0;
    }

    @Override // G.X0
    public final Object getValue() {
        return this.f2846e.getValue();
    }

    @Override // W2.InterfaceC0302y
    public final CoroutineContext q() {
        return this.f2845d;
    }

    @Override // G.InterfaceC0191c0
    public final void setValue(Object obj) {
        this.f2846e.setValue(obj);
    }
}
