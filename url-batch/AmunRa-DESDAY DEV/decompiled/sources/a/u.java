package a;

import X.A;
import androidx.lifecycle.EnumC0070l;
import androidx.lifecycle.InterfaceC0074p;

/* loaded from: classes.dex */
public final class u implements InterfaceC0074p, c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f1124a;

    /* renamed from: b, reason: collision with root package name */
    public final A f1125b;

    /* renamed from: c, reason: collision with root package name */
    public v f1126c;
    public final /* synthetic */ x d;

    public u(x xVar, androidx.lifecycle.t tVar, A a2) {
        Z0.d.e(tVar, "lifecycle");
        Z0.d.e(a2, "onBackPressedCallback");
        this.d = xVar;
        this.f1124a = tVar;
        this.f1125b = a2;
        tVar.a(this);
    }

    @Override // a.c
    public final void cancel() {
        this.f1124a.f(this);
        this.f1125b.f831b.remove(this);
        v vVar = this.f1126c;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f1126c = null;
    }

    @Override // androidx.lifecycle.InterfaceC0074p
    public final void f(androidx.lifecycle.r rVar, EnumC0070l enumC0070l) {
        if (enumC0070l == EnumC0070l.ON_START) {
            x xVar = this.d;
            A a2 = this.f1125b;
            Z0.d.e(a2, "onBackPressedCallback");
            xVar.f1134b.addLast(a2);
            v vVar = new v(xVar, a2);
            a2.f831b.add(vVar);
            xVar.d();
            a2.f832c = new w(1, xVar);
            this.f1126c = vVar;
            return;
        }
        if (enumC0070l != EnumC0070l.ON_STOP) {
            if (enumC0070l == EnumC0070l.ON_DESTROY) {
                cancel();
            }
        } else {
            v vVar2 = this.f1126c;
            if (vVar2 != null) {
                vVar2.cancel();
            }
        }
    }
}
