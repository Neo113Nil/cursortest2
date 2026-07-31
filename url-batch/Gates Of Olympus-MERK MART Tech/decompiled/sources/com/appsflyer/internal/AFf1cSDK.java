package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class AFf1cSDK {
    public final AFd1xSDK AFInAppEventParameterName;
    public long AFInAppEventType;
    public AFh1oSDK AFKeystoreWrapper = null;
    public AFh1oSDK valueOf = AFInAppEventType();
    public long values;

    public AFf1cSDK(AFd1xSDK aFd1xSDK) {
        this.AFInAppEventParameterName = aFd1xSDK;
        this.AFInAppEventType = aFd1xSDK.AFInAppEventType("af_rc_timestamp", 0L);
        this.values = aFd1xSDK.AFInAppEventType("af_rc_max_age", 0L);
    }

    private AFh1oSDK AFInAppEventType() {
        String AFInAppEventType = this.AFInAppEventParameterName.AFInAppEventType("af_remote_config", (String) null);
        if (AFInAppEventType == null) {
            AFLogger.INSTANCE.d(AFg1jSDK.REMOTE_CONTROL, "No configuration found in cache");
            return null;
        }
        try {
            return new AFh1oSDK(new String(Base64.decode(AFInAppEventType, 2), Charset.defaultCharset()));
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1jSDK.REMOTE_CONTROL, "Error reading malformed configuration from cache, requires fetching from remote again", e, true);
            return null;
        }
    }
}
