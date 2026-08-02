package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda2;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.media3.ui.PlayerView;
import com.google.android.gms.wallet.contract.TaskResultContracts$GetPaymentDataResult;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$1$1;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.googlepaylauncher.GooglePayLauncher$Result;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import dagger.internal.Preconditions;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
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
public final class GooglePayLauncherActivity extends AppCompatActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public GooglePayLauncherContract.Args args;
    public final Lazy errorReporter$delegate;
    public final ViewModelLazy viewModel$delegate;

    public GooglePayLauncherActivity() {
        final int i = 0;
        final int i2 = 1;
        this.viewModel$delegate = new ViewModelLazy(Reflection.factory.getOrCreateKotlinClass(GooglePayLauncherViewModel.class), new Function0(this) { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ GooglePayLauncherActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                GooglePayLauncherActivity googlePayLauncherActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return googlePayLauncherActivity.getViewModelStore();
                    default:
                        return googlePayLauncherActivity.getDefaultViewModelCreationExtras();
                }
            }
        }, new Function0(this) { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$$ExternalSyntheticLambda0
            public final /* synthetic */ GooglePayLauncherActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                GooglePayLauncherActivity googlePayLauncherActivity = this.f$0;
                switch (i3) {
                    case 0:
                        GooglePayLauncherContract.Args args = googlePayLauncherActivity.args;
                        if (args != null) {
                            return new GooglePayLauncherViewModel.Factory(args);
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("args");
                        throw null;
                    default:
                        int i4 = GooglePayLauncherActivity.$r8$clinit;
                        EmptySet emptySet = EmptySet.INSTANCE;
                        emptySet.getClass();
                        Context applicationContext = googlePayLauncherActivity.getApplicationContext();
                        applicationContext.getClass();
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        Preconditions.checkNotNullFromProvides(defaultIoScheduler);
                        return new RealErrorReporter(new DefaultAnalyticsRequestExecutor(Logger$Companion.NOOP_LOGGER, defaultIoScheduler), new PaymentAnalyticsRequestFactory(applicationContext, new CameraX$$ExternalSyntheticLambda0(applicationContext, 14), emptySet));
                }
            }
        }, new Function0(this) { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ GooglePayLauncherActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                GooglePayLauncherActivity googlePayLauncherActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return googlePayLauncherActivity.getViewModelStore();
                    default:
                        return googlePayLauncherActivity.getDefaultViewModelCreationExtras();
                }
            }
        });
        this.errorReporter$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$$ExternalSyntheticLambda0
            public final /* synthetic */ GooglePayLauncherActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                GooglePayLauncherActivity googlePayLauncherActivity = this.f$0;
                switch (i3) {
                    case 0:
                        GooglePayLauncherContract.Args args = googlePayLauncherActivity.args;
                        if (args != null) {
                            return new GooglePayLauncherViewModel.Factory(args);
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("args");
                        throw null;
                    default:
                        int i4 = GooglePayLauncherActivity.$r8$clinit;
                        EmptySet emptySet = EmptySet.INSTANCE;
                        emptySet.getClass();
                        Context applicationContext = googlePayLauncherActivity.getApplicationContext();
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

    public final void finishWithResult(GooglePayLauncher$Result googlePayLauncher$Result) {
        setResult(-1, new Intent().putExtras(BundleKt.bundleOf(new Pair("extra_result", googlePayLauncher$Result))));
        finish();
    }

    public final GooglePayLauncherViewModel getViewModel() {
        return (GooglePayLauncherViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 50000:
            case 50001:
                GooglePayLauncherViewModel viewModel = getViewModel();
                if (intent == null) {
                    intent = new Intent();
                }
                JobKt.launch$default(ViewModelKt.getViewModelScope(viewModel), viewModel.workContext, null, new MoneyTabUIKt$MoneyTabLoaded$1$1(viewModel, i, intent, (Continuation) null, 13), 2);
                break;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object failure;
        super.onCreate(bundle);
        try {
            Result.Companion companion = Result.Companion;
            Intent intent = getIntent();
            intent.getClass();
            failure = (GooglePayLauncherContract.Args) intent.getParcelableExtra("extra_args");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure == null) {
            throw new IllegalArgumentException("GooglePayLauncherActivity was started without arguments.");
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
            finishWithResult(new GooglePayLauncher$Result.Failed(m4120exceptionOrNullimpl));
            return;
        }
        this.args = (GooglePayLauncherContract.Args) failure;
        JobKt.launch$default(ViewModelKt.getCoroutineScope(getLifecycle()), null, null, new HazeSourceNode$launchPreDraw$1(this, null, 2), 3);
        JobKt.launch$default(ViewModelKt.getCoroutineScope(getLifecycle()), null, null, new GooglePayLauncherActivity$onCreate$4(this, registerForActivityResult(new TaskResultContracts$GetPaymentDataResult(), new ActivityResultRegistryKt$$ExternalSyntheticLambda2(this, 8)), null), 3);
    }
}
