package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x51 extends pr2 implements Function1 {
    public int m;
    public final /* synthetic */ z51 n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x51(z51 z51Var, long j, o30 o30Var) {
        super(1, o30Var);
        this.n = z51Var;
        this.o = j;
    }

    @Override // defpackage.hn
    public final o30 create(o30 o30Var) {
        return new x51(this.n, this.o, o30Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((x51) create((o30) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        b50 b50Var = b50.m;
        int i = this.m;
        if (i == 0) {
            ca2.b(obj);
            this.m = 1;
            z51 z51Var = this.n;
            z51Var.getClass();
            if (z51.a(z51Var, this.o, this) == b50Var) {
                return b50Var;
            }
        } else {
            if (i != 1) {
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ca2.b(obj);
        }
        return Unit.a;
    }
}
