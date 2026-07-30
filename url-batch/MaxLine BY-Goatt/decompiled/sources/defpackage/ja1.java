package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ja1 extends o81 implements xt0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ ob1 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja1(ob1 ob1Var, long j, int i, int i2, int i3) {
        super(3);
        this.m = i3;
        this.n = ob1Var;
        this.o = j;
        this.p = i;
        this.q = i2;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.m;
        int i2 = this.q;
        int i3 = this.p;
        long j = this.o;
        ob1 ob1Var = this.n;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                int g = v10.g(j, intValue + i3);
                int f = v10.f(j, intValue2 + i2);
                Map c = mi1.c();
                return ob1Var.n.G(g, f, c, (Function1) obj3);
            default:
                int intValue3 = ((Number) obj).intValue();
                int intValue4 = ((Number) obj2).intValue();
                int g2 = v10.g(j, intValue3 + i3);
                int f2 = v10.f(j, intValue4 + i2);
                Map c2 = mi1.c();
                return ob1Var.n.G(g2, f2, c2, (Function1) obj3);
        }
    }
}
