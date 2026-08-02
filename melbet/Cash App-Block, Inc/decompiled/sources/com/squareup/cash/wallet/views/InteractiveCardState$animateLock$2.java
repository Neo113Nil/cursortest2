package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.unit.IntRectKt;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.presenters.cart.OpenTabAddRoundState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.google.android.gms.internal.mlkit_vision_face.zzjj;
import com.squareup.cash.bitcoin.viewmodels.BitcoinKeypadModel;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerModel;
import com.squareup.cash.borrow.backend.RealBorrowDataManager;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletAccessLoad;
import com.squareup.cash.cdf.customersupport.CustomerSupportPhoneViewStatus;
import com.squareup.cash.cdf.prepurchasecard.PrepurchaseCardToggleView;
import com.squareup.cash.cdf.prepurchasecard.Surface;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.earnings.presenters.home.EarningsHeaderPresenter;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import com.squareup.cash.support.presenters.SupportPhoneStatusPresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.ui.widget.amount.AmountChangedSource;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.viewmodels.PrepurchaseCardData;
import com.squareup.protos.cash.compass.api.GpsConsentStatus;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2;
import com.squareup.protos.lending.sync_values.BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class InteractiveCardState$animateLock$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $isPressed;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ Object this$0;

    /* renamed from: com.squareup.cash.wallet.views.InteractiveCardState$animateLock$2$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ boolean $isPressed;
        public final /* synthetic */ SpringSpec $lockSpringSpec;
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ InteractiveCardState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(InteractiveCardState interactiveCardState, boolean z, SpringSpec springSpec, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = interactiveCardState;
            this.$isPressed = z;
            this.$lockSpringSpec = springSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    return new AnonymousClass1(this.this$0, this.$isPressed, this.$lockSpringSpec, continuation, 0);
                case 1:
                    return new AnonymousClass1(this.this$0, this.$isPressed, this.$lockSpringSpec, continuation, 1);
                default:
                    return new AnonymousClass1(this.this$0, this.$isPressed, this.$lockSpringSpec, continuation, 2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            boolean z = this.$isPressed;
            InteractiveCardState interactiveCardState = this.this$0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable = interactiveCardState.lockDimmer;
                        Float f = new Float(z ? 0.5f : 1.0f);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, f, this.$lockSpringSpec, null, null, this, 12) == coroutineSingletons) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable2 = interactiveCardState.lockOffset;
                        Float f2 = new Float(z ? 0.25f : RecyclerView.DECELERATION_RATE);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable2, f2, this.$lockSpringSpec, null, null, this, 12) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable3 = interactiveCardState.lockScale;
                        Float f3 = new Float(z ? 0.8f : 1.0f);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable3, f3, this.$lockSpringSpec, null, null, this, 12) == coroutineSingletons3) {
                            break;
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InteractiveCardState$animateLock$2(Object obj, Object obj2, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.this$0 = obj2;
        this.$isPressed = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        boolean z = this.$isPressed;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                InteractiveCardState$animateLock$2 interactiveCardState$animateLock$2 = new InteractiveCardState$animateLock$2(z, (InteractiveCardState) obj2, continuation, 0);
                interactiveCardState$animateLock$2.L$0 = obj;
                return interactiveCardState$animateLock$2;
            case 1:
                return new InteractiveCardState$animateLock$2(this.$isPressed, (MutableState) this.L$0, (MutableState) obj2, continuation, 1);
            case 2:
                return new InteractiveCardState$animateLock$2((AmountDisplayState) this.L$0, (BitcoinKeypadAmountPickerModel) obj2, this.$isPressed, continuation, 2);
            case 3:
                InteractiveCardState$animateLock$2 interactiveCardState$animateLock$22 = new InteractiveCardState$animateLock$2(z, (RealBorrowDataManager) obj2, continuation, 3);
                interactiveCardState$animateLock$22.L$0 = obj;
                return interactiveCardState$animateLock$22;
            case 4:
                return new InteractiveCardState$animateLock$2((HeartScene) this.L$0, (String) obj2, this.$isPressed, continuation, 4);
            case 5:
                return new InteractiveCardState$animateLock$2((MiniCardScene) this.L$0, (String) obj2, this.$isPressed, continuation, 5);
            case 6:
                return new InteractiveCardState$animateLock$2((WandScene) this.L$0, (String) obj2, this.$isPressed, continuation, 6);
            case 7:
                return new InteractiveCardState$animateLock$2(this.$isPressed, (EarningsHeaderPresenter) this.L$0, (MutableState) obj2, continuation, 7);
            case 8:
                return new InteractiveCardState$animateLock$2(this.$isPressed, (ScrollState) this.L$0, (MutableState) obj2, continuation, 8);
            case 9:
                return new InteractiveCardState$animateLock$2((Instrument$Adapter) this.L$0, (GpsConsentStatus) obj2, this.$isPressed, continuation, 9);
            case 10:
                return new InteractiveCardState$animateLock$2(this.$isPressed, (DelegatingSoftwareKeyboardController) this.L$0, (MutableState) obj2, continuation, 10);
            case 11:
                return new InteractiveCardState$animateLock$2(this.$isPressed, (AnimatedAmountTextView.Amount) this.L$0, (MutableState) obj2, continuation, 11);
            case 12:
                return new InteractiveCardState$animateLock$2(this.$isPressed, (SupportPhoneStatusPresenter) this.L$0, (MutableState) obj2, continuation, 12);
            case 13:
                return new InteractiveCardState$animateLock$2(this.$isPressed, (CardSchemePresenter) this.L$0, (PrepurchaseCardData) obj2, continuation, 13);
            default:
                return new InteractiveCardState$animateLock$2(this.$isPressed, (AndroidPermissionManager) this.L$0, (MutableState) obj2, continuation, 14);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((InteractiveCardState$animateLock$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController;
        CustomerSupportPhoneViewStatus.Status status;
        int i = this.$r8$classId;
        boolean z = this.$isPressed;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                InteractiveCardState interactiveCardState = (InteractiveCardState) obj2;
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                boolean z2 = this.$isPressed;
                Continuation continuation = null;
                SpringSpec spring$default = AnimatableKt.spring$default(z2 ? 1.0f : 1.4f, z2 ? 300.0f : 50.0f, null, 4);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(interactiveCardState, z2, spring$default, continuation, 0), 3);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(interactiveCardState, z2, spring$default, continuation, 1), 3);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    ((MutableState) this.L$0).setValue(null);
                    MutableState mutableState = (MutableState) obj2;
                    mutableState.setValue(new OpenTabAddRoundState.Idle(((OpenTabAddRoundState) mutableState.getValue()).getAttemptId()));
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AmountDisplayState amountDisplayState = (AmountDisplayState) this.L$0;
                BitcoinKeypadModel bitcoinKeypadModel = ((BitcoinKeypadAmountPickerModel) obj2).keypadModel;
                CurrencyCode currencyCode = bitcoinKeypadModel.transferMoney.currency_code;
                currencyCode.getClass();
                BitcoinDisplayUnits bitcoinDisplayUnits = bitcoinKeypadModel.displayUnits;
                String str = bitcoinKeypadModel.transferRawAmount;
                AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(currencyCode, bitcoinDisplayUnits, this.$isPressed, 0, 8);
                boolean equals = moneyConfig.equals((AmountConfig) amountDisplayState.config$delegate.getValue());
                AmountChangedSource.ConfigReset configReset = AmountChangedSource.ConfigReset.INSTANCE;
                if (equals) {
                    amountDisplayState.reset(str, configReset);
                } else {
                    AmountDisplayState.reset$default(amountDisplayState, null, 1);
                    amountDisplayState.applyConfig(moneyConfig);
                    amountDisplayState.reset(str, configReset);
                }
                break;
            case 3:
                BorrowData.AppletData.EntryPointData entryPointData = (BorrowData.AppletData.EntryPointData) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    RealBorrowDataManager realBorrowDataManager = (RealBorrowDataManager) obj2;
                    Analytics analytics = realBorrowDataManager.analytics;
                    zzjj zzjjVar = entryPointData.entry_point_v2;
                    BorrowAppletAccessLoad borrowAppletAccessLoad = new BorrowAppletAccessLoad(zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2 ? BorrowAppletAccessLoad.EntryPointType.NONE : zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2 ? BorrowAppletAccessLoad.EntryPointType.TILE : null);
                    if (realBorrowDataManager.borrowEntryPointVerboseLoggingEnabled) {
                        analytics.track(borrowAppletAccessLoad, null);
                    } else {
                        Timber.Forest.d("CDF event skipped (BorrowEntryPointVerboseLogging disabled): %s", borrowAppletAccessLoad);
                    }
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((HeartScene) this.L$0).ring.setVisible(((String) obj2) != null, z);
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((MiniCardScene) this.L$0).ring.setVisible(((String) obj2) != null, z);
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((WandScene) this.L$0).ring.setVisible(((String) obj2) != null, z);
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!z) {
                    ((MutableState) obj2).setValue((DateFilter.Monthly) ((EarningsHeaderPresenter) this.L$0).currentMonthFilter);
                }
                break;
            case 8:
                ScrollState scrollState = (ScrollState) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!z || (scrollState.viewportSize$delegate.getIntValue() > 0 && !scrollState.getCanScrollForward())) {
                    List list = FidesmoProvisioningViewKt.SNAKE_PATH;
                    ((MutableState) obj2).setValue(Boolean.TRUE);
                }
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                Instrument$Adapter instrument$Adapter = (Instrument$Adapter) this.L$0;
                ((GpsConfigQueries) instrument$Adapter.card_brandAdapter).transactionWithWrapper(new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(instrument$Adapter, (GpsConsentStatus) obj2, this.$isPressed, ref$BooleanRef, 11));
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) ((MutableState) obj2).getValue()).booleanValue() && z && (delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) this.L$0) != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    ((MutableState) obj2).setValue((AnimatedAmountTextView.Amount) this.L$0);
                }
                break;
            case 12:
                SupportPhoneStatusPresenter supportPhoneStatusPresenter = (SupportPhoneStatusPresenter) this.L$0;
                SupportScreens.SupportPhoneStatusScreen supportPhoneStatusScreen = supportPhoneStatusPresenter.args;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    CustomerSupportPhoneViewStatus.Trigger trigger = supportPhoneStatusScreen.trigger;
                    SupportPhoneStatus supportPhoneStatus = (SupportPhoneStatus) ((MutableState) obj2).getValue();
                    String str2 = supportPhoneStatusScreen.flowToken;
                    Analytics analytics2 = supportPhoneStatusPresenter.analytics;
                    if (!(supportPhoneStatus instanceof SupportPhoneStatus.Active)) {
                        if (!Intrinsics.areEqual(supportPhoneStatus, SupportPhoneStatus.Error.INSTANCE) && !(supportPhoneStatus instanceof SupportPhoneStatus.FeatureDisabled)) {
                            if (!(supportPhoneStatus instanceof SupportPhoneStatus.Idle) && !Intrinsics.areEqual(supportPhoneStatus, SupportPhoneStatus.Undetermined.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                status = null;
                            }
                        } else {
                            status = CustomerSupportPhoneViewStatus.Status.ERROR;
                        }
                    } else {
                        int ordinal = ((SupportPhoneStatus.Active) supportPhoneStatus).status.ordinal();
                        if (ordinal == 0) {
                            status = CustomerSupportPhoneViewStatus.Status.IN_QUEUE;
                        } else if (ordinal == 1) {
                            status = CustomerSupportPhoneViewStatus.Status.MISSED;
                        } else if (ordinal == 2) {
                            status = CustomerSupportPhoneViewStatus.Status.COMPLETED;
                        } else if (ordinal == 3) {
                            status = CustomerSupportPhoneViewStatus.Status.CANCELED;
                        } else if (ordinal != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            status = CustomerSupportPhoneViewStatus.Status.FAILED_TO_QUEUE;
                        }
                    }
                    analytics2.track(new CustomerSupportPhoneViewStatus(trigger, status, str2), null);
                }
                break;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    ((CardSchemePresenter) this.L$0).analytics.track(new PrepurchaseCardToggleView(IntRectKt.toCdfToggleState(((PrepurchaseCardData) obj2).toggle.state), Surface.CARD_TAB), null);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z && !((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                    ActivityCompat.requestPermissions(((AndroidPermissionManager) this.L$0).activity, AndroidPermissionManager.REQUEST_LOCATION, 2);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InteractiveCardState$animateLock$2(boolean z, Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$isPressed = z;
        this.L$0 = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InteractiveCardState$animateLock$2(boolean z, Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$isPressed = z;
        this.this$0 = obj;
    }
}
