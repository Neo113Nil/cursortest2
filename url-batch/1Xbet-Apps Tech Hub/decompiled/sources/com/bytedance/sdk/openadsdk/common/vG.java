package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;

/* compiled from: CommonHelper.java */
/* loaded from: classes2.dex */
public class vG {
    private static boolean pvs = false;

    public static void pvs(boolean z) {
        pvs = z;
    }

    public static ISDKTypeFactory pvs(PAGLoadListener pAGLoadListener) {
        if (pvs) {
            if (pAGLoadListener != null) {
                pAGLoadListener.onError(-1, PAGErrorCode.LOAD_SDK_DISABLE_MSG);
            }
            return null;
        }
        ISDKTypeFactory sdkTypeFactory = SDKTypeConfig.getSdkTypeFactory();
        if (sdkTypeFactory != null) {
            return sdkTypeFactory;
        }
        if (pAGLoadListener != null) {
            pAGLoadListener.onError(PAGErrorCode.LOAD_FACTORY_NULL_CODE, PAGErrorCode.LOAD_FACTORY_NULL_MSG);
        }
        return null;
    }

    public static boolean pvs() {
        return pvs;
    }
}
