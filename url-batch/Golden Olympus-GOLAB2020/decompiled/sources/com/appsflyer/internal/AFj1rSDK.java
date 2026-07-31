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
import com.appsflyer.internal.AFj1qSDK;
import com.ironsource.ms;

/* loaded from: classes.dex */
public final class AFj1rSDK extends AFj1qSDK {
    final ProviderInfo getMediationNetwork;
    private final AFc1dSDK getMonetizationNetwork;

    public AFj1rSDK(ProviderInfo providerInfo, Runnable runnable, AFc1dSDK aFc1dSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getMonetizationNetwork = aFc1dSDK;
        this.getMediationNetwork = providerInfo;
    }

    public static ContentProviderClient B_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e4) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e4, false, true, false);
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getRevenue(final Context context) {
        this.getMonetizationNetwork.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1rSDK.5
            /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0096  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                Cursor query;
                AFj1rSDK aFj1rSDK = AFj1rSDK.this;
                aFj1rSDK.component1 = System.currentTimeMillis();
                aFj1rSDK.component4 = AFj1qSDK.AFa1ySDK.STARTED;
                aFj1rSDK.addObserver(new AFj1qSDK.AnonymousClass5());
                StringBuilder sb = new StringBuilder("content://");
                sb.append(AFj1rSDK.this.getMediationNetwork.authority);
                sb.append("/transaction_id");
                Uri parse = Uri.parse(sb.toString());
                ContentProviderClient B_ = AFj1rSDK.B_(context, parse);
                try {
                    if (B_ != null) {
                        try {
                            try {
                                StringBuilder sb2 = new StringBuilder("app_id=");
                                sb2.append(context.getPackageName());
                                query = B_.query(parse, null, sb2.toString(), null, null);
                                B_.close();
                            } catch (RemoteException e4) {
                                AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to query unstable content providerClient", e4, false, true, false);
                                B_.close();
                                query = null;
                                if (query != null) {
                                }
                                AFj1rSDK aFj1rSDK2 = AFj1rSDK.this;
                                aFj1rSDK2.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1iSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1rSDK2.getMediationNetwork).packageName)));
                                AFj1rSDK aFj1rSDK3 = AFj1rSDK.this;
                                aFj1rSDK3.AFAdRevenueData.put("api_ver_name", AFj1iSDK.getMediationNetwork(context, ((PackageItemInfo) aFj1rSDK3.getMediationNetwork).packageName));
                                AFj1rSDK.this.getMediationNetwork();
                            }
                        } catch (DeadObjectException e5) {
                            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e5, false, true, false);
                            B_.close();
                            query = null;
                            if (query != null) {
                            }
                            AFj1rSDK aFj1rSDK22 = AFj1rSDK.this;
                            aFj1rSDK22.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1iSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1rSDK22.getMediationNetwork).packageName)));
                            AFj1rSDK aFj1rSDK32 = AFj1rSDK.this;
                            aFj1rSDK32.AFAdRevenueData.put("api_ver_name", AFj1iSDK.getMediationNetwork(context, ((PackageItemInfo) aFj1rSDK32.getMediationNetwork).packageName));
                            AFj1rSDK.this.getMediationNetwork();
                        } catch (Throwable th) {
                            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Error to get data from providerClient ", th, false, true, false);
                            B_.close();
                            query = null;
                            if (query != null) {
                            }
                            AFj1rSDK aFj1rSDK222 = AFj1rSDK.this;
                            aFj1rSDK222.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1iSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1rSDK222.getMediationNetwork).packageName)));
                            AFj1rSDK aFj1rSDK322 = AFj1rSDK.this;
                            aFj1rSDK322.AFAdRevenueData.put("api_ver_name", AFj1iSDK.getMediationNetwork(context, ((PackageItemInfo) aFj1rSDK322.getMediationNetwork).packageName));
                            AFj1rSDK.this.getMediationNetwork();
                        }
                        if (query != null) {
                            int columnIndex = query.getColumnIndex("transaction_id");
                            if (columnIndex == -1) {
                                AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "Wrong column name");
                                AFj1rSDK.this.AFAdRevenueData.put(ms.f18193n, "FEATURE_NOT_SUPPORTED");
                            } else {
                                AFj1rSDK.this.AFAdRevenueData.put(ms.f18193n, "OK");
                                if (query.moveToFirst()) {
                                    String string = query.getString(columnIndex);
                                    query.close();
                                    if (string != null && !string.isEmpty()) {
                                        AFj1rSDK.this.AFAdRevenueData.put("referrer", string);
                                    }
                                }
                            }
                            query.close();
                        } else {
                            AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                            AFj1rSDK.this.AFAdRevenueData.put(ms.f18193n, "SERVICE_UNAVAILABLE");
                        }
                        AFj1rSDK aFj1rSDK2222 = AFj1rSDK.this;
                        aFj1rSDK2222.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1iSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1rSDK2222.getMediationNetwork).packageName)));
                        AFj1rSDK aFj1rSDK3222 = AFj1rSDK.this;
                        aFj1rSDK3222.AFAdRevenueData.put("api_ver_name", AFj1iSDK.getMediationNetwork(context, ((PackageItemInfo) aFj1rSDK3222.getMediationNetwork).packageName));
                        AFj1rSDK.this.getMediationNetwork();
                    }
                    query = null;
                    if (query != null) {
                    }
                    AFj1rSDK aFj1rSDK22222 = AFj1rSDK.this;
                    aFj1rSDK22222.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1iSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1rSDK22222.getMediationNetwork).packageName)));
                    AFj1rSDK aFj1rSDK32222 = AFj1rSDK.this;
                    aFj1rSDK32222.AFAdRevenueData.put("api_ver_name", AFj1iSDK.getMediationNetwork(context, ((PackageItemInfo) aFj1rSDK32222.getMediationNetwork).packageName));
                    AFj1rSDK.this.getMediationNetwork();
                } catch (Throwable th2) {
                    B_.close();
                    throw th2;
                }
            }
        });
    }
}
