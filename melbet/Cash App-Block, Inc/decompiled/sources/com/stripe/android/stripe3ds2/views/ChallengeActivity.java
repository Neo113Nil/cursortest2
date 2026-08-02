package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.os.BundleKt;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.viewbinding.ViewBindings;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.checks.CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda11;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeActivityBinding;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization$ButtonType;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.observability.Stripe3ds2ErrorReporterConfig;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.DefaultTransactionTimer;
import com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.stripe3ds2.utils.ImageCache$Default;
import com.stripe.android.stripe3ds2.views.ChallengeSubmitDialogFactory;
import com.stripe.android.view.PaymentAuthWebViewActivityViewModel;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import dev.chrisbanes.haze.Pool;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class ChallengeActivity extends AppCompatActivity {
    public static final DefaultIoScheduler WORK_CONTEXT;
    public final Lazy challengeActionHandler$delegate;
    public ChallengeResponseData currentChallengeResponseData;
    public final Lazy errorReporter$delegate;
    public final Lazy errorRequestExecutor$delegate;
    public final Lazy fragment$delegate;
    public final Lazy fragmentViewBinding$delegate;
    public final Lazy keyboardController$delegate;
    public ChallengeSubmitDialogFactory.ChallengeSubmitDialog progressDialog;
    public final Lazy progressDialogFactory$delegate;
    public final Lazy transactionTimer$delegate;
    public final Lazy viewArgs$delegate;
    public final Lazy viewBinding$delegate;
    public final ViewModelLazy viewModel$delegate;

    static {
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        WORK_CONTEXT = DefaultIoScheduler.INSTANCE;
    }

    public ChallengeActivity() {
        final int i = 0;
        this.transactionTimer$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda4
            public final /* synthetic */ ChallengeActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Fragment fragment;
                FragmentActivity fragmentActivity;
                FragmentManager supportFragmentManager;
                int i2 = i;
                ChallengeActivity challengeActivity = this.f$0;
                switch (i2) {
                    case 0:
                        DefaultIoScheduler defaultIoScheduler = ChallengeActivity.WORK_CONTEXT;
                        return new DefaultTransactionTimer(challengeActivity.getViewArgs().timeoutMins, (StripeErrorRequestExecutor) challengeActivity.errorRequestExecutor$delegate.getValue(), challengeActivity.getViewArgs().creqData);
                    case 1:
                        DefaultIoScheduler defaultIoScheduler2 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeActionHandler$Default(challengeActivity.getViewArgs().creqData, (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue(), challengeActivity.getViewArgs().creqExecutorFactory, ChallengeActivity.WORK_CONTEXT);
                    case 2:
                        DefaultIoScheduler defaultIoScheduler3 = ChallengeActivity.WORK_CONTEXT;
                        defaultIoScheduler3.getClass();
                        String str = challengeActivity.getViewArgs().creqExecutorConfig.acsUrl;
                        DefaultErrorReporter defaultErrorReporter = (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue();
                        str.getClass();
                        defaultErrorReporter.getClass();
                        TextSetter textSetter = new TextSetter(str, defaultErrorReporter, (CoroutineContext) defaultIoScheduler3);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        return new StripeErrorRequestExecutor(textSetter, defaultErrorReporter, DefaultIoScheduler.INSTANCE);
                    case 3:
                        DefaultIoScheduler defaultIoScheduler4 = ChallengeActivity.WORK_CONTEXT;
                        return new PaymentAuthWebViewActivityViewModel.Factory((ChallengeActionHandler$Default) challengeActivity.challengeActionHandler$delegate.getValue(), (DefaultTransactionTimer) challengeActivity.transactionTimer$delegate.getValue(), (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue());
                    case 4:
                        DefaultIoScheduler defaultIoScheduler5 = ChallengeActivity.WORK_CONTEXT;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        extras.getClass();
                        Object parcelable = SizeKt.getParcelable(extras, "extra_args", ChallengeViewArgs.class);
                        if (parcelable != null) {
                            return (ChallengeViewArgs) parcelable;
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    case 5:
                        DefaultIoScheduler defaultIoScheduler6 = ChallengeActivity.WORK_CONTEXT;
                        return new KeyboardController(challengeActivity);
                    case 6:
                        DefaultIoScheduler defaultIoScheduler7 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeSubmitDialogFactory(challengeActivity, challengeActivity.getViewArgs().uiCustomization);
                    case 7:
                        DefaultIoScheduler defaultIoScheduler8 = ChallengeActivity.WORK_CONTEXT;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        applicationContext.getClass();
                        return new DefaultErrorReporter(applicationContext, new Stripe3ds2ErrorReporterConfig(challengeActivity.getViewArgs().creqData.sdkTransId), null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    case 8:
                        DefaultIoScheduler defaultIoScheduler9 = ChallengeActivity.WORK_CONTEXT;
                        FragmentContainerView fragmentContainerView = ((StripeChallengeActivityBinding) challengeActivity.viewBinding$delegate.getValue()).fragmentContainer;
                        View view = fragmentContainerView;
                        while (true) {
                            if (view != null) {
                                Object tag = view.getTag(R.id.fragment_container_view_tag);
                                fragment = tag instanceof Fragment ? (Fragment) tag : null;
                                if (fragment == null) {
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                fragment = null;
                            }
                        }
                        if (fragment == null) {
                            Context context = fragmentContainerView.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    fragmentActivity = null;
                                } else if (context instanceof FragmentActivity) {
                                    fragmentActivity = (FragmentActivity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (fragmentActivity == null) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("View ", fragmentContainerView, " is not within a subclass of FragmentActivity.");
                                return null;
                            }
                            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        } else {
                            if (!fragment.isAdded()) {
                                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + fragmentContainerView + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                            }
                            supportFragmentManager = fragment.getChildFragmentManager();
                        }
                        return (ChallengeFragment) supportFragmentManager.findFragmentById(fragmentContainerView.getId());
                    case 9:
                        return ((ChallengeFragment) challengeActivity.fragment$delegate.getValue()).getViewBinding$3ds2sdk_release();
                    default:
                        DefaultIoScheduler defaultIoScheduler10 = ChallengeActivity.WORK_CONTEXT;
                        View inflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(inflate, R.id.fragment_container);
                        if (fragmentContainerView2 != null) {
                            return new StripeChallengeActivityBinding((FrameLayout) inflate, fragmentContainerView2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.fragment_container)));
                        return null;
                }
            }
        });
        final int i2 = 7;
        this.errorReporter$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda4
            public final /* synthetic */ ChallengeActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Fragment fragment;
                FragmentActivity fragmentActivity;
                FragmentManager supportFragmentManager;
                int i22 = i2;
                ChallengeActivity challengeActivity = this.f$0;
                switch (i22) {
                    case 0:
                        DefaultIoScheduler defaultIoScheduler = ChallengeActivity.WORK_CONTEXT;
                        return new DefaultTransactionTimer(challengeActivity.getViewArgs().timeoutMins, (StripeErrorRequestExecutor) challengeActivity.errorRequestExecutor$delegate.getValue(), challengeActivity.getViewArgs().creqData);
                    case 1:
                        DefaultIoScheduler defaultIoScheduler2 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeActionHandler$Default(challengeActivity.getViewArgs().creqData, (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue(), challengeActivity.getViewArgs().creqExecutorFactory, ChallengeActivity.WORK_CONTEXT);
                    case 2:
                        DefaultIoScheduler defaultIoScheduler3 = ChallengeActivity.WORK_CONTEXT;
                        defaultIoScheduler3.getClass();
                        String str = challengeActivity.getViewArgs().creqExecutorConfig.acsUrl;
                        DefaultErrorReporter defaultErrorReporter = (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue();
                        str.getClass();
                        defaultErrorReporter.getClass();
                        TextSetter textSetter = new TextSetter(str, defaultErrorReporter, (CoroutineContext) defaultIoScheduler3);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        return new StripeErrorRequestExecutor(textSetter, defaultErrorReporter, DefaultIoScheduler.INSTANCE);
                    case 3:
                        DefaultIoScheduler defaultIoScheduler4 = ChallengeActivity.WORK_CONTEXT;
                        return new PaymentAuthWebViewActivityViewModel.Factory((ChallengeActionHandler$Default) challengeActivity.challengeActionHandler$delegate.getValue(), (DefaultTransactionTimer) challengeActivity.transactionTimer$delegate.getValue(), (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue());
                    case 4:
                        DefaultIoScheduler defaultIoScheduler5 = ChallengeActivity.WORK_CONTEXT;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        extras.getClass();
                        Object parcelable = SizeKt.getParcelable(extras, "extra_args", ChallengeViewArgs.class);
                        if (parcelable != null) {
                            return (ChallengeViewArgs) parcelable;
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    case 5:
                        DefaultIoScheduler defaultIoScheduler6 = ChallengeActivity.WORK_CONTEXT;
                        return new KeyboardController(challengeActivity);
                    case 6:
                        DefaultIoScheduler defaultIoScheduler7 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeSubmitDialogFactory(challengeActivity, challengeActivity.getViewArgs().uiCustomization);
                    case 7:
                        DefaultIoScheduler defaultIoScheduler8 = ChallengeActivity.WORK_CONTEXT;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        applicationContext.getClass();
                        return new DefaultErrorReporter(applicationContext, new Stripe3ds2ErrorReporterConfig(challengeActivity.getViewArgs().creqData.sdkTransId), null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    case 8:
                        DefaultIoScheduler defaultIoScheduler9 = ChallengeActivity.WORK_CONTEXT;
                        FragmentContainerView fragmentContainerView = ((StripeChallengeActivityBinding) challengeActivity.viewBinding$delegate.getValue()).fragmentContainer;
                        View view = fragmentContainerView;
                        while (true) {
                            if (view != null) {
                                Object tag = view.getTag(R.id.fragment_container_view_tag);
                                fragment = tag instanceof Fragment ? (Fragment) tag : null;
                                if (fragment == null) {
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                fragment = null;
                            }
                        }
                        if (fragment == null) {
                            Context context = fragmentContainerView.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    fragmentActivity = null;
                                } else if (context instanceof FragmentActivity) {
                                    fragmentActivity = (FragmentActivity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (fragmentActivity == null) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("View ", fragmentContainerView, " is not within a subclass of FragmentActivity.");
                                return null;
                            }
                            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        } else {
                            if (!fragment.isAdded()) {
                                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + fragmentContainerView + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                            }
                            supportFragmentManager = fragment.getChildFragmentManager();
                        }
                        return (ChallengeFragment) supportFragmentManager.findFragmentById(fragmentContainerView.getId());
                    case 9:
                        return ((ChallengeFragment) challengeActivity.fragment$delegate.getValue()).getViewBinding$3ds2sdk_release();
                    default:
                        DefaultIoScheduler defaultIoScheduler10 = ChallengeActivity.WORK_CONTEXT;
                        View inflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(inflate, R.id.fragment_container);
                        if (fragmentContainerView2 != null) {
                            return new StripeChallengeActivityBinding((FrameLayout) inflate, fragmentContainerView2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.fragment_container)));
                        return null;
                }
            }
        });
        final int i3 = 8;
        this.fragment$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda4
            public final /* synthetic */ ChallengeActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Fragment fragment;
                FragmentActivity fragmentActivity;
                FragmentManager supportFragmentManager;
                int i22 = i3;
                ChallengeActivity challengeActivity = this.f$0;
                switch (i22) {
                    case 0:
                        DefaultIoScheduler defaultIoScheduler = ChallengeActivity.WORK_CONTEXT;
                        return new DefaultTransactionTimer(challengeActivity.getViewArgs().timeoutMins, (StripeErrorRequestExecutor) challengeActivity.errorRequestExecutor$delegate.getValue(), challengeActivity.getViewArgs().creqData);
                    case 1:
                        DefaultIoScheduler defaultIoScheduler2 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeActionHandler$Default(challengeActivity.getViewArgs().creqData, (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue(), challengeActivity.getViewArgs().creqExecutorFactory, ChallengeActivity.WORK_CONTEXT);
                    case 2:
                        DefaultIoScheduler defaultIoScheduler3 = ChallengeActivity.WORK_CONTEXT;
                        defaultIoScheduler3.getClass();
                        String str = challengeActivity.getViewArgs().creqExecutorConfig.acsUrl;
                        DefaultErrorReporter defaultErrorReporter = (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue();
                        str.getClass();
                        defaultErrorReporter.getClass();
                        TextSetter textSetter = new TextSetter(str, defaultErrorReporter, (CoroutineContext) defaultIoScheduler3);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        return new StripeErrorRequestExecutor(textSetter, defaultErrorReporter, DefaultIoScheduler.INSTANCE);
                    case 3:
                        DefaultIoScheduler defaultIoScheduler4 = ChallengeActivity.WORK_CONTEXT;
                        return new PaymentAuthWebViewActivityViewModel.Factory((ChallengeActionHandler$Default) challengeActivity.challengeActionHandler$delegate.getValue(), (DefaultTransactionTimer) challengeActivity.transactionTimer$delegate.getValue(), (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue());
                    case 4:
                        DefaultIoScheduler defaultIoScheduler5 = ChallengeActivity.WORK_CONTEXT;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        extras.getClass();
                        Object parcelable = SizeKt.getParcelable(extras, "extra_args", ChallengeViewArgs.class);
                        if (parcelable != null) {
                            return (ChallengeViewArgs) parcelable;
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    case 5:
                        DefaultIoScheduler defaultIoScheduler6 = ChallengeActivity.WORK_CONTEXT;
                        return new KeyboardController(challengeActivity);
                    case 6:
                        DefaultIoScheduler defaultIoScheduler7 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeSubmitDialogFactory(challengeActivity, challengeActivity.getViewArgs().uiCustomization);
                    case 7:
                        DefaultIoScheduler defaultIoScheduler8 = ChallengeActivity.WORK_CONTEXT;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        applicationContext.getClass();
                        return new DefaultErrorReporter(applicationContext, new Stripe3ds2ErrorReporterConfig(challengeActivity.getViewArgs().creqData.sdkTransId), null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    case 8:
                        DefaultIoScheduler defaultIoScheduler9 = ChallengeActivity.WORK_CONTEXT;
                        FragmentContainerView fragmentContainerView = ((StripeChallengeActivityBinding) challengeActivity.viewBinding$delegate.getValue()).fragmentContainer;
                        View view = fragmentContainerView;
                        while (true) {
                            if (view != null) {
                                Object tag = view.getTag(R.id.fragment_container_view_tag);
                                fragment = tag instanceof Fragment ? (Fragment) tag : null;
                                if (fragment == null) {
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                fragment = null;
                            }
                        }
                        if (fragment == null) {
                            Context context = fragmentContainerView.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    fragmentActivity = null;
                                } else if (context instanceof FragmentActivity) {
                                    fragmentActivity = (FragmentActivity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (fragmentActivity == null) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("View ", fragmentContainerView, " is not within a subclass of FragmentActivity.");
                                return null;
                            }
                            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        } else {
                            if (!fragment.isAdded()) {
                                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + fragmentContainerView + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                            }
                            supportFragmentManager = fragment.getChildFragmentManager();
                        }
                        return (ChallengeFragment) supportFragmentManager.findFragmentById(fragmentContainerView.getId());
                    case 9:
                        return ((ChallengeFragment) challengeActivity.fragment$delegate.getValue()).getViewBinding$3ds2sdk_release();
                    default:
                        DefaultIoScheduler defaultIoScheduler10 = ChallengeActivity.WORK_CONTEXT;
                        View inflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(inflate, R.id.fragment_container);
                        if (fragmentContainerView2 != null) {
                            return new StripeChallengeActivityBinding((FrameLayout) inflate, fragmentContainerView2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.fragment_container)));
                        return null;
                }
            }
        });
        final int i4 = 9;
        this.fragmentViewBinding$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda4
            public final /* synthetic */ ChallengeActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Fragment fragment;
                FragmentActivity fragmentActivity;
                FragmentManager supportFragmentManager;
                int i22 = i4;
                ChallengeActivity challengeActivity = this.f$0;
                switch (i22) {
                    case 0:
                        DefaultIoScheduler defaultIoScheduler = ChallengeActivity.WORK_CONTEXT;
                        return new DefaultTransactionTimer(challengeActivity.getViewArgs().timeoutMins, (StripeErrorRequestExecutor) challengeActivity.errorRequestExecutor$delegate.getValue(), challengeActivity.getViewArgs().creqData);
                    case 1:
                        DefaultIoScheduler defaultIoScheduler2 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeActionHandler$Default(challengeActivity.getViewArgs().creqData, (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue(), challengeActivity.getViewArgs().creqExecutorFactory, ChallengeActivity.WORK_CONTEXT);
                    case 2:
                        DefaultIoScheduler defaultIoScheduler3 = ChallengeActivity.WORK_CONTEXT;
                        defaultIoScheduler3.getClass();
                        String str = challengeActivity.getViewArgs().creqExecutorConfig.acsUrl;
                        DefaultErrorReporter defaultErrorReporter = (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue();
                        str.getClass();
                        defaultErrorReporter.getClass();
                        TextSetter textSetter = new TextSetter(str, defaultErrorReporter, (CoroutineContext) defaultIoScheduler3);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        return new StripeErrorRequestExecutor(textSetter, defaultErrorReporter, DefaultIoScheduler.INSTANCE);
                    case 3:
                        DefaultIoScheduler defaultIoScheduler4 = ChallengeActivity.WORK_CONTEXT;
                        return new PaymentAuthWebViewActivityViewModel.Factory((ChallengeActionHandler$Default) challengeActivity.challengeActionHandler$delegate.getValue(), (DefaultTransactionTimer) challengeActivity.transactionTimer$delegate.getValue(), (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue());
                    case 4:
                        DefaultIoScheduler defaultIoScheduler5 = ChallengeActivity.WORK_CONTEXT;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        extras.getClass();
                        Object parcelable = SizeKt.getParcelable(extras, "extra_args", ChallengeViewArgs.class);
                        if (parcelable != null) {
                            return (ChallengeViewArgs) parcelable;
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    case 5:
                        DefaultIoScheduler defaultIoScheduler6 = ChallengeActivity.WORK_CONTEXT;
                        return new KeyboardController(challengeActivity);
                    case 6:
                        DefaultIoScheduler defaultIoScheduler7 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeSubmitDialogFactory(challengeActivity, challengeActivity.getViewArgs().uiCustomization);
                    case 7:
                        DefaultIoScheduler defaultIoScheduler8 = ChallengeActivity.WORK_CONTEXT;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        applicationContext.getClass();
                        return new DefaultErrorReporter(applicationContext, new Stripe3ds2ErrorReporterConfig(challengeActivity.getViewArgs().creqData.sdkTransId), null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    case 8:
                        DefaultIoScheduler defaultIoScheduler9 = ChallengeActivity.WORK_CONTEXT;
                        FragmentContainerView fragmentContainerView = ((StripeChallengeActivityBinding) challengeActivity.viewBinding$delegate.getValue()).fragmentContainer;
                        View view = fragmentContainerView;
                        while (true) {
                            if (view != null) {
                                Object tag = view.getTag(R.id.fragment_container_view_tag);
                                fragment = tag instanceof Fragment ? (Fragment) tag : null;
                                if (fragment == null) {
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                fragment = null;
                            }
                        }
                        if (fragment == null) {
                            Context context = fragmentContainerView.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    fragmentActivity = null;
                                } else if (context instanceof FragmentActivity) {
                                    fragmentActivity = (FragmentActivity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (fragmentActivity == null) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("View ", fragmentContainerView, " is not within a subclass of FragmentActivity.");
                                return null;
                            }
                            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        } else {
                            if (!fragment.isAdded()) {
                                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + fragmentContainerView + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                            }
                            supportFragmentManager = fragment.getChildFragmentManager();
                        }
                        return (ChallengeFragment) supportFragmentManager.findFragmentById(fragmentContainerView.getId());
                    case 9:
                        return ((ChallengeFragment) challengeActivity.fragment$delegate.getValue()).getViewBinding$3ds2sdk_release();
                    default:
                        DefaultIoScheduler defaultIoScheduler10 = ChallengeActivity.WORK_CONTEXT;
                        View inflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(inflate, R.id.fragment_container);
                        if (fragmentContainerView2 != null) {
                            return new StripeChallengeActivityBinding((FrameLayout) inflate, fragmentContainerView2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.fragment_container)));
                        return null;
                }
            }
        });
        final int i5 = 10;
        this.viewBinding$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda4
            public final /* synthetic */ ChallengeActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Fragment fragment;
                FragmentActivity fragmentActivity;
                FragmentManager supportFragmentManager;
                int i22 = i5;
                ChallengeActivity challengeActivity = this.f$0;
                switch (i22) {
                    case 0:
                        DefaultIoScheduler defaultIoScheduler = ChallengeActivity.WORK_CONTEXT;
                        return new DefaultTransactionTimer(challengeActivity.getViewArgs().timeoutMins, (StripeErrorRequestExecutor) challengeActivity.errorRequestExecutor$delegate.getValue(), challengeActivity.getViewArgs().creqData);
                    case 1:
                        DefaultIoScheduler defaultIoScheduler2 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeActionHandler$Default(challengeActivity.getViewArgs().creqData, (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue(), challengeActivity.getViewArgs().creqExecutorFactory, ChallengeActivity.WORK_CONTEXT);
                    case 2:
                        DefaultIoScheduler defaultIoScheduler3 = ChallengeActivity.WORK_CONTEXT;
                        defaultIoScheduler3.getClass();
                        String str = challengeActivity.getViewArgs().creqExecutorConfig.acsUrl;
                        DefaultErrorReporter defaultErrorReporter = (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue();
                        str.getClass();
                        defaultErrorReporter.getClass();
                        TextSetter textSetter = new TextSetter(str, defaultErrorReporter, (CoroutineContext) defaultIoScheduler3);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        return new StripeErrorRequestExecutor(textSetter, defaultErrorReporter, DefaultIoScheduler.INSTANCE);
                    case 3:
                        DefaultIoScheduler defaultIoScheduler4 = ChallengeActivity.WORK_CONTEXT;
                        return new PaymentAuthWebViewActivityViewModel.Factory((ChallengeActionHandler$Default) challengeActivity.challengeActionHandler$delegate.getValue(), (DefaultTransactionTimer) challengeActivity.transactionTimer$delegate.getValue(), (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue());
                    case 4:
                        DefaultIoScheduler defaultIoScheduler5 = ChallengeActivity.WORK_CONTEXT;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        extras.getClass();
                        Object parcelable = SizeKt.getParcelable(extras, "extra_args", ChallengeViewArgs.class);
                        if (parcelable != null) {
                            return (ChallengeViewArgs) parcelable;
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    case 5:
                        DefaultIoScheduler defaultIoScheduler6 = ChallengeActivity.WORK_CONTEXT;
                        return new KeyboardController(challengeActivity);
                    case 6:
                        DefaultIoScheduler defaultIoScheduler7 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeSubmitDialogFactory(challengeActivity, challengeActivity.getViewArgs().uiCustomization);
                    case 7:
                        DefaultIoScheduler defaultIoScheduler8 = ChallengeActivity.WORK_CONTEXT;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        applicationContext.getClass();
                        return new DefaultErrorReporter(applicationContext, new Stripe3ds2ErrorReporterConfig(challengeActivity.getViewArgs().creqData.sdkTransId), null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    case 8:
                        DefaultIoScheduler defaultIoScheduler9 = ChallengeActivity.WORK_CONTEXT;
                        FragmentContainerView fragmentContainerView = ((StripeChallengeActivityBinding) challengeActivity.viewBinding$delegate.getValue()).fragmentContainer;
                        View view = fragmentContainerView;
                        while (true) {
                            if (view != null) {
                                Object tag = view.getTag(R.id.fragment_container_view_tag);
                                fragment = tag instanceof Fragment ? (Fragment) tag : null;
                                if (fragment == null) {
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                fragment = null;
                            }
                        }
                        if (fragment == null) {
                            Context context = fragmentContainerView.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    fragmentActivity = null;
                                } else if (context instanceof FragmentActivity) {
                                    fragmentActivity = (FragmentActivity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (fragmentActivity == null) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("View ", fragmentContainerView, " is not within a subclass of FragmentActivity.");
                                return null;
                            }
                            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        } else {
                            if (!fragment.isAdded()) {
                                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + fragmentContainerView + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                            }
                            supportFragmentManager = fragment.getChildFragmentManager();
                        }
                        return (ChallengeFragment) supportFragmentManager.findFragmentById(fragmentContainerView.getId());
                    case 9:
                        return ((ChallengeFragment) challengeActivity.fragment$delegate.getValue()).getViewBinding$3ds2sdk_release();
                    default:
                        DefaultIoScheduler defaultIoScheduler10 = ChallengeActivity.WORK_CONTEXT;
                        View inflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(inflate, R.id.fragment_container);
                        if (fragmentContainerView2 != null) {
                            return new StripeChallengeActivityBinding((FrameLayout) inflate, fragmentContainerView2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.fragment_container)));
                        return null;
                }
            }
        });
        final int i6 = 1;
        this.challengeActionHandler$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda4
            public final /* synthetic */ ChallengeActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Fragment fragment;
                FragmentActivity fragmentActivity;
                FragmentManager supportFragmentManager;
                int i22 = i6;
                ChallengeActivity challengeActivity = this.f$0;
                switch (i22) {
                    case 0:
                        DefaultIoScheduler defaultIoScheduler = ChallengeActivity.WORK_CONTEXT;
                        return new DefaultTransactionTimer(challengeActivity.getViewArgs().timeoutMins, (StripeErrorRequestExecutor) challengeActivity.errorRequestExecutor$delegate.getValue(), challengeActivity.getViewArgs().creqData);
                    case 1:
                        DefaultIoScheduler defaultIoScheduler2 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeActionHandler$Default(challengeActivity.getViewArgs().creqData, (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue(), challengeActivity.getViewArgs().creqExecutorFactory, ChallengeActivity.WORK_CONTEXT);
                    case 2:
                        DefaultIoScheduler defaultIoScheduler3 = ChallengeActivity.WORK_CONTEXT;
                        defaultIoScheduler3.getClass();
                        String str = challengeActivity.getViewArgs().creqExecutorConfig.acsUrl;
                        DefaultErrorReporter defaultErrorReporter = (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue();
                        str.getClass();
                        defaultErrorReporter.getClass();
                        TextSetter textSetter = new TextSetter(str, defaultErrorReporter, (CoroutineContext) defaultIoScheduler3);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        return new StripeErrorRequestExecutor(textSetter, defaultErrorReporter, DefaultIoScheduler.INSTANCE);
                    case 3:
                        DefaultIoScheduler defaultIoScheduler4 = ChallengeActivity.WORK_CONTEXT;
                        return new PaymentAuthWebViewActivityViewModel.Factory((ChallengeActionHandler$Default) challengeActivity.challengeActionHandler$delegate.getValue(), (DefaultTransactionTimer) challengeActivity.transactionTimer$delegate.getValue(), (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue());
                    case 4:
                        DefaultIoScheduler defaultIoScheduler5 = ChallengeActivity.WORK_CONTEXT;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        extras.getClass();
                        Object parcelable = SizeKt.getParcelable(extras, "extra_args", ChallengeViewArgs.class);
                        if (parcelable != null) {
                            return (ChallengeViewArgs) parcelable;
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    case 5:
                        DefaultIoScheduler defaultIoScheduler6 = ChallengeActivity.WORK_CONTEXT;
                        return new KeyboardController(challengeActivity);
                    case 6:
                        DefaultIoScheduler defaultIoScheduler7 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeSubmitDialogFactory(challengeActivity, challengeActivity.getViewArgs().uiCustomization);
                    case 7:
                        DefaultIoScheduler defaultIoScheduler8 = ChallengeActivity.WORK_CONTEXT;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        applicationContext.getClass();
                        return new DefaultErrorReporter(applicationContext, new Stripe3ds2ErrorReporterConfig(challengeActivity.getViewArgs().creqData.sdkTransId), null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    case 8:
                        DefaultIoScheduler defaultIoScheduler9 = ChallengeActivity.WORK_CONTEXT;
                        FragmentContainerView fragmentContainerView = ((StripeChallengeActivityBinding) challengeActivity.viewBinding$delegate.getValue()).fragmentContainer;
                        View view = fragmentContainerView;
                        while (true) {
                            if (view != null) {
                                Object tag = view.getTag(R.id.fragment_container_view_tag);
                                fragment = tag instanceof Fragment ? (Fragment) tag : null;
                                if (fragment == null) {
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                fragment = null;
                            }
                        }
                        if (fragment == null) {
                            Context context = fragmentContainerView.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    fragmentActivity = null;
                                } else if (context instanceof FragmentActivity) {
                                    fragmentActivity = (FragmentActivity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (fragmentActivity == null) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("View ", fragmentContainerView, " is not within a subclass of FragmentActivity.");
                                return null;
                            }
                            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        } else {
                            if (!fragment.isAdded()) {
                                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + fragmentContainerView + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                            }
                            supportFragmentManager = fragment.getChildFragmentManager();
                        }
                        return (ChallengeFragment) supportFragmentManager.findFragmentById(fragmentContainerView.getId());
                    case 9:
                        return ((ChallengeFragment) challengeActivity.fragment$delegate.getValue()).getViewBinding$3ds2sdk_release();
                    default:
                        DefaultIoScheduler defaultIoScheduler10 = ChallengeActivity.WORK_CONTEXT;
                        View inflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(inflate, R.id.fragment_container);
                        if (fragmentContainerView2 != null) {
                            return new StripeChallengeActivityBinding((FrameLayout) inflate, fragmentContainerView2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.fragment_container)));
                        return null;
                }
            }
        });
        final int i7 = 2;
        this.errorRequestExecutor$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda4
            public final /* synthetic */ ChallengeActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Fragment fragment;
                FragmentActivity fragmentActivity;
                FragmentManager supportFragmentManager;
                int i22 = i7;
                ChallengeActivity challengeActivity = this.f$0;
                switch (i22) {
                    case 0:
                        DefaultIoScheduler defaultIoScheduler = ChallengeActivity.WORK_CONTEXT;
                        return new DefaultTransactionTimer(challengeActivity.getViewArgs().timeoutMins, (StripeErrorRequestExecutor) challengeActivity.errorRequestExecutor$delegate.getValue(), challengeActivity.getViewArgs().creqData);
                    case 1:
                        DefaultIoScheduler defaultIoScheduler2 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeActionHandler$Default(challengeActivity.getViewArgs().creqData, (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue(), challengeActivity.getViewArgs().creqExecutorFactory, ChallengeActivity.WORK_CONTEXT);
                    case 2:
                        DefaultIoScheduler defaultIoScheduler3 = ChallengeActivity.WORK_CONTEXT;
                        defaultIoScheduler3.getClass();
                        String str = challengeActivity.getViewArgs().creqExecutorConfig.acsUrl;
                        DefaultErrorReporter defaultErrorReporter = (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue();
                        str.getClass();
                        defaultErrorReporter.getClass();
                        TextSetter textSetter = new TextSetter(str, defaultErrorReporter, (CoroutineContext) defaultIoScheduler3);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        return new StripeErrorRequestExecutor(textSetter, defaultErrorReporter, DefaultIoScheduler.INSTANCE);
                    case 3:
                        DefaultIoScheduler defaultIoScheduler4 = ChallengeActivity.WORK_CONTEXT;
                        return new PaymentAuthWebViewActivityViewModel.Factory((ChallengeActionHandler$Default) challengeActivity.challengeActionHandler$delegate.getValue(), (DefaultTransactionTimer) challengeActivity.transactionTimer$delegate.getValue(), (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue());
                    case 4:
                        DefaultIoScheduler defaultIoScheduler5 = ChallengeActivity.WORK_CONTEXT;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        extras.getClass();
                        Object parcelable = SizeKt.getParcelable(extras, "extra_args", ChallengeViewArgs.class);
                        if (parcelable != null) {
                            return (ChallengeViewArgs) parcelable;
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    case 5:
                        DefaultIoScheduler defaultIoScheduler6 = ChallengeActivity.WORK_CONTEXT;
                        return new KeyboardController(challengeActivity);
                    case 6:
                        DefaultIoScheduler defaultIoScheduler7 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeSubmitDialogFactory(challengeActivity, challengeActivity.getViewArgs().uiCustomization);
                    case 7:
                        DefaultIoScheduler defaultIoScheduler8 = ChallengeActivity.WORK_CONTEXT;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        applicationContext.getClass();
                        return new DefaultErrorReporter(applicationContext, new Stripe3ds2ErrorReporterConfig(challengeActivity.getViewArgs().creqData.sdkTransId), null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    case 8:
                        DefaultIoScheduler defaultIoScheduler9 = ChallengeActivity.WORK_CONTEXT;
                        FragmentContainerView fragmentContainerView = ((StripeChallengeActivityBinding) challengeActivity.viewBinding$delegate.getValue()).fragmentContainer;
                        View view = fragmentContainerView;
                        while (true) {
                            if (view != null) {
                                Object tag = view.getTag(R.id.fragment_container_view_tag);
                                fragment = tag instanceof Fragment ? (Fragment) tag : null;
                                if (fragment == null) {
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                fragment = null;
                            }
                        }
                        if (fragment == null) {
                            Context context = fragmentContainerView.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    fragmentActivity = null;
                                } else if (context instanceof FragmentActivity) {
                                    fragmentActivity = (FragmentActivity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (fragmentActivity == null) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("View ", fragmentContainerView, " is not within a subclass of FragmentActivity.");
                                return null;
                            }
                            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        } else {
                            if (!fragment.isAdded()) {
                                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + fragmentContainerView + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                            }
                            supportFragmentManager = fragment.getChildFragmentManager();
                        }
                        return (ChallengeFragment) supportFragmentManager.findFragmentById(fragmentContainerView.getId());
                    case 9:
                        return ((ChallengeFragment) challengeActivity.fragment$delegate.getValue()).getViewBinding$3ds2sdk_release();
                    default:
                        DefaultIoScheduler defaultIoScheduler10 = ChallengeActivity.WORK_CONTEXT;
                        View inflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(inflate, R.id.fragment_container);
                        if (fragmentContainerView2 != null) {
                            return new StripeChallengeActivityBinding((FrameLayout) inflate, fragmentContainerView2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.fragment_container)));
                        return null;
                }
            }
        });
        final int i8 = 3;
        this.viewModel$delegate = new ViewModelLazy(Reflection.factory.getOrCreateKotlinClass(ChallengeActivityViewModel.class), new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ ChallengeActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i9 = i;
                ChallengeActivity challengeActivity = this.$this_viewModels;
                switch (i9) {
                    case 0:
                        return challengeActivity.getViewModelStore();
                    default:
                        return challengeActivity.getDefaultViewModelCreationExtras();
                }
            }
        }, new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda4
            public final /* synthetic */ ChallengeActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Fragment fragment;
                FragmentActivity fragmentActivity;
                FragmentManager supportFragmentManager;
                int i22 = i8;
                ChallengeActivity challengeActivity = this.f$0;
                switch (i22) {
                    case 0:
                        DefaultIoScheduler defaultIoScheduler = ChallengeActivity.WORK_CONTEXT;
                        return new DefaultTransactionTimer(challengeActivity.getViewArgs().timeoutMins, (StripeErrorRequestExecutor) challengeActivity.errorRequestExecutor$delegate.getValue(), challengeActivity.getViewArgs().creqData);
                    case 1:
                        DefaultIoScheduler defaultIoScheduler2 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeActionHandler$Default(challengeActivity.getViewArgs().creqData, (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue(), challengeActivity.getViewArgs().creqExecutorFactory, ChallengeActivity.WORK_CONTEXT);
                    case 2:
                        DefaultIoScheduler defaultIoScheduler3 = ChallengeActivity.WORK_CONTEXT;
                        defaultIoScheduler3.getClass();
                        String str = challengeActivity.getViewArgs().creqExecutorConfig.acsUrl;
                        DefaultErrorReporter defaultErrorReporter = (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue();
                        str.getClass();
                        defaultErrorReporter.getClass();
                        TextSetter textSetter = new TextSetter(str, defaultErrorReporter, (CoroutineContext) defaultIoScheduler3);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        return new StripeErrorRequestExecutor(textSetter, defaultErrorReporter, DefaultIoScheduler.INSTANCE);
                    case 3:
                        DefaultIoScheduler defaultIoScheduler4 = ChallengeActivity.WORK_CONTEXT;
                        return new PaymentAuthWebViewActivityViewModel.Factory((ChallengeActionHandler$Default) challengeActivity.challengeActionHandler$delegate.getValue(), (DefaultTransactionTimer) challengeActivity.transactionTimer$delegate.getValue(), (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue());
                    case 4:
                        DefaultIoScheduler defaultIoScheduler5 = ChallengeActivity.WORK_CONTEXT;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        extras.getClass();
                        Object parcelable = SizeKt.getParcelable(extras, "extra_args", ChallengeViewArgs.class);
                        if (parcelable != null) {
                            return (ChallengeViewArgs) parcelable;
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    case 5:
                        DefaultIoScheduler defaultIoScheduler6 = ChallengeActivity.WORK_CONTEXT;
                        return new KeyboardController(challengeActivity);
                    case 6:
                        DefaultIoScheduler defaultIoScheduler7 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeSubmitDialogFactory(challengeActivity, challengeActivity.getViewArgs().uiCustomization);
                    case 7:
                        DefaultIoScheduler defaultIoScheduler8 = ChallengeActivity.WORK_CONTEXT;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        applicationContext.getClass();
                        return new DefaultErrorReporter(applicationContext, new Stripe3ds2ErrorReporterConfig(challengeActivity.getViewArgs().creqData.sdkTransId), null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    case 8:
                        DefaultIoScheduler defaultIoScheduler9 = ChallengeActivity.WORK_CONTEXT;
                        FragmentContainerView fragmentContainerView = ((StripeChallengeActivityBinding) challengeActivity.viewBinding$delegate.getValue()).fragmentContainer;
                        View view = fragmentContainerView;
                        while (true) {
                            if (view != null) {
                                Object tag = view.getTag(R.id.fragment_container_view_tag);
                                fragment = tag instanceof Fragment ? (Fragment) tag : null;
                                if (fragment == null) {
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                fragment = null;
                            }
                        }
                        if (fragment == null) {
                            Context context = fragmentContainerView.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    fragmentActivity = null;
                                } else if (context instanceof FragmentActivity) {
                                    fragmentActivity = (FragmentActivity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (fragmentActivity == null) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("View ", fragmentContainerView, " is not within a subclass of FragmentActivity.");
                                return null;
                            }
                            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        } else {
                            if (!fragment.isAdded()) {
                                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + fragmentContainerView + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                            }
                            supportFragmentManager = fragment.getChildFragmentManager();
                        }
                        return (ChallengeFragment) supportFragmentManager.findFragmentById(fragmentContainerView.getId());
                    case 9:
                        return ((ChallengeFragment) challengeActivity.fragment$delegate.getValue()).getViewBinding$3ds2sdk_release();
                    default:
                        DefaultIoScheduler defaultIoScheduler10 = ChallengeActivity.WORK_CONTEXT;
                        View inflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(inflate, R.id.fragment_container);
                        if (fragmentContainerView2 != null) {
                            return new StripeChallengeActivityBinding((FrameLayout) inflate, fragmentContainerView2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.fragment_container)));
                        return null;
                }
            }
        }, new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ ChallengeActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i9 = i6;
                ChallengeActivity challengeActivity = this.$this_viewModels;
                switch (i9) {
                    case 0:
                        return challengeActivity.getViewModelStore();
                    default:
                        return challengeActivity.getDefaultViewModelCreationExtras();
                }
            }
        });
        final int i9 = 4;
        this.viewArgs$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda4
            public final /* synthetic */ ChallengeActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Fragment fragment;
                FragmentActivity fragmentActivity;
                FragmentManager supportFragmentManager;
                int i22 = i9;
                ChallengeActivity challengeActivity = this.f$0;
                switch (i22) {
                    case 0:
                        DefaultIoScheduler defaultIoScheduler = ChallengeActivity.WORK_CONTEXT;
                        return new DefaultTransactionTimer(challengeActivity.getViewArgs().timeoutMins, (StripeErrorRequestExecutor) challengeActivity.errorRequestExecutor$delegate.getValue(), challengeActivity.getViewArgs().creqData);
                    case 1:
                        DefaultIoScheduler defaultIoScheduler2 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeActionHandler$Default(challengeActivity.getViewArgs().creqData, (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue(), challengeActivity.getViewArgs().creqExecutorFactory, ChallengeActivity.WORK_CONTEXT);
                    case 2:
                        DefaultIoScheduler defaultIoScheduler3 = ChallengeActivity.WORK_CONTEXT;
                        defaultIoScheduler3.getClass();
                        String str = challengeActivity.getViewArgs().creqExecutorConfig.acsUrl;
                        DefaultErrorReporter defaultErrorReporter = (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue();
                        str.getClass();
                        defaultErrorReporter.getClass();
                        TextSetter textSetter = new TextSetter(str, defaultErrorReporter, (CoroutineContext) defaultIoScheduler3);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        return new StripeErrorRequestExecutor(textSetter, defaultErrorReporter, DefaultIoScheduler.INSTANCE);
                    case 3:
                        DefaultIoScheduler defaultIoScheduler4 = ChallengeActivity.WORK_CONTEXT;
                        return new PaymentAuthWebViewActivityViewModel.Factory((ChallengeActionHandler$Default) challengeActivity.challengeActionHandler$delegate.getValue(), (DefaultTransactionTimer) challengeActivity.transactionTimer$delegate.getValue(), (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue());
                    case 4:
                        DefaultIoScheduler defaultIoScheduler5 = ChallengeActivity.WORK_CONTEXT;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        extras.getClass();
                        Object parcelable = SizeKt.getParcelable(extras, "extra_args", ChallengeViewArgs.class);
                        if (parcelable != null) {
                            return (ChallengeViewArgs) parcelable;
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    case 5:
                        DefaultIoScheduler defaultIoScheduler6 = ChallengeActivity.WORK_CONTEXT;
                        return new KeyboardController(challengeActivity);
                    case 6:
                        DefaultIoScheduler defaultIoScheduler7 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeSubmitDialogFactory(challengeActivity, challengeActivity.getViewArgs().uiCustomization);
                    case 7:
                        DefaultIoScheduler defaultIoScheduler8 = ChallengeActivity.WORK_CONTEXT;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        applicationContext.getClass();
                        return new DefaultErrorReporter(applicationContext, new Stripe3ds2ErrorReporterConfig(challengeActivity.getViewArgs().creqData.sdkTransId), null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    case 8:
                        DefaultIoScheduler defaultIoScheduler9 = ChallengeActivity.WORK_CONTEXT;
                        FragmentContainerView fragmentContainerView = ((StripeChallengeActivityBinding) challengeActivity.viewBinding$delegate.getValue()).fragmentContainer;
                        View view = fragmentContainerView;
                        while (true) {
                            if (view != null) {
                                Object tag = view.getTag(R.id.fragment_container_view_tag);
                                fragment = tag instanceof Fragment ? (Fragment) tag : null;
                                if (fragment == null) {
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                fragment = null;
                            }
                        }
                        if (fragment == null) {
                            Context context = fragmentContainerView.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    fragmentActivity = null;
                                } else if (context instanceof FragmentActivity) {
                                    fragmentActivity = (FragmentActivity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (fragmentActivity == null) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("View ", fragmentContainerView, " is not within a subclass of FragmentActivity.");
                                return null;
                            }
                            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        } else {
                            if (!fragment.isAdded()) {
                                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + fragmentContainerView + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                            }
                            supportFragmentManager = fragment.getChildFragmentManager();
                        }
                        return (ChallengeFragment) supportFragmentManager.findFragmentById(fragmentContainerView.getId());
                    case 9:
                        return ((ChallengeFragment) challengeActivity.fragment$delegate.getValue()).getViewBinding$3ds2sdk_release();
                    default:
                        DefaultIoScheduler defaultIoScheduler10 = ChallengeActivity.WORK_CONTEXT;
                        View inflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(inflate, R.id.fragment_container);
                        if (fragmentContainerView2 != null) {
                            return new StripeChallengeActivityBinding((FrameLayout) inflate, fragmentContainerView2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.fragment_container)));
                        return null;
                }
            }
        });
        final int i10 = 5;
        this.keyboardController$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda4
            public final /* synthetic */ ChallengeActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Fragment fragment;
                FragmentActivity fragmentActivity;
                FragmentManager supportFragmentManager;
                int i22 = i10;
                ChallengeActivity challengeActivity = this.f$0;
                switch (i22) {
                    case 0:
                        DefaultIoScheduler defaultIoScheduler = ChallengeActivity.WORK_CONTEXT;
                        return new DefaultTransactionTimer(challengeActivity.getViewArgs().timeoutMins, (StripeErrorRequestExecutor) challengeActivity.errorRequestExecutor$delegate.getValue(), challengeActivity.getViewArgs().creqData);
                    case 1:
                        DefaultIoScheduler defaultIoScheduler2 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeActionHandler$Default(challengeActivity.getViewArgs().creqData, (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue(), challengeActivity.getViewArgs().creqExecutorFactory, ChallengeActivity.WORK_CONTEXT);
                    case 2:
                        DefaultIoScheduler defaultIoScheduler3 = ChallengeActivity.WORK_CONTEXT;
                        defaultIoScheduler3.getClass();
                        String str = challengeActivity.getViewArgs().creqExecutorConfig.acsUrl;
                        DefaultErrorReporter defaultErrorReporter = (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue();
                        str.getClass();
                        defaultErrorReporter.getClass();
                        TextSetter textSetter = new TextSetter(str, defaultErrorReporter, (CoroutineContext) defaultIoScheduler3);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        return new StripeErrorRequestExecutor(textSetter, defaultErrorReporter, DefaultIoScheduler.INSTANCE);
                    case 3:
                        DefaultIoScheduler defaultIoScheduler4 = ChallengeActivity.WORK_CONTEXT;
                        return new PaymentAuthWebViewActivityViewModel.Factory((ChallengeActionHandler$Default) challengeActivity.challengeActionHandler$delegate.getValue(), (DefaultTransactionTimer) challengeActivity.transactionTimer$delegate.getValue(), (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue());
                    case 4:
                        DefaultIoScheduler defaultIoScheduler5 = ChallengeActivity.WORK_CONTEXT;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        extras.getClass();
                        Object parcelable = SizeKt.getParcelable(extras, "extra_args", ChallengeViewArgs.class);
                        if (parcelable != null) {
                            return (ChallengeViewArgs) parcelable;
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    case 5:
                        DefaultIoScheduler defaultIoScheduler6 = ChallengeActivity.WORK_CONTEXT;
                        return new KeyboardController(challengeActivity);
                    case 6:
                        DefaultIoScheduler defaultIoScheduler7 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeSubmitDialogFactory(challengeActivity, challengeActivity.getViewArgs().uiCustomization);
                    case 7:
                        DefaultIoScheduler defaultIoScheduler8 = ChallengeActivity.WORK_CONTEXT;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        applicationContext.getClass();
                        return new DefaultErrorReporter(applicationContext, new Stripe3ds2ErrorReporterConfig(challengeActivity.getViewArgs().creqData.sdkTransId), null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    case 8:
                        DefaultIoScheduler defaultIoScheduler9 = ChallengeActivity.WORK_CONTEXT;
                        FragmentContainerView fragmentContainerView = ((StripeChallengeActivityBinding) challengeActivity.viewBinding$delegate.getValue()).fragmentContainer;
                        View view = fragmentContainerView;
                        while (true) {
                            if (view != null) {
                                Object tag = view.getTag(R.id.fragment_container_view_tag);
                                fragment = tag instanceof Fragment ? (Fragment) tag : null;
                                if (fragment == null) {
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                fragment = null;
                            }
                        }
                        if (fragment == null) {
                            Context context = fragmentContainerView.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    fragmentActivity = null;
                                } else if (context instanceof FragmentActivity) {
                                    fragmentActivity = (FragmentActivity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (fragmentActivity == null) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("View ", fragmentContainerView, " is not within a subclass of FragmentActivity.");
                                return null;
                            }
                            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        } else {
                            if (!fragment.isAdded()) {
                                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + fragmentContainerView + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                            }
                            supportFragmentManager = fragment.getChildFragmentManager();
                        }
                        return (ChallengeFragment) supportFragmentManager.findFragmentById(fragmentContainerView.getId());
                    case 9:
                        return ((ChallengeFragment) challengeActivity.fragment$delegate.getValue()).getViewBinding$3ds2sdk_release();
                    default:
                        DefaultIoScheduler defaultIoScheduler10 = ChallengeActivity.WORK_CONTEXT;
                        View inflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(inflate, R.id.fragment_container);
                        if (fragmentContainerView2 != null) {
                            return new StripeChallengeActivityBinding((FrameLayout) inflate, fragmentContainerView2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.fragment_container)));
                        return null;
                }
            }
        });
        final int i11 = 6;
        this.progressDialogFactory$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda4
            public final /* synthetic */ ChallengeActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Fragment fragment;
                FragmentActivity fragmentActivity;
                FragmentManager supportFragmentManager;
                int i22 = i11;
                ChallengeActivity challengeActivity = this.f$0;
                switch (i22) {
                    case 0:
                        DefaultIoScheduler defaultIoScheduler = ChallengeActivity.WORK_CONTEXT;
                        return new DefaultTransactionTimer(challengeActivity.getViewArgs().timeoutMins, (StripeErrorRequestExecutor) challengeActivity.errorRequestExecutor$delegate.getValue(), challengeActivity.getViewArgs().creqData);
                    case 1:
                        DefaultIoScheduler defaultIoScheduler2 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeActionHandler$Default(challengeActivity.getViewArgs().creqData, (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue(), challengeActivity.getViewArgs().creqExecutorFactory, ChallengeActivity.WORK_CONTEXT);
                    case 2:
                        DefaultIoScheduler defaultIoScheduler3 = ChallengeActivity.WORK_CONTEXT;
                        defaultIoScheduler3.getClass();
                        String str = challengeActivity.getViewArgs().creqExecutorConfig.acsUrl;
                        DefaultErrorReporter defaultErrorReporter = (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue();
                        str.getClass();
                        defaultErrorReporter.getClass();
                        TextSetter textSetter = new TextSetter(str, defaultErrorReporter, (CoroutineContext) defaultIoScheduler3);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        return new StripeErrorRequestExecutor(textSetter, defaultErrorReporter, DefaultIoScheduler.INSTANCE);
                    case 3:
                        DefaultIoScheduler defaultIoScheduler4 = ChallengeActivity.WORK_CONTEXT;
                        return new PaymentAuthWebViewActivityViewModel.Factory((ChallengeActionHandler$Default) challengeActivity.challengeActionHandler$delegate.getValue(), (DefaultTransactionTimer) challengeActivity.transactionTimer$delegate.getValue(), (DefaultErrorReporter) challengeActivity.errorReporter$delegate.getValue());
                    case 4:
                        DefaultIoScheduler defaultIoScheduler5 = ChallengeActivity.WORK_CONTEXT;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        extras.getClass();
                        Object parcelable = SizeKt.getParcelable(extras, "extra_args", ChallengeViewArgs.class);
                        if (parcelable != null) {
                            return (ChallengeViewArgs) parcelable;
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    case 5:
                        DefaultIoScheduler defaultIoScheduler6 = ChallengeActivity.WORK_CONTEXT;
                        return new KeyboardController(challengeActivity);
                    case 6:
                        DefaultIoScheduler defaultIoScheduler7 = ChallengeActivity.WORK_CONTEXT;
                        return new ChallengeSubmitDialogFactory(challengeActivity, challengeActivity.getViewArgs().uiCustomization);
                    case 7:
                        DefaultIoScheduler defaultIoScheduler8 = ChallengeActivity.WORK_CONTEXT;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        applicationContext.getClass();
                        return new DefaultErrorReporter(applicationContext, new Stripe3ds2ErrorReporterConfig(challengeActivity.getViewArgs().creqData.sdkTransId), null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    case 8:
                        DefaultIoScheduler defaultIoScheduler9 = ChallengeActivity.WORK_CONTEXT;
                        FragmentContainerView fragmentContainerView = ((StripeChallengeActivityBinding) challengeActivity.viewBinding$delegate.getValue()).fragmentContainer;
                        View view = fragmentContainerView;
                        while (true) {
                            if (view != null) {
                                Object tag = view.getTag(R.id.fragment_container_view_tag);
                                fragment = tag instanceof Fragment ? (Fragment) tag : null;
                                if (fragment == null) {
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                fragment = null;
                            }
                        }
                        if (fragment == null) {
                            Context context = fragmentContainerView.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    fragmentActivity = null;
                                } else if (context instanceof FragmentActivity) {
                                    fragmentActivity = (FragmentActivity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (fragmentActivity == null) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("View ", fragmentContainerView, " is not within a subclass of FragmentActivity.");
                                return null;
                            }
                            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        } else {
                            if (!fragment.isAdded()) {
                                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + fragmentContainerView + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                            }
                            supportFragmentManager = fragment.getChildFragmentManager();
                        }
                        return (ChallengeFragment) supportFragmentManager.findFragmentById(fragmentContainerView.getId());
                    case 9:
                        return ((ChallengeFragment) challengeActivity.fragment$delegate.getValue()).getViewBinding$3ds2sdk_release();
                    default:
                        DefaultIoScheduler defaultIoScheduler10 = ChallengeActivity.WORK_CONTEXT;
                        View inflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(inflate, R.id.fragment_container);
                        if (fragmentContainerView2 != null) {
                            return new StripeChallengeActivityBinding((FrameLayout) inflate, fragmentContainerView2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.fragment_container)));
                        return null;
                }
            }
        });
        Pool pool = Pool.provider;
        pool = pool == null ? new Pool(8) : pool;
        if (Pool.provider == null) {
            Pool.provider = pool;
        }
        ServiceLoader serviceLoader = (ServiceLoader) pool.pool;
        if (!serviceLoader.iterator().hasNext() || serviceLoader.iterator().next() == null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1();
        throw null;
    }

    public final void dismissKeyboard() {
        FragmentActivity fragmentActivity = ((KeyboardController) this.keyboardController$delegate.getValue()).activity;
        InputMethodManager inputMethodManager = (InputMethodManager) fragmentActivity.getSystemService(InputMethodManager.class);
        if (inputMethodManager == null || !inputMethodManager.isAcceptingText()) {
            return;
        }
        View currentFocus = fragmentActivity.getCurrentFocus();
        inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
    }

    public final ChallengeViewArgs getViewArgs() {
        return (ChallengeViewArgs) this.viewArgs$delegate.getValue();
    }

    public final ChallengeActivityViewModel getViewModel$3ds2sdk_release() {
        return (ChallengeActivityViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ThreeDS2Button threeDS2Button;
        Bundle extras = getIntent().getExtras();
        if (extras == null || SizeKt.getParcelable(extras, "extra_args", ChallengeViewArgs.class) == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        getSupportFragmentManager().mFragmentFactory = new ChallengeFragmentFactory(getViewArgs().uiCustomization, (DefaultTransactionTimer) this.transactionTimer$delegate.getValue(), (StripeErrorRequestExecutor) this.errorRequestExecutor$delegate.getValue(), (DefaultErrorReporter) this.errorReporter$delegate.getValue(), (ChallengeActionHandler$Default) this.challengeActionHandler$delegate.getValue(), getViewArgs().cresData.uiType, getViewArgs().intentData);
        super.onCreate(bundle);
        int i = 10;
        getOnBackPressedDispatcher().addCallback(new RedwoodLayoutKt$toAndroid$1(this, 10));
        getWindow().setFlags(PKIFailureInfo.certRevoked, PKIFailureInfo.certRevoked);
        setContentView(((StripeChallengeActivityBinding) this.viewBinding$delegate.getValue()).rootView);
        final int i2 = 0;
        final int i3 = 1;
        getViewModel$3ds2sdk_release().submitClicked.observe(this, new CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0(1, new Function1(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda0
            public final /* synthetic */ ChallengeActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                UiType uiType;
                int i4 = i2;
                String str = null;
                ChallengeActivity challengeActivity = this.f$0;
                switch (i4) {
                    case 0:
                        ChallengeAction challengeAction = (ChallengeAction) obj;
                        DefaultIoScheduler defaultIoScheduler = ChallengeActivity.WORK_CONTEXT;
                        if (!challengeActivity.isFinishing()) {
                            challengeActivity.dismissKeyboard();
                            ChallengeSubmitDialogFactory challengeSubmitDialogFactory = (ChallengeSubmitDialogFactory) challengeActivity.progressDialogFactory$delegate.getValue();
                            challengeSubmitDialogFactory.getClass();
                            ChallengeSubmitDialogFactory.ChallengeSubmitDialog challengeSubmitDialog = new ChallengeSubmitDialogFactory.ChallengeSubmitDialog(challengeSubmitDialogFactory.context, challengeSubmitDialogFactory.uiCustomization);
                            challengeSubmitDialog.show();
                            challengeActivity.progressDialog = challengeSubmitDialog;
                            ChallengeActivityViewModel viewModel$3ds2sdk_release = challengeActivity.getViewModel$3ds2sdk_release();
                            challengeAction.getClass();
                            viewModel$3ds2sdk_release.submit(challengeAction);
                        }
                        break;
                    case 1:
                        ChallengeResult challengeResult = (ChallengeResult) obj;
                        DefaultIoScheduler defaultIoScheduler2 = ChallengeActivity.WORK_CONTEXT;
                        Intent intent = new Intent();
                        challengeResult.getClass();
                        challengeActivity.setResult(-1, intent.putExtras(BundleKt.bundleOf(new Pair("extra_result", challengeResult))));
                        if (!challengeActivity.isFinishing()) {
                            challengeActivity.finish();
                        }
                        break;
                    case 2:
                        ChallengeResponseData challengeResponseData = (ChallengeResponseData) obj;
                        DefaultIoScheduler defaultIoScheduler3 = ChallengeActivity.WORK_CONTEXT;
                        ChallengeSubmitDialogFactory.ChallengeSubmitDialog challengeSubmitDialog2 = challengeActivity.progressDialog;
                        if (challengeSubmitDialog2 != null && challengeSubmitDialog2.isShowing()) {
                            challengeSubmitDialog2.dismiss();
                        }
                        challengeActivity.progressDialog = null;
                        if (challengeResponseData != null) {
                            FragmentManager supportFragmentManager = challengeActivity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            BackStackRecord backStackRecord = new BackStackRecord(supportFragmentManager);
                            backStackRecord.mEnterAnim = R.anim.stripe_3ds2_challenge_transition_slide_in;
                            backStackRecord.mExitAnim = R.anim.stripe_3ds2_challenge_transition_slide_out;
                            backStackRecord.mPopEnterAnim = R.anim.stripe_3ds2_challenge_transition_slide_in;
                            backStackRecord.mPopExitAnim = R.anim.stripe_3ds2_challenge_transition_slide_out;
                            int id = ((StripeChallengeActivityBinding) challengeActivity.viewBinding$delegate.getValue()).fragmentContainer.getId();
                            Bundle bundleOf = BundleKt.bundleOf(new Pair("arg_cres", challengeResponseData));
                            FragmentFactory fragmentFactory = backStackRecord.mFragmentFactory;
                            if (fragmentFactory == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
                                break;
                            } else {
                                ClassLoader classLoader = backStackRecord.mClassLoader;
                                if (classLoader == null) {
                                    a$$ExternalSyntheticBUOutline0.m$1("The FragmentManager must be attached to itshost to create a Fragment");
                                    break;
                                } else {
                                    Fragment instantiate = fragmentFactory.instantiate(classLoader, ChallengeFragment.class.getName());
                                    instantiate.setArguments(bundleOf);
                                    backStackRecord.replace(id, null, instantiate);
                                    backStackRecord.commit();
                                    challengeActivity.currentChallengeResponseData = challengeResponseData;
                                }
                            }
                        }
                        break;
                    default:
                        DefaultIoScheduler defaultIoScheduler4 = ChallengeActivity.WORK_CONTEXT;
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ChallengeActivityViewModel viewModel$3ds2sdk_release2 = challengeActivity.getViewModel$3ds2sdk_release();
                            ChallengeResponseData challengeResponseData2 = challengeActivity.currentChallengeResponseData;
                            if (challengeResponseData2 != null && (uiType = challengeResponseData2.uiType) != null) {
                                str = uiType.code;
                            }
                            if (str == null) {
                                str = "";
                            }
                            viewModel$3ds2sdk_release2._shouldFinish.postValue(new ChallengeResult.Timeout(str, challengeActivity.getViewArgs().cresData.uiType, challengeActivity.getViewArgs().intentData));
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        getViewModel$3ds2sdk_release().shouldFinish.observe(this, new CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0(1, new Function1(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda0
            public final /* synthetic */ ChallengeActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                UiType uiType;
                int i4 = i3;
                String str = null;
                ChallengeActivity challengeActivity = this.f$0;
                switch (i4) {
                    case 0:
                        ChallengeAction challengeAction = (ChallengeAction) obj;
                        DefaultIoScheduler defaultIoScheduler = ChallengeActivity.WORK_CONTEXT;
                        if (!challengeActivity.isFinishing()) {
                            challengeActivity.dismissKeyboard();
                            ChallengeSubmitDialogFactory challengeSubmitDialogFactory = (ChallengeSubmitDialogFactory) challengeActivity.progressDialogFactory$delegate.getValue();
                            challengeSubmitDialogFactory.getClass();
                            ChallengeSubmitDialogFactory.ChallengeSubmitDialog challengeSubmitDialog = new ChallengeSubmitDialogFactory.ChallengeSubmitDialog(challengeSubmitDialogFactory.context, challengeSubmitDialogFactory.uiCustomization);
                            challengeSubmitDialog.show();
                            challengeActivity.progressDialog = challengeSubmitDialog;
                            ChallengeActivityViewModel viewModel$3ds2sdk_release = challengeActivity.getViewModel$3ds2sdk_release();
                            challengeAction.getClass();
                            viewModel$3ds2sdk_release.submit(challengeAction);
                        }
                        break;
                    case 1:
                        ChallengeResult challengeResult = (ChallengeResult) obj;
                        DefaultIoScheduler defaultIoScheduler2 = ChallengeActivity.WORK_CONTEXT;
                        Intent intent = new Intent();
                        challengeResult.getClass();
                        challengeActivity.setResult(-1, intent.putExtras(BundleKt.bundleOf(new Pair("extra_result", challengeResult))));
                        if (!challengeActivity.isFinishing()) {
                            challengeActivity.finish();
                        }
                        break;
                    case 2:
                        ChallengeResponseData challengeResponseData = (ChallengeResponseData) obj;
                        DefaultIoScheduler defaultIoScheduler3 = ChallengeActivity.WORK_CONTEXT;
                        ChallengeSubmitDialogFactory.ChallengeSubmitDialog challengeSubmitDialog2 = challengeActivity.progressDialog;
                        if (challengeSubmitDialog2 != null && challengeSubmitDialog2.isShowing()) {
                            challengeSubmitDialog2.dismiss();
                        }
                        challengeActivity.progressDialog = null;
                        if (challengeResponseData != null) {
                            FragmentManager supportFragmentManager = challengeActivity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            BackStackRecord backStackRecord = new BackStackRecord(supportFragmentManager);
                            backStackRecord.mEnterAnim = R.anim.stripe_3ds2_challenge_transition_slide_in;
                            backStackRecord.mExitAnim = R.anim.stripe_3ds2_challenge_transition_slide_out;
                            backStackRecord.mPopEnterAnim = R.anim.stripe_3ds2_challenge_transition_slide_in;
                            backStackRecord.mPopExitAnim = R.anim.stripe_3ds2_challenge_transition_slide_out;
                            int id = ((StripeChallengeActivityBinding) challengeActivity.viewBinding$delegate.getValue()).fragmentContainer.getId();
                            Bundle bundleOf = BundleKt.bundleOf(new Pair("arg_cres", challengeResponseData));
                            FragmentFactory fragmentFactory = backStackRecord.mFragmentFactory;
                            if (fragmentFactory == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
                                break;
                            } else {
                                ClassLoader classLoader = backStackRecord.mClassLoader;
                                if (classLoader == null) {
                                    a$$ExternalSyntheticBUOutline0.m$1("The FragmentManager must be attached to itshost to create a Fragment");
                                    break;
                                } else {
                                    Fragment instantiate = fragmentFactory.instantiate(classLoader, ChallengeFragment.class.getName());
                                    instantiate.setArguments(bundleOf);
                                    backStackRecord.replace(id, null, instantiate);
                                    backStackRecord.commit();
                                    challengeActivity.currentChallengeResponseData = challengeResponseData;
                                }
                            }
                        }
                        break;
                    default:
                        DefaultIoScheduler defaultIoScheduler4 = ChallengeActivity.WORK_CONTEXT;
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ChallengeActivityViewModel viewModel$3ds2sdk_release2 = challengeActivity.getViewModel$3ds2sdk_release();
                            ChallengeResponseData challengeResponseData2 = challengeActivity.currentChallengeResponseData;
                            if (challengeResponseData2 != null && (uiType = challengeResponseData2.uiType) != null) {
                                str = uiType.code;
                            }
                            if (str == null) {
                                str = "";
                            }
                            viewModel$3ds2sdk_release2._shouldFinish.postValue(new ChallengeResult.Timeout(str, challengeActivity.getViewArgs().cresData.uiType, challengeActivity.getViewArgs().intentData));
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        StripeToolbarCustomization stripeToolbarCustomization = getViewArgs().uiCustomization.mToolbarCustomization;
        ButtonCustomization buttonCustomization = getViewArgs().uiCustomization.getButtonCustomization(UiCustomization$ButtonType.CANCEL);
        ActionBar supportActionBar = getSupportActionBar();
        Continuation continuation = null;
        if (supportActionBar == null) {
            threeDS2Button = null;
        } else {
            threeDS2Button = new ThreeDS2Button(new ContextThemeWrapper(this, R.style.Stripe3DS2ActionBarButton), null, 0, 6, null);
            threeDS2Button.setBackgroundTintList(ColorStateList.valueOf(0));
            threeDS2Button.setButtonCustomization(buttonCustomization);
            ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(-2, -2);
            layoutParams.gravity = 8388629;
            supportActionBar.setCustomView(threeDS2Button, layoutParams);
            supportActionBar.setDisplayShowCustomEnabled();
            if (stripeToolbarCustomization != null) {
                String str = stripeToolbarCustomization.mHeaderText;
                String str2 = stripeToolbarCustomization.mBackgroundColor;
                String str3 = stripeToolbarCustomization.mButtonText;
                if (str3 == null || StringsKt.isBlank(str3)) {
                    threeDS2Button.setText(R.string.stripe_3ds2_hzv_cancel_label);
                } else {
                    threeDS2Button.setText(stripeToolbarCustomization.mButtonText);
                }
                if (str2 != null) {
                    supportActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(str2)));
                    String str4 = stripeToolbarCustomization.mStatusBarColor;
                    if (str4 != null) {
                        int parseColor = Color.parseColor(str4);
                        if (Build.VERSION.SDK_INT <= 34) {
                            getWindow().setStatusBarColor(parseColor);
                        }
                    } else {
                        int argb = Color.argb(Color.alpha(Color.parseColor(str2)), Math.min(Math.max((int) (Color.red(r1) * 0.8f), 0), 255), Math.min(Math.max((int) (Color.green(r1) * 0.8f), 0), 255), Math.min(Math.max((int) (Color.blue(r1) * 0.8f), 0), 255));
                        if (Build.VERSION.SDK_INT <= 34) {
                            getWindow().setStatusBarColor(argb);
                        }
                    }
                }
                if (str == null || StringsKt.isBlank(str)) {
                    str = getString(R.string.stripe_3ds2_hzv_header_label);
                    str.getClass();
                }
                supportActionBar.setTitle(CustomizeUtils.buildStyledText(this, str, stripeToolbarCustomization));
            } else {
                supportActionBar.setTitle();
                threeDS2Button.setText(R.string.stripe_3ds2_hzv_cancel_label);
            }
        }
        final int i4 = 2;
        if (threeDS2Button != null) {
            threeDS2Button.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(2, threeDS2Button, this));
        }
        getViewModel$3ds2sdk_release().nextScreen.observe(this, new CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0(1, new Function1(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda0
            public final /* synthetic */ ChallengeActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                UiType uiType;
                int i42 = i4;
                String str5 = null;
                ChallengeActivity challengeActivity = this.f$0;
                switch (i42) {
                    case 0:
                        ChallengeAction challengeAction = (ChallengeAction) obj;
                        DefaultIoScheduler defaultIoScheduler = ChallengeActivity.WORK_CONTEXT;
                        if (!challengeActivity.isFinishing()) {
                            challengeActivity.dismissKeyboard();
                            ChallengeSubmitDialogFactory challengeSubmitDialogFactory = (ChallengeSubmitDialogFactory) challengeActivity.progressDialogFactory$delegate.getValue();
                            challengeSubmitDialogFactory.getClass();
                            ChallengeSubmitDialogFactory.ChallengeSubmitDialog challengeSubmitDialog = new ChallengeSubmitDialogFactory.ChallengeSubmitDialog(challengeSubmitDialogFactory.context, challengeSubmitDialogFactory.uiCustomization);
                            challengeSubmitDialog.show();
                            challengeActivity.progressDialog = challengeSubmitDialog;
                            ChallengeActivityViewModel viewModel$3ds2sdk_release = challengeActivity.getViewModel$3ds2sdk_release();
                            challengeAction.getClass();
                            viewModel$3ds2sdk_release.submit(challengeAction);
                        }
                        break;
                    case 1:
                        ChallengeResult challengeResult = (ChallengeResult) obj;
                        DefaultIoScheduler defaultIoScheduler2 = ChallengeActivity.WORK_CONTEXT;
                        Intent intent = new Intent();
                        challengeResult.getClass();
                        challengeActivity.setResult(-1, intent.putExtras(BundleKt.bundleOf(new Pair("extra_result", challengeResult))));
                        if (!challengeActivity.isFinishing()) {
                            challengeActivity.finish();
                        }
                        break;
                    case 2:
                        ChallengeResponseData challengeResponseData = (ChallengeResponseData) obj;
                        DefaultIoScheduler defaultIoScheduler3 = ChallengeActivity.WORK_CONTEXT;
                        ChallengeSubmitDialogFactory.ChallengeSubmitDialog challengeSubmitDialog2 = challengeActivity.progressDialog;
                        if (challengeSubmitDialog2 != null && challengeSubmitDialog2.isShowing()) {
                            challengeSubmitDialog2.dismiss();
                        }
                        challengeActivity.progressDialog = null;
                        if (challengeResponseData != null) {
                            FragmentManager supportFragmentManager = challengeActivity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            BackStackRecord backStackRecord = new BackStackRecord(supportFragmentManager);
                            backStackRecord.mEnterAnim = R.anim.stripe_3ds2_challenge_transition_slide_in;
                            backStackRecord.mExitAnim = R.anim.stripe_3ds2_challenge_transition_slide_out;
                            backStackRecord.mPopEnterAnim = R.anim.stripe_3ds2_challenge_transition_slide_in;
                            backStackRecord.mPopExitAnim = R.anim.stripe_3ds2_challenge_transition_slide_out;
                            int id = ((StripeChallengeActivityBinding) challengeActivity.viewBinding$delegate.getValue()).fragmentContainer.getId();
                            Bundle bundleOf = BundleKt.bundleOf(new Pair("arg_cres", challengeResponseData));
                            FragmentFactory fragmentFactory = backStackRecord.mFragmentFactory;
                            if (fragmentFactory == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
                                break;
                            } else {
                                ClassLoader classLoader = backStackRecord.mClassLoader;
                                if (classLoader == null) {
                                    a$$ExternalSyntheticBUOutline0.m$1("The FragmentManager must be attached to itshost to create a Fragment");
                                    break;
                                } else {
                                    Fragment instantiate = fragmentFactory.instantiate(classLoader, ChallengeFragment.class.getName());
                                    instantiate.setArguments(bundleOf);
                                    backStackRecord.replace(id, null, instantiate);
                                    backStackRecord.commit();
                                    challengeActivity.currentChallengeResponseData = challengeResponseData;
                                }
                            }
                        }
                        break;
                    default:
                        DefaultIoScheduler defaultIoScheduler4 = ChallengeActivity.WORK_CONTEXT;
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ChallengeActivityViewModel viewModel$3ds2sdk_release2 = challengeActivity.getViewModel$3ds2sdk_release();
                            ChallengeResponseData challengeResponseData2 = challengeActivity.currentChallengeResponseData;
                            if (challengeResponseData2 != null && (uiType = challengeResponseData2.uiType) != null) {
                                str5 = uiType.code;
                            }
                            if (str5 == null) {
                                str5 = "";
                            }
                            viewModel$3ds2sdk_release2._shouldFinish.postValue(new ChallengeResult.Timeout(str5, challengeActivity.getViewArgs().cresData.uiType, challengeActivity.getViewArgs().intentData));
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        if (bundle == null) {
            ChallengeActivityViewModel viewModel$3ds2sdk_release = getViewModel$3ds2sdk_release();
            ChallengeResponseData challengeResponseData = getViewArgs().cresData;
            challengeResponseData.getClass();
            viewModel$3ds2sdk_release._nextScreen.setValue(challengeResponseData);
        }
        final int i5 = 3;
        ViewModelKt.liveData$default(new Logger$log$1(getViewModel$3ds2sdk_release(), continuation, i)).observe(this, new CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0(1, new Function1(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda0
            public final /* synthetic */ ChallengeActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                UiType uiType;
                int i42 = i5;
                String str5 = null;
                ChallengeActivity challengeActivity = this.f$0;
                switch (i42) {
                    case 0:
                        ChallengeAction challengeAction = (ChallengeAction) obj;
                        DefaultIoScheduler defaultIoScheduler = ChallengeActivity.WORK_CONTEXT;
                        if (!challengeActivity.isFinishing()) {
                            challengeActivity.dismissKeyboard();
                            ChallengeSubmitDialogFactory challengeSubmitDialogFactory = (ChallengeSubmitDialogFactory) challengeActivity.progressDialogFactory$delegate.getValue();
                            challengeSubmitDialogFactory.getClass();
                            ChallengeSubmitDialogFactory.ChallengeSubmitDialog challengeSubmitDialog = new ChallengeSubmitDialogFactory.ChallengeSubmitDialog(challengeSubmitDialogFactory.context, challengeSubmitDialogFactory.uiCustomization);
                            challengeSubmitDialog.show();
                            challengeActivity.progressDialog = challengeSubmitDialog;
                            ChallengeActivityViewModel viewModel$3ds2sdk_release2 = challengeActivity.getViewModel$3ds2sdk_release();
                            challengeAction.getClass();
                            viewModel$3ds2sdk_release2.submit(challengeAction);
                        }
                        break;
                    case 1:
                        ChallengeResult challengeResult = (ChallengeResult) obj;
                        DefaultIoScheduler defaultIoScheduler2 = ChallengeActivity.WORK_CONTEXT;
                        Intent intent = new Intent();
                        challengeResult.getClass();
                        challengeActivity.setResult(-1, intent.putExtras(BundleKt.bundleOf(new Pair("extra_result", challengeResult))));
                        if (!challengeActivity.isFinishing()) {
                            challengeActivity.finish();
                        }
                        break;
                    case 2:
                        ChallengeResponseData challengeResponseData2 = (ChallengeResponseData) obj;
                        DefaultIoScheduler defaultIoScheduler3 = ChallengeActivity.WORK_CONTEXT;
                        ChallengeSubmitDialogFactory.ChallengeSubmitDialog challengeSubmitDialog2 = challengeActivity.progressDialog;
                        if (challengeSubmitDialog2 != null && challengeSubmitDialog2.isShowing()) {
                            challengeSubmitDialog2.dismiss();
                        }
                        challengeActivity.progressDialog = null;
                        if (challengeResponseData2 != null) {
                            FragmentManager supportFragmentManager = challengeActivity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            BackStackRecord backStackRecord = new BackStackRecord(supportFragmentManager);
                            backStackRecord.mEnterAnim = R.anim.stripe_3ds2_challenge_transition_slide_in;
                            backStackRecord.mExitAnim = R.anim.stripe_3ds2_challenge_transition_slide_out;
                            backStackRecord.mPopEnterAnim = R.anim.stripe_3ds2_challenge_transition_slide_in;
                            backStackRecord.mPopExitAnim = R.anim.stripe_3ds2_challenge_transition_slide_out;
                            int id = ((StripeChallengeActivityBinding) challengeActivity.viewBinding$delegate.getValue()).fragmentContainer.getId();
                            Bundle bundleOf = BundleKt.bundleOf(new Pair("arg_cres", challengeResponseData2));
                            FragmentFactory fragmentFactory = backStackRecord.mFragmentFactory;
                            if (fragmentFactory == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
                                break;
                            } else {
                                ClassLoader classLoader = backStackRecord.mClassLoader;
                                if (classLoader == null) {
                                    a$$ExternalSyntheticBUOutline0.m$1("The FragmentManager must be attached to itshost to create a Fragment");
                                    break;
                                } else {
                                    Fragment instantiate = fragmentFactory.instantiate(classLoader, ChallengeFragment.class.getName());
                                    instantiate.setArguments(bundleOf);
                                    backStackRecord.replace(id, null, instantiate);
                                    backStackRecord.commit();
                                    challengeActivity.currentChallengeResponseData = challengeResponseData2;
                                }
                            }
                        }
                        break;
                    default:
                        DefaultIoScheduler defaultIoScheduler4 = ChallengeActivity.WORK_CONTEXT;
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ChallengeActivityViewModel viewModel$3ds2sdk_release22 = challengeActivity.getViewModel$3ds2sdk_release();
                            ChallengeResponseData challengeResponseData22 = challengeActivity.currentChallengeResponseData;
                            if (challengeResponseData22 != null && (uiType = challengeResponseData22.uiType) != null) {
                                str5 = uiType.code;
                            }
                            if (str5 == null) {
                                str5 = "";
                            }
                            viewModel$3ds2sdk_release22._shouldFinish.postValue(new ChallengeResult.Timeout(str5, challengeActivity.getViewArgs().cresData.uiType, challengeActivity.getViewArgs().intentData));
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        this.currentChallengeResponseData = getViewArgs().cresData;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ChallengeSubmitDialogFactory.ChallengeSubmitDialog challengeSubmitDialog = this.progressDialog;
        if (challengeSubmitDialog != null && challengeSubmitDialog.isShowing()) {
            challengeSubmitDialog.dismiss();
        }
        this.progressDialog = null;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        getViewModel$3ds2sdk_release().imageCache.getClass();
        ImageCache$Default.cache.evictAll();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        UiType uiType;
        super.onPause();
        getViewModel$3ds2sdk_release().shouldRefreshUi = true;
        KClasses$$Lambda$1 kClasses$$Lambda$1 = UiType.Companion;
        ChallengeResponseData challengeResponseData = this.currentChallengeResponseData;
        String str = (challengeResponseData == null || (uiType = challengeResponseData.uiType) == null) ? null : uiType.code;
        if (str == null) {
            str = "";
        }
        kClasses$$Lambda$1.getClass();
        getViewModel$3ds2sdk_release().shouldAutoSubmitOOB = KClasses$$Lambda$1.fromCode$3ds2sdk_release(str) == UiType.OutOfBand;
        dismissKeyboard();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!getViewModel$3ds2sdk_release().shouldAutoSubmitOOB) {
            if (getViewModel$3ds2sdk_release().shouldRefreshUi) {
                getViewModel$3ds2sdk_release()._refreshUi.setValue(Unit.INSTANCE);
            }
        } else {
            List fragments = getSupportFragmentManager().mFragmentStore.getFragments();
            fragments.getClass();
            Object first = CollectionsKt.first(fragments);
            first.getClass();
            getViewModel$3ds2sdk_release().submit(new ChallengeAction.Oob(Boolean.valueOf(((ChallengeFragment) first).getChallengeZoneView().whitelistRadioGroup.getCheckedRadioButtonId() == R.id.czv_whitelist_yes_button)));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        getViewModel$3ds2sdk_release().imageCache.getClass();
        ImageCache$Default.cache.evictAll();
    }
}
