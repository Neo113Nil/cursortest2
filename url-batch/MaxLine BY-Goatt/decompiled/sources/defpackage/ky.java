package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ky implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ ky(String str, my myVar, int i) {
        this.m = 3;
        this.p = str;
        this.o = myVar;
        this.n = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        int i2 = this.n;
        Object obj3 = this.o;
        Object obj4 = this.p;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((my) obj3).d(obj4, (a00) obj, s03.R(i2) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                yk3.a((ye) obj3, (Function2) obj4, (a00) obj, s03.R(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                yk3.c((ye[]) obj3, (Function2) obj4, (a00) obj, s03.R(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                zj2.b((String) obj4, (my) obj3, (a00) obj, s03.R(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ky(int i, int i2, Object obj, Object obj2) {
        this.m = i2;
        this.o = obj;
        this.p = obj2;
        this.n = i;
    }
}
