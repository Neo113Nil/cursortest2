package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFf1gSDK extends AFf1nSDK {
    private final AFc1zSDK valueOf;

    public AFf1gSDK(Runnable runnable, AFc1zSDK aFc1zSDK) {
        super("store", "huawei", runnable);
        this.valueOf = aFc1zSDK;
    }

    @Override // com.appsflyer.internal.AFf1jSDK
    public final void AFKeystoreWrapper(Context context) {
        values(this.valueOf.AFKeystoreWrapper(), new AFb1qSDK<Map<String, Object>>(context, this.valueOf, "com.huawei.appmarket.commondata", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F") { // from class: com.appsflyer.internal.AFf1gSDK.2
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x00fa, code lost:
            
                if (r3 != null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0114, code lost:
            
                r11.valueOf.AFInAppEventType();
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x011d, code lost:
            
                return r11.valueOf.AFKeystoreWrapper;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0111, code lost:
            
                r3.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x010f, code lost:
            
                if (0 == 0) goto L23;
             */
            @Override // com.appsflyer.internal.AFb1qSDK
            /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> AFInAppEventType() {
                String str = ((PackageItemInfo) this.AFInAppEventType.getPackageManager().resolveContentProvider(this.AFInAppEventParameterName, 128)).packageName;
                AFf1gSDK.this.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(this.AFInAppEventType, str)));
                AFf1gSDK.this.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(this.AFInAppEventType, str));
                Cursor cursor = null;
                try {
                    try {
                        cursor = this.AFInAppEventType.getContentResolver().query(Uri.parse(new StringBuilder("content://").append(this.AFInAppEventParameterName).append("/item/5").toString()), null, null, new String[]{this.AFInAppEventType.getPackageName()}, null);
                        if (cursor != null) {
                            if (!cursor.moveToFirst()) {
                                AFf1gSDK.this.AFKeystoreWrapper.put("response", "FEATURE_NOT_SUPPORTED");
                            } else {
                                AFf1gSDK.this.AFKeystoreWrapper.put("response", "OK");
                                AFf1gSDK.this.AFKeystoreWrapper.put("referrer", cursor.getString(0));
                                AFf1gSDK.this.AFKeystoreWrapper.put("click_ts", Long.valueOf(cursor.getLong(1)));
                                AFf1gSDK.this.AFKeystoreWrapper.put("install_end_ts", Long.valueOf(cursor.getLong(2)));
                                if (cursor.getColumnCount() > 3) {
                                    AFf1gSDK.this.AFKeystoreWrapper.put("install_begin_ts", Long.valueOf(cursor.getLong(3)));
                                    HashMap hashMap = new HashMap();
                                    String string = cursor.getString(4);
                                    if (string != null) {
                                        hashMap.put("track_id", string);
                                    }
                                    hashMap.put("referrer_ex", cursor.getString(5));
                                    AFf1gSDK.this.AFKeystoreWrapper.put("huawei_custom", hashMap);
                                }
                            }
                        } else {
                            AFf1gSDK.this.AFKeystoreWrapper.put("response", "SERVICE_UNAVAILABLE");
                        }
                    } catch (Exception e) {
                        AFf1gSDK.this.AFKeystoreWrapper.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e.getMessage(), e);
                    }
                } finally {
                }
            }
        });
    }
}
