package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class u60 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u60(int i, o30 o30Var, int i2) {
        super(i, o30Var);
        this.m = i2;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        switch (this.m) {
            case 0:
                u60 u60Var = new u60(2, o30Var, 0);
                u60Var.n = obj;
                return u60Var;
            case 1:
                u60 u60Var2 = new u60(2, o30Var, 1);
                u60Var2.n = obj;
                return u60Var2;
            default:
                u60 u60Var3 = new u60(2, o30Var, 2);
                u60Var3.n = obj;
                return u60Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                return ((u60) create((qo2) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((u60) create((o72) obj, (o30) obj2)).invokeSuspend(Unit.a);
            default:
                return ((u60) create((al2) obj, (o30) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        switch (this.m) {
            case 0:
                b50 b50Var = b50.m;
                ca2.b(obj);
                return Boolean.valueOf(!(((qo2) this.n) instanceof zl0));
            case 1:
                b50 b50Var2 = b50.m;
                ca2.b(obj);
                return Boolean.valueOf(((o72) this.n) == o72.m);
            default:
                b50 b50Var3 = b50.m;
                ca2.b(obj);
                return Boolean.valueOf(((al2) this.n) != al2.m);
        }
    }
}
