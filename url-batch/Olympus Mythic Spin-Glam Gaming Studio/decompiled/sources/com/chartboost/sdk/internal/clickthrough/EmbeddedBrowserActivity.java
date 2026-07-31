package com.chartboost.sdk.internal.clickthrough;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.impl.fi;
import com.chartboost.sdk.impl.l7;
import com.chartboost.sdk.impl.pi;
import com.chartboost.sdk.impl.q7;
import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.impl.xb;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\t\u000fB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\t\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/chartboost/sdk/internal/clickthrough/EmbeddedBrowserActivity;", "Landroid/app/Activity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "t", "a", "(Ljava/lang/Throwable;)V", "Lcom/chartboost/sdk/impl/q7;", "Lcom/chartboost/sdk/impl/q7;", "eventTracker", "Landroid/view/View;", "b", "Lkotlin/Lazy;", "()Landroid/view/View;", "view", "Landroid/widget/FrameLayout;", "c", "()Landroid/widget/FrameLayout;", "frameLayout", "Landroid/webkit/WebView;", "d", "()Landroid/webkit/WebView;", "webView", "<init>", "()V", "Companion", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class EmbeddedBrowserActivity extends Activity {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    public q7 eventTracker;

    /* renamed from: b, reason: from kotlin metadata */
    public final Lazy view = LazyKt.lazy(new d());

    /* renamed from: c, reason: from kotlin metadata */
    public final Lazy frameLayout = LazyKt.lazy(new c());

    /* renamed from: d, reason: from kotlin metadata */
    public final Lazy webView = LazyKt.lazy(new e());

    /* renamed from: com.chartboost.sdk.internal.clickthrough.EmbeddedBrowserActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final Intent a(Context context, String url) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intent putExtra = new Intent(context, (Class<?>) EmbeddedBrowserActivity.class).putExtra("KEY_INTENT_URL", url);
            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            return putExtra;
        }

        public final String a(Intent intent) {
            if (intent != null) {
                return intent.getStringExtra("KEY_INTENT_URL");
            }
            return null;
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FrameLayout mo4828invoke() {
            FrameLayout frameLayout = new FrameLayout(EmbeddedBrowserActivity.this);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return frameLayout;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FrameLayout mo4828invoke() {
            FrameLayout a = EmbeddedBrowserActivity.this.a();
            a.addView(EmbeddedBrowserActivity.this.c());
            return a;
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebView mo4828invoke() {
            WebView webView = new WebView(EmbeddedBrowserActivity.this);
            EmbeddedBrowserActivity embeddedBrowserActivity = EmbeddedBrowserActivity.this;
            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            webView.setWebViewClient(embeddedBrowserActivity.new b());
            return webView;
        }
    }

    public final FrameLayout a() {
        return (FrameLayout) this.frameLayout.getValue();
    }

    public final View b() {
        return (View) this.view.getValue();
    }

    public final WebView c() {
        return (WebView) this.webView.getValue();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.c, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Object m8023constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            super.onCreate(savedInstanceState);
            if (Chartboost.isSdkStarted()) {
                this.eventTracker = fi.a();
            }
            setContentView(b());
            String a = INSTANCE.a(getIntent());
            if (a != null) {
                c().loadUrl(a);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                a(this, null, 1, null);
            }
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            a(m8026exceptionOrNullimpl);
        }
    }

    public static /* synthetic */ void a(EmbeddedBrowserActivity embeddedBrowserActivity, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        embeddedBrowserActivity.a(th);
    }

    public final void a(Throwable t) {
        xb.b("Error loading URL into embedded browser", t);
        finish();
    }

    public final class b extends WebViewClient {
        public final List a = CollectionsKt.listOf((Object[]) new Integer[]{-1, -2, -3, -6, -9, -10, -11, -12});

        public b() {
        }

        public final String a(WebResourceError webResourceError) {
            JSONObject jSONObject = new JSONObject();
            Intent intent = EmbeddedBrowserActivity.this.getIntent();
            jSONObject.put("url", intent != null ? EmbeddedBrowserActivity.INSTANCE.a(intent) : null);
            CharSequence description = webResourceError != null ? webResourceError.getDescription() : null;
            if (description == null) {
                description = "";
            } else {
                Intrinsics.checkNotNull(description);
            }
            jSONObject.put("error", description);
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            return jSONObject2;
        }

        public final boolean b(WebResourceError webResourceError) {
            List list = this.a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    if (webResourceError != null && intValue == webResourceError.getErrorCode()) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final void c(WebResourceError webResourceError) {
            if (b(webResourceError)) {
                q7 q7Var = EmbeddedBrowserActivity.this.eventTracker;
                if (q7Var == null || q7Var.track((pi) new l7(si.g.d, a(webResourceError), null, null, null, 28, null)) == null) {
                    xb.b("SDK is not initialized. Cannot track error: " + webResourceError, (Throwable) null, 2, (Object) null);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(h.c, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted(h.c, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/internal/clickthrough/EmbeddedBrowserActivity$b;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
            BrandSafetyUtils.onWebViewReceivedError(h.c, webView, webResourceRequest, webResourceError);
            safedk_EmbeddedBrowserActivity$b_onReceivedError_beba63ea34ea08785a81b853cc374184(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            xb.b("onReceivedHttpError: " + webResourceResponse, (Throwable) null, 2, (Object) null);
            b(webResourceResponse);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        
            if (r0.track((com.chartboost.sdk.impl.pi) new com.chartboost.sdk.impl.l7(r4, r14, null, null, null, 28, null)) != null) goto L14;
         */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str;
            boolean didCrash;
            q7 q7Var = EmbeddedBrowserActivity.this.eventTracker;
            if (q7Var != null) {
                si.b bVar = si.b.d;
                if (renderProcessGoneDetail != null) {
                    didCrash = renderProcessGoneDetail.didCrash();
                    if (didCrash) {
                        str = "Webview crashed " + renderProcessGoneDetail;
                    }
                }
                str = "Webview killed, likely due to low memory";
            }
            xb.b("SDK is not initialized. Cannot track render process gone event", (Throwable) null, 2, (Object) null);
            Unit unit = Unit.INSTANCE;
            Context context = webView != null ? webView.getContext() : null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                activity.finish();
            }
            return true;
        }

        public void safedk_EmbeddedBrowserActivity$b_onReceivedError_beba63ea34ea08785a81b853cc374184(WebView p0, WebResourceRequest p1, WebResourceError p2) {
            super.onReceivedError(p0, p1, p2);
            xb.b("onReceivedError: " + p2, (Throwable) null, 2, (Object) null);
            c(p2);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(h.c, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
            BrandSafetyUtils.onShouldOverrideUrlLoading(h.c, view, url, shouldOverrideUrlLoading);
            return shouldOverrideUrlLoading;
        }

        public final String a(WebResourceResponse webResourceResponse) {
            JSONObject jSONObject = new JSONObject();
            Intent intent = EmbeddedBrowserActivity.this.getIntent();
            jSONObject.put("url", intent != null ? EmbeddedBrowserActivity.INSTANCE.a(intent) : null);
            jSONObject.put("error", "HTTP status code: " + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null));
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            return jSONObject2;
        }

        public final void b(WebResourceResponse webResourceResponse) {
            q7 q7Var = EmbeddedBrowserActivity.this.eventTracker;
            if (q7Var == null || q7Var.track((pi) new l7(si.g.d, a(webResourceResponse), null, null, null, 28, null)) == null) {
                xb.b("SDK is not initialized. Cannot track error: " + webResourceResponse, (Throwable) null, 2, (Object) null);
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
