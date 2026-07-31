package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLinkResult;

/* loaded from: classes3.dex */
public final class AFf1qSDK extends AFe1dSDK<DeepLinkResult> {
    private DeepLinkResult d;
    private final AFc1oSDK e;

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 90000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean AFKeystoreWrapper() {
        return false;
    }

    public AFf1qSDK(AFc1oSDK aFc1oSDK) {
        super(AFe1eSDK.DLSDK, new AFe1eSDK[]{AFe1eSDK.RC_CDN}, "DdlSdk");
        this.e = aFc1oSDK;
    }

    /* renamed from: com.appsflyer.internal.AFf1qSDK$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[DeepLinkResult.Status.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AFKeystoreWrapper[DeepLinkResult.Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK values() throws Exception {
        this.d = this.e.registerClient();
        if (AnonymousClass4.AFKeystoreWrapper[this.d.getStatus().ordinal()] == 1) {
            return AFe1bSDK.SUCCESS;
        }
        if (this.d.getError() == DeepLinkResult.Error.TIMEOUT) {
            return AFe1bSDK.TIMEOUT;
        }
        return AFe1bSDK.FAILURE;
    }
}
