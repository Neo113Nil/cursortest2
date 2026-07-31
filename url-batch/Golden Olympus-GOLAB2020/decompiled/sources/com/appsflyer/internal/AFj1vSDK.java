package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1qSDK;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.b9;
import com.ironsource.ms;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class AFj1vSDK extends AFi1dSDK {
    private final AFc1dSDK getCurrencyIso4217Code;
    private final AFi1eSDK getMediationNetwork;

    public AFj1vSDK(Runnable runnable, AFc1dSDK aFc1dSDK, AFi1eSDK aFi1eSDK) {
        super(b9.h.f15461U, "huawei", aFc1dSDK.getRevenue(), runnable);
        this.getCurrencyIso4217Code = aFc1dSDK;
        this.getMediationNetwork = aFi1eSDK;
    }

    private boolean AFAdRevenueData(Context context) {
        if (!getRevenue()) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getMediationNetwork.getRevenue(context)) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getMediationNetwork.AFAdRevenueData(context)) {
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
    
        getMediationNetwork();
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
    public /* synthetic */ void getCurrencyIso4217Code(Context context) {
        this.component1 = System.currentTimeMillis();
        this.component4 = AFj1qSDK.AFa1ySDK.STARTED;
        addObserver(new AFj1qSDK.AnonymousClass5());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", UserVerificationMethods.USER_VERIFY_PATTERN)).packageName;
        this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1iSDK.AFAdRevenueData(context, str)));
        this.AFAdRevenueData.put("api_ver_name", AFj1iSDK.getMediationNetwork(context, str));
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursor == null) {
                this.AFAdRevenueData.put(ms.f18193n, "SERVICE_UNAVAILABLE");
            } else if (cursor.moveToFirst()) {
                this.AFAdRevenueData.put(ms.f18193n, "OK");
                this.AFAdRevenueData.put("referrer", cursor.getString(0));
                this.AFAdRevenueData.put("click_ts", Long.valueOf(cursor.getLong(1)));
                this.AFAdRevenueData.put("install_end_ts", Long.valueOf(cursor.getLong(2)));
                if (cursor.getColumnCount() > 3) {
                    this.AFAdRevenueData.put("install_begin_ts", Long.valueOf(cursor.getLong(3)));
                    HashMap hashMap = new HashMap();
                    String string = cursor.getString(4);
                    if (string != null) {
                        hashMap.put("track_id", string);
                    }
                    hashMap.put("referrer_ex", cursor.getString(5));
                    this.AFAdRevenueData.put("huawei_custom", hashMap);
                }
            } else {
                this.AFAdRevenueData.put(ms.f18193n, "FEATURE_NOT_SUPPORTED");
            }
        } catch (Throwable th) {
            try {
                this.AFAdRevenueData.put(ms.f18193n, "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, th.getMessage() != null ? th.getMessage() : "", th, false, true);
            } finally {
            }
        }
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getRevenue(final Context context) {
        if (AFAdRevenueData(context)) {
            this.getCurrencyIso4217Code.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.P
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1vSDK.this.getCurrencyIso4217Code(context);
                }
            });
        }
    }
}
