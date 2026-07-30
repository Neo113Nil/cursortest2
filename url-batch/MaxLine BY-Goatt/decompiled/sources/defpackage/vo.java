package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vo extends o81 implements Function1 {
    public final /* synthetic */ w72 m;
    public final /* synthetic */ c82 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ mo p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(w72 w72Var, c82 c82Var, long j, mo moVar) {
        super(1);
        this.m = w72Var;
        this.n = c82Var;
        this.o = j;
        this.p = moVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k91 k91Var = (k91) obj;
        k91Var.a();
        w72 w72Var = this.m;
        float f = w72Var.a;
        float f2 = w72Var.b;
        c82 c82Var = this.n;
        long j = this.o;
        mo moVar = this.p;
        ns nsVar = k91Var.m;
        ((ar0) nsVar.n.n).z(f, f2);
        try {
            yd0.S(k91Var, (y9) c82Var.m, j, 0L, 0.0f, moVar, 0, 890);
            ((ar0) nsVar.n.n).z(-f, -f2);
            return Unit.a;
        } catch (Throwable th) {
            ((ar0) nsVar.n.n).z(-f, -f2);
            throw th;
        }
    }
}
