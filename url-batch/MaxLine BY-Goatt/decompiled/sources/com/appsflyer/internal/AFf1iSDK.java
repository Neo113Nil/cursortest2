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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFf1iSDK extends AFf1jSDK {
    final ProviderInfo valueOf;
    private final AFc1zSDK values;

    public AFf1iSDK(ProviderInfo providerInfo, Runnable runnable, AFc1zSDK aFc1zSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.values = aFc1zSDK;
        this.valueOf = providerInfo;
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

    @Override // com.appsflyer.internal.AFf1jSDK
    public final void AFKeystoreWrapper(final Context context) {
        this.values.valueOf().execute(new Runnable() { // from class: com.appsflyer.internal.AFf1iSDK.1
            /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0080  */
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
                StringBuilder sb = new StringBuilder("content://");
                sb.append(AFf1iSDK.this.valueOf.authority);
                sb.append("/transaction_id");
                Uri parse = Uri.parse(sb.toString());
                ContentProviderClient AFKeystoreWrapper = AFf1iSDK.AFKeystoreWrapper(context, parse);
                if (AFKeystoreWrapper != null) {
                    try {
                        try {
                            try {
                                StringBuilder sb2 = new StringBuilder("app_id=");
                                sb2.append(context.getPackageName());
                                cursor = AFKeystoreWrapper.query(parse, null, sb2.toString(), null, null);
                                AFKeystoreWrapper.close();
                            } catch (RemoteException e) {
                                AFLogger.afErrorLog("[Preinstall]: Failed to query unstable content providerClient", e, false);
                                AFKeystoreWrapper.close();
                                cursor = null;
                                if (cursor != null) {
                                }
                                AFf1iSDK aFf1iSDK2 = AFf1iSDK.this;
                                aFf1iSDK2.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(context, ((PackageItemInfo) aFf1iSDK2.valueOf).packageName)));
                                AFf1iSDK aFf1iSDK3 = AFf1iSDK.this;
                                aFf1iSDK3.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(context, ((PackageItemInfo) aFf1iSDK3.valueOf).packageName));
                                AFf1iSDK.this.AFInAppEventType();
                            }
                        } catch (DeadObjectException e2) {
                            AFLogger.afErrorLog("[Preinstall]: Failed to acquire unstable content providerClient", e2, false);
                            AFKeystoreWrapper.close();
                            cursor = null;
                            if (cursor != null) {
                            }
                            AFf1iSDK aFf1iSDK22 = AFf1iSDK.this;
                            aFf1iSDK22.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(context, ((PackageItemInfo) aFf1iSDK22.valueOf).packageName)));
                            AFf1iSDK aFf1iSDK32 = AFf1iSDK.this;
                            aFf1iSDK32.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(context, ((PackageItemInfo) aFf1iSDK32.valueOf).packageName));
                            AFf1iSDK.this.AFInAppEventType();
                        } catch (Throwable th) {
                            AFLogger.afErrorLog("[Preinstall]: Error to get data from providerClient ", th, false);
                            AFKeystoreWrapper.close();
                            cursor = null;
                            if (cursor != null) {
                            }
                            AFf1iSDK aFf1iSDK222 = AFf1iSDK.this;
                            aFf1iSDK222.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(context, ((PackageItemInfo) aFf1iSDK222.valueOf).packageName)));
                            AFf1iSDK aFf1iSDK322 = AFf1iSDK.this;
                            aFf1iSDK322.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(context, ((PackageItemInfo) aFf1iSDK322.valueOf).packageName));
                            AFf1iSDK.this.AFInAppEventType();
                        }
                        if (cursor != null) {
                            int columnIndex = cursor.getColumnIndex(FirebaseAnalytics.Param.TRANSACTION_ID);
                            if (columnIndex == -1) {
                                AFLogger.afWarnLog("[Preinstall]: Wrong column name");
                                AFf1iSDK.this.AFKeystoreWrapper.put("response", "FEATURE_NOT_SUPPORTED");
                            } else {
                                AFf1iSDK.this.AFKeystoreWrapper.put("response", "OK");
                                if (cursor.moveToFirst()) {
                                    String string = cursor.getString(columnIndex);
                                    cursor.close();
                                    if (string != null && !string.isEmpty()) {
                                        AFf1iSDK.this.AFKeystoreWrapper.put("referrer", string);
                                    }
                                }
                            }
                            cursor.close();
                        } else {
                            AFLogger.afWarnLog("[Preinstall]: ContentProvider query failed, got null Cursor");
                            AFf1iSDK.this.AFKeystoreWrapper.put("response", "SERVICE_UNAVAILABLE");
                        }
                        AFf1iSDK aFf1iSDK2222 = AFf1iSDK.this;
                        aFf1iSDK2222.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(context, ((PackageItemInfo) aFf1iSDK2222.valueOf).packageName)));
                        AFf1iSDK aFf1iSDK3222 = AFf1iSDK.this;
                        aFf1iSDK3222.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(context, ((PackageItemInfo) aFf1iSDK3222.valueOf).packageName));
                        AFf1iSDK.this.AFInAppEventType();
                    } catch (Throwable th2) {
                        AFKeystoreWrapper.close();
                        throw th2;
                    }
                }
                cursor = null;
                if (cursor != null) {
                }
                AFf1iSDK aFf1iSDK22222 = AFf1iSDK.this;
                aFf1iSDK22222.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(context, ((PackageItemInfo) aFf1iSDK22222.valueOf).packageName)));
                AFf1iSDK aFf1iSDK32222 = AFf1iSDK.this;
                aFf1iSDK32222.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(context, ((PackageItemInfo) aFf1iSDK32222.valueOf).packageName));
                AFf1iSDK.this.AFInAppEventType();
            }
        });
    }
}
