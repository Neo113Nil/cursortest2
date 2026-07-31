package M5;

import H5.AbstractC0141a;
import H5.AbstractC0165z;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public class s extends AbstractC0141a implements q5.d {

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0564d f1620i;

    public s(InterfaceC0569i interfaceC0569i, InterfaceC0564d interfaceC0564d) {
        super(interfaceC0569i, true);
        this.f1620i = interfaceC0564d;
    }

    @Override // H5.g0
    public final boolean H() {
        return true;
    }

    @Override // q5.d
    public final q5.d getCallerFrame() {
        InterfaceC0564d interfaceC0564d = this.f1620i;
        if (interfaceC0564d instanceof q5.d) {
            return (q5.d) interfaceC0564d;
        }
        return null;
    }

    @Override // H5.g0
    public void k(Object obj) {
        a.h(AbstractC0165z.m(obj), AbstractC0676f.m(this.f1620i));
    }

    @Override // H5.g0
    public void l(Object obj) {
        this.f1620i.resumeWith(AbstractC0165z.m(obj));
    }
}
