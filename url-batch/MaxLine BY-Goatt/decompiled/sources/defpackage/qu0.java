package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qu0 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public final /* synthetic */ ij1 o;
    public final /* synthetic */ String p;
    public final /* synthetic */ boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qu0(ij1 ij1Var, String str, boolean z, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = ij1Var;
        this.p = str;
        this.q = z;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        switch (this.m) {
            case 0:
                return new qu0(this.o, this.p, this.q, o30Var, 0);
            case 1:
                return new qu0(this.o, this.p, this.q, o30Var, 1);
            default:
                return new qu0(this.o, this.p, this.q, o30Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((qu0) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        boolean z = this.q;
        ij1 ij1Var = this.o;
        switch (i) {
            case 0:
                Object obj2 = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    hk hkVar = ij1Var.b;
                    Object T = l41.T(hkVar.a, new gk(hkVar, this.p, !z, null, 2), this);
                    if (T != obj2) {
                        T = Unit.a;
                    }
                    if (T != obj2) {
                        T = Unit.a;
                    }
                    if (T == obj2) {
                        break;
                    }
                } else if (i2 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
            case 1:
                Object obj3 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    hk hkVar2 = ij1Var.b;
                    Object T2 = l41.T(hkVar2.a, new gk(hkVar2, this.p, !z, null, 1), this);
                    if (T2 != obj3) {
                        T2 = Unit.a;
                    }
                    if (T2 != obj3) {
                        T2 = Unit.a;
                    }
                    if (T2 == obj3) {
                        break;
                    }
                } else if (i3 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
            default:
                Object obj4 = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    hk hkVar3 = ij1Var.b;
                    Object T3 = l41.T(hkVar3.a, new gk(hkVar3, this.p, !z, null, 0), this);
                    if (T3 != obj4) {
                        T3 = Unit.a;
                    }
                    if (T3 != obj4) {
                        T3 = Unit.a;
                    }
                    if (T3 == obj4) {
                        break;
                    }
                } else if (i4 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
        }
        return Unit.a;
    }
}
