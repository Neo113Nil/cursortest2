package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d40 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ sc1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(sc1 sc1Var, sh2 sh2Var) {
        super(1);
        this.m = 3;
        this.n = sc1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kn2 kn2Var;
        int i = this.m;
        boolean z = false;
        Unit unit = null;
        sc1 sc1Var = this.n;
        switch (i) {
            case 0:
                t81 t81Var = (t81) obj;
                cw2 d = sc1Var.d();
                if (d != null) {
                    d.c = t81Var;
                }
                return Unit.a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                sc1Var.q.setValue(bool);
                return Unit.a;
            case 2:
                List list = (List) obj;
                if (sc1Var.d() != null) {
                    cw2 d2 = sc1Var.d();
                    d2.getClass();
                    list.add(d2.a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                yd ydVar = (yd) obj;
                wv2 wv2Var = sc1Var.e;
                d40 d40Var = sc1Var.t;
                if (wv2Var != null) {
                    nv2 f = sc1Var.d.f(qv.g(new v90(), new yw(ydVar, 1)));
                    wv2Var.a(null, f);
                    d40Var.invoke(f);
                    unit = Unit.a;
                }
                if (unit == null) {
                    String str = ydVar.n;
                    int length = str.length();
                    d40Var.invoke(new nv2(str, 4, th2.a(length, length)));
                }
                return Boolean.TRUE;
            case 4:
                int i2 = ((b11) obj).a;
                mh mhVar = sc1Var.r;
                mhVar.getClass();
                if (i2 == 7) {
                    mhVar.u();
                } else if (i2 == 2) {
                    mhVar.u();
                } else if (i2 == 6) {
                    mhVar.u();
                } else if (i2 == 5) {
                    mhVar.u();
                } else if (i2 == 3) {
                    mhVar.u();
                } else if (i2 == 4) {
                    mhVar.u();
                } else if (i2 != 1 && i2 != 0) {
                    lh.g("invalid ImeAction");
                    return null;
                }
                if (i2 == 6) {
                    no0 no0Var = (no0) mhVar.p;
                    if (no0Var == null) {
                        Intrinsics.f("focusManager");
                        throw null;
                    }
                    ((po0) no0Var).f(1);
                } else if (i2 == 5) {
                    no0 no0Var2 = (no0) mhVar.p;
                    if (no0Var2 == null) {
                        Intrinsics.f("focusManager");
                        throw null;
                    }
                    ((po0) no0Var2).f(2);
                } else if (i2 == 7 && (kn2Var = (kn2) mhVar.n) != null) {
                    ((r90) kn2Var).a();
                }
                return Unit.a;
            default:
                nv2 nv2Var = (nv2) obj;
                String str2 = nv2Var.a.n;
                yd ydVar2 = sc1Var.j;
                if (!Intrinsics.b(str2, ydVar2 != null ? ydVar2.n : null)) {
                    sc1Var.k.setValue(zw0.m);
                }
                long j = jw2.b;
                sc1Var.f(j);
                sc1Var.e(j);
                sc1Var.s.invoke(nv2Var);
                n72 n72Var = sc1Var.b;
                k00 k00Var = n72Var.a;
                if (k00Var != null) {
                    k00Var.r(n72Var, null);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d40(sc1 sc1Var, int i) {
        super(1);
        this.m = i;
        this.n = sc1Var;
    }
}
