package com.stripe.android;

import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory;
import androidx.lifecycle.viewmodel.CreationExtras;
import app.cash.trifle.Trifle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.fillr.n;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.PayHistoryStubViewModel;
import com.squareup.cash.work.viewmodels.ShiftListDayViewModel;
import com.squareup.cash.work.viewmodels.TaxFormItemViewModel;
import com.squareup.cash.work.views.clockin.ClockInOverlayMode;
import com.squareup.cash.work.views.clockin.ClockInOverlayTransitionsKt;
import com.squareup.cash.work.views.clockin.ClockInSheetMode;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda19;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.challenge.confirmation.DefaultConfirmationChallengeBridgeHandler;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeArgs;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeViewModel;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeWebView;
import com.stripe.android.challenge.confirmation.di.IntentConfirmationChallengeModule_Companion_ProvideDurationProviderFactory$InstanceHolder;
import com.stripe.android.challenge.passive.PassiveChallengeActivity;
import com.stripe.android.challenge.passive.PassiveChallengeArgs;
import com.stripe.android.challenge.passive.PassiveChallengeModule_Companion_ProvideDurationProviderFactory$InstanceHolder;
import com.stripe.android.challenge.passive.PassiveChallengeViewModel;
import com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerActivity;
import com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerArgs;
import com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerViewModel;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.googlepaylauncher.DefaultPaymentsClientFactory_Factory;
import com.stripe.android.hcaptcha.HCaptchaModule;
import com.stripe.android.hcaptcha.HCaptchaModule_ProvideHCaptchaServiceFactory;
import com.stripe.android.model.PassiveCaptchaParams;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.RequestSurface;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.view.ActivityHost;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.full.KClasses$$Lambda$1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.idrnd.face.iad.capture.internal.y0;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes8.dex */
public final /* synthetic */ class StripePaymentController$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ StripePaymentController$$ExternalSyntheticLambda1(StripePaymentController stripePaymentController) {
        this.$r8$classId = 0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 9;
        SandboxFlags_Factory sandboxFlags_Factory = PassiveChallengeModule_Companion_ProvideDurationProviderFactory$InstanceHolder.INSTANCE;
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = Logger$Companion.NOOP_LOGGER;
        Trifle trifle = ViewModelProvider$AndroidViewModelFactory.APPLICATION_KEY;
        final int i3 = 0;
        switch (i) {
            case 0:
                ActivityHost activityHost = (ActivityHost) obj;
                activityHost.getClass();
                return new PaymentRelayStarter$Legacy(activityHost);
            case 1:
                ((Merchant) obj).getClass();
                return Boolean.TRUE;
            case 2:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return animatedContentTransitionScopeImpl.getTargetState() != ClockInSheetMode.Main ? AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), new SvgDecoder$$ExternalSyntheticLambda0(1)), EnterExitTransitionKt.slideOutHorizontally(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), new StripePaymentController$$ExternalSyntheticLambda1(4))) : AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), new StripePaymentController$$ExternalSyntheticLambda1(5)), EnterExitTransitionKt.slideOutHorizontally(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), new SvgDecoder$$ExternalSyntheticLambda0(1)));
            case 4:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 5:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 6:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                CubicBezierEasing cubicBezierEasing = ClockInOverlayTransitionsKt.ClockInOverlayEasing;
                ContentTransform contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(new TweenSpec(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 100, cubicBezierEasing), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(100, 0, cubicBezierEasing, 2), 2));
                contentTransform.sizeTransform = AnimatedContentKt.SizeTransform$default(1, new PayHomeViewKt$$ExternalSyntheticLambda19(8));
                return contentTransform;
            case 7:
                ClockInOverlayViewModel.Loaded loaded = (ClockInOverlayViewModel.Loaded) obj;
                loaded.getClass();
                return ClockInOverlayTransitionsKt.getStateKey(loaded);
            case 8:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                CubicBezierEasing cubicBezierEasing2 = ClockInOverlayTransitionsKt.ClockInOverlayEasing;
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(new TweenSpec(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 100, cubicBezierEasing2), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(100, 0, cubicBezierEasing2, 2), 2));
            case 9:
                ClockInOverlayViewModel.Loaded loaded2 = (ClockInOverlayViewModel.Loaded) obj;
                loaded2.getClass();
                return ClockInOverlayTransitionsKt.getStateKey(loaded2);
            case 10:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                CubicBezierEasing cubicBezierEasing3 = ClockInOverlayTransitionsKt.ClockInOverlayEasing;
                ContentTransform contentTransform2 = AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(new TweenSpec(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 100, cubicBezierEasing3), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(100, 0, cubicBezierEasing3, 2), 2));
                contentTransform2.sizeTransform = AnimatedContentKt.SizeTransform$default(1, new PayHomeViewKt$$ExternalSyntheticLambda19(i2));
                return contentTransform2;
            case 11:
                ClockInOverlayViewModel.Loaded loaded3 = (ClockInOverlayViewModel.Loaded) obj;
                loaded3.getClass();
                return ClockInOverlayTransitionsKt.getStateKey(loaded3);
            case 12:
                LocationIdentifier locationIdentifier = (LocationIdentifier) obj;
                locationIdentifier.getClass();
                return locationIdentifier.token;
            case 13:
                JobIdentifier jobIdentifier = (JobIdentifier) obj;
                jobIdentifier.getClass();
                return jobIdentifier.token;
            case 14:
                ClockInOverlayViewModel.BreakIdentifier breakIdentifier = (ClockInOverlayViewModel.BreakIdentifier) obj;
                breakIdentifier.getClass();
                return breakIdentifier.token;
            case 15:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl2.getClass();
                int i4 = animatedContentTransitionScopeImpl2.getTargetState() != ClockInOverlayMode.Main ? 1 : -1;
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), new DatePickerKt$$ExternalSyntheticLambda10(i4, 20)), EnterExitTransitionKt.slideOutHorizontally(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), new DatePickerKt$$ExternalSyntheticLambda10(i4, 21)));
            case 16:
                PayHistoryStubViewModel payHistoryStubViewModel = (PayHistoryStubViewModel) obj;
                payHistoryStubViewModel.getClass();
                return payHistoryStubViewModel.id;
            case 17:
                TaxFormItemViewModel taxFormItemViewModel = (TaxFormItemViewModel) obj;
                taxFormItemViewModel.getClass();
                return taxFormItemViewModel.token;
            case 18:
                ((Map) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                ShiftListDayViewModel shiftListDayViewModel = (ShiftListDayViewModel) obj;
                shiftListDayViewModel.getClass();
                return shiftListDayViewModel.date;
            case 21:
                ((ShiftListDayViewModel) obj).getClass();
                return "day";
            case 22:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                return Boolean.TRUE;
            case 24:
                Context context = (Context) obj;
                context.getClass();
                return new IntentConfirmationChallengeWebView(context);
            case 25:
                IntentConfirmationChallengeWebView intentConfirmationChallengeWebView = (IntentConfirmationChallengeWebView) obj;
                intentConfirmationChallengeWebView.getClass();
                intentConfirmationChallengeWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return Unit.INSTANCE;
            case 26:
                CreationExtras creationExtras = (CreationExtras) obj;
                creationExtras.getClass();
                SavedStateHandle createSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(creationExtras);
                Object obj2 = creationExtras.get(trifle);
                obj2.getClass();
                Application application = (Application) obj2;
                int i5 = IntentConfirmationChallengeActivity.$r8$clinit;
                IntentConfirmationChallengeArgs intentConfirmationChallengeArgs = (IntentConfirmationChallengeArgs) createSavedStateHandle.get("intent_confirmation_challenge_args");
                if (intentConfirmationChallengeArgs == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("No IntentConfirmationChallengeArgs found");
                    return null;
                }
                List list = intentConfirmationChallengeArgs.productUsage;
                final DefaultPaymentsClientFactory_Factory defaultPaymentsClientFactory_Factory = new DefaultPaymentsClientFactory_Factory(new POPMatchingFactory(16), InstanceFactory.create(application), 7);
                Provider provider = DoubleCheck.provider(IntentConfirmationChallengeModule_Companion_ProvideDurationProviderFactory$InstanceHolder.INSTANCE);
                KClasses$$Lambda$1 kClasses$$Lambda$1 = new KClasses$$Lambda$1(9);
                y0 y0Var = new y0();
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                Preconditions.checkNotNullFromProvides(defaultIoScheduler);
                Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$12 = Logger$Companion.NOOP_LOGGER;
                DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor(logger$Companion$NOOP_LOGGER$12, defaultIoScheduler);
                Function0 function0 = new Function0() { // from class: com.stripe.android.payments.core.injection.PaymentConfigurationModule$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = i3;
                        javax.inject.Provider provider2 = defaultPaymentsClientFactory_Factory;
                        switch (i6) {
                            case 0:
                                return ((PaymentConfiguration) provider2.get()).publishableKey;
                            default:
                                return ((PaymentConfiguration) provider2.get()).stripeAccountId;
                        }
                    }
                };
                Set set = CollectionsKt.toSet(list);
                Preconditions.checkNotNullFromProvides(set);
                DefaultConfirmationChallengeBridgeHandler defaultConfirmationChallengeBridgeHandler = new DefaultConfirmationChallengeBridgeHandler(kClasses$$Lambda$1, y0Var, intentConfirmationChallengeArgs, new RealErrorReporter(defaultAnalyticsRequestExecutor, new PaymentAnalyticsRequestFactory(application, function0, set)));
                DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                Preconditions.checkNotNullFromProvides(handlerContext);
                DefaultScheduler defaultScheduler3 = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler2 = DefaultIoScheduler.INSTANCE;
                Preconditions.checkNotNullFromProvides(defaultIoScheduler2);
                DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor2 = new DefaultAnalyticsRequestExecutor(logger$Companion$NOOP_LOGGER$12, defaultIoScheduler2);
                Function0 function02 = new Function0() { // from class: com.stripe.android.payments.core.injection.PaymentConfigurationModule$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = i3;
                        javax.inject.Provider provider2 = defaultPaymentsClientFactory_Factory;
                        switch (i6) {
                            case 0:
                                return ((PaymentConfiguration) provider2.get()).publishableKey;
                            default:
                                return ((PaymentConfiguration) provider2.get()).stripeAccountId;
                        }
                    }
                };
                Set set2 = CollectionsKt.toSet(list);
                Preconditions.checkNotNullFromProvides(set2);
                TextSetter textSetter = new TextSetter(defaultAnalyticsRequestExecutor2, new PaymentAnalyticsRequestFactory(application, function02, set2), (DurationProvider) provider.get());
                String str = RequestHeadersFactory.CHARSET;
                Function0 function03 = new Function0() { // from class: com.stripe.android.payments.core.injection.PaymentConfigurationModule$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = i3;
                        javax.inject.Provider provider2 = defaultPaymentsClientFactory_Factory;
                        switch (i6) {
                            case 0:
                                return ((PaymentConfiguration) provider2.get()).publishableKey;
                            default:
                                return ((PaymentConfiguration) provider2.get()).stripeAccountId;
                        }
                    }
                };
                RequestSurface requestSurface = RequestSurface.PaymentElement;
                DefaultScheduler defaultScheduler4 = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler3 = DefaultIoScheduler.INSTANCE;
                Preconditions.checkNotNullFromProvides(defaultIoScheduler3);
                Set set3 = CollectionsKt.toSet(list);
                Preconditions.checkNotNullFromProvides(set3);
                Set set4 = set3;
                Function0 function04 = new Function0() { // from class: com.stripe.android.payments.core.injection.PaymentConfigurationModule$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = i3;
                        javax.inject.Provider provider2 = defaultPaymentsClientFactory_Factory;
                        switch (i6) {
                            case 0:
                                return ((PaymentConfiguration) provider2.get()).publishableKey;
                            default:
                                return ((PaymentConfiguration) provider2.get()).stripeAccountId;
                        }
                    }
                };
                Set set5 = CollectionsKt.toSet(list);
                Preconditions.checkNotNullFromProvides(set5);
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(application, function04, set5);
                DefaultScheduler defaultScheduler5 = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler4 = DefaultIoScheduler.INSTANCE;
                Preconditions.checkNotNullFromProvides(defaultIoScheduler4);
                StripeApiRepository stripeApiRepository = new StripeApiRepository(application, function03, requestSurface, defaultIoScheduler3, set4, paymentAnalyticsRequestFactory, new DefaultAnalyticsRequestExecutor(logger$Companion$NOOP_LOGGER$12, defaultIoScheduler4), logger$Companion$NOOP_LOGGER$12);
                DefaultScheduler defaultScheduler6 = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler5 = DefaultIoScheduler.INSTANCE;
                Preconditions.checkNotNullFromProvides(defaultIoScheduler5);
                DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor3 = new DefaultAnalyticsRequestExecutor(logger$Companion$NOOP_LOGGER$12, defaultIoScheduler5);
                Function0 function05 = new Function0() { // from class: com.stripe.android.payments.core.injection.PaymentConfigurationModule$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = i3;
                        javax.inject.Provider provider2 = defaultPaymentsClientFactory_Factory;
                        switch (i6) {
                            case 0:
                                return ((PaymentConfiguration) provider2.get()).publishableKey;
                            default:
                                return ((PaymentConfiguration) provider2.get()).stripeAccountId;
                        }
                    }
                };
                Set set6 = CollectionsKt.toSet(list);
                Preconditions.checkNotNullFromProvides(set6);
                RealErrorReporter realErrorReporter = new RealErrorReporter(defaultAnalyticsRequestExecutor3, new PaymentAnalyticsRequestFactory(application, function05, set6));
                final int i6 = 1;
                return new IntentConfirmationChallengeViewModel(intentConfirmationChallengeArgs, defaultConfirmationChallengeBridgeHandler, handlerContext, textSetter, "Stripe/v1 AndroidBindings/23.9.1", stripeApiRepository, realErrorReporter, new ApiRequest.Options(new Function0() { // from class: com.stripe.android.payments.core.injection.PaymentConfigurationModule$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i62 = i3;
                        javax.inject.Provider provider2 = defaultPaymentsClientFactory_Factory;
                        switch (i62) {
                            case 0:
                                return ((PaymentConfiguration) provider2.get()).publishableKey;
                            default:
                                return ((PaymentConfiguration) provider2.get()).stripeAccountId;
                        }
                    }
                }, new Function0() { // from class: com.stripe.android.payments.core.injection.PaymentConfigurationModule$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i62 = i6;
                        javax.inject.Provider provider2 = defaultPaymentsClientFactory_Factory;
                        switch (i62) {
                            case 0:
                                return ((PaymentConfiguration) provider2.get()).publishableKey;
                            default:
                                return ((PaymentConfiguration) provider2.get()).stripeAccountId;
                        }
                    }
                }), logger$Companion$NOOP_LOGGER$12);
            case 27:
                CreationExtras creationExtras2 = (CreationExtras) obj;
                creationExtras2.getClass();
                int i7 = PassiveChallengeActivity.$r8$clinit;
                PassiveChallengeArgs passiveChallengeArgs = (PassiveChallengeArgs) SavedStateHandleSupport.createSavedStateHandle(creationExtras2).get("passive_challenge_args");
                if (passiveChallengeArgs == null) {
                    throw new PassiveChallengeViewModel.NoArgsException("No args found");
                }
                Object obj3 = creationExtras2.get(trifle);
                obj3.getClass();
                Application application2 = (Application) obj3;
                HCaptcha$$ExternalSyntheticLambda0 hCaptcha$$ExternalSyntheticLambda0 = new HCaptcha$$ExternalSyntheticLambda0(passiveChallengeArgs, 10);
                Set set7 = CollectionsKt.toSet(passiveChallengeArgs.productUsage);
                PassiveCaptchaParams passiveCaptchaParams = passiveChallengeArgs.passiveCaptchaParams;
                set7.getClass();
                passiveCaptchaParams.getClass();
                Provider provider2 = DoubleCheck.provider(sandboxFlags_Factory);
                HCaptchaModule hCaptchaModule = new HCaptchaModule();
                DefaultScheduler defaultScheduler7 = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler6 = DefaultIoScheduler.INSTANCE;
                Preconditions.checkNotNullFromProvides(defaultIoScheduler6);
                DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor4 = new DefaultAnalyticsRequestExecutor(logger$Companion$NOOP_LOGGER$1, defaultIoScheduler6);
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory2 = new PaymentAnalyticsRequestFactory(application2, hCaptcha$$ExternalSyntheticLambda0, set7);
                DurationProvider durationProvider = (DurationProvider) provider2.get();
                RealErrorReporter realErrorReporter2 = new RealErrorReporter(new DefaultAnalyticsRequestExecutor(logger$Companion$NOOP_LOGGER$1, defaultIoScheduler6), new PaymentAnalyticsRequestFactory(application2, hCaptcha$$ExternalSyntheticLambda0, set7));
                durationProvider.getClass();
                return new PassiveChallengeViewModel(passiveCaptchaParams, HCaptchaModule_ProvideHCaptchaServiceFactory.provideHCaptchaService(hCaptchaModule, new n(defaultAnalyticsRequestExecutor4, paymentAnalyticsRequestFactory2, durationProvider, realErrorReporter2)));
            case 28:
                CreationExtras creationExtras3 = (CreationExtras) obj;
                creationExtras3.getClass();
                int i8 = PassiveChallengeWarmerActivity.$r8$clinit;
                PassiveChallengeWarmerArgs passiveChallengeWarmerArgs = (PassiveChallengeWarmerArgs) SavedStateHandleSupport.createSavedStateHandle(creationExtras3).get("passive_challenge_warmer_args");
                if (passiveChallengeWarmerArgs == null) {
                    throw new PassiveChallengeWarmerViewModel.NoArgsException("No args found");
                }
                Object obj4 = creationExtras3.get(trifle);
                obj4.getClass();
                Application application3 = (Application) obj4;
                HCaptcha$$ExternalSyntheticLambda0 hCaptcha$$ExternalSyntheticLambda02 = new HCaptcha$$ExternalSyntheticLambda0(passiveChallengeWarmerArgs, 12);
                Set set8 = CollectionsKt.toSet(passiveChallengeWarmerArgs.productUsage);
                PassiveCaptchaParams passiveCaptchaParams2 = passiveChallengeWarmerArgs.passiveCaptchaParams;
                set8.getClass();
                passiveCaptchaParams2.getClass();
                Provider provider3 = DoubleCheck.provider(sandboxFlags_Factory);
                HCaptchaModule hCaptchaModule2 = new HCaptchaModule();
                DefaultScheduler defaultScheduler8 = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler7 = DefaultIoScheduler.INSTANCE;
                Preconditions.checkNotNullFromProvides(defaultIoScheduler7);
                DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor5 = new DefaultAnalyticsRequestExecutor(logger$Companion$NOOP_LOGGER$1, defaultIoScheduler7);
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory3 = new PaymentAnalyticsRequestFactory(application3, hCaptcha$$ExternalSyntheticLambda02, set8);
                DurationProvider durationProvider2 = (DurationProvider) provider3.get();
                RealErrorReporter realErrorReporter3 = new RealErrorReporter(new DefaultAnalyticsRequestExecutor(logger$Companion$NOOP_LOGGER$1, defaultIoScheduler7), new PaymentAnalyticsRequestFactory(application3, hCaptcha$$ExternalSyntheticLambda02, set8));
                durationProvider2.getClass();
                return new PassiveChallengeWarmerViewModel(passiveCaptchaParams2, HCaptchaModule_ProvideHCaptchaServiceFactory.provideHCaptchaService(hCaptchaModule2, new n(defaultAnalyticsRequestExecutor5, paymentAnalyticsRequestFactory3, durationProvider2, realErrorReporter3)));
            default:
                String str2 = (String) obj;
                str2.getClass();
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, '=', 0, false, 6);
                if (indexOf$default < 0) {
                    return str2;
                }
                Set set9 = APIConnectionException.SENSITIVE_PARAM_NAMES;
                String substring = str2.substring(0, indexOf$default);
                try {
                    String decode = URLDecoder.decode(substring, "UTF-8");
                    decode.getClass();
                    substring = decode;
                } catch (IllegalArgumentException unused) {
                }
                String substring2 = str2.substring(indexOf$default + 1);
                try {
                    String decode2 = URLDecoder.decode(substring2, "UTF-8");
                    decode2.getClass();
                    substring2 = decode2;
                } catch (IllegalArgumentException unused2) {
                }
                if (!APIConnectionException.SENSITIVE_PARAM_NAMES.contains(substring)) {
                    List list2 = APIConnectionException.SENSITIVE_VALUE_PREFIXES;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (StringsKt__StringsJVMKt.startsWith(substring2, (String) it.next(), false)) {
                            }
                        }
                    }
                    return Recorder$$ExternalSyntheticOutline2.m(substring, "=", substring2);
                }
                substring2 = "**REDACTED**";
                return Recorder$$ExternalSyntheticOutline2.m(substring, "=", substring2);
        }
    }

    public /* synthetic */ StripePaymentController$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }
}
