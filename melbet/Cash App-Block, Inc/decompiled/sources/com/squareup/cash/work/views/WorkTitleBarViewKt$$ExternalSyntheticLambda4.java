package com.squareup.cash.work.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.local.views.map.LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8;
import app.cash.molecule.PlatformKt;
import coil3.size.SizeKt;
import com.fillr.browsersdk.model.FillrWidget;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.google.android.gms.dynamite.zzg;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.overlays.RealOverlayLayer$show$3;
import com.squareup.cash.wallet.viewmodels.CardLockHalfSheetModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.PresentationAction;
import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewModel;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda7;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.wallet.views.WalletCardSchemeViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.DeclareCashTipBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.MerchantPickerViewModel;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.cash.work.viewmodels.TaxFormDownloaderViewModel;
import com.squareup.cash.work.views.clockin.ClockInOverlayState;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.cash.work.views.menu.ExpandableContentKt;
import com.squareup.cash.work.views.pay.PayCellViewKt;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.work.views.pay.TaxFormDownloaderDialogViewKt$$ExternalSyntheticLambda2;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.android.ViewGroups$$ExternalSyntheticLambda0;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4;
import com.stripe.android.challenge.confirmation.DefaultConfirmationChallengeBridgeHandler;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity$$ExternalSyntheticLambda0;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeUIKt;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeViewModel;
import com.stripe.android.financialconnections.features.generic.GenericScreenState;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.FinancialConnectionsGenericInfoScreen;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KFunction;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InteractionResult;

