package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qd0 extends pr2 implements xt0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd0(int i, o30 o30Var, int i2) {
        super(i, o30Var);
        this.m = i2;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.m) {
            case 0:
                long j = ((au1) obj2).a;
                return new qd0(3, (o30) obj3, 0).invokeSuspend(Unit.a);
            case 1:
                ((Number) obj2).floatValue();
                return new qd0(3, (o30) obj3, 1).invokeSuspend(Unit.a);
            default:
                long j2 = ((au1) obj2).a;
                return new qd0(3, (o30) obj3, 2).invokeSuspend(Unit.a);
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
            default:
                b50 b50Var3 = b50.m;
                ca2.b(obj);
                break;
        }
        return Unit.a;
    }
}
