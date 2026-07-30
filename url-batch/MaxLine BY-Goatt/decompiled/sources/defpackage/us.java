package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class us implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ us(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.m = i2;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
        this.n = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        int i2 = this.n;
        Object obj3 = this.q;
        Object obj4 = this.p;
        Object obj5 = this.o;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                l41.a((String) obj5, (String) obj4, (Function0) obj3, (a00) obj, s03.R(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((my) obj5).e(obj4, obj3, (a00) obj, s03.R(i2) | 1);
                break;
            case 2:
                ((Integer) obj2).getClass();
                bd3.j((String) obj5, (vl1) obj4, (Function0) obj3, (a00) obj, s03.R(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                o70.g((id1) obj5, (ld1) obj4, (Function1) obj3, (a00) obj, s03.R(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((kd2) obj5).e(obj4, (my) obj3, (a00) obj, s03.R(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
