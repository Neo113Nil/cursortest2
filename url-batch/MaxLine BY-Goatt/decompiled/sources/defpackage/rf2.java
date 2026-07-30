package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rf2 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf2(long j, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = j;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        switch (this.m) {
            case 0:
                rf2 rf2Var = new rf2(this.o, o30Var, 0);
                rf2Var.n = obj;
                return rf2Var;
            default:
                rf2 rf2Var2 = new rf2(this.o, o30Var, 1);
                rf2Var2.n = obj;
                return rf2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ag2 ag2Var = (ag2) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((rf2) create(ag2Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        long j = this.o;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                ca2.b(obj);
                cg2 cg2Var = ((ag2) this.n).a;
                cg2.a(cg2Var, cg2Var.h, j, 1);
                break;
            default:
                b50 b50Var2 = b50.m;
                ca2.b(obj);
                cg2 cg2Var2 = ((ag2) this.n).a;
                cg2.a(cg2Var2, cg2Var2.h, j, 1);
                break;
        }
        return Unit.a;
    }
}
