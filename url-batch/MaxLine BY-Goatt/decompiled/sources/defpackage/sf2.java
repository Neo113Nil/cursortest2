package defpackage;

import androidx.compose.foundation.gestures.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sf2 extends pr2 implements Function2 {
    public int m;
    public final /* synthetic */ tf2 n;
    public final /* synthetic */ float o;
    public final /* synthetic */ float p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf2(tf2 tf2Var, float f, float f2, o30 o30Var) {
        super(2, o30Var);
        this.n = tf2Var;
        this.o = f;
        this.p = f2;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        return new sf2(this.n, this.o, this.p, o30Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sf2) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        b50 b50Var = b50.m;
        int i = this.m;
        if (i == 0) {
            ca2.b(obj);
            cg2 cg2Var = this.n.P;
            long i2 = ap.i(this.o, this.p);
            this.m = 1;
            if (a.a(cg2Var, i2, this) == b50Var) {
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
