package B3;

import f3.InterfaceC0425c;
import f3.InterfaceC0430h;

/* loaded from: classes.dex */
public final class r implements InterfaceC0425c, h3.d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0425c f250a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0430h f251b;

    public r(InterfaceC0425c interfaceC0425c, InterfaceC0430h interfaceC0430h) {
        this.f250a = interfaceC0425c;
        this.f251b = interfaceC0430h;
    }

    @Override // h3.d
    public final h3.d getCallerFrame() {
        InterfaceC0425c interfaceC0425c = this.f250a;
        if (interfaceC0425c instanceof h3.d) {
            return (h3.d) interfaceC0425c;
        }
        return null;
    }

    @Override // f3.InterfaceC0425c
    public final InterfaceC0430h getContext() {
        return this.f251b;
    }

    @Override // f3.InterfaceC0425c
    public final void resumeWith(Object obj) {
        this.f250a.resumeWith(obj);
    }
}
