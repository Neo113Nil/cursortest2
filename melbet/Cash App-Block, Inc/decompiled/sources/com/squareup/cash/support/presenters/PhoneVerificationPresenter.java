package com.squareup.cash.support.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.core.os.BundleKt;
import androidx.glance.layout.BoxKt;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpf;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.R;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Expired;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$FailedPin;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Invalid;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Pending;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Rejected;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Unknown;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Verified;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationResult;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.PhoneVerificationEvents;
import com.squareup.cash.support.viewmodels.PhoneVerificationViewModel;
import com.squareup.cash.ui.MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class PhoneVerificationPresenter implements MoleculePresenter {
    public final StateFlow activityLifecycleStates;
    public final Analytics analytics;
    public final SupportScreens.PhoneVerificationScreen args;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidNotificationManager notificationManager;
    public final zzr phoneVerificationService;
    public final RealRouter router;
    public final AndroidStringManager stringManager;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider activityLifecycleStates;
        public final DoubleCheck analytics;
        public final LambdaProvider notificationManager;
        public final RealCurrentUserSetter.MetroFactory phoneVerificationService;
        public final Provider routerFactory;
        public final LambdaProvider stringManager;

        public MetroFactory(RealCurrentUserSetter.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2, MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory, InstanceFactory instanceFactory) {
            this.phoneVerificationService = metroFactory;
            this.stringManager = lambdaProvider;
            this.analytics = doubleCheck;
            this.notificationManager = lambdaProvider2;
            this.activityLifecycleStates = mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
            this.routerFactory = instanceFactory;
        }
    }

    public PhoneVerificationPresenter(zzr zzrVar, AndroidStringManager androidStringManager, Analytics analytics, AndroidNotificationManager androidNotificationManager, StateFlow stateFlow, RealRouter$Factory$Impl realRouter$Factory$Impl, SupportScreens.PhoneVerificationScreen phoneVerificationScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        phoneVerificationScreen.getClass();
        this.phoneVerificationService = zzrVar;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.notificationManager = androidNotificationManager;
        this.activityLifecycleStates = stateFlow;
        this.args = phoneVerificationScreen;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$rejectPhoneVerificationAttempt(PhoneVerificationPresenter phoneVerificationPresenter, ContinuationImpl continuationImpl) {
        PhoneVerificationPresenter$rejectPhoneVerificationAttempt$1 phoneVerificationPresenter$rejectPhoneVerificationAttempt$1;
        int i;
        PhoneVerificationService$PhoneVerificationResult phoneVerificationService$PhoneVerificationResult;
        Analytics analytics = phoneVerificationPresenter.analytics;
        SupportScreens.PhoneVerificationScreen phoneVerificationScreen = phoneVerificationPresenter.args;
        if (continuationImpl instanceof PhoneVerificationPresenter$rejectPhoneVerificationAttempt$1) {
            phoneVerificationPresenter$rejectPhoneVerificationAttempt$1 = (PhoneVerificationPresenter$rejectPhoneVerificationAttempt$1) continuationImpl;
            int i2 = phoneVerificationPresenter$rejectPhoneVerificationAttempt$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                phoneVerificationPresenter$rejectPhoneVerificationAttempt$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = phoneVerificationPresenter$rejectPhoneVerificationAttempt$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = phoneVerificationPresenter$rejectPhoneVerificationAttempt$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    zzr zzrVar = phoneVerificationPresenter.phoneVerificationService;
                    String str = phoneVerificationScreen.phoneVerificationId;
                    phoneVerificationPresenter$rejectPhoneVerificationAttempt$1.label = 1;
                    obj = zzrVar.rejectPhoneVerificationAttempt(str, phoneVerificationPresenter$rejectPhoneVerificationAttempt$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                phoneVerificationService$PhoneVerificationResult = (PhoneVerificationService$PhoneVerificationResult) obj;
                if (!(phoneVerificationService$PhoneVerificationResult instanceof PhoneVerificationService$PhoneVerificationResult.Success)) {
                    zzpf.trackRejectPhoneVerification(analytics, phoneVerificationScreen.flowToken, phoneVerificationScreen.phoneVerificationId, ((PhoneVerificationService$PhoneVerificationResult.Success) phoneVerificationService$PhoneVerificationResult).verificationState, null);
                    return phoneVerificationService$PhoneVerificationResult;
                }
                if (phoneVerificationService$PhoneVerificationResult instanceof PhoneVerificationService$PhoneVerificationResult.Failure) {
                    zzpf.trackRejectPhoneVerification(analytics, phoneVerificationScreen.flowToken, phoneVerificationScreen.phoneVerificationId, null, (PhoneVerificationService$PhoneVerificationResult.Failure) phoneVerificationService$PhoneVerificationResult);
                    return phoneVerificationService$PhoneVerificationResult;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        phoneVerificationPresenter$rejectPhoneVerificationAttempt$1 = new PhoneVerificationPresenter$rejectPhoneVerificationAttempt$1(phoneVerificationPresenter, continuationImpl);
        Object obj2 = phoneVerificationPresenter$rejectPhoneVerificationAttempt$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = phoneVerificationPresenter$rejectPhoneVerificationAttempt$1.label;
        if (i != 0) {
        }
        phoneVerificationService$PhoneVerificationResult = (PhoneVerificationService$PhoneVerificationResult) obj2;
        if (!(phoneVerificationService$PhoneVerificationResult instanceof PhoneVerificationService$PhoneVerificationResult.Success)) {
        }
    }

    public static final PhoneVerificationViewModel.Loaded access$toViewModel(PhoneVerificationPresenter phoneVerificationPresenter, PhoneVerificationService$PhoneVerificationResult phoneVerificationService$PhoneVerificationResult) {
        PhoneVerificationViewModel.Loaded.Status status;
        List listOf;
        AndroidStringManager androidStringManager = phoneVerificationPresenter.stringManager;
        boolean z = phoneVerificationService$PhoneVerificationResult instanceof PhoneVerificationService$PhoneVerificationResult.Failure;
        PhoneVerificationEvents.Close close = PhoneVerificationEvents.Close.INSTANCE;
        if (z) {
            return new PhoneVerificationViewModel.Loaded(androidStringManager.get(R.string.voice_auth_failed_to_load_title), androidStringManager.get(R.string.voice_auth_failed_to_load_message), PhoneVerificationViewModel.Loaded.Status.INVALID, CollectionsKt__CollectionsJVMKt.listOf(BundleKt.isRetryable(((PhoneVerificationService$PhoneVerificationResult.Failure) phoneVerificationService$PhoneVerificationResult).failureType) ? new PhoneVerificationViewModel.Loaded.ButtonViewModel(androidStringManager.get(R.string.voice_auth_retry_button_text), PhoneVerificationEvents.Retry.INSTANCE) : new PhoneVerificationViewModel.Loaded.ButtonViewModel(androidStringManager.get(R.string.voice_auth_dismiss_button_text), close)), false);
        }
        if (!(phoneVerificationService$PhoneVerificationResult instanceof PhoneVerificationService$PhoneVerificationResult.Success)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        PhoneVerificationService$PhoneVerificationResult.Success success = (PhoneVerificationService$PhoneVerificationResult.Success) phoneVerificationService$PhoneVerificationResult;
        String str = success.articleToken;
        BoxKt boxKt = success.verificationState;
        String str2 = success.title;
        String str3 = success.message;
        boolean z2 = boxKt instanceof PhoneVerificationService$PhoneVerificationAttemptState$Pending;
        if (z2) {
            status = PhoneVerificationViewModel.Loaded.Status.PENDING;
        } else if (boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$Expired.INSTANCE)) {
            status = PhoneVerificationViewModel.Loaded.Status.EXPIRED;
        } else if (boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$Invalid.INSTANCE)) {
            status = PhoneVerificationViewModel.Loaded.Status.INVALID;
        } else if (boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$Rejected.INSTANCE)) {
            status = PhoneVerificationViewModel.Loaded.Status.REJECTED;
        } else if (boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$Unknown.INSTANCE)) {
            status = PhoneVerificationViewModel.Loaded.Status.INVALID;
        } else if (boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$Verified.INSTANCE)) {
            status = PhoneVerificationViewModel.Loaded.Status.VERIFIED;
        } else {
            if (!boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$FailedPin.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            status = PhoneVerificationViewModel.Loaded.Status.FAILED_PIN;
        }
        if (z2) {
            PhoneVerificationService$PhoneVerificationAttemptState$Pending phoneVerificationService$PhoneVerificationAttemptState$Pending = (PhoneVerificationService$PhoneVerificationAttemptState$Pending) boxKt;
            String str4 = phoneVerificationService$PhoneVerificationAttemptState$Pending.rejectButtonTitle;
            if (str4 == null) {
                str4 = "";
            }
            PhoneVerificationViewModel.Loaded.ButtonViewModel buttonViewModel = new PhoneVerificationViewModel.Loaded.ButtonViewModel(str4, PhoneVerificationEvents.Reject.INSTANCE);
            String str5 = phoneVerificationService$PhoneVerificationAttemptState$Pending.verifyButtonTitle;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new PhoneVerificationViewModel.Loaded.ButtonViewModel[]{buttonViewModel, new PhoneVerificationViewModel.Loaded.ButtonViewModel(str5 != null ? str5 : "", PhoneVerificationEvents.Verify.INSTANCE)});
        } else {
            listOf = str != null ? CollectionsKt__CollectionsJVMKt.listOf(new PhoneVerificationViewModel.Loaded.ButtonViewModel(androidStringManager.get(R.string.voice_auth_learn_more_button_text), new PhoneVerificationEvents.LearnMore(str))) : CollectionsKt__CollectionsJVMKt.listOf(new PhoneVerificationViewModel.Loaded.ButtonViewModel(androidStringManager.get(R.string.voice_auth_dismiss_button_text), close));
        }
        return new PhoneVerificationViewModel.Loaded(str2, str3, status, listOf, true);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Object obj;
        MutableState mutableState;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1163360505);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue == obj2) {
            rememberedValue = Updater.mutableStateOf$default(PhoneVerificationViewModel.Loading.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState2 = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj2) {
            rememberedValue2 = Updater.mutableStateOf$default(1);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState3 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj2) {
            rememberedValue3 = new NullStateSwipeConfigProvider(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new RealRecipientRepository$suggestions$$inlined$map$1(this.activityLifecycleStates, 22), 25), 25);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue3, 0, null, gapComposer, 48, 2);
        Integer valueOf = Integer.valueOf(((Number) mutableState3.getValue()).intValue());
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue4 == obj2) {
            obj = this;
            rememberedValue4 = new ArticlePresenter$models$1$1(obj, mutableState3, mutableState2, continuation, 13);
            mutableState = mutableState3;
            gapComposer.updateRememberedValue(rememberedValue4);
        } else {
            obj = this;
            mutableState = mutableState3;
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue4);
        Object value = collectAsState.getValue();
        boolean changed = gapComposer.changed(collectAsState) | gapComposer.changedInstance(obj);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changed || rememberedValue5 == obj2) {
            Object obj3 = obj;
            rememberedValue5 = new WorkflowLayout$start$1(collectAsState, obj3, mutableState2, continuation, 1);
            obj = obj3;
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Updater.LaunchedEffect(gapComposer, value, (Function2) rememberedValue5);
        Object obj4 = obj;
        Updater.LaunchedEffect(gapComposer, flow, new PoolsListPresenter$models$2$2(flow, (Continuation) null, obj4, mutableState2, mutableState, 29));
        PhoneVerificationViewModel phoneVerificationViewModel = (PhoneVerificationViewModel) mutableState2.getValue();
        gapComposer.end(false);
        return phoneVerificationViewModel;
    }
}
