package com.appsflyer.internal;

/* loaded from: classes3.dex */
public final class AFg1cSDK extends AFa1rSDK {
    public final AFe1eSDK afInfoLog;

    @Deprecated
    public AFg1cSDK() {
        this.afInfoLog = null;
    }

    public AFg1cSDK(String str, byte[] bArr, String str2, AFe1eSDK aFe1eSDK) {
        super(null, str, Boolean.FALSE);
        this.AFInAppEventParameterName = str2;
        AFInAppEventType(bArr);
        this.afInfoLog = aFe1eSDK;
    }

    @Override // com.appsflyer.internal.AFa1rSDK
    public final AFe1eSDK valueOf() {
        AFe1eSDK aFe1eSDK = this.afInfoLog;
        return aFe1eSDK != null ? aFe1eSDK : AFe1eSDK.CACHED_EVENT;
    }
}
