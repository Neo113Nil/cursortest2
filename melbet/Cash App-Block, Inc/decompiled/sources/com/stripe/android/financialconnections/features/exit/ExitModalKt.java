package com.stripe.android.financialconnections.features.exit;

import android.os.Bundle;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.navigation.NavBackStackEntry;
import androidx.paging.PageFetcher$flow$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.auth.api.identity.Identity;
import com.squareup.cash.account.components.AccountUiViewKt$$ExternalSyntheticLambda14;
import com.squareup.scannerview.ScannerView;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.features.exit.ExitState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes8.dex */
public abstract class ExitModalKt {
    public static final ComposableLambdaImpl lambda$2101475679 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(2), false, 2101475679);

    /* renamed from: lambda$-60472120, reason: not valid java name */
    public static final ComposableLambdaImpl f803lambda$60472120 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(3), false, -60472120);

    static {
        new ComposableLambdaImpl(new ExitViewModel$$ExternalSyntheticLambda0(13), false, -1374968111);
    }

    public static final void ExitModal(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        int i2;
        navBackStackEntry.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(386579450);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(navBackStackEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            FinancialConnectionsSessionManifest.Pane pane = ExitViewModel.PANE;
            Bundle arguments$navigation_common_release = navBackStackEntry.impl.getArguments$navigation_common_release();
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ExitViewModel$Companion$$ExternalSyntheticLambda0 exitViewModel$Companion$$ExternalSyntheticLambda0 = new ExitViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, arguments$navigation_common_release, i3);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(ExitViewModel.class), exitViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ExitViewModel exitViewModel = (ExitViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(ExitViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            MutableState collectAsState = StateFlowsComposeKt.collectAsState(exitViewModel.stateFlow, gapComposer);
            ExitState.Payload payload = (ExitState.Payload) ((ExitState) collectAsState.getValue()).payload.invoke();
            if (payload == null) {
                gapComposer.startReplaceGroup(1781329288);
            } else {
                gapComposer.startReplaceGroup(1781329289);
                TextResource.StringId stringId = payload.description;
                boolean z = ((ExitState) collectAsState.getValue()).closing;
                boolean changedInstance = gapComposer.changedInstance(exitViewModel);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    PageFetcher$flow$1.AnonymousClass2.AnonymousClass1 anonymousClass1 = new PageFetcher$flow$1.AnonymousClass2.AnonymousClass1(0, exitViewModel, ExitViewModel.class, "onCloseConfirm", "onCloseConfirm()Lkotlinx/coroutines/Job;", 8, 3);
                    gapComposer.updateRememberedValue(anonymousClass1);
                    rememberedValue = anonymousClass1;
                }
                Function0 function0 = (Function0) rememberedValue;
                boolean changedInstance2 = gapComposer.changedInstance(exitViewModel);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ScannerView.AnonymousClass1(0, exitViewModel, ExitViewModel.class, "onCloseDismiss", "onCloseDismiss()V", 0, 18);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                ExitModalContent(stringId, z, function0, (Function0) ((KFunction) rememberedValue2), gapComposer, 0);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ExitModalKt$$ExternalSyntheticLambda0(navBackStackEntry, i, 0);
        }
    }

    public static final void ExitModalContent(TextResource.StringId stringId, boolean z, Function0 function0, Function0 function02, Composer composer, int i) {
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(863506792);
        int i2 = (gapComposer.changed(stringId) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= gapComposer.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            LayoutKt.Layout(null, new PaddingValuesImpl(24.0f, RecyclerView.DECELERATION_RATE, 24.0f, 24.0f), true, null, false, null, null, Expect_jvmKt.rememberComposableLambda(83429272, new AccountUiViewKt$$ExternalSyntheticLambda14(stringId, z2, function02, function0, 6), gapComposer), gapComposer, 805306752, 505);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(stringId, z, function0, function02, i, 26);
        }
    }
}
