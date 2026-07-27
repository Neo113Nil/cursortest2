package com.appsflyer.internal;

/* loaded from: classes.dex */
public class AFe1mSDK {
    public final long AFKeystoreWrapper;

    public AFe1mSDK(long j4) {
        this.AFKeystoreWrapper = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.AFKeystoreWrapper == ((AFe1mSDK) obj).AFKeystoreWrapper;
    }

    public int hashCode() {
        long j4 = this.AFKeystoreWrapper;
        return (int) (j4 ^ (j4 >>> 32));
    }
}
