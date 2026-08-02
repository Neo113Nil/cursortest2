package com.stripe.android.financialconnections.features.accountpicker;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.api.internal.zabr;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.offers.views.OffersSearchViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda24;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda0;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import com.stripe.android.cards.DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.exception.AccountNoneEligibleForPaymentMethodError;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.error.ErrorViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes8.dex */
public abstract class AccountPickerScreenKt {
    public static final ComposableLambdaImpl lambda$229709570 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(18), false, 229709570);
    public static final ComposableLambdaImpl lambda$1423572609 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(24), false, 1423572609);

    public static final void AccountPickerContent(AccountPickerState accountPickerState, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function13, Composer composer, int i) {
        boolean z;
        Object obj;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1035240073);
        int i2 = i | (gapComposer.changedInstance(accountPickerState) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(function12) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024) | (gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function03) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function04) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changedInstance(function13) ? 8388608 : 4194304);
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
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
            Async async = accountPickerState.payload;
            if (async instanceof Async.Fail) {
                gapComposer.startReplaceGroup(-1099147605);
                Throwable th = ((Async.Fail) async).error;
                if (th instanceof AccountNoneEligibleForPaymentMethodError) {
                    gapComposer.startReplaceGroup(1488567741);
                    ListItemKt.NoSupportedPaymentMethodTypeAccountsErrorContent((AccountNoneEligibleForPaymentMethodError) th, function02, gapComposer, (i2 >> 9) & 112);
                    z = false;
                    gapComposer.end(false);
                } else if (th instanceof AccountLoadError) {
                    gapComposer.startReplaceGroup(-1098802017);
                    ListItemKt.NoAccountsAvailableErrorContent((AccountLoadError) th, function02, function03, function04, gapComposer, (i2 >> 9) & 8176);
                    gapComposer.end(false);
                    z = false;
                } else {
                    gapComposer.startReplaceGroup(1488585558);
                    boolean changedInstance = ((i2 & 29360128) == 8388608) | gapComposer.changedInstance(th);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        z = false;
                        AccountPickerScreenKt$$ExternalSyntheticLambda4 accountPickerScreenKt$$ExternalSyntheticLambda4 = new AccountPickerScreenKt$$ExternalSyntheticLambda4(function13, th, 0);
                        gapComposer.updateRememberedValue(accountPickerScreenKt$$ExternalSyntheticLambda4);
                        obj = accountPickerScreenKt$$ExternalSyntheticLambda4;
                    } else {
                        z = false;
                        obj = rememberedValue;
                    }
                    ListItemKt.UnclassifiedErrorContent(z, (Function0) obj, gapComposer, z ? 1 : 0, 1);
                    gapComposer.end(z);
                }
                gapComposer.end(z);
            } else {
                if (!(async instanceof Async.Loading) && !(async instanceof Async.Uninitialized) && !(async instanceof Async.Success)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1488562264, false);
                }
                gapComposer.startReplaceGroup(1488591270);
                int i3 = i2 << 6;
                AccountPickerLoaded(async, accountPickerState, rememberLazyListState, function1, function12, function0, gapComposer, ((i2 << 3) & 112) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateInputKt$$ExternalSyntheticLambda1(accountPickerState, function1, function12, function0, function02, function03, function04, function13, i, 15);
        }
    }

    public static final void AccountPickerLoaded(Async async, AccountPickerState accountPickerState, LazyListState lazyListState, Function1 function1, Function1 function12, Function0 function0, Composer composer, int i) {
        int i2;
        Object obj;
        GapComposer gapComposer;
        AccountPickerState accountPickerState2 = accountPickerState;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1607640131);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(async) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(accountPickerState2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(lazyListState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            obj = function12;
            i2 |= gapComposer2.changedInstance(obj) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            obj = function12;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            AccountPickerState.Payload payload = (AccountPickerState.Payload) async.invoke();
            if (payload == null || payload.skipAccountSelection || payload.userSelectedSingleAccountInInstitution) {
                payload = null;
            }
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            boolean z = async instanceof Async.Loading;
            accountPickerState2 = accountPickerState;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1856761424, new LifecycleKt$$ExternalSyntheticLambda0(payload, obj, accountPickerState, function0, 20), gapComposer2);
            boolean changedInstance = gapComposer2.changedInstance(accountPickerState2) | gapComposer2.changedInstance(payload) | ((i3 & 7168) == 2048);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CardTransitionKt$$ExternalSyntheticLambda4(21, accountPickerState2, payload, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            LayoutKt.LazyLayout(null, null, false, z, true, arrangement$SpacedAligned, false, lazyListState, rememberComposableLambda, (Function1) rememberedValue, gapComposer, ((i3 << 15) & 29360128) | 100884480, 71);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersSearchViewKt$$ExternalSyntheticLambda6(async, accountPickerState2, lazyListState, function1, function12, function0, i);
        }
    }

    public static final void AccountPickerScreen(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-11072579);
        int i2 = 1;
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            FinancialConnectionsSessionManifest.Pane pane = AccountPickerViewModel.PANE;
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ErrorViewModel$Companion$$ExternalSyntheticLambda0 errorViewModel$Companion$$ExternalSyntheticLambda0 = new ErrorViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, i2);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(AccountPickerViewModel.class), errorViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            AccountPickerViewModel accountPickerViewModel = (AccountPickerViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(AccountPickerViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            Object parentViewModel = TaskUtil.parentViewModel(gapComposer);
            MutableState collectAsState = StateFlowsComposeKt.collectAsState(accountPickerViewModel.stateFlow, gapComposer);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = new Luhn$$ExternalSyntheticLambda0(17);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(true, (Function0) rememberedValue, gapComposer, 54, 0);
            Object obj2 = (UriHandler) gapComposer.consume(CompositionLocalsKt.LocalUriHandler);
            Object obj3 = ((AccountPickerState) collectAsState.getValue()).viewEffect;
            if (obj3 == null) {
                gapComposer.startReplaceGroup(849634080);
            } else {
                gapComposer.startReplaceGroup(849634081);
                boolean changed = gapComposer.changed(obj3) | gapComposer.changedInstance(obj2) | gapComposer.changedInstance(accountPickerViewModel);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == obj) {
                    Object logger$_log$2 = new Logger$_log$2(obj3, obj2, accountPickerViewModel, null, 14);
                    accountPickerViewModel = accountPickerViewModel;
                    gapComposer.updateRememberedValue(logger$_log$2);
                    rememberedValue2 = logger$_log$2;
                }
                Updater.LaunchedEffect(gapComposer, obj3, (Function2) rememberedValue2);
            }
            gapComposer.end(false);
            AccountPickerState accountPickerState = (AccountPickerState) collectAsState.getValue();
            boolean changedInstance = gapComposer.changedInstance(accountPickerViewModel);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == obj) {
                Object anonymousClass3 = new ScannerView.AnonymousClass3(1, accountPickerViewModel, AccountPickerViewModel.class, "onAccountClicked", "onAccountClicked(Lcom/stripe/android/financialconnections/model/PartnerAccount;)V", 0, 28);
                gapComposer.updateRememberedValue(anonymousClass3);
                rememberedValue3 = anonymousClass3;
            }
            KFunction kFunction = (KFunction) rememberedValue3;
            boolean changedInstance2 = gapComposer.changedInstance(accountPickerViewModel);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue4 == obj) {
                Object anonymousClass1 = new ScannerView.AnonymousClass1(0, accountPickerViewModel, AccountPickerViewModel.class, "onSubmit", "onSubmit()V", 0, 7);
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue4 = anonymousClass1;
            }
            KFunction kFunction2 = (KFunction) rememberedValue4;
            boolean changedInstance3 = gapComposer.changedInstance(accountPickerViewModel);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue5 == obj) {
                Object anonymousClass12 = new ScannerView.AnonymousClass1(0, accountPickerViewModel, AccountPickerViewModel.class, "selectAnotherBank", "selectAnotherBank()V", 0, 8);
                gapComposer.updateRememberedValue(anonymousClass12);
                rememberedValue5 = anonymousClass12;
            }
            KFunction kFunction3 = (KFunction) rememberedValue5;
            boolean changedInstance4 = gapComposer.changedInstance(accountPickerViewModel);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance4 || rememberedValue6 == obj) {
                Object anonymousClass13 = new ScannerView.AnonymousClass1(0, accountPickerViewModel, AccountPickerViewModel.class, "onEnterDetailsManually", "onEnterDetailsManually()V", 0, 9);
                gapComposer.updateRememberedValue(anonymousClass13);
                rememberedValue6 = anonymousClass13;
            }
            KFunction kFunction4 = (KFunction) rememberedValue6;
            boolean changedInstance5 = gapComposer.changedInstance(accountPickerViewModel);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (changedInstance5 || rememberedValue7 == obj) {
                rememberedValue7 = new ScannerView.AnonymousClass1(0, accountPickerViewModel, AccountPickerViewModel.class, "onLoadAccountsAgain", "onLoadAccountsAgain()V", 0, 10);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            KFunction kFunction5 = (KFunction) rememberedValue7;
            boolean changedInstance6 = gapComposer.changedInstance(accountPickerViewModel);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (changedInstance6 || rememberedValue8 == obj) {
                Object scrollCapture$onScrollCaptureSearch$1 = new ScrollCapture$onScrollCaptureSearch$1(1, accountPickerViewModel, AccountPickerViewModel.class, "onClickableTextClick", "onClickableTextClick(Ljava/lang/String;)Lkotlinx/coroutines/Job;", 8, 7);
                gapComposer.updateRememberedValue(scrollCapture$onScrollCaptureSearch$1);
                rememberedValue8 = scrollCapture$onScrollCaptureSearch$1;
            }
            Function1 function1 = (Function1) rememberedValue8;
            boolean changedInstance7 = gapComposer.changedInstance(parentViewModel);
            Object rememberedValue9 = gapComposer.rememberedValue();
            if (changedInstance7 || rememberedValue9 == obj) {
                Object anonymousClass32 = new ScannerView.AnonymousClass3(1, parentViewModel, FinancialConnectionsSheetNativeViewModel.class, "onCloseFromErrorClick", "onCloseFromErrorClick(Ljava/lang/Throwable;)V", 0, 29);
                gapComposer.updateRememberedValue(anonymousClass32);
                rememberedValue9 = anonymousClass32;
            }
            AccountPickerContent(accountPickerState, (Function1) kFunction, function1, (Function0) kFunction2, (Function0) kFunction3, (Function0) kFunction4, (Function0) kFunction5, (Function1) ((KFunction) rememberedValue9), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda0(i, 22);
        }
    }

    public static final void DataAccessDisclaimerText(String str, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(285181872);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            TextKt.m4020AnnotatedTextrm0N8CA(new TextResource.Text(zabr.fromHtml(str)), function1, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).labelSmall, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446), SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), null, 0, 0, gapComposer, (i2 & 112) | 3072, 112);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda6(str, function1, i, 14);
        }
    }

    public static final void Footer(String str, Function1 function1, boolean z, boolean z2, Function0 function0, Set set, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(422975109);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changed(z2) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(set) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            if (str != null) {
                gapComposer.startReplaceGroup(1391794670);
                DataAccessDisclaimerText(str, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 12.0f));
            } else {
                gapComposer.startReplaceGroup(1381643751);
            }
            gapComposer.end(false);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MarkdownParser$$ExternalSyntheticLambda0(13);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            int i3 = ((i2 >> 12) & 14) | 1572864;
            int i4 = i2 << 6;
            TextKt.FinancialConnectionsButton(function0, SizeKt.fillMaxWidth(TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), "connect_account_button"), 1.0f), null, null, z, z2, Expect_jvmKt.rememberComposableLambda(-1274958764, new CardAppletTile$$ExternalSyntheticLambda1(set, 13), gapComposer), gapComposer, i3 | (57344 & i4) | (i4 & 458752), 12);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MainPaymentViewKt$$ExternalSyntheticLambda24(str, function1, z, z2, function0, set, i);
        }
    }
}
