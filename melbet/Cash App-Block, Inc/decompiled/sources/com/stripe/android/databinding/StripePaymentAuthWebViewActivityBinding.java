package com.stripe.android.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.view.PaymentAuthWebView;

/* loaded from: classes8.dex */
public final class StripePaymentAuthWebViewActivityBinding implements ViewBinding {
    public final AppBarLayout appBar;
    public final CircularProgressIndicator progressBar;
    public final CoordinatorLayout rootView;
    public final Toolbar toolbar;
    public final PaymentAuthWebView webView;
    public final FrameLayout webViewContainer;

    public StripePaymentAuthWebViewActivityBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, CircularProgressIndicator circularProgressIndicator, Toolbar toolbar, PaymentAuthWebView paymentAuthWebView, FrameLayout frameLayout) {
        this.rootView = coordinatorLayout;
        this.appBar = appBarLayout;
        this.progressBar = circularProgressIndicator;
        this.toolbar = toolbar;
        this.webView = paymentAuthWebView;
        this.webViewContainer = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
