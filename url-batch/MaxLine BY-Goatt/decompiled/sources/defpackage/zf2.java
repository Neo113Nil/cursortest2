package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zf2 extends pr2 implements Function2 {
    public cg2 m;
    public b82 n;
    public long o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ cg2 r;
    public final /* synthetic */ b82 s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf2(cg2 cg2Var, b82 b82Var, long j, o30 o30Var) {
        super(2, o30Var);
        this.r = cg2Var;
        this.s = b82Var;
        this.t = j;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        zf2 zf2Var = new zf2(this.r, this.s, this.t, o30Var);
        zf2Var.q = obj;
        return zf2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zf2) create((ag2) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        cg2 cg2Var;
        b82 b82Var;
        cg2 cg2Var2;
        long j;
        b50 b50Var = b50.m;
        int i = this.p;
        ww1 ww1Var = ww1.n;
        if (i == 0) {
            ca2.b(obj);
            ag2 ag2Var = (ag2) this.q;
            cg2Var = this.r;
            yf2 yf2Var = new yf2(cg2Var, ag2Var);
            om0 om0Var = cg2Var.c;
            b82Var = this.s;
            long j2 = b82Var.m;
            ww1 ww1Var2 = cg2Var.d;
            long j3 = this.t;
            float c = cg2Var.c(ww1Var2 == ww1Var ? f43.b(j3) : f43.c(j3));
            this.q = cg2Var;
            this.m = cg2Var;
            this.n = b82Var;
            this.o = j2;
            this.p = 1;
            obj = om0Var.a(yf2Var, c, this);
            if (obj == b50Var) {
                return b50Var;
            }
            cg2Var2 = cg2Var;
            j = j2;
        } else {
            if (i != 1) {
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.o;
            b82Var = this.n;
            cg2Var = this.m;
            cg2Var2 = (cg2) this.q;
            ca2.b(obj);
        }
        float c2 = cg2Var2.c(((Number) obj).floatValue());
        b82Var.m = cg2Var.d == ww1Var ? f43.a(j, c2, 0.0f, 2) : f43.a(j, 0.0f, c2, 1);
        return Unit.a;
    }
}
