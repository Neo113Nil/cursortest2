package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.yandex.mobile.ads.impl.nh2;
import com.yandex.mobile.ads.impl.yg1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class qf1 extends AbstractC1883dk implements hg0, yg1.b, nh2.a {

    /* renamed from: j, reason: collision with root package name */
    private static boolean f30761j;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f30762b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final nh2 f30763c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final yg1 f30764d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final sy1 f30765e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private jg0 f30766f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private ig0 f30767g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f30768h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30769i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ qf1(Context context) {
        this(context, r0, new nh2(), yg1.f35123h.a(r0));
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    protected void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        setBackgroundColor(0);
        setVisibility(4);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setScrollBarStyle(0);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportZoom(false);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setTextZoom(100);
        getSettings().setMinimumFontSize(1);
        getSettings().setMinimumLogicalFontSize(1);
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        if (C2385z9.a(21)) {
            settings.setMixedContentMode(2);
        }
        WebSettings settings2 = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings2, "getSettings(...)");
        settings2.setMediaPlaybackRequiresUserGesture(false);
        setWebViewClient(new gg0(this, xs1.b()));
        setWebChromeClient(new bg0());
    }

    @Override // com.yandex.mobile.ads.impl.nh2.a
    public final boolean b() {
        return this.f30769i;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1883dk
    @NotNull
    public String c() {
        return "<style type='text/css'> \n  * { \n      -webkit-tap-highlight-color: rgba(0, 0, 0, 0) !important; \n      -webkit-focus-ring-color: rgba(0, 0, 0, 0) !important; \n      outline: none !important; \n    } \n</style> \n" + gj2.a();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1883dk
    public void d() {
        setHtmlWebViewListener(null);
        super.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        jg0 j4;
        if (motionEvent != null && motionEvent.getAction() == 0 && (j4 = j()) != null) {
            j4.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    protected abstract void h();

    @NotNull
    public final Context i() {
        return this.f30762b;
    }

    @Nullable
    public jg0 j() {
        return this.f30766f;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30769i = true;
        this.f30764d.a(this);
        this.f30763c.getClass();
        a(nh2.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f30769i = false;
        this.f30763c.getClass();
        a(nh2.a(this));
        this.f30764d.b(this);
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(@NotNull View changedView, int i4) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i4);
        this.f30763c.getClass();
        a(nh2.a(this));
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        this.f30763c.getClass();
        a(nh2.a(this));
    }

    public final void setHtmlWebViewErrorListener(@Nullable ig0 ig0Var) {
        this.f30767g = ig0Var;
    }

    public void setHtmlWebViewListener(@Nullable jg0 jg0Var) {
        this.f30766f = jg0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf1(@NotNull Context context, @NotNull Context appContext, @NotNull nh2 viewableChecker, @NotNull yg1 phoneStateTracker) {
        super(appContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(viewableChecker, "viewableChecker");
        Intrinsics.checkNotNullParameter(phoneStateTracker, "phoneStateTracker");
        this.f30762b = appContext;
        this.f30763c = viewableChecker;
        this.f30764d = phoneStateTracker;
        this.f30765e = new sy1();
        a(context);
        if (f30761j) {
            return;
        }
        f30761j = true;
    }

    private final void a(boolean z4) {
        if (this.f30768h != z4) {
            this.f30768h = z4;
            jg0 j4 = j();
            if (j4 != null) {
                j4.a(this.f30768h);
            }
        }
    }

    public void a(@NotNull Context context, @NotNull String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        jg0 j4 = j();
        if (j4 != null) {
            j4.a(url);
        }
    }

    public void a() {
        this.f30765e.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Hc
            @Override // java.lang.Runnable
            public final void run() {
                qf1.a(qf1.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(qf1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.h();
    }

    @Override // com.yandex.mobile.ads.impl.yg1.b
    public final void a(@NotNull vg1 phoneState) {
        boolean z4;
        Intrinsics.checkNotNullParameter(phoneState, "phoneState");
        if (phoneState != vg1.f33620c) {
            this.f30763c.getClass();
            if (nh2.a(this) && this.f30764d.b()) {
                z4 = true;
                a(z4);
            }
        }
        z4 = false;
        a(z4);
    }

    public void a(int i4) {
        ig0 ig0Var = this.f30767g;
        if (ig0Var != null) {
            ig0Var.a(i4);
        }
    }
}
