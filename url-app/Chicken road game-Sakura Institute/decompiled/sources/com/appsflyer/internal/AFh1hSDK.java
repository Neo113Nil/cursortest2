package com.appsflyer.internal;

import A.AbstractC0017m;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFh1hSDK {
    public final String AFInAppEventParameterName;
    public final int AFInAppEventType;
    public List<String> AFKeystoreWrapper;
    public final String AFLogger;
    public long valueOf;
    public final float values;

    public AFh1hSDK(long j4, float f4, List<String> list, int i2, String str, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf = j4;
        this.values = f4;
        this.AFKeystoreWrapper = list;
        this.AFInAppEventType = i2;
        this.AFInAppEventParameterName = str;
        this.AFLogger = str2;
    }

    public final boolean AFInAppEventParameterName() {
        return TimeUnit.SECONDS.toMillis(this.valueOf) > AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().e().AFInAppEventType();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFh1hSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.model.rc.RDConfiguration");
        }
        AFh1hSDK aFh1hSDK = (AFh1hSDK) obj;
        return this.valueOf == aFh1hSDK.valueOf && this.values == aFh1hSDK.values && Intrinsics.a(this.AFKeystoreWrapper, aFh1hSDK.AFKeystoreWrapper) && this.AFInAppEventType == aFh1hSDK.AFInAppEventType && Intrinsics.a(this.AFInAppEventParameterName, aFh1hSDK.AFInAppEventParameterName) && Intrinsics.a(this.AFLogger, aFh1hSDK.AFLogger);
    }

    public final int hashCode() {
        return this.AFLogger.hashCode() + ((this.AFInAppEventParameterName.hashCode() + ((((this.AFKeystoreWrapper.hashCode() + AbstractC0017m.a(this.values, Long.hashCode(this.valueOf) * 31, 31)) * 31) + this.AFInAppEventType) * 31)) * 31);
    }
}
