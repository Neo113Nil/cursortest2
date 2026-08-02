package com.stripe.android.view;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.tracing.Trace;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.squareup.cash.R;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.AnalyticsRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.databinding.StripePaymentAuthWebViewActivityBinding;
import com.stripe.android.model.Source;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.payments.core.analytics.ErrorReporter$ExpectedErrorEvent;
import com.stripe.android.payments.core.analytics.ErrorReporter$UnexpectedErrorEvent;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.stripe.android.view.PaymentAuthWebViewActivityViewModel;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import dagger.internal.Preconditions;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes8.dex */
public final class PaymentAuthWebViewActivity extends AppCompatActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Lazy _args$delegate;
    public final Lazy logger$delegate;
    public final Lazy viewBinding$delegate;
    public final ViewModelLazy viewModel$delegate;

    public PaymentAuthWebViewActivity() {
        final int i = 0;
        this.viewBinding$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$$ExternalSyntheticLambda0
            public final /* synthetic */ PaymentAuthWebViewActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PaymentAuthWebViewActivity paymentAuthWebViewActivity = this.f$0;
                switch (i2) {
                    case 0:
                        int i3 = PaymentAuthWebViewActivity.$r8$clinit;
                        View inflate = paymentAuthWebViewActivity.getLayoutInflater().inflate(R.layout.stripe_payment_auth_web_view_activity, (ViewGroup) null, false);
                        int i4 = R.id.app_bar;
                        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(inflate, R.id.app_bar);
                        if (appBarLayout != null) {
                            i4 = R.id.progress_bar;
                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(inflate, R.id.progress_bar);
                            if (circularProgressIndicator != null) {
                                i4 = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(inflate, R.id.toolbar);
                                if (toolbar != null) {
                                    i4 = R.id.web_view;
                                    PaymentAuthWebView paymentAuthWebView = (PaymentAuthWebView) ViewBindings.findChildViewById(inflate, R.id.web_view);
                                    if (paymentAuthWebView != null) {
                                        i4 = R.id.web_view_container;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.web_view_container);
                                        if (frameLayout != null) {
                                            return new StripePaymentAuthWebViewActivityBinding((CoordinatorLayout) inflate, appBarLayout, circularProgressIndicator, toolbar, paymentAuthWebView, frameLayout);
                                        }
                                    }
                                }
                            }
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = PaymentAuthWebViewActivity.$r8$clinit;
                        Intent intent = paymentAuthWebViewActivity.getIntent();
                        intent.getClass();
                        return (PaymentBrowserAuthContract.Args) intent.getParcelableExtra("extra_args");
                    case 2:
                        int i6 = PaymentAuthWebViewActivity.$r8$clinit;
                        PaymentBrowserAuthContract.Args args = (PaymentBrowserAuthContract.Args) paymentAuthWebViewActivity._args$delegate.getValue();
                        return (args == null || !args.enableLogging) ? Logger$Companion.NOOP_LOGGER : Logger$Companion.REAL_LOGGER;
                    default:
                        int i7 = PaymentAuthWebViewActivity.$r8$clinit;
                        Application application = paymentAuthWebViewActivity.getApplication();
                        application.getClass();
                        Logger$Companion$NOOP_LOGGER$1 logger = paymentAuthWebViewActivity.getLogger();
                        PaymentBrowserAuthContract.Args args2 = (PaymentBrowserAuthContract.Args) paymentAuthWebViewActivity._args$delegate.getValue();
                        if (args2 != null) {
                            return new PaymentAuthWebViewActivityViewModel.Factory(application, logger, args2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                }
            }
        });
        final int i2 = 1;
        this._args$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$$ExternalSyntheticLambda0
            public final /* synthetic */ PaymentAuthWebViewActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PaymentAuthWebViewActivity paymentAuthWebViewActivity = this.f$0;
                switch (i22) {
                    case 0:
                        int i3 = PaymentAuthWebViewActivity.$r8$clinit;
                        View inflate = paymentAuthWebViewActivity.getLayoutInflater().inflate(R.layout.stripe_payment_auth_web_view_activity, (ViewGroup) null, false);
                        int i4 = R.id.app_bar;
                        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(inflate, R.id.app_bar);
                        if (appBarLayout != null) {
                            i4 = R.id.progress_bar;
                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(inflate, R.id.progress_bar);
                            if (circularProgressIndicator != null) {
                                i4 = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(inflate, R.id.toolbar);
                                if (toolbar != null) {
                                    i4 = R.id.web_view;
                                    PaymentAuthWebView paymentAuthWebView = (PaymentAuthWebView) ViewBindings.findChildViewById(inflate, R.id.web_view);
                                    if (paymentAuthWebView != null) {
                                        i4 = R.id.web_view_container;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.web_view_container);
                                        if (frameLayout != null) {
                                            return new StripePaymentAuthWebViewActivityBinding((CoordinatorLayout) inflate, appBarLayout, circularProgressIndicator, toolbar, paymentAuthWebView, frameLayout);
                                        }
                                    }
                                }
                            }
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = PaymentAuthWebViewActivity.$r8$clinit;
                        Intent intent = paymentAuthWebViewActivity.getIntent();
                        intent.getClass();
                        return (PaymentBrowserAuthContract.Args) intent.getParcelableExtra("extra_args");
                    case 2:
                        int i6 = PaymentAuthWebViewActivity.$r8$clinit;
                        PaymentBrowserAuthContract.Args args = (PaymentBrowserAuthContract.Args) paymentAuthWebViewActivity._args$delegate.getValue();
                        return (args == null || !args.enableLogging) ? Logger$Companion.NOOP_LOGGER : Logger$Companion.REAL_LOGGER;
                    default:
                        int i7 = PaymentAuthWebViewActivity.$r8$clinit;
                        Application application = paymentAuthWebViewActivity.getApplication();
                        application.getClass();
                        Logger$Companion$NOOP_LOGGER$1 logger = paymentAuthWebViewActivity.getLogger();
                        PaymentBrowserAuthContract.Args args2 = (PaymentBrowserAuthContract.Args) paymentAuthWebViewActivity._args$delegate.getValue();
                        if (args2 != null) {
                            return new PaymentAuthWebViewActivityViewModel.Factory(application, logger, args2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                }
            }
        });
        final int i3 = 2;
        this.logger$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$$ExternalSyntheticLambda0
            public final /* synthetic */ PaymentAuthWebViewActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PaymentAuthWebViewActivity paymentAuthWebViewActivity = this.f$0;
                switch (i22) {
                    case 0:
                        int i32 = PaymentAuthWebViewActivity.$r8$clinit;
                        View inflate = paymentAuthWebViewActivity.getLayoutInflater().inflate(R.layout.stripe_payment_auth_web_view_activity, (ViewGroup) null, false);
                        int i4 = R.id.app_bar;
                        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(inflate, R.id.app_bar);
                        if (appBarLayout != null) {
                            i4 = R.id.progress_bar;
                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(inflate, R.id.progress_bar);
                            if (circularProgressIndicator != null) {
                                i4 = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(inflate, R.id.toolbar);
                                if (toolbar != null) {
                                    i4 = R.id.web_view;
                                    PaymentAuthWebView paymentAuthWebView = (PaymentAuthWebView) ViewBindings.findChildViewById(inflate, R.id.web_view);
                                    if (paymentAuthWebView != null) {
                                        i4 = R.id.web_view_container;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.web_view_container);
                                        if (frameLayout != null) {
                                            return new StripePaymentAuthWebViewActivityBinding((CoordinatorLayout) inflate, appBarLayout, circularProgressIndicator, toolbar, paymentAuthWebView, frameLayout);
                                        }
                                    }
                                }
                            }
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = PaymentAuthWebViewActivity.$r8$clinit;
                        Intent intent = paymentAuthWebViewActivity.getIntent();
                        intent.getClass();
                        return (PaymentBrowserAuthContract.Args) intent.getParcelableExtra("extra_args");
                    case 2:
                        int i6 = PaymentAuthWebViewActivity.$r8$clinit;
                        PaymentBrowserAuthContract.Args args = (PaymentBrowserAuthContract.Args) paymentAuthWebViewActivity._args$delegate.getValue();
                        return (args == null || !args.enableLogging) ? Logger$Companion.NOOP_LOGGER : Logger$Companion.REAL_LOGGER;
                    default:
                        int i7 = PaymentAuthWebViewActivity.$r8$clinit;
                        Application application = paymentAuthWebViewActivity.getApplication();
                        application.getClass();
                        Logger$Companion$NOOP_LOGGER$1 logger = paymentAuthWebViewActivity.getLogger();
                        PaymentBrowserAuthContract.Args args2 = (PaymentBrowserAuthContract.Args) paymentAuthWebViewActivity._args$delegate.getValue();
                        if (args2 != null) {
                            return new PaymentAuthWebViewActivityViewModel.Factory(application, logger, args2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                }
            }
        });
        final int i4 = 3;
        this.viewModel$delegate = new ViewModelLazy(Reflection.factory.getOrCreateKotlinClass(PaymentAuthWebViewActivityViewModel.class), new Function0(this) { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ PaymentAuthWebViewActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                PaymentAuthWebViewActivity paymentAuthWebViewActivity = this.$this_viewModels;
                switch (i5) {
                    case 0:
                        return paymentAuthWebViewActivity.getViewModelStore();
                    default:
                        return paymentAuthWebViewActivity.getDefaultViewModelCreationExtras();
                }
            }
        }, new Function0(this) { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$$ExternalSyntheticLambda0
            public final /* synthetic */ PaymentAuthWebViewActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                PaymentAuthWebViewActivity paymentAuthWebViewActivity = this.f$0;
                switch (i22) {
                    case 0:
                        int i32 = PaymentAuthWebViewActivity.$r8$clinit;
                        View inflate = paymentAuthWebViewActivity.getLayoutInflater().inflate(R.layout.stripe_payment_auth_web_view_activity, (ViewGroup) null, false);
                        int i42 = R.id.app_bar;
                        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(inflate, R.id.app_bar);
                        if (appBarLayout != null) {
                            i42 = R.id.progress_bar;
                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(inflate, R.id.progress_bar);
                            if (circularProgressIndicator != null) {
                                i42 = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(inflate, R.id.toolbar);
                                if (toolbar != null) {
                                    i42 = R.id.web_view;
                                    PaymentAuthWebView paymentAuthWebView = (PaymentAuthWebView) ViewBindings.findChildViewById(inflate, R.id.web_view);
                                    if (paymentAuthWebView != null) {
                                        i42 = R.id.web_view_container;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.web_view_container);
                                        if (frameLayout != null) {
                                            return new StripePaymentAuthWebViewActivityBinding((CoordinatorLayout) inflate, appBarLayout, circularProgressIndicator, toolbar, paymentAuthWebView, frameLayout);
                                        }
                                    }
                                }
                            }
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i42)));
                        return null;
                    case 1:
                        int i5 = PaymentAuthWebViewActivity.$r8$clinit;
                        Intent intent = paymentAuthWebViewActivity.getIntent();
                        intent.getClass();
                        return (PaymentBrowserAuthContract.Args) intent.getParcelableExtra("extra_args");
                    case 2:
                        int i6 = PaymentAuthWebViewActivity.$r8$clinit;
                        PaymentBrowserAuthContract.Args args = (PaymentBrowserAuthContract.Args) paymentAuthWebViewActivity._args$delegate.getValue();
                        return (args == null || !args.enableLogging) ? Logger$Companion.NOOP_LOGGER : Logger$Companion.REAL_LOGGER;
                    default:
                        int i7 = PaymentAuthWebViewActivity.$r8$clinit;
                        Application application = paymentAuthWebViewActivity.getApplication();
                        application.getClass();
                        Logger$Companion$NOOP_LOGGER$1 logger = paymentAuthWebViewActivity.getLogger();
                        PaymentBrowserAuthContract.Args args2 = (PaymentBrowserAuthContract.Args) paymentAuthWebViewActivity._args$delegate.getValue();
                        if (args2 != null) {
                            return new PaymentAuthWebViewActivityViewModel.Factory(application, logger, args2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                }
            }
        }, new Function0(this) { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ PaymentAuthWebViewActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                PaymentAuthWebViewActivity paymentAuthWebViewActivity = this.$this_viewModels;
                switch (i5) {
                    case 0:
                        return paymentAuthWebViewActivity.getViewModelStore();
                    default:
                        return paymentAuthWebViewActivity.getDefaultViewModelCreationExtras();
                }
            }
        });
    }

    public final void cancelIntentSource() {
        PaymentAuthWebViewActivityViewModel viewModel = getViewModel();
        Intent intent = new Intent();
        String str = viewModel.getPaymentResult$payments_core_release().clientSecret;
        PaymentBrowserAuthContract.Args args = viewModel.args;
        int i = args.shouldCancelIntentOnUserNavigation ? 3 : 0;
        StripeException stripeException = viewModel.getPaymentResult$payments_core_release().exception;
        boolean z = args.shouldCancelSource;
        String str2 = viewModel.getPaymentResult$payments_core_release().sourceId;
        viewModel.getPaymentResult$payments_core_release();
        Intent putExtras = intent.putExtras(new PaymentFlowResult$Unvalidated(str, i, stripeException, z, str2, (Source) null, viewModel.getPaymentResult$payments_core_release().stripeAccountId).toBundle());
        putExtras.getClass();
        setResult(-1, putExtras);
        finish();
    }

    public final Logger$Companion$NOOP_LOGGER$1 getLogger() {
        return (Logger$Companion$NOOP_LOGGER$1) this.logger$delegate.getValue();
    }

    public final StripePaymentAuthWebViewActivityBinding getViewBinding() {
        return (StripePaymentAuthWebViewActivityBinding) this.viewBinding$delegate.getValue();
    }

    public final PaymentAuthWebViewActivityViewModel getViewModel() {
        return (PaymentAuthWebViewActivityViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Trace.setDecorFitsSystemWindows(getWindow(), false);
        CoordinatorLayout coordinatorLayout = getViewBinding().rootView;
        int i = 27;
        MaterialButton$$ExternalSyntheticLambda3 materialButton$$ExternalSyntheticLambda3 = new MaterialButton$$ExternalSyntheticLambda3(this, i);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(coordinatorLayout, materialButton$$ExternalSyntheticLambda3);
        PaymentBrowserAuthContract.Args args = (PaymentBrowserAuthContract.Args) this._args$delegate.getValue();
        int i2 = 14;
        int i3 = 6;
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = Logger$Companion.NOOP_LOGGER;
        ?? r5 = 0;
        EmptyMap emptyMap = null;
        if (args == null) {
            setResult(0);
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
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(applicationContext2, new CameraX$$ExternalSyntheticLambda0(applicationContext2, i2), emptySet);
            ErrorReporter$ExpectedErrorEvent errorReporter$ExpectedErrorEvent = ErrorReporter$ExpectedErrorEvent.AUTH_WEB_VIEW_NULL_ARGS;
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
        getLogger().debug("PaymentAuthWebViewActivity#onCreate()");
        setContentView(getViewBinding().rootView);
        setSupportActionBar(getViewBinding().toolbar);
        getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar()");
        PaymentAuthWebViewActivityViewModel.ToolbarTitleData toolbarTitleData = getViewModel().toolbarTitle;
        if (toolbarTitleData != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar title");
            getViewBinding().toolbar.setTitle(CustomizeUtils.buildStyledText(this, toolbarTitleData.text, toolbarTitleData.toolbarCustomization));
        }
        String str = getViewModel().toolbarBackgroundColor;
        if (str != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar background color");
            int parseColor = Color.parseColor(str);
            getViewBinding().toolbar.setBackgroundColor(parseColor);
            if (Build.VERSION.SDK_INT <= 34) {
                getWindow().setStatusBarColor(parseColor);
            }
        }
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), null, new HCaptcha$$ExternalSyntheticLambda2(this, i3), 3);
        String str2 = args.clientSecret;
        Intent putExtras = new Intent().putExtras(getViewModel().getPaymentResult$payments_core_release().toBundle());
        putExtras.getClass();
        setResult(-1, putExtras);
        if (StringsKt.isBlank(str2)) {
            getLogger().debug("PaymentAuthWebViewActivity#onCreate() - clientSecret is blank");
            finish();
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
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory2 = new PaymentAnalyticsRequestFactory(applicationContext4, new CameraX$$ExternalSyntheticLambda0(applicationContext4, i2), emptySet2);
            ErrorReporter$UnexpectedErrorEvent errorReporter$UnexpectedErrorEvent = ErrorReporter$UnexpectedErrorEvent.AUTH_WEB_VIEW_BLANK_CLIENT_SECRET;
            if ((6 & 4) != 0) {
                EmptyMap emptyMap3 = EmptyMap.INSTANCE;
                emptyMap3.getClass();
                r5 = emptyMap3;
            }
            r5.getClass();
            EmptyMap emptyMap4 = EmptyMap.INSTANCE;
            emptyMap4.getClass();
            defaultAnalyticsRequestExecutor2.executeAsync(paymentAnalyticsRequestFactory2.createRequest(errorReporter$UnexpectedErrorEvent, MapsKt__MapsKt.plus(emptyMap4, (Map) r5)));
            return;
        }
        getLogger().debug("PaymentAuthWebViewActivity#onCreate() - PaymentAuthWebView init and loadUrl");
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
        JobKt.launch$default(ViewModelKt.getCoroutineScope(getLifecycle()), null, null, new ShimmerModifierKt$shimmer$1$1(MutableStateFlow, this, r5, 25), 3);
        int i4 = 0;
        int i5 = 1;
        PaymentAuthWebViewClient paymentAuthWebViewClient = new PaymentAuthWebViewClient(getLogger(), MutableStateFlow, str2, args.returnUrl, new TextFieldUIKt$TextField$4$1(i5, this, PaymentAuthWebViewActivity.class, "startActivity", "startActivity(Landroid/content/Intent;)V", i4, 23), new TextFieldUIKt$TextField$4$1(i5, this, PaymentAuthWebViewActivity.class, "onAuthComplete", "onAuthComplete$payments_core_release(Ljava/lang/Throwable;)V", i4, 24));
        getViewBinding().webView.setOnLoadBlank$payments_core_release(new HCaptcha$$ExternalSyntheticLambda0(paymentAuthWebViewClient, i));
        getViewBinding().webView.setWebViewClient(paymentAuthWebViewClient);
        getViewBinding().webView.setWebChromeClient(new PaymentAuthWebChromeClient(this, getLogger()));
        PaymentAuthWebViewActivityViewModel viewModel = getViewModel();
        AnalyticsRequest createRequest$payments_core_release$default = PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(viewModel.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeStart, null, null, null, null, 62);
        DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor3 = viewModel.analyticsRequestExecutor;
        defaultAnalyticsRequestExecutor3.executeAsync(createRequest$payments_core_release$default);
        defaultAnalyticsRequestExecutor3.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(viewModel.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthWithWebView, null, null, null, null, 62));
        getViewBinding().webView.loadUrl(args.url, (Map) getViewModel().extraHeaders$delegate.getValue());
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getLogger().debug("PaymentAuthWebViewActivity#onCreateOptionsMenu()");
        getMenuInflater().inflate(R.menu.stripe_payment_auth_web_view_menu, menu);
        String str = getViewModel().buttonText;
        if (str != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating close button text");
            menu.findItem(R.id.action_close).setTitle(str);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        getViewBinding().webViewContainer.removeAllViews();
        getViewBinding().webView.destroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        getLogger().debug("PaymentAuthWebViewActivity#onOptionsItemSelected()");
        if (menuItem.getItemId() != R.id.action_close) {
            return super.onOptionsItemSelected(menuItem);
        }
        cancelIntentSource();
        return true;
    }
}
