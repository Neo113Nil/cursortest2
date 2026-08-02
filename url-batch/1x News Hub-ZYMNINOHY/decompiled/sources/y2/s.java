package y2;

import d2.InterfaceC0300c;
import f2.InterfaceC0327d;
import t2.AbstractC1191a;
import t2.AbstractC1212w;

/* loaded from: classes.dex */
public class s extends AbstractC1191a implements InterfaceC0327d {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0300c f10864d;

    public s(InterfaceC0300c interfaceC0300c, d2.h hVar) {
        super(hVar, true);
        this.f10864d = interfaceC0300c;
    }

    @Override // t2.e0
    public final boolean I() {
        return true;
    }

    @Override // f2.InterfaceC0327d
    public final InterfaceC0327d c() {
        InterfaceC0300c interfaceC0300c = this.f10864d;
        if (interfaceC0300c instanceof InterfaceC0327d) {
            return (InterfaceC0327d) interfaceC0300c;
        }
        return null;
    }

    @Override // t2.e0
    public void o(Object obj) {
        a.g(C2.b.x(this.f10864d), AbstractC1212w.i(obj));
    }

    @Override // t2.e0
    public void p(Object obj) {
        this.f10864d.f(AbstractC1212w.i(obj));
    }
}
