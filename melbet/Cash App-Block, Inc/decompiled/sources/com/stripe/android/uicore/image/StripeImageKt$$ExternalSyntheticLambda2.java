package com.stripe.android.uicore.image;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.PaddingKt$plus$1;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.address.typeahead.backend.api.AddressState;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.SetAddressViewModel;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardTextureState;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.sheet.BasicShieetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda16;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt;
import com.squareup.util.Strings;
import com.squareup.workflow1.TimerWorker$run$1;
import com.stripe.android.uicore.image.StripeImageState;
import com.stripe.hcaptcha.encode.EncodeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda78;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class StripeImageKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;

    public /* synthetic */ StripeImageKt$$ExternalSyntheticLambda2(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, Function2 function2, PaddingValuesImpl paddingValuesImpl, LazyListState lazyListState, Function1 function1) {
        this.$r8$classId = 2;
        this.f$7 = composableLambdaImpl;
        this.f$0 = composableLambdaImpl2;
        this.f$1 = composableLambdaImpl3;
        this.f$2 = function2;
        this.f$4 = paddingValuesImpl;
        this.f$5 = lazyListState;
        this.f$6 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        int i = this.$r8$classId;
        Continuation continuation = null;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = Composer.Companion.Empty;
        Object obj5 = this.f$7;
        Object obj6 = this.f$6;
        Object obj7 = this.f$5;
        Object obj8 = this.f$4;
        Object obj9 = this.f$2;
        Object obj10 = this.f$1;
        Object obj11 = this.f$0;
        switch (i) {
            case 0:
                String str2 = (String) obj11;
                DefaultStripeImageLoader defaultStripeImageLoader = (DefaultStripeImageLoader) obj10;
                BiasAlignment biasAlignment = (BiasAlignment) obj9;
                Painter painter = (Painter) obj8;
                Function3 function3 = (Function3) obj7;
                Function3 function32 = (Function3) obj6;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj5;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    boolean booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
                    long j = boxWithConstraintsScopeImpl.constraints;
                    int m1025getMaxWidthimpl = (Constraints.m1025getMaxWidthimpl(j) <= 0 || Constraints.m1025getMaxWidthimpl(j) >= Integer.MAX_VALUE) ? -1 : Constraints.m1025getMaxWidthimpl(j);
                    int m1024getMaxHeightimpl = (Constraints.m1024getMaxHeightimpl(j) <= 0 || Constraints.m1024getMaxHeightimpl(j) >= Integer.MAX_VALUE) ? -1 : Constraints.m1024getMaxHeightimpl(j);
                    int i2 = m1025getMaxWidthimpl == -1 ? m1024getMaxHeightimpl : m1025getMaxWidthimpl;
                    int i3 = m1024getMaxHeightimpl == -1 ? i2 : m1024getMaxHeightimpl;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == obj4) {
                        rememberedValue = (!booleanValue || painter == null) ? Updater.mutableStateOf$default(StripeImageState.Error.INSTANCE$1) : Updater.mutableStateOf$default(new StripeImageState.Success(painter));
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    MutableState mutableState = (MutableState) rememberedValue;
                    if (booleanValue) {
                        z = false;
                        gapComposer.startReplaceGroup(1974193445);
                    } else {
                        gapComposer.startReplaceGroup(1979859687);
                        boolean changedInstance = gapComposer.changedInstance(defaultStripeImageLoader) | gapComposer.changed(str2) | gapComposer.changed(i2) | gapComposer.changed(i3);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue2 == obj4) {
                            str = str2;
                            Object stripeImageKt$StripeImage$3$1$1 = new StripeImageKt$StripeImage$3$1$1(defaultStripeImageLoader, str, i2, i3, mutableState, null);
                            gapComposer.updateRememberedValue(stripeImageKt$StripeImage$3$1$1);
                            rememberedValue2 = stripeImageKt$StripeImage$3$1$1;
                        } else {
                            str = str2;
                        }
                        Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue2);
                        z = false;
                    }
                    gapComposer.end(z);
                    Modifier align = BoxScopeInstance.INSTANCE.align(companion, biasAlignment);
                    StripeImageState stripeImageState = (StripeImageState) mutableState.getValue();
                    boolean changed = gapComposer.changed(z);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed || rememberedValue3 == obj4) {
                        rememberedValue3 = new EncodeKt$$ExternalSyntheticLambda0(16);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    AnimatedContentKt.AnimatedContent(stripeImageState, align, null, null, "loading_image_animation", (Function1) rememberedValue3, Expect_jvmKt.rememberComposableLambda(-285888799, new TabToolbarsKt$$ExternalSyntheticLambda16(function3, boxWithConstraintsScopeImpl, function32, composableLambdaImpl, 8), gapComposer), gapComposer, 1597440, 12);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                SetAddressViewModel setAddressViewModel = (SetAddressViewModel) obj11;
                TouchRecorder touchRecorder = (TouchRecorder) obj10;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj9;
                Function1 function1 = (Function1) obj8;
                AddressState addressState = (AddressState) obj7;
                MutableState mutableState2 = (MutableState) obj6;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj5;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (setAddressViewModel.showHelp) {
                        gapComposer2.startReplaceGroup(-1104894443);
                        Strings.TouchRecordingLayout(touchRecorder, null, Expect_jvmKt.rememberComposableLambda(154912707, new SetPinViewKt$$ExternalSyntheticLambda2(21, (Object) animatedContentScopeImpl, (Object) function1), gapComposer2), gapComposer2, 392, 2);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1104521575);
                        gapComposer2.end(false);
                    }
                    Strings.TouchRecordingLayout(touchRecorder, null, Expect_jvmKt.rememberComposableLambda(526000062, new SwipeToDismissKt$$ExternalSyntheticLambda3(animatedContentScopeImpl, addressState, mutableState2, function1, touchRecorder, delegatingSoftwareKeyboardController, 10), gapComposer2), gapComposer2, 392, 2);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj5;
                ComposableLambdaImpl composableLambdaImpl3 = (ComposableLambdaImpl) obj11;
                ComposableLambdaImpl composableLambdaImpl4 = (ComposableLambdaImpl) obj10;
                Function2 function2 = (Function2) obj9;
                PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj8;
                LazyListState lazyListState = (LazyListState) obj7;
                Function1 function12 = (Function1) obj6;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl2 = (BoxWithConstraintsScopeImpl) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(boxWithConstraintsScopeImpl2) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    int i4 = intValue3 & 14;
                    composableLambdaImpl2.invoke(boxWithConstraintsScopeImpl2, gapComposer3, Integer.valueOf(i4));
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    boolean changed2 = (i4 == 4) | gapComposer3.changed(composableLambdaImpl3) | gapComposer3.changed(composableLambdaImpl4) | gapComposer3.changed(function2) | gapComposer3.changed(paddingValuesImpl) | gapComposer3.changed(lazyListState) | gapComposer3.changed(function12);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue4 == obj4) {
                        rememberedValue4 = new BasicShieetKt$$ExternalSyntheticLambda0(function2, composableLambdaImpl3, composableLambdaImpl4, paddingValuesImpl, lazyListState, function12, boxWithConstraintsScopeImpl2);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    RulerKt.SubcomposeLayout((Modifier) null, (Function2) rememberedValue4, gapComposer3, 0, 1);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj11;
                Placeable placeable = (Placeable) obj10;
                Placeable placeable2 = (Placeable) obj9;
                PaddingValuesImpl paddingValuesImpl2 = (PaddingValuesImpl) obj8;
                LazyListState lazyListState2 = (LazyListState) obj7;
                Object obj12 = (Function1) obj6;
                Object obj13 = (BoxWithConstraintsScopeImpl) obj5;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((BoxWithConstraintsScopeImpl) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, subcomposeMeasureScope.mo233toDpu2uoSUM(placeable.height), RecyclerView.DECELERATION_RATE, subcomposeMeasureScope.mo233toDpu2uoSUM(placeable2.height), 5);
                    PaddingKt$plus$1 paddingKt$plus$1 = new PaddingKt$plus$1(m297PaddingValuesa9UjIt4$default, paddingValuesImpl2);
                    ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    PaddingKt$plus$1 paddingKt$plus$12 = new PaddingKt$plus$1(paddingKt$plus$1, SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2));
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    boolean changed3 = gapComposer4.changed(obj12) | gapComposer4.changed(obj13) | gapComposer4.changed(m297PaddingValuesa9UjIt4$default);
                    Object rememberedValue5 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue5 == obj4) {
                        rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda39(7, obj12, obj13, m297PaddingValuesa9UjIt4$default);
                        gapComposer4.updateRememberedValue(rememberedValue5);
                    }
                    LazyDslKt.LazyColumn(fillMaxSize2, lazyListState2, paddingKt$plus$12, arrangement$SpacedAligned, null, null, false, null, (Function1) rememberedValue5, gapComposer4, 24582, 488);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Function0 function0 = (Function0) obj11;
                CardNuxState cardNuxState = (CardNuxState) obj10;
                CardModelView cardModelView = (CardModelView) obj9;
                Function0 function02 = (Function0) obj8;
                Function0 function03 = (Function0) obj7;
                Function0 function04 = (Function0) obj6;
                Function1 function13 = (Function1) obj5;
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) obj;
                ((Integer) obj3).getClass();
                heroCardDetails.getClass();
                GapComposer gapComposer5 = (GapComposer) ((Composer) obj2);
                Object rememberedValue6 = gapComposer5.rememberedValue();
                if (rememberedValue6 == obj4) {
                    rememberedValue6 = RevolvingInteractiveCardsKt.toCardViewModelInternal(heroCardDetails);
                    gapComposer5.updateRememberedValue(rememberedValue6);
                }
                CardModelView.ViewModel viewModel = (CardModelView.ViewModel) rememberedValue6;
                Object rememberedValue7 = gapComposer5.rememberedValue();
                if (rememberedValue7 == obj4) {
                    rememberedValue7 = Updater.mutableStateOf$default(null);
                    gapComposer5.updateRememberedValue(rememberedValue7);
                }
                MutableState mutableState3 = (MutableState) rememberedValue7;
                Unit unit = Unit.INSTANCE;
                boolean changed4 = gapComposer5.changed(function0);
                Object rememberedValue8 = gapComposer5.rememberedValue();
                if (changed4 || rememberedValue8 == obj4) {
                    rememberedValue8 = new TimerWorker$run$1(mutableState3, function0, continuation, 11);
                    gapComposer5.updateRememberedValue(rememberedValue8);
                }
                Updater.LaunchedEffect(gapComposer5, unit, (Function2) rememberedValue8);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                if (gapComposer5.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer5.startReusableNode();
                if (gapComposer5.inserting) {
                    gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer5.useNode();
                }
                Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                if (cardNuxState.getCurrentTextureState() == null) {
                    CardTextureState currentTextureState = cardNuxState.getCurrentTextureState();
                    cardNuxState.currentTextureState$delegate.setValue(currentTextureState != null ? new CardTextureState(currentTextureState.engine, 2046) : new CardTextureState(null, 2047));
                }
                Object rememberedValue9 = gapComposer5.rememberedValue();
                if (rememberedValue9 == obj4) {
                    rememberedValue9 = cardNuxState.getCurrentTextureState();
                    rememberedValue9.getClass();
                    gapComposer5.updateRememberedValue(rememberedValue9);
                }
                CardTextureState cardTextureState = (CardTextureState) rememberedValue9;
                boolean changedInstance2 = gapComposer5.changedInstance(cardTextureState) | gapComposer5.changedInstance(cardNuxState);
                Object rememberedValue10 = gapComposer5.rememberedValue();
                if (changedInstance2 || rememberedValue10 == obj4) {
                    rememberedValue10 = new BottomSheet$$ExternalSyntheticLambda3(29, cardTextureState, cardNuxState);
                    gapComposer5.updateRememberedValue(rememberedValue10);
                }
                Updater.DisposableEffect(unit, (Function1) rememberedValue10, gapComposer5);
                Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                boolean changedInstance3 = gapComposer5.changedInstance(cardTextureState) | gapComposer5.changedInstance(cardModelView) | gapComposer5.changed(function02) | gapComposer5.changed(function03) | gapComposer5.changed(function04);
                Object rememberedValue11 = gapComposer5.rememberedValue();
                if (changedInstance3 || rememberedValue11 == obj4) {
                    rememberedValue11 = new SelfieWorkflow$$ExternalSyntheticLambda78(cardTextureState, cardModelView, function02, function03, function04, 2);
                    gapComposer5.updateRememberedValue(rememberedValue11);
                }
                Function1 function14 = (Function1) rememberedValue11;
                boolean changed5 = gapComposer5.changed(function13) | gapComposer5.changedInstance(viewModel);
                Object rememberedValue12 = gapComposer5.rememberedValue();
                if (changed5 || rememberedValue12 == obj4) {
                    rememberedValue12 = new CardTransitionKt$$ExternalSyntheticLambda4(19, function13, viewModel, mutableState3);
                    gapComposer5.updateRememberedValue(rememberedValue12);
                }
                AndroidView_androidKt.AndroidView(function14, fillMaxSize3, (Function1) rememberedValue12, gapComposer5, 48, 0);
                gapComposer5.end(true);
                return unit;
        }
    }

    public /* synthetic */ StripeImageKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = obj4;
        this.f$5 = obj5;
        this.f$6 = obj6;
        this.f$7 = obj7;
    }
}
