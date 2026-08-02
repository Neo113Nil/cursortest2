package com.stripe.android.view;

import android.app.Application;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default;
import com.stripe.android.stripe3ds2.transaction.DefaultTransactionTimer;
import com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes8.dex */
public final class PaymentAuthWebViewActivityViewModel extends ViewModel {
    public final DefaultAnalyticsRequestExecutor analyticsRequestExecutor;
    public final PaymentBrowserAuthContract.Args args;
    public final /* synthetic */ String buttonText;
    public final Lazy extraHeaders$delegate = LazyKt.lazy(new HCaptcha$$ExternalSyntheticLambda0(this, 28));
    public final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    public final /* synthetic */ String toolbarBackgroundColor;
    public final /* synthetic */ ToolbarTitleData toolbarTitle;

    public final class ToolbarTitleData {
        public final String text;
        public final StripeToolbarCustomization toolbarCustomization;

        public ToolbarTitleData(String str, StripeToolbarCustomization stripeToolbarCustomization) {
            stripeToolbarCustomization.getClass();
            this.text = str;
            this.toolbarCustomization = stripeToolbarCustomization;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToolbarTitleData)) {
                return false;
            }
            ToolbarTitleData toolbarTitleData = (ToolbarTitleData) obj;
            return this.text.equals(toolbarTitleData.text) && Intrinsics.areEqual(this.toolbarCustomization, toolbarTitleData.toolbarCustomization);
        }

        public final int hashCode() {
            return this.toolbarCustomization.hashCode() + (this.text.hashCode() * 31);
        }

        public final String toString() {
            return "ToolbarTitleData(text=" + this.text + ", toolbarCustomization=" + this.toolbarCustomization + ")";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentAuthWebViewActivityViewModel(PaymentBrowserAuthContract.Args args, DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        ToolbarTitleData toolbarTitleData;
        String str;
        this.args = args;
        this.analyticsRequestExecutor = defaultAnalyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        StripeToolbarCustomization stripeToolbarCustomization = args.toolbarCustomization;
        this.buttonText = (stripeToolbarCustomization == null || (str = stripeToolbarCustomization.mButtonText) == null || StringsKt.isBlank(str)) ? null : str;
        if (stripeToolbarCustomization != null) {
            String str2 = stripeToolbarCustomization.mHeaderText;
            str2 = (str2 == null || StringsKt.isBlank(str2)) ? null : str2;
            if (str2 != null) {
                toolbarTitleData = new ToolbarTitleData(str2, stripeToolbarCustomization);
                this.toolbarTitle = toolbarTitleData;
                this.toolbarBackgroundColor = stripeToolbarCustomization != null ? stripeToolbarCustomization.mBackgroundColor : null;
            }
        }
        toolbarTitleData = null;
        this.toolbarTitle = toolbarTitleData;
        this.toolbarBackgroundColor = stripeToolbarCustomization != null ? stripeToolbarCustomization.mBackgroundColor : null;
    }

    public final PaymentFlowResult$Unvalidated getPaymentResult$payments_core_release() {
        PaymentBrowserAuthContract.Args args = this.args;
        String str = args.clientSecret;
        String lastPathSegment = Uri.parse(args.url).getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return new PaymentFlowResult$Unvalidated(str, 0, (StripeException) null, false, lastPathSegment, args.stripeAccountId, 46);
    }

    public final class Factory implements ViewModelProvider$Factory {
        public final /* synthetic */ int $r8$classId = 0;
        public final Object application;
        public final Object args;
        public final Object logger;

        public Factory(ChallengeActionHandler$Default challengeActionHandler$Default, DefaultTransactionTimer defaultTransactionTimer, DefaultErrorReporter defaultErrorReporter) {
            challengeActionHandler$Default.getClass();
            defaultTransactionTimer.getClass();
            defaultErrorReporter.getClass();
            this.application = challengeActionHandler$Default;
            this.logger = defaultTransactionTimer;
            this.args = defaultErrorReporter;
        }

        @Override // androidx.lifecycle.ViewModelProvider$Factory
        public final ViewModel create(Class cls) {
            int i = this.$r8$classId;
            Object obj = this.args;
            Object obj2 = this.logger;
            Object obj3 = this.application;
            cls.getClass();
            switch (i) {
                case 0:
                    PaymentBrowserAuthContract.Args args = (PaymentBrowserAuthContract.Args) obj;
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    return new PaymentAuthWebViewActivityViewModel(args, new DefaultAnalyticsRequestExecutor((Logger$Companion$NOOP_LOGGER$1) obj2, DefaultIoScheduler.INSTANCE), new PaymentAnalyticsRequestFactory((Application) obj3, args.publishableKey, SetsKt__SetsJVMKt.setOf("PaymentAuthWebViewActivity")));
                default:
                    return new ChallengeActivityViewModel((ChallengeActionHandler$Default) obj3, (DefaultTransactionTimer) obj2, (DefaultErrorReporter) obj);
            }
        }

        public Factory(Application application, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, PaymentBrowserAuthContract.Args args) {
            application.getClass();
            logger$Companion$NOOP_LOGGER$1.getClass();
            this.application = application;
            this.logger = logger$Companion$NOOP_LOGGER$1;
            this.args = args;
        }
    }
}
