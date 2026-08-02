package com.squareup.util.coroutines;

import android.view.View;
import androidx.camera.camera2.adapter.SupportedSurfaceCombination;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import com.google.maps.android.compose.InputHandlerNode;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneySubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$PercentSubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.checks.CaptureCheckFacePresenter;
import com.squareup.cash.checks.CaptureCheckFaceViewModel;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownListKt$$ExternalSyntheticLambda6;
import com.squareup.cash.mooncake.compose_ui.components.KeyPadChar;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import com.squareup.cash.wallet.views.InteractiveCardState;
import com.squareup.protos.cash.postcard.CardRenderingInfo;
import com.squareup.protos.common.Money;
import com.squareup.util.Quadruple;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final /* synthetic */ class StateFlowKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ StateFlowKt$$ExternalSyntheticLambda3(MoneybotMarkdownListKt$$ExternalSyntheticLambda6 moneybotMarkdownListKt$$ExternalSyntheticLambda6, StateFlow stateFlow, DerivedStateFlow derivedStateFlow, ReadonlyStateFlow readonlyStateFlow, DerivedStateFlow derivedStateFlow2, DerivedStateFlow derivedStateFlow3) {
        this.$r8$classId = 0;
        this.f$0 = moneybotMarkdownListKt$$ExternalSyntheticLambda6;
        this.f$1 = stateFlow;
        this.f$2 = derivedStateFlow;
        this.f$3 = readonlyStateFlow;
        this.f$4 = derivedStateFlow2;
        this.f$5 = derivedStateFlow3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.math.BigDecimal] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int intValue;
        int i = this.$r8$classId;
        Object obj = this.f$5;
        Object obj2 = this.f$4;
        Object obj3 = this.f$2;
        Object obj4 = this.f$3;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                return ((MoneybotMarkdownListKt$$ExternalSyntheticLambda6) obj6).invoke(((StateFlow) obj5).getValue(), ((Function0) ((DerivedStateFlow) obj3).getValue).invoke(), ((StateFlow) obj4).getValue(), ((Function0) ((DerivedStateFlow) obj2).getValue).invoke(), ((Function0) ((DerivedStateFlow) obj).getValue).invoke());
            case 1:
                return Boolean.valueOf(((SupportedSurfaceCombination) obj6).checkSupported((SupportedSurfaceCombination.FeatureSettings) obj5, (ArrayList) obj4, (LinkedHashMap) obj3, (List) obj2, (ArrayList) obj));
            case 2:
                return new InputHandlerNode((Function1) obj6, (Function1) obj5, (Function1) obj4, (Function1) obj3, (Function1) obj2, (Function1) obj);
            case 3:
                AmountConfig amountConfig = (AmountConfig) obj5;
                AmountPickerViewModel.Ready ready = (AmountPickerViewModel.Ready) obj4;
                Function1 function1 = (Function1) obj3;
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj2;
                Shaker shaker = (Shaker) obj;
                String rawAmount = ((AmountDisplayState) obj6).getRawAmount();
                if (amountConfig instanceof AmountConfig.MoneyConfig) {
                    Money money = new Money(Long.valueOf(MathKt__MathJVMKt.roundToLong(Double.parseDouble(rawAmount) * 100.0d)), ((AmountConfig.MoneyConfig) amountConfig).currency, 4);
                    AmountPickerViewModel.Ready.Amount amount = ready.minAmount;
                    AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount = amount instanceof AmountPickerViewModel.Ready.Amount.MoneyAmount ? (AmountPickerViewModel.Ready.Amount.MoneyAmount) amount : null;
                    if (Moneys.compareTo(money, moneyAmount != null ? moneyAmount.money : null) >= 0) {
                        function1.invoke(new AmountPickerViewEvent$Full$MoneySubmitted(money));
                    } else {
                        if (realCashVibrator != null) {
                            realCashVibrator.error();
                        }
                        shaker.shake();
                    }
                } else {
                    if (!(amountConfig instanceof AmountConfig.PercentConfig)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    BigDecimal bigDecimalOrNull = StringsKt__StringNumberConversionsJVMKt.toBigDecimalOrNull(rawAmount);
                    BigDecimal bigDecimal = bigDecimalOrNull;
                    if (bigDecimalOrNull == null) {
                        bigDecimal = BigDecimal.ZERO;
                    }
                    AmountPickerViewModel.Ready.Amount amount2 = ready.minAmount;
                    AmountPickerViewModel.Ready.Amount.PercentAmount percentAmount = amount2 instanceof AmountPickerViewModel.Ready.Amount.PercentAmount ? (AmountPickerViewModel.Ready.Amount.PercentAmount) amount2 : null;
                    BigDecimal bigDecimal2 = percentAmount != null ? percentAmount.percent : null;
                    AmountPickerViewModel.Ready.Amount amount3 = ready.maxAmount;
                    AmountPickerViewModel.Ready.Amount.PercentAmount percentAmount2 = amount3 instanceof AmountPickerViewModel.Ready.Amount.PercentAmount ? (AmountPickerViewModel.Ready.Amount.PercentAmount) amount3 : null;
                    r2 = percentAmount2 != null ? percentAmount2.percent : 0;
                    boolean z = bigDecimal2 == null || bigDecimal.compareTo(bigDecimal2) >= 0;
                    r1 = (r2 == 0 || bigDecimal.compareTo(r2) <= 0) ? 1 : 0;
                    if (!z || r1 == 0) {
                        if (realCashVibrator != null) {
                            realCashVibrator.error();
                        }
                        shaker.shake();
                    } else {
                        bigDecimal.getClass();
                        function1.invoke(new AmountPickerViewEvent$Full$PercentSubmitted(bigDecimal));
                    }
                }
                return Unit.INSTANCE;
            case 4:
                CaptureCheckFacePresenter captureCheckFacePresenter = (CaptureCheckFacePresenter) obj6;
                MutableState mutableState = (MutableState) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                MutableState mutableState3 = (MutableState) obj3;
                MutableState mutableState4 = (MutableState) obj2;
                MutableState mutableState5 = (MutableState) obj;
                if (((CaptureCheckFaceViewModel.Loaded.FinalFrame) mutableState.getValue()) == null) {
                    return ((Boolean) mutableState2.getValue()).booleanValue() ? new CaptureCheckFaceViewModel.Loaded.ShowMiSnap(captureCheckFacePresenter.miSnapLicense, captureCheckFacePresenter.miSnapUseCase, ((Boolean) mutableState3.getValue()).booleanValue(), (String) mutableState4.getValue()) : ((Boolean) mutableState5.getValue()).booleanValue() ? CaptureCheckFaceViewModel.CameraPermissionPermanentlyDenied.INSTANCE : CaptureCheckFaceViewModel.Loading.INSTANCE;
                }
                CaptureCheckFaceViewModel.Loaded.FinalFrame finalFrame = (CaptureCheckFaceViewModel.Loaded.FinalFrame) mutableState.getValue();
                finalFrame.getClass();
                return finalFrame;
            case 5:
                Function0 function0 = (Function0) obj3;
                Function1 function12 = (Function1) obj2;
                JobKt.launch$default((CoroutineScope) obj6, null, null, new HeroCardViewKt$Render$1$8$1.AnonymousClass3((MutableState) obj, r2, 10), 3);
                String str = ((KeyPadChar) obj5).key;
                if (Intrinsics.areEqual(str, (String) obj4)) {
                    function0.invoke();
                } else {
                    function12.invoke(str);
                }
                return Unit.INSTANCE;
            case 6:
                CardSchemePresenter cardSchemePresenter = (CardSchemePresenter) obj6;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj;
                CardRenderingInfo cardRenderingInfo = (CardRenderingInfo) ((MutableState) obj5).getValue();
                IssuedCardFactory.IssuedCard issuedCard = (IssuedCardFactory.IssuedCard) ((MutableState) obj4).getValue();
                Boolean bool = (Boolean) ((MutableState) obj3).getValue();
                bool.booleanValue();
                if (((String) ((MutableState) obj2).getValue()) == null && (intValue = cardSchemePresenter.copyAnimationTrigger$delegate.getIntValue() - parcelableSnapshotMutableIntState.getIntValue()) >= 0) {
                    r1 = intValue;
                }
                return new Quadruple(cardRenderingInfo, issuedCard, bool, Integer.valueOf(r1));
            case 7:
                View view = (View) obj6;
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                MutableState mutableState6 = (MutableState) obj2;
                MutableState mutableState7 = (MutableState) obj;
                CardModelView cardModelView = (CardModelView) ((MutableState) obj3).getValue();
                if (cardModelView != null ? ((Boolean) cardModelView._isFacingForward$delegate.getValue()).booleanValue() : ((Boolean) mutableState6.getValue()).booleanValue()) {
                    ((InteractiveCardState) mutableState7.getValue()).flipToBack$delegate.setValue(Boolean.TRUE);
                    view.announceForAccessibility(str2);
                } else {
                    ((InteractiveCardState) mutableState7.getValue()).flipToFront$delegate.setValue(Boolean.TRUE);
                    view.announceForAccessibility(str3);
                }
                return Boolean.TRUE;
            default:
                ImageStylingKt.applyStyle$applyStyles((LocalImageComponentStyle) obj6, (ThemeableLottieAnimationView) obj5, (String[]) obj4, (String[]) obj3, (String[]) obj2, (String[]) obj);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ StateFlowKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$2 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
    }
}
