package com.stripe.android.financialconnections.lite;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.activity.ComponentActivity;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.tracing.Trace;
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import com.google.android.datatransport.cct.StringMerger;
import com.squareup.cash.R;
import com.squareup.cash.shopping.web.ShoppingWebChromeClient;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.work.webview.views.WorkWebViewClient;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import com.stripe.android.financialconnections.model.Body$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.JobKt;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetLiteActivity extends ComponentActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public ProgressBar progressBar;
    public final ViewModelLazy viewModel$delegate;
    public WebView webView;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsSheetFlowType.values().length];
            try {
                FinancialConnectionsSheetFlowType financialConnectionsSheetFlowType = FinancialConnectionsSheetFlowType.ForData;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FinancialConnectionsSheetFlowType financialConnectionsSheetFlowType2 = FinancialConnectionsSheetFlowType.ForData;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FinancialConnectionsSheetFlowType financialConnectionsSheetFlowType3 = FinancialConnectionsSheetFlowType.ForData;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FinancialConnectionsSheetLiteActivity() {
        super(R.layout.stripe_activity_lite);
        final int i = 0;
        final int i2 = 1;
        this.viewModel$delegate = new ViewModelLazy(Reflection.factory.getOrCreateKotlinClass(FinancialConnectionsLiteViewModel.class), new Function0(this) { // from class: com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ FinancialConnectionsSheetLiteActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return financialConnectionsSheetLiteActivity.getViewModelStore();
                    default:
                        return financialConnectionsSheetLiteActivity.getDefaultViewModelCreationExtras();
                }
            }
        }, new Body$$ExternalSyntheticLambda0(13), new Function0(this) { // from class: com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ FinancialConnectionsSheetLiteActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return financialConnectionsSheetLiteActivity.getViewModelStore();
                    default:
                        return financialConnectionsSheetLiteActivity.getDefaultViewModelCreationExtras();
                }
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        int i;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("FinancialConnectionsSheetActivityArgs")) {
            finish();
            return;
        }
        setContentView(R.layout.stripe_activity_lite);
        View findViewById = findViewById(R.id.webView);
        findViewById.getClass();
        this.webView = (WebView) findViewById;
        View findViewById2 = findViewById(R.id.progressBar);
        findViewById2.getClass();
        this.progressBar = (ProgressBar) findViewById2;
        if (Build.VERSION.SDK_INT >= 30) {
            Trace.setDecorFitsSystemWindows(getWindow(), false);
            View findViewById3 = findViewById(android.R.id.content);
            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 workWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 = new WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(23);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(findViewById3, workWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0);
        }
        Intent intent2 = getIntent();
        intent2.getClass();
        FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs = (FinancialConnectionsSheetActivityArgs) intent2.getParcelableExtra("FinancialConnectionsSheetActivityArgs");
        Continuation continuation = null;
        FinancialConnectionsSheetFlowType flowType = financialConnectionsSheetActivityArgs != null ? StringMerger.getFlowType(financialConnectionsSheetActivityArgs) : null;
        int i2 = flowType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[flowType.ordinal()];
        int i3 = 2;
        if (i2 == -1 || i2 == 1 || i2 == 2) {
            i = R.color.stripe_financial_connections;
        } else {
            if (i2 != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            i = R.color.stripe_link;
        }
        int color = getColor(i);
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            throw null;
        }
        progressBar.getProgressDrawable().setTint(color);
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            throw null;
        }
        progressBar2.getIndeterminateDrawable().setTint(color);
        ProgressBar progressBar3 = this.progressBar;
        if (progressBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            throw null;
        }
        progressBar3.setVisibility(0);
        WebView webView = this.webView;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            throw null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.setWebChromeClient(new ShoppingWebChromeClient(this, i3));
        webView.setWebViewClient(new WorkWebViewClient(this, 2));
        getOnBackPressedDispatcher().addCallback(new RedwoodLayoutKt$toAndroid$1(this, 9), this);
        JobKt.launch$default(ViewModelKt.getCoroutineScope(getLifecycle()), null, null, new ExoPlayerVideoView.AnonymousClass2(this, continuation, 27), 3);
    }
}
