package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFf1hSDK extends AFf1nSDK {
    private final AFc1zSDK valueOf;

    public AFf1hSDK(Runnable runnable, AFc1zSDK aFc1zSDK) {
        super("store", "samsung", runnable);
        this.valueOf = aFc1zSDK;
    }

    @Override // com.appsflyer.internal.AFf1jSDK
    public final void AFKeystoreWrapper(Context context) {
        values(this.valueOf.AFKeystoreWrapper(), new AFb1qSDK<Map<String, Object>>(context, this.valueOf, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFf1hSDK.4
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00be, code lost:
            
                if (r3 != null) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00d8, code lost:
            
                r0 = ((android.content.pm.PackageItemInfo) r10.AFInAppEventType.getPackageManager().resolveContentProvider(r10.AFInAppEventParameterName, 128)).packageName;
                r10.valueOf.AFKeystoreWrapper.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFa1cSDK.valueOf(r10.AFInAppEventType, r0)));
                r10.valueOf.AFKeystoreWrapper.put("api_ver_name", com.appsflyer.internal.AFa1cSDK.AFInAppEventParameterName(r10.AFInAppEventType, r0));
                r10.valueOf.AFInAppEventType();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0113, code lost:
            
                return r10.valueOf.AFKeystoreWrapper;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00d5, code lost:
            
                r3.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
            
                if (0 == 0) goto L25;
             */
            @Override // com.appsflyer.internal.AFb1qSDK
            /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> AFInAppEventType() {
                String string;
                Cursor cursor = null;
                try {
                    try {
                        cursor = this.AFInAppEventType.getContentResolver().query(Uri.parse(new StringBuilder("content://").append(this.AFInAppEventParameterName).toString()), null, null, null, null);
                        if (cursor != null) {
                            if (!cursor.moveToFirst()) {
                                AFf1hSDK.this.AFKeystoreWrapper.put("response", "FEATURE_NOT_SUPPORTED");
                            } else {
                                AFf1hSDK.this.AFKeystoreWrapper.put("response", "OK");
                                AFKeystoreWrapper("referrer", AFf1hSDK.this.AFKeystoreWrapper, cursor);
                                values("click_ts", AFf1hSDK.this.AFKeystoreWrapper, cursor);
                                values("install_begin_ts", AFf1hSDK.this.AFKeystoreWrapper, cursor);
                                values("install_end_ts", AFf1hSDK.this.AFKeystoreWrapper, cursor);
                                AFKeystoreWrapper("organic_keywords", AFf1hSDK.this.AFKeystoreWrapper, cursor);
                                AFKeystoreWrapper("attr_type", AFf1hSDK.this.AFKeystoreWrapper, cursor);
                                HashMap hashMap = new HashMap();
                                int columnIndex = cursor.getColumnIndex("instant");
                                if (columnIndex != -1 && (string = cursor.getString(columnIndex)) != null) {
                                    hashMap.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                                }
                                values("click_server_ts", hashMap, cursor);
                                values("install_begin_server_ts", hashMap, cursor);
                                AFKeystoreWrapper("install_version", hashMap, cursor);
                                if (!hashMap.isEmpty()) {
                                    AFf1hSDK.this.AFKeystoreWrapper.put("custom", hashMap);
                                }
                            }
                        } else {
                            AFf1hSDK.this.AFKeystoreWrapper.put("response", "SERVICE_UNAVAILABLE");
                        }
                    } catch (Exception e) {
                        AFf1hSDK.this.AFKeystoreWrapper.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e.getMessage(), e);
                    }
                } finally {
                }
            }

            private static void values(String str, Map<String, Object> map, Cursor cursor) {
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
