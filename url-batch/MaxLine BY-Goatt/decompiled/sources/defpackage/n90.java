package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class n90 {
    public static final Object a(long j, r30 r30Var) {
        if (j <= 0) {
            return Unit.a;
        }
        fs fsVar = new fs(1, q41.b(r30Var));
        fsVar.u();
        if (j < Long.MAX_VALUE) {
            b(fsVar.q).n(j, fsVar);
        }
        Object s = fsVar.s();
        return s == b50.m ? s : Unit.a;
    }

    public static final m90 b(CoroutineContext coroutineContext) {
        CoroutineContext.Element m = coroutineContext.m(e.d);
        m90 m90Var = m instanceof m90 ? (m90) m : null;
        return m90Var == null ? z70.a : m90Var;
    }
}
