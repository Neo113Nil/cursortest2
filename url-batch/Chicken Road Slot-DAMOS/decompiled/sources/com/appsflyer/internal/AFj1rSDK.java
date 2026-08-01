package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.internal.AFj1tSDK;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFj1rSDK extends AFi1cSDK {
    private final ExecutorService getMonetizationNetwork;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFj1rSDK(ExecutorService executorService, AFc1oSDK aFc1oSDK, Runnable runnable) {
        super("preload", "samsung", aFc1oSDK, runnable);
        executorService.getClass();
        aFc1oSDK.getClass();
        runnable.getClass();
        this.getMonetizationNetwork = executorService;
    }

    private static boolean C_(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("RESULT");
        if (columnIndex != -1) {
            return Boolean.parseBoolean(cursor.getString(columnIndex));
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
        return false;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null;
    }

    private final boolean getMediationNetwork(Context context) {
        if (!getRevenue()) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0118, code lost:
    
        if (r3 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0103, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0101, code lost:
    
        if (r3 != null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getRevenue(AFj1rSDK aFj1rSDK, Context context) {
        Throwable th;
        ContentProviderClient contentProviderClient;
        Cursor query;
        Date monetizationNetwork;
        aFj1rSDK.getClass();
        context.getClass();
        aFj1rSDK.component1 = System.currentTimeMillis();
        aFj1rSDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        aFj1rSDK.addObserver(new AFj1tSDK.AnonymousClass1());
        Cursor cursor = null;
        r1 = null;
        Long l10 = null;
        cursor = null;
        try {
            Uri parse = Uri.parse("content://com.samsung.android.mapsagent.providers.apptracking/info");
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(parse);
            if (acquireUnstableContentProviderClient != null) {
                try {
                    query = acquireUnstableContentProviderClient.query(parse, null, context.getPackageName(), new String[]{"appsflyer001"}, null);
                } catch (Throwable th2) {
                    th = th2;
                    contentProviderClient = acquireUnstableContentProviderClient;
                    try {
                        AFLogger.INSTANCE.e(AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                        }
                        aFj1rSDK.getMediationNetwork();
                        return;
                    } finally {
                    }
                }
            } else {
                query = null;
            }
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        if (C_(query)) {
                            String P_ = AFj1eSDK.P_(query, "INSTALLED_TIME_TEXT");
                            if (P_ != null && (monetizationNetwork = AFj1jSDK.getMonetizationNetwork(P_, "yy:MM:dd:hh:mm")) != null) {
                                l10 = Long.valueOf(monetizationNetwork.getTime() / 1000);
                            }
                            if (l10 != null) {
                                long longValue = l10.longValue();
                                Map<String, Object> map = aFj1rSDK.getMediationNetwork;
                                map.getClass();
                                map.put("install_begin_ts", Long.valueOf(longValue));
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            String P_2 = AFj1eSDK.P_(query, "MAPS_ID");
                            if (P_2 != null) {
                                linkedHashMap.put("maps_id", P_2);
                            }
                            String P_3 = AFj1eSDK.P_(query, "DEVICE_NAME");
                            if (P_3 != null) {
                                linkedHashMap.put("device_model", P_3);
                            }
                            String P_4 = AFj1eSDK.P_(query, "COUNTRY");
                            if (P_4 != null) {
                                linkedHashMap.put(AdRevenueScheme.COUNTRY, P_4);
                            }
                            String P_5 = AFj1eSDK.P_(query, "CAMPAIGN_ID");
                            if (P_5 != null) {
                                linkedHashMap.put("campaign_id", P_5);
                            }
                            if (!linkedHashMap.isEmpty()) {
                                Map<String, Object> map2 = aFj1rSDK.getMediationNetwork;
                                map2.getClass();
                                map2.put("samsung_custom", linkedHashMap);
                            }
                            Map<String, Object> map3 = aFj1rSDK.getMediationNetwork;
                            map3.getClass();
                            map3.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, "com.samsung.android.mapsagent")));
                            Map<String, Object> map4 = aFj1rSDK.getMediationNetwork;
                            map4.getClass();
                            map4.put("api_ver_name", AFj1kSDK.getRevenue(context, "com.samsung.android.mapsagent"));
                        } else {
                            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "App was not installed via Samsung MAPS.", false, 4, null);
                        }
                        query.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = query;
                    contentProviderClient = acquireUnstableContentProviderClient;
                    AFLogger.INSTANCE.e(AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
                    if (cursor != null) {
                    }
                    if (contentProviderClient != null) {
                    }
                    aFj1rSDK.getMediationNetwork();
                    return;
                }
            }
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
            if (query != null) {
                query.close();
            }
        } catch (Throwable th4) {
            th = th4;
            contentProviderClient = null;
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(Context context) {
        context.getClass();
        if (getMediationNetwork(context)) {
            this.getMonetizationNetwork.execute(new g(3, this, context));
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void AFAdRevenueData() {
    }
}
