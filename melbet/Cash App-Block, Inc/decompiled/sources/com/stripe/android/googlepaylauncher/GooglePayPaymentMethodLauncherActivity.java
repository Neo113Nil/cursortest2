package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda2;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.media3.ui.PlayerView;
import com.google.android.gms.wallet.contract.TaskResultContracts$GetPaymentDataResult;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Result;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import dagger.internal.Preconditions;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes8.dex */
public final class GooglePayPaymentMethodLauncherActivity extends AppCompatActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public GooglePayPaymentMethodLauncherContractV2.Args args;
    public final Lazy errorReporter$delegate;
    public final ViewModelLazy viewModel$delegate;

    public GooglePayPaymentMethodLauncherActivity() {
        final int i = 0;
        final int i2 = 1;
        this.viewModel$delegate = new ViewModelLazy(Reflection.factory.getOrCreateKotlinClass(GooglePayPaymentMethodLauncherViewModel.class), new Function0(this) { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ GooglePayPaymentMethodLauncherActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return googlePayPaymentMethodLauncherActivity.getViewModelStore();
                    default:
                        return googlePayPaymentMethodLauncherActivity.getDefaultViewModelCreationExtras();
                }
            }
        }, new Function0(this) { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$$ExternalSyntheticLambda0
            public final /* synthetic */ GooglePayPaymentMethodLauncherActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = this.f$0;
                switch (i3) {
                    case 0:
                        GooglePayPaymentMethodLauncherContractV2.Args args = googlePayPaymentMethodLauncherActivity.args;
                        if (args != null) {
                            return new InitializerViewModelFactory(args);
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("args");
                        throw null;
                    default:
                        int i4 = GooglePayPaymentMethodLauncherActivity.$r8$clinit;
                        EmptySet emptySet = EmptySet.INSTANCE;
                        emptySet.getClass();
                        Context applicationContext = googlePayPaymentMethodLauncherActivity.getApplicationContext();
                        applicationContext.getClass();
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        Preconditions.checkNotNullFromProvides(defaultIoScheduler);
                        return new RealErrorReporter(new DefaultAnalyticsRequestExecutor(Logger$Companion.NOOP_LOGGER, defaultIoScheduler), new PaymentAnalyticsRequestFactory(applicationContext, new CameraX$$ExternalSyntheticLambda0(applicationContext, 14), emptySet));
                }
            }
        }, new Function0(this) { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ GooglePayPaymentMethodLauncherActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return googlePayPaymentMethodLauncherActivity.getViewModelStore();
                    default:
                        return googlePayPaymentMethodLauncherActivity.getDefaultViewModelCreationExtras();
                }
            }
        });
        this.errorReporter$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$$ExternalSyntheticLambda0
            public final /* synthetic */ GooglePayPaymentMethodLauncherActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = this.f$0;
                switch (i3) {
                    case 0:
                        GooglePayPaymentMethodLauncherContractV2.Args args = googlePayPaymentMethodLauncherActivity.args;
                        if (args != null) {
                            return new InitializerViewModelFactory(args);
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("args");
                        throw null;
                    default:
                        int i4 = GooglePayPaymentMethodLauncherActivity.$r8$clinit;
                        EmptySet emptySet = EmptySet.INSTANCE;
                        emptySet.getClass();
                        Context applicationContext = googlePayPaymentMethodLauncherActivity.getApplicationContext();
                        applicationContext.getClass();
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        Preconditions.checkNotNullFromProvides(defaultIoScheduler);
                        return new RealErrorReporter(new DefaultAnalyticsRequestExecutor(Logger$Companion.NOOP_LOGGER, defaultIoScheduler), new PaymentAnalyticsRequestFactory(applicationContext, new CameraX$$ExternalSyntheticLambda0(applicationContext, 14), emptySet));
                }
            }
        });
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        PlayerView.Api34.fadeOut(this);
    }

    public final void finishWithResult(GooglePayPaymentMethodLauncher$Result googlePayPaymentMethodLauncher$Result) {
        setResult(-1, new Intent().putExtras(BundleKt.bundleOf(new Pair("extra_result", googlePayPaymentMethodLauncher$Result))));
        finish();
    }

    public final GooglePayPaymentMethodLauncherViewModel getViewModel() {
        return (GooglePayPaymentMethodLauncherViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PlayerView.Api34.fadeOut(this);
        Intent intent = getIntent();
        intent.getClass();
        GooglePayPaymentMethodLauncherContractV2.Args args = (GooglePayPaymentMethodLauncherContractV2.Args) intent.getParcelableExtra("extra_args");
        int i = 2;
        if (args == null) {
            finishWithResult(new GooglePayPaymentMethodLauncher$Result.Failed(new RuntimeException("GooglePayPaymentMethodLauncherActivity was started without arguments."), 2));
            return;
        }
        this.args = args;
        Continuation continuation = null;
        JobKt.launch$default(ViewModelKt.getCoroutineScope(getLifecycle()), null, null, new GooglePayPaymentMethodLauncherActivity$onCreate$1(this, continuation, 0), 3);
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new TaskResultContracts$GetPaymentDataResult(), new ActivityResultRegistryKt$$ExternalSyntheticLambda2(this, 9));
        if (Intrinsics.areEqual(getViewModel().savedStateHandle.get("has_launched"), Boolean.TRUE)) {
            return;
        }
        JobKt.launch$default(ViewModelKt.getCoroutineScope(getLifecycle()), null, null, new Logger$log$1(this, registerForActivityResult, continuation, i), 3);
    }
}
