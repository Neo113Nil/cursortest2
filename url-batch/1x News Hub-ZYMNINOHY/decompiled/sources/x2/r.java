package x2;

import d2.InterfaceC0300c;
import f2.InterfaceC0327d;

/* loaded from: classes.dex */
public final class r implements InterfaceC0300c, InterfaceC0327d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0300c f10798a;

    /* renamed from: b, reason: collision with root package name */
    public final d2.h f10799b;

    public r(InterfaceC0300c interfaceC0300c, d2.h hVar) {
        this.f10798a = interfaceC0300c;
        this.f10799b = hVar;
    }

    @Override // f2.InterfaceC0327d
    public final InterfaceC0327d c() {
        InterfaceC0300c interfaceC0300c = this.f10798a;
        if (interfaceC0300c instanceof InterfaceC0327d) {
            return (InterfaceC0327d) interfaceC0300c;
        }
        return null;
    }

    @Override // d2.InterfaceC0300c
    public final void f(Object obj) {
        this.f10798a.f(obj);
    }

    @Override // d2.InterfaceC0300c
    public final d2.h getContext() {
        return this.f10799b;
    }
}
