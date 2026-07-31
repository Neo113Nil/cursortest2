package l;

import e2.InterfaceC0424c;
import m.g0;

/* loaded from: classes.dex */
public final class E extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F f6441f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(F f3, int i3) {
        super(1);
        this.f6440e = i3;
        this.f6441f = f3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f6440e) {
            case 0:
                g0 g0Var = (g0) obj;
                x xVar = x.f6547d;
                x xVar2 = x.f6548e;
                boolean a3 = g0Var.a(xVar, xVar2);
                Object obj2 = null;
                F f3 = this.f6441f;
                if (a3) {
                    v vVar = f3.f6445t.f6453a.f6469b;
                    if (vVar != null) {
                        obj2 = vVar.f6541c;
                    }
                } else if (g0Var.a(xVar2, x.f6549f)) {
                    v vVar2 = f3.f6446u.f6456a.f6469b;
                    if (vVar2 != null) {
                        obj2 = vVar2.f6541c;
                    }
                } else {
                    obj2 = AbstractC0574B.f6431d;
                }
                return obj2 == null ? AbstractC0574B.f6431d : obj2;
            default:
                g0 g0Var2 = (g0) obj;
                x xVar3 = x.f6547d;
                x xVar4 = x.f6548e;
                boolean a4 = g0Var2.a(xVar3, xVar4);
                F f4 = this.f6441f;
                if (a4) {
                    f4.f6445t.f6453a.getClass();
                    return AbstractC0574B.f6430c;
                }
                if (!g0Var2.a(xVar4, x.f6549f)) {
                    return AbstractC0574B.f6430c;
                }
                f4.f6446u.f6456a.getClass();
                return AbstractC0574B.f6430c;
        }
    }
}
