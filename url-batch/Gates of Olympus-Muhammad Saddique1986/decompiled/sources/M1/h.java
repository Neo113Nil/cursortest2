package M1;

import I.C0167p;
import O2.l;
import Q1.k;
import R1.y;
import androidx.lifecycle.InterfaceC0281j;
import androidx.lifecycle.V;
import androidx.lifecycle.b0;
import e2.InterfaceC0428g;
import f2.j;
import f2.v;
import h2.AbstractC0508a;
import k1.i;
import l.C0582h;
import n.r;
import q1.C0811a;
import r1.AbstractC0931b;
import t1.C1028h;

/* loaded from: classes.dex */
public final class h implements InterfaceC0428g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f3479e;

    public /* synthetic */ h(k kVar, int i3) {
        this.f3478d = i3;
        this.f3479e = kVar;
    }

    @Override // e2.InterfaceC0428g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f3478d) {
            case 0:
                C0167p c0167p = (C0167p) obj3;
                ((Number) obj4).intValue();
                j.f((C0582h) obj, "$this$composable");
                j.f((C1028h) obj2, "it");
                c0167p.R(1729797275);
                b0 a3 = AbstractC0931b.a(c0167p);
                if (a3 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                V s3 = r.s(v.a(Q1.f.class), a3, this.f3479e, a3 instanceof InterfaceC0281j ? ((InterfaceC0281j) a3).a() : C0811a.f7847b, c0167p);
                c0167p.p(false);
                l0.c.a((Q1.f) s3, c0167p, 0);
                return y.f4171a;
            case 1:
                C0167p c0167p2 = (C0167p) obj3;
                ((Number) obj4).intValue();
                j.f((C0582h) obj, "$this$composable");
                j.f((C1028h) obj2, "it");
                c0167p2.R(1729797275);
                b0 a4 = AbstractC0931b.a(c0167p2);
                if (a4 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                V s4 = r.s(v.a(Q1.c.class), a4, this.f3479e, a4 instanceof InterfaceC0281j ? ((InterfaceC0281j) a4).a() : C0811a.f7847b, c0167p2);
                c0167p2.p(false);
                AbstractC0508a.c((Q1.c) s4, c0167p2, 0);
                return y.f4171a;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                C0167p c0167p3 = (C0167p) obj3;
                ((Number) obj4).intValue();
                j.f((C0582h) obj, "$this$composable");
                j.f((C1028h) obj2, "it");
                c0167p3.R(1729797275);
                b0 a5 = AbstractC0931b.a(c0167p3);
                if (a5 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                V s5 = r.s(v.a(Q1.j.class), a5, this.f3479e, a5 instanceof InterfaceC0281j ? ((InterfaceC0281j) a5).a() : C0811a.f7847b, c0167p3);
                c0167p3.p(false);
                l.I((Q1.j) s5, c0167p3, 0);
                return y.f4171a;
            default:
                C0167p c0167p4 = (C0167p) obj3;
                ((Number) obj4).intValue();
                j.f((C0582h) obj, "$this$composable");
                j.f((C1028h) obj2, "it");
                c0167p4.R(1729797275);
                b0 a6 = AbstractC0931b.a(c0167p4);
                if (a6 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                V s6 = r.s(v.a(Q1.g.class), a6, this.f3479e, a6 instanceof InterfaceC0281j ? ((InterfaceC0281j) a6).a() : C0811a.f7847b, c0167p4);
                c0167p4.p(false);
                O2.d.c((Q1.g) s6, c0167p4, 0);
                return y.f4171a;
        }
    }
}
