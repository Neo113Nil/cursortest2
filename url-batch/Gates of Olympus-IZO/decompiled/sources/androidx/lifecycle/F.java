package androidx.lifecycle;

import k2.AbstractC0552y;
import k2.C0536h;
import k2.InterfaceC0550w;
import m1.C0622b;

/* loaded from: classes.dex */
public final class F implements InterfaceC0234t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EnumC0229n f3954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z1.t f3955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0550w f3956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ EnumC0229n f3957g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0536h f3958h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s2.c f3959i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0622b f3960j;

    public F(EnumC0229n enumC0229n, Z1.t tVar, InterfaceC0550w interfaceC0550w, EnumC0229n enumC0229n2, C0536h c0536h, s2.c cVar, C0622b c0622b) {
        this.f3954d = enumC0229n;
        this.f3955e = tVar;
        this.f3956f = interfaceC0550w;
        this.f3957g = enumC0229n2;
        this.f3958h = c0536h;
        this.f3959i = cVar;
        this.f3960j = c0622b;
    }

    @Override // androidx.lifecycle.InterfaceC0234t
    public final void b(InterfaceC0236v interfaceC0236v, EnumC0229n enumC0229n) {
        Z1.t tVar = this.f3955e;
        if (enumC0229n == this.f3954d) {
            tVar.f3480d = AbstractC0552y.q(this.f3956f, null, null, new E(this.f3959i, this.f3960j, null), 3);
            return;
        }
        if (enumC0229n == this.f3957g) {
            k2.X x3 = (k2.X) tVar.f3480d;
            if (x3 != null) {
                x3.a(null);
            }
            tVar.f3480d = null;
        }
        if (enumC0229n == EnumC0229n.ON_DESTROY) {
            this.f3958h.resumeWith(L1.z.f2729a);
        }
    }
}
