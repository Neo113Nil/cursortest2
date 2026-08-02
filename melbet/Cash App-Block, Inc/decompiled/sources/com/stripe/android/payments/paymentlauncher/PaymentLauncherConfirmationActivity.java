package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.media3.ui.PlayerView;
import com.datadog.android.trace.model.SpanEvent;
import com.squareup.cash.R;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import com.stripe.android.payments.core.analytics.ErrorReporter$Companion;
import com.stripe.android.payments.core.analytics.ErrorReporter$ExpectedErrorEvent;
import com.stripe.android.payments.paymentlauncher.InternalPaymentResult;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.view.ActivityHost;
import com.withpersona.sdk2.camera.CameraPreview$rebind$1$1$1;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import dagger.internal.Preconditions;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes8.dex */
public final class PaymentLauncherConfirmationActivity extends AppCompatActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Lazy starterArgs$delegate;
    public final ViewModelLazy viewModel$delegate;
    public final InitializerViewModelFactory viewModelFactory;

    public PaymentLauncherConfirmationActivity() {
        final int i = 0;
        this.starterArgs$delegate = LazyKt.lazy(new PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda1(this, i));
        final int i2 = 1;
        this.viewModelFactory = new InitializerViewModelFactory(new PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda1(this, i2), 4);
        this.viewModel$delegate = new ViewModelLazy(Reflection.factory.getOrCreateKotlinClass(PaymentLauncherViewModel.class), new Function0(this) { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ PaymentLauncherConfirmationActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return paymentLauncherConfirmationActivity.getViewModelStore();
                    default:
                        return paymentLauncherConfirmationActivity.getDefaultViewModelCreationExtras();
                }
            }
        }, new PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda1(this, 2), new Function0(this) { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ PaymentLauncherConfirmationActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return paymentLauncherConfirmationActivity.getViewModelStore();
                    default:
                        return paymentLauncherConfirmationActivity.getDefaultViewModelCreationExtras();
                }
            }
        });
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        PlayerView.Api34.fadeOut(this);
    }

    public final void finishWithResult(InternalPaymentResult internalPaymentResult) {
        Intent intent = new Intent();
        internalPaymentResult.getClass();
        setResult(-1, intent.putExtras(BundleKt.bundleOf(new Pair("extra_args", internalPaymentResult))));
        finish();
    }

    public final PaymentLauncherViewModel getViewModel$payments_core_release() {
        return (PaymentLauncherViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v10 */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object failure;
        Map additionalParamsFromStripeException;
        String str;
        Map additionalParamsFromStripeException2;
        super.onCreate(bundle);
        setTitle(getResources().getString(R.string.stripe_confirming_transaction_status));
        try {
            Result.Companion companion = Result.Companion;
            failure = (PaymentLauncherContract.Args) this.starterArgs$delegate.getValue();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure == null) {
            throw new IllegalArgumentException("PaymentLauncherConfirmationActivity was started without arguments");
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        int i = 14;
        int i2 = 4;
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = Logger$Companion.NOOP_LOGGER;
        ?? r8 = 0;
        EmptyMap emptyMap = null;
        if (m4120exceptionOrNullimpl != null) {
            finishWithResult(new InternalPaymentResult.Failed(m4120exceptionOrNullimpl));
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            EmptySet emptySet = EmptySet.INSTANCE;
            emptySet.getClass();
            Context applicationContext2 = applicationContext.getApplicationContext();
            applicationContext2.getClass();
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
            Preconditions.checkNotNullFromProvides(defaultIoScheduler);
            DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor(logger$Companion$NOOP_LOGGER$1, defaultIoScheduler);
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(applicationContext2, new CameraX$$ExternalSyntheticLambda0(applicationContext2, i), emptySet);
            ErrorReporter$ExpectedErrorEvent errorReporter$ExpectedErrorEvent = ErrorReporter$ExpectedErrorEvent.PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS;
            int i3 = StripeException.$r8$clinit;
            StripeException create = SpanEvent.Account.create(m4120exceptionOrNullimpl);
            if ((4 & 2) != 0) {
                create = null;
            }
            if ((4 & 4) != 0) {
                EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                emptyMap2.getClass();
                r8 = emptyMap2;
            }
            r8.getClass();
            if (create == null) {
                additionalParamsFromStripeException = EmptyMap.INSTANCE;
                additionalParamsFromStripeException.getClass();
            } else {
                additionalParamsFromStripeException = ErrorReporter$Companion.getAdditionalParamsFromStripeException(create);
            }
            defaultAnalyticsRequestExecutor.executeAsync(paymentAnalyticsRequestFactory.createRequest(errorReporter$ExpectedErrorEvent, MapsKt__MapsKt.plus(additionalParamsFromStripeException, (Map) r8)));
            return;
        }
        PaymentLauncherContract.Args args = (PaymentLauncherContract.Args) failure;
        Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(args.mo4059validated1pmJ48());
        if (m4120exceptionOrNullimpl2 != null) {
            finishWithResult(new InternalPaymentResult.Failed(m4120exceptionOrNullimpl2));
            Context applicationContext3 = getApplicationContext();
            applicationContext3.getClass();
            EmptySet emptySet2 = EmptySet.INSTANCE;
            emptySet2.getClass();
            Context applicationContext4 = applicationContext3.getApplicationContext();
            applicationContext4.getClass();
            DefaultScheduler defaultScheduler2 = Dispatchers.Default;
            DefaultIoScheduler defaultIoScheduler2 = DefaultIoScheduler.INSTANCE;
            Preconditions.checkNotNullFromProvides(defaultIoScheduler2);
            DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor2 = new DefaultAnalyticsRequestExecutor(logger$Companion$NOOP_LOGGER$1, defaultIoScheduler2);
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory2 = new PaymentAnalyticsRequestFactory(applicationContext4, new CameraX$$ExternalSyntheticLambda0(applicationContext4, i), emptySet2);
            ErrorReporter$ExpectedErrorEvent errorReporter$ExpectedErrorEvent2 = ErrorReporter$ExpectedErrorEvent.PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS;
            int i4 = StripeException.$r8$clinit;
            StripeException create2 = SpanEvent.Account.create(m4120exceptionOrNullimpl2);
            if ((4 & 2) != 0) {
                create2 = null;
            }
            if ((4 & 4) != 0) {
                emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
            }
            emptyMap.getClass();
            if (create2 == null) {
                additionalParamsFromStripeException2 = EmptyMap.INSTANCE;
                additionalParamsFromStripeException2.getClass();
            } else {
                additionalParamsFromStripeException2 = ErrorReporter$Companion.getAdditionalParamsFromStripeException(create2);
            }
            defaultAnalyticsRequestExecutor2.executeAsync(paymentAnalyticsRequestFactory2.createRequest(errorReporter$ExpectedErrorEvent2, MapsKt__MapsKt.plus(additionalParamsFromStripeException2, emptyMap)));
            return;
        }
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), null, new StripeApiRepository$$ExternalSyntheticLambda5(23), 3);
        JobKt.launch$default(ViewModelKt.getCoroutineScope(getLifecycle()), null, null, new HazeSourceNode$launchPreDraw$1(this, r8, 6), 3);
        PaymentLauncherViewModel viewModel$payments_core_release = getViewModel$payments_core_release();
        viewModel$payments_core_release.nextActionHandlerRegistry.onNewActivityResultCaller(this, new PaymentLauncherViewModel$register$1(viewModel$payments_core_release, 0));
        getLifecycle().addObserver(new CameraPreview$rebind$1$1$1(viewModel$payments_core_release, i2));
        ActivityHost activityHost = new ActivityHost(this, args.getStatusBarColor());
        if (args instanceof PaymentLauncherContract.Args.IntentConfirmationArgs) {
            PaymentLauncherViewModel viewModel$payments_core_release2 = getViewModel$payments_core_release();
            ConfirmStripeIntentParams confirmStripeIntentParams = ((PaymentLauncherContract.Args.IntentConfirmationArgs) args).confirmStripeIntentParams;
            confirmStripeIntentParams.getClass();
            Boolean bool = (Boolean) viewModel$payments_core_release2.savedStateHandle.get("key_has_started");
            if (bool != null ? bool.booleanValue() : false) {
                return;
            }
            JobKt.launch$default(ViewModelKt.getViewModelScope(viewModel$payments_core_release2), null, null, new FlowKt__LimitKt$transformWhile$1(viewModel$payments_core_release2, confirmStripeIntentParams, activityHost, r8, 3), 3);
            return;
        }
        if (args instanceof PaymentLauncherContract.Args.HashedPaymentIntentNextActionArgs) {
            PaymentLauncherViewModel viewModel$payments_core_release3 = getViewModel$payments_core_release();
            Object obj = ((Result) ((PaymentLauncherContract.Args.HashedPaymentIntentNextActionArgs) args).decodedValue$delegate.getValue()).value;
            Pair pair = (Pair) (obj instanceof Result.Failure ? null : obj);
            if (pair == null || (str = (String) pair.second) == null) {
                str = "UNKNOWN";
            }
            viewModel$payments_core_release3.handleNextActionForStripeIntent$payments_core_release(str, activityHost);
            return;
        }
        if (args instanceof PaymentLauncherContract.Args.PaymentIntentNextActionArgs) {
            getViewModel$payments_core_release().handleNextActionForStripeIntent$payments_core_release(((PaymentLauncherContract.Args.PaymentIntentNextActionArgs) args).paymentIntentClientSecret, activityHost);
            return;
        }
        if (args instanceof PaymentLauncherContract.Args.SetupIntentNextActionArgs) {
            getViewModel$payments_core_release().handleNextActionForStripeIntent$payments_core_release(((PaymentLauncherContract.Args.SetupIntentNextActionArgs) args).setupIntentClientSecret, activityHost);
            return;
        }
        if (!(args instanceof PaymentLauncherContract.Args.StripeIntentNextActionWithIntentArgs)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        PaymentLauncherViewModel viewModel$payments_core_release4 = getViewModel$payments_core_release();
        StripeIntent stripeIntent = ((PaymentLauncherContract.Args.StripeIntentNextActionWithIntentArgs) args).stripeIntent;
        stripeIntent.getClass();
        Boolean bool2 = (Boolean) viewModel$payments_core_release4.savedStateHandle.get("key_has_started");
        if (bool2 != null ? bool2.booleanValue() : false) {
            return;
        }
        JobKt.launch$default(ViewModelKt.getViewModelScope(viewModel$payments_core_release4), null, null, new Logger$log$1(viewModel$payments_core_release4, stripeIntent, activityHost, (Continuation) r8, 7), 3);
    }
}
