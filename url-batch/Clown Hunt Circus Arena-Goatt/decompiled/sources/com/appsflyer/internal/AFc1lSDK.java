package com.appsflyer.internal;

/* loaded from: classes.dex */
public class AFc1lSDK {
    public final long AFInAppEventType;

    public AFc1lSDK(long j) {
        this.AFInAppEventType = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.AFInAppEventType == ((AFc1lSDK) obj).AFInAppEventType;
    }

    public int hashCode() {
        long j = this.AFInAppEventType;
        return (int) (j ^ (j >>> 32));
    }
}
