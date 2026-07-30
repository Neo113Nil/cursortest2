package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class n40 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public final /* synthetic */ x22 o;
    public final /* synthetic */ bu2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n40(x22 x22Var, bu2 bu2Var, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = x22Var;
        this.p = bu2Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        switch (this.m) {
            case 0:
                return new n40(this.o, this.p, o30Var, 0);
            case 1:
                return new n40(this.o, this.p, o30Var, 1);
            default:
                return new n40(this.o, this.p, o30Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((n40) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        bu2 bu2Var = this.p;
        x22 x22Var = this.o;
        o30 o30Var = null;
        int i2 = 1;
        switch (i) {
            case 0:
                Object obj2 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    Object t = j8.t(new va0(x22Var, bu2Var, o30Var, i2), this);
                    if (t != obj2) {
                        t = Unit.a;
                    }
                    if (t == obj2) {
                        break;
                    }
                } else if (i3 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
            case 1:
                Object obj3 = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    Object j = yj1.j(x22Var, new oq0(bu2Var, null), this);
                    if (j != obj3) {
                        j = Unit.a;
                    }
                    if (j == obj3) {
                        break;
                    }
                } else if (i4 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
            default:
                Object obj4 = b50.m;
                int i5 = this.n;
                if (i5 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    jg1 jg1Var = new jg1(bu2Var, 0);
                    kg1 kg1Var = new kg1(bu2Var, 0);
                    kg1 kg1Var2 = new kg1(bu2Var, 1);
                    c0 c0Var = new c0(12, bu2Var);
                    float f = gd0.a;
                    Object j2 = yj1.j(x22Var, new ed0(o00.u, new b82(), null, new mc(i2, jg1Var), c0Var, kg1Var2, new j6(15, kg1Var), null), this);
                    if (j2 != obj4) {
                        j2 = Unit.a;
                    }
                    if (j2 != obj4) {
                        j2 = Unit.a;
                    }
                    if (j2 != obj4) {
                        j2 = Unit.a;
                    }
                    if (j2 == obj4) {
                        break;
                    }
                } else if (i5 != 1) {
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
