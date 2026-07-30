package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLinkResult;

/* loaded from: classes.dex */
public final class AFd1jSDK extends AFd1uSDK<DeepLinkResult> {
    private DeepLinkResult afDebugLog;
    private final AFb1sSDK afRDLog;

    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final long AFKeystoreWrapper() {
        return 90000L;
    }

    public AFd1jSDK(AFb1sSDK aFb1sSDK) {
        super(AFd1vSDK.DLSDK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, "DdlSdk");
        this.afRDLog = aFb1sSDK;
    }

    /* renamed from: com.appsflyer.internal.AFd1jSDK$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
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

    @Override // com.appsflyer.internal.AFd1uSDK
    public final AFd1ySDK values() throws Exception {
        this.afDebugLog = this.afRDLog.AFLogger();
        if (AnonymousClass2.AFInAppEventParameterName[this.afDebugLog.getStatus().ordinal()] == 1) {
            return AFd1ySDK.SUCCESS;
        }
        if (this.afDebugLog.getError() == DeepLinkResult.Error.TIMEOUT) {
            return AFd1ySDK.TIMEOUT;
        }
        return AFd1ySDK.FAILURE;
    }
}
