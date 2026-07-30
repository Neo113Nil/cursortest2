package com.appsflyer.internal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFe1eSDK extends AFa1qSDK {
    public final AFd1vSDK afWarnLog;

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

    @Deprecated
    public AFe1eSDK() {
        this.afWarnLog = null;
    }
}
