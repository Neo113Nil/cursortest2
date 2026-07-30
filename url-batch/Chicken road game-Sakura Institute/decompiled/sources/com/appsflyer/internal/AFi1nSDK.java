package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1hSDK;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class AFi1nSDK extends AFi1rSDK {
    private final AFd1kSDK AFInAppEventType;
    private final AFi1mSDK valueOf;

    public AFi1nSDK(Runnable runnable, AFd1kSDK aFd1kSDK, AFi1mSDK aFi1mSDK) {
        super("store", "huawei", aFd1kSDK.AFInAppEventType(), runnable);
        this.AFInAppEventType = aFd1kSDK;
        this.valueOf = aFi1mSDK;
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void values(final Context context) {
        if (AFInAppEventType(context)) {
            this.AFInAppEventType.values().execute(new Runnable() { // from class: com.appsflyer.internal.AFi1nSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1nSDK.this.valueOf(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d9, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ff, code lost:
    
        values();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0102, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void valueOf(Context context) {
        this.e = System.currentTimeMillis();
        this.unregisterClient = AFi1hSDK.AFa1ySDK.STARTED;
        addObserver(new AFi1hSDK.AnonymousClass1());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFb1uSDK.values(context, str)));
        this.AFInAppEventParameterName.put("api_ver_name", AFb1uSDK.AFInAppEventType(context, str));
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursor != null) {
                if (!cursor.moveToFirst()) {
                    this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                } else {
                    this.AFInAppEventParameterName.put("response", "OK");
                    this.AFInAppEventParameterName.put("referrer", cursor.getString(0));
                    this.AFInAppEventParameterName.put("click_ts", Long.valueOf(cursor.getLong(1)));
                    this.AFInAppEventParameterName.put("install_end_ts", Long.valueOf(cursor.getLong(2)));
                    if (cursor.getColumnCount() > 3) {
                        this.AFInAppEventParameterName.put("install_begin_ts", Long.valueOf(cursor.getLong(3)));
                        HashMap hashMap = new HashMap();
                        String string = cursor.getString(4);
                        if (string != null) {
                            hashMap.put("track_id", string);
                        }
                        hashMap.put("referrer_ex", cursor.getString(5));
                        this.AFInAppEventParameterName.put("huawei_custom", hashMap);
                    }
                }
            } else {
                this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
            }
        } catch (Throwable th) {
            try {
                this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFg1aSDK.REFERRER, th.getMessage() != null ? th.getMessage() : "", th, false, true);
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        }
    }

    private boolean AFInAppEventType(Context context) {
        if (!valueOf()) {
            AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.valueOf.AFInAppEventParameterName(context)) {
            AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.valueOf.valueOf(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }
}
