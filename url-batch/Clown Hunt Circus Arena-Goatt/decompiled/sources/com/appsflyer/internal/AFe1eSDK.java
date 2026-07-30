package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFe1eSDK extends AFa1qSDK {
    public final AFd1vSDK afWarnLog;

    @Deprecated
    public AFe1eSDK() {
        this.afWarnLog = null;
    }

    public AFe1eSDK(String str, byte[] bArr, String str2, AFd1vSDK aFd1vSDK) {
        super(null, str, Boolean.FALSE);
        this.valueOf = str2;
        valueOf(bArr);
        this.afWarnLog = aFd1vSDK;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFd1vSDK AFInAppEventParameterName() {
        AFd1vSDK aFd1vSDK = this.afWarnLog;
        return aFd1vSDK != null ? aFd1vSDK : AFd1vSDK.CACHED_EVENT;
    }
}
