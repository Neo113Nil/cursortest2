package com.huawei.hms.framework.network.grs;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f14191a = new ConcurrentHashMap(16);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f14192b = new Object();

    public static a a(GrsBaseInfo grsBaseInfo, Context context) {
        a aVar;
        synchronized (f14192b) {
            try {
                int uniqueCode = grsBaseInfo.uniqueCode();
                Map map = f14191a;
                aVar = (a) map.get(context.getPackageName() + uniqueCode);
                if (aVar == null) {
                    Logger.i("GrsClientManager", "grsClientImpl == null, and new GrsClientImpl");
                    aVar = new a(context, grsBaseInfo);
                    map.put(context.getPackageName() + uniqueCode, aVar);
                } else if (!aVar.o(new a(grsBaseInfo))) {
                    Logger.i("GrsClientManager", "The app_name, ser_country, reg_country and issue_country is equal, but other not.");
                    aVar = new a(context, grsBaseInfo);
                    map.put(context.getPackageName() + uniqueCode, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }
}
