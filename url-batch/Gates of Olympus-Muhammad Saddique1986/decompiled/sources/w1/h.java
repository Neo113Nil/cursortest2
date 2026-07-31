package w1;

import com.gatesof.olympus.martu.marku.data.db.AppDatabase_Impl;
import h.ExecutorC0444a;
import java.util.Map;
import java.util.concurrent.Callable;
import q2.AbstractC0831s;
import q2.AbstractC0837y;
import q2.Q;

/* loaded from: classes.dex */
public abstract class h {
    public static final Object a(AppDatabase_Impl appDatabase_Impl, Callable callable, V1.d dVar) {
        if (appDatabase_Impl.j() && appDatabase_Impl.g().t().h()) {
            return callable.call();
        }
        if (dVar.t().v(AbstractC1176C.f9850d) != null) {
            throw new ClassCastException();
        }
        Map map = appDatabase_Impl.f9928j;
        Object obj = map.get("TransactionDispatcher");
        if (obj == null) {
            ExecutorC1177D executorC1177D = appDatabase_Impl.f9921c;
            if (executorC1177D == null) {
                f2.j.j("internalTransactionExecutor");
                throw null;
            }
            obj = new Q(executorC1177D);
            map.put("TransactionDispatcher", obj);
        }
        return AbstractC0837y.z((AbstractC0831s) obj, new f(callable, null), dVar);
    }

    public static final AbstractC0831s b(AppDatabase_Impl appDatabase_Impl) {
        Map map = appDatabase_Impl.f9928j;
        Object obj = map.get("QueryDispatcher");
        if (obj == null) {
            ExecutorC0444a executorC0444a = appDatabase_Impl.f9920b;
            if (executorC0444a == null) {
                f2.j.j("internalQueryExecutor");
                throw null;
            }
            obj = new Q(executorC0444a);
            map.put("QueryDispatcher", obj);
        }
        return (AbstractC0831s) obj;
    }

    public static String c(String str, String str2) {
        f2.j.f(str, "tableName");
        f2.j.f(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }
}
