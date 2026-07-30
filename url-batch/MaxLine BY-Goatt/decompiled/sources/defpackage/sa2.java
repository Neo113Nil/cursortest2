package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sa2 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public final /* synthetic */ ua2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sa2(ua2 ua2Var, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = ua2Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        ua2 ua2Var = this.o;
        switch (i) {
            case 0:
                return new sa2(ua2Var, o30Var, 0);
            case 1:
                return new sa2(ua2Var, o30Var, 1);
            case 2:
                return new sa2(ua2Var, o30Var, 2);
            default:
                return new sa2(ua2Var, o30Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((sa2) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        ua2 ua2Var = this.o;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    jc jcVar = ua2Var.f;
                    Float f = new Float(1.0f);
                    h03 P = bd3.P(75, 2, cf0.b);
                    this.n = 1;
                    if (jc.c(jcVar, f, P, null, this, 12) == b50Var) {
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
                b50 b50Var2 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    jc jcVar2 = ua2Var.g;
                    Float f2 = new Float(1.0f);
                    h03 P2 = bd3.P(225, 2, cf0.a);
                    this.n = 1;
                    if (jc.c(jcVar2, f2, P2, null, this, 12) == b50Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
            case 2:
                b50 b50Var3 = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    jc jcVar3 = ua2Var.h;
                    Float f3 = new Float(1.0f);
                    h03 P3 = bd3.P(225, 2, cf0.b);
                    this.n = 1;
                    if (jc.c(jcVar3, f3, P3, null, this, 12) == b50Var3) {
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
                b50 b50Var4 = b50.m;
                int i5 = this.n;
                if (i5 == 0) {
                    ca2.b(obj);
                    jc jcVar4 = ua2Var.f;
                    Float f4 = new Float(0.0f);
                    h03 P4 = bd3.P(150, 2, cf0.b);
                    this.n = 1;
                    if (jc.c(jcVar4, f4, P4, null, this, 12) == b50Var4) {
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
