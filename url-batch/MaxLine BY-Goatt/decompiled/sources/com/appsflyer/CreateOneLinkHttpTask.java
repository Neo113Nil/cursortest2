package com.appsflyer;

import com.appsflyer.internal.AFc1rSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFc1ySDK;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
@Deprecated
/* loaded from: classes.dex */
public final class CreateOneLinkHttpTask implements AFc1uSDK {
    private final AFc1ySDK AFKeystoreWrapper;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    @Deprecated
    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask(AFc1ySDK aFc1ySDK) {
        aFc1ySDK.getClass();
        this.AFKeystoreWrapper = aFc1ySDK;
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final void valueOf(byte[] bArr, Map<String, String> map, int i) {
        bArr.getClass();
        if (new AFc1rSDK(bArr, map, 2000).AFInAppEventType()) {
            this.AFKeystoreWrapper.AFKeystoreWrapper();
        }
    }

    public CreateOneLinkHttpTask() {
    }
}
