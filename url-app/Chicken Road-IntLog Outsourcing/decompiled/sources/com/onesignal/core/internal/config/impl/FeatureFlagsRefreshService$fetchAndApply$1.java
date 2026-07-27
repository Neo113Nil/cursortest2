package com.onesignal.core.internal.config.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.core.internal.config.impl.FeatureFlagsRefreshService", f = "FeatureFlagsRefreshService.kt", l = {155}, m = "fetchAndApply")
/* loaded from: classes.dex */
public final class FeatureFlagsRefreshService$fetchAndApply$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FeatureFlagsRefreshService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureFlagsRefreshService$fetchAndApply$1(FeatureFlagsRefreshService featureFlagsRefreshService, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = featureFlagsRefreshService;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object fetchAndApply;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchAndApply = this.this$0.fetchAndApply(null, this);
        return fetchAndApply;
    }
}
