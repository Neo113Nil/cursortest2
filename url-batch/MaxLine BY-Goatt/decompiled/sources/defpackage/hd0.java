package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hd0 extends pr2 implements Function2 {
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ tf2 o;
    public final /* synthetic */ x22 p;
    public final /* synthetic */ j30 q;
    public final /* synthetic */ p8 r;
    public final /* synthetic */ id0 s;
    public final /* synthetic */ id0 t;
    public final /* synthetic */ n8 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd0(tf2 tf2Var, x22 x22Var, j30 j30Var, p8 p8Var, id0 id0Var, id0 id0Var2, n8 n8Var, o30 o30Var) {
        super(2, o30Var);
        this.o = tf2Var;
        this.p = x22Var;
        this.q = j30Var;
        this.r = p8Var;
        this.s = id0Var;
        this.t = id0Var2;
        this.u = n8Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        hd0 hd0Var = new hd0(this.o, this.p, this.q, this.r, this.s, this.t, this.u, o30Var);
        hd0Var.n = obj;
        return hd0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hd0) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CancellationException cancellationException;
        a50 a50Var;
        lq lqVar;
        Object obj2 = b50.m;
        int i = this.m;
        tf2 tf2Var = this.o;
        if (i == 0) {
            ca2.b(obj);
            a50 a50Var2 = (a50) this.n;
            try {
                ww1 ww1Var = tf2Var.C;
                x22 x22Var = this.p;
                j30 j30Var = this.q;
                p8 p8Var = this.r;
                id0 id0Var = this.s;
                id0 id0Var2 = this.t;
                n8 n8Var = this.u;
                this.n = a50Var2;
                this.m = 1;
                float f = gd0.a;
                Object j = yj1.j(x22Var, new ed0(id0Var2, new b82(), ww1Var, j30Var, n8Var, id0Var, p8Var, null), this);
                if (j != obj2) {
                    j = Unit.a;
                }
                if (j == obj2) {
                    return obj2;
                }
            } catch (CancellationException e) {
                cancellationException = e;
                a50Var = a50Var2;
                lqVar = tf2Var.G;
                if (lqVar != null) {
                    lqVar.d(wc0.a);
                }
                if (!j8.J(a50Var)) {
                    throw cancellationException;
                }
                return Unit.a;
            }
        } else {
            if (i != 1) {
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a50Var = (a50) this.n;
            try {
                ca2.b(obj);
            } catch (CancellationException e2) {
                cancellationException = e2;
                lqVar = tf2Var.G;
                if (lqVar != null) {
                }
                if (!j8.J(a50Var)) {
                }
                return Unit.a;
            }
        }
        return Unit.a;
    }
}
