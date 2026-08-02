package com.stripe.android.financialconnections.features.networkinglinkverification;

import androidx.lifecycle.ViewModelKt;
import com.datadog.trace.core.util.Matchers;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class NetworkingLinkVerificationViewModel$observeAsyncs$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ NetworkingLinkVerificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkingLinkVerificationViewModel$observeAsyncs$2(NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = networkingLinkVerificationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel = this.this$0;
        switch (i) {
            case 0:
                NetworkingLinkVerificationViewModel$observeAsyncs$2 networkingLinkVerificationViewModel$observeAsyncs$2 = new NetworkingLinkVerificationViewModel$observeAsyncs$2(networkingLinkVerificationViewModel, continuation, 0);
                networkingLinkVerificationViewModel$observeAsyncs$2.L$0 = obj;
                return networkingLinkVerificationViewModel$observeAsyncs$2;
            default:
                NetworkingLinkVerificationViewModel$observeAsyncs$2 networkingLinkVerificationViewModel$observeAsyncs$22 = new NetworkingLinkVerificationViewModel$observeAsyncs$2(networkingLinkVerificationViewModel, continuation, 1);
                networkingLinkVerificationViewModel$observeAsyncs$22.L$0 = obj;
                return networkingLinkVerificationViewModel$observeAsyncs$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((NetworkingLinkVerificationViewModel$observeAsyncs$2) create((NetworkingLinkVerificationState.Payload) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((NetworkingLinkVerificationViewModel$observeAsyncs$2) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel = this.this$0;
        Object obj2 = this.L$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(ViewModelKt.getViewModelScope(networkingLinkVerificationViewModel), null, null, new ShimmerModifierKt$shimmer$1$1((NetworkingLinkVerificationState.Payload) obj2, networkingLinkVerificationViewModel, null, 4), 3);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Matchers.logError(networkingLinkVerificationViewModel.analyticsTracker, "Error starting verification", (Throwable) obj2, networkingLinkVerificationViewModel.logger, NetworkingLinkVerificationViewModel.PANE);
                break;
        }
        return Unit.INSTANCE;
    }
}
