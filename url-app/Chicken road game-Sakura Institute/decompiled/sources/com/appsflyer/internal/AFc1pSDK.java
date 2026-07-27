package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFc1pSDK {
    public final DeepLink AFInAppEventType;
    private final boolean values;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1pSDK() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1pSDK)) {
            return false;
        }
        AFc1pSDK aFc1pSDK = (AFc1pSDK) obj;
        return this.values == aFc1pSDK.values && Intrinsics.a(this.AFInAppEventType, aFc1pSDK.AFInAppEventType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z4 = this.values;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        int i2 = r02 * 31;
        DeepLink deepLink = this.AFInAppEventType;
        return i2 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AFc1pSDK(AFInAppEventType=");
        sb.append(this.values);
        sb.append(", values=");
        sb.append(this.AFInAppEventType);
        sb.append(')');
        return sb.toString();
    }

    public final boolean valueOf() {
        return this.values;
    }

    public AFc1pSDK(boolean z4, DeepLink deepLink) {
        this.values = z4;
        this.AFInAppEventType = deepLink;
    }

    public /* synthetic */ AFc1pSDK(boolean z4, DeepLink deepLink, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z4, (i2 & 2) != 0 ? null : deepLink);
    }
}
