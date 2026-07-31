package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1qSDK;
import com.ironsource.b9;
import com.ironsource.ms;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFj1tSDK extends AFi1bSDK {
    private final AFc1dSDK getMediationNetwork;

    public AFj1tSDK(Runnable runnable, AFc1dSDK aFc1dSDK) {
        super(b9.h.f15461U, "samsung", runnable);
        this.getMediationNetwork = aFc1dSDK;
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getRevenue(Context context) {
        AFb1tSDK<Map<String, Object>> aFb1tSDK = new AFb1tSDK<Map<String, Object>>(context, this.getMediationNetwork.getMonetizationNetwork(), "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFj1tSDK.2
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00c3, code lost:
            
                if (r3 != null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
            
                r3.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x00dc, code lost:
            
                r0 = ((android.content.pm.PackageItemInfo) r10.getCurrencyIso4217Code.getPackageManager().resolveContentProvider(r10.getMediationNetwork, com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN)).packageName;
                r10.getMonetizationNetwork.AFAdRevenueData.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFj1iSDK.AFAdRevenueData(r10.getCurrencyIso4217Code, r0)));
                r10.getMonetizationNetwork.AFAdRevenueData.put("api_ver_name", com.appsflyer.internal.AFj1iSDK.getMediationNetwork(r10.getCurrencyIso4217Code, r0));
                r10.getMonetizationNetwork.getMediationNetwork();
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0117, code lost:
            
                return r10.getMonetizationNetwork.AFAdRevenueData;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00d9, code lost:
            
                if (0 == 0) goto L26;
             */
            @Override // com.appsflyer.internal.AFb1tSDK
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> getCurrencyIso4217Code() {
                String string;
                Cursor cursor = null;
                try {
                    try {
                        ContentResolver contentResolver = this.getCurrencyIso4217Code.getContentResolver();
                        StringBuilder sb = new StringBuilder("content://");
                        sb.append(this.getMediationNetwork);
                        cursor = contentResolver.query(Uri.parse(sb.toString()), null, null, null, null);
                        if (cursor == null) {
                            AFj1tSDK.this.AFAdRevenueData.put(ms.f18193n, "SERVICE_UNAVAILABLE");
                        } else if (cursor.moveToFirst()) {
                            AFj1tSDK.this.AFAdRevenueData.put(ms.f18193n, "OK");
                            E_("referrer", AFj1tSDK.this.AFAdRevenueData, cursor);
                            D_("click_ts", AFj1tSDK.this.AFAdRevenueData, cursor);
                            D_("install_begin_ts", AFj1tSDK.this.AFAdRevenueData, cursor);
                            D_("install_end_ts", AFj1tSDK.this.AFAdRevenueData, cursor);
                            E_("organic_keywords", AFj1tSDK.this.AFAdRevenueData, cursor);
                            E_("attr_type", AFj1tSDK.this.AFAdRevenueData, cursor);
                            HashMap hashMap = new HashMap();
                            int columnIndex = cursor.getColumnIndex("instant");
                            if (columnIndex != -1 && (string = cursor.getString(columnIndex)) != null) {
                                hashMap.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                            }
                            D_("click_server_ts", hashMap, cursor);
                            D_("install_begin_server_ts", hashMap, cursor);
                            E_("install_version", hashMap, cursor);
                            if (!hashMap.isEmpty()) {
                                AFj1tSDK.this.AFAdRevenueData.put("custom", hashMap);
                            }
                        } else {
                            AFj1tSDK.this.AFAdRevenueData.put(ms.f18193n, "FEATURE_NOT_SUPPORTED");
                        }
                    } catch (Exception e4) {
                        AFj1tSDK.this.AFAdRevenueData.put(ms.f18193n, "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e4.getMessage(), e4, false, true);
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
                long j4 = cursor.getLong(columnIndex);
                if (j4 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j4));
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
        AFc1qSDK component2 = this.getMediationNetwork.component2();
        if (((Integer) AFa1tSDK.getMonetizationNetwork(new Object[]{component2, Boolean.FALSE}, -1175980247, 1175980268, (int) System.currentTimeMillis())).intValue() > 0 || !aFb1tSDK.getMediationNetwork()) {
            return;
        }
        aFb1tSDK.getRevenue.execute(aFb1tSDK.AFAdRevenueData);
        this.component1 = System.currentTimeMillis();
        this.component4 = AFj1qSDK.AFa1ySDK.STARTED;
        addObserver(new AFj1qSDK.AnonymousClass5());
    }
}
