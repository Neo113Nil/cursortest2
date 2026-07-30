package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ta2 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ua2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ta2(ua2 ua2Var, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = ua2Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        ua2 ua2Var = this.o;
        switch (i) {
            case 0:
                ta2 ta2Var = new ta2(ua2Var, o30Var, 0);
                ta2Var.n = obj;
                return ta2Var;
            default:
                ta2 ta2Var2 = new ta2(ua2Var, o30Var, 1);
                ta2Var2.n = obj;
                return ta2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((ta2) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        ua2 ua2Var = this.o;
        o30 o30Var = null;
        int i2 = 3;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                ca2.b(obj);
                a50 a50Var = (a50) this.n;
                z71.H(a50Var, null, new sa2(ua2Var, o30Var, 0), 3);
                z71.H(a50Var, null, new sa2(ua2Var, o30Var, 1), 3);
                return z71.H(a50Var, null, new sa2(ua2Var, o30Var, 2), 3);
            default:
                b50 b50Var2 = b50.m;
                ca2.b(obj);
                return z71.H((a50) this.n, null, new sa2(ua2Var, o30Var, i2), 3);
        }
    }
}
