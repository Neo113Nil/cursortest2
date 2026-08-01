package a;

import Z.A;
import androidx.lifecycle.EnumC0078l;
import androidx.lifecycle.InterfaceC0082p;

/* loaded from: classes.dex */
public final class u implements InterfaceC0082p, InterfaceC0058c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f1282a;

    /* renamed from: b, reason: collision with root package name */
    public final A f1283b;

    /* renamed from: c, reason: collision with root package name */
    public v f1284c;
    public final /* synthetic */ x d;

    public u(x xVar, androidx.lifecycle.t tVar, A a2) {
        h1.d.e(tVar, "lifecycle");
        h1.d.e(a2, "onBackPressedCallback");
        this.d = xVar;
        this.f1282a = tVar;
        this.f1283b = a2;
        tVar.a(this);
    }

    @Override // a.InterfaceC0058c
    public final void cancel() {
        this.f1282a.f(this);
        this.f1283b.f990b.remove(this);
        v vVar = this.f1284c;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f1284c = null;
    }

    @Override // androidx.lifecycle.InterfaceC0082p
    public final void g(androidx.lifecycle.r rVar, EnumC0078l enumC0078l) {
        if (enumC0078l == EnumC0078l.ON_START) {
            x xVar = this.d;
            A a2 = this.f1283b;
            h1.d.e(a2, "onBackPressedCallback");
            xVar.f1292b.addLast(a2);
            v vVar = new v(xVar, a2);
            a2.f990b.add(vVar);
            xVar.d();
            a2.f991c = new w(1, xVar);
            this.f1284c = vVar;
            return;
        }
        if (enumC0078l != EnumC0078l.ON_STOP) {
            if (enumC0078l == EnumC0078l.ON_DESTROY) {
                cancel();
            }
        } else {
            v vVar2 = this.f1284c;
            if (vVar2 != null) {
                vVar2.cancel();
            }
        }
    }
}
