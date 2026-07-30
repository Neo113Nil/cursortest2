package com.appsflyer.appsflyersdk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o4.c;

@Metadata
/* loaded from: classes.dex */
public final class AppsFlyerPurchaseConnector implements c {
    public static final AppsFlyerPurchaseConnector INSTANCE = new AppsFlyerPurchaseConnector();

    private AppsFlyerPurchaseConnector() {
    }

    @Override // o4.c
    public void onAttachedToEngine(o4.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }

    @Override // o4.c
    public void onDetachedFromEngine(o4.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }
}
