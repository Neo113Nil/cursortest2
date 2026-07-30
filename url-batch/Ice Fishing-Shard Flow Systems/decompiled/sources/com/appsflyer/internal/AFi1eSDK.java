package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1zSDK;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class AFi1eSDK extends AFi1hSDK {
    private final AFd1zSDK getMediationNetwork;
    private final AFi1cSDK getMonetizationNetwork;

    public AFi1eSDK(Runnable runnable, AFd1zSDK aFd1zSDK, AFi1cSDK aFi1cSDK) {
        super("store", "huawei", aFd1zSDK.AFAdRevenueData(), runnable);
        this.getMediationNetwork = aFd1zSDK;
        this.getMonetizationNetwork = aFi1cSDK;
    }

    private boolean AFAdRevenueData(Context context) {
        if (!getMonetizationNetwork()) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getMonetizationNetwork.getMediationNetwork(context)) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getMonetizationNetwork.getCurrencyIso4217Code(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00de, code lost:
    
        if (r3 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e0, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0107, code lost:
    
        getCurrencyIso4217Code();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x010a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0104, code lost:
    
        if (0 == 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void getRevenue(Context context) {
        this.areAllFieldsValid = System.currentTimeMillis();
        this.component2 = AFj1zSDK.AFa1ySDK.STARTED;
        addObserver(new AFj1zSDK.AnonymousClass3());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.getCurrencyIso4217Code.put("api_ver", Long.valueOf(AFj1pSDK.getCurrencyIso4217Code(context, str)));
        this.getCurrencyIso4217Code.put("api_ver_name", AFj1pSDK.getMonetizationNetwork(context, str));
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursor == null) {
                this.getCurrencyIso4217Code.put("response", "SERVICE_UNAVAILABLE");
            } else if (cursor.moveToFirst()) {
                this.getCurrencyIso4217Code.put("response", "OK");
                this.getCurrencyIso4217Code.put("referrer", cursor.getString(0));
                this.getCurrencyIso4217Code.put("click_ts", Long.valueOf(cursor.getLong(1)));
                this.getCurrencyIso4217Code.put("install_end_ts", Long.valueOf(cursor.getLong(2)));
                if (cursor.getColumnCount() > 3) {
                    this.getCurrencyIso4217Code.put("install_begin_ts", Long.valueOf(cursor.getLong(3)));
                    HashMap hashMap = new HashMap();
                    String string = cursor.getString(4);
                    if (string != null) {
                        hashMap.put("track_id", string);
                    }
                    hashMap.put("referrer_ex", cursor.getString(5));
                    this.getCurrencyIso4217Code.put("huawei_custom", hashMap);
                }
            } else {
                this.getCurrencyIso4217Code.put("response", "FEATURE_NOT_SUPPORTED");
            }
        } catch (Throwable th) {
            try {
                this.getCurrencyIso4217Code.put("response", "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, th.getMessage() != null ? th.getMessage() : "", th, false, true);
            } finally {
            }
        }
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final void getMonetizationNetwork(Context context) {
        if (AFAdRevenueData(context)) {
            this.getMediationNetwork.getCurrencyIso4217Code().execute(new g(this, 3, context));
        }
    }
}
