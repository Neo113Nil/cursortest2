package com.stripe.android.payments;

import android.R;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.tracing.Trace;
import com.datadog.android.trace.model.SpanEvent;
import com.google.mlkit.vision.face.internal.zzm;
import com.miteksystems.misnap.core.MibiData;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.browser.BrowserCapabilities;
import com.stripe.android.core.exception.LocalStripeException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.analytics.ErrorReporter$Companion;
import com.stripe.android.payments.core.analytics.ErrorReporter$ExpectedErrorEvent;
import com.stripe.hcaptcha.HCaptchaHtmlKt$$ExternalSyntheticLambda0;
import dagger.internal.Preconditions;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes8.dex */
public final class StripeBrowserLauncherActivity extends AppCompatActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ViewModelLazy viewModel$delegate;

    public StripeBrowserLauncherActivity() {
        final int i = 0;
        final int i2 = 1;
        this.viewModel$delegate = new ViewModelLazy(Reflection.factory.getOrCreateKotlinClass(StripeBrowserLauncherViewModel.class), new Function0(this) { // from class: com.stripe.android.payments.StripeBrowserLauncherActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ StripeBrowserLauncherActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                StripeBrowserLauncherActivity stripeBrowserLauncherActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return stripeBrowserLauncherActivity.getViewModelStore();
                    default:
                        return stripeBrowserLauncherActivity.getDefaultViewModelCreationExtras();
                }
            }
        }, new HCaptchaHtmlKt$$ExternalSyntheticLambda0(6), new Function0(this) { // from class: com.stripe.android.payments.StripeBrowserLauncherActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ StripeBrowserLauncherActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                StripeBrowserLauncherActivity stripeBrowserLauncherActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return stripeBrowserLauncherActivity.getViewModelStore();
                    default:
                        return stripeBrowserLauncherActivity.getDefaultViewModelCreationExtras();
                }
            }
        });
    }

    public final void finishWithFailure(PaymentBrowserAuthContract.Args args) {
        StripeBrowserLauncherViewModel stripeBrowserLauncherViewModel = (StripeBrowserLauncherViewModel) this.viewModel$delegate.getValue();
        Uri parse = Uri.parse(args.url);
        LocalStripeException localStripeException = new LocalStripeException(stripeBrowserLauncherViewModel.resolveErrorMessage, "failedBrowserLaunchError");
        Intent intent = new Intent();
        String str = args.clientSecret;
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String str2 = args.stripeAccountId;
        Intent putExtras = intent.putExtras(new PaymentFlowResult$Unvalidated(str, 2, localStripeException, args.shouldCancelSource, lastPathSegment, str2, 32).toBundle());
        putExtras.getClass();
        setResult(-1, putExtras);
        finish();
    }

    public final void finishWithSuccess(PaymentBrowserAuthContract.Args args) {
        Uri parse = Uri.parse(args.url);
        Intent intent = new Intent();
        String str = args.clientSecret;
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String str2 = args.stripeAccountId;
        Intent putExtras = intent.putExtras(new PaymentFlowResult$Unvalidated(str, 0, (StripeException) null, args.shouldCancelSource, lastPathSegment, str2, 38).toBundle());
        putExtras.getClass();
        setResult(-1, putExtras);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        char c;
        Intent intent;
        Map additionalParamsFromStripeException;
        Map additionalParamsFromStripeException2;
        super.onCreate(bundle);
        Intent intent2 = getIntent();
        intent2.getClass();
        final PaymentBrowserAuthContract.Args args = (PaymentBrowserAuthContract.Args) intent2.getParcelableExtra("extra_args");
        int i = 14;
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = Logger$Companion.NOOP_LOGGER;
        EmptyMap emptyMap = null;
        if (args == null) {
            finish();
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
            ErrorReporter$ExpectedErrorEvent errorReporter$ExpectedErrorEvent = ErrorReporter$ExpectedErrorEvent.BROWSER_LAUNCHER_NULL_ARGS;
            if ((6 & 4) != 0) {
                emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
            }
            emptyMap.getClass();
            EmptyMap emptyMap2 = EmptyMap.INSTANCE;
            emptyMap2.getClass();
            defaultAnalyticsRequestExecutor.executeAsync(paymentAnalyticsRequestFactory.createRequest(errorReporter$ExpectedErrorEvent, MapsKt__MapsKt.plus(emptyMap2, emptyMap)));
            return;
        }
        ViewModelLazy viewModelLazy = this.viewModel$delegate;
        Boolean bool = (Boolean) ((StripeBrowserLauncherViewModel) viewModelLazy.getValue()).savedStateHandle.get("has_launched");
        if (bool != null ? bool.booleanValue() : false) {
            finishWithSuccess(args);
        } else {
            ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.stripe.android.payments.StripeBrowserLauncherActivity$$ExternalSyntheticLambda2
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    int i2 = StripeBrowserLauncherActivity.$r8$clinit;
                    ((ActivityResult) obj).getClass();
                    StripeBrowserLauncherActivity.this.finishWithSuccess(args);
                }
            });
            StripeBrowserLauncherViewModel stripeBrowserLauncherViewModel = (StripeBrowserLauncherViewModel) viewModelLazy.getValue();
            Uri parse = Uri.parse(args.url);
            BrowserCapabilities browserCapabilities = stripeBrowserLauncherViewModel.browserCapabilities;
            int ordinal = browserCapabilities.ordinal();
            if (ordinal == 0) {
                paymentAnalyticsEvent = PaymentAnalyticsEvent.AuthWithCustomTabs;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                paymentAnalyticsEvent = PaymentAnalyticsEvent.AuthWithDefaultBrowser;
            }
            stripeBrowserLauncherViewModel.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeBrowserLauncherViewModel.paymentAnalyticsRequestFactory, paymentAnalyticsEvent, null, null, null, null, 62));
            int ordinal2 = browserCapabilities.ordinal();
            if (ordinal2 == 0) {
                parse.getClass();
                Integer num = args.statusBarColor;
                MibiData.Session session = num != null ? new MibiData.Session(1, Integer.valueOf(num.intValue() | (-16777216))) : null;
                zzm zzmVar = new zzm();
                zzmVar.setShareState(2);
                if (session != null) {
                    Bundle bundle2 = new Bundle();
                    Integer num2 = session.a;
                    c = 4;
                    if (num2 != null) {
                        bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num2.intValue());
                    }
                    zzmVar.zzf = bundle2;
                } else {
                    c = 4;
                }
                Intent intent3 = (Intent) zzmVar.build().val$videoEncoderSession;
                intent3.setData(parse);
                String str = stripeBrowserLauncherViewModel.customTabsPackage;
                if (str != null) {
                    intent3.setPackage(str);
                }
                intent = intent3;
            } else if (ordinal2 != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            } else {
                intent = new Intent("android.intent.action.VIEW", parse);
                c = 4;
            }
            try {
                registerForActivityResult.launch(intent);
                ((StripeBrowserLauncherViewModel) viewModelLazy.getValue()).savedStateHandle.set(Boolean.TRUE, "has_launched");
            } catch (ActivityNotFoundException e) {
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
                ErrorReporter$ExpectedErrorEvent errorReporter$ExpectedErrorEvent2 = ErrorReporter$ExpectedErrorEvent.BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND;
                int i2 = StripeException.$r8$clinit;
                StripeException create = SpanEvent.Account.create(e);
                if ((c & 2) != 0) {
                    create = null;
                }
                if ((c & c) != 0) {
                    emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                }
                emptyMap.getClass();
                if (create == null) {
                    additionalParamsFromStripeException2 = EmptyMap.INSTANCE;
                    additionalParamsFromStripeException2.getClass();
                } else {
                    additionalParamsFromStripeException2 = ErrorReporter$Companion.getAdditionalParamsFromStripeException(create);
                }
                defaultAnalyticsRequestExecutor2.executeAsync(paymentAnalyticsRequestFactory2.createRequest(errorReporter$ExpectedErrorEvent2, MapsKt__MapsKt.plus(additionalParamsFromStripeException2, emptyMap)));
                finishWithFailure(args);
            } catch (SecurityException e2) {
                Context applicationContext5 = getApplicationContext();
                applicationContext5.getClass();
                EmptySet emptySet3 = EmptySet.INSTANCE;
                emptySet3.getClass();
                Context applicationContext6 = applicationContext5.getApplicationContext();
                applicationContext6.getClass();
                DefaultScheduler defaultScheduler3 = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler3 = DefaultIoScheduler.INSTANCE;
                Preconditions.checkNotNullFromProvides(defaultIoScheduler3);
                DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor3 = new DefaultAnalyticsRequestExecutor(logger$Companion$NOOP_LOGGER$1, defaultIoScheduler3);
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory3 = new PaymentAnalyticsRequestFactory(applicationContext6, new CameraX$$ExternalSyntheticLambda0(applicationContext6, i), emptySet3);
                ErrorReporter$ExpectedErrorEvent errorReporter$ExpectedErrorEvent3 = ErrorReporter$ExpectedErrorEvent.BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND;
                int i3 = StripeException.$r8$clinit;
                StripeException create2 = SpanEvent.Account.create(e2);
                if ((c & 2) != 0) {
                    create2 = null;
                }
                if ((c & c) != 0) {
                    emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                }
                emptyMap.getClass();
                if (create2 == null) {
                    additionalParamsFromStripeException = EmptyMap.INSTANCE;
                    additionalParamsFromStripeException.getClass();
                } else {
                    additionalParamsFromStripeException = ErrorReporter$Companion.getAdditionalParamsFromStripeException(create2);
                }
                defaultAnalyticsRequestExecutor3.executeAsync(paymentAnalyticsRequestFactory3.createRequest(errorReporter$ExpectedErrorEvent3, MapsKt__MapsKt.plus(additionalParamsFromStripeException, emptyMap)));
                finishWithFailure(args);
            }
        }
        Trace.setDecorFitsSystemWindows(getWindow(), false);
        View findViewById = findViewById(R.id.content);
        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 workWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 = new WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(26);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(findViewById, workWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0);
    }
}
