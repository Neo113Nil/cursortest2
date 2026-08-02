package com.withpersona.sdk2.inquiry.integration.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2;
import com.knotapi.knot.utilities.Constants;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.integration.C0349IntegrationBrowserWorker_Factory;
import com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker;
import com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.integration.IntegrationPage;
import com.withpersona.sdk2.inquiry.integration.IntegrationView;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$PendingAction$OpenBrowser;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$State$Starting;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepStateManager;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.steps.ui.NestedUiStepKt;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationState;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import org.commonmark.node.Node;
import papa.InputEventTrigger;

/* loaded from: classes9.dex */
public final class IntegrationStepStateManager extends Node {
    public final Context applicationContext;
    public final IntegrationBrowserWorker.Factory integrationBrowserWorkerFactory;
    public final NavigationStateManager navigationStateManager;
    public final TrackingEventsLogger trackingEventsLogger;

    public interface Event {

        public final class Back implements Event {
            public static final Back INSTANCE = new Back();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Back);
            }

            public final int hashCode() {
                return -1679929975;
            }

            public final String toString() {
                return Constants.META_BACK_BUTTON;
            }
        }

        public final class Cancel implements Event {
            public static final Cancel INSTANCE = new Cancel();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Cancel);
            }

            public final int hashCode() {
                return 523949724;
            }

            public final String toString() {
                return "Cancel";
            }
        }

        public final class OpenBrowser implements Event {
            public static final OpenBrowser INSTANCE = new OpenBrowser();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenBrowser);
            }

            public final int hashCode() {
                return -323947876;
            }

            public final String toString() {
                return "OpenBrowser";
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrationStepStateManager(IntegrationWorkflow.Input input, SavedStateHandle savedStateHandle, Context context, NavigationStateManager navigationStateManager, IntegrationBrowserWorker.Factory factory, TrackingEventsLogger trackingEventsLogger) {
        super(input, savedStateHandle);
        input.getClass();
        savedStateHandle.getClass();
        context.getClass();
        navigationStateManager.getClass();
        factory.getClass();
        trackingEventsLogger.getClass();
        this.applicationContext = context;
        this.navigationStateManager = navigationStateManager;
        this.integrationBrowserWorkerFactory = factory;
        this.trackingEventsLogger = trackingEventsLogger;
        if (((SubtreeManager) this.lastChild).getState() == null) {
            SubtreeManager subtreeManager = (SubtreeManager) this.lastChild;
            subtreeManager.updateState(new IntegrationWorkflow$State$Starting(IntegrationWorkflow$PendingAction$OpenBrowser.INSTANCE));
        }
        SubtreeManager subtreeManager2 = (SubtreeManager) this.lastChild;
        IntegrationStepStateManager$$ExternalSyntheticLambda2 integrationStepStateManager$$ExternalSyntheticLambda2 = new IntegrationStepStateManager$$ExternalSyntheticLambda2(this, 1);
        subtreeManager2.children = integrationStepStateManager$$ExternalSyntheticLambda2;
        integrationStepStateManager$$ExternalSyntheticLambda2.invoke(subtreeManager2.getState());
        JobKt.launch$default((ContextScope) this.parent, null, null, new HazeSourceNode$launchPreDraw$1(this, null, 17), 3);
    }

    public final void handleState(IntegrationWorkflow.Input input, IntegrationWorkflow$State$Starting integrationWorkflow$State$Starting) {
        IntentFilter intentFilter;
        boolean z;
        if (integrationWorkflow$State$Starting == null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        IntegrationWorkflow$PendingAction$OpenBrowser integrationWorkflow$PendingAction$OpenBrowser = integrationWorkflow$State$Starting.pendingAction;
        final int i = 1;
        final int i2 = 0;
        if (integrationWorkflow$PendingAction$OpenBrowser != null) {
            Context context = this.applicationContext;
            context.getClass();
            String packageName = InputEventTrigger.Companion.getPackageName(context);
            if (packageName != null) {
                for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null && packageName.equals(serviceInfo.packageName) && (intentFilter = resolveInfo.filter) != null && intentFilter.hasCategory("androidx.browser.auth.category.AuthTab")) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            TrackingEventsLogger.DefaultImpls.logIntegrationEvent$default(this.trackingEventsLogger, new IntegrationEventData(IntegrationState.ShowingIntegration, input.flowUrl, Boolean.valueOf(z), null, 8, null), false, 2, null);
            SubtreeManager subtreeManager = (SubtreeManager) this.lastChild;
            String str = input.flowUrl;
            String str2 = input.redirectPath;
            NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType = input.integrationStepBrowserType;
            C0349IntegrationBrowserWorker_Factory c0349IntegrationBrowserWorker_Factory = ((IntegrationBrowserWorker_Factory_Impl) this.integrationBrowserWorkerFactory).delegateFactory;
            subtreeManager.runningWorker(new IntegrationBrowserWorker((Context) c0349IntegrationBrowserWorker_Factory.applicationContextProvider.get(), (ActivityResultLauncher) c0349IntegrationBrowserWorker_Factory.customTabsLauncherProvider.get(), str, str2, z, integrationStepBrowserType), new DialogHostKt$$ExternalSyntheticLambda2(this, input, z, 14));
        } else if (integrationWorkflow$PendingAction$OpenBrowser != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        boolean z2 = input.backStepEnabled;
        IntegrationPage integrationPage = input.startPage;
        boolean z3 = input.isSubmitting;
        boolean z4 = input.cancelButtonEnabled;
        boolean z5 = integrationWorkflow$PendingAction$OpenBrowser == null && !z3;
        NavigationStateManager navigationStateManager = this.navigationStateManager;
        NavigationStateManager.setState$default(navigationStateManager, z2, z4, z5, 8);
        integrationPage.getClass();
        UiComponentScreen uiComponentScreen = NestedUiStepKt.to(integrationPage);
        NavigationState navigationState = navigationStateManager.getNavigationState();
        Function0 function0 = new Function0(this) { // from class: com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepStateManager$$ExternalSyntheticLambda0
            public final /* synthetic */ IntegrationStepStateManager f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                IntegrationStepStateManager integrationStepStateManager = this.f$0;
                switch (i3) {
                    case 0:
                        integrationStepStateManager.onEvent(IntegrationStepStateManager.Event.Back.INSTANCE);
                        break;
                    default:
                        integrationStepStateManager.onEvent(IntegrationStepStateManager.Event.Cancel.INSTANCE);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        Function0 function02 = new Function0(this) { // from class: com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepStateManager$$ExternalSyntheticLambda0
            public final /* synthetic */ IntegrationStepStateManager f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                IntegrationStepStateManager integrationStepStateManager = this.f$0;
                switch (i3) {
                    case 0:
                        integrationStepStateManager.onEvent(IntegrationStepStateManager.Event.Back.INSTANCE);
                        break;
                    default:
                        integrationStepStateManager.onEvent(IntegrationStepStateManager.Event.Cancel.INSTANCE);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = integrationPage.openBrowserButton;
        IntegrationStepStateManager$$ExternalSyntheticLambda2 integrationStepStateManager$$ExternalSyntheticLambda2 = new IntegrationStepStateManager$$ExternalSyntheticLambda2(this, i2);
        if (str3 != null) {
            linkedHashMap.put(str3, integrationStepStateManager$$ExternalSyntheticLambda2);
        }
        IntegrationView integrationView = new IntegrationView(uiComponentScreen, navigationState, function0, function02, MapsKt___MapsKt.toList(linkedHashMap), integrationWorkflow$PendingAction$OpenBrowser != null || z3);
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.next;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, integrationView);
    }

    public final void onEvent(Event event) {
        SubtreeManager subtreeManager = (SubtreeManager) this.lastChild;
        if (event instanceof Event.Back) {
            setOutput(IntegrationWorkflow.Output.Back.INSTANCE);
            return;
        }
        if (event instanceof Event.Cancel) {
            setOutput(IntegrationWorkflow.Output.Cancel.INSTANCE);
            return;
        }
        if (!(event instanceof Event.OpenBrowser)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        WorkflowState state = subtreeManager.getState();
        if ((state instanceof IntegrationWorkflow$State$Starting ? (IntegrationWorkflow$State$Starting) state : null) == null) {
            return;
        }
        subtreeManager.updateState(new IntegrationWorkflow$State$Starting(IntegrationWorkflow$PendingAction$OpenBrowser.INSTANCE));
    }
}
