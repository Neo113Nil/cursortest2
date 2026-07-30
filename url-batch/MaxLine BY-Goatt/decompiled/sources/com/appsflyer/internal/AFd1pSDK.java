package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFd1pSDK extends AFd1qSDK {
    public AFd1pSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFc1zSDK aFc1zSDK) {
        super(AFd1vSDK.ARS_VALIDATE, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, null, map, purchaseValidationCallback);
        this.valueOf.add(AFd1vSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1nSDK<String> AFKeystoreWrapper(String str) {
        return ((AFd1nSDK) this).afErrorLog.values(AFVersionDeclaration(), str);
    }
}
