package C3;

import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import x3.AbstractC1541a;
import x3.AbstractC1562w;

/* loaded from: classes.dex */
public class s extends AbstractC1541a implements h3.d {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0425c f316d;

    public s(InterfaceC0425c interfaceC0425c, InterfaceC0430h interfaceC0430h) {
        super(interfaceC0430h, true);
        this.f316d = interfaceC0425c;
    }

    @Override // x3.d0
    public final boolean F() {
        return true;
    }

    @Override // h3.d
    public final h3.d getCallerFrame() {
        InterfaceC0425c interfaceC0425c = this.f316d;
        if (interfaceC0425c instanceof h3.d) {
            return (h3.d) interfaceC0425c;
        }
        return null;
    }

    @Override // x3.d0
    public void l(Object obj) {
        a.g(AbstractC1562w.h(obj), AbstractC0347t0.m(this.f316d));
    }

    @Override // x3.d0
    public void m(Object obj) {
        this.f316d.resumeWith(AbstractC1562w.h(obj));
    }
}
