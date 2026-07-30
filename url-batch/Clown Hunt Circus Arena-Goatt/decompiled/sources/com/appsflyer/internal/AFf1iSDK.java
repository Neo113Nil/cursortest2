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
import com.appsflyer.internal.AFf1jSDK;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes.dex */
public final class AFf1iSDK extends AFf1jSDK {
    final ProviderInfo valueOf;
    private final AFc1zSDK values;

    public AFf1iSDK(ProviderInfo providerInfo, Runnable runnable, AFc1zSDK aFc1zSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.values = aFc1zSDK;
        this.valueOf = providerInfo;
    }

    @Override // com.appsflyer.internal.AFf1jSDK
    public final void AFKeystoreWrapper(final Context context) {
        this.values.valueOf().execute(new Runnable() { // from class: com.appsflyer.internal.AFf1iSDK.1
            /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x007f  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                Cursor cursor;
                AFf1iSDK aFf1iSDK = AFf1iSDK.this;
                aFf1iSDK.AFLogger = System.currentTimeMillis();
                aFf1iSDK.afRDLog = AFf1jSDK.AFa1vSDK.STARTED;
                aFf1iSDK.addObserver(new AFf1jSDK.AnonymousClass5());
                Uri parse = Uri.parse(new StringBuilder("content://").append(AFf1iSDK.this.valueOf.authority).append("/transaction_id").toString());
                ContentProviderClient AFKeystoreWrapper = AFf1iSDK.AFKeystoreWrapper(context, parse);
                if (AFKeystoreWrapper != null) {
                    try {
                        try {
                            try {
                                cursor = AFKeystoreWrapper.query(parse, null, new StringBuilder("app_id=").append(context.getPackageName()).toString(), null, null);
                                AFKeystoreWrapper.close();
                            } catch (Throwable th) {
                                AFLogger.afErrorLog("[Preinstall]: Error to get data from providerClient ", th, false);
                                AFKeystoreWrapper.close();
                                cursor = null;
                                if (cursor != null) {
                                }
                                AFf1iSDK.this.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(context, ((PackageItemInfo) AFf1iSDK.this.valueOf).packageName)));
                                AFf1iSDK.this.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(context, ((PackageItemInfo) AFf1iSDK.this.valueOf).packageName));
                                AFf1iSDK.this.AFInAppEventType();
                            }
                        } catch (DeadObjectException e) {
                            AFLogger.afErrorLog("[Preinstall]: Failed to acquire unstable content providerClient", e, false);
                            AFKeystoreWrapper.close();
                            cursor = null;
                            if (cursor != null) {
                            }
                            AFf1iSDK.this.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(context, ((PackageItemInfo) AFf1iSDK.this.valueOf).packageName)));
                            AFf1iSDK.this.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(context, ((PackageItemInfo) AFf1iSDK.this.valueOf).packageName));
                            AFf1iSDK.this.AFInAppEventType();
                        } catch (RemoteException e2) {
                            AFLogger.afErrorLog("[Preinstall]: Failed to query unstable content providerClient", e2, false);
                            AFKeystoreWrapper.close();
                            cursor = null;
                            if (cursor != null) {
                            }
                            AFf1iSDK.this.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(context, ((PackageItemInfo) AFf1iSDK.this.valueOf).packageName)));
                            AFf1iSDK.this.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(context, ((PackageItemInfo) AFf1iSDK.this.valueOf).packageName));
                            AFf1iSDK.this.AFInAppEventType();
                        }
                        if (cursor != null) {
                            int columnIndex = cursor.getColumnIndex(FirebaseAnalytics.Param.TRANSACTION_ID);
                            if (columnIndex != -1) {
                                AFf1iSDK.this.AFKeystoreWrapper.put("response", "OK");
                                if (cursor.moveToFirst()) {
                                    String string = cursor.getString(columnIndex);
                                    cursor.close();
                                    if (string != null && !string.isEmpty()) {
                                        AFf1iSDK.this.AFKeystoreWrapper.put("referrer", string);
                                    }
                                }
                            } else {
                                AFLogger.afWarnLog("[Preinstall]: Wrong column name");
                                AFf1iSDK.this.AFKeystoreWrapper.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                            cursor.close();
                        } else {
                            AFLogger.afWarnLog("[Preinstall]: ContentProvider query failed, got null Cursor");
                            AFf1iSDK.this.AFKeystoreWrapper.put("response", "SERVICE_UNAVAILABLE");
                        }
                        AFf1iSDK.this.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(context, ((PackageItemInfo) AFf1iSDK.this.valueOf).packageName)));
                        AFf1iSDK.this.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(context, ((PackageItemInfo) AFf1iSDK.this.valueOf).packageName));
                        AFf1iSDK.this.AFInAppEventType();
                    } catch (Throwable th2) {
                        AFKeystoreWrapper.close();
                        throw th2;
                    }
                }
                cursor = null;
                if (cursor != null) {
                }
                AFf1iSDK.this.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(context, ((PackageItemInfo) AFf1iSDK.this.valueOf).packageName)));
                AFf1iSDK.this.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(context, ((PackageItemInfo) AFf1iSDK.this.valueOf).packageName));
                AFf1iSDK.this.AFInAppEventType();
            }
        });
    }

    public static ContentProviderClient AFKeystoreWrapper(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e) {
            AFLogger.afErrorLog("[Preinstall]: Failed to acquire unstable content providerClient due to SecurityException", e, false);
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog("[Preinstall]: Failed to acquire unstable content providerClient due to unexpected throwable", th, false);
            return null;
        }
    }
}
