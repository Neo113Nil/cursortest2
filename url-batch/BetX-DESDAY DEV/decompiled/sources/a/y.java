package a;

import androidx.lifecycle.AbstractC0082o;
import androidx.lifecycle.EnumC0080m;
import androidx.lifecycle.InterfaceC0086t;

/* loaded from: classes.dex */
public final class y implements androidx.lifecycle.r, InterfaceC0042c {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0082o f943a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.C f944b;

    /* renamed from: c, reason: collision with root package name */
    public z f945c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0039B f946d;

    public y(C0039B c0039b, AbstractC0082o abstractC0082o, androidx.fragment.app.C c2) {
        X0.f.e(abstractC0082o, "lifecycle");
        X0.f.e(c2, "onBackPressedCallback");
        this.f946d = c0039b;
        this.f943a = abstractC0082o;
        this.f944b = c2;
        abstractC0082o.a(this);
    }

    @Override // a.InterfaceC0042c
    public final void cancel() {
        this.f943a.b(this);
        this.f944b.f1196b.remove(this);
        z zVar = this.f945c;
        if (zVar != null) {
            zVar.cancel();
        }
        this.f945c = null;
    }

    @Override // androidx.lifecycle.r
    public final void g(InterfaceC0086t interfaceC0086t, EnumC0080m enumC0080m) {
        if (enumC0080m == EnumC0080m.ON_START) {
            C0039B c0039b = this.f946d;
            androidx.fragment.app.C c2 = this.f944b;
            X0.f.e(c2, "onBackPressedCallback");
            c0039b.f894b.addLast(c2);
            z zVar = new z(c0039b, c2);
            c2.f1196b.add(zVar);
            c0039b.d();
            c2.f1197c = new C0038A(1, c0039b);
            this.f945c = zVar;
            return;
        }
        if (enumC0080m != EnumC0080m.ON_STOP) {
            if (enumC0080m == EnumC0080m.ON_DESTROY) {
                cancel();
            }
        } else {
            z zVar2 = this.f945c;
            if (zVar2 != null) {
                zVar2.cancel();
            }
        }
    }
}
