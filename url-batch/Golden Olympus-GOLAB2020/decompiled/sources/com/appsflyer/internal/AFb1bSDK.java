package com.appsflyer.internal;

import android.content.Context;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public interface AFb1bSDK {
    public static final AFa1vSDK AFa1vSDK = AFa1vSDK.AFAdRevenueData;

    public static final class AFa1vSDK {
        static final /* synthetic */ AFa1vSDK AFAdRevenueData = new AFa1vSDK();
        private static long getRevenue = 500;

        private AFa1vSDK() {
        }

        public static long getRevenue() {
            return getRevenue;
        }
    }

    public interface AFa1zSDK {
        void getCurrencyIso4217Code();

        void getRevenue(AFh1qSDK aFh1qSDK);
    }

    void AFAdRevenueData();

    void AFAdRevenueData(Context context, AFa1zSDK aFa1zSDK);

    boolean getCurrencyIso4217Code();
}
