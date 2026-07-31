package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface AFg1uSDK {

    public static final class AFa1uSDK {
        final String getMediationNetwork;
        final float getRevenue;

        public AFa1uSDK(float f4, String str) {
            this.getRevenue = f4;
            this.getMediationNetwork = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) obj;
            return Float.compare(this.getRevenue, aFa1uSDK.getRevenue) == 0 && Intrinsics.areEqual(this.getMediationNetwork, aFa1uSDK.getMediationNetwork);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.getRevenue) * 31;
            String str = this.getMediationNetwork;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "BatteryData(level=" + this.getRevenue + ", charging=" + this.getMediationNetwork + ")";
        }
    }

    AFa1uSDK getRevenue(Context context);
}
