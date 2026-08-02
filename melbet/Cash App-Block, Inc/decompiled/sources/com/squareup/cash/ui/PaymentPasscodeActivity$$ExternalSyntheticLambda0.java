package com.squareup.cash.ui;

import androidx.compose.ui.node.NodeChain;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$Factory$Impl;
import com.squareup.cash.history.views.PaymentPasscodeDialogView$Factory$Impl;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.storage.RealSessionedLink;
import com.squareup.util.coroutines.SetupTeardown;
import com.squareup.util.coroutines.SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0;
import com.squareup.util.coroutines.Teardown;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final /* synthetic */ class PaymentPasscodeActivity$$ExternalSyntheticLambda0 implements SetupTeardown {
    public final /* synthetic */ PaymentPasscodeActivity f$0;

    public /* synthetic */ PaymentPasscodeActivity$$ExternalSyntheticLambda0(PaymentPasscodeActivity paymentPasscodeActivity) {
        this.f$0 = paymentPasscodeActivity;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        VariantSandboxedComponent variantSandboxedComponent = (VariantSandboxedComponent) obj;
        int i = PaymentPasscodeActivity.$r8$clinit;
        coroutineScope.getClass();
        variantSandboxedComponent.getClass();
        VariantSandboxedComponent.Impl impl = ((VariantSandboxedComponent.Impl) variantSandboxedComponent).thisGraphInstance;
        PaymentPasscodeActivity paymentPasscodeActivity = this.f$0;
        InstanceFactory instanceFactory = new InstanceFactory(paymentPasscodeActivity);
        AndroidNotificationManager androidNotificationManager = (AndroidNotificationManager) impl.variantAppComponentNotificationManagerProvider.lambda.invoke();
        androidNotificationManager.getClass();
        paymentPasscodeActivity.notificationManager = androidNotificationManager;
        LambdaProvider lambdaProvider = impl.variantAppComponentCashVibratorProvider;
        lambdaProvider.getClass();
        paymentPasscodeActivity.paymentPasscodeDialogViewFactory = new PaymentPasscodeDialogView$Factory$Impl(new RealSessionedLink.MetroFactory(lambdaProvider));
        LambdaProvider lambdaProvider2 = impl.variantAppComponentStringManagerProvider;
        DoubleCheck doubleCheck = impl.provideFranklinAppServiceProvider;
        DoubleCheck doubleCheck2 = impl.provideAnalyticsProvider;
        LambdaProvider lambdaProvider3 = impl.variantAppComponentBiometricsProvider;
        DoubleCheck doubleCheck3 = impl.provideSandboxedContextProvider;
        doubleCheck3.getClass();
        ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory = new ArcadeModule$ProvideHapticVibratorMetroFactory(doubleCheck3, 12);
        LambdaProvider lambdaProvider4 = impl.variantAppComponentIoDispatcherProvider;
        LambdaProvider lambdaProvider5 = impl.variantAppComponentBiometricsProvider;
        lambdaProvider4.getClass();
        lambdaProvider5.getClass();
        RealFileDownloader.MetroFactory metroFactory = new RealFileDownloader.MetroFactory((Provider) doubleCheck3, (Factory) arcadeModule$ProvideHapticVibratorMetroFactory, (Provider) lambdaProvider4, (Provider) lambdaProvider5, 6);
        DoubleCheck doubleCheck4 = impl.provideAnalyticsProvider;
        lambdaProvider3.getClass();
        doubleCheck4.getClass();
        TreehouseFlows.MetroFactory metroFactory2 = new TreehouseFlows.MetroFactory(lambdaProvider3, metroFactory, doubleCheck4, 7);
        LambdaProvider lambdaProvider6 = impl.variantAppComponentIoDispatcherProvider;
        LambdaProvider lambdaProvider7 = impl.variantAppComponentStringManagerProvider;
        lambdaProvider7.getClass();
        ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory2 = new ArcadeModule$ProvideHapticVibratorMetroFactory(lambdaProvider7, 10);
        DoubleCheck doubleCheck5 = impl.realPaymentManagerProvider;
        DoubleCheck doubleCheck6 = impl.productionAppsFlyerClientProvider;
        DoubleCheck doubleCheck7 = impl.realCashFirebaseAnalyticsProvider;
        DoubleCheck doubleCheck8 = impl.provideAnalyticsProvider;
        doubleCheck6.getClass();
        doubleCheck7.getClass();
        doubleCheck8.getClass();
        TreehouseFlows.MetroFactory metroFactory3 = new TreehouseFlows.MetroFactory(doubleCheck6, doubleCheck7, doubleCheck8, 4);
        DoubleCheck doubleCheck9 = impl.realFeatureFlagManagerProvider;
        lambdaProvider2.getClass();
        doubleCheck.getClass();
        doubleCheck2.getClass();
        lambdaProvider6.getClass();
        doubleCheck5.getClass();
        doubleCheck9.getClass();
        paymentPasscodeActivity.presenterFactory = new PasscodeDialogPresenter$Factory$Impl(new NodeChain(lambdaProvider2, doubleCheck, doubleCheck2, metroFactory2, lambdaProvider6, arcadeModule$ProvideHapticVibratorMetroFactory2, doubleCheck5, metroFactory3, doubleCheck9, instanceFactory, 15));
        return new SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0(new PaymentPasscodeActivity$$ExternalSyntheticLambda1(paymentPasscodeActivity, 1));
    }
}
