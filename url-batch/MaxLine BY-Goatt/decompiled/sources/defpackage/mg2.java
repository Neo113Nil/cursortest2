package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mg2 extends pr2 implements Function1 {
    public final /* synthetic */ int m;
    public int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg2(tg2 tg2Var, Object obj, fz2 fz2Var, o30 o30Var) {
        super(1, o30Var);
        this.m = 1;
        this.o = tg2Var;
        this.p = obj;
        this.q = fz2Var;
    }

    @Override // defpackage.hn
    public final o30 create(o30 o30Var) {
        int i = this.m;
        Object obj = this.p;
        Object obj2 = this.o;
        Object obj3 = this.q;
        switch (i) {
            case 0:
                return new mg2((fz2) obj3, (tg2) obj2, this.p, o30Var, 0);
            case 1:
                return new mg2((tg2) obj2, obj, (fz2) obj3, o30Var);
            default:
                return new mg2((z51) obj3, (a61) obj2, (List) obj, o30Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o30 o30Var = (o30) obj;
        switch (this.m) {
        }
        return ((mg2) create(o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.q;
        switch (i) {
            case 0:
                fz2 fz2Var = (fz2) obj4;
                b50 b50Var = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    da daVar = new da((tg2) obj3, obj2, fz2Var, (o30) null);
                    this.n = 1;
                    if (j8.t(daVar, this) == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i2 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                fz2Var.i();
                return Unit.a;
            case 1:
                fz2 fz2Var2 = (fz2) obj4;
                tg2 tg2Var = (tg2) obj3;
                b50 b50Var2 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    tg2Var.D();
                    lz1 lz1Var = tg2Var.n;
                    tg2Var.x = Long.MIN_VALUE;
                    tg2Var.G(0.0f);
                    float f = obj2.equals(tg2Var.o.getValue()) ? -4.0f : obj2.equals(lz1Var.getValue()) ? -5.0f : -3.0f;
                    fz2Var2.q(obj2);
                    fz2Var2.o(0L);
                    lz1Var.setValue(obj2);
                    tg2Var.G(0.0f);
                    tg2Var.m(obj2);
                    fz2Var2.j(f);
                    if (f == -3.0f) {
                        this.n = 1;
                        if (tg2.B(tg2Var, this) == b50Var2) {
                            return b50Var2;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                fz2Var2.i();
                return Unit.a;
            default:
                b50 b50Var3 = b50.m;
                int i4 = this.n;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ca2.b(obj);
                        return obj;
                    }
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                z51 z51Var = (z51) obj4;
                this.n = 1;
                z51Var.getClass();
                Object b = z51.b(z51Var, (a61) obj3, (List) obj2, this);
                return b == b50Var3 ? b50Var3 : b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mg2(Object obj, Object obj2, Object obj3, o30 o30Var, int i) {
        super(1, o30Var);
        this.m = i;
        this.q = obj;
        this.o = obj2;
        this.p = obj3;
    }
}
