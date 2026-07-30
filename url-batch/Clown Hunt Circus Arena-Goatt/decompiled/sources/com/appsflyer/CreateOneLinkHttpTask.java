package com.appsflyer;

import com.appsflyer.internal.AFc1rSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFc1ySDK;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
/* loaded from: classes.dex */
public final class CreateOneLinkHttpTask implements AFc1uSDK {
    private final AFc1ySDK AFKeystoreWrapper;

    @Deprecated
    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask() {
    }

    public CreateOneLinkHttpTask(AFc1ySDK aFc1ySDK) {
        Intrinsics.checkNotNullParameter(aFc1ySDK, "");
        this.AFKeystoreWrapper = aFc1ySDK;
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final void valueOf(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFc1rSDK(bArr, map, 2000).AFInAppEventType()) {
            this.AFKeystoreWrapper.AFKeystoreWrapper();
        }
    }
}
