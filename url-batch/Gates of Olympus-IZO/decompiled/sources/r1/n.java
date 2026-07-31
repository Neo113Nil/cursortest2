package r1;

import androidx.lifecycle.EnumC0229n;
import androidx.lifecycle.InterfaceC0234t;
import androidx.lifecycle.InterfaceC0236v;
import m.C0584I;
import q1.C0784h;

/* loaded from: classes.dex */
public final class n extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0784h f7242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f7243f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ S.t f7244g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(S.t tVar, C0784h c0784h, boolean z3) {
        super(1);
        this.f7242e = c0784h;
        this.f7243f = z3;
        this.f7244g = tVar;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        final C0784h c0784h = this.f7242e;
        final boolean z3 = this.f7243f;
        final S.t tVar = this.f7244g;
        InterfaceC0234t interfaceC0234t = new InterfaceC0234t() { // from class: r1.m
            @Override // androidx.lifecycle.InterfaceC0234t
            public final void b(InterfaceC0236v interfaceC0236v, EnumC0229n enumC0229n) {
                C0784h c0784h2 = c0784h;
                boolean z4 = z3;
                S.t tVar2 = tVar;
                if (z4 && !tVar2.contains(c0784h2)) {
                    tVar2.add(c0784h2);
                }
                if (enumC0229n == EnumC0229n.ON_START && !tVar2.contains(c0784h2)) {
                    tVar2.add(c0784h2);
                }
                if (enumC0229n == EnumC0229n.ON_STOP) {
                    tVar2.remove(c0784h2);
                }
            }
        };
        c0784h.f6901k.a(interfaceC0234t);
        return new C0584I(c0784h, 4, interfaceC0234t);
    }
}
