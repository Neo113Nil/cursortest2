package b;

import androidx.lifecycle.C0294x;
import androidx.lifecycle.EnumC0285n;
import androidx.lifecycle.InterfaceC0290t;
import androidx.lifecycle.InterfaceC0292v;

/* renamed from: b.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299C implements InterfaceC0290t, InterfaceC0307c {

    /* renamed from: d, reason: collision with root package name */
    public final C0294x f5261d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0327w f5262e;

    /* renamed from: f, reason: collision with root package name */
    public C0300D f5263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0301E f5264g;

    public C0299C(C0301E c0301e, C0294x c0294x, AbstractC0327w abstractC0327w) {
        f2.j.f(abstractC0327w, "onBackPressedCallback");
        this.f5264g = c0301e;
        this.f5261d = c0294x;
        this.f5262e = abstractC0327w;
        c0294x.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0290t
    public final void b(InterfaceC0292v interfaceC0292v, EnumC0285n enumC0285n) {
        if (enumC0285n != EnumC0285n.ON_START) {
            if (enumC0285n != EnumC0285n.ON_STOP) {
                if (enumC0285n == EnumC0285n.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0300D c0300d = this.f5263f;
                if (c0300d != null) {
                    c0300d.cancel();
                    return;
                }
                return;
            }
        }
        C0301E c0301e = this.f5264g;
        c0301e.getClass();
        AbstractC0327w abstractC0327w = this.f5262e;
        f2.j.f(abstractC0327w, "onBackPressedCallback");
        c0301e.f5268b.addLast(abstractC0327w);
        C0300D c0300d2 = new C0300D(c0301e, abstractC0327w);
        abstractC0327w.f5338b.add(c0300d2);
        c0301e.e();
        abstractC0327w.f5339c = new Z.e(0, c0301e, C0301E.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 3);
        this.f5263f = c0300d2;
    }

    @Override // b.InterfaceC0307c
    public final void cancel() {
        this.f5261d.f(this);
        this.f5262e.f5338b.remove(this);
        C0300D c0300d = this.f5263f;
        if (c0300d != null) {
            c0300d.cancel();
        }
        this.f5263f = null;
    }
}
