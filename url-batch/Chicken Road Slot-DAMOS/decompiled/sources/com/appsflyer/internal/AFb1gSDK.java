package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFb1gSDK {
    public final String getMediationNetwork;
    public final int getMonetizationNetwork;

    public AFb1gSDK(int i3, String str) {
        str.getClass();
        this.getMonetizationNetwork = i3;
        this.getMediationNetwork = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFb1gSDK)) {
            return false;
        }
        AFb1gSDK aFb1gSDK = (AFb1gSDK) obj;
        return this.getMonetizationNetwork == aFb1gSDK.getMonetizationNetwork && Intrinsics.a(this.getMediationNetwork, aFb1gSDK.getMediationNetwork);
    }

    public final int hashCode() {
        return this.getMediationNetwork.hashCode() + (Integer.hashCode(this.getMonetizationNetwork) * 31);
    }

    public final String toString() {
        return "AppSetIdModel(scope=" + this.getMonetizationNetwork + ", id=" + this.getMediationNetwork + ")";
    }
}
