package a;

import X.A;
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.InterfaceC0075p;

/* loaded from: classes.dex */
public final class u implements InterfaceC0075p, c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f1163a;

    /* renamed from: b, reason: collision with root package name */
    public final A f1164b;

    /* renamed from: c, reason: collision with root package name */
    public v f1165c;
    public final /* synthetic */ x d;

    public u(x xVar, androidx.lifecycle.t tVar, A a2) {
        b1.d.e(tVar, "lifecycle");
        b1.d.e(a2, "onBackPressedCallback");
        this.d = xVar;
        this.f1163a = tVar;
        this.f1164b = a2;
        tVar.a(this);
    }

    @Override // a.c
    public final void cancel() {
        this.f1163a.f(this);
        this.f1164b.f874b.remove(this);
        v vVar = this.f1165c;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f1165c = null;
    }

    @Override // androidx.lifecycle.InterfaceC0075p
    public final void g(androidx.lifecycle.r rVar, EnumC0071l enumC0071l) {
        if (enumC0071l == EnumC0071l.ON_START) {
            x xVar = this.d;
            A a2 = this.f1164b;
            b1.d.e(a2, "onBackPressedCallback");
            xVar.f1173b.addLast(a2);
            v vVar = new v(xVar, a2);
            a2.f874b.add(vVar);
            xVar.d();
            a2.f875c = new w(1, xVar);
            this.f1165c = vVar;
            return;
        }
        if (enumC0071l != EnumC0071l.ON_STOP) {
            if (enumC0071l == EnumC0071l.ON_DESTROY) {
                cancel();
            }
        } else {
            v vVar2 = this.f1165c;
            if (vVar2 != null) {
                vVar2.cancel();
            }
        }
    }
}
