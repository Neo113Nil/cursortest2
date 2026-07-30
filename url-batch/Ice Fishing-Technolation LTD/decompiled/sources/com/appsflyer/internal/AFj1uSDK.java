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
import com.appsflyer.internal.AFj1tSDK;

/* loaded from: classes.dex */
public final class AFj1uSDK extends AFj1tSDK {
    private final AFd1zSDK AFAdRevenueData;
    final ProviderInfo getCurrencyIso4217Code;

    public AFj1uSDK(ProviderInfo providerInfo, Runnable runnable, AFd1zSDK aFd1zSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.AFAdRevenueData = aFd1zSDK;
        this.getCurrencyIso4217Code = providerInfo;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(final Context context) {
        this.AFAdRevenueData.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1uSDK.5
            /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0096  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                Cursor query;
                AFj1uSDK aFj1uSDK = AFj1uSDK.this;
                aFj1uSDK.component1 = System.currentTimeMillis();
                aFj1uSDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
                aFj1uSDK.addObserver(new AFj1tSDK.AnonymousClass1());
                Uri parse = Uri.parse(new StringBuilder("content://").append(AFj1uSDK.this.getCurrencyIso4217Code.authority).append("/transaction_id").toString());
                ContentProviderClient B_ = AFj1uSDK.B_(context, parse);
                try {
                    if (B_ != null) {
                        try {
                            try {
                                query = B_.query(parse, null, new StringBuilder("app_id=").append(context.getPackageName()).toString(), null, null);
                                B_.close();
                            } catch (Throwable th) {
                                AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Error to get data from providerClient ", th, false, true, false);
                                B_.close();
                                query = null;
                                if (query != null) {
                                }
                                AFj1uSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1uSDK.this.getCurrencyIso4217Code).packageName)));
                                AFj1uSDK.this.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) AFj1uSDK.this.getCurrencyIso4217Code).packageName));
                                AFj1uSDK.this.getMediationNetwork();
                            }
                        } catch (DeadObjectException e) {
                            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e, false, true, false);
                            B_.close();
                            query = null;
                            if (query != null) {
                            }
                            AFj1uSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1uSDK.this.getCurrencyIso4217Code).packageName)));
                            AFj1uSDK.this.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) AFj1uSDK.this.getCurrencyIso4217Code).packageName));
                            AFj1uSDK.this.getMediationNetwork();
                        } catch (RemoteException e2) {
                            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to query unstable content providerClient", e2, false, true, false);
                            B_.close();
                            query = null;
                            if (query != null) {
                            }
                            AFj1uSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1uSDK.this.getCurrencyIso4217Code).packageName)));
                            AFj1uSDK.this.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) AFj1uSDK.this.getCurrencyIso4217Code).packageName));
                            AFj1uSDK.this.getMediationNetwork();
                        }
                        if (query != null) {
                            int columnIndex = query.getColumnIndex("transaction_id");
                            if (columnIndex != -1) {
                                AFj1uSDK.this.getMediationNetwork.put("response", "OK");
                                if (query.moveToFirst()) {
                                    String string = query.getString(columnIndex);
                                    query.close();
                                    if (string != null && !string.isEmpty()) {
                                        AFj1uSDK.this.getMediationNetwork.put("referrer", string);
                                    }
                                }
                            } else {
                                AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "Wrong column name");
                                AFj1uSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                            query.close();
                        } else {
                            AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                            AFj1uSDK.this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                        }
                        AFj1uSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1uSDK.this.getCurrencyIso4217Code).packageName)));
                        AFj1uSDK.this.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) AFj1uSDK.this.getCurrencyIso4217Code).packageName));
                        AFj1uSDK.this.getMediationNetwork();
                    }
                    query = null;
                    if (query != null) {
                    }
                    AFj1uSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1uSDK.this.getCurrencyIso4217Code).packageName)));
                    AFj1uSDK.this.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) AFj1uSDK.this.getCurrencyIso4217Code).packageName));
                    AFj1uSDK.this.getMediationNetwork();
                } catch (Throwable th2) {
                    B_.close();
                    throw th2;
                }
            }
        });
    }

    public static ContentProviderClient B_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e, false, true, false);
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false, true, false);
            return null;
        }
    }
}
