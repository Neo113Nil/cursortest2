package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wp1 extends pr2 implements Function2 {
    public final /* synthetic */ int m = 0;
    public int n;
    public float o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp1(float f, tg2 tg2Var, cp1 cp1Var, o30 o30Var) {
        super(2, o30Var);
        this.o = f;
        this.p = tg2Var;
        this.q = cp1Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.q;
        switch (i) {
            case 0:
                return new wp1(this.o, (tg2) this.p, (cp1) obj2, o30Var);
            case 1:
                return new wp1((du) this.p, this.o, (md) obj2, o30Var);
            default:
                wp1 wp1Var = new wp1((fz2) obj2, o30Var);
                wp1Var.p = obj;
                return wp1Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((wp1) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fe, code lost:
    
        if (r10 == r5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c1, code lost:
    
        if (r10.E(r0, r10.n.getValue(), r10) == r5) goto L54;
     */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        float k;
        a50 a50Var;
        int i = this.m;
        Object obj2 = this.q;
        switch (i) {
            case 0:
                tg2 tg2Var = (tg2) this.p;
                float f = this.o;
                b50 b50Var = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    if (f > 0.0f) {
                        this.n = 1;
                        break;
                    }
                } else if (i2 == 1) {
                    ca2.b(obj);
                } else if (i2 != 2) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                    break;
                }
                if (f == 0.0f) {
                    cp1 cp1Var = (cp1) obj2;
                    this.n = 2;
                    fz2 fz2Var = tg2Var.q;
                    if (fz2Var != null) {
                        if (!Intrinsics.b(tg2Var.o.getValue(), cp1Var) || !Intrinsics.b(tg2Var.n.getValue(), cp1Var)) {
                            a = no1.a(tg2Var.w, new mg2(tg2Var, cp1Var, fz2Var, null), this);
                            if (a != b50Var) {
                                a = Unit.a;
                                break;
                            }
                        } else {
                            a = Unit.a;
                            break;
                        }
                    } else {
                        a = Unit.a;
                        break;
                    }
                }
                break;
            case 1:
                b50 b50Var2 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    if (jc.c((jc) ((du) this.p).c, new Float(this.o), (md) obj2, null, this, 12) == b50Var2) {
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
                b50 b50Var3 = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    a50 a50Var2 = (a50) this.p;
                    k = nk2.k(a50Var2.n());
                    a50Var = a50Var2;
                } else if (i4 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    k = this.o;
                    a50Var = (a50) this.p;
                    ca2.b(obj);
                }
                while (j8.J(a50Var)) {
                    ju2 ju2Var = new ju2((fz2) obj2, k);
                    this.p = a50Var;
                    this.o = k;
                    this.n = 1;
                    if (iv1.F(getContext()).B(ju2Var, this) == b50Var3) {
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp1(du duVar, float f, md mdVar, o30 o30Var) {
        super(2, o30Var);
        this.p = duVar;
        this.o = f;
        this.q = mdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp1(fz2 fz2Var, o30 o30Var) {
        super(2, o30Var);
        this.q = fz2Var;
    }
}
