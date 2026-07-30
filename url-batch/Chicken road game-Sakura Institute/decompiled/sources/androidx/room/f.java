package androidx.room;

import android.os.CancellationSignal;
import c7.g0;
import c7.g1;
import c7.m1;
import c7.s0;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [h6.i, h6.j] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static final Object a(u uVar, CancellationSignal cancellationSignal, Callable callable, h6.d dVar) {
        if (uVar.isOpenInternal() && uVar.inTransaction()) {
            return callable.call();
        }
        if (dVar.getContext().u(a0.f1064f) != null) {
            throw new ClassCastException();
        }
        c7.t c4 = c(uVar);
        c7.h hVar = new c7.h(1, a8.m.A(dVar));
        hVar.r();
        androidx.lifecycle.p pVar = new androidx.lifecycle.p(callable, hVar, 0 == true ? 1 : 0, 1);
        ?? r62 = 2 & 1;
        ?? r22 = h6.j.f4661f;
        if (r62 != 0) {
            c4 = r22;
        }
        c7.y yVar = (2 & 2) != 0 ? c7.y.f1756f : null;
        h6.i g9 = c7.a0.g(r22, c4, true);
        j7.e eVar = g0.f1696a;
        if (g9 != eVar && g9.u(h6.e.f4660f) == null) {
            g9 = g9.z(eVar);
        }
        c7.a g1Var = yVar == c7.y.f1757g ? new g1(g9, pVar) : new m1(g9, true);
        g1Var.f0(yVar, g1Var, pVar);
        hVar.t(new a0.y(cancellationSignal, 2, g1Var));
        return hVar.q();
    }

    public static final Object b(u uVar, Callable callable, h6.d dVar) {
        if (uVar.isOpenInternal() && uVar.inTransaction()) {
            return callable.call();
        }
        if (dVar.getContext().u(a0.f1064f) != null) {
            throw new ClassCastException();
        }
        Map<String, Object> backingFieldMap = uVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            obj = new s0(uVar.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        return c7.a0.x((c7.t) obj, new e(callable, null, 0), dVar);
    }

    public static final c7.t c(u uVar) {
        Map<String, Object> backingFieldMap = uVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            obj = new s0(uVar.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", obj);
        }
        return (c7.t) obj;
    }

    public static String d(String str, String str2) {
        r6.k.f(str, "tableName");
        r6.k.f(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }
}
