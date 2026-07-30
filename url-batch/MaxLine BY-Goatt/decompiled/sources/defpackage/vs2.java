package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vs2 extends z92 implements Function2 {
    public final /* synthetic */ int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ a50 q;
    public final /* synthetic */ s42 r;
    public final /* synthetic */ tt0 s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vs2(a50 a50Var, tt0 tt0Var, Object obj, s42 s42Var, o30 o30Var, int i) {
        super(o30Var);
        this.n = i;
        this.q = a50Var;
        this.s = tt0Var;
        this.t = obj;
        this.r = s42Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.n;
        Object obj2 = this.t;
        tt0 tt0Var = this.s;
        switch (i) {
            case 0:
                vs2 vs2Var = new vs2(this.q, (xt0) tt0Var, (Function1) obj2, this.r, o30Var, 0);
                vs2Var.p = obj;
                return vs2Var;
            default:
                vs2 vs2Var2 = new vs2(this.q, (y30) tt0Var, (c82) obj2, this.r, o30Var, 1);
                vs2Var2.p = obj;
                return vs2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ur2 ur2Var = (ur2) obj;
        o30 o30Var = (o30) obj2;
        switch (this.n) {
        }
        return ((vs2) create(ur2Var, o30Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        if (r0 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        if (r7 == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.coroutines.CoroutineContext, o30] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ur2 ur2Var;
        Object b;
        Object obj2;
        Object d;
        ?? r3;
        Object d2;
        int i = this.n;
        Object obj3 = this.t;
        tt0 tt0Var = this.s;
        a50 a50Var = this.q;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i2 = this.o;
                s42 s42Var = this.r;
                if (i2 == 0) {
                    ca2.b(obj);
                    ur2Var = (ur2) this.p;
                    z71.H(a50Var, null, new ss2(s42Var, null, 0), 3);
                    this.p = ur2Var;
                    this.o = 1;
                    b = zs2.b(ur2Var, (r3 & 1) != 0, n22.n, this);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ca2.b(obj);
                        d = obj;
                        r3 = 0;
                        t22 t22Var = (t22) d;
                        if (t22Var == null) {
                            z71.H(a50Var, r3, new us2(s42Var, r3, 0), 3);
                        } else {
                            t22Var.a();
                            z71.H(a50Var, r3, new us2(s42Var, r3, 1), 3);
                            ((Function1) obj3).invoke(new au1(t22Var.c));
                        }
                        return Unit.a;
                    }
                    ur2Var = (ur2) this.p;
                    ca2.b(obj);
                    b = obj;
                }
                t22 t22Var2 = (t22) b;
                t22Var2.a();
                xt0 xt0Var = (xt0) tt0Var;
                if (xt0Var != zs2.a) {
                    obj2 = null;
                    z71.H(a50Var, null, new ts2(xt0Var, s42Var, t22Var2, null, 0), 3);
                } else {
                    obj2 = null;
                }
                this.p = obj2;
                this.o = 2;
                d = zs2.d(ur2Var, n22.n, this);
                r3 = obj2;
                break;
            default:
                b50 b50Var2 = b50.m;
                int i3 = this.o;
                if (i3 == 0) {
                    ca2.b(obj);
                    ur2 ur2Var2 = (ur2) this.p;
                    this.o = 1;
                    qd0 qd0Var = zs2.a;
                    d2 = zs2.d(ur2Var2, n22.n, this);
                    if (d2 == b50Var2) {
                        return b50Var2;
                    }
                } else {
                    if (i3 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                    d2 = obj;
                }
                t22 t22Var3 = (t22) d2;
                s42 s42Var2 = this.r;
                if (t22Var3 != null) {
                    t22Var3.a();
                    z71.H(a50Var, null, new us2(s42Var2, null, 6), 3);
                    throw null;
                }
                z71.H(a50Var, null, new us2(s42Var2, null, 7), 3);
                long j = ((t22) ((c82) obj3).m).c;
                ((y30) tt0Var).n.o();
                Unit unit = Unit.a;
                return Unit.a;
        }
    }
}
