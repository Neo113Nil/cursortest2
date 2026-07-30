package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q30 implements Function1 {
    public final /* synthetic */ int m;
    public final Object n;
    public final Object o;

    public /* synthetic */ q30(int i, Object obj, Object obj2) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.m) {
            case 0:
                try {
                    ((t62) this.n).d();
                } catch (Throwable unused) {
                }
                return Unit.a;
            case 1:
                rm2 rm2Var = (rm2) obj;
                synchronized (tm2.c) {
                    j = tm2.e;
                    tm2.e = 1 + j;
                }
                return new yn1(j, rm2Var, (Function1) this.n, (Function1) this.o);
            default:
                w50 w50Var = (w50) this.n;
                Object obj2 = w50Var.b;
                fs fsVar = (fs) this.o;
                synchronized (obj2) {
                    ((ArrayList) w50Var.c).remove(fsVar);
                }
                return Unit.a;
        }
    }
}
