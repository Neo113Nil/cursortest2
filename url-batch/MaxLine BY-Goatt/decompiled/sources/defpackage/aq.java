package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class aq implements Function1 {
    public final /* synthetic */ zp m;
    public final /* synthetic */ bq n;
    public final /* synthetic */ a82 o;

    public aq(zp zpVar, bq bqVar, a82 a82Var) {
        this.m = zpVar;
        this.n = bqVar;
        this.o = a82Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        zp zpVar = this.m;
        zpVar.a = null;
        zpVar.b = null;
        al alVar = this.n.p;
        int i2 = this.o.m;
        do {
            i = alVar.get();
        } while (!alVar.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
        return Unit.a;
    }
}
