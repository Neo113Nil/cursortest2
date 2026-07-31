package com.huawei.hms.utils;

import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class ResolutionFlagUtil {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ResolutionFlagUtil f14488a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, Long> f14489b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f14490c = new Object();

    private ResolutionFlagUtil() {
    }

    private void a() {
        long time = new Timestamp(System.currentTimeMillis()).getTime() - 10800000;
        for (String str : f14489b.keySet()) {
            Map<String, Long> map = f14489b;
            Long l4 = map.get(str);
            if (l4 == null || l4.longValue() == 0) {
                map.remove(str);
                HMSLog.i("ResolutionFlagUtil", "remove resolution flag because the data in this pair was abnormal: " + str);
            } else if (time >= l4.longValue()) {
                map.remove(str);
                HMSLog.i("ResolutionFlagUtil", "remove resolution flag because aging time: " + str);
            }
        }
    }

    public static ResolutionFlagUtil getInstance() {
        if (f14488a != null) {
            return f14488a;
        }
        synchronized (f14490c) {
            try {
                if (f14488a == null) {
                    f14488a = new ResolutionFlagUtil();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f14488a;
    }

    public long getResolutionFlag(String str) {
        if (str == null) {
            HMSLog.e("ResolutionFlagUtil", "transactionId is null");
            return 0L;
        }
        Map<String, Long> map = f14489b;
        if (map.get(str) != null) {
            return map.get(str).longValue();
        }
        return 0L;
    }

    public void removeResolutionFlag(String str) {
        if (str == null) {
            HMSLog.e("ResolutionFlagUtil", "transactionId is null");
        } else {
            f14489b.remove(str);
            HMSLog.i("ResolutionFlagUtil", "remove resolution flag");
        }
    }

    public void saveResolutionFlag(String str, long j4) {
        if (!TextUtils.isEmpty(str) && j4 != 0) {
            a(str, j4);
            return;
        }
        HMSLog.e("ResolutionFlagUtil", "saveResolutionFlag error, transactionId: " + str + ", timestamp: " + j4);
    }

    private void a(String str, long j4) {
        Map<String, Long> map = f14489b;
        synchronized (map) {
            a();
            map.put(str, Long.valueOf(j4));
            HMSLog.i("ResolutionFlagUtil", "save resolution flag");
        }
    }
}
