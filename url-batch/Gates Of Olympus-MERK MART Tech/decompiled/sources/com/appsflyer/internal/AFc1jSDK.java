package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFc1jSDK implements AFc1qSDK {
    private final AFd1xSDK AFInAppEventType;

    public AFc1jSDK(AFd1xSDK aFd1xSDK) {
        Intrinsics.checkNotNullParameter(aFd1xSDK, "");
        this.AFInAppEventType = aFd1xSDK;
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final Map<String, Object> AFInAppEventParameterName() {
        if (this.AFInAppEventType.valueOf("deeplink_data")) {
            try {
                String AFInAppEventType = this.AFInAppEventType.AFInAppEventType("deeplink_data", (String) null);
                return AFInAppEventType == null ? MapsKt.emptyMap() : AFi1jSDK.AFKeystoreWrapper(new JSONObject(AFInAppEventType));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        return MapsKt.emptyMap();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFInAppEventType() {
        this.AFInAppEventType.AFKeystoreWrapper("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFInAppEventType(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.AFInAppEventType.valueOf("deeplink_data", new JSONObject(map).toString());
    }
}
