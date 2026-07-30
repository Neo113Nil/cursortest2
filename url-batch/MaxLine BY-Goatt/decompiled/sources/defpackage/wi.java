package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class wi implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ wi(String str, String str2, vl1 vl1Var, Function0 function0, int i) {
        this.m = 1;
        this.p = str;
        this.q = str2;
        this.n = vl1Var;
        this.r = function0;
        this.o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        Object obj3 = this.p;
        int i2 = this.o;
        Object obj4 = this.r;
        Object obj5 = this.q;
        Object obj6 = this.n;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                yj1.c((vl1) obj6, (kj) obj3, (f6) obj5, (q20) obj4, (a00) obj, s03.R(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                bd3.g((String) obj3, (String) obj5, (vl1) obj6, (Function0) obj4, (a00) obj, s03.R(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int R = s03.R(i2 | 1);
                Object obj7 = this.p;
                o70.f((Boolean) obj6, obj7, (id1) obj5, (Function1) obj4, (a00) obj, R);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ wi(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.m = i2;
        this.n = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
        this.o = i;
    }
}
