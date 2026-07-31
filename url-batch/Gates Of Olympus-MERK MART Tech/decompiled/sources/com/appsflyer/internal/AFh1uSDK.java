package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;

/* loaded from: classes3.dex */
public final class AFh1uSDK extends AFh1wSDK {
    public AFh1uSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFa1rSDK
    public final AFa1rSDK values(String str) {
        return super.values(AFInAppEventType(str));
    }

    @Override // com.appsflyer.internal.AFa1rSDK
    public final AFe1eSDK valueOf() {
        return AFe1eSDK.PURCHASE_VALIDATE;
    }
}
