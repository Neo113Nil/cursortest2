package androidx.room;

import java.util.Map;
import java.util.concurrent.Callable;
import k2.AbstractC0546s;
import k2.AbstractC0552y;
import k2.Q;

/* loaded from: classes.dex */
public abstract class h {
    public static final Object a(s sVar, Callable callable, P1.d dVar) {
        if (sVar.isOpenInternal() && sVar.inTransaction()) {
            return callable.call();
        }
        if (dVar.getContext().k(y.f4115d) != null) {
            throw new ClassCastException();
        }
        Map<String, Object> backingFieldMap = sVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            obj = new Q(sVar.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        return AbstractC0552y.y((AbstractC0546s) obj, new f(callable, null), dVar);
    }

    public static final AbstractC0546s b(s sVar) {
        Map<String, Object> backingFieldMap = sVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            obj = new Q(sVar.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", obj);
        }
        return (AbstractC0546s) obj;
    }

    public static String c(String str, String str2) {
        Z1.i.f(str, "tableName");
        Z1.i.f(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }
}
