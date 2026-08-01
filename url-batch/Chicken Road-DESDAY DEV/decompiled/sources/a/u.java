package a;

import X.A;
import androidx.lifecycle.EnumC0072l;
import androidx.lifecycle.InterfaceC0076p;

/* loaded from: classes.dex */
public final class u implements InterfaceC0076p, c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f1149a;

    /* renamed from: b, reason: collision with root package name */
    public final A f1150b;

    /* renamed from: c, reason: collision with root package name */
    public v f1151c;
    public final /* synthetic */ x d;

    public u(x xVar, androidx.lifecycle.t tVar, A a2) {
        b1.d.e(tVar, "lifecycle");
        b1.d.e(a2, "onBackPressedCallback");
        this.d = xVar;
        this.f1149a = tVar;
        this.f1150b = a2;
        tVar.a(this);
    }

    @Override // a.c
    public final void cancel() {
        this.f1149a.f(this);
        this.f1150b.f860b.remove(this);
        v vVar = this.f1151c;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f1151c = null;
    }

    @Override // androidx.lifecycle.InterfaceC0076p
    public final void g(androidx.lifecycle.r rVar, EnumC0072l enumC0072l) {
        if (enumC0072l == EnumC0072l.ON_START) {
            x xVar = this.d;
            A a2 = this.f1150b;
            b1.d.e(a2, "onBackPressedCallback");
            xVar.f1159b.addLast(a2);
            v vVar = new v(xVar, a2);
            a2.f860b.add(vVar);
            xVar.d();
            a2.f861c = new w(1, xVar);
            this.f1151c = vVar;
            return;
        }
        if (enumC0072l != EnumC0072l.ON_STOP) {
            if (enumC0072l == EnumC0072l.ON_DESTROY) {
                cancel();
            }
        } else {
            v vVar2 = this.f1151c;
            if (vVar2 != null) {
                vVar2.cancel();
            }
        }
    }
}
