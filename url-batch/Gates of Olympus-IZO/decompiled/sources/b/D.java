package b;

import androidx.lifecycle.C0238x;
import androidx.lifecycle.EnumC0229n;
import androidx.lifecycle.InterfaceC0234t;
import androidx.lifecycle.InterfaceC0236v;

/* loaded from: classes.dex */
public final class D implements InterfaceC0234t, InterfaceC0243c {

    /* renamed from: d, reason: collision with root package name */
    public final C0238x f4126d;

    /* renamed from: e, reason: collision with root package name */
    public final w f4127e;

    /* renamed from: f, reason: collision with root package name */
    public E f4128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F f4129g;

    public D(F f3, C0238x c0238x, w wVar) {
        Z1.i.f(wVar, "onBackPressedCallback");
        this.f4129g = f3;
        this.f4126d = c0238x;
        this.f4127e = wVar;
        c0238x.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0234t
    public final void b(InterfaceC0236v interfaceC0236v, EnumC0229n enumC0229n) {
        if (enumC0229n != EnumC0229n.ON_START) {
            if (enumC0229n != EnumC0229n.ON_STOP) {
                if (enumC0229n == EnumC0229n.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                E e3 = this.f4128f;
                if (e3 != null) {
                    e3.cancel();
                    return;
                }
                return;
            }
        }
        F f3 = this.f4129g;
        f3.getClass();
        w wVar = this.f4127e;
        Z1.i.f(wVar, "onBackPressedCallback");
        f3.f4133b.addLast(wVar);
        E e4 = new E(f3, wVar);
        wVar.f4201b.add(e4);
        f3.e();
        wVar.f4202c = new Z.d(0, f3, F.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 3);
        this.f4128f = e4;
    }

    @Override // b.InterfaceC0243c
    public final void cancel() {
        this.f4126d.f(this);
        this.f4127e.f4201b.remove(this);
        E e3 = this.f4128f;
        if (e3 != null) {
            e3.cancel();
        }
        this.f4128f = null;
    }
}
