package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.C2126o2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2238t0 implements InterfaceC1984i1, C2126o2.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f32093a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final RelativeLayout f32094b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC1912f1 f32095c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Window f32096d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f32097e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private C2126o2 f32098f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final LinearLayout f32099g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final TextView f32100h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ProgressBar f32101i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final n82 f32102j;

    public C2238t0(@NotNull Context context, @NotNull RelativeLayout rootLayout, @NotNull C2193r1 adActivityListener, @NotNull Window window, @NotNull String browserUrl, @NotNull C2126o2 adBrowserView, @NotNull LinearLayout controlPanel, @NotNull TextView browserTitle, @NotNull ProgressBar browserProgressBar, @NotNull n82 urlViewerLauncher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootLayout, "rootLayout");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(browserUrl, "browserUrl");
        Intrinsics.checkNotNullParameter(adBrowserView, "adBrowserView");
        Intrinsics.checkNotNullParameter(controlPanel, "controlPanel");
        Intrinsics.checkNotNullParameter(browserTitle, "browserTitle");
        Intrinsics.checkNotNullParameter(browserProgressBar, "browserProgressBar");
        Intrinsics.checkNotNullParameter(urlViewerLauncher, "urlViewerLauncher");
        this.f32093a = context;
        this.f32094b = rootLayout;
        this.f32095c = adActivityListener;
        this.f32096d = window;
        this.f32097e = browserUrl;
        this.f32098f = adBrowserView;
        this.f32099g = controlPanel;
        this.f32100h = browserTitle;
        this.f32101i = browserProgressBar;
        this.f32102j = urlViewerLauncher;
    }

    private final void a(ImageView imageView, ImageView imageView2) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.Ce
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2238t0.a(C2238t0.this, view);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.De
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2238t0.b(C2238t0.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C2238t0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f32095c.a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final boolean e() {
        boolean z4;
        if (this.f32098f.canGoBack()) {
            C2126o2 c2126o2 = this.f32098f;
            if (c2126o2.canGoBack()) {
                c2126o2.goBack();
            }
            z4 = true;
        } else {
            z4 = false;
        }
        return !z4;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void g() {
        this.f32096d.requestFeature(1);
        if (C2385z9.a(16)) {
            this.f32096d.getDecorView().setSystemUiVisibility(UserVerificationMethods.USER_VERIFY_HANDPRINT);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void onAdClosed() {
        this.f32095c.a(8, null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void c() {
        this.f32094b.setBackgroundDrawable(C2177q7.f30696a);
        LinearLayout linearLayout = this.f32099g;
        ImageView b4 = C2199r7.b(this.f32093a);
        ImageView a4 = C2199r7.a(this.f32093a);
        a(b4, a4);
        linearLayout.addView(this.f32100h, new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(b4, new LinearLayout.LayoutParams(-2, -1));
        linearLayout.addView(a4, new LinearLayout.LayoutParams(-2, -1));
        RelativeLayout relativeLayout = this.f32094b;
        LinearLayout linearLayout2 = this.f32099g;
        Context context = this.f32093a;
        Intrinsics.checkNotNullParameter(context, "context");
        EnumC2222s7 enumC2222s7 = EnumC2222s7.f31610d;
        Intrinsics.checkNotNullParameter(context, "context");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, lh2.a(context, enumC2222s7.a(context)));
        layoutParams.addRule(10);
        relativeLayout.addView(linearLayout2, layoutParams);
        Context context2 = this.f32093a;
        LinearLayout anchorView = this.f32099g;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, lh2.a(context2, 2.0f));
        layoutParams2.addRule(3, anchorView.getId());
        this.f32094b.addView(this.f32101i, layoutParams2);
        a(8);
        RelativeLayout relativeLayout2 = this.f32094b;
        C2126o2 c2126o2 = this.f32098f;
        LinearLayout anchorView2 = this.f32099g;
        Intrinsics.checkNotNullParameter(anchorView2, "anchorView");
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(3, anchorView2.getId());
        relativeLayout2.addView(c2126o2, layoutParams3);
        this.f32098f.loadUrl(this.f32097e);
        this.f32095c.a(6, null);
        ap0.d(new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void d() {
        this.f32098f.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2238t0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String url = this$0.f32098f.getUrl();
        if (url != null) {
            this$0.f32102j.a(this$0.f32093a, url);
        }
    }

    @Override // com.yandex.mobile.ads.impl.C2126o2.c
    public final void b(@NotNull WebView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(8);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void b() {
        this.f32098f.e();
    }

    @Override // com.yandex.mobile.ads.impl.C2126o2.c
    public final void a(@NotNull WebView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(0);
    }

    @Override // com.yandex.mobile.ads.impl.C2126o2.c
    public final void a(@NotNull WebView view, int i4) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i5 = i4 * 100;
        this.f32101i.setProgress(i5);
        if (10000 > i5) {
            a(0);
        } else {
            this.f32100h.setText(view.getTitle());
            a(8);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void a() {
        this.f32098f.f();
    }

    private final void a(int i4) {
        if (i4 == 0 && this.f32101i.getVisibility() != 0) {
            this.f32101i.bringToFront();
            this.f32094b.requestLayout();
            this.f32094b.invalidate();
        }
        this.f32101i.setVisibility(i4);
    }
}
