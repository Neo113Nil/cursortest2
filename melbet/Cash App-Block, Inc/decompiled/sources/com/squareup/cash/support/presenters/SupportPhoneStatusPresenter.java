package com.squareup.cash.support.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SupportPhonePollInterval;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.support.backend.api.SupportPhoneService$CancelSupportPhoneResult;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import com.squareup.cash.support.backend.real.RealSupportPhoneService;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.SupportPhoneStatusViewEvent;
import com.squareup.cash.support.viewmodels.SupportPhoneStatusViewModel;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.wallet.views.InteractiveCardState$animateLock$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class SupportPhoneStatusPresenter implements MoleculePresenter {
    public static final ClientRoute.Flow phoneSupportRoute = new ClientRoute.Flow("INITIATE_OUTBOUND_PHONE_SUPPORT");
    public final Analytics analytics;
    public final SupportScreens.SupportPhoneStatusScreen args;
    public final BetterNavigator.ScreenNavigator navigator;
    public final long pollingInterval;
    public final RealRouter router;
    public final AndroidStringManager stringManager;
    public final RealSupportPhoneService supportPhoneService;

    public interface CancellationStatus {

        public final class Cancelled implements CancellationStatus {
            public final String message;
            public final String title;

            public Cancelled(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.title = str;
                this.message = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Cancelled)) {
                    return false;
                }
                Cancelled cancelled = (Cancelled) obj;
                return Intrinsics.areEqual(this.title, cancelled.title) && Intrinsics.areEqual(this.message, cancelled.message);
            }

            public final int hashCode() {
                return this.message.hashCode() + (this.title.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("Cancelled(title=", this.title, ", message=", this.message, ")");
            }
        }

        public final class Cancelling implements CancellationStatus {
            public static final Cancelling INSTANCE = new Cancelling();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Cancelling);
            }

            public final int hashCode() {
                return 1429225760;
            }

            public final String toString() {
                return "Cancelling";
            }
        }

        public final class Error implements CancellationStatus {
            public static final Error INSTANCE = new Error();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Error);
            }

            public final int hashCode() {
                return 561943640;
            }

            public final String toString() {
                return "Error";
            }
        }

        public final class Idle implements CancellationStatus {
            public static final Idle INSTANCE = new Idle();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Idle);
            }

            public final int hashCode() {
                return -535956604;
            }

            public final String toString() {
                return "Idle";
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SupportPhoneStatus.Active.ActiveStatus.values().length];
            try {
                SupportPhoneStatus.Active.ActiveStatus activeStatus = SupportPhoneStatus.Active.ActiveStatus.IN_QUEUE;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SupportPhoneStatus.Active.ActiveStatus activeStatus2 = SupportPhoneStatus.Active.ActiveStatus.IN_QUEUE;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SupportPhoneStatus.Active.ActiveStatus activeStatus3 = SupportPhoneStatus.Active.ActiveStatus.IN_QUEUE;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SupportPhoneStatus.Active.ActiveStatus activeStatus4 = SupportPhoneStatus.Active.ActiveStatus.IN_QUEUE;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                SupportPhoneStatus.Active.ActiveStatus activeStatus5 = SupportPhoneStatus.Active.ActiveStatus.IN_QUEUE;
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SupportPhoneStatusPresenter(RealSupportPhoneService realSupportPhoneService, AndroidStringManager androidStringManager, Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl, FeatureFlagManager featureFlagManager, SupportScreens.SupportPhoneStatusScreen supportPhoneStatusScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        supportPhoneStatusScreen.getClass();
        this.supportPhoneService = realSupportPhoneService;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.args = supportPhoneStatusScreen;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        Duration.Companion companion = Duration.Companion;
        this.pollingInterval = DurationKt.toDuration(((FeatureFlag$LongFeatureFlag.Value) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$SupportPhonePollInterval.INSTANCE)).value, DurationUnit.SECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$cancelPhoneRequest(SupportPhoneStatusPresenter supportPhoneStatusPresenter, MutableState mutableState, ContinuationImpl continuationImpl) {
        SupportPhoneStatusPresenter$cancelPhoneRequest$1 supportPhoneStatusPresenter$cancelPhoneRequest$1;
        int i;
        SupportPhoneService$CancelSupportPhoneResult supportPhoneService$CancelSupportPhoneResult;
        Object obj;
        if (continuationImpl instanceof SupportPhoneStatusPresenter$cancelPhoneRequest$1) {
            supportPhoneStatusPresenter$cancelPhoneRequest$1 = (SupportPhoneStatusPresenter$cancelPhoneRequest$1) continuationImpl;
            int i2 = supportPhoneStatusPresenter$cancelPhoneRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                supportPhoneStatusPresenter$cancelPhoneRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = supportPhoneStatusPresenter$cancelPhoneRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportPhoneStatusPresenter$cancelPhoneRequest$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    mutableState.setValue(CancellationStatus.Cancelling.INSTANCE);
                    RealSupportPhoneService realSupportPhoneService = supportPhoneStatusPresenter.supportPhoneService;
                    supportPhoneStatusPresenter$cancelPhoneRequest$1.L$0 = mutableState;
                    supportPhoneStatusPresenter$cancelPhoneRequest$1.label = 1;
                    obj2 = realSupportPhoneService.cancelPhoneRequest(supportPhoneStatusPresenter$cancelPhoneRequest$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = supportPhoneStatusPresenter$cancelPhoneRequest$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                }
                supportPhoneService$CancelSupportPhoneResult = (SupportPhoneService$CancelSupportPhoneResult) obj2;
                if (supportPhoneService$CancelSupportPhoneResult instanceof SupportPhoneService$CancelSupportPhoneResult.Success) {
                    obj = CancellationStatus.Error.INSTANCE;
                } else {
                    SupportPhoneService$CancelSupportPhoneResult.Success success = (SupportPhoneService$CancelSupportPhoneResult.Success) supportPhoneService$CancelSupportPhoneResult;
                    obj = new CancellationStatus.Cancelled(success.title, success.message);
                }
                mutableState.setValue(obj);
                return Unit.INSTANCE;
            }
        }
        supportPhoneStatusPresenter$cancelPhoneRequest$1 = new SupportPhoneStatusPresenter$cancelPhoneRequest$1(supportPhoneStatusPresenter, continuationImpl);
        Object obj22 = supportPhoneStatusPresenter$cancelPhoneRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportPhoneStatusPresenter$cancelPhoneRequest$1.label;
        if (i != 0) {
        }
        supportPhoneService$CancelSupportPhoneResult = (SupportPhoneService$CancelSupportPhoneResult) obj22;
        if (supportPhoneService$CancelSupportPhoneResult instanceof SupportPhoneService$CancelSupportPhoneResult.Success) {
        }
        mutableState.setValue(obj);
        return Unit.INSTANCE;
    }

    public final SupportPhoneStatusViewModel.Loaded.PhoneButtonViewModel confirmationButton(boolean z) {
        return new SupportPhoneStatusViewModel.Loaded.PhoneButtonViewModel(this.stringManager.get(z ? R.string.support_phone_status_cancelled_confirmation_button : R.string.support_phone_status_confirmation_button), SupportPhoneStatusViewEvent.Close.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Object interactiveCardState$animateLock$2;
        MutableState mutableState;
        Continuation continuation;
        Object loaded;
        SupportPhoneStatusViewModel.Loaded.PhoneButtonViewModel confirmationButton;
        int ordinal;
        SupportPhoneStatusViewModel.Loaded.Status status;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-392656173);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            boolean z = this.args.useCachedStatus;
            StateFlowImpl stateFlowImpl = this.supportPhoneService._phoneStatus;
            rememberedValue = z ? stateFlowImpl : FlowKt.drop(stateFlowImpl, 1);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        SupportPhoneStatus.Undetermined undetermined = SupportPhoneStatus.Undetermined.INSTANCE;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, undetermined, null, gapComposer, 0, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(CancellationStatus.Idle.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        Continuation continuation2 = null;
        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new ShoppingWebBridge.AnonymousClass1(this, continuation2, 24);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        boolean z2 = (Intrinsics.areEqual(collectAsState.getValue(), undetermined) || (collectAsState.getValue() instanceof SupportPhoneStatus.Idle)) ? false : true;
        Boolean valueOf = Boolean.valueOf(z2);
        boolean changed = gapComposer.changed(z2) | gapComposer.changedInstance(this) | gapComposer.changed(collectAsState);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed || rememberedValue4 == neverEqualPolicy) {
            interactiveCardState$animateLock$2 = new InteractiveCardState$animateLock$2(z2, this, collectAsState, continuation2, 12);
            mutableState = collectAsState;
            continuation = null;
            gapComposer.updateRememberedValue(interactiveCardState$animateLock$2);
        } else {
            continuation = null;
            interactiveCardState$animateLock$2 = rememberedValue4;
            mutableState = collectAsState;
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) interactiveCardState$animateLock$2);
        Updater.LaunchedEffect(gapComposer, flow, new TaxWebAppPresenter$models$1$1(flow, continuation, (MoleculePresenter) this, mutableState2, 17));
        CancellationStatus cancellationStatus = (CancellationStatus) mutableState2.getValue();
        boolean z3 = cancellationStatus instanceof CancellationStatus.Idle;
        Object obj = SupportPhoneStatusViewModel.Loading.INSTANCE;
        AndroidStringManager androidStringManager = this.stringManager;
        if (!z3) {
            if (!(cancellationStatus instanceof CancellationStatus.Cancelling)) {
                if (cancellationStatus instanceof CancellationStatus.Error) {
                    loaded = new SupportPhoneStatusViewModel.Loaded(androidStringManager.get(R.string.support_phone_cancel_error_title), androidStringManager.get(R.string.support_phone_cancel_error_message), false, confirmationButton(false), SupportPhoneStatusViewModel.Loaded.Status.ERROR);
                } else {
                    if (!(cancellationStatus instanceof CancellationStatus.Cancelled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    CancellationStatus.Cancelled cancelled = (CancellationStatus.Cancelled) cancellationStatus;
                    loaded = new SupportPhoneStatusViewModel.Loaded(cancelled.title, cancelled.message, false, confirmationButton(true), SupportPhoneStatusViewModel.Loaded.Status.CANCELLED);
                }
                obj = loaded;
            }
            gapComposer.end(false);
            return obj;
        }
        SupportPhoneStatus supportPhoneStatus = (SupportPhoneStatus) mutableState.getValue();
        if (!Intrinsics.areEqual(supportPhoneStatus, undetermined) && !(supportPhoneStatus instanceof SupportPhoneStatus.Idle)) {
            if (supportPhoneStatus instanceof SupportPhoneStatus.Active) {
                SupportPhoneStatus.Active active = (SupportPhoneStatus.Active) supportPhoneStatus;
                SupportPhoneStatus.Active.ActiveStatus activeStatus = active.status;
                String str = active.title;
                String str2 = active.message;
                boolean z4 = WhenMappings.$EnumSwitchMapping$0[activeStatus.ordinal()] == 1 ? active.allowCancellation : false;
                int ordinal2 = activeStatus.ordinal();
                if (ordinal2 != 1) {
                    if (ordinal2 == 3) {
                        confirmationButton = confirmationButton(true);
                    } else if (ordinal2 != 4) {
                        confirmationButton = confirmationButton(false);
                    }
                    SupportPhoneStatusViewModel.Loaded.PhoneButtonViewModel phoneButtonViewModel = confirmationButton;
                    ordinal = activeStatus.ordinal();
                    if (ordinal != 0) {
                        status = SupportPhoneStatusViewModel.Loaded.Status.IN_QUEUE;
                    } else if (ordinal == 1) {
                        status = SupportPhoneStatusViewModel.Loaded.Status.MISSED;
                    } else if (ordinal == 2) {
                        status = SupportPhoneStatusViewModel.Loaded.Status.COMPLETED;
                    } else if (ordinal == 3) {
                        status = SupportPhoneStatusViewModel.Loaded.Status.CANCELLED;
                    } else {
                        if (ordinal != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        status = SupportPhoneStatusViewModel.Loaded.Status.FAILED_TO_QUEUE;
                    }
                    loaded = new SupportPhoneStatusViewModel.Loaded(str, str2, z4, phoneButtonViewModel, status);
                }
                confirmationButton = !active.availability.isAvailable ? confirmationButton(false) : new SupportPhoneStatusViewModel.Loaded.PhoneButtonViewModel(androidStringManager.get(R.string.support_phone_status_call_again_button), SupportPhoneStatusViewEvent.RequestCall.INSTANCE);
                SupportPhoneStatusViewModel.Loaded.PhoneButtonViewModel phoneButtonViewModel2 = confirmationButton;
                ordinal = activeStatus.ordinal();
                if (ordinal != 0) {
                }
                loaded = new SupportPhoneStatusViewModel.Loaded(str, str2, z4, phoneButtonViewModel2, status);
            } else {
                if (!(supportPhoneStatus instanceof SupportPhoneStatus.FeatureDisabled) && !Intrinsics.areEqual(supportPhoneStatus, SupportPhoneStatus.Error.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                loaded = new SupportPhoneStatusViewModel.Loaded(androidStringManager.get(R.string.support_phone_call_error_title), androidStringManager.get(R.string.support_phone_call_error_message), false, confirmationButton(false), SupportPhoneStatusViewModel.Loaded.Status.ERROR);
            }
            obj = loaded;
        }
        gapComposer.end(false);
        return obj;
    }
}