/* loaded from: classes7.dex */
public final /* synthetic */ class WorkTitleBarViewKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ WorkTitleBarViewKt$$ExternalSyntheticLambda4(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    private final Object invoke$com$stripe$android$financialconnections$features$networkinglinksignup$NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda23(Object obj, Object obj2, Object obj3) {
        ((Integer) obj3).intValue();
        ((AnimatedVisibilityScope) obj).getClass();
        FillrAnalyticsServiceBuilder.PhoneNumberSection((NetworkingLinkSignupState.Payload) this.f$0, (FocusRequester) this.f$1, (Composer) obj2, 48);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v59 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object currentState;
        float f;
        ?? r4;
        int i = this.$r8$classId;
        float f2 = RecyclerView.DECELERATION_RATE;
        int i2 = 12;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i3 = 16;
        Object obj4 = Composer.Companion.Empty;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        int i4 = 1;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj6;
                SellerCardViewModel sellerCardViewModel = (SellerCardViewModel) obj5;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    SellerCardSize sellerCardSize = SellerCardSize.Small;
                    SellerCardShape sellerCardShape = SellerCardShape.Circle;
                    Modifier clip = ClipKt.clip(companion, RoundedCornerShapeKt.CircleShape);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj4) {
                        rememberedValue = new PayHomeViewKt$$ExternalSyntheticLambda2(8, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SellerCardKt.SellerCard(sellerCardViewModel, ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue, 15), sellerCardSize, sellerCardShape, gapComposer, 3456, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                CardLockHalfSheetModel cardLockHalfSheetModel = (CardLockHalfSheetModel) obj6;
                Function2 function2 = (Function2) obj5;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    UtilsKt.CardLockHalfSheet(cardLockHalfSheetModel.title, cardLockHalfSheetModel.body, cardLockHalfSheetModel.devices, function2, SpacerKt.padding(companion, paddingValues), gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                PresentationTimelineViewModel presentationTimelineViewModel = (PresentationTimelineViewModel) obj5;
                Function1 function12 = (Function1) obj6;
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                paddingValues2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(paddingValues2) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    Modifier padding = SpacerKt.padding(companion, paddingValues2);
                    boolean changed2 = gapComposer3.changed(function12);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue2 == obj4) {
                        rememberedValue2 = new ViewGroups$$ExternalSyntheticLambda0(8, function12);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    UtilsKt.PresentationTimelineContent(presentationTimelineViewModel, (Function1) rememberedValue2, padding, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Function1 function13 = (Function1) obj6;
                PresentationAction presentationAction = (PresentationAction) obj5;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    boolean changed3 = gapComposer4.changed(function13) | gapComposer4.changedInstance(presentationAction);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue3 == obj4) {
                        rememberedValue3 = new ListsKt$$ExternalSyntheticLambda0(4, (Object) presentationAction, function13);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue3, null, ButtonProminence.PROMINENT, false, false, null, Expect_jvmKt.rememberComposableLambda(-2103745040, new CardAppletTile$$ExternalSyntheticLambda1(presentationAction, r14), gapComposer4), gapComposer4, 1573248, 58);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                CardRegistry cardRegistry = (CardRegistry) obj6;
                MutableFloatState mutableFloatState = (MutableFloatState) obj5;
                UiScope uiScope = (UiScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                uiScope.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(uiScope) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    if (rememberedValue4 == obj4) {
                        rememberedValue4 = Updater.derivedStateOf(new CardTransitionKt$$ExternalSyntheticLambda7(cardRegistry, 1));
                        gapComposer5.updateRememberedValue(rememberedValue4);
                    }
                    State state = (State) rememberedValue4;
                    Transition transition = uiScope.$$delegate_0.getTransition();
                    Hero3DCardViewKt$$ExternalSyntheticLambda11 hero3DCardViewKt$$ExternalSyntheticLambda11 = new Hero3DCardViewKt$$ExternalSyntheticLambda11(5);
                    TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.FloatToVector;
                    boolean isSeeking = transition.isSeeking();
                    InteractionResult interactionResult = transition.transitionState;
                    if (isSeeking) {
                        gapComposer5.startReplaceGroup(1666827533);
                        gapComposer5.end(false);
                        currentState = interactionResult.getCurrentState();
                    } else {
                        gapComposer5.startReplaceGroup(1666573488);
                        boolean changed4 = gapComposer5.changed(transition);
                        currentState = gapComposer5.rememberedValue();
                        if (changed4 || currentState == obj4) {
                            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                            try {
                                Object currentState2 = interactionResult.getCurrentState();
                                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                gapComposer5.updateRememberedValue(currentState2);
                                currentState = currentState2;
                            } catch (Throwable th) {
                                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                throw th;
                            }
                        }
                        gapComposer5.end(false);
                    }
                    gapComposer5.startReplaceGroup(1101694071);
                    int ordinal = ((EnterExitState) currentState).ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal == 2) {
                            f = 1.0f;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    f = 0.0f;
                    gapComposer5.end(false);
                    Float valueOf = Float.valueOf(f);
                    boolean changed5 = gapComposer5.changed(transition);
                    Object rememberedValue5 = gapComposer5.rememberedValue();
                    if (changed5 || rememberedValue5 == obj4) {
                        rememberedValue5 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(transition, 28));
                        gapComposer5.updateRememberedValue(rememberedValue5);
                    }
                    EnterExitState enterExitState = (EnterExitState) ((State) rememberedValue5).getValue();
                    gapComposer5.startReplaceGroup(1101694071);
                    int ordinal2 = enterExitState.ordinal();
                    if (ordinal2 != 0 && ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            f2 = 1.0f;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    gapComposer5.end(false);
                    Float valueOf2 = Float.valueOf(f2);
                    boolean changed6 = gapComposer5.changed(transition);
                    Object rememberedValue6 = gapComposer5.rememberedValue();
                    if (changed6 || rememberedValue6 == obj4) {
                        rememberedValue6 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(transition, 29));
                        gapComposer5.updateRememberedValue(rememberedValue6);
                    }
                    Transition.TransitionAnimationState createTransitionAnimation = AnimatableKt.createTransitionAnimation(transition, valueOf, valueOf2, (FiniteAnimationSpec) hero3DCardViewKt$$ExternalSyntheticLambda11.invoke(((State) rememberedValue6).getValue(), gapComposer5, 0), twoWayConverterImpl, gapComposer5, 196608);
                    Unit unit = Unit.INSTANCE;
                    boolean changed7 = gapComposer5.changed(createTransitionAnimation);
                    Object rememberedValue7 = gapComposer5.rememberedValue();
                    if (changed7 || rememberedValue7 == obj4) {
                        rememberedValue7 = new CardAppletWorker$setup$1$2$1(state, createTransitionAnimation, mutableFloatState, null, 21);
                        gapComposer5.updateRememberedValue(rememberedValue7);
                    }
                    Updater.LaunchedEffect(gapComposer5, unit, (Function2) rememberedValue7);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                CardSchemeViewModel.Module.NextUpCard nextUpCard = (CardSchemeViewModel.Module.NextUpCard) obj5;
                Function1 function14 = (Function1) obj6;
                Modifier modifier = (Modifier) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                modifier.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(modifier) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    String str = nextUpCard.title;
                    String str2 = nextUpCard.ctaText;
                    if (str2 == null) {
                        str2 = nextUpCard.subtitle;
                    }
                    String str3 = str2;
                    String str4 = nextUpCard.accessibilityText;
                    boolean z = !nextUpCard.isDisabled;
                    boolean changed8 = gapComposer6.changed(function14) | gapComposer6.changedInstance(nextUpCard);
                    Object rememberedValue8 = gapComposer6.rememberedValue();
                    if (changed8 || rememberedValue8 == obj4) {
                        rememberedValue8 = new WalletCardSchemeViewKt$$ExternalSyntheticLambda13(function14, nextUpCard, 4);
                        gapComposer6.updateRememberedValue(rememberedValue8);
                    }
                    UtilsKt.NextUpCardContent(str, str3, str4, z, (Function0) rememberedValue8, Expect_jvmKt.rememberComposableLambda(-1954917387, new FieldBinding$$ExternalSyntheticLambda4(nextUpCard, i3), gapComposer6), modifier, gapComposer6, (3670016 & (intValue6 << 18)) | 196608);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                CardSchemeViewModel.Module.Accessory.Button button = (CardSchemeViewModel.Module.Accessory.Button) obj6;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj5;
                Pair pair = (Pair) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                pair.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(pair) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    SizeKt.ButtonCompact(button.onClick, null, UtilsKt.toButtonProminence((CardSchemeViewModel.Module.Accessory.Button.Prominence) pair.second), ((Boolean) pair.first).booleanValue(), button.isEnabled, null, composableLambdaImpl, gapComposer7, 1572864, 34);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                CardSchemeViewModel cardSchemeViewModel = (CardSchemeViewModel) obj6;
                MutableState mutableState = (MutableState) obj5;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer8).changed(booleanValue) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                boolean shouldExecute = gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18);
                Applier applier = gapComposer8.applier;
                if (shouldExecute) {
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer8, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer8.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer8, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf3 = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer8, valueOf3, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer8, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    if (booleanValue) {
                        gapComposer8.startReplaceGroup(88755295);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                        Density density = (Density) gapComposer8.consume(staticProvidableCompositionLocal);
                        Modifier m287sizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m287sizeVpY3zN4(companion, density.mo233toDpu2uoSUM((int) (((IntSize) mutableState.getValue()).packedValue >> 32)), density.mo233toDpu2uoSUM((int) (((IntSize) mutableState.getValue()).packedValue & BodyPartID.bodyIdMax)));
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode2 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer8.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer8, m287sizeVpY3zN4);
                        gapComposer8.startReusableNode();
                        if (gapComposer8.inserting) {
                            gapComposer8.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer8.useNode();
                        }
                        Updater.m576setimpl(gapComposer8, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer8, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer8, composeUiNode$Companion$SetModifier$13, gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer8, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        gapComposer8.startReplaceGroup(-36574460);
                        Density density2 = (Density) gapComposer8.consume(staticProvidableCompositionLocal);
                        TextStyle textStyle = (TextStyle) gapComposer8.consume(ArcadeThemeKt.LocalTextStyle);
                        if (textStyle == null) {
                            gapComposer8.startReplaceGroup(-1100573765);
                            textStyle = ((Typography) gapComposer8.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                            r4 = 0;
                        } else {
                            r4 = 0;
                            gapComposer8.startReplaceGroup(-1100574912);
                        }
                        gapComposer8.end(r4);
                        float mo231toDpGaN1DYA = density2.mo231toDpGaN1DYA(textStyle.paragraphStyle.lineHeight);
                        gapComposer8.end(r4);
                        ProgressCircularKt.ProgressCircular(r4, r4, gapComposer8, androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion, mo231toDpGaN1DYA));
                        gapComposer8.end(true);
                        gapComposer8.end(r4);
                    } else {
                        gapComposer8.startReplaceGroup(89638237);
                        Object rememberedValue9 = gapComposer8.rememberedValue();
                        if (rememberedValue9 == obj4) {
                            rememberedValue9 = new HeroTagViewKt$$ExternalSyntheticLambda7(9, mutableState);
                            gapComposer8.updateRememberedValue(rememberedValue9);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4092, 0L, (Composer) gapComposer8, RulerKt.onPlaced(companion, (Function1) rememberedValue9), (TextStyle) null, (TextLineBalancing) null, ((CardSchemeViewModel.RetryableError) cardSchemeViewModel).buttonText, (Map) null, (Function1) null, false);
                        gapComposer8.end(false);
                    }
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                MerchantPickerViewModel merchantPickerViewModel = (MerchantPickerViewModel) obj5;
                Function1 function15 = (Function1) obj6;
                PaddingValues paddingValues3 = (PaddingValues) obj;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                paddingValues3.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer9).changed(paddingValues3) ? 4 : 2;
                }
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    MerchantPickerBottomSheetViewKt.MerchantPickerContent(merchantPickerViewModel, function15, SpacerKt.padding(companion, paddingValues3), gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Function0 function0 = (Function0) obj6;
                Integer num = (Integer) obj5;
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((GapComposer) composer10).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                    modalButtonScope.SecondaryModalButton(function0, null, false, Expect_jvmKt.rememberComposableLambda(-685650715, new CardAppletTile$$ExternalSyntheticLambda1(num, 10), gapComposer10), gapComposer10, ((intValue10 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Transition transition2 = (Transition) obj6;
                ClockInOverlayState clockInOverlayState = (ClockInOverlayState) obj5;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    boolean changed9 = gapComposer11.changed(clockInOverlayState);
                    Object rememberedValue10 = gapComposer11.rememberedValue();
                    if (changed9 || rememberedValue10 == obj4) {
                        RealOverlayLayer$show$3 realOverlayLayer$show$3 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "dismissOverlay", "dismissOverlay()V", 0, 12);
                        gapComposer11.updateRememberedValue(realOverlayLayer$show$3);
                        rememberedValue10 = realOverlayLayer$show$3;
                    }
                    DisclaimerTextKt.ClockInOverlayHeader(transition2, (Function0) ((KFunction) rememberedValue10), gapComposer11, 0);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ClockInOverlayViewModel clockInOverlayViewModel = (ClockInOverlayViewModel) obj6;
                ClockInOverlayState clockInOverlayState2 = (ClockInOverlayState) obj5;
                PaddingValues paddingValues4 = (PaddingValues) obj;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                paddingValues4.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer12).changed(paddingValues4) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    LayoutDirection layoutDirection = (LayoutDirection) gapComposer12.consume(CompositionLocalsKt.LocalLayoutDirection);
                    PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(SpacerKt.calculateStartPadding(paddingValues4, layoutDirection), RecyclerView.DECELERATION_RATE, SpacerKt.calculateEndPadding(paddingValues4, layoutDirection), ((Dp) RangesKt___RangesKt.coerceAtLeast(new Dp(paddingValues4.mo264calculateBottomPaddingD9Ej5fM() - 16.0f), new Dp(RecyclerView.DECELERATION_RATE))).value);
                    if ((clockInOverlayViewModel instanceof ClockInOverlayViewModel.Loading) || (clockInOverlayViewModel instanceof ClockInOverlayViewModel.Error)) {
                        gapComposer12.startReplaceGroup(1002708691);
                        boolean changed10 = gapComposer12.changed(clockInOverlayState2);
                        Object rememberedValue11 = gapComposer12.rememberedValue();
                        if (changed10 || rememberedValue11 == obj4) {
                            rememberedValue11 = new RealOverlayLayer$show$3(0, clockInOverlayState2, ClockInOverlayState.class, "dismissOverlay", "dismissOverlay()V", 0, 26);
                            gapComposer12.updateRememberedValue(rememberedValue11);
                        }
                        DisclaimerTextKt.ClockInOverlayLoadingErrorContent(clockInOverlayViewModel, paddingValuesImpl, (Function0) ((KFunction) rememberedValue11), gapComposer12, 0);
                        gapComposer12.end(false);
                    } else {
                        if (!(clockInOverlayViewModel instanceof ClockInOverlayViewModel.Loaded)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer12, 1002705343, false);
                        }
                        gapComposer12.startReplaceGroup(1002715720);
                        DisclaimerTextKt.ClockInOverlayLoadedContent(clockInOverlayState2, (ClockInOverlayViewModel.Loaded) clockInOverlayViewModel, paddingValuesImpl, gapComposer12, 0);
                        gapComposer12.end(false);
                    }
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                DeclareCashTipBottomSheetViewModel declareCashTipBottomSheetViewModel = (DeclareCashTipBottomSheetViewModel) obj5;
                Function1 function16 = (Function1) obj6;
                PaddingValues paddingValues5 = (PaddingValues) obj;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                paddingValues5.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((GapComposer) composer13).changed(paddingValues5) ? 4 : 2;
                }
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 19) != 18)) {
                    DisclaimerTextKt.DeclareCashTipSheetContent(declareCashTipBottomSheetViewModel, paddingValues5, function16, gapComposer13, (intValue13 << 3) & 112);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ListBuilder listBuilder = (ListBuilder) obj6;
                MutableState mutableState2 = (MutableState) obj5;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                boolean z2 = (intValue14 & 17) != 16;
                int i5 = intValue14 & 1;
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(i5, z2)) {
                    Object rememberedValue12 = gapComposer14.rememberedValue();
                    if (rememberedValue12 == obj4) {
                        rememberedValue12 = new WalletHomeViewKt$$ExternalSyntheticLambda6(14, mutableState2);
                        gapComposer14.updateRememberedValue(rememberedValue12);
                    }
                    MenuKt.IconButton((Function0) rememberedValue12, null, false, null, null, PayCellViewKt.f773lambda$1416641230, gapComposer14, 1572870, 62);
                    boolean booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
                    Object rememberedValue13 = gapComposer14.rememberedValue();
                    if (rememberedValue13 == obj4) {
                        rememberedValue13 = new WalletHomeViewKt$$ExternalSyntheticLambda6(15, mutableState2);
                        gapComposer14.updateRememberedValue(rememberedValue13);
                    }
                    ExpandableContentKt.m3808ExpandableContent0aeBpQE(listBuilder, booleanValue2, 250.0f, (Function0) rememberedValue13, gapComposer14, 24960);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Function1 function17 = (Function1) obj6;
                TaxFormDownloaderViewModel taxFormDownloaderViewModel = (TaxFormDownloaderViewModel) obj5;
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((GapComposer) composer15).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                    boolean changed11 = gapComposer15.changed(function17);
                    Object rememberedValue14 = gapComposer15.rememberedValue();
                    if (changed11 || rememberedValue14 == obj4) {
                        rememberedValue14 = new PayHomeViewKt$$ExternalSyntheticLambda2(23, function17);
                        gapComposer15.updateRememberedValue(rememberedValue14);
                    }
                    modalButtonScope2.PrimaryModalButton((Function0) rememberedValue14, null, false, Expect_jvmKt.rememberComposableLambda(524489875, new TaxFormDownloaderDialogViewKt$$ExternalSyntheticLambda2(taxFormDownloaderViewModel, i4), gapComposer15), gapComposer15, ((intValue15 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                IntentConfirmationChallengeActivity intentConfirmationChallengeActivity = (IntentConfirmationChallengeActivity) obj6;
                MutableState mutableState3 = (MutableState) obj5;
                PaddingValues paddingValues6 = (PaddingValues) obj;
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                int i6 = IntentConfirmationChallengeActivity.$r8$clinit;
                paddingValues6.getClass();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((GapComposer) composer16).changed(paddingValues6) ? 4 : 2;
                }
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 19) != 18)) {
                    Modifier padding2 = SpacerKt.padding(companion, paddingValues6);
                    String str5 = intentConfirmationChallengeActivity.getViewModel().userAgent;
                    DefaultConfirmationChallengeBridgeHandler defaultConfirmationChallengeBridgeHandler = intentConfirmationChallengeActivity.getViewModel().bridgeHandler;
                    boolean booleanValue3 = ((Boolean) mutableState3.getValue()).booleanValue();
                    IntentConfirmationChallengeViewModel viewModel = intentConfirmationChallengeActivity.getViewModel();
                    boolean changedInstance = gapComposer16.changedInstance(viewModel);
                    Object rememberedValue15 = gapComposer16.rememberedValue();
                    if (changedInstance || rememberedValue15 == obj4) {
                        ScannerView.AnonymousClass1 anonymousClass1 = new ScannerView.AnonymousClass1(0, viewModel, IntentConfirmationChallengeViewModel.class, "closeClicked", "closeClicked()V", 0, 5);
                        gapComposer16.updateRememberedValue(anonymousClass1);
                        rememberedValue15 = anonymousClass1;
                    }
                    Function0 function02 = (Function0) ((KFunction) rememberedValue15);
                    boolean changedInstance2 = gapComposer16.changedInstance(intentConfirmationChallengeActivity);
                    Object rememberedValue16 = gapComposer16.rememberedValue();
                    if (changedInstance2 || rememberedValue16 == obj4) {
                        rememberedValue16 = new IntentConfirmationChallengeActivity$$ExternalSyntheticLambda0(intentConfirmationChallengeActivity, i4);
                        gapComposer16.updateRememberedValue(rememberedValue16);
                    }
                    IntentConfirmationChallengeUIKt.IntentConfirmationChallengeUI(padding2, str5, defaultConfirmationChallengeBridgeHandler, booleanValue3, function02, (Function0) rememberedValue16, null, gapComposer16, 48);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                TextResource.Text text = (TextResource.Text) obj5;
                Function1 function18 = (Function1) obj6;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    boolean changed12 = gapComposer17.changed(function18);
                    Object rememberedValue17 = gapComposer17.rememberedValue();
                    if (changed12 || rememberedValue17 == obj4) {
                        rememberedValue17 = new ViewGroups$$ExternalSyntheticLambda0(17, function18);
                        gapComposer17.updateRememberedValue(rememberedValue17);
                    }
                    TextKt.m4020AnnotatedTextrm0N8CA(text, (Function1) rememberedValue17, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer17.consume(ThemeKt.LocalTypography)).headingXLarge, ((FinancialConnectionsColors) gapComposer17.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446), null, null, 0, 0, gapComposer17, 0, 120);
                    SpacerKt.Spacer(gapComposer17, androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion, 32.0f));
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen = ((GenericScreenState) obj5).screen;
                Function1 function19 = (Function1) obj6;
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(20.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer18, 6);
                    int hashCode3 = Long.hashCode(gapComposer18.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer18.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer18, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer18.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer18.startReusableNode();
                    if (gapComposer18.inserting) {
                        gapComposer18.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer18.useNode();
                    }
                    Updater.m576setimpl(gapComposer18, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer18, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer18, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer18, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer18, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    FinancialConnectionsGenericInfoScreen.Header header = financialConnectionsGenericInfoScreen.header;
                    if (header == null) {
                        gapComposer18.startReplaceGroup(-941077977);
                    } else {
                        gapComposer18.startReplaceGroup(-941077976);
                        FillrWidget.WidgetType.AnonymousClass1.GenericHeader(header, function19, SpacerKt.m300paddingVpY3zN4$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer18, MLKEMEngine.KyberPolyBytes);
                    }
                    gapComposer18.end(false);
                    FinancialConnectionsGenericInfoScreen.Body body = financialConnectionsGenericInfoScreen.body;
                    if (body == null) {
                        gapComposer18.startReplaceGroup(-940813330);
                    } else {
                        gapComposer18.startReplaceGroup(-940813329);
                        FillrWidget.WidgetType.AnonymousClass1.GenericBody(body, null, function19, gapComposer18, 0);
                    }
                    gapComposer18.end(false);
                    gapComposer18.end(true);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                HeroCardViewKt$$ExternalSyntheticLambda9 heroCardViewKt$$ExternalSyntheticLambda9 = (HeroCardViewKt$$ExternalSyntheticLambda9) obj6;
                String str6 = (String) obj5;
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    InstitutionPickerScreenKt.SearchMoreRow(SpacerKt.m298padding3ABfNKs(companion, 8.0f), heroCardViewKt$$ExternalSyntheticLambda9, str6 == null, gapComposer19, 6);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                InstitutionPickerState.Payload payload = (InstitutionPickerState.Payload) obj6;
                Function0 function03 = (Function0) obj5;
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    InstitutionPickerScreenKt.NoResultsTile(SpacerKt.m298padding3ABfNKs(companion, 8.0f), payload.featuredInstitutions.showManualEntry, function03, gapComposer20, 6);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Async async = (Async) obj6;
                Function0 function04 = (Function0) obj5;
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    InstitutionPickerScreenKt.NoResultsTile(SpacerKt.m298padding3ABfNKs(companion, 8.0f), ((InstitutionResponse) ((Async.Success) async).value).showManualEntry, function04, gapComposer21, 6);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                return invoke$com$stripe$android$financialconnections$features$networkinglinksignup$NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda23(obj, obj2, obj3);
            default:
                NavHostController navHostController = (NavHostController) obj6;
                Destination destination = (Destination) obj5;
                Composer composer22 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                int i7 = FinancialConnectionsSheetNativeActivity.$r8$clinit;
                ((PaddingValues) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    String fullRoute = destination.getFullRoute();
                    Object rememberedValue18 = gapComposer22.rememberedValue();
                    if (rememberedValue18 == obj4) {
                        rememberedValue18 = new StripeApiRepository$$ExternalSyntheticLambda5(i2);
                        gapComposer22.updateRememberedValue(rememberedValue18);
                    }
                    NavHostKt.NavHost(navHostController, fullRoute, null, null, null, null, null, null, (Function1) rememberedValue18, gapComposer22, 0);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ WorkTitleBarViewKt$$ExternalSyntheticLambda4(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = function1;
    }
}
