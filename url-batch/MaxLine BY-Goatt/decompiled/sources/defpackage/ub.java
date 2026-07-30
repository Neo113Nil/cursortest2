package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ub extends pr2 implements Function2 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ub(int i, o30 o30Var, int i2) {
        super(i, o30Var);
        this.m = i2;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        switch (this.m) {
            case 0:
                return new ub(2, o30Var, 0);
            case 1:
                return new ub(2, o30Var, 1);
            case 2:
                return new ub(2, o30Var, 2);
            default:
                return new ub(2, o30Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                return ((ub) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((ub) create((xm0) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((ub) create((ym0) obj, (o30) obj2)).invokeSuspend(Unit.a);
            default:
                return ((ub) create((x22) obj, (o30) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        switch (this.m) {
            case 0:
                b50 b50Var = b50.m;
                ca2.b(obj);
                break;
            case 1:
                b50 b50Var2 = b50.m;
                ca2.b(obj);
                break;
            case 2:
                b50 b50Var3 = b50.m;
                ca2.b(obj);
                break;
            default:
                b50 b50Var4 = b50.m;
                ca2.b(obj);
                break;
        }
        return Unit.a;
    }
}
