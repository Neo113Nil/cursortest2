package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\tB#\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0001X\u0007¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u0004X\u0007¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0007¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/appsflyer/internal/AFc1bSDK;", "Lcom/appsflyer/internal/AFc1aSDK;", "valueOf", "Lcom/appsflyer/internal/AFc1aSDK;", "", "AFKeystoreWrapper", "Ljava/lang/String;", "AFInAppEventType", "AFInAppEventParameterName", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFc1aSDK;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFc1bSDK {

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    public final String AFInAppEventParameterName;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public final String AFInAppEventType;
    public final AFc1aSDK valueOf;

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFc1bSDK)) {
            return false;
        }
        AFc1bSDK aFc1bSDK = (AFc1bSDK) p0;
        return Intrinsics.areEqual(this.AFInAppEventType, aFc1bSDK.AFInAppEventType) && Intrinsics.areEqual(this.AFInAppEventParameterName, aFc1bSDK.AFInAppEventParameterName) && this.valueOf == aFc1bSDK.valueOf;
    }

    public final int hashCode() {
        int hashCode = this.AFInAppEventType.hashCode() * 31;
        String str = this.AFInAppEventParameterName;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.valueOf.hashCode();
    }

    public final String toString() {
        return new StringBuilder("AFc1bSDK(AFInAppEventType=").append(this.AFInAppEventType).append(", AFInAppEventParameterName=").append(this.AFInAppEventParameterName).append(", valueOf=").append(this.valueOf).append(')').toString();
    }

    public AFc1bSDK(String str, String str2, AFc1aSDK aFc1aSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFc1aSDK, "");
        this.AFInAppEventType = str;
        this.AFInAppEventParameterName = str2;
        this.valueOf = aFc1aSDK;
    }
}
