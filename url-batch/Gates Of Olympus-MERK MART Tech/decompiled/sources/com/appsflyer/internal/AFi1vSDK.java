package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AFi1vSDK extends AFh1aSDK {
    private final AFd1mSDK valueOf;

    public AFi1vSDK(Runnable runnable, AFd1mSDK aFd1mSDK) {
        super("store", "huawei", runnable);
        this.valueOf = aFd1mSDK;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final void AFInAppEventType(Context context) {
        AFInAppEventParameterName(this.valueOf.valueOf(), new AFc1aSDK<Map<String, Object>>(context, this.valueOf, "com.huawei.appmarket.commondata", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F") { // from class: com.appsflyer.internal.AFi1vSDK.2
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x00fa, code lost:
            
                if (r5 != null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0114, code lost:
            
                r12.valueOf.AFKeystoreWrapper();
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x011d, code lost:
            
                return r12.valueOf.values;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0111, code lost:
            
                r5.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x010f, code lost:
            
                if (0 == 0) goto L23;
             */
            @Override // com.appsflyer.internal.AFc1aSDK
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> valueOf() {
                String str = ((PackageItemInfo) this.AFInAppEventType.getPackageManager().resolveContentProvider(this.values, 128)).packageName;
                AFi1vSDK.this.values.put("api_ver", Long.valueOf(AFb1rSDK.AFKeystoreWrapper(this.AFInAppEventType, str)));
                AFi1vSDK.this.values.put("api_ver_name", AFb1rSDK.AFInAppEventType(this.AFInAppEventType, str));
                Cursor cursor = null;
                try {
                    try {
                        cursor = this.AFInAppEventType.getContentResolver().query(Uri.parse(new StringBuilder("content://").append(this.values).append("/item/5").toString()), null, null, new String[]{this.AFInAppEventType.getPackageName()}, null);
                        if (cursor != null) {
                            if (!cursor.moveToFirst()) {
                                AFi1vSDK.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                            } else {
                                AFi1vSDK.this.values.put("response", "OK");
                                AFi1vSDK.this.values.put("referrer", cursor.getString(0));
                                AFi1vSDK.this.values.put("click_ts", Long.valueOf(cursor.getLong(1)));
                                AFi1vSDK.this.values.put("install_end_ts", Long.valueOf(cursor.getLong(2)));
                                if (cursor.getColumnCount() > 3) {
                                    AFi1vSDK.this.values.put("install_begin_ts", Long.valueOf(cursor.getLong(3)));
                                    HashMap hashMap = new HashMap();
                                    String string = cursor.getString(4);
                                    if (string != null) {
                                        hashMap.put("track_id", string);
                                    }
                                    hashMap.put("referrer_ex", cursor.getString(5));
                                    AFi1vSDK.this.values.put("huawei_custom", hashMap);
                                }
                            }
                        } else {
                            AFi1vSDK.this.values.put("response", "SERVICE_UNAVAILABLE");
                        }
                    } catch (Exception e) {
                        AFi1vSDK.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e.getMessage(), e, false, true);
                    }
                } finally {
                }
            }
        });
    }
}
