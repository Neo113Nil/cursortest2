package com.appsflyer.internal;

import android.content.Context;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public interface AFb1bSDK {
    public static final AFa1vSDK AFa1vSDK = AFa1vSDK.getRevenue;

    public static final class AFa1vSDK {
        static final /* synthetic */ AFa1vSDK getRevenue = new AFa1vSDK();
        private static long AFAdRevenueData = 500;

        private AFa1vSDK() {
        }

        public static long getRevenue() {
            return AFAdRevenueData;
        }
    }

    public interface AFa1zSDK {
        void getCurrencyIso4217Code();

        void getMediationNetwork(AFh1oSDK aFh1oSDK);
    }

    void getMediationNetwork();

    void getMonetizationNetwork(Context context, AFa1zSDK aFa1zSDK);

    boolean getMonetizationNetwork();
}
