package a;

import X.A;
import androidx.lifecycle.EnumC0068l;
import androidx.lifecycle.InterfaceC0072p;

/* loaded from: classes.dex */
public final class u implements InterfaceC0072p, c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f1088a;

    /* renamed from: b, reason: collision with root package name */
    public final A f1089b;

    /* renamed from: c, reason: collision with root package name */
    public v f1090c;
    public final /* synthetic */ x d;

    public u(x xVar, androidx.lifecycle.t tVar, A a2) {
        X0.d.e(tVar, "lifecycle");
        X0.d.e(a2, "onBackPressedCallback");
        this.d = xVar;
        this.f1088a = tVar;
        this.f1089b = a2;
        tVar.a(this);
    }

    @Override // a.c
    public final void cancel() {
        this.f1088a.f(this);
        this.f1089b.f788b.remove(this);
        v vVar = this.f1090c;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f1090c = null;
    }

    @Override // androidx.lifecycle.InterfaceC0072p
    public final void e(androidx.lifecycle.r rVar, EnumC0068l enumC0068l) {
        if (enumC0068l == EnumC0068l.ON_START) {
            x xVar = this.d;
            A a2 = this.f1089b;
            X0.d.e(a2, "onBackPressedCallback");
            xVar.f1098b.addLast(a2);
            v vVar = new v(xVar, a2);
            a2.f788b.add(vVar);
            xVar.d();
            a2.f789c = new w(1, xVar);
            this.f1090c = vVar;
            return;
        }
        if (enumC0068l != EnumC0068l.ON_STOP) {
            if (enumC0068l == EnumC0068l.ON_DESTROY) {
                cancel();
            }
        } else {
            v vVar2 = this.f1090c;
            if (vVar2 != null) {
                vVar2.cancel();
            }
        }
    }
}
