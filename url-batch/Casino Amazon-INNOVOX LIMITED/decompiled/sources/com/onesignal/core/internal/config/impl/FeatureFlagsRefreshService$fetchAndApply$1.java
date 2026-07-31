package com.onesignal.core.internal.config.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FeatureFlagsRefreshService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.internal.config.impl.FeatureFlagsRefreshService", f = "FeatureFlagsRefreshService.kt", i = {0}, l = {155}, m = "fetchAndApply", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class FeatureFlagsRefreshService$fetchAndApply$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FeatureFlagsRefreshService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeatureFlagsRefreshService$fetchAndApply$1(FeatureFlagsRefreshService featureFlagsRefreshService, Continuation<? super FeatureFlagsRefreshService$fetchAndApply$1> continuation) {
        super(continuation);
        this.this$0 = featureFlagsRefreshService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchAndApply;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchAndApply = this.this$0.fetchAndApply(null, this);
        return fetchAndApply;
    }
}
