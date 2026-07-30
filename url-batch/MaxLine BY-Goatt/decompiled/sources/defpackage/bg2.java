package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bg2 extends pr2 implements Function2 {
    public long m;
    public int n;
    public /* synthetic */ long o;
    public final /* synthetic */ cg2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg2(cg2 cg2Var, o30 o30Var) {
        super(2, o30Var);
        this.p = cg2Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        bg2 bg2Var = new bg2(this.p, o30Var);
        bg2Var.o = ((f43) obj).a;
        return bg2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((f43) obj).a;
        bg2 bg2Var = new bg2(this.p, (o30) obj2);
        bg2Var.o = j;
        return bg2Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r15 == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        b50 b50Var = b50.m;
        int i = this.n;
        cg2 cg2Var = this.p;
        if (i == 0) {
            ca2.b(obj);
            j = this.o;
            js0 js0Var = cg2Var.f;
            this.o = j;
            this.n = 1;
            obj = js0Var.g(j, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = this.m;
                    j3 = this.o;
                    ca2.b(obj);
                    return new f43(f43.d(j3, f43.d(j4, ((f43) obj).a)));
                }
                j2 = this.m;
                j = this.o;
                ca2.b(obj);
                long j5 = ((f43) obj).a;
                js0 js0Var2 = cg2Var.f;
                long d = f43.d(j2, j5);
                this.o = j;
                this.m = j5;
                this.n = 3;
                obj = js0Var2.f(d, j5, this);
                if (obj != b50Var) {
                    j3 = j;
                    j4 = j5;
                    return new f43(f43.d(j3, f43.d(j4, ((f43) obj).a)));
                }
                return b50Var;
            }
            j = this.o;
            ca2.b(obj);
        }
        long d2 = f43.d(j, ((f43) obj).a);
        this.o = j;
        this.m = d2;
        this.n = 2;
        obj = cg2Var.b(d2, this);
        if (obj != b50Var) {
            j2 = d2;
            long j52 = ((f43) obj).a;
            js0 js0Var22 = cg2Var.f;
            long d3 = f43.d(j2, j52);
            this.o = j;
            this.m = j52;
            this.n = 3;
            obj = js0Var22.f(d3, j52, this);
            if (obj != b50Var) {
            }
        }
        return b50Var;
    }
}
