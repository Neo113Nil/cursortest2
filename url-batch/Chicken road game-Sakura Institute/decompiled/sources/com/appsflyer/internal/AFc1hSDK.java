package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFc1hSDK implements AFc1kSDK {
    private final AFd1qSDK valueOf;

    public AFc1hSDK(AFd1qSDK aFd1qSDK) {
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        this.valueOf = aFd1qSDK;
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final Map<String, Object> AFInAppEventParameterName() {
        if (this.valueOf.values("deeplink_data")) {
            try {
                String AFKeystoreWrapper = this.valueOf.AFKeystoreWrapper("deeplink_data", (String) null);
                return AFKeystoreWrapper == null ? MapsKt.emptyMap() : AFj1sSDK.values(new JSONObject(AFKeystoreWrapper));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        return MapsKt.emptyMap();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void AFInAppEventType() {
        this.valueOf.AFKeystoreWrapper("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void values(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.valueOf.AFInAppEventParameterName("deeplink_data", new JSONObject(map).toString());
    }
}
