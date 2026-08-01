package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFc1rSDK {
    final List<AFc1sSDK> getMediationNetwork;

    public AFc1rSDK(List<AFc1sSDK> list) {
        list.getClass();
        this.getMediationNetwork = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1rSDK) && Intrinsics.a(this.getMediationNetwork, ((AFc1rSDK) obj).getMediationNetwork);
    }

    public final int hashCode() {
        return this.getMediationNetwork.hashCode();
    }

    public final String toString() {
        return "StorageConfig(typeEntries=" + this.getMediationNetwork + ")";
    }
}
