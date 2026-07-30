package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ic extends pr2 implements Function1 {
    public final /* synthetic */ jc m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(jc jcVar, Object obj, o30 o30Var) {
        super(1, o30Var);
        this.m = jcVar;
        this.n = obj;
    }

    @Override // defpackage.hn
    public final o30 create(o30 o30Var) {
        return new ic(this.m, this.n, o30Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ic) create((o30) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        b50 b50Var = b50.m;
        ca2.b(obj);
        jc jcVar = this.m;
        jc.b(jcVar);
        Object a = jc.a(jcVar, this.n);
        jcVar.c.n.setValue(a);
        jcVar.e.setValue(a);
        return Unit.a;
    }
}
