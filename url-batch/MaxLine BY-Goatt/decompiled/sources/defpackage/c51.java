package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class c51 implements Function2 {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ Function0 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ c51(long j, Function0 function0, Function1 function1, Function1 function12, int i) {
        this.o = j;
        this.n = function0;
        this.p = function1;
        this.q = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        Object obj3 = this.q;
        Object obj4 = this.p;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int R = s03.R(1);
                o70.d(this.o, this.n, (Function1) obj4, (Function1) obj3, sl1.a, (a00) obj, R);
                break;
            default:
                ((Integer) obj2).getClass();
                int R2 = s03.R(24577);
                yi1.c((String) obj4, this.n, (vl1) obj3, this.o, (a00) obj, R2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ c51(String str, Function0 function0, vl1 vl1Var, long j, int i) {
        this.p = str;
        this.n = function0;
        this.q = vl1Var;
        this.o = j;
    }
}
