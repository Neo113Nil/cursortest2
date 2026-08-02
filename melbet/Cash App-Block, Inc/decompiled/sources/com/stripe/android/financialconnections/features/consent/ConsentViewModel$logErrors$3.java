package com.stripe.android.financialconnections.features.consent;

import com.datadog.trace.core.util.Matchers;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationKt;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class ConsentViewModel$logErrors$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ ConsentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConsentViewModel$logErrors$3(ConsentViewModel consentViewModel, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = consentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ConsentViewModel consentViewModel = this.this$0;
        switch (i) {
            case 0:
                ConsentViewModel$logErrors$3 consentViewModel$logErrors$3 = new ConsentViewModel$logErrors$3(consentViewModel, continuation, 0);
                consentViewModel$logErrors$3.L$0 = obj;
                return consentViewModel$logErrors$3;
            case 1:
                ConsentViewModel$logErrors$3 consentViewModel$logErrors$32 = new ConsentViewModel$logErrors$3(consentViewModel, continuation, 1);
                consentViewModel$logErrors$32.L$0 = obj;
                return consentViewModel$logErrors$32;
            default:
                ConsentViewModel$logErrors$3 consentViewModel$logErrors$33 = new ConsentViewModel$logErrors$3(consentViewModel, continuation, 2);
                consentViewModel$logErrors$33.L$0 = obj;
                return consentViewModel$logErrors$33;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((ConsentViewModel$logErrors$3) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((ConsentViewModel$logErrors$3) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((ConsentViewModel$logErrors$3) create((HandleClickableUrl.DeeplinkPayload) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ConsentViewModel consentViewModel = this.this$0;
        Object obj2 = this.L$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                consentViewModel.logger.error("Error retrieving consent content", (Throwable) obj2);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Matchers.logError(consentViewModel.eventTracker, "Error accepting consent", (Throwable) obj2, consentViewModel.logger, FinancialConnectionsSessionManifest.Pane.CONSENT);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                NavigationManagerImpl navigationManagerImpl = consentViewModel.navigationManager;
                Destination.NetworkingLinkLoginWarmup networkingLinkLoginWarmup = Destination.NetworkingLinkLoginWarmup.INSTANCE;
                FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.CONSENT;
                Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("next_pane_on_disable_networking", ((HandleClickableUrl.DeeplinkPayload) obj2).nextPaneOrDrawerOnSecondaryCta));
                networkingLinkLoginWarmup.getClass();
                pane.getClass();
                mapOf.getClass();
                NavigationManagerImpl.tryNavigateTo$default(navigationManagerImpl, DestinationKt.appendParamValues(networkingLinkLoginWarmup.route, MapsKt__MapsKt.plus(mapOf, new Pair("referrer", pane.getValue()))), null, 6);
                break;
        }
        return Unit.INSTANCE;
    }
}
