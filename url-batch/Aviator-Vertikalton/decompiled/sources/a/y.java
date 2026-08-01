package a;

import androidx.lifecycle.AbstractC0082o;
import androidx.lifecycle.EnumC0080m;
import androidx.lifecycle.InterfaceC0086t;

/* loaded from: classes.dex */
public final class y implements androidx.lifecycle.r, InterfaceC0042c {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0082o f942a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.C f943b;

    /* renamed from: c, reason: collision with root package name */
    public z f944c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0039B f945d;

    public y(C0039B c0039b, AbstractC0082o abstractC0082o, androidx.fragment.app.C c2) {
        X0.f.e(abstractC0082o, "lifecycle");
        X0.f.e(c2, "onBackPressedCallback");
        this.f945d = c0039b;
        this.f942a = abstractC0082o;
        this.f943b = c2;
        abstractC0082o.a(this);
    }

    @Override // a.InterfaceC0042c
    public final void cancel() {
        this.f942a.b(this);
        this.f943b.f1195b.remove(this);
        z zVar = this.f944c;
        if (zVar != null) {
            zVar.cancel();
        }
        this.f944c = null;
    }

    @Override // androidx.lifecycle.r
    public final void g(InterfaceC0086t interfaceC0086t, EnumC0080m enumC0080m) {
        if (enumC0080m == EnumC0080m.ON_START) {
            C0039B c0039b = this.f945d;
            androidx.fragment.app.C c2 = this.f943b;
            X0.f.e(c2, "onBackPressedCallback");
            c0039b.f893b.addLast(c2);
            z zVar = new z(c0039b, c2);
            c2.f1195b.add(zVar);
            c0039b.d();
            c2.f1196c = new C0038A(1, c0039b);
            this.f944c = zVar;
            return;
        }
        if (enumC0080m != EnumC0080m.ON_STOP) {
            if (enumC0080m == EnumC0080m.ON_DESTROY) {
                cancel();
            }
        } else {
            z zVar2 = this.f944c;
            if (zVar2 != null) {
                zVar2.cancel();
            }
        }
    }
}
