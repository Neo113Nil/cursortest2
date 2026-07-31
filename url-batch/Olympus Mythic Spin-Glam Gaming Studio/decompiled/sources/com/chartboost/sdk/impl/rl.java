package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.bk;
import com.chartboost.sdk.impl.i4;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.ChartboostNetworkBridge;
import com.safedk.android.utils.Logger;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes12.dex */
public final class rl extends m2 implements dd, hl {
    public static final a G = new a(null);
    public volatile FrameLayout A;
    public cd B;
    public boolean C;
    public Triple D;
    public final AtomicBoolean E;
    public il F;
    public final Context n;
    public final String o;
    public final URL p;
    public final yc q;
    public final y4 r;
    public final tl s;
    public final dl t;
    public final v u;
    public final he v;
    public final y2 w;
    public final List x;
    public Function0 y;
    public WebView z;

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ FrameLayout c;
        public final /* synthetic */ View d;
        public final /* synthetic */ rl e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FrameLayout frameLayout, View view, rl rlVar, Continuation continuation) {
            super(2, continuation);
            this.c = frameLayout;
            this.d = view;
            this.e = rlVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            rl.b(this.e, this.c, this.d);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function0 {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.TRUE;
        }
    }

    public static final class d extends ContinuationImpl {
        public /* synthetic */ Object b;
        public int d;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object a = rl.this.a((Context) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ WebView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(WebView webView, Continuation continuation) {
            super(2, continuation);
            this.d = webView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return rl.this.new f(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                rl rlVar = rl.this;
                WebView webView = this.d;
                this.b = 1;
                if (rlVar.a(webView, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            rl.this.z = null;
            return Unit.INSTANCE;
        }
    }

    public static final class h extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return rl.this.a((WebView) null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Context context, String str, URL url, yc placementType, y4 y4Var, tl webViewFactory, wf renderableConfig, a0 adMarkupConfig, di trackerComponent, rh telemetryManager, u adFormat, dl viewabilityComponent, Mediation mediation, v vVar, he openMeasurementManager, y2 cbIdentity, List vastErrorTrackingEvents) {
        super(renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, mediation);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(viewabilityComponent, "viewabilityComponent");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(cbIdentity, "cbIdentity");
        Intrinsics.checkNotNullParameter(vastErrorTrackingEvents, "vastErrorTrackingEvents");
        this.n = context;
        this.o = str;
        this.p = url;
        this.q = placementType;
        this.r = y4Var;
        this.s = webViewFactory;
        this.t = viewabilityComponent;
        this.u = vVar;
        this.v = openMeasurementManager;
        this.w = cbIdentity;
        this.x = vastErrorTrackingEvents;
        this.y = c.b;
        this.E = new AtomicBoolean(false);
        if (str == null && url == null) {
            throw new ChartboostError.Load.InvalidAdm("WebRenderable requires either HTML or URL to be provided", new IllegalArgumentException("Missing content"));
        }
    }

    public static final void l(rl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebView webView = this$0.z;
        if (webView != null) {
            webView.evaluateJavascript("document.querySelectorAll('video, audio').forEach(media => { media.muted = true;});", null);
        }
        xb.a("WebRenderable resumed.", (Throwable) null, 2, (Object) null);
    }

    public final Function0 A() {
        return this.y;
    }

    public static final class a {

        /* renamed from: com.chartboost.sdk.impl.rl$a$a, reason: collision with other inner class name */
        public static final class C0230a extends Lambda implements Function1 {
            public static final C0230a b = new C0230a();

            public C0230a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(String script) {
                Intrinsics.checkNotNullParameter(script, "script");
                return "<script>" + script + "</script>";
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(List list) {
            return CollectionsKt.joinToString$default(list, "\n", null, null, 0, null, C0230a.b, 30, null);
        }

        public final String a(Integer num) {
            StringBuilder sb;
            String str;
            if (num == null) {
                return "default (MATCH_PARENT)";
            }
            if (num.intValue() == -1) {
                return "MATCH_PARENT";
            }
            if (num.intValue() == -2) {
                return "WRAP_CONTENT";
            }
            if (num.intValue() >= 0) {
                sb = new StringBuilder();
                sb.append(num);
                str = "dp";
            } else {
                sb = new StringBuilder();
                sb.append(num);
                str = " (unknown, using MATCH_PARENT)";
            }
            sb.append(str);
            return sb.toString();
        }

        public final int a(Integer num, Context context) {
            if (num == null) {
                return -1;
            }
            if (num.intValue() == -1 || num.intValue() == -2) {
                return num.intValue();
            }
            if (num.intValue() < 0) {
                xb.e("Unknown dimension value: " + num + ". Defaulting to MATCH_PARENT", null, 2, null);
                return -1;
            }
            return t6.a(num.intValue(), context);
        }

        public final String a(String html, List list) {
            Intrinsics.checkNotNullParameter(html, "html");
            if (list == null || list.isEmpty()) {
                return html;
            }
            return a(list) + "\n" + html;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {
        public Object b;
        public Object c;
        public int d;
        public final /* synthetic */ Context f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, Continuation continuation) {
            super(2, continuation);
            this.f = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return rl.this.new e(this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            URL b2;
            String c;
            Window window;
            URL url;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            String str2 = rl.this.o != null ? "HTML" : "URL";
            String str3 = rl.this.o;
            int length = (str3 == null && ((url = rl.this.p) == null || (str3 = url.toString()) == null)) ? 0 : str3.length();
            xb.a("WebRenderable load initiated: auctionId=" + rl.this.q().c() + ", source=" + str2 + ", contentLength=" + length + ", placementType=" + rl.this.q, (Throwable) null, 2, (Object) null);
            Context context = this.f;
            rl rlVar = rl.this;
            this.b = context;
            this.c = rlVar;
            this.d = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                activity = null;
            }
            View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            c9 j = rlVar.w().j();
            boolean z = (j == null || j.a()) && activity != null && viewGroup != null && viewGroup.isAttachedToWindow();
            a aVar = rl.G;
            v vVar = rlVar.u;
            int a2 = aVar.a(vVar != null ? vVar.b() : null, context);
            v vVar2 = rlVar.u;
            int a3 = aVar.a(vVar2 != null ? vVar2.a() : null, context);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setVisibility(4);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(a2, a3));
            if (!z || viewGroup == null) {
                v vVar3 = rlVar.u;
                String a4 = aVar.a(vVar3 != null ? vVar3.b() : null);
                v vVar4 = rlVar.u;
                xb.a("Created temp invisible container (not attached to Activity decorView) with dimensions: " + a4 + " x " + aVar.a(vVar4 != null ? vVar4.a() : null) + " = " + a2 + "px x " + a3 + "px", (Throwable) null, 2, (Object) null);
            } else {
                viewGroup.addView(frameLayout);
                frameLayout.setTranslationZ(-1000000.0f);
                v vVar5 = rlVar.u;
                String a5 = aVar.a(vVar5 != null ? vVar5.b() : null);
                v vVar6 = rlVar.u;
                xb.a("Created temp invisible container and attached to Activity decorView with dimensions: " + a5 + " x " + aVar.a(vVar6 != null ? vVar6.a() : null) + " = " + a2 + "px x " + a3 + "px", (Throwable) null, 2, (Object) null);
            }
            rlVar.A = frameLayout;
            WebView a6 = rlVar.s.a(context);
            a6.getSettings().setJavaScriptEnabled(true);
            a6.getSettings().setMediaPlaybackRequiresUserGesture(false);
            a6.setBackgroundColor(-16777216);
            Integer p = rlVar.w().p();
            Integer i2 = rlVar.w().i();
            int a7 = p != null ? t6.a(p.intValue(), context) : -1;
            int a8 = i2 != null ? t6.a(i2.intValue(), context) : -1;
            a6.setLayoutParams(new FrameLayout.LayoutParams(a7, a8));
            xb.a("Set WebView dimensions: " + p + "dp x " + i2 + "dp = " + a7 + "px x " + a8 + "px", (Throwable) null, 2, (Object) null);
            ViewParent parent = a6.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(a6);
            }
            frameLayout.addView(a6);
            c9 j2 = rlVar.w().j();
            String str4 = "2.0";
            if (j2 == null || (str = j2.c()) == null) {
                str = "2.0";
            }
            a6.setWebViewClient(new b(cancellableContinuationImpl, rlVar, a6, str));
            rlVar.z = a6;
            cd a9 = rlVar.s.a(context, a6, rlVar.q);
            a9.a(rlVar);
            rlVar.B = a9;
            cancellableContinuationImpl.invokeOnCancellation(new a(rlVar, a6, frameLayout));
            String str5 = rlVar.o;
            if (str5 != null) {
                String a10 = rlVar.t.b().a(new Regex("\\sautoplay(=[\"']?autoplay[\"']?)?", RegexOption.IGNORE_CASE).replace(str5, ""));
                c9 j3 = rlVar.w().j();
                String a11 = aVar.a(a10, j3 != null ? j3.e() : null);
                ed edVar = ed.a;
                c9 j4 = rlVar.w().j();
                if (j4 != null && (c = j4.c()) != null) {
                    str4 = c;
                }
                String a12 = edVar.a(str4);
                c9 j5 = rlVar.w().j();
                ChartboostNetworkBridge.webviewLoadDataWithBaseURL(a6, (j5 == null || (b2 = j5.b()) == null) ? null : b2.toString(), "<html><script type=\"text/javascript\">" + a12 + "</script>\n" + a11 + "</html>", POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
            } else {
                URL url2 = rlVar.p;
                if (url2 != null) {
                    ChartboostNetworkBridge.webviewLoadUrl(a6, url2.toString());
                }
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            return result == coroutine_suspended ? coroutine_suspended : result;
        }

        public static final class b extends md {
            public final /* synthetic */ CancellableContinuation c;
            public final /* synthetic */ rl d;
            public final /* synthetic */ WebView e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CancellableContinuation cancellableContinuation, rl rlVar, WebView webView, String str) {
                super(str);
                this.c = cancellableContinuation;
                this.d = rlVar;
                this.e = webView;
            }

            @Override // com.chartboost.sdk.impl.md, android.webkit.WebViewClient
            public void onLoadResource(WebView view, String url) {
                super.onLoadResource(view, url);
                CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.c, view, url);
            }

            @Override // com.chartboost.sdk.impl.md, android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.c, view, url);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/rl$e$b;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
                BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.c, webView, webResourceRequest, webResourceError);
                safedk_rl$e$b_onReceivedError_aa4f37887e0f6f44839691da4e8a8c0b(webView, webResourceRequest, webResourceError);
            }

            public boolean safedk_rl$e$b_shouldOverrideUrlLoading_94e18649edafff1a47b9c815dd852639(WebView view, WebResourceRequest request) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                if (!(view instanceof kd)) {
                    xb.b("Expected an MraidWebView", (Throwable) null, 2, (Object) null);
                    return false;
                }
                kd kdVar = (kd) view;
                boolean gestureDetected = kdVar.getGestureDetected();
                if (this.d.w().n()) {
                    kdVar.a();
                }
                cd cdVar = this.d.B;
                if (cdVar == null) {
                    return false;
                }
                c9 j = this.d.w().j();
                return cdVar.a(request, j != null ? j.f() : false, gestureDetected);
            }

            @Override // com.chartboost.sdk.impl.md, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.c, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/rl$e$b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
                boolean safedk_rl$e$b_shouldOverrideUrlLoading_94e18649edafff1a47b9c815dd852639 = safedk_rl$e$b_shouldOverrideUrlLoading_94e18649edafff1a47b9c815dd852639(webView, webResourceRequest);
                BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.c, webView, webResourceRequest, safedk_rl$e$b_shouldOverrideUrlLoading_94e18649edafff1a47b9c815dd852639);
                return safedk_rl$e$b_shouldOverrideUrlLoading_94e18649edafff1a47b9c815dd852639;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                List<String> d;
                if (this.c.isActive()) {
                    this.d.a((View) this.e);
                    if (this.d.C) {
                        Triple triple = this.d.D;
                        if (triple == null) {
                            triple = new Triple("Unknown URL", -1, "No description");
                        }
                        String str2 = "WebView failed to load main frame. URL: " + ((String) triple.component1()) + ", Error Code: " + ((Integer) triple.component2()) + ", Description: " + ((Object) ((CharSequence) triple.component3()));
                        this.d.z();
                        ChartboostError.Load.WebViewFailed webViewFailed = new ChartboostError.Load.WebViewFailed(str2, null);
                        CancellableContinuation cancellableContinuation = this.c;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m8023constructorimpl(Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(webViewFailed)))));
                        return;
                    }
                    this.d.a(this.e);
                    if (webView != null) {
                        String format = String.format("document.querySelectorAll('video, audio').forEach(media => media.muted = %b);", Arrays.copyOf(new Object[]{Boolean.TRUE}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        webView.evaluateJavascript(format, null);
                    }
                    c9 j = this.d.w().j();
                    if (j != null && (d = j.d()) != null) {
                        for (String str3 : d) {
                            if (webView != null) {
                                webView.evaluateJavascript(str3, null);
                            }
                        }
                    }
                    CancellableContinuation cancellableContinuation2 = this.c;
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuation2.resumeWith(Result.m8023constructorimpl(Result.m8022boximpl(Result.m8023constructorimpl(Unit.INSTANCE))));
                    cd cdVar = this.d.B;
                    if (cdVar != null) {
                        cdVar.start();
                    }
                }
            }

            public void safedk_rl$e$b_onReceivedError_aa4f37887e0f6f44839691da4e8a8c0b(WebView p0, WebResourceRequest p1, WebResourceError p2) {
                String valueOf = String.valueOf(p1 != null ? p1.getUrl() : null);
                Integer valueOf2 = p2 != null ? Integer.valueOf(p2.getErrorCode()) : null;
                CharSequence description = p2 != null ? p2.getDescription() : null;
                if (p1 != null && p1.isForMainFrame()) {
                    xb.b("WebRenderable main frame error: url=" + valueOf + ", auctionId=" + this.d.q().c() + ", errorCode=" + valueOf2 + ", description=" + ((Object) description) + ", method=" + p1.getMethod(), (Throwable) null, 2, (Object) null);
                    this.d.C = true;
                    if (this.d.D == null) {
                        this.d.D = new Triple(valueOf, valueOf2, description);
                        return;
                    }
                    return;
                }
                xb.e("WebRenderable sub-resource error: url=" + valueOf + ", auctionId=" + this.d.q().c() + ", errorCode=" + valueOf2 + ", description=" + ((Object) description), null, 2, null);
                if (this.d.r != null && this.c.isActive() && ((Boolean) this.d.A().mo4828invoke()).booleanValue()) {
                    this.d.z();
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x001a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
            @Override // android.webkit.WebViewClient
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                String str;
                Integer num;
                int rendererPriorityAtExit;
                boolean didCrash;
                if (renderProcessGoneDetail != null) {
                    didCrash = renderProcessGoneDetail.didCrash();
                    if (didCrash) {
                        str = "CRASHED";
                        if (renderProcessGoneDetail == null) {
                            rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
                            num = Integer.valueOf(rendererPriorityAtExit);
                        } else {
                            num = null;
                        }
                        xb.b("WebRenderable render process gone: phase=" + (!this.c.isActive() ? "LOAD" : "RENDER") + ", auctionId=" + this.d.q().c() + ", reason=" + str + ", rendererPriority=" + num + ", htmlSource=" + (this.d.o == null ? "HTML" : "URL"), (Throwable) null, 2, (Object) null);
                        this.d.a((View) this.e);
                        if (!this.c.isActive()) {
                            CancellableContinuation cancellableContinuation = this.c;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m8023constructorimpl(Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(ChartboostError.Load.WebViewCrashed.INSTANCE)))));
                        } else {
                            ChartboostError.Render.WebViewTerminated webViewTerminated = ChartboostError.Render.WebViewTerminated.INSTANCE;
                            this.d.a(webViewTerminated);
                            zf j = this.d.j();
                            if (j != null) {
                                j.b(webViewTerminated);
                            }
                            cd cdVar = this.d.B;
                            if (cdVar != null) {
                                cdVar.a(nh.f);
                            }
                        }
                        return true;
                    }
                }
                str = "KILLED_BY_SYSTEM";
                if (renderProcessGoneDetail == null) {
                }
                if (!this.c.isActive()) {
                }
                if (this.d.o == null) {
                }
                xb.b("WebRenderable render process gone: phase=" + (!this.c.isActive() ? "LOAD" : "RENDER") + ", auctionId=" + this.d.q().c() + ", reason=" + str + ", rendererPriority=" + num + ", htmlSource=" + (this.d.o == null ? "HTML" : "URL"), (Throwable) null, 2, (Object) null);
                this.d.a((View) this.e);
                if (!this.c.isActive()) {
                }
                return true;
            }
        }

        public static final class a extends Lambda implements Function1 {
            public final /* synthetic */ rl b;
            public final /* synthetic */ WebView c;
            public final /* synthetic */ FrameLayout d;

            /* renamed from: com.chartboost.sdk.impl.rl$e$a$a, reason: collision with other inner class name */
            public static final class C0231a extends SuspendLambda implements Function2 {
                public int b;
                public final /* synthetic */ WebView c;
                public final /* synthetic */ rl d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0231a(WebView webView, rl rlVar, Continuation continuation) {
                    super(2, continuation);
                    this.c = webView;
                    this.d = rlVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0231a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0231a(this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.b;
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.c.setVisibility(8);
                            rl rlVar = this.d;
                            WebView webView = this.c;
                            this.b = 1;
                            if (rlVar.a(webView, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                    } catch (Exception e) {
                        xb.b("WebRenderable WebView destruction failed during cancellation: htmlSource=" + (this.d.o != null ? "HTML" : "URL"), e);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(rl rlVar, WebView webView, FrameLayout frameLayout) {
                super(1);
                this.b = rlVar;
                this.c = webView;
                this.d = frameLayout;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void a(Throwable th) {
                xb.a("WebRenderable load cancelled: " + th, (Throwable) null, 2, (Object) null);
                if (this.b.r != null && ((Boolean) this.b.A().mo4828invoke()).booleanValue()) {
                    this.b.z();
                }
                try {
                    this.b.a((View) this.c);
                } catch (Exception e) {
                    FrameLayout frameLayout = this.d;
                    xb.b("WebRenderable temp container cleanup failed during cancellation: hasParent=" + ((frameLayout != null ? frameLayout.getParent() : null) != null), e);
                }
                il b = this.b.b();
                if (b != null) {
                    b.a();
                }
                cd cdVar = this.b.B;
                if (cdVar != null) {
                    cdVar.a(nh.f);
                }
                cd cdVar2 = this.b.B;
                if (cdVar2 != null) {
                    cdVar2.a((dd) null);
                }
                this.b.B = null;
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C0231a(this.c, this.b, null), 3, null);
                this.b.z = null;
            }
        }
    }

    public /* synthetic */ rl(Context context, String str, URL url, yc ycVar, y4 y4Var, tl tlVar, wf wfVar, a0 a0Var, di diVar, rh rhVar, u uVar, dl dlVar, Mediation mediation, v vVar, he heVar, y2 y2Var, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : url, ycVar, (i & 16) != 0 ? null : y4Var, (i & 32) != 0 ? new f6() : tlVar, wfVar, a0Var, diVar, rhVar, uVar, dlVar, mediation, (i & 8192) != 0 ? null : vVar, heVar, y2Var, (i & 65536) != 0 ? CollectionsKt.emptyList() : list);
    }

    @Override // com.chartboost.sdk.impl.vf
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public WebView k() {
        WebView webView = this.z;
        if (webView == null) {
            return null;
        }
        a((View) webView);
        return webView;
    }

    @Override // com.chartboost.sdk.impl.m2
    public void y() {
        List<qi> i;
        xb.a("WebRenderable starting: auctionId=" + q().c() + ", placementType=" + this.q, (Throwable) null, 2, (Object) null);
        il b2 = b();
        if (b2 != null) {
            b2.b();
        }
        cd cdVar = this.B;
        if (cdVar != null) {
            cdVar.a();
        }
        WebView webView = this.z;
        if (webView != null) {
            webView.onResume();
        }
        WebView webView2 = this.z;
        if (webView2 != null) {
            webView2.evaluateJavascript("window?.chartboost?.onShow?.();", null);
        }
        WebView webView3 = this.z;
        if (webView3 != null) {
            webView3.evaluateJavascript("document.querySelectorAll('video, audio').forEach(media => { if (media.paused) media.play(); });", null);
        }
        y4 y4Var = this.r;
        if (y4Var != null && (i = y4Var.i()) != null) {
            for (qi qiVar : i) {
                if (Intrinsics.areEqual(qiVar.a(), "creativeView")) {
                    oj.a.a(bk.e.b, new ck(null, qiVar, this.n, this.v, this.w, null, null, null, null, null, null, null, null, null, 16353, null));
                }
            }
        }
        super.y();
    }

    public final void z() {
        if (this.E.compareAndSet(false, true)) {
            for (qi qiVar : this.x) {
                oj.a.a(bk.f.b, new ck(null, qi.a(qiVar, null, null, 0, null, MapsKt.plus(qiVar.b(), TuplesKt.to("VAST_ERROR_CODE", 603)), null, 47, null), this.n, this.v, this.w, null, null, null, null, null, null, null, null, null, 16353, null));
            }
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void m() {
        cd cdVar = this.B;
        if (cdVar != null) {
            cdVar.pause();
        }
        WebView webView = this.z;
        if (webView != null) {
            webView.onPause();
        }
        xb.a("WebRenderable paused.", (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.vf
    public void n() {
        WebView webView = this.z;
        if (webView != null) {
            webView.onResume();
        }
        cd cdVar = this.B;
        if (cdVar != null) {
            cdVar.a();
        }
        WebView webView2 = this.z;
        if (webView2 != null) {
            webView2.postDelayed(new Runnable() { // from class: com.chartboost.sdk.impl.rl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    rl.l(rl.this);
                }
            }, 100L);
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(ac macroContext) {
            Intrinsics.checkNotNullParameter(macroContext, "$this$macroContext");
            macroContext.a(rl.this.p());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ac) obj);
            return Unit.INSTANCE;
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void o() {
        il b2 = b();
        if (b2 != null) {
            b2.c();
        }
    }

    public static final void b(rl rlVar, FrameLayout frameLayout, View view) {
        if (view != null) {
            try {
                try {
                    if (frameLayout.indexOfChild(view) != -1) {
                        frameLayout.removeView(view);
                    }
                } catch (Exception e2) {
                    xb.b("WebRenderable temp container cleanup error: hasAdView=" + (view != null) + ", containerHasParent=" + (frameLayout.getParent() != null), e2);
                    if (rlVar.A != frameLayout) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (rlVar.A == frameLayout) {
                    rlVar.A = null;
                }
                throw th;
            }
        }
        ViewParent parent = frameLayout.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(frameLayout);
        }
        xb.a("WebRenderable cleaned up temp container successfully", (Throwable) null, 2, (Object) null);
        if (rlVar.A != frameLayout) {
            return;
        }
        rlVar.A = null;
    }

    @Override // com.chartboost.sdk.impl.hl
    public il b() {
        return this.F;
    }

    @Override // com.chartboost.sdk.impl.dd
    public void b(re request) {
        Intrinsics.checkNotNullParameter(request, "request");
        zf j = j();
        if (j != null) {
            j.a(request);
        }
    }

    public final void a(View view) {
        FrameLayout frameLayout = this.A;
        if (frameLayout == null) {
            return;
        }
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new b(frameLayout, view, this, null), 3, null);
        } else {
            b(this, frameLayout, view);
        }
    }

    public final void a(WebView webView) {
        el b2 = this.t.b();
        if (b2.b()) {
            this.F = this.t.a().a(b2, webView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.chartboost.sdk.impl.vf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Context context, Continuation continuation) {
        d dVar;
        int i;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d = i2 - Integer.MIN_VALUE;
                Object obj = dVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    e eVar = new e(context, null);
                    dVar.d = 1;
                    obj = BuildersKt.withContext(main, eVar, dVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dVar.d;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    @Override // com.chartboost.sdk.impl.m2
    public void b(String str, boolean z) {
        a(str, z, (i4) null);
    }

    @Override // com.chartboost.sdk.impl.vf
    public float a(boolean z) {
        super.a(z);
        String format = String.format("document.querySelectorAll('video, audio').forEach(media => media.muted = %b);", Arrays.copyOf(new Object[]{Boolean.TRUE}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        WebView webView = this.z;
        if (webView == null) {
            return 0.0f;
        }
        webView.evaluateJavascript(format, null);
        return 0.0f;
    }

    @Override // com.chartboost.sdk.impl.dd
    public void a(String str, ul reason, boolean z) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        b(str, z);
    }

    @Override // com.chartboost.sdk.impl.dd
    public void a(wl reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        xb.a("WebView stopped for " + reason, (Throwable) null, 2, (Object) null);
        if (reason == wl.b) {
            ChartboostError.Render.WebViewMraidUnload webViewMraidUnload = ChartboostError.Render.WebViewMraidUnload.INSTANCE;
            xb.b("WebView stopped due to MRAID unload", webViewMraidUnload);
            a(webViewMraidUnload);
            a(nh.g);
            zf j = j();
            if (j != null) {
                j.b(webViewMraidUnload);
            }
        }
    }

    public final void a(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.y = function0;
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(nh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        xb.a("WebRenderable stopping: auctionId=" + q().c() + ", reason=" + reason + ", placementType=" + this.q, (Throwable) null, 2, (Object) null);
        il b2 = b();
        if (b2 != null) {
            b2.a();
        }
        cd cdVar = this.B;
        if (cdVar != null) {
            cdVar.a(reason);
        }
        cd cdVar2 = this.B;
        if (cdVar2 != null) {
            cdVar2.a((dd) null);
        }
        this.B = null;
        a((View) this.z);
        WebView webView = this.z;
        if (webView != null) {
            webView.setVisibility(8);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new f(webView, null), 3, null);
        }
    }

    public final void a(String str, boolean z, i4 i4Var) {
        List emptyList;
        zf j;
        y4 y4Var = this.r;
        if (y4Var != null) {
            String b2 = y4Var.b();
            zb a2 = cc.a(this.n, this.v, this.w, new g());
            List c2 = this.r.c();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(c2, 10));
            Iterator it = c2.iterator();
            while (it.hasNext()) {
                arrayList.add(cc.a((String) it.next(), a2));
            }
            a(b2, z);
            if (i4Var == null || (emptyList = i4Var.b()) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            if (!r().a(new i4.c(CollectionsKt.plus((Collection) emptyList, (Iterable) arrayList), b2), z) || (j = j()) == null) {
                return;
            }
            j.f();
            return;
        }
        super.b(str, z);
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(boolean z, Integer num, Integer num2, i4 i4Var) {
        y4 y4Var = this.r;
        a(y4Var != null ? y4Var.b() : null, z, i4Var);
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(float f2, boolean z) {
        super.a(f2, z);
        String format = String.format("document.querySelectorAll('video, audio').forEach(media => media.muted = %b);", Arrays.copyOf(new Object[]{Boolean.FALSE}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        WebView webView = this.z;
        if (webView != null) {
            webView.evaluateJavascript(format, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(WebView webView, Continuation continuation) {
        h hVar;
        int i;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i2 = hVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.e = i2 - Integer.MIN_VALUE;
                Object obj = hVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    hVar.b = webView;
                    hVar.e = 1;
                    if (DelayKt.delay(1100L, hVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    webView = (WebView) hVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                webView.onPause();
                webView.stopLoading();
                webView.destroy();
                return Unit.INSTANCE;
            }
        }
        hVar = new h(continuation);
        Object obj2 = hVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hVar.e;
        if (i != 0) {
        }
        webView.onPause();
        webView.stopLoading();
        webView.destroy();
        return Unit.INSTANCE;
    }
}
