package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AFi1tSDK extends AFh1aSDK {
    private final AFd1mSDK valueOf;

    public AFi1tSDK(Runnable runnable, AFd1mSDK aFd1mSDK) {
        super("store", "samsung", runnable);
        this.valueOf = aFd1mSDK;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final void AFInAppEventType(Context context) {
        AFInAppEventParameterName(this.valueOf.valueOf(), new AFc1aSDK<Map<String, Object>>(context, this.valueOf, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFi1tSDK.1
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00be, code lost:
            
                if (r3 != null) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00da, code lost:
            
                r0 = ((android.content.pm.PackageItemInfo) r10.AFInAppEventType.getPackageManager().resolveContentProvider(r10.values, 128)).packageName;
                r10.valueOf.values.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFb1rSDK.AFKeystoreWrapper(r10.AFInAppEventType, r0)));
                r10.valueOf.values.put("api_ver_name", com.appsflyer.internal.AFb1rSDK.AFInAppEventType(r10.AFInAppEventType, r0));
                r10.valueOf.AFKeystoreWrapper();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0115, code lost:
            
                return r10.valueOf.values;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00d7, code lost:
            
                r3.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
            
                if (0 == 0) goto L25;
             */
            @Override // com.appsflyer.internal.AFc1aSDK
            /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> valueOf() {
                String string;
                Cursor cursor = null;
                try {
                    try {
                        cursor = this.AFInAppEventType.getContentResolver().query(Uri.parse(new StringBuilder("content://").append(this.values).toString()), null, null, null, null);
                        if (cursor != null) {
                            if (!cursor.moveToFirst()) {
                                AFi1tSDK.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                            } else {
                                AFi1tSDK.this.values.put("response", "OK");
                                AFKeystoreWrapper("referrer", AFi1tSDK.this.values, cursor);
                                AFInAppEventType("click_ts", AFi1tSDK.this.values, cursor);
                                AFInAppEventType("install_begin_ts", AFi1tSDK.this.values, cursor);
                                AFInAppEventType("install_end_ts", AFi1tSDK.this.values, cursor);
                                AFKeystoreWrapper("organic_keywords", AFi1tSDK.this.values, cursor);
                                AFKeystoreWrapper("attr_type", AFi1tSDK.this.values, cursor);
                                HashMap hashMap = new HashMap();
                                int columnIndex = cursor.getColumnIndex("instant");
                                if (columnIndex != -1 && (string = cursor.getString(columnIndex)) != null) {
                                    hashMap.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                                }
                                AFInAppEventType("click_server_ts", hashMap, cursor);
                                AFInAppEventType("install_begin_server_ts", hashMap, cursor);
                                AFKeystoreWrapper("install_version", hashMap, cursor);
                                if (!hashMap.isEmpty()) {
                                    AFi1tSDK.this.values.put("custom", hashMap);
                                }
                            }
                        } else {
                            AFi1tSDK.this.values.put("response", "SERVICE_UNAVAILABLE");
                        }
                    } catch (Exception e) {
                        AFi1tSDK.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e.getMessage(), e, false, true);
                    }
                } finally {
                }
            }

            private static void AFInAppEventType(String str, Map<String, Object> map, Cursor cursor) {
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

            private static void AFKeystoreWrapper(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        });
    }
}
