package com.onesignal.core.internal.config.impl;

import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.debug.internal.logging.Logging;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;

/* compiled from: FeatureFlagsRefreshService.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.internal.config.impl.FeatureFlagsRefreshService$restartForegroundPolling$1$1", f = "FeatureFlagsRefreshService.kt", i = {}, l = {140, 147}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class FeatureFlagsRefreshService$restartForegroundPolling$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FeatureFlagsRefreshService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeatureFlagsRefreshService$restartForegroundPolling$1$1(FeatureFlagsRefreshService featureFlagsRefreshService, Continuation<? super FeatureFlagsRefreshService$restartForegroundPolling$1$1> continuation) {
        super(1, continuation);
        this.this$0 = featureFlagsRefreshService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FeatureFlagsRefreshService$restartForegroundPolling$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((FeatureFlagsRefreshService$restartForegroundPolling$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r6.this$0.getRefreshIntervalMs(), r6) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r7 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0078 -> B:12:0x0022). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        IApplicationService iApplicationService;
        ConfigModelStore configModelStore;
        Object fetchAndApply;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Logging.warn("FeatureFlagsRefreshService: fetch failed", e2);
                }
                this.label = 2;
            } else if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        ResultKt.throwOnFailure(obj);
        if (JobKt.isActive(get$context())) {
            iApplicationService = this.this$0.applicationService;
            if (iApplicationService.isInForeground()) {
                configModelStore = this.this$0.configModelStore;
                String appId = configModelStore.getModel().getAppId();
                if (appId.length() > 0) {
                    this.label = 1;
                    fetchAndApply = this.this$0.fetchAndApply(appId, this);
                }
                this.label = 2;
            }
        }
        return Unit.INSTANCE;
    }
}
