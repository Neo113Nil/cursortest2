package com.appsflyer.internal;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class AFd1dSDK {
    public final long AFAdRevenueData;

    public AFd1dSDK(long j) {
        this.AFAdRevenueData = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.AFAdRevenueData == ((AFd1dSDK) obj).AFAdRevenueData;
    }

    public int hashCode() {
        long j = this.AFAdRevenueData;
        return (int) (j ^ (j >>> 32));
    }
}
