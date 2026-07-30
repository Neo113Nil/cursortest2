package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hz extends pr2 implements xt0 {
    public final /* synthetic */ y72 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz(y72 y72Var, o30 o30Var) {
        super(3, o30Var);
        this.m = y72Var;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        return new hz(this.m, (o30) obj3).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        b50 b50Var = b50.m;
        ca2.b(obj);
        this.m.m = true;
        return Unit.a;
    }
}
