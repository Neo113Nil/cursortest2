package defpackage;

import androidx.compose.foundation.gestures.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qf2 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public final /* synthetic */ tf2 o;
    public /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf2(tf2 tf2Var, long j, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = tf2Var;
        this.p = j;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        switch (this.m) {
            case 0:
                return new qf2(this.o, this.p, o30Var, 0);
            case 1:
                return new qf2(this.o, this.p, o30Var, 1);
            case 2:
                return new qf2(this.o, this.p, o30Var, 2);
            default:
                qf2 qf2Var = new qf2(this.o, o30Var);
                qf2Var.p = ((au1) obj).a;
                return qf2Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                return ((qf2) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((qf2) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((qf2) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            default:
                long j = ((au1) obj).a;
                qf2 qf2Var = new qf2(this.o, (o30) obj2);
                qf2Var.p = j;
                return qf2Var.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        Object invokeSuspend;
        int i = this.m;
        ho1 ho1Var = ho1.n;
        tf2 tf2Var = this.o;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    cg2 cg2Var = tf2Var.P;
                    long j = this.p;
                    this.n = 1;
                    long a = cg2Var.d == ww1.n ? f43.a(j, 0.0f, 0.0f, 1) : f43.a(j, 0.0f, 0.0f, 2);
                    bg2 bg2Var = new bg2(cg2Var, null);
                    px1 px1Var = cg2Var.b;
                    if (px1Var == null || !(cg2Var.a.c() || cg2Var.a.a())) {
                        bg2 bg2Var2 = new bg2(bg2Var.p, this);
                        bg2Var2.o = a;
                        invokeSuspend = bg2Var2.invokeSuspend(Unit.a);
                        if (invokeSuspend != b50Var) {
                            invokeSuspend = Unit.a;
                        }
                    } else {
                        invokeSuspend = px1Var.b(a, bg2Var, this);
                        if (invokeSuspend != b50Var) {
                            invokeSuspend = Unit.a;
                        }
                    }
                    if (invokeSuspend == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i2 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 1:
                b50 b50Var2 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    cg2 cg2Var2 = tf2Var.P;
                    rf2 rf2Var = new rf2(this.p, null, 0);
                    this.n = 1;
                    if (cg2Var2.e(ho1Var, rf2Var, this) == b50Var2) {
                        return b50Var2;
                    }
                } else {
                    if (i3 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 2:
                b50 b50Var3 = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    cg2 cg2Var3 = tf2Var.P;
                    rf2 rf2Var2 = new rf2(this.p, null, 1);
                    this.n = 1;
                    if (cg2Var3.e(ho1Var, rf2Var2, this) == b50Var3) {
                        return b50Var3;
                    }
                } else {
                    if (i4 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            default:
                b50 b50Var4 = b50.m;
                int i5 = this.n;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ca2.b(obj);
                        return obj;
                    }
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                long j2 = this.p;
                cg2 cg2Var4 = tf2Var.P;
                this.n = 1;
                Object a2 = a.a(cg2Var4, j2, this);
                return a2 == b50Var4 ? b50Var4 : a2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf2(tf2 tf2Var, o30 o30Var) {
        super(2, o30Var);
        this.m = 3;
        this.o = tf2Var;
    }
}
