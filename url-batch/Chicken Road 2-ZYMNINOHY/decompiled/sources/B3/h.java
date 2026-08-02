package B3;

import f3.InterfaceC0428f;
import f3.InterfaceC0429g;
import f3.InterfaceC0430h;

/* loaded from: classes.dex */
public final class h implements InterfaceC0430h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0430h f237b;

    public h(InterfaceC0430h interfaceC0430h, Throwable th) {
        this.f236a = th;
        this.f237b = interfaceC0430h;
    }

    @Override // f3.InterfaceC0430h
    public final Object e(Object obj, o3.p pVar) {
        return this.f237b.e(obj, pVar);
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0430h f(InterfaceC0430h interfaceC0430h) {
        return this.f237b.f(interfaceC0430h);
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0430h k(InterfaceC0429g interfaceC0429g) {
        return this.f237b.k(interfaceC0429g);
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0428f n(InterfaceC0429g interfaceC0429g) {
        return this.f237b.n(interfaceC0429g);
    }
}
