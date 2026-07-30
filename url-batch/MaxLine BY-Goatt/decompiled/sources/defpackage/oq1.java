package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oq1 extends o81 implements Function2 {
    public final /* synthetic */ jq1 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Function2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq1(jq1 jq1Var, boolean z, boolean z2, Function2 function2) {
        super(2);
        this.m = jq1Var;
        this.n = z;
        this.o = z2;
        this.p = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a00 a00Var = (a00) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            pw2 a = n13.a(11, a00Var);
            boolean z = this.o;
            jq1 jq1Var = this.m;
            yj1.f(((aw) ml2.a(!z ? jq1Var.g : this.n ? jq1Var.b : jq1Var.e, bd3.P(100, 6, null), a00Var).getValue()).a, a, this.p, a00Var, 0);
        }
        return Unit.a;
    }
}
