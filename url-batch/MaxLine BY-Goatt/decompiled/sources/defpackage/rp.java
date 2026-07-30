package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rp extends pr2 implements Function2 {
    public /* synthetic */ Object m;
    public final /* synthetic */ sp n;
    public final /* synthetic */ ks1 o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ bn q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp(sp spVar, ks1 ks1Var, Function0 function0, bn bnVar, o30 o30Var) {
        super(2, o30Var);
        this.n = spVar;
        this.o = ks1Var;
        this.p = function0;
        this.q = bnVar;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        rp rpVar = new rp(this.n, this.o, this.p, this.q, o30Var);
        rpVar.m = obj;
        return rpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rp) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        b50 b50Var = b50.m;
        ca2.b(obj);
        a50 a50Var = (a50) this.m;
        Function0 function0 = this.p;
        sp spVar = this.n;
        z71.H(a50Var, null, new ed(spVar, this.o, function0, null, 1), 3);
        return z71.H(a50Var, null, new v(spVar, this.q, null, 8), 3);
    }
}
