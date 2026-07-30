package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1hSDK;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AFi1bSDK extends AFi1kSDK {
    private final AFd1kSDK valueOf;

    public AFi1bSDK(Runnable runnable, AFd1kSDK aFd1kSDK) {
        super("store", "samsung", runnable);
        this.valueOf = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void values(Context context) {
        AFc1dSDK<Map<String, Object>> aFc1dSDK = new AFc1dSDK<Map<String, Object>>(context, this.valueOf, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFi1bSDK.2
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00be, code lost:
            
                if (r2 != null) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00d9, code lost:
            
                r0 = ((android.content.pm.PackageItemInfo) r10.valueOf.getPackageManager().resolveContentProvider(r10.AFKeystoreWrapper, 128)).packageName;
                r10.values.AFInAppEventParameterName.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFb1uSDK.values(r10.valueOf, r0)));
                r10.values.AFInAppEventParameterName.put("api_ver_name", com.appsflyer.internal.AFb1uSDK.AFInAppEventType(r10.valueOf, r0));
                r10.values.values();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0114, code lost:
            
                return r10.values.AFInAppEventParameterName;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00d6, code lost:
            
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
            
                if (0 == 0) goto L25;
             */
            @Override // com.appsflyer.internal.AFc1dSDK
            /* renamed from: values, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> AFKeystoreWrapper() {
                String string;
                Cursor cursor = null;
                try {
                    try {
                        cursor = this.valueOf.getContentResolver().query(Uri.parse(new StringBuilder("content://").append(this.AFKeystoreWrapper).toString()), null, null, null, null);
                        if (cursor != null) {
                            if (!cursor.moveToFirst()) {
                                AFi1bSDK.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                            } else {
                                AFi1bSDK.this.AFInAppEventParameterName.put("response", "OK");
                                AFInAppEventParameterName("referrer", AFi1bSDK.this.AFInAppEventParameterName, cursor);
                                AFKeystoreWrapper("click_ts", AFi1bSDK.this.AFInAppEventParameterName, cursor);
                                AFKeystoreWrapper("install_begin_ts", AFi1bSDK.this.AFInAppEventParameterName, cursor);
                                AFKeystoreWrapper("install_end_ts", AFi1bSDK.this.AFInAppEventParameterName, cursor);
                                AFInAppEventParameterName("organic_keywords", AFi1bSDK.this.AFInAppEventParameterName, cursor);
                                AFInAppEventParameterName("attr_type", AFi1bSDK.this.AFInAppEventParameterName, cursor);
                                HashMap hashMap = new HashMap();
                                int columnIndex = cursor.getColumnIndex("instant");
                                if (columnIndex != -1 && (string = cursor.getString(columnIndex)) != null) {
                                    hashMap.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                                }
                                AFKeystoreWrapper("click_server_ts", hashMap, cursor);
                                AFKeystoreWrapper("install_begin_server_ts", hashMap, cursor);
                                AFInAppEventParameterName("install_version", hashMap, cursor);
                                if (!hashMap.isEmpty()) {
                                    AFi1bSDK.this.AFInAppEventParameterName.put("custom", hashMap);
                                }
                            }
                        } else {
                            AFi1bSDK.this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
                        }
                    } catch (Exception e) {
                        AFi1bSDK.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e.getMessage(), e, false, true);
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
            }

            private static void AFKeystoreWrapper(String str, Map<String, Object> map, Cursor cursor) {
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

            private static void AFInAppEventParameterName(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        };
        AFd1qSDK valueOf = this.valueOf.valueOf();
        AFb1vSDK.AFKeystoreWrapper();
        if (AFb1vSDK.AFInAppEventType(valueOf, false) > 0 || !aFc1dSDK.AFInAppEventParameterName()) {
            return;
        }
        aFc1dSDK.AFInAppEventType.values().execute(aFc1dSDK.AFInAppEventParameterName);
        this.e = System.currentTimeMillis();
        this.unregisterClient = AFi1hSDK.AFa1ySDK.STARTED;
        addObserver(new AFi1hSDK.AnonymousClass1());
    }
}
