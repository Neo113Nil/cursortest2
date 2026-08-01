package a;

import Y.A;
import androidx.lifecycle.EnumC0071l;

/* loaded from: classes.dex */
public final class u implements androidx.lifecycle.r, c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.v f1610a;

    /* renamed from: b, reason: collision with root package name */
    public final A f1611b;

    /* renamed from: c, reason: collision with root package name */
    public v f1612c;
    public final /* synthetic */ x d;

    public u(x xVar, androidx.lifecycle.v vVar, A a2) {
        k1.e.e(vVar, "lifecycle");
        k1.e.e(a2, "onBackPressedCallback");
        this.d = xVar;
        this.f1610a = vVar;
        this.f1611b = a2;
        vVar.a(this);
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, EnumC0071l enumC0071l) {
        if (enumC0071l == EnumC0071l.ON_START) {
            x xVar = this.d;
            A a2 = this.f1611b;
            k1.e.e(a2, "onBackPressedCallback");
            xVar.f1617b.addLast(a2);
            v vVar = new v(xVar, a2);
            a2.f1280b.add(vVar);
            xVar.d();
            a2.f1281c = new w(0, xVar, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 1);
            this.f1612c = vVar;
            return;
        }
        if (enumC0071l != EnumC0071l.ON_STOP) {
            if (enumC0071l == EnumC0071l.ON_DESTROY) {
                cancel();
            }
        } else {
            v vVar2 = this.f1612c;
            if (vVar2 != null) {
                vVar2.cancel();
            }
        }
    }

    @Override // a.c
    public final void cancel() {
        this.f1610a.f(this);
        this.f1611b.f1280b.remove(this);
        v vVar = this.f1612c;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f1612c = null;
    }
}
