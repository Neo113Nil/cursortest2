package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH×\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\tX\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0007¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1iSDK;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1kSDK;", "AFKeystoreWrapper", "Lcom/appsflyer/internal/AFe1kSDK;", "values", "AFInAppEventType", "Ljava/lang/String;", "valueOf", "AFInAppEventParameterName", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFe1kSDK;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AFe1iSDK {

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    public final String valueOf;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public final AFe1kSDK values;

    /* renamed from: values, reason: from kotlin metadata */
    public final String AFInAppEventParameterName;

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFe1iSDK)) {
            return false;
        }
        AFe1iSDK aFe1iSDK = (AFe1iSDK) p0;
        return Intrinsics.areEqual(this.valueOf, aFe1iSDK.valueOf) && Intrinsics.areEqual(this.AFInAppEventParameterName, aFe1iSDK.AFInAppEventParameterName) && this.values == aFe1iSDK.values;
    }

    public final int hashCode() {
        int hashCode = this.valueOf.hashCode() * 31;
        String str = this.AFInAppEventParameterName;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.values.hashCode();
    }

    public final String toString() {
        return new StringBuilder("AFe1iSDK(valueOf=").append(this.valueOf).append(", AFInAppEventParameterName=").append(this.AFInAppEventParameterName).append(", values=").append(this.values).append(')').toString();
    }

    public AFe1iSDK(String str, String str2, AFe1kSDK aFe1kSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFe1kSDK, "");
        this.valueOf = str;
        this.AFInAppEventParameterName = str2;
        this.values = aFe1kSDK;
    }
}
