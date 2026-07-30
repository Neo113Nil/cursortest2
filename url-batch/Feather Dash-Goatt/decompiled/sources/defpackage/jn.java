package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class jn {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 8;
        byte b = 0;
        boolean booleanValue = ((Boolean) coroutineContext.p(bool, new e9(i, b))).booleanValue();
        boolean booleanValue2 = ((Boolean) coroutineContext2.p(bool, new e9(i, b))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return coroutineContext.i(coroutineContext2);
        }
        z11 z11Var = new z11();
        z11Var.d = coroutineContext2;
        g gVar = g.d;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.p(gVar, new e9(6, b));
        if (booleanValue2) {
            z11Var.d = ((CoroutineContext) z11Var.d).p(gVar, new e9(7, b));
        }
        return coroutineContext3.i((CoroutineContext) z11Var.d);
    }

    public static final CoroutineContext b(sn snVar, CoroutineContext coroutineContext) {
        CoroutineContext a = a(snVar.f(), coroutineContext, true);
        nq nqVar = ls.a;
        return (a == nqVar || a.d(d.f) != null) ? a : a.i(nqVar);
    }

    public static final zk1 c(dn dnVar, CoroutineContext coroutineContext, Object obj) {
        zk1 zk1Var = null;
        if ((dnVar instanceof un) && coroutineContext.d(al1.d) != null) {
            un unVar = (un) dnVar;
            while (true) {
                if ((unVar instanceof is) || (unVar = unVar.c()) == null) {
                    break;
                }
                if (unVar instanceof zk1) {
                    zk1Var = (zk1) unVar;
                    break;
                }
            }
            if (zk1Var != null) {
                zk1Var.t0(coroutineContext, obj);
            }
        }
        return zk1Var;
    }
}
