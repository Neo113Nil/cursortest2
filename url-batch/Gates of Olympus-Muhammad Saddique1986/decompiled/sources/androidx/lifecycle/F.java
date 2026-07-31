package androidx.lifecycle;

import p1.C0803b;
import q2.AbstractC0837y;
import q2.C0821h;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class F implements InterfaceC0290t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EnumC0285n f5155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f2.u f5156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0835w f5157f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ EnumC0285n f5158g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0821h f5159h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.c f5160i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0803b f5161j;

    public F(EnumC0285n enumC0285n, f2.u uVar, InterfaceC0835w interfaceC0835w, EnumC0285n enumC0285n2, C0821h c0821h, y2.c cVar, C0803b c0803b) {
        this.f5155d = enumC0285n;
        this.f5156e = uVar;
        this.f5157f = interfaceC0835w;
        this.f5158g = enumC0285n2;
        this.f5159h = c0821h;
        this.f5160i = cVar;
        this.f5161j = c0803b;
    }

    @Override // androidx.lifecycle.InterfaceC0290t
    public final void b(InterfaceC0292v interfaceC0292v, EnumC0285n enumC0285n) {
        f2.u uVar = this.f5156e;
        if (enumC0285n == this.f5155d) {
            uVar.f5832d = AbstractC0837y.r(this.f5157f, null, null, new E(this.f5160i, this.f5161j, null), 3);
            return;
        }
        if (enumC0285n == this.f5158g) {
            q2.X x3 = (q2.X) uVar.f5832d;
            if (x3 != null) {
                x3.a(null);
            }
            uVar.f5832d = null;
        }
        if (enumC0285n == EnumC0285n.ON_DESTROY) {
            this.f5159h.u(R1.y.f4171a);
        }
    }
}
