package com.stripe.android.financialconnections.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.material.CardKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import com.squareup.cash.clientrouting.RealClientRouteRouter$route$1;
import com.squareup.cash.ui.drawable.RippleDrawableKt;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda16;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetNativeActivityArgs;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.model.ConsumerSession$$ExternalSyntheticLambda0;
import com.stripe.android.uicore.image.DefaultStripeImageLoader;
import com.stripe.android.uicore.navigation.NavigationEffectsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import com.stripe.attestation.RealStandardIntegrityManagerFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import nl.dionsegijn.konfetti.emitters.RenderSystem;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetNativeActivity extends AppCompatActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public RealStandardIntegrityManagerFactory browserManager;
    public DefaultStripeImageLoader imageLoader;
    public final ViewModelLazy viewModel$delegate;
    public ActivityVisibilityObserver visibilityObserver;

    public FinancialConnectionsSheetNativeActivity() {
        final int i = 0;
        final int i2 = 1;
        this.viewModel$delegate = new ViewModelLazy(Reflection.factory.getOrCreateKotlinClass(FinancialConnectionsSheetNativeViewModel.class), new Function0(this) { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ FinancialConnectionsSheetNativeActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return financialConnectionsSheetNativeActivity.getViewModelStore();
                    default:
                        return financialConnectionsSheetNativeActivity.getDefaultViewModelCreationExtras();
                }
            }
        }, new ConsumerSession$$ExternalSyntheticLambda0(17), new Function0(this) { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ FinancialConnectionsSheetNativeActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return financialConnectionsSheetNativeActivity.getViewModelStore();
                    default:
                        return financialConnectionsSheetNativeActivity.getDefaultViewModelCreationExtras();
                }
            }
        });
    }

    public final void NavHost(FinancialConnectionsSessionManifest.Pane pane, boolean z, Composer composer, int i) {
        GapComposer gapComposer;
        pane.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(915147200);
        int i2 = i | (gapComposer2.changed(pane.ordinal()) ? 4 : 2) | (gapComposer2.changed(z) ? 32 : 16) | (gapComposer2.changedInstance(this) ? 256 : 128);
        int i3 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                RealStandardIntegrityManagerFactory realStandardIntegrityManagerFactory = this.browserManager;
                if (realStandardIntegrityManagerFactory == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("browserManager");
                    throw null;
                }
                rememberedValue = new CustomTabUriHandler(context, realStandardIntegrityManagerFactory);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            CustomTabUriHandler customTabUriHandler = (CustomTabUriHandler) rememberedValue;
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = DestinationMappersKt.getDestination(pane);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Destination destination = (Destination) rememberedValue2;
            MutableState collectAsState = StateFlowsComposeKt.collectAsState(getViewModel().topAppBarState, gapComposer2);
            ModalBottomSheetState rememberModalBottomSheetState = CardKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, gapComposer2, 3078, 6);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new BottomSheetNavigator(rememberModalBottomSheetState);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            BottomSheetNavigator bottomSheetNavigator = (BottomSheetNavigator) rememberedValue3;
            NavHostController rememberNavController = RippleDrawableKt.rememberNavController(new Navigator[]{bottomSheetNavigator}, gapComposer2);
            RealWebSocket$connect$1 rememberKeyboardController = NavigationEffectsKt.rememberKeyboardController(gapComposer2);
            ReadonlySharedFlow readonlySharedFlow = getViewModel().navigationFlow;
            boolean changedInstance = gapComposer2.changedInstance(this);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new FinancialConnectionsSheetNativeActivity$$ExternalSyntheticLambda2(this, i3);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Function1 function1 = (Function1) rememberedValue4;
            gapComposer = gapComposer2;
            NavigationEffectsKt.NavigationEffects(readonlySharedFlow, rememberNavController, rememberKeyboardController, null, function1, gapComposer, 0);
            ProvidedValue defaultProvidedValue$runtime = FinancialConnectionsSheetNativeActivityKt.LocalTestMode.defaultProvidedValue$runtime(Boolean.valueOf(z));
            ProvidedValue defaultProvidedValue$runtime2 = FinancialConnectionsSheetNativeActivityKt.LocalNavHostController.defaultProvidedValue$runtime(rememberNavController);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = FinancialConnectionsSheetNativeActivityKt.LocalImageLoader;
            DefaultStripeImageLoader defaultStripeImageLoader = this.imageLoader;
            if (defaultStripeImageLoader == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
                throw null;
            }
            Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, defaultProvidedValue$runtime2, staticProvidableCompositionLocal.defaultProvidedValue$runtime(defaultStripeImageLoader), CompositionLocalsKt.LocalUriHandler.defaultProvidedValue$runtime(customTabUriHandler), FinancialConnectionsSheetNativeActivityKt.LocalTopAppBarHost.defaultProvidedValue$runtime(getViewModel())}, Expect_jvmKt.rememberComposableLambda(-789697280, new WalletHomeViewKt$$ExternalSyntheticLambda4(this, rememberNavController, bottomSheetNavigator, collectAsState, destination, 6), gapComposer), gapComposer, 56);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda16(this, pane, z, i, 11);
        }
    }

    public final FinancialConnectionsSheetNativeViewModel getViewModel() {
        return (FinancialConnectionsSheetNativeViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        FinancialConnectionsSheetNativeActivityArgs financialConnectionsSheetNativeActivityArgs = (FinancialConnectionsSheetNativeActivityArgs) intent.getParcelableExtra("FinancialConnectionsSheetNativeActivityArgs");
        if (financialConnectionsSheetNativeActivityArgs == null) {
            finish();
            return;
        }
        DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = getViewModel().activityRetainedComponent;
        this.imageLoader = (DefaultStripeImageLoader) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.providesImageLoaderProvider.get();
        this.browserManager = new RealStandardIntegrityManagerFactory(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.application, 1);
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), null, new FinancialConnectionsSheetNativeActivity$$ExternalSyntheticLambda2(this, 0), 3);
        ActivityVisibilityObserver activityVisibilityObserver = new ActivityVisibilityObserver(new RenderSystem.AnonymousClass1(0, getViewModel(), FinancialConnectionsSheetNativeViewModel.class, "onBackgrounded", "onBackgrounded()V", 0, 7), new RenderSystem.AnonymousClass1(0, getViewModel(), FinancialConnectionsSheetNativeViewModel.class, "onForegrounded", "onForegrounded()V", 0, 8));
        getLifecycle().addObserver(activityVisibilityObserver);
        this.visibilityObserver = activityVisibilityObserver;
        JobKt.launch$default(ViewModelKt.getCoroutineScope(getLifecycle()), null, null, new FinancialConnectionsSheetNativeActivity$observeViewEffects$1(this, null), 3);
        ComponentActivityKt.setContent$default(this, new ComposableLambdaImpl(new Radiography$$ExternalSyntheticLambda1(26, financialConnectionsSheetNativeActivityArgs, this), true, -32931369));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ActivityVisibilityObserver activityVisibilityObserver = this.visibilityObserver;
        if (activityVisibilityObserver != null) {
            getLifecycle().removeObserver(activityVisibilityObserver);
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        FinancialConnectionsSheetNativeViewModel viewModel = getViewModel();
        JobKt.launch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new RealClientRouteRouter$route$1(viewModel, intent, null), 3);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        FinancialConnectionsSheetNativeViewModel viewModel = getViewModel();
        JobKt.launch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new WorkerWorkflow$render$1(viewModel, null, 28), 3);
    }
}
