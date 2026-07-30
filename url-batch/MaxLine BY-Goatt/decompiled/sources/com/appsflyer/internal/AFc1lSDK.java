package com.appsflyer.internal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
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
