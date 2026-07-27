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

/* loaded from: classes.dex */
public final class AFi1iSDK extends AFi1hSDK {
    final ProviderInfo AFInAppEventType;
    private final AFd1kSDK valueOf;

    public AFi1iSDK(ProviderInfo providerInfo, Runnable runnable, AFd1kSDK aFd1kSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.valueOf = aFd1kSDK;
        this.AFInAppEventType = providerInfo;
    }

    public static ContentProviderClient AFInAppEventParameterName(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e4) {
            AFLogger.INSTANCE.e(AFg1aSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e4, false);
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1aSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void values(final Context context) {
        this.valueOf.values().execute(new Runnable() { // from class: com.appsflyer.internal.AFi1iSDK.1
            /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x008c  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                Cursor cursor;
                AFi1iSDK aFi1iSDK = AFi1iSDK.this;
                aFi1iSDK.f5960e = System.currentTimeMillis();
                aFi1iSDK.unregisterClient = AFi1hSDK.AFa1ySDK.STARTED;
                aFi1iSDK.addObserver(new AFi1hSDK.AnonymousClass1());
                StringBuilder sb = new StringBuilder("content://");
                sb.append(AFi1iSDK.this.AFInAppEventType.authority);
                sb.append("/transaction_id");
                Uri parse = Uri.parse(sb.toString());
                ContentProviderClient AFInAppEventParameterName = AFi1iSDK.AFInAppEventParameterName(context, parse);
                if (AFInAppEventParameterName != null) {
                    try {
                        try {
                            StringBuilder sb2 = new StringBuilder("app_id=");
                            sb2.append(context.getPackageName());
                            cursor = AFInAppEventParameterName.query(parse, null, sb2.toString(), null, null);
                        } finally {
                            AFInAppEventParameterName.close();
                        }
                    } catch (DeadObjectException e4) {
                        AFLogger.INSTANCE.e(AFg1aSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e4, false);
                        AFInAppEventParameterName.close();
                        cursor = null;
                        if (cursor != null) {
                        }
                        AFi1iSDK aFi1iSDK2 = AFi1iSDK.this;
                        aFi1iSDK2.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFb1uSDK.values(context, ((PackageItemInfo) aFi1iSDK2.AFInAppEventType).packageName)));
                        AFi1iSDK aFi1iSDK3 = AFi1iSDK.this;
                        aFi1iSDK3.AFInAppEventParameterName.put("api_ver_name", AFb1uSDK.AFInAppEventType(context, ((PackageItemInfo) aFi1iSDK3.AFInAppEventType).packageName));
                        AFi1iSDK.this.values();
                    } catch (RemoteException e5) {
                        AFLogger.INSTANCE.e(AFg1aSDK.PREINSTALL, "Failed to query unstable content providerClient", e5, false);
                        AFInAppEventParameterName.close();
                        cursor = null;
                        if (cursor != null) {
                        }
                        AFi1iSDK aFi1iSDK22 = AFi1iSDK.this;
                        aFi1iSDK22.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFb1uSDK.values(context, ((PackageItemInfo) aFi1iSDK22.AFInAppEventType).packageName)));
                        AFi1iSDK aFi1iSDK32 = AFi1iSDK.this;
                        aFi1iSDK32.AFInAppEventParameterName.put("api_ver_name", AFb1uSDK.AFInAppEventType(context, ((PackageItemInfo) aFi1iSDK32.AFInAppEventType).packageName));
                        AFi1iSDK.this.values();
                    } catch (Throwable th) {
                        AFLogger.INSTANCE.e(AFg1aSDK.PREINSTALL, "Error to get data from providerClient ", th, false);
                        AFInAppEventParameterName.close();
                        cursor = null;
                        if (cursor != null) {
                        }
                        AFi1iSDK aFi1iSDK222 = AFi1iSDK.this;
                        aFi1iSDK222.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFb1uSDK.values(context, ((PackageItemInfo) aFi1iSDK222.AFInAppEventType).packageName)));
                        AFi1iSDK aFi1iSDK322 = AFi1iSDK.this;
                        aFi1iSDK322.AFInAppEventParameterName.put("api_ver_name", AFb1uSDK.AFInAppEventType(context, ((PackageItemInfo) aFi1iSDK322.AFInAppEventType).packageName));
                        AFi1iSDK.this.values();
                    }
                    if (cursor != null) {
                        int columnIndex = cursor.getColumnIndex("transaction_id");
                        if (columnIndex == -1) {
                            AFLogger.INSTANCE.w(AFg1aSDK.PREINSTALL, "Wrong column name");
                            AFi1iSDK.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                        } else {
                            AFi1iSDK.this.AFInAppEventParameterName.put("response", "OK");
                            if (cursor.moveToFirst()) {
                                String string = cursor.getString(columnIndex);
                                cursor.close();
                                if (string != null && !string.isEmpty()) {
                                    AFi1iSDK.this.AFInAppEventParameterName.put("referrer", string);
                                }
                            }
                        }
                        cursor.close();
                    } else {
                        AFLogger.INSTANCE.w(AFg1aSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                        AFi1iSDK.this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
                    }
                    AFi1iSDK aFi1iSDK2222 = AFi1iSDK.this;
                    aFi1iSDK2222.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFb1uSDK.values(context, ((PackageItemInfo) aFi1iSDK2222.AFInAppEventType).packageName)));
                    AFi1iSDK aFi1iSDK3222 = AFi1iSDK.this;
                    aFi1iSDK3222.AFInAppEventParameterName.put("api_ver_name", AFb1uSDK.AFInAppEventType(context, ((PackageItemInfo) aFi1iSDK3222.AFInAppEventType).packageName));
                    AFi1iSDK.this.values();
                }
                cursor = null;
                if (cursor != null) {
                }
                AFi1iSDK aFi1iSDK22222 = AFi1iSDK.this;
                aFi1iSDK22222.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFb1uSDK.values(context, ((PackageItemInfo) aFi1iSDK22222.AFInAppEventType).packageName)));
                AFi1iSDK aFi1iSDK32222 = AFi1iSDK.this;
                aFi1iSDK32222.AFInAppEventParameterName.put("api_ver_name", AFb1uSDK.AFInAppEventType(context, ((PackageItemInfo) aFi1iSDK32222.AFInAppEventType).packageName));
                AFi1iSDK.this.values();
            }
        });
    }
}
