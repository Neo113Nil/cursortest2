package com.stripe.android;

import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import com.stripe.android.view.ActivityHost;
import com.stripe.android.view.AuthActivityStarter;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public interface PaymentBrowserAuthStarter extends AuthActivityStarter {

    public final class Legacy implements PaymentBrowserAuthStarter {
        public final DefaultReturnUrl defaultReturnUrl;
        public final ActivityHost host;

        public Legacy(ActivityHost activityHost, DefaultReturnUrl defaultReturnUrl) {
            activityHost.getClass();
            this.host = activityHost;
            this.defaultReturnUrl = defaultReturnUrl;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public final void start(Object obj) {
            PaymentBrowserAuthContract.Args args = (PaymentBrowserAuthContract.Args) obj;
            ActivityHost activityHost = this.host;
            Integer num = activityHost.statusBarColor;
            String str = args.objectId;
            int i = args.requestCode;
            String str2 = args.clientSecret;
            String str3 = args.url;
            String str4 = args.returnUrl;
            boolean z = args.enableLogging;
            StripeToolbarCustomization stripeToolbarCustomization = args.toolbarCustomization;
            String str5 = args.stripeAccountId;
            boolean z2 = args.shouldCancelSource;
            boolean z3 = args.shouldCancelIntentOnUserNavigation;
            String str6 = args.publishableKey;
            boolean z4 = args.isInstantApp;
            String str7 = args.referrer;
            boolean z5 = args.forceInAppWebView;
            str.getClass();
            str2.getClass();
            str3.getClass();
            str6.getClass();
            activityHost.startActivityForResult((Intrinsics.areEqual(args.returnUrl, this.defaultReturnUrl.getValue()) || args.isInstantApp) ? StripeBrowserLauncherActivity.class : PaymentAuthWebViewActivity.class, BundleKt.bundleOf(new Pair("extra_args", new PaymentBrowserAuthContract.Args(str, i, str2, str3, str4, z, stripeToolbarCustomization, str5, z2, z3, num, str6, z4, str7, z5))), args.requestCode);
        }
    }

    public final class Modern implements PaymentBrowserAuthStarter {
        public final ActivityResultLauncher launcher;

        public Modern(ActivityResultLauncher activityResultLauncher) {
            activityResultLauncher.getClass();
            this.launcher = activityResultLauncher;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public final void start(Object obj) {
            this.launcher.launch((PaymentBrowserAuthContract.Args) obj);
        }
    }
}
