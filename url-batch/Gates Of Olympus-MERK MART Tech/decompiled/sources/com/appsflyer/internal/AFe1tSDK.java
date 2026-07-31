package com.appsflyer.internal;

/* loaded from: classes3.dex */
public class AFe1tSDK {
    public final long AFInAppEventType;

    public AFe1tSDK(long j) {
        this.AFInAppEventType = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.AFInAppEventType == ((AFe1tSDK) obj).AFInAppEventType;
    }

    public int hashCode() {
        long j = this.AFInAppEventType;
        return (int) (j ^ (j >>> 32));
    }
}
