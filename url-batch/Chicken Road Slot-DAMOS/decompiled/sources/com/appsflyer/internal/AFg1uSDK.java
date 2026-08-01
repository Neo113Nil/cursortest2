package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface AFg1uSDK {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class AFa1zSDK {
        final String AFAdRevenueData;
        final float getMonetizationNetwork;

        public AFa1zSDK(float f3, String str) {
            this.getMonetizationNetwork = f3;
            this.AFAdRevenueData = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1zSDK)) {
                return false;
            }
            AFa1zSDK aFa1zSDK = (AFa1zSDK) obj;
            return Float.compare(this.getMonetizationNetwork, aFa1zSDK.getMonetizationNetwork) == 0 && Intrinsics.a(this.AFAdRevenueData, aFa1zSDK.AFAdRevenueData);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.getMonetizationNetwork) * 31;
            String str = this.AFAdRevenueData;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "BatteryData(level=" + this.getMonetizationNetwork + ", charging=" + this.AFAdRevenueData + ")";
        }
    }

    AFa1zSDK getCurrencyIso4217Code(Context context);
}
