package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1hSDK;

/* loaded from: classes3.dex */
public final class AFi1iSDK extends AFi1hSDK {
    final ProviderInfo AFInAppEventType;
    private final AFd1kSDK valueOf;

    public AFi1iSDK(ProviderInfo providerInfo, Runnable runnable, AFd1kSDK aFd1kSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.valueOf = aFd1kSDK;
        this.AFInAppEventType = providerInfo;
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void values(final Context context) {
        this.valueOf.values().execute(new Runnable() { // from class: com.appsflyer.internal.AFi1iSDK.1
            /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x008b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                Cursor cursor;
                AFi1iSDK aFi1iSDK = AFi1iSDK.this;
                aFi1iSDK.e = System.currentTimeMillis();
                aFi1iSDK.unregisterClient = AFi1hSDK.AFa1ySDK.STARTED;
                aFi1iSDK.addObserver(new AFi1hSDK.AnonymousClass1());
                Uri parse = Uri.parse(new StringBuilder("content://").append(AFi1iSDK.this.AFInAppEventType.authority).append("/transaction_id").toString());
                ContentProviderClient AFInAppEventParameterName = AFi1iSDK.AFInAppEventParameterName(context, parse);
                if (AFInAppEventParameterName != null) {
                    try {
                        try {
                            try {
                                try {
                                    cursor = AFInAppEventParameterName.query(parse, null, new StringBuilder("app_id=").append(context.getPackageName()).toString(), null, null);
                                    AFInAppEventParameterName.close();
                                } catch (RemoteException e) {
                                    AFLogger.INSTANCE.e(AFg1aSDK.PREINSTALL, "Failed to query unstable content providerClient", e, false);
                                    AFInAppEventParameterName.close();
                                    cursor = null;
                                    if (cursor != null) {
                                    }
                                    AFi1iSDK.this.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFb1uSDK.values(context, ((PackageItemInfo) AFi1iSDK.this.AFInAppEventType).packageName)));
                                    AFi1iSDK.this.AFInAppEventParameterName.put("api_ver_name", AFb1uSDK.AFInAppEventType(context, ((PackageItemInfo) AFi1iSDK.this.AFInAppEventType).packageName));
                                    AFi1iSDK.this.values();
                                }
                            } catch (DeadObjectException e2) {
                                AFLogger.INSTANCE.e(AFg1aSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e2, false);
                                AFInAppEventParameterName.close();
                                cursor = null;
                                if (cursor != null) {
                                }
                                AFi1iSDK.this.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFb1uSDK.values(context, ((PackageItemInfo) AFi1iSDK.this.AFInAppEventType).packageName)));
                                AFi1iSDK.this.AFInAppEventParameterName.put("api_ver_name", AFb1uSDK.AFInAppEventType(context, ((PackageItemInfo) AFi1iSDK.this.AFInAppEventType).packageName));
                                AFi1iSDK.this.values();
                            }
                        } catch (Throwable th) {
                            AFLogger.INSTANCE.e(AFg1aSDK.PREINSTALL, "Error to get data from providerClient ", th, false);
                            AFInAppEventParameterName.close();
                            cursor = null;
                            if (cursor != null) {
                            }
                            AFi1iSDK.this.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFb1uSDK.values(context, ((PackageItemInfo) AFi1iSDK.this.AFInAppEventType).packageName)));
                            AFi1iSDK.this.AFInAppEventParameterName.put("api_ver_name", AFb1uSDK.AFInAppEventType(context, ((PackageItemInfo) AFi1iSDK.this.AFInAppEventType).packageName));
                            AFi1iSDK.this.values();
                        }
                        if (cursor != null) {
                            int columnIndex = cursor.getColumnIndex("transaction_id");
                            if (columnIndex != -1) {
                                AFi1iSDK.this.AFInAppEventParameterName.put("response", "OK");
                                if (cursor.moveToFirst()) {
                                    String string = cursor.getString(columnIndex);
                                    cursor.close();
                                    if (string != null && !string.isEmpty()) {
                                        AFi1iSDK.this.AFInAppEventParameterName.put("referrer", string);
                                    }
                                }
                            } else {
                                AFLogger.INSTANCE.w(AFg1aSDK.PREINSTALL, "Wrong column name");
                                AFi1iSDK.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                            cursor.close();
                        } else {
                            AFLogger.INSTANCE.w(AFg1aSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                            AFi1iSDK.this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
                        }
                        AFi1iSDK.this.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFb1uSDK.values(context, ((PackageItemInfo) AFi1iSDK.this.AFInAppEventType).packageName)));
                        AFi1iSDK.this.AFInAppEventParameterName.put("api_ver_name", AFb1uSDK.AFInAppEventType(context, ((PackageItemInfo) AFi1iSDK.this.AFInAppEventType).packageName));
                        AFi1iSDK.this.values();
                    } catch (Throwable th2) {
                        AFInAppEventParameterName.close();
                        throw th2;
                    }
                }
                cursor = null;
                if (cursor != null) {
                }
                AFi1iSDK.this.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFb1uSDK.values(context, ((PackageItemInfo) AFi1iSDK.this.AFInAppEventType).packageName)));
                AFi1iSDK.this.AFInAppEventParameterName.put("api_ver_name", AFb1uSDK.AFInAppEventType(context, ((PackageItemInfo) AFi1iSDK.this.AFInAppEventType).packageName));
                AFi1iSDK.this.values();
            }
        });
    }

    public static ContentProviderClient AFInAppEventParameterName(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e) {
            AFLogger.INSTANCE.e(AFg1aSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e, false);
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1aSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false);
            return null;
        }
    }
}
