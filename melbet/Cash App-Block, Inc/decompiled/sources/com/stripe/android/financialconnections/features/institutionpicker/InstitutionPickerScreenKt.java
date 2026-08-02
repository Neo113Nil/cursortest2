package com.stripe.android.financialconnections.features.institutionpicker;

import android.os.Bundle;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.IconKt;
import androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda4;
import androidx.compose.material.TextKt;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.navigation.NavBackStackEntry;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.auth.api.identity.Identity;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import com.squareup.cash.db2.profile.documents.DocumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.NoteInputViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.payments.views.composer.RotatingTitleIconKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda16;
import com.squareup.cash.wallet.views.HeroCardNullStateKt$$ExternalSyntheticLambda8;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import com.squareup.cash.work.views.pay.PayCellViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda16;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda4;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.android.ViewGroups$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.common.ListItemKt$$ExternalSyntheticLambda2;
import com.stripe.android.financialconnections.features.exit.ExitModalKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.DragHandleKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.ui.components.StringAnnotation;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.stripe.android.uicore.image.StripeImageKt$$ExternalSyntheticLambda3;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import kotlin.text.MatchGroup;
import kotlin.text.MatcherMatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes8.dex */
public abstract class InstitutionPickerScreenKt {
    public static final ComposableLambdaImpl lambda$973582777 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(4), false, 973582777);

    /* renamed from: lambda$-1974987728, reason: not valid java name */
    public static final ComposableLambdaImpl f805lambda$1974987728 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(5), false, -1974987728);
    public static final ComposableLambdaImpl lambda$1808967409 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(6), false, 1808967409);

    /* renamed from: lambda$-156477903, reason: not valid java name */
    public static final ComposableLambdaImpl f804lambda$156477903 = new ComposableLambdaImpl(new ExitViewModel$$ExternalSyntheticLambda0(14), false, -156477903);
    public static final ComposableLambdaImpl lambda$1104674433 = new ComposableLambdaImpl(new ExitViewModel$$ExternalSyntheticLambda0(15), false, 1104674433);

    public static final void ClearSearchButton(Function1 function1, FinancialConnectionsColors financialConnectionsColors, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1929891156);
        int i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i | (gapComposer.changed(financialConnectionsColors) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 16.0f);
            Role role = new Role(0);
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ShiftListViewKt$$ExternalSyntheticLambda4(12, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(ImageKt.m183clickableoSLSa3U$default(m285size3ABfNKs, false, null, role, (Function0) rememberedValue, 11), financialConnectionsColors.textSubdued, RoundedCornerShapeKt.CircleShape), 2.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            IconKt.m492Iconww6aTOc(Countries.painterResource(R.drawable.stripe_ic_material_cancel, 0, gapComposer), "Clear search", null, financialConnectionsColors.background, gapComposer, Painter.$stable | 48, 4);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Radiography$$ExternalSyntheticLambda1(function1, financialConnectionsColors, i, 19);
        }
    }

    public static final void InstitutionPickerContent(LazyListState lazyListState, Async async, Async async2, String str, Function1 function1, Function2 function2, Function0 function0, Function0 function02, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-941302567);
        int i2 = i | (gapComposer.changed(lazyListState) ? 4 : 2) | (gapComposer.changedInstance(async) ? 32 : 16) | (gapComposer.changedInstance(async2) ? 256 : 128) | (gapComposer.changed((Object) null) ? 2048 : 1024) | (gapComposer.changed(str) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changedInstance(function0) ? 8388608 : 4194304) | (gapComposer.changedInstance(function02) ? 67108864 : 33554432);
        if (gapComposer.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            if ((async instanceof Async.Uninitialized) || (async instanceof Async.Loading) || (async instanceof Async.Fail)) {
                gapComposer.startReplaceGroup(1595710317);
                ListItemKt.FullScreenGenericLoading(gapComposer, 0);
                gapComposer.end(false);
            } else {
                if (!(async instanceof Async.Success)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1595707915, false);
                }
                gapComposer.startReplaceGroup(1595712493);
                int i3 = i2 >> 6;
                LoadedContent(lazyListState, str, function1, async2, function2, (InstitutionPickerState.Payload) ((Async.Success) async).value, function0, function02, gapComposer, (i2 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & (i2 << 6)) | ((i2 >> 3) & 458752) | (29360128 & i2) | (i2 & 234881024));
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateInputKt$$ExternalSyntheticLambda1(lazyListState, async, async2, str, function1, function2, function0, function02, i);
        }
    }

    public static final void InstitutionPickerScreen(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        int i2;
        navBackStackEntry.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(773007774);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(navBackStackEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            FinancialConnectionsSessionManifest.Pane pane = InstitutionPickerViewModel.PANE;
            Bundle arguments$navigation_common_release = navBackStackEntry.impl.getArguments$navigation_common_release();
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ExitViewModel$Companion$$ExternalSyntheticLambda0 exitViewModel$Companion$$ExternalSyntheticLambda0 = new ExitViewModel$Companion$$ExternalSyntheticLambda0(arguments$navigation_common_release, daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(InstitutionPickerViewModel.class), exitViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            InstitutionPickerViewModel institutionPickerViewModel = (InstitutionPickerViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(InstitutionPickerViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            MutableState collectAsState = StateFlowsComposeKt.collectAsState(institutionPickerViewModel.stateFlow, gapComposer);
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
            Async async = ((InstitutionPickerState) collectAsState.getValue()).payload;
            Async async2 = ((InstitutionPickerState) collectAsState.getValue()).searchInstitutions;
            ((InstitutionPickerState) collectAsState.getValue()).getClass();
            String str = ((InstitutionPickerState) collectAsState.getValue()).selectedInstitutionId;
            boolean changedInstance = gapComposer.changedInstance(institutionPickerViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1 = new TextFieldUIKt$TextField$4$1(1, institutionPickerViewModel, InstitutionPickerViewModel.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0, 4);
                gapComposer.updateRememberedValue(textFieldUIKt$TextField$4$1);
                rememberedValue = textFieldUIKt$TextField$4$1;
            }
            Function1 function1 = (Function1) ((KFunction) rememberedValue);
            boolean changedInstance2 = gapComposer.changedInstance(institutionPickerViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                WorkApplet$applet$1 workApplet$applet$1 = new WorkApplet$applet$1(2, institutionPickerViewModel, InstitutionPickerViewModel.class, "onInstitutionSelected", "onInstitutionSelected(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Z)V", 0, 25);
                gapComposer.updateRememberedValue(workApplet$applet$1);
                rememberedValue2 = workApplet$applet$1;
            }
            Function2 function2 = (Function2) ((KFunction) rememberedValue2);
            boolean changedInstance3 = gapComposer.changedInstance(institutionPickerViewModel);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                ScannerView.AnonymousClass1 anonymousClass1 = new ScannerView.AnonymousClass1(0, institutionPickerViewModel, InstitutionPickerViewModel.class, "onManualEntryClick", "onManualEntryClick()V", 0, 19);
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue3 = anonymousClass1;
            }
            Function0 function0 = (Function0) ((KFunction) rememberedValue3);
            boolean changedInstance4 = gapComposer.changedInstance(institutionPickerViewModel);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance4 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new ScannerView.AnonymousClass1(0, institutionPickerViewModel, InstitutionPickerViewModel.class, "onScrollChanged", "onScrollChanged()V", 0, 20);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            InstitutionPickerContent(rememberLazyListState, async, async2, str, function1, function2, function0, (Function0) ((KFunction) rememberedValue4), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ExitModalKt$$ExternalSyntheticLambda0(navBackStackEntry, i, 2);
        }
    }

    public static final void InstitutionResultShimmer(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1566161485);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            ListItemKt.LoadingShimmerEffect(Expect_jvmKt.rememberComposableLambda(-1621225646, new ListItemKt$$ExternalSyntheticLambda2(modifier, 5), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DragHandleKt$$ExternalSyntheticLambda0(modifier, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x028b, code lost:
    
        if (r6 != null) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstitutionResultTile(Modifier modifier, FinancialConnectionsInstitution financialConnectionsInstitution, boolean z, boolean z2, Function1 function1, Composer composer, int i) {
        boolean z3;
        MatcherMatchResult find;
        MatchGroup matchGroup;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1318839485);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(financialConnectionsInstitution) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changed(z2) ? 2048 : 1024) | (gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer.consume(CompositionLocalsKt.LocalFocusManager);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new MarkdownParser$$ExternalSyntheticLambda0(23);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier testTag = TestTagKt.testTag(SemanticsModifierKt.semantics(fillMaxSize, false, (Function1) rememberedValue), financialConnectionsInstitution.id);
            boolean z4 = z2 && !z;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
            Role role = new Role(0);
            boolean changedInstance = ((i2 & 112) == 32) | ((57344 & i2) == 16384) | gapComposer.changedInstance(focusOwnerImpl);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new HeroCardViewKt$$ExternalSyntheticLambda9(focusOwnerImpl, function1, financialConnectionsInstitution, 16);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier alpha = AlphaKt.alpha(ImageKt.m182clickableO2vRcR0$default(testTag, mutableInteractionSourceImpl, null, z4, null, role, (Function0) rememberedValue3, 8), z2 ? 1.0f : 0.3f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, alpha);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m574initimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Image image = financialConnectionsInstitution.icon;
            ListItemKt.InstitutionIcon(0, 6, gapComposer, null, image != null ? image.f809default : null, false);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 8.0f));
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            SVG$Unit$EnumUnboxingLocalUtility.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            TextKt.m509Text4IGK_g(financialConnectionsInstitution.name, null, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).labelLargeEmphasized, gapComposer, 0, 3120, 55290);
            String str2 = financialConnectionsInstitution.url;
            String str3 = "";
            try {
                Result.Companion companion2 = Result.Companion;
                Regex regex = new Regex("^(?:https?://)?(?:www\\.|[^@\\n]+@)?([^:/\\n]+)");
                if (str2 != null && (find = regex.find(str2)) != null && (matchGroup = find.groups.get(1)) != null && (str = matchGroup.value) != null) {
                    List split$default = StringsKt.split$default(str, new char[]{'.'}, 6);
                    int size = split$default.size();
                    if (size > 2) {
                        int i3 = size - 2;
                        if (((String) split$default.get(i3)).length() <= 3) {
                            int i4 = size - 1;
                            if (((String) split$default.get(i4)).length() <= 2) {
                                str3 = split$default.get(size - 3) + "." + split$default.get(i3) + "." + split$default.get(i4);
                            }
                        }
                    }
                    str3 = split$default.get(size - 2) + "." + split$default.get(size - 1);
                }
            } catch (Throwable unused) {
                Result.Companion companion3 = Result.Companion;
            }
            str2 = str3;
            TextKt.m509Text4IGK_g(str2, null, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textSubdued, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).labelMedium, gapComposer, 0, 3120, 55290);
            gapComposer = gapComposer;
            gapComposer.end(true);
            if (z) {
                gapComposer.startReplaceGroup(-1916943345);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 8.0f));
                ListItemKt.m4014LoadingSpinneruFdPcIQ(SizeKt.m285size3ABfNKs(companion, 24.0f), RecyclerView.DECELERATION_RATE, null, gapComposer, 6, 6);
                z3 = false;
            } else {
                z3 = false;
                gapComposer.startReplaceGroup(-1937826743);
            }
            gapComposer.end(z3);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OutlinedTextFieldKt$$ExternalSyntheticLambda4(modifier, financialConnectionsInstitution, z, z2, function1, i, 4);
        }
    }

    public static final void LoadedContent(LazyListState lazyListState, String str, Function1 function1, Async async, Function2 function2, InstitutionPickerState.Payload payload, Function0 function0, Function0 function02, Composer composer, int i) {
        GapComposer gapComposer;
        int i2;
        CoroutineScope coroutineScope;
        int i3;
        FocusRequester focusRequester;
        NeverEqualPolicy neverEqualPolicy;
        int i4;
        int i5;
        boolean z;
        int i6;
        Async async2 = async;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1197786032);
        int i7 = (gapComposer2.changed(lazyListState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i7 |= gapComposer2.changed((Object) null) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i7 |= gapComposer2.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i7 |= gapComposer2.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i7 |= gapComposer2.changedInstance(async2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i7 |= gapComposer2.changedInstance(function2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i8 = i7 | (gapComposer2.changedInstance(payload) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changedInstance(function0) ? 8388608 : 4194304) | (gapComposer2.changedInstance(function02) ? 67108864 : 33554432);
        if (gapComposer2.shouldExecute(i8 & 1, (i8 & 38347923) != 38347922)) {
            Object[] objArr = new Object[0];
            boolean z2 = (i8 & 112) == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy2) {
                rememberedValue = new Luhn$$ExternalSyntheticLambda0(29);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer2, 0);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.TRUE);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy2) {
                rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer2);
            }
            FocusRequester focusRequester2 = (FocusRequester) rememberedValue3;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy2) {
                rememberedValue4 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue4;
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy2) {
                i2 = i8;
                rememberedValue5 = new ToastKt$Toast$7$1(mutableState2, null, 18);
                gapComposer2.updateRememberedValue(rememberedValue5);
            } else {
                i2 = i8;
            }
            Updater.LaunchedEffect(gapComposer2, async2, (Function2) rememberedValue5);
            Boolean valueOf = Boolean.valueOf(lazyListState.scrollableState.isScrollInProgress());
            int i9 = i2 & 14;
            boolean changedInstance = gapComposer2.changedInstance(async2) | (i9 == 4) | ((i2 & 234881024) == 67108864);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue6 == neverEqualPolicy2) {
                coroutineScope = coroutineScope2;
                i3 = i9;
                focusRequester = focusRequester2;
                neverEqualPolicy = neverEqualPolicy2;
                i4 = i2;
                i5 = PKIFailureInfo.unsupportedVersion;
                z = false;
                HeroCardViewKt$Render$1$4$1.AnonymousClass2 anonymousClass2 = new HeroCardViewKt$Render$1$4$1.AnonymousClass2((Object) async2, (Object) lazyListState, (Object) function02, mutableState2, (Continuation) null, 14);
                async2 = async2;
                gapComposer2.updateRememberedValue(anonymousClass2);
                rememberedValue6 = anonymousClass2;
            } else {
                i3 = i9;
                coroutineScope = coroutineScope2;
                neverEqualPolicy = neverEqualPolicy2;
                focusRequester = focusRequester2;
                i4 = i2;
                i5 = PKIFailureInfo.unsupportedVersion;
                z = false;
            }
            Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) rememberedValue6);
            PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean changed = gapComposer2.changed(mutableState) | ((i4 & 7168) == 2048 ? true : z) | gapComposer2.changedInstance(payload) | ((i4 & 896) == 256 ? true : z) | ((458752 & i4) == i5 ? true : z) | gapComposer2.changedInstance(async2) | ((i4 & 29360128) == 8388608 ? true : z) | gapComposer2.changedInstance(coroutineScope) | (i3 != 4 ? z : true);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changed || rememberedValue7 == neverEqualPolicy) {
                i6 = i4;
                DocumentQueries$$ExternalSyntheticLambda0 documentQueries$$ExternalSyntheticLambda0 = new DocumentQueries$$ExternalSyntheticLambda0(payload, str, function2, async2, function0, focusRequester, mutableState, function1, coroutineScope, lazyListState);
                gapComposer2.updateRememberedValue(documentQueries$$ExternalSyntheticLambda0);
                rememberedValue7 = documentQueries$$ExternalSyntheticLambda0;
            } else {
                i6 = i4;
            }
            gapComposer = gapComposer2;
            LayoutKt.LazyLayout(null, m295PaddingValuesYgX7TsA$default, false, false, false, null, false, lazyListState, null, (Function1) rememberedValue7, gapComposer, ((i6 << 21) & 29360128) | 48, 381);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StripeImageKt$$ExternalSyntheticLambda3(lazyListState, str, function1, async, function2, payload, function0, function02, i);
        }
    }

    public static final void ManualEntryRow(int i, Composer composer, Modifier modifier, Function0 function0, boolean z) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(709966841);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changed(z) ? 32 : 16) | (gapComposer2.changedInstance(function0) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            Modifier alpha = AlphaKt.alpha(ImageKt.m182clickableO2vRcR0$default(fillMaxSize, (MutableInteractionSourceImpl) rememberedValue, null, z, null, new Role(0), function0, 8), z ? 1.0f : 0.3f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, alpha);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m574initimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ListItemKt.ShapedIcon(Countries.painterResource(R.drawable.stripe_ic_add, 0, gapComposer2), null, null, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f), "Manually enter details", gapComposer2, Painter.$stable | 24576, 6);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            SpacerKt.Spacer(gapComposer2, SizeKt.m285size3ABfNKs(companion, 8.0f));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            SVG$Unit$EnumUnboxingLocalUtility.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            String stringResource = Room.stringResource(gapComposer2, R.string.stripe_institutionpicker_manual_entry_title);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
            long j = ((FinancialConnectionsColors) gapComposer2.consume(staticProvidableCompositionLocal)).textDefault;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ThemeKt.LocalTypography;
            TextKt.m509Text4IGK_g(stringResource, null, j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer2.consume(staticProvidableCompositionLocal2)).labelLargeEmphasized, gapComposer2, 0, 0, 65530);
            TextKt.m509Text4IGK_g(Room.stringResource(gapComposer2, R.string.stripe_institutionpicker_manual_entry_desc), null, ((FinancialConnectionsColors) gapComposer2.consume(staticProvidableCompositionLocal)).textSubdued, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((FinancialConnectionsTypography) gapComposer2.consume(staticProvidableCompositionLocal2)).labelMedium, gapComposer2, 0, 3120, 55290);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RotatingTitleIconKt$$ExternalSyntheticLambda2(modifier, z, function0, i);
        }
    }

    public static final void NoResultsTile(Modifier modifier, Boolean bool, Function0 function0, Composer composer, int i) {
        TextResource.StringId stringId;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-864577888);
        int i2 = i | (gapComposer.changed(bool) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String stringResource = Room.stringResource(gapComposer, R.string.stripe_institutionpicker_pane_error_title);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalTypography;
            TextKt.m509Text4IGK_g(stringResource, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal)).headingLarge, gapComposer, 0, 0, JpegConstants.COM_MARKER);
            gapComposer = gapComposer;
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 16.0f));
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            if (booleanValue) {
                stringId = new TextResource.StringId(R.string.stripe_institutionpicker_pane_error_desc_manual_entry);
            } else {
                if (booleanValue) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                stringId = new TextResource.StringId(R.string.stripe_institutionpicker_pane_error_desc);
            }
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CardTransitionKt$$ExternalSyntheticLambda16(7, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            TextStyle textStyle = ((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ThemeKt.LocalColors;
            com.stripe.android.financialconnections.ui.components.TextKt.m4020AnnotatedTextrm0N8CA(stringId, function1, TextStyle.m994copyp1EtxEg$default(textStyle, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal2)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446), null, MapsKt__MapsJVMKt.mapOf(new Pair(StringAnnotation.CLICKABLE, SpanStyle.m973copyGSF8kmg$default(((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMediumEmphasized.spanStyle, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal2)).textAction, null, 0L, JpegConstants.COM_MARKER))), 0, 0, gapComposer, 0, 104);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayCellViewKt$$ExternalSyntheticLambda0(modifier, bool, function0, i);
        }
    }

    public static final void SearchMoreRow(Modifier modifier, HeroCardViewKt$$ExternalSyntheticLambda9 heroCardViewKt$$ExternalSyntheticLambda9, boolean z, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(533219366);
        int i2 = i | (gapComposer2.changedInstance(heroCardViewKt$$ExternalSyntheticLambda9) ? 32 : 16) | (gapComposer2.changed(z) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            Modifier alpha = AlphaKt.alpha(ImageKt.m182clickableO2vRcR0$default(fillMaxSize, (MutableInteractionSourceImpl) rememberedValue, null, z, null, new Role(0), heroCardViewKt$$ExternalSyntheticLambda9, 8), z ? 1.0f : 0.3f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, alpha);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ListItemKt.ShapedIcon(Countries.painterResource(R.drawable.stripe_ic_search, 0, gapComposer2), null, null, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f), "Add icon", gapComposer2, Painter.$stable | 24576, 6);
            SpacerKt.Spacer(gapComposer2, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 8.0f));
            TextKt.m509Text4IGK_g(Room.stringResource(gapComposer2, R.string.stripe_institutionpicker_search_more_title), null, ((FinancialConnectionsColors) gapComposer2.consume(ThemeKt.LocalColors)).textDefault, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer2.consume(ThemeKt.LocalTypography)).labelLargeEmphasized, gapComposer2, 0, 0, 65530);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda16(modifier, heroCardViewKt$$ExternalSyntheticLambda9, z, i, 9);
        }
    }

    public static final void SearchRow(Modifier modifier, FocusRequester focusRequester, String str, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1724050851);
        int i2 = i | 6 | (gapComposer2.changed(str) ? 256 : 128) | (gapComposer2.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer2.consume(CompositionLocalsKt.LocalFocusManager);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion, 1.0f), ((FinancialConnectionsColors) gapComposer2.consume(ThemeKt.LocalColors)).background, ColorKt.RectangleShape), 8.0f, RecyclerView.DECELERATION_RATE, 8.0f, 8.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m301paddingqDBjuR0);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            ComposableLambdaImpl composableLambdaImpl = null;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier focusRequester2 = FocusTraversalKt.focusRequester(SizeKt.fillMaxWidth(companion, 1.0f), focusRequester);
            KeyboardOptions keyboardOptions = new KeyboardOptions(2, (Boolean) null, 0, 3, (Boolean) null, 118);
            boolean changedInstance = gapComposer2.changedInstance(focusOwnerImpl);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new NoteInputViewKt$$ExternalSyntheticLambda2(focusOwnerImpl, 1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            KeyboardActions keyboardActions = new KeyboardActions(null, null, (Function1) rememberedValue, 47);
            if ((str.length() > 0 ? str : null) == null) {
                gapComposer2.startReplaceGroup(-1811264059);
            } else {
                gapComposer2.startReplaceGroup(-1811264058);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(2002765801, new HeroCardNullStateKt$$ExternalSyntheticLambda8(21, function1), gapComposer2);
            }
            gapComposer2.end(false);
            ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
            boolean z = (i2 & 7168) == 2048;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ViewGroups$$ExternalSyntheticLambda0(18, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            int i3 = ((i2 >> 6) & 14) | 102236208;
            modifier2 = companion;
            com.stripe.android.financialconnections.ui.components.TextKt.FinancialConnectionsOutlinedTextField(str, true, focusRequester2, (Function1) rememberedValue2, false, keyboardOptions, keyboardActions, f804lambda$156477903, null, composableLambdaImpl2, lambda$1104674433, gapComposer2, i3, 48, 4656);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(modifier2, i, focusRequester, str, function1, 26);
        }
    }

    public static final void SearchTitle(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-827300725);
        int i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            gapComposer = gapComposer2;
            TextKt.m509Text4IGK_g(Room.stringResource(gapComposer2, R.string.stripe_institutionpicker_pane_select_bank), SizeKt.fillMaxWidth(modifier, 1.0f), ((FinancialConnectionsColors) gapComposer2.consume(ThemeKt.LocalColors)).textDefault, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer2.consume(ThemeKt.LocalTypography)).headingXLarge, gapComposer, 0, 0, 65528);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DragHandleKt$$ExternalSyntheticLambda0(modifier, i, 2);
        }
    }
}
