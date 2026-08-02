package com.stripe.android.financialconnections.features.networkinglinkloginwarmup;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class NetworkingLinkLoginWarmupViewModel$logErrors$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ NetworkingLinkLoginWarmupViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkingLinkLoginWarmupViewModel$logErrors$2(NetworkingLinkLoginWarmupViewModel networkingLinkLoginWarmupViewModel, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = networkingLinkLoginWarmupViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        NetworkingLinkLoginWarmupViewModel networkingLinkLoginWarmupViewModel = this.this$0;
        switch (i) {
            case 0:
                NetworkingLinkLoginWarmupViewModel$logErrors$2 networkingLinkLoginWarmupViewModel$logErrors$2 = new NetworkingLinkLoginWarmupViewModel$logErrors$2(networkingLinkLoginWarmupViewModel, continuation, 0);
                networkingLinkLoginWarmupViewModel$logErrors$2.L$0 = obj;
                return networkingLinkLoginWarmupViewModel$logErrors$2;
            case 1:
                NetworkingLinkLoginWarmupViewModel$logErrors$2 networkingLinkLoginWarmupViewModel$logErrors$22 = new NetworkingLinkLoginWarmupViewModel$logErrors$2(networkingLinkLoginWarmupViewModel, continuation, 1);
                networkingLinkLoginWarmupViewModel$logErrors$22.L$0 = obj;
                return networkingLinkLoginWarmupViewModel$logErrors$22;
            default:
                NetworkingLinkLoginWarmupViewModel$logErrors$2 networkingLinkLoginWarmupViewModel$logErrors$23 = new NetworkingLinkLoginWarmupViewModel$logErrors$2(networkingLinkLoginWarmupViewModel, continuation, 2);
                networkingLinkLoginWarmupViewModel$logErrors$23.L$0 = obj;
                return networkingLinkLoginWarmupViewModel$logErrors$23;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Throwable th = (Throwable) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((NetworkingLinkLoginWarmupViewModel$logErrors$2) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        NetworkingLinkLoginWarmupViewModel networkingLinkLoginWarmupViewModel = this.this$0;
        Throwable th = (Throwable) this.L$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                networkingLinkLoginWarmupViewModel.handleError.invoke("Error fetching payload", th, NetworkingLinkLoginWarmupViewModel.PANE, true);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                networkingLinkLoginWarmupViewModel.handleError.invoke("Error disabling networking", th, NetworkingLinkLoginWarmupViewModel.PANE, true);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                networkingLinkLoginWarmupViewModel.handleError.invoke("Error looking up account", th, NetworkingLinkLoginWarmupViewModel.PANE, false);
                break;
        }
        return Unit.INSTANCE;
    }
}
