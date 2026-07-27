package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFh1qSDK extends AFa1qSDK {

    /* renamed from: v, reason: collision with root package name */
    public final AFf1zSDK f5951v;

    @Deprecated
    public AFh1qSDK() {
        this.f5951v = null;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFf1zSDK values() {
        AFf1zSDK aFf1zSDK = this.f5951v;
        return aFf1zSDK != null ? aFf1zSDK : AFf1zSDK.CACHED_EVENT;
    }

    public AFh1qSDK(String str, byte[] bArr, String str2, AFf1zSDK aFf1zSDK) {
        super(null, str, Boolean.FALSE);
        this.AFKeystoreWrapper = str2;
        AFInAppEventType(bArr);
        this.f5951v = aFf1zSDK;
    }
}
