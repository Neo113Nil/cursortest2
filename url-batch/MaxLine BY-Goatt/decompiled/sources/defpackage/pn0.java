package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pn0 extends pr2 implements Function2 {
    public /* synthetic */ int m;

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        pn0 pn0Var = new pn0(2, o30Var);
        pn0Var.m = ((Number) obj).intValue();
        return pn0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pn0) create(Integer.valueOf(((Number) obj).intValue()), (o30) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        b50 b50Var = b50.m;
        ca2.b(obj);
        return Boolean.valueOf(this.m > 0);
    }
}
