package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLinkResult;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFd1jSDK extends AFd1uSDK<DeepLinkResult> {
    private DeepLinkResult afDebugLog;
    private final AFb1sSDK afRDLog;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: com.appsflyer.internal.AFd1jSDK$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AFInAppEventParameterName;

        static {
            int[] iArr = new int[DeepLinkResult.Status.values().length];
            AFInAppEventParameterName = iArr;
            try {
                iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFInAppEventParameterName[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AFInAppEventParameterName[DeepLinkResult.Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AFd1jSDK(AFb1sSDK aFb1sSDK) {
        super(AFd1vSDK.DLSDK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, "DdlSdk");
        this.afRDLog = aFb1sSDK;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final long AFKeystoreWrapper() {
        return 90000L;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final AFd1ySDK values() {
        DeepLinkResult AFLogger = this.afRDLog.AFLogger();
        this.afDebugLog = AFLogger;
        return AnonymousClass2.AFInAppEventParameterName[AFLogger.getStatus().ordinal()] != 1 ? this.afDebugLog.getError() == DeepLinkResult.Error.TIMEOUT ? AFd1ySDK.TIMEOUT : AFd1ySDK.FAILURE : AFd1ySDK.SUCCESS;
    }
}
