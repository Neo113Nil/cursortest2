package com.huawei.hms.api;

import com.huawei.hms.support.log.HMSLog;
import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class FailedBinderCallBack {
    private static final long AGING_TIME = 10000;
    public static final String CALLER_ID = "callId";
    private static final String TAG = "FailedBinderCallBack";
    private static FailedBinderCallBack instance;
    private static Map<Long, BinderCallBack> binderCallBackMap = new ConcurrentHashMap();
    private static final Object LOCK_OBJECT = new Object();

    public interface BinderCallBack {
        void binderCallBack(int i4);
    }

    private FailedBinderCallBack() {
    }

    private void agingCheck() {
        long time = new Timestamp(System.currentTimeMillis()).getTime() - 10000;
        for (Long l4 : binderCallBackMap.keySet()) {
            if (time >= l4.longValue()) {
                binderCallBackMap.remove(l4);
            }
        }
    }

    public static FailedBinderCallBack getInstance() {
        synchronized (LOCK_OBJECT) {
            try {
                if (instance == null) {
                    instance = new FailedBinderCallBack();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return instance;
    }

    private void putCallBackInMap(Long l4, BinderCallBack binderCallBack) {
        if (binderCallBackMap == null) {
            HMSLog.e(TAG, "binderCallBackMap is null");
        } else {
            agingCheck();
            binderCallBackMap.put(l4, binderCallBack);
        }
    }

    public BinderCallBack getCallBack(Long l4) {
        Map<Long, BinderCallBack> map = binderCallBackMap;
        if (map != null) {
            return map.remove(l4);
        }
        HMSLog.e(TAG, "binderCallBackMap is null");
        return null;
    }

    public void setCallBack(Long l4, BinderCallBack binderCallBack) {
        putCallBackInMap(l4, binderCallBack);
    }
}
