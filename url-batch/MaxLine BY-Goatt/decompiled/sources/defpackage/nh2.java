package defpackage;

import defpackage.aa2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nh2 extends pr2 implements Function2 {
    public final /* synthetic */ int m = 1;
    public int n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh2(long j, ur2 ur2Var, o30 o30Var) {
        super(2, o30Var);
        this.o = j;
        this.p = ur2Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.p;
        long j = this.o;
        switch (i) {
            case 0:
                return new nh2((jc) obj2, j, o30Var);
            default:
                return new nh2(j, (ur2) obj2, o30Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((nh2) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (defpackage.n90.a(8, r14) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0031, code lost:
    
        if (defpackage.n90.a(r5 - 8, r14) == r0) goto L16;
     */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        Object obj2 = this.p;
        long j = this.o;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    au1 au1Var = new au1(j);
                    eo2 eo2Var = oh2.d;
                    this.n = 1;
                    if (jc.c((jc) obj2, au1Var, eo2Var, null, this, 12) == b50Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
            default:
                b50 b50Var2 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    break;
                } else if (i3 == 1) {
                    ca2.b(obj);
                } else if (i3 != 2) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                    fs fsVar = ((ur2) obj2).o;
                    if (fsVar != null) {
                        aa2.a aVar = aa2.m;
                        fsVar.resumeWith(new ba2(new o22(j)));
                    }
                    break;
                }
                this.n = 2;
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh2(jc jcVar, long j, o30 o30Var) {
        super(2, o30Var);
        this.p = jcVar;
        this.o = j;
    }
}
