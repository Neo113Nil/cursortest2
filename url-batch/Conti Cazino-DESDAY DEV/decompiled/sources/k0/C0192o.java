package k0;

import java.util.ArrayList;

/* renamed from: k0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192o extends AbstractC0191n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f2825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC0193p f2826b;

    public C0192o(ViewTreeObserverOnPreDrawListenerC0193p viewTreeObserverOnPreDrawListenerC0193p, o.b bVar) {
        this.f2826b = viewTreeObserverOnPreDrawListenerC0193p;
        this.f2825a = bVar;
    }

    @Override // k0.InterfaceC0188k
    public final void b(AbstractC0190m abstractC0190m) {
        ((ArrayList) this.f2825a.getOrDefault(this.f2826b.f2828b, null)).remove(abstractC0190m);
        abstractC0190m.x(this);
    }
}
