package com.appsflyer;

import java.util.Map;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public interface AppsFlyerInAppPurchaseValidationCallback {
    void onInAppPurchaseValidationError(Map<String, ? extends Object> map);

    void onInAppPurchaseValidationFinished(Map<String, ? extends Object> map);
}
