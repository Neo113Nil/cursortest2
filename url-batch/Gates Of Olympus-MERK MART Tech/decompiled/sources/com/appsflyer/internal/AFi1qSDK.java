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
import com.appsflyer.internal.AFi1pSDK;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes3.dex */
public final class AFi1qSDK extends AFi1pSDK {
    private final AFd1mSDK AFKeystoreWrapper;
    final ProviderInfo valueOf;

    public AFi1qSDK(ProviderInfo providerInfo, Runnable runnable, AFd1mSDK aFd1mSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.AFKeystoreWrapper = aFd1mSDK;
        this.valueOf = providerInfo;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final void AFInAppEventType(final Context context) {
        this.AFKeystoreWrapper.AFInAppEventParameterName().execute(new Runnable() { // from class: com.appsflyer.internal.AFi1qSDK.5
            /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x008b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                Cursor cursor;
                AFi1qSDK aFi1qSDK = AFi1qSDK.this;
                aFi1qSDK.AFLogger = System.currentTimeMillis();
                aFi1qSDK.registerClient = AFi1pSDK.AFa1tSDK.STARTED;
                aFi1qSDK.addObserver(new AFi1pSDK.AnonymousClass2());
                Uri parse = Uri.parse(new StringBuilder("content://").append(AFi1qSDK.this.valueOf.authority).append("/transaction_id").toString());
                ContentProviderClient AFInAppEventParameterName = AFi1qSDK.AFInAppEventParameterName(context, parse);
                if (AFInAppEventParameterName != null) {
                    try {
                        try {
                            try {
                                try {
                                    cursor = AFInAppEventParameterName.query(parse, null, new StringBuilder("app_id=").append(context.getPackageName()).toString(), null, null);
                                    AFInAppEventParameterName.close();
                                } catch (DeadObjectException e) {
                                    AFLogger.INSTANCE.e(AFg1jSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e, false);
                                    AFInAppEventParameterName.close();
                                    cursor = null;
                                    if (cursor != null) {
                                    }
                                    AFi1qSDK.this.values.put("api_ver", Long.valueOf(AFb1rSDK.AFKeystoreWrapper(context, ((PackageItemInfo) AFi1qSDK.this.valueOf).packageName)));
                                    AFi1qSDK.this.values.put("api_ver_name", AFb1rSDK.AFInAppEventType(context, ((PackageItemInfo) AFi1qSDK.this.valueOf).packageName));
                                    AFi1qSDK.this.AFKeystoreWrapper();
                                }
                            } catch (Throwable th) {
                                AFLogger.INSTANCE.e(AFg1jSDK.PREINSTALL, "Error to get data from providerClient ", th, false);
                                AFInAppEventParameterName.close();
                                cursor = null;
                                if (cursor != null) {
                                }
                                AFi1qSDK.this.values.put("api_ver", Long.valueOf(AFb1rSDK.AFKeystoreWrapper(context, ((PackageItemInfo) AFi1qSDK.this.valueOf).packageName)));
                                AFi1qSDK.this.values.put("api_ver_name", AFb1rSDK.AFInAppEventType(context, ((PackageItemInfo) AFi1qSDK.this.valueOf).packageName));
                                AFi1qSDK.this.AFKeystoreWrapper();
                            }
                        } catch (RemoteException e2) {
                            AFLogger.INSTANCE.e(AFg1jSDK.PREINSTALL, "Failed to query unstable content providerClient", e2, false);
                            AFInAppEventParameterName.close();
                            cursor = null;
                            if (cursor != null) {
                            }
                            AFi1qSDK.this.values.put("api_ver", Long.valueOf(AFb1rSDK.AFKeystoreWrapper(context, ((PackageItemInfo) AFi1qSDK.this.valueOf).packageName)));
                            AFi1qSDK.this.values.put("api_ver_name", AFb1rSDK.AFInAppEventType(context, ((PackageItemInfo) AFi1qSDK.this.valueOf).packageName));
                            AFi1qSDK.this.AFKeystoreWrapper();
                        }
                        if (cursor != null) {
                            int columnIndex = cursor.getColumnIndex(FirebaseAnalytics.Param.TRANSACTION_ID);
                            if (columnIndex != -1) {
                                AFi1qSDK.this.values.put("response", "OK");
                                if (cursor.moveToFirst()) {
                                    String string = cursor.getString(columnIndex);
                                    cursor.close();
                                    if (string != null && !string.isEmpty()) {
                                        AFi1qSDK.this.values.put("referrer", string);
                                    }
                                }
                            } else {
                                AFLogger.INSTANCE.w(AFg1jSDK.PREINSTALL, "Wrong column name");
                                AFi1qSDK.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                            cursor.close();
                        } else {
                            AFLogger.INSTANCE.w(AFg1jSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                            AFi1qSDK.this.values.put("response", "SERVICE_UNAVAILABLE");
                        }
                        AFi1qSDK.this.values.put("api_ver", Long.valueOf(AFb1rSDK.AFKeystoreWrapper(context, ((PackageItemInfo) AFi1qSDK.this.valueOf).packageName)));
                        AFi1qSDK.this.values.put("api_ver_name", AFb1rSDK.AFInAppEventType(context, ((PackageItemInfo) AFi1qSDK.this.valueOf).packageName));
                        AFi1qSDK.this.AFKeystoreWrapper();
                    } catch (Throwable th2) {
                        AFInAppEventParameterName.close();
                        throw th2;
                    }
                }
                cursor = null;
                if (cursor != null) {
                }
                AFi1qSDK.this.values.put("api_ver", Long.valueOf(AFb1rSDK.AFKeystoreWrapper(context, ((PackageItemInfo) AFi1qSDK.this.valueOf).packageName)));
                AFi1qSDK.this.values.put("api_ver_name", AFb1rSDK.AFInAppEventType(context, ((PackageItemInfo) AFi1qSDK.this.valueOf).packageName));
                AFi1qSDK.this.AFKeystoreWrapper();
            }
        });
    }

    public static ContentProviderClient AFInAppEventParameterName(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e) {
            AFLogger.INSTANCE.e(AFg1jSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e, false);
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1jSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false);
            return null;
        }
    }
}
