package o2;

import kotlin.Unit;

/* loaded from: classes3.dex */
final class O0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3313G f42020b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3343n f42021c;

    public O0(AbstractC3313G abstractC3313G, InterfaceC3343n interfaceC3343n) {
        this.f42020b = abstractC3313G;
        this.f42021c = interfaceC3343n;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f42021c.k(this.f42020b, Unit.f41027a);
    }
}
