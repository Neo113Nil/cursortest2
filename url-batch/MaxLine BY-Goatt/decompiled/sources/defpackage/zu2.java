package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zu2 extends pr2 implements xt0 {
    public int m;
    public /* synthetic */ s42 n;
    public /* synthetic */ long o;
    public final /* synthetic */ a50 p;
    public final /* synthetic */ zn1 q;
    public final /* synthetic */ bn1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu2(a50 a50Var, zn1 zn1Var, bn1 bn1Var, o30 o30Var) {
        super(3, o30Var);
        this.p = a50Var;
        this.q = zn1Var;
        this.r = bn1Var;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        long j = ((au1) obj2).a;
        zn1 zn1Var = this.q;
        bn1 bn1Var = this.r;
        zu2 zu2Var = new zu2(this.p, zn1Var, bn1Var, (o30) obj3);
        zu2Var.n = (s42) obj;
        zu2Var.o = j;
        return zu2Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        b50 b50Var = b50.m;
        int i = this.m;
        a50 a50Var = this.p;
        if (i == 0) {
            ca2.b(obj);
            s42 s42Var = this.n;
            z71.H(a50Var, null, new w(this.q, this.o, this.r, null, 2), 3);
            this.m = 1;
            obj = s42Var.b(this);
            if (obj == b50Var) {
                return b50Var;
            }
        } else {
            if (i != 1) {
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ca2.b(obj);
        }
        z71.H(a50Var, null, new yu2(this.q, ((Boolean) obj).booleanValue(), this.r, null), 3);
        return Unit.a;
    }
}
