package o;

import I.Y0;
import m.C0612w;
import t0.AbstractC0898f;
import u0.AbstractC0963b0;

/* renamed from: o.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0748y extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f6664f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0748y(g0 g0Var, int i3) {
        super(0);
        this.f6663e = i3;
        this.f6664f = g0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r0 != false) goto L13;
     */
    @Override // Y1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        boolean z3;
        boolean z4;
        switch (this.f6663e) {
            case 0:
                m2.e eVar = this.f6664f.f6526w;
                if (eVar != null) {
                    eVar.g(C0741q.f6608a);
                }
                return L1.z.f2729a;
            case 1:
                o0 o0Var = this.f6664f.f6516F;
                if (!o0Var.f6592a.d()) {
                    n.e0 e0Var = o0Var.f6593b;
                    z3 = false;
                    if (e0Var == null) {
                        z4 = false;
                        break;
                    } else {
                        z4 = e0Var.e();
                        break;
                    }
                }
                z3 = true;
                return Boolean.valueOf(!z3);
            default:
                Y0 y02 = AbstractC0963b0.f8296f;
                g0 g0Var = this.f6664f;
                g0Var.f6515E.f6574a = new C0612w(new A2.g((M0.b) AbstractC0898f.i(g0Var, y02)));
                return L1.z.f2729a;
        }
    }
}
