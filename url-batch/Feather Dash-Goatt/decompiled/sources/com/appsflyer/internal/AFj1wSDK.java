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
import com.appsflyer.internal.AFj1zSDK;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFj1wSDK extends AFj1zSDK {
    final ProviderInfo getMediationNetwork;
    private final AFd1zSDK getMonetizationNetwork;

    public AFj1wSDK(ProviderInfo providerInfo, Runnable runnable, AFd1zSDK aFd1zSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getMonetizationNetwork = aFd1zSDK;
        this.getMediationNetwork = providerInfo;
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

    @Override // com.appsflyer.internal.AFj1zSDK
    public final void getMonetizationNetwork(final Context context) {
        this.getMonetizationNetwork.getCurrencyIso4217Code().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1wSDK.4
            /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0097  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                Cursor query;
                AFj1wSDK aFj1wSDK = AFj1wSDK.this;
                aFj1wSDK.areAllFieldsValid = System.currentTimeMillis();
                aFj1wSDK.component2 = AFj1zSDK.AFa1ySDK.STARTED;
                aFj1wSDK.addObserver(new AFj1zSDK.AnonymousClass3());
                StringBuilder sb = new StringBuilder("content://");
                sb.append(AFj1wSDK.this.getMediationNetwork.authority);
                sb.append("/transaction_id");
                Uri parse = Uri.parse(sb.toString());
                ContentProviderClient B_ = AFj1wSDK.B_(context, parse);
                try {
                    if (B_ != null) {
                        try {
                            try {
                                StringBuilder sb2 = new StringBuilder("app_id=");
                                sb2.append(context.getPackageName());
                                query = B_.query(parse, null, sb2.toString(), null, null);
                                B_.close();
                            } catch (RemoteException e) {
                                AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to query unstable content providerClient", e, false, true, false);
                                B_.close();
                                query = null;
                                if (query != null) {
                                }
                                AFj1wSDK aFj1wSDK2 = AFj1wSDK.this;
                                aFj1wSDK2.getCurrencyIso4217Code.put("api_ver", Long.valueOf(AFj1pSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) aFj1wSDK2.getMediationNetwork).packageName)));
                                AFj1wSDK aFj1wSDK3 = AFj1wSDK.this;
                                aFj1wSDK3.getCurrencyIso4217Code.put("api_ver_name", AFj1pSDK.getMonetizationNetwork(context, ((PackageItemInfo) aFj1wSDK3.getMediationNetwork).packageName));
                                AFj1wSDK.this.getCurrencyIso4217Code();
                            }
                        } catch (DeadObjectException e2) {
                            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e2, false, true, false);
                            B_.close();
                            query = null;
                            if (query != null) {
                            }
                            AFj1wSDK aFj1wSDK22 = AFj1wSDK.this;
                            aFj1wSDK22.getCurrencyIso4217Code.put("api_ver", Long.valueOf(AFj1pSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) aFj1wSDK22.getMediationNetwork).packageName)));
                            AFj1wSDK aFj1wSDK32 = AFj1wSDK.this;
                            aFj1wSDK32.getCurrencyIso4217Code.put("api_ver_name", AFj1pSDK.getMonetizationNetwork(context, ((PackageItemInfo) aFj1wSDK32.getMediationNetwork).packageName));
                            AFj1wSDK.this.getCurrencyIso4217Code();
                        } catch (Throwable th) {
                            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Error to get data from providerClient ", th, false, true, false);
                            B_.close();
                            query = null;
                            if (query != null) {
                            }
                            AFj1wSDK aFj1wSDK222 = AFj1wSDK.this;
                            aFj1wSDK222.getCurrencyIso4217Code.put("api_ver", Long.valueOf(AFj1pSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) aFj1wSDK222.getMediationNetwork).packageName)));
                            AFj1wSDK aFj1wSDK322 = AFj1wSDK.this;
                            aFj1wSDK322.getCurrencyIso4217Code.put("api_ver_name", AFj1pSDK.getMonetizationNetwork(context, ((PackageItemInfo) aFj1wSDK322.getMediationNetwork).packageName));
                            AFj1wSDK.this.getCurrencyIso4217Code();
                        }
                        if (query != null) {
                            int columnIndex = query.getColumnIndex("transaction_id");
                            if (columnIndex == -1) {
                                AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "Wrong column name");
                                AFj1wSDK.this.getCurrencyIso4217Code.put("response", "FEATURE_NOT_SUPPORTED");
                            } else {
                                AFj1wSDK.this.getCurrencyIso4217Code.put("response", "OK");
                                if (query.moveToFirst()) {
                                    String string = query.getString(columnIndex);
                                    query.close();
                                    if (string != null && !string.isEmpty()) {
                                        AFj1wSDK.this.getCurrencyIso4217Code.put("referrer", string);
                                    }
                                }
                            }
                            query.close();
                        } else {
                            AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                            AFj1wSDK.this.getCurrencyIso4217Code.put("response", "SERVICE_UNAVAILABLE");
                        }
                        AFj1wSDK aFj1wSDK2222 = AFj1wSDK.this;
                        aFj1wSDK2222.getCurrencyIso4217Code.put("api_ver", Long.valueOf(AFj1pSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) aFj1wSDK2222.getMediationNetwork).packageName)));
                        AFj1wSDK aFj1wSDK3222 = AFj1wSDK.this;
                        aFj1wSDK3222.getCurrencyIso4217Code.put("api_ver_name", AFj1pSDK.getMonetizationNetwork(context, ((PackageItemInfo) aFj1wSDK3222.getMediationNetwork).packageName));
                        AFj1wSDK.this.getCurrencyIso4217Code();
                    }
                    query = null;
                    if (query != null) {
                    }
                    AFj1wSDK aFj1wSDK22222 = AFj1wSDK.this;
                    aFj1wSDK22222.getCurrencyIso4217Code.put("api_ver", Long.valueOf(AFj1pSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) aFj1wSDK22222.getMediationNetwork).packageName)));
                    AFj1wSDK aFj1wSDK32222 = AFj1wSDK.this;
                    aFj1wSDK32222.getCurrencyIso4217Code.put("api_ver_name", AFj1pSDK.getMonetizationNetwork(context, ((PackageItemInfo) aFj1wSDK32222.getMediationNetwork).packageName));
                    AFj1wSDK.this.getCurrencyIso4217Code();
                } catch (Throwable th2) {
                    B_.close();
                    throw th2;
                }
            }
        });
    }
}
