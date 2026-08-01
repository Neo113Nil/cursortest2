package b;

import Z.A;
import androidx.lifecycle.EnumC0077l;

/* loaded from: classes.dex */
public final class t implements androidx.lifecycle.r, InterfaceC0090c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.v f2207a;

    /* renamed from: b, reason: collision with root package name */
    public final A f2208b;

    /* renamed from: c, reason: collision with root package name */
    public u f2209c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f2210d;

    public t(w wVar, androidx.lifecycle.v vVar, A a2) {
        j1.h.e(vVar, "lifecycle");
        j1.h.e(a2, "onBackPressedCallback");
        this.f2210d = wVar;
        this.f2207a = vVar;
        this.f2208b = a2;
        vVar.a(this);
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, EnumC0077l enumC0077l) {
        if (enumC0077l == EnumC0077l.ON_START) {
            w wVar = this.f2210d;
            A a2 = this.f2208b;
            j1.h.e(a2, "onBackPressedCallback");
            wVar.f2214b.addLast(a2);
            u uVar = new u(wVar, a2);
            a2.f1421b.add(uVar);
            wVar.d();
            a2.f1422c = new v(0, wVar, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
            this.f2209c = uVar;
            return;
        }
        if (enumC0077l != EnumC0077l.ON_STOP) {
            if (enumC0077l == EnumC0077l.ON_DESTROY) {
                cancel();
            }
        } else {
            u uVar2 = this.f2209c;
            if (uVar2 != null) {
                uVar2.cancel();
            }
        }
    }

    @Override // b.InterfaceC0090c
    public final void cancel() {
        this.f2207a.f(this);
        this.f2208b.f1421b.remove(this);
        u uVar = this.f2209c;
        if (uVar != null) {
            uVar.cancel();
        }
        this.f2209c = null;
    }
}
