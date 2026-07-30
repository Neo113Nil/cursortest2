package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFf1zSDK extends AFe1cSDK {
    public AFf1zSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFd1vSDK AFInAppEventParameterName() {
        return AFd1vSDK.PURCHASE_VALIDATE;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFa1qSDK valueOf(String str) {
        return super.valueOf(AFa1qSDK.AFKeystoreWrapper(str));
    }
}
