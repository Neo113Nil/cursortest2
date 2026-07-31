package u1;

import androidx.lifecycle.EnumC0285n;
import androidx.lifecycle.InterfaceC0290t;
import androidx.lifecycle.InterfaceC0292v;
import e2.InterfaceC0424c;
import m.n0;
import t1.C1028h;

/* loaded from: classes.dex */
public final class n extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1028h f9612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f9613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ S.t f9614g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(S.t tVar, C1028h c1028h, boolean z3) {
        super(1);
        this.f9612e = c1028h;
        this.f9613f = z3;
        this.f9614g = tVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        final C1028h c1028h = this.f9612e;
        final boolean z3 = this.f9613f;
        final S.t tVar = this.f9614g;
        InterfaceC0290t interfaceC0290t = new InterfaceC0290t() { // from class: u1.m
            @Override // androidx.lifecycle.InterfaceC0290t
            public final void b(InterfaceC0292v interfaceC0292v, EnumC0285n enumC0285n) {
                C1028h c1028h2 = c1028h;
                boolean z4 = z3;
                S.t tVar2 = tVar;
                if (z4 && !tVar2.contains(c1028h2)) {
                    tVar2.add(c1028h2);
                }
                if (enumC0285n == EnumC0285n.ON_START && !tVar2.contains(c1028h2)) {
                    tVar2.add(c1028h2);
                }
                if (enumC0285n == EnumC0285n.ON_STOP) {
                    tVar2.remove(c1028h2);
                }
            }
        };
        c1028h.f8880k.a(interfaceC0290t);
        return new n0(c1028h, 7, interfaceC0290t);
    }
}
