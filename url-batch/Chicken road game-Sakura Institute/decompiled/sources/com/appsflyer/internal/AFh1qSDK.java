package com.appsflyer.internal;

/* loaded from: classes3.dex */
public final class AFh1qSDK extends AFa1qSDK {
    public final AFf1zSDK v;

    @Deprecated
    public AFh1qSDK() {
        this.v = null;
    }

    public AFh1qSDK(String str, byte[] bArr, String str2, AFf1zSDK aFf1zSDK) {
        super(null, str, Boolean.FALSE);
        this.AFKeystoreWrapper = str2;
        AFInAppEventType(bArr);
        this.v = aFf1zSDK;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFf1zSDK values() {
        AFf1zSDK aFf1zSDK = this.v;
        return aFf1zSDK != null ? aFf1zSDK : AFf1zSDK.CACHED_EVENT;
    }
}
