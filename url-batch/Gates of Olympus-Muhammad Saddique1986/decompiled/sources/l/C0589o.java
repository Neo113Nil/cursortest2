package l;

import e2.InterfaceC0422a;
import m.l0;

/* renamed from: l.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589o extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0 f6516f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0589o(l0 l0Var, int i3) {
        super(0);
        this.f6515e = i3;
        this.f6516f = l0Var;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f6515e) {
            case 0:
                l0 l0Var = this.f6516f;
                Object a3 = l0Var.f6836a.a();
                x xVar = x.f6549f;
                return Boolean.valueOf(a3 == xVar && l0Var.f6839d.getValue() == xVar);
            default:
                return Long.valueOf(this.f6516f.b());
        }
    }
}
