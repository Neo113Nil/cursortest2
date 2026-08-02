package com.stripe.android.financialconnections.features.linkaccountpicker;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda1;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.paging.PageFetcher$flow$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.tax.applet.views.TaxesAppletTile$$ExternalSyntheticLambda10;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda16;
import com.squareup.scannerview.ScannerView;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.error.ErrorViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.features.reset.ResetScreenKt$$ExternalSyntheticLambda2;
import com.stripe.android.financialconnections.model.AddNewAccount;
import com.stripe.android.financialconnections.model.Body$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.NetworkedAccount;
import com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.stripe.android.uicore.image.DefaultStripeImageLoader;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageKt$$ExternalSyntheticLambda3;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes8.dex */
public abstract class LinkAccountPickerScreenKt {
    public static final ComposableLambdaImpl lambda$1590876224 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(7), false, 1590876224);
    public static final ComposableLambdaImpl lambda$2110578920 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(8), false, 2110578920);

    /* renamed from: lambda$-775726903, reason: not valid java name */
    public static final ComposableLambdaImpl f806lambda$775726903 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(25), false, -775726903);

    public static final void LinkAccountPickerContent(LinkAccountPickerState linkAccountPickerState, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function1 function13, Composer composer, int i) {
        TextResource.Text text;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(766768127);
        int i2 = i | (gapComposer.changedInstance(linkAccountPickerState) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(function12) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024) | (gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function13) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
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
            Async async = linkAccountPickerState.payload;
            if (Intrinsics.areEqual(async, Async.Uninitialized.INSTANCE) || (async instanceof Async.Loading) || (async instanceof Async.Success)) {
                gapComposer.startReplaceGroup(-1303869586);
                LinkAccountPickerState.Payload payload = (LinkAccountPickerState.Payload) linkAccountPickerState.payload.invoke();
                if (payload == null || !payload.singleAccount) {
                    String str2 = payload != null ? payload.defaultCta : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    text = new TextResource.Text(str2);
                } else {
                    LinkedAccount linkedAccount = (LinkedAccount) CollectionsKt.singleOrNull((List) payload.getSelectedAccounts());
                    NetworkedAccount networkedAccount = linkedAccount != null ? linkedAccount.display : null;
                    if (networkedAccount == null || (str = networkedAccount.selectionCta) == null) {
                        str = payload.defaultCta;
                    }
                    text = new TextResource.Text(str);
                }
                LinkAccountPickerLoaded(rememberLazyListState, async, linkAccountPickerState.selectNetworkedAccountAsync, function13, function0, function12, function02, text, gapComposer, ((i2 >> 6) & 7168) | ((i2 << 3) & 57344) | ((i2 << 9) & 458752) | ((i2 << 6) & 3670016));
                gapComposer.end(false);
            } else {
                if (!(async instanceof Async.Fail)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1343409578, false);
                }
                gapComposer.startReplaceGroup(1343428230);
                boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(async);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ResetScreenKt$$ExternalSyntheticLambda2(function1, async, 2);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                ListItemKt.UnclassifiedErrorContent(false, (Function0) rememberedValue, gapComposer, 0, 1);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WalletHomeViewKt$$ExternalSyntheticLambda2(linkAccountPickerState, function1, function12, function0, function02, function13, i);
        }
    }

    public static final void LinkAccountPickerLoaded(LazyListState lazyListState, Async async, Async async2, Function1 function1, Function0 function0, Function1 function12, Function0 function02, TextResource.Text text, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1866610964);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(lazyListState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(async) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(async2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function12) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function02) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? gapComposer2.changed(text) : gapComposer2.changedInstance(text) ? 8388608 : 4194304;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            boolean z = async instanceof Async.Loading;
            int i3 = i2;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2935649, new WalletHomeViewKt$$ExternalSyntheticLambda4(3, async, async2, function02, text, function12), gapComposer2);
            boolean changedInstance = gapComposer2.changedInstance(async) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                OpenSourceKt$$ExternalSyntheticLambda9 openSourceKt$$ExternalSyntheticLambda9 = new OpenSourceKt$$ExternalSyntheticLambda9(async, async2, function1, function0, 16);
                gapComposer2.updateRememberedValue(openSourceKt$$ExternalSyntheticLambda9);
                rememberedValue = openSourceKt$$ExternalSyntheticLambda9;
            }
            gapComposer = gapComposer2;
            LayoutKt.LazyLayout(null, null, false, z, true, arrangement$SpacedAligned, false, lazyListState, rememberComposableLambda, (Function1) rememberedValue, gapComposer, ((i3 << 21) & 29360128) | 100884480, 71);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StripeImageKt$$ExternalSyntheticLambda3(lazyListState, async, async2, function1, function0, function12, function02, text, i, 5);
        }
    }

    public static final void LinkAccountPickerScreen(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-85990089);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            FinancialConnectionsSessionManifest.Pane pane = LinkAccountPickerViewModel.PANE;
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ErrorViewModel$Companion$$ExternalSyntheticLambda0 errorViewModel$Companion$$ExternalSyntheticLambda0 = new ErrorViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, 4);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(LinkAccountPickerViewModel.class), errorViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            LinkAccountPickerViewModel linkAccountPickerViewModel = (LinkAccountPickerViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(LinkAccountPickerViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            FinancialConnectionsSheetNativeViewModel parentViewModel = TaskUtil.parentViewModel(gapComposer);
            MutableState collectAsState = StateFlowsComposeKt.collectAsState(linkAccountPickerViewModel.stateFlow, gapComposer);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new Body$$ExternalSyntheticLambda0(1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(true, (Function0) rememberedValue, gapComposer, 54, 0);
            UriHandler uriHandler = (UriHandler) gapComposer.consume(CompositionLocalsKt.LocalUriHandler);
            LinkAccountPickerState$ViewEffect$OpenUrl linkAccountPickerState$ViewEffect$OpenUrl = ((LinkAccountPickerState) collectAsState.getValue()).viewEffect;
            if (linkAccountPickerState$ViewEffect$OpenUrl == null) {
                gapComposer.startReplaceGroup(-1929889626);
            } else {
                gapComposer.startReplaceGroup(-1929889625);
                boolean changed = gapComposer.changed(linkAccountPickerState$ViewEffect$OpenUrl) | gapComposer.changedInstance(uriHandler) | gapComposer.changedInstance(linkAccountPickerViewModel);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new Logger$_log$2(linkAccountPickerState$ViewEffect$OpenUrl, uriHandler, linkAccountPickerViewModel, null, 16);
                    linkAccountPickerViewModel = linkAccountPickerViewModel;
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Updater.LaunchedEffect(gapComposer, linkAccountPickerState$ViewEffect$OpenUrl, (Function2) rememberedValue2);
            }
            gapComposer.end(false);
            LinkAccountPickerState linkAccountPickerState = (LinkAccountPickerState) collectAsState.getValue();
            boolean changedInstance = gapComposer.changedInstance(parentViewModel);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1 = new TextFieldUIKt$TextField$4$1(1, parentViewModel, FinancialConnectionsSheetNativeViewModel.class, "onCloseFromErrorClick", "onCloseFromErrorClick(Ljava/lang/Throwable;)V", 0, 5);
                gapComposer.updateRememberedValue(textFieldUIKt$TextField$4$1);
                rememberedValue3 = textFieldUIKt$TextField$4$1;
            }
            Function1 function1 = (Function1) ((KFunction) rememberedValue3);
            boolean changedInstance2 = gapComposer.changedInstance(linkAccountPickerViewModel);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                ScrollCapture$onScrollCaptureSearch$1 scrollCapture$onScrollCaptureSearch$1 = new ScrollCapture$onScrollCaptureSearch$1(1, linkAccountPickerViewModel, LinkAccountPickerViewModel.class, "onClickableTextClick", "onClickableTextClick(Ljava/lang/String;)Lkotlinx/coroutines/Job;", 8, 9);
                gapComposer.updateRememberedValue(scrollCapture$onScrollCaptureSearch$1);
                rememberedValue4 = scrollCapture$onScrollCaptureSearch$1;
            }
            Function1 function12 = (Function1) rememberedValue4;
            boolean changedInstance3 = gapComposer.changedInstance(linkAccountPickerViewModel);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                PageFetcher$flow$1.AnonymousClass2.AnonymousClass1 anonymousClass1 = new PageFetcher$flow$1.AnonymousClass2.AnonymousClass1(0, linkAccountPickerViewModel, LinkAccountPickerViewModel.class, "onNewBankAccountClick", "onNewBankAccountClick()Lkotlinx/coroutines/Job;", 8, 4);
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue5 = anonymousClass1;
            }
            Function0 function0 = (Function0) rememberedValue5;
            boolean changedInstance4 = gapComposer.changedInstance(linkAccountPickerViewModel);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance4 || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new ScannerView.AnonymousClass1(0, linkAccountPickerViewModel, LinkAccountPickerViewModel.class, "onSelectAccountsClick", "onSelectAccountsClick()V", 0, 21);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Function0 function02 = (Function0) ((KFunction) rememberedValue6);
            boolean changedInstance5 = gapComposer.changedInstance(linkAccountPickerViewModel);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (changedInstance5 || rememberedValue7 == neverEqualPolicy) {
                TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$12 = new TextFieldUIKt$TextField$4$1(1, linkAccountPickerViewModel, LinkAccountPickerViewModel.class, "onAccountClick", "onAccountClick(Lcom/stripe/android/financialconnections/model/PartnerAccount;)V", 0, 6);
                gapComposer.updateRememberedValue(textFieldUIKt$TextField$4$12);
                rememberedValue7 = textFieldUIKt$TextField$4$12;
            }
            LinkAccountPickerContent(linkAccountPickerState, function1, function12, function0, function02, (Function1) ((KFunction) rememberedValue7), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ExitViewModel$$ExternalSyntheticLambda0(i, 18);
        }
    }

    public static final void NetworkedAccountItem(LinkedAccount linkedAccount, Function1 function1, boolean z, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1765813444);
        int i2 = (gapComposer.changedInstance(linkedAccount) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ListItemKt.AccountItem(z, false, function1, linkedAccount.account, linkedAccount.display, gapComposer, ((i2 >> 6) & 14) | ((i2 << 3) & 896), 2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda16(linkedAccount, function1, z, i, 10);
        }
    }

    public static final void SelectNewAccount(Function0 function0, AddNewAccount addNewAccount, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1105026761);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i | (gapComposer.changed(addNewAccount) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            RoundedCornerShape roundedCornerShape = (RoundedCornerShape) rememberedValue;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth(companion, 1.0f), roundedCornerShape);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(clip, 1.0f, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).borderNeutral, roundedCornerShape);
            Role role = new Role(0);
            boolean z = (i2 & 14) == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new AlertBannerKt$$ExternalSyntheticLambda2(20, function0);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(TextKt.m4021clickableSingleXHw0xAI$default(m178borderxT4_qwU, false, role, (Function0) rememberedValue2, 3), 16.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m574initimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            SVG$Unit$EnumUnboxingLocalUtility.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Image image = addNewAccount.icon;
            SelectNewAccountIcon(image != null ? image.f809default : null, addNewAccount.body, gapComposer, 0);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
            androidx.compose.material.TextKt.m509Text4IGK_g(addNewAccount.body, null, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).textDefault, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).labelLargeEmphasized, gapComposer, 0, 0, 65530);
            gapComposer = gapComposer;
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Radiography$$ExternalSyntheticLambda1(function0, addNewAccount, i, 20);
        }
    }

    public static final void SelectNewAccountIcon(String str, String str2, Composer composer, int i) {
        boolean z;
        str2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1028374910);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 56.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f)), ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).iconBackground, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 20.0f);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(930308442, new PoolCreateViewKt$$ExternalSyntheticLambda4(17, m285size3ABfNKs, str2), gapComposer);
            if (((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue() || str == null || str.length() == 0) {
                z = true;
                gapComposer.startReplaceGroup(2145716142);
                rememberComposableLambda.invoke((Object) gapComposer, (Object) 6);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2145717652);
                z = true;
                StripeImageKt.StripeImage(str, (DefaultStripeImageLoader) gapComposer.consume(FinancialConnectionsSheetNativeActivityKt.LocalImageLoader), null, m285size3ABfNKs, null, null, null, null, Expect_jvmKt.rememberComposableLambda(-665169054, new TaxesAppletTile$$ExternalSyntheticLambda10(rememberComposableLambda, 5), gapComposer), null, gapComposer, (i2 & 14) | 805309824, 0, 1520);
                gapComposer.end(false);
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PreviewActivity$$ExternalSyntheticLambda1(str, i, 7, str2);
        }
    }
}
