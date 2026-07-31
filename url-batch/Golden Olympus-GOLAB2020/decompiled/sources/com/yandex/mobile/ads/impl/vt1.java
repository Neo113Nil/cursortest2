package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.xt1;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vt1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f33744a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vu1 f33745b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2286v2 f33746c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2360y7<String> f33747d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final vo0 f33748e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC2302vi f33749f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2024ji f33750g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final y11 f33751h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final fg0 f33752i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C2371yi f33753j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C1929fi f33754k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private a f33755l;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1905ei f33756a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final dg0 f33757b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final b f33758c;

        public a(@NotNull C1905ei contentController, @NotNull dg0 htmlWebViewAdapter, @NotNull b webViewListener) {
            Intrinsics.checkNotNullParameter(contentController, "contentController");
            Intrinsics.checkNotNullParameter(htmlWebViewAdapter, "htmlWebViewAdapter");
            Intrinsics.checkNotNullParameter(webViewListener, "webViewListener");
            this.f33756a = contentController;
            this.f33757b = htmlWebViewAdapter;
            this.f33758c = webViewListener;
        }

        @NotNull
        public final C1905ei a() {
            return this.f33756a;
        }

        @NotNull
        public final dg0 b() {
            return this.f33757b;
        }

        @NotNull
        public final b c() {
            return this.f33758c;
        }
    }

    public static final class b implements jg0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f33759a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final vu1 f33760b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final C2286v2 f33761c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final C2360y7<String> f33762d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final vt1 f33763e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final C1905ei f33764f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private ev1<vt1> f33765g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final ag0 f33766h;

        /* renamed from: i, reason: collision with root package name */
        @Nullable
        private final du1 f33767i;

        /* renamed from: j, reason: collision with root package name */
        @Nullable
        private WebView f33768j;

        /* renamed from: k, reason: collision with root package name */
        @Nullable
        private Map<String, String> f33769k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f33770l;

        public b(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull C2286v2 adConfiguration, @NotNull C2360y7<String> adResponse, @NotNull vt1 bannerHtmlAd, @NotNull C1905ei contentController, @NotNull ev1<vt1> creationListener, @NotNull ag0 htmlClickHandler, @Nullable du1 du1Var) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
            Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
            Intrinsics.checkNotNullParameter(adResponse, "adResponse");
            Intrinsics.checkNotNullParameter(bannerHtmlAd, "bannerHtmlAd");
            Intrinsics.checkNotNullParameter(contentController, "contentController");
            Intrinsics.checkNotNullParameter(creationListener, "creationListener");
            Intrinsics.checkNotNullParameter(htmlClickHandler, "htmlClickHandler");
            this.f33759a = context;
            this.f33760b = sdkEnvironmentModule;
            this.f33761c = adConfiguration;
            this.f33762d = adResponse;
            this.f33763e = bannerHtmlAd;
            this.f33764f = contentController;
            this.f33765g = creationListener;
            this.f33766h = htmlClickHandler;
            this.f33767i = du1Var;
        }

        @Override // com.yandex.mobile.ads.impl.jg0
        public final void a(boolean z4) {
        }

        @Nullable
        public final Map<String, String> b() {
            return this.f33769k;
        }

        @Nullable
        public final WebView c() {
            return this.f33768j;
        }

        @Override // com.yandex.mobile.ads.impl.jg0
        public final void a(@NotNull C1866d3 adFetchRequestError) {
            Intrinsics.checkNotNullParameter(adFetchRequestError, "adFetchRequestError");
            this.f33765g.a(adFetchRequestError);
        }

        @Override // com.yandex.mobile.ads.impl.jg0
        public final void a(@NotNull qf1 webView, @NotNull Map trackingParameters) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Intrinsics.checkNotNullParameter(trackingParameters, "trackingParameters");
            this.f33768j = webView;
            this.f33769k = trackingParameters;
            this.f33765g.a((ev1<vt1>) this.f33763e);
        }

        @Override // com.yandex.mobile.ads.impl.jg0
        public final void a(@NotNull String clickUrl) {
            Intrinsics.checkNotNullParameter(clickUrl, "clickUrl");
            du1 du1Var = this.f33767i;
            if (du1Var == null || !du1Var.V() || this.f33770l) {
                Context context = this.f33759a;
                vu1 vu1Var = this.f33760b;
                this.f33766h.a(clickUrl, this.f33762d, new C2171q1(context, this.f33762d, this.f33764f.i(), vu1Var, this.f33761c));
                this.f33770l = false;
            }
        }

        @Override // com.yandex.mobile.ads.impl.jg0
        public final void a() {
            this.f33770l = true;
        }
    }

    public vt1(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull C2286v2 adConfiguration, @NotNull C2360y7 adResponse, @NotNull vo0 adView, @NotNull C1977hi bannerShowEventListener, @NotNull C2024ji sizeValidator, @NotNull y11 mraidCompatibilityDetector, @NotNull fg0 htmlWebViewAdapterFactoryProvider, @NotNull C2371yi bannerWebViewFactory, @NotNull C1929fi bannerAdContentControllerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(bannerShowEventListener, "bannerShowEventListener");
        Intrinsics.checkNotNullParameter(sizeValidator, "sizeValidator");
        Intrinsics.checkNotNullParameter(mraidCompatibilityDetector, "mraidCompatibilityDetector");
        Intrinsics.checkNotNullParameter(htmlWebViewAdapterFactoryProvider, "htmlWebViewAdapterFactoryProvider");
        Intrinsics.checkNotNullParameter(bannerWebViewFactory, "bannerWebViewFactory");
        Intrinsics.checkNotNullParameter(bannerAdContentControllerFactory, "bannerAdContentControllerFactory");
        this.f33744a = context;
        this.f33745b = sdkEnvironmentModule;
        this.f33746c = adConfiguration;
        this.f33747d = adResponse;
        this.f33748e = adView;
        this.f33749f = bannerShowEventListener;
        this.f33750g = sizeValidator;
        this.f33751h = mraidCompatibilityDetector;
        this.f33752i = htmlWebViewAdapterFactoryProvider;
        this.f33753j = bannerWebViewFactory;
        this.f33754k = bannerAdContentControllerFactory;
    }

    public final void a(@NotNull vy1 configurationSizeInfo, @NotNull String htmlResponse, @NotNull fe2 videoEventController, @NotNull ev1<vt1> creationListener) {
        Intrinsics.checkNotNullParameter(configurationSizeInfo, "configurationSizeInfo");
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        Intrinsics.checkNotNullParameter(creationListener, "creationListener");
        C2348xi a4 = this.f33753j.a(this.f33747d, configurationSizeInfo);
        this.f33751h.getClass();
        boolean a5 = y11.a(htmlResponse);
        C1929fi c1929fi = this.f33754k;
        Context context = this.f33744a;
        C2360y7<String> adResponse = this.f33747d;
        C2286v2 adConfiguration = this.f33746c;
        vo0 adView = this.f33748e;
        InterfaceC2302vi bannerShowEventListener = this.f33749f;
        c1929fi.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(bannerShowEventListener, "bannerShowEventListener");
        C1905ei c1905ei = new C1905ei(context, adResponse, adConfiguration, adView, bannerShowEventListener, new qs0());
        xj0 j4 = c1905ei.j();
        Context context2 = this.f33744a;
        vu1 vu1Var = this.f33745b;
        C2286v2 c2286v2 = this.f33746c;
        C2360y7<String> c2360y7 = this.f33747d;
        ag0 ag0Var = new ag0(context2, c2286v2);
        int i4 = ew1.f25476l;
        b bVar = new b(context2, vu1Var, c2286v2, c2360y7, this, c1905ei, creationListener, ag0Var, ew1.a.a().a(context2));
        this.f33752i.getClass();
        dg0 a6 = (a5 ? new d21() : new C2280uj()).a(a4, bVar, videoEventController, j4);
        this.f33755l = new a(c1905ei, a6, bVar);
        a6.a(htmlResponse);
    }

    public final void a() {
        a aVar = this.f33755l;
        if (aVar != null) {
            aVar.b().invalidate();
            aVar.a().c();
        }
        this.f33755l = null;
    }

    public final void a(@NotNull st1 showEventListener) {
        Intrinsics.checkNotNullParameter(showEventListener, "showEventListener");
        a aVar = this.f33755l;
        if (aVar == null) {
            showEventListener.a(C1942g7.i());
            return;
        }
        C1905ei a4 = aVar.a();
        WebView contentView = aVar.c().c();
        Map<String, String> b4 = aVar.c().b();
        if (contentView instanceof C2348xi) {
            C2348xi c2348xi = (C2348xi) contentView;
            vy1 o4 = c2348xi.o();
            vy1 q4 = this.f33746c.q();
            if (o4 != null && q4 != null && xy1.a(this.f33744a, this.f33747d, o4, this.f33750g, q4)) {
                this.f33748e.setVisibility(0);
                vo0 vo0Var = this.f33748e;
                xt1 xt1Var = new xt1(vo0Var, a4, new qs0(), new xt1.a(vo0Var));
                Context context = this.f33744a;
                vo0 vo0Var2 = this.f33748e;
                vy1 o5 = c2348xi.o();
                int i4 = og2.f30037b;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(contentView, "contentView");
                if (vo0Var2 != null && vo0Var2.indexOfChild(contentView) == -1) {
                    RelativeLayout.LayoutParams a5 = C2314w7.a(context, o5);
                    vo0Var2.setVisibility(0);
                    contentView.setVisibility(0);
                    vo0Var2.addView(contentView, a5);
                    lh2.a(contentView, xt1Var);
                }
                a4.a(b4);
                showEventListener.a();
                return;
            }
        }
        showEventListener.a(C1942g7.b());
    }
}
