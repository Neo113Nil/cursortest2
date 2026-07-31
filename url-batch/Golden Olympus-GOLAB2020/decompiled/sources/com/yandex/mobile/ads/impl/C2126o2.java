package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yandex.mobile.ads.impl.l82;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.o2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2126o2 extends AbstractC1883dk {

    /* renamed from: com.yandex.mobile.ads.impl.o2$a */
    private final class a extends WebChromeClient {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ m2.h[] f29864b = {C1873da.a(a.class, "context", "getContext()Landroid/content/Context;", 0)};

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ao1 f29865a;

        public a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f29865a = bo1.a(context);
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(@NotNull WebView view, int i4) {
            Intrinsics.checkNotNullParameter(view, "view");
            Object obj = (Context) this.f29865a.getValue(this, f29864b[0]);
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar != null) {
                cVar.a(view, i4);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.o2$b */
    private final class b extends WebViewClient {

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ m2.h[] f29866d = {C1873da.a(b.class, "context", "getContext()Landroid/content/Context;", 0)};

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ao1 f29867a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final oj2 f29868b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final n82 f29869c;

        public b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f29867a = bo1.a(context);
            this.f29868b = xs1.b();
            this.f29869c = new n82();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(@NotNull WebView view, @Nullable String str) {
            Intrinsics.checkNotNullParameter(view, "view");
            super.onPageFinished(view, str);
            Object obj = (Context) this.f29867a.getValue(this, f29866d[0]);
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar != null) {
                cVar.b(view);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(@NotNull WebView view, @Nullable String str, @Nullable Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(view, "view");
            super.onPageStarted(view, str, bitmap);
            Object obj = (Context) this.f29867a.getValue(this, f29866d[0]);
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar != null) {
                cVar.a(view);
            }
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"WebViewClientOnReceivedSslError"})
        public final void onReceivedSslError(@NotNull WebView view, @NotNull SslErrorHandler handler, @NotNull SslError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(error, "error");
            oj2 oj2Var = this.f29868b;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (oj2Var.a(context, error)) {
                handler.proceed();
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean onRenderProcessGone(@Nullable WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail) {
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(@NotNull WebView view, @Nullable String str) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (str == null || str.length() <= 0) {
                return false;
            }
            l82.f28461a.getClass();
            if (!l82.a.c(str) && URLUtil.isNetworkUrl(str)) {
                return false;
            }
            n82 n82Var = this.f29869c;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return n82Var.a(context, str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.o2$c */
    public interface c {
        void a(@NotNull WebView webView);

        void a(@NotNull WebView webView, int i4);

        void b(@NotNull WebView webView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2126o2(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        a(context);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    protected final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        setBackgroundColor(-1);
        setInitialScale(1);
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        setDisplayZoomControls(false);
        setScrollbarFadingEnabled(true);
        setDrawingCacheEnabled(true);
        setWebChromeClient(new a(context));
        setWebViewClient(new b(context));
    }
}
