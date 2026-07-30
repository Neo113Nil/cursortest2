package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1zSDK;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFj1sSDK extends AFi1bSDK {
    private final AFd1zSDK getMonetizationNetwork;

    public AFj1sSDK(Runnable runnable, AFd1zSDK aFd1zSDK) {
        super("store", "samsung", runnable);
        this.getMonetizationNetwork = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final void getMonetizationNetwork(Context context) {
        AFb1tSDK<Map<String, Object>> aFb1tSDK = new AFb1tSDK<Map<String, Object>>(context, this.getMonetizationNetwork.getCurrencyIso4217Code(), "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFj1sSDK.5
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00c3, code lost:
            
                if (r3 != null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
            
                r3.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x00dc, code lost:
            
                r0 = ((android.content.pm.PackageItemInfo) r10.getCurrencyIso4217Code.getPackageManager().resolveContentProvider(r10.getMonetizationNetwork, 128)).packageName;
                r10.AFAdRevenueData.getCurrencyIso4217Code.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFj1pSDK.getCurrencyIso4217Code(r10.getCurrencyIso4217Code, r0)));
                r10.AFAdRevenueData.getCurrencyIso4217Code.put("api_ver_name", com.appsflyer.internal.AFj1pSDK.getMonetizationNetwork(r10.getCurrencyIso4217Code, r0));
                r10.AFAdRevenueData.getCurrencyIso4217Code();
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0117, code lost:
            
                return r10.AFAdRevenueData.getCurrencyIso4217Code;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00d9, code lost:
            
                if (0 == 0) goto L26;
             */
            @Override // com.appsflyer.internal.AFb1tSDK
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> getMediationNetwork() {
                String string;
                Cursor cursor = null;
                try {
                    try {
                        ContentResolver contentResolver = this.getCurrencyIso4217Code.getContentResolver();
                        StringBuilder sb = new StringBuilder("content://");
                        sb.append(this.getMonetizationNetwork);
                        cursor = contentResolver.query(Uri.parse(sb.toString()), null, null, null, null);
                        if (cursor == null) {
                            AFj1sSDK.this.getCurrencyIso4217Code.put("response", "SERVICE_UNAVAILABLE");
                        } else if (cursor.moveToFirst()) {
                            AFj1sSDK.this.getCurrencyIso4217Code.put("response", "OK");
                            E_("referrer", AFj1sSDK.this.getCurrencyIso4217Code, cursor);
                            D_("click_ts", AFj1sSDK.this.getCurrencyIso4217Code, cursor);
                            D_("install_begin_ts", AFj1sSDK.this.getCurrencyIso4217Code, cursor);
                            D_("install_end_ts", AFj1sSDK.this.getCurrencyIso4217Code, cursor);
                            E_("organic_keywords", AFj1sSDK.this.getCurrencyIso4217Code, cursor);
                            E_("attr_type", AFj1sSDK.this.getCurrencyIso4217Code, cursor);
                            HashMap hashMap = new HashMap();
                            int columnIndex = cursor.getColumnIndex("instant");
                            if (columnIndex != -1 && (string = cursor.getString(columnIndex)) != null) {
                                hashMap.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                            }
                            D_("click_server_ts", hashMap, cursor);
                            D_("install_begin_server_ts", hashMap, cursor);
                            E_("install_version", hashMap, cursor);
                            if (!hashMap.isEmpty()) {
                                AFj1sSDK.this.getCurrencyIso4217Code.put(s3.c.PAYLOAD_OS_ROOT_CUSTOM, hashMap);
                            }
                        } else {
                            AFj1sSDK.this.getCurrencyIso4217Code.put("response", "FEATURE_NOT_SUPPORTED");
                        }
                    } catch (Exception e7) {
                        AFj1sSDK.this.getCurrencyIso4217Code.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e7.getMessage(), e7, false, true);
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
            }

            private static void D_(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j = cursor.getLong(columnIndex);
                if (j == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j));
            }

            private static void E_(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        };
        AFc1jSDK mediationNetwork = this.getMonetizationNetwork.getMediationNetwork();
        AFa1tSDK.getMediationNetwork();
        if (AFa1tSDK.getMediationNetwork(mediationNetwork, false) > 0 || !aFb1tSDK.getMonetizationNetwork()) {
            return;
        }
        aFb1tSDK.getRevenue.execute(aFb1tSDK.getMediationNetwork);
        this.areAllFieldsValid = System.currentTimeMillis();
        this.component2 = AFj1zSDK.AFa1ySDK.STARTED;
        addObserver(new AFj1zSDK.AnonymousClass3());
    }
}
