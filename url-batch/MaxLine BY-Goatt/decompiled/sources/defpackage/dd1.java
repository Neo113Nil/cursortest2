package defpackage;

import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class dd1 implements fd1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Serializable o;
    public final /* synthetic */ Object p;

    public /* synthetic */ dd1(Object obj, Serializable serializable, Object obj2, int i) {
        this.m = i;
        this.n = obj;
        this.o = serializable;
        this.p = obj2;
    }

    @Override // defpackage.fd1
    public final void o(id1 id1Var, yc1 yc1Var) {
        int i = this.m;
        Object obj = this.p;
        Serializable serializable = this.o;
        Object obj2 = this.n;
        yc1 yc1Var2 = null;
        switch (i) {
            case 0:
                ld1 ld1Var = (ld1) obj2;
                c82 c82Var = (c82) serializable;
                Function1 function1 = (Function1) obj;
                int i2 = ed1.a[yc1Var.ordinal()];
                if (i2 == 1) {
                    c82Var.m = function1.invoke(ld1Var);
                    break;
                } else if (i2 == 2) {
                    y32 y32Var = (y32) c82Var.m;
                    if (y32Var != null) {
                        y32Var.a();
                    }
                    c82Var.m = null;
                    break;
                }
                break;
            default:
                jk1 jk1Var = (jk1) obj2;
                zc1 zc1Var = (zc1) serializable;
                al1 al1Var = (al1) obj;
                jk1Var.getClass();
                Runnable runnable = jk1Var.a;
                CopyOnWriteArrayList copyOnWriteArrayList = jk1Var.b;
                yc1.Companion.getClass();
                zc1Var.getClass();
                int ordinal = zc1Var.ordinal();
                if (yc1Var != (ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : yc1.ON_RESUME : yc1.ON_START : yc1.ON_CREATE)) {
                    yc1 yc1Var3 = yc1.ON_DESTROY;
                    if (yc1Var != yc1Var3) {
                        int ordinal2 = zc1Var.ordinal();
                        if (ordinal2 == 2) {
                            yc1Var2 = yc1Var3;
                        } else if (ordinal2 == 3) {
                            yc1Var2 = yc1.ON_STOP;
                        } else if (ordinal2 == 4) {
                            yc1Var2 = yc1.ON_PAUSE;
                        }
                        if (yc1Var == yc1Var2) {
                            copyOnWriteArrayList.remove(al1Var);
                            runnable.run();
                            break;
                        }
                    } else {
                        jk1Var.b(al1Var);
                        break;
                    }
                } else {
                    copyOnWriteArrayList.add(al1Var);
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
