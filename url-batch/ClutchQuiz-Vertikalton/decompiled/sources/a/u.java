package a;

import X.A;
import androidx.lifecycle.EnumC0071l;

/* loaded from: classes.dex */
public final class u implements androidx.lifecycle.r, InterfaceC0056c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.v f1230a;

    /* renamed from: b, reason: collision with root package name */
    public final A f1231b;

    /* renamed from: c, reason: collision with root package name */
    public v f1232c;
    public final /* synthetic */ x d;

    public u(x xVar, androidx.lifecycle.v vVar, A a2) {
        g1.f.e(a2, "onBackPressedCallback");
        this.d = xVar;
        this.f1230a = vVar;
        this.f1231b = a2;
        vVar.a(this);
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, EnumC0071l enumC0071l) {
        if (enumC0071l != EnumC0071l.ON_START) {
            if (enumC0071l != EnumC0071l.ON_STOP) {
                if (enumC0071l == EnumC0071l.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                v vVar = this.f1232c;
                if (vVar != null) {
                    vVar.cancel();
                    return;
                }
                return;
            }
        }
        x xVar = this.d;
        xVar.getClass();
        A a2 = this.f1231b;
        g1.f.e(a2, "onBackPressedCallback");
        xVar.f1237b.addLast(a2);
        v vVar2 = new v(xVar, a2);
        a2.f925b.add(vVar2);
        xVar.e();
        a2.f926c = new w(0, xVar, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 1);
        this.f1232c = vVar2;
    }

    @Override // a.InterfaceC0056c
    public final void cancel() {
        this.f1230a.f(this);
        this.f1231b.f925b.remove(this);
        v vVar = this.f1232c;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f1232c = null;
    }
}
