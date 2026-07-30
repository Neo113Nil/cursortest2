package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFc1sSDK {
    final List<AFc1uSDK> getRevenue;

    public AFc1sSDK(List<AFc1uSDK> list) {
        list.getClass();
        this.getRevenue = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1sSDK) && Intrinsics.a(this.getRevenue, ((AFc1sSDK) obj).getRevenue);
    }

    public final int hashCode() {
        return this.getRevenue.hashCode();
    }

    public final String toString() {
        return "StorageConfig(typeEntries=" + this.getRevenue + ")";
    }
}
