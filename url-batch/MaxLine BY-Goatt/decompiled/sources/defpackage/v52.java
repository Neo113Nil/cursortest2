package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v52 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ long n;
    public final /* synthetic */ pw2 o;
    public final /* synthetic */ Function2 p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v52(long j, pw2 pw2Var, Function2 function2, int i, int i2) {
        super(2);
        this.m = i2;
        this.n = j;
        this.o = pw2Var;
        this.p = function2;
        this.q = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        int i2 = this.q;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                yj1.f(this.n, this.o, this.p, (a00) obj, s03.R(i2 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                pu2.b(this.n, this.o, this.p, (a00) obj, s03.R(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
