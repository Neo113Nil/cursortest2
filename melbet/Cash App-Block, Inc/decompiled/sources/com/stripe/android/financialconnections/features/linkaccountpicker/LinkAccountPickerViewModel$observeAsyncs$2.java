package com.stripe.android.financialconnections.features.linkaccountpicker;

import com.datadog.trace.core.util.Matchers;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.stripe.android.uicore.navigation.PopUpToBehavior;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class LinkAccountPickerViewModel$observeAsyncs$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ LinkAccountPickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LinkAccountPickerViewModel$observeAsyncs$2(LinkAccountPickerViewModel linkAccountPickerViewModel, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = linkAccountPickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        LinkAccountPickerViewModel linkAccountPickerViewModel = this.this$0;
        switch (i) {
            case 0:
                LinkAccountPickerViewModel$observeAsyncs$2 linkAccountPickerViewModel$observeAsyncs$2 = new LinkAccountPickerViewModel$observeAsyncs$2(linkAccountPickerViewModel, continuation, 0);
                linkAccountPickerViewModel$observeAsyncs$2.L$0 = obj;
                return linkAccountPickerViewModel$observeAsyncs$2;
            case 1:
                LinkAccountPickerViewModel$observeAsyncs$2 linkAccountPickerViewModel$observeAsyncs$22 = new LinkAccountPickerViewModel$observeAsyncs$2(linkAccountPickerViewModel, continuation, 1);
                linkAccountPickerViewModel$observeAsyncs$22.L$0 = obj;
                return linkAccountPickerViewModel$observeAsyncs$22;
            default:
                LinkAccountPickerViewModel$observeAsyncs$2 linkAccountPickerViewModel$observeAsyncs$23 = new LinkAccountPickerViewModel$observeAsyncs$2(linkAccountPickerViewModel, continuation, 2);
                linkAccountPickerViewModel$observeAsyncs$23.L$0 = obj;
                return linkAccountPickerViewModel$observeAsyncs$23;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((LinkAccountPickerViewModel$observeAsyncs$2) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        LinkAccountPickerViewModel linkAccountPickerViewModel = this.this$0;
        Object obj2 = this.L$0;
        switch (i) {
            case 0:
                LinkAccountPickerState.Payload payload = (LinkAccountPickerState.Payload) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (payload.accounts.isEmpty()) {
                    FinancialConnectionsSessionManifest.Pane pane = LinkAccountPickerViewModel.PANE;
                    FinancialConnectionsSessionManifest.Pane pane2 = payload.nextPaneOnNewAccount;
                    if (pane2 == null) {
                        pane2 = FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER;
                    }
                    NavigationManagerImpl.tryNavigateTo$default(linkAccountPickerViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(pane2), LinkAccountPickerViewModel.PANE), new PopUpToBehavior.Route(DestinationMappersKt.getDestination(FinancialConnectionsSessionManifest.Pane.CONSENT).getFullRoute()), 4);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = linkAccountPickerViewModel.eventTracker;
                Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = linkAccountPickerViewModel.logger;
                FinancialConnectionsSessionManifest.Pane pane3 = LinkAccountPickerViewModel.PANE;
                Matchers.logError(financialConnectionsAnalyticsTrackerImpl, "Error fetching payload", (Throwable) obj2, logger$Companion$NOOP_LOGGER$1, pane3);
                NavigationManagerImpl.tryNavigateTo$default(linkAccountPickerViewModel.navigationManager, Destination.invoke$default(Destination.InstitutionPicker.INSTANCE, pane3), null, 6);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Matchers.logError(linkAccountPickerViewModel.eventTracker, "Error selecting networked account", (Throwable) obj2, linkAccountPickerViewModel.logger, LinkAccountPickerViewModel.PANE);
                break;
        }
        return Unit.INSTANCE;
    }
}
