package k0;

import java.util.ArrayList;

/* renamed from: k0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193o extends AbstractC0192n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f2809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC0194p f2810b;

    public C0193o(ViewTreeObserverOnPreDrawListenerC0194p viewTreeObserverOnPreDrawListenerC0194p, o.b bVar) {
        this.f2810b = viewTreeObserverOnPreDrawListenerC0194p;
        this.f2809a = bVar;
    }

    @Override // k0.InterfaceC0189k
    public final void b(AbstractC0191m abstractC0191m) {
        ((ArrayList) this.f2809a.getOrDefault(this.f2810b.f2812b, null)).remove(abstractC0191m);
        abstractC0191m.x(this);
    }
}
