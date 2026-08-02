package com.stripe.android.financialconnections;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SweepGradient;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.core.util.GlobPattern;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetNativeActivityArgs;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.attestation.RealStandardIntegrityManagerFactory;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetActivity extends AppCompatActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public RealStandardIntegrityManagerFactory browserManager;
    public final ActivityResultLauncher startBrowserForResult;
    public final ActivityResultLauncher startNativeAuthFlowForResult;
    public final ViewModelLazy viewModel$delegate;

    public FinancialConnectionsSheetActivity() {
        final int i = 0;
        final int i2 = 1;
        this.viewModel$delegate = new ViewModelLazy(Reflection.factory.getOrCreateKotlinClass(FinancialConnectionsSheetViewModel.class), new Function0(this) { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ FinancialConnectionsSheetActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                FinancialConnectionsSheetActivity financialConnectionsSheetActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return financialConnectionsSheetActivity.getViewModelStore();
                    default:
                        return financialConnectionsSheetActivity.getDefaultViewModelCreationExtras();
                }
            }
        }, new Luhn$$ExternalSyntheticLambda0(16), new Function0(this) { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ FinancialConnectionsSheetActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                FinancialConnectionsSheetActivity financialConnectionsSheetActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return financialConnectionsSheetActivity.getViewModelStore();
                    default:
                        return financialConnectionsSheetActivity.getDefaultViewModelCreationExtras();
                }
            }
        });
        this.startBrowserForResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback(this) { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$$ExternalSyntheticLambda1
            public final /* synthetic */ FinancialConnectionsSheetActivity f$0;

            {
                this.f$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r1v1, types: [com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult] */
            /* JADX WARN: Type inference failed for: r1v6 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i3 = i;
                ?? r1 = 0;
                FinancialConnectionsSheetActivity financialConnectionsSheetActivity = this.f$0;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i3) {
                    case 0:
                        int i4 = FinancialConnectionsSheetActivity.$r8$clinit;
                        activityResult.getClass();
                        FinancialConnectionsSheetViewModel viewModel = financialConnectionsSheetActivity.getViewModel();
                        JobKt.launch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new FinancialConnectionsSheetViewModel$onResume$1(viewModel, r1, 1), 3);
                        break;
                    default:
                        int i5 = FinancialConnectionsSheetActivity.$r8$clinit;
                        activityResult.getClass();
                        FinancialConnectionsSheetViewModel viewModel2 = financialConnectionsSheetActivity.getViewModel();
                        Intent intent = activityResult.data;
                        if (intent != null) {
                            Parcelable parcelableExtra = intent.getParcelableExtra("result");
                            r1 = (FinancialConnectionsSheetActivityResult) (parcelableExtra instanceof FinancialConnectionsSheetActivityResult ? parcelableExtra : null);
                        }
                        if (activityResult.resultCode == -1 && r1 != 0) {
                            FinancialConnectionsSheetViewModel.finishWithResult$default(viewModel2, r1, 4);
                            break;
                        } else {
                            FinancialConnectionsSheetViewModel.finishWithResult$default(viewModel2, FinancialConnectionsSheetActivityResult.Canceled.INSTANCE, 4);
                            break;
                        }
                }
            }
        });
        this.startNativeAuthFlowForResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback(this) { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$$ExternalSyntheticLambda1
            public final /* synthetic */ FinancialConnectionsSheetActivity f$0;

            {
                this.f$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r1v1, types: [com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult] */
            /* JADX WARN: Type inference failed for: r1v6 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i3 = i2;
                ?? r1 = 0;
                FinancialConnectionsSheetActivity financialConnectionsSheetActivity = this.f$0;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i3) {
                    case 0:
                        int i4 = FinancialConnectionsSheetActivity.$r8$clinit;
                        activityResult.getClass();
                        FinancialConnectionsSheetViewModel viewModel = financialConnectionsSheetActivity.getViewModel();
                        JobKt.launch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new FinancialConnectionsSheetViewModel$onResume$1(viewModel, r1, 1), 3);
                        break;
                    default:
                        int i5 = FinancialConnectionsSheetActivity.$r8$clinit;
                        activityResult.getClass();
                        FinancialConnectionsSheetViewModel viewModel2 = financialConnectionsSheetActivity.getViewModel();
                        Intent intent = activityResult.data;
                        if (intent != null) {
                            Parcelable parcelableExtra = intent.getParcelableExtra("result");
                            r1 = (FinancialConnectionsSheetActivityResult) (parcelableExtra instanceof FinancialConnectionsSheetActivityResult ? parcelableExtra : null);
                        }
                        if (activityResult.resultCode == -1 && r1 != 0) {
                            FinancialConnectionsSheetViewModel.finishWithResult$default(viewModel2, r1, 4);
                            break;
                        } else {
                            FinancialConnectionsSheetViewModel.finishWithResult$default(viewModel2, FinancialConnectionsSheetActivityResult.Canceled.INSTANCE, 4);
                            break;
                        }
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleViewEffect(FinancialConnectionsSheetActivity financialConnectionsSheetActivity, GlobPattern globPattern, StripeBottomSheetState stripeBottomSheetState, ContinuationImpl continuationImpl) {
        FinancialConnectionsSheetActivity$handleViewEffect$1 financialConnectionsSheetActivity$handleViewEffect$1;
        int i;
        if (continuationImpl instanceof FinancialConnectionsSheetActivity$handleViewEffect$1) {
            financialConnectionsSheetActivity$handleViewEffect$1 = (FinancialConnectionsSheetActivity$handleViewEffect$1) continuationImpl;
            int i2 = financialConnectionsSheetActivity$handleViewEffect$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsSheetActivity$handleViewEffect$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsSheetActivity$handleViewEffect$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsSheetActivity$handleViewEffect$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (globPattern instanceof FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl) {
                        try {
                            ActivityResultLauncher activityResultLauncher = financialConnectionsSheetActivity.startBrowserForResult;
                            RealStandardIntegrityManagerFactory realStandardIntegrityManagerFactory = financialConnectionsSheetActivity.browserManager;
                            if (realStandardIntegrityManagerFactory == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("browserManager");
                                throw null;
                            }
                            Uri parse = Uri.parse(((FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl) globPattern).url);
                            parse.getClass();
                            activityResultLauncher.launch(realStandardIntegrityManagerFactory.createBrowserIntentForUrl(parse));
                        } catch (ActivityNotFoundException | SecurityException unused) {
                        }
                    } else if (globPattern instanceof FinancialConnectionsSheetViewEffect$FinishWithResult) {
                        financialConnectionsSheetActivity$handleViewEffect$1.L$0 = (FinancialConnectionsSheetViewEffect$FinishWithResult) globPattern;
                        financialConnectionsSheetActivity$handleViewEffect$1.label = 1;
                        if (stripeBottomSheetState.hide(financialConnectionsSheetActivity$handleViewEffect$1) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (!(globPattern instanceof FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow financialConnectionsSheetViewEffect$OpenNativeAuthFlow = (FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow) globPattern;
                        ActivityResultLauncher activityResultLauncher2 = financialConnectionsSheetActivity.startNativeAuthFlowForResult;
                        FinancialConnectionsSheetNativeActivityArgs financialConnectionsSheetNativeActivityArgs = new FinancialConnectionsSheetNativeActivityArgs(financialConnectionsSheetViewEffect$OpenNativeAuthFlow.flowType, financialConnectionsSheetViewEffect$OpenNativeAuthFlow.configuration, financialConnectionsSheetViewEffect$OpenNativeAuthFlow.initialSyncResponse, financialConnectionsSheetViewEffect$OpenNativeAuthFlow.elementsSessionContext);
                        Intent intent = new Intent(financialConnectionsSheetActivity, (Class<?>) FinancialConnectionsSheetNativeActivity.class);
                        intent.putExtra("FinancialConnectionsSheetNativeActivityArgs", financialConnectionsSheetNativeActivityArgs);
                        activityResultLauncher2.launch(intent);
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                globPattern = financialConnectionsSheetActivity$handleViewEffect$1.L$0;
                SafeTrace.throwOnFailure(obj);
                financialConnectionsSheetActivity.setResult(-1, new Intent().putExtras(BundleKt.bundleOf(new Pair("com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result", ((FinancialConnectionsSheetViewEffect$FinishWithResult) globPattern).result))));
                financialConnectionsSheetActivity.finish();
                return Unit.INSTANCE;
            }
        }
        financialConnectionsSheetActivity$handleViewEffect$1 = new FinancialConnectionsSheetActivity$handleViewEffect$1(financialConnectionsSheetActivity, continuationImpl);
        Object obj3 = financialConnectionsSheetActivity$handleViewEffect$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsSheetActivity$handleViewEffect$1.label;
        if (i != 0) {
        }
        financialConnectionsSheetActivity.setResult(-1, new Intent().putExtras(BundleKt.bundleOf(new Pair("com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result", ((FinancialConnectionsSheetViewEffect$FinishWithResult) globPattern).result))));
        financialConnectionsSheetActivity.finish();
        return Unit.INSTANCE;
    }

    public final void Loading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1849528791);
        int i2 = i & 1;
        if (gapComposer.shouldExecute(i2, i2 != 0)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 52.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
            ListItemKt.m4014LoadingSpinneruFdPcIQ(m285size3ABfNKs, RecyclerView.DECELERATION_RATE, new SweepGradient(9205357640488583168L, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).background), new Color(((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).spinnerNeutral)})), gapComposer, 6, 2);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FinancialConnectionsSheetActivity$$ExternalSyntheticLambda3(this, i);
        }
    }

    public final FinancialConnectionsSheetViewModel getViewModel() {
        return (FinancialConnectionsSheetViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object value;
        FinancialConnectionsSheetState financialConnectionsSheetState;
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        if (((FinancialConnectionsSheetActivityArgs) intent.getParcelableExtra("FinancialConnectionsSheetActivityArgs")) == null) {
            finish();
            return;
        }
        Application application = getApplication();
        application.getClass();
        this.browserManager = new RealStandardIntegrityManagerFactory(application, 1);
        if (bundle != null) {
            StateFlowImpl stateFlowImpl = getViewModel()._stateFlow;
            do {
                value = stateFlowImpl.getValue();
                financialConnectionsSheetState = (FinancialConnectionsSheetState) value;
                financialConnectionsSheetState.getClass();
            } while (!stateFlowImpl.compareAndSet(value, FinancialConnectionsSheetState.copy$default(financialConnectionsSheetState, true, null, null, null, 29)));
        }
        byte b = 0;
        ComponentActivityKt.setContent$default(this, new ComposableLambdaImpl(new FinancialConnectionsSheetActivity$$ExternalSyntheticLambda3(this, b, b), true, 906787691));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        FinancialConnectionsSheetViewModel viewModel = getViewModel();
        JobKt.launch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new WorkflowLayout$start$1(viewModel, intent, null, 24), 3);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        FinancialConnectionsSheetViewModel viewModel = getViewModel();
        JobKt.launch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new FinancialConnectionsSheetViewModel$onResume$1(viewModel, null, 0), 3);
    }
}
