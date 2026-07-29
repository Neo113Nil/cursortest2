package com.xsj.crasheye;

import java.util.HashMap;

/* loaded from: classes2.dex */
public class TransactionsDatabase extends HashMap<String, Container> {
    protected static final String TransName = "TStart:name:";
    private static final long serialVersionUID = -3516111185615801729L;

    public synchronized boolean addStartedTransaction(ActionTransactionStart actionTransactionStart) {
        if (actionTransactionStart == null) {
            return false;
        }
        try {
            put(TransName + actionTransactionStart.name, new Container(actionTransactionStart.timestampMilis, actionTransactionStart.transaction_id));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public synchronized boolean closeStartedTransaction(String str) {
        if (str == null) {
            return false;
        }
        if (!containsKey(TransName + str)) {
            return false;
        }
        put(TransName + str, new Container(-1L, null));
        return true;
    }

    public synchronized Container getStartedTransactionContainer(String str) {
        if (str == null) {
            return null;
        }
        if (!containsKey(TransName + str)) {
            return null;
        }
        return get(TransName + str);
    }

    public class Container {
        public Long timestamp;
        public String transid;

        public Container(Long l, String str) {
            this.timestamp = l;
            this.transid = str;
        }
    }
}
