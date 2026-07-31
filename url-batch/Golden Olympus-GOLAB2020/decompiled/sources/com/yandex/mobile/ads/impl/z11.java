package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.aq1;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.f21;
import com.yandex.mobile.ads.impl.g21;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class z11 implements se1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qf1 f35425a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final t11 f35426b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final g21 f35427c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final nh2 f35428d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final l82 f35429e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final g70 f35430f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final du1 f35431g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final m21 f35432h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f35433i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final i70<?> f35434j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final String f35435k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private h21 f35436l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private f11 f35437m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    private e11 f35438n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    private re1 f35439o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    private ke2 f35440p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private ih2 f35441q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    private f70 f35442r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ z11(qf1 qf1Var) {
        this(qf1Var, r2, r3, r4, r5, r6, ew1.a.a().a(qf1Var.i()));
        t11 t11Var = new t11(qf1Var);
        g21 g21Var = new g21();
        nh2 nh2Var = new nh2();
        l82 l82Var = new l82();
        g70 g70Var = new g70();
        int i4 = ew1.f25476l;
    }

    public final void c() {
        this.f35433i = true;
        h21 h21Var = this.f35436l;
        if (h21Var != null) {
            h21Var.a();
        }
    }

    private final class a implements hg0 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.hg0
        public final void a(@NotNull Context context, @NotNull String url) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            z11.this.f35425a.a(context, url);
        }

        @Override // com.yandex.mobile.ads.impl.hg0
        public final void a() {
            z11.this.f35425a.a();
        }

        @Override // com.yandex.mobile.ads.impl.hg0
        public final void a(int i4) {
            z11.this.f35425a.a(i4);
        }
    }

    private final void a(f21 f21Var, LinkedHashMap linkedHashMap) {
        if (this.f35436l == null) {
            throw new x11("Invalid state to execute this command");
        }
        switch (f21Var.ordinal()) {
            case 0:
                ke2 ke2Var = this.f35440p;
                if (ke2Var != null) {
                    ke2Var.onVideoComplete();
                    return;
                }
                return;
            case 1:
                e11 e11Var = this.f35438n;
                if (e11Var != null) {
                    e11Var.e();
                    return;
                }
                return;
            case 2:
                e11 e11Var2 = this.f35438n;
                if (e11Var2 != null) {
                    e11Var2.b();
                    return;
                }
                return;
            case 3:
                if (ih2.f27201c == this.f35441q) {
                    ih2 ih2Var = ih2.f27203e;
                    this.f35441q = ih2Var;
                    this.f35426b.a(ih2Var);
                    re1 re1Var = this.f35439o;
                    if (re1Var != null) {
                        re1Var.c();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                a(linkedHashMap);
                return;
            case 5:
                f11 f11Var = this.f35437m;
                if (f11Var != null) {
                    f11Var.a();
                    return;
                }
                return;
            case 6:
                boolean parseBoolean = Boolean.parseBoolean((String) linkedHashMap.get("shouldUseCustomClose"));
                re1 re1Var2 = this.f35439o;
                if (re1Var2 != null) {
                    re1Var2.a(parseBoolean);
                    return;
                }
                return;
            case 7:
            default:
                throw new x11("Unspecified MRAID Javascript command");
            case 8:
                du1 du1Var = this.f35431g;
                if (du1Var == null || !du1Var.Q()) {
                    return;
                }
                this.f35425a.a();
                return;
        }
    }

    public final void b(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f35429e.getClass();
        if (!l82.a(url)) {
            ap0.f(new Object[0]);
            this.f35426b.a(f21.f25591d, "Mraid command sent an invalid URL");
            return;
        }
        Uri parse = Uri.parse(url);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        if (!Intrinsics.areEqual("mraid", scheme) && !Intrinsics.areEqual("mobileads", scheme)) {
            a(MapsKt.mapOf(TuplesKt.to("url", url)));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : parse.getQueryParameterNames()) {
            String queryParameter = parse.getQueryParameter(str);
            Intrinsics.checkNotNull(str);
            linkedHashMap.put(str, queryParameter);
        }
        f21.f25590c.getClass();
        f21 a4 = f21.a.a(host);
        try {
            a(a4, linkedHashMap);
        } catch (Exception e4) {
            String message = e4.getMessage();
            if (message == null) {
                message = "Unknown exception";
            }
            this.f35426b.a(a4, message);
        }
        this.f35426b.a(a4);
    }

    public z11(@NotNull qf1 mraidWebView, @NotNull t11 mraidBridge, @NotNull g21 mraidJsControllerLoader, @NotNull nh2 viewableChecker, @NotNull l82 urlUtils, @NotNull g70 exposureProvider, @Nullable du1 du1Var) {
        Intrinsics.checkNotNullParameter(mraidWebView, "mraidWebView");
        Intrinsics.checkNotNullParameter(mraidBridge, "mraidBridge");
        Intrinsics.checkNotNullParameter(mraidJsControllerLoader, "mraidJsControllerLoader");
        Intrinsics.checkNotNullParameter(viewableChecker, "viewableChecker");
        Intrinsics.checkNotNullParameter(urlUtils, "urlUtils");
        Intrinsics.checkNotNullParameter(exposureProvider, "exposureProvider");
        this.f35425a = mraidWebView;
        this.f35426b = mraidBridge;
        this.f35427c = mraidJsControllerLoader;
        this.f35428d = viewableChecker;
        this.f35429e = urlUtils;
        this.f35430f = exposureProvider;
        this.f35431g = du1Var;
        m21 m21Var = new m21(new a());
        this.f35432h = m21Var;
        this.f35441q = ih2.f27202d;
        mraidWebView.setWebViewClient(m21Var);
        this.f35434j = new i70<>(mraidWebView, exposureProvider, this);
        this.f35435k = C2362y9.a(this);
    }

    private final void a(Map<String, String> map) {
        if (this.f35436l != null) {
            du1 du1Var = this.f35431g;
            if (du1Var == null || !du1Var.V() || this.f35433i) {
                String str = map.get("url");
                if (str != null && str.length() > 0) {
                    h21 h21Var = this.f35436l;
                    if (h21Var != null) {
                        h21Var.a(str);
                    }
                    Object[] args = {str};
                    int i4 = ap0.f23396b;
                    Intrinsics.checkNotNullParameter(args, "args");
                    return;
                }
                kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
                throw new x11(C2284v0.a(new Object[]{str}, 1, "Mraid open command sent an invalid URL: %s", "format(...)"));
            }
        }
    }

    public final void b() {
        if (ih2.f27201c == this.f35441q) {
            ih2 ih2Var = ih2.f27203e;
            this.f35441q = ih2Var;
            this.f35426b.a(ih2Var);
        }
    }

    public final void a() {
        this.f35434j.b();
        g21 g21Var = this.f35427c;
        Context context = this.f35425a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String requestTag = this.f35435k;
        g21Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestTag, "requestTag");
        int i4 = aq1.f23419c;
        aq1.a.a();
        aq1.a(context, requestTag);
        this.f35436l = null;
        this.f35437m = null;
        this.f35438n = null;
        this.f35439o = null;
        this.f35440p = null;
    }

    public final void a(@NotNull final String htmlResponse) {
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        Context context = this.f35425a.getContext();
        g21 g21Var = this.f35427c;
        Intrinsics.checkNotNull(context);
        String str = this.f35435k;
        g21.a aVar = new g21.a() { // from class: com.yandex.mobile.ads.impl.Em
            @Override // com.yandex.mobile.ads.impl.g21.a
            public final void a(String str2) {
                z11.a(z11.this, htmlResponse, str2);
            }
        };
        g21Var.getClass();
        g21.a(context, str, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(z11 this$0, String htmlResponse, String mraidJavascript) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(htmlResponse, "$htmlResponse");
        Intrinsics.checkNotNullParameter(mraidJavascript, "mraidJavascript");
        this$0.f35432h.a(mraidJavascript);
        this$0.f35426b.b(htmlResponse);
    }

    public final void a(@NotNull qf1 webView, @NotNull Map trackingParameters) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(trackingParameters, "trackingParameters");
        j32 j32Var = new j32(this.f35425a);
        nh2 nh2Var = this.f35428d;
        qf1 qf1Var = this.f35425a;
        nh2Var.getClass();
        rh2 rh2Var = new rh2(nh2.a(qf1Var));
        f70 a4 = this.f35430f.a(this.f35425a);
        h70 h70Var = new h70(a4.a(), a4.b());
        ih2 ih2Var = ih2.f27201c;
        this.f35441q = ih2Var;
        this.f35426b.a(ih2Var, rh2Var, h70Var, j32Var);
        this.f35426b.a();
        h21 h21Var = this.f35436l;
        if (h21Var != null) {
            h21Var.a(webView, trackingParameters);
        }
    }

    @Override // com.yandex.mobile.ads.impl.se1
    public final void a(@NotNull f70 exposure) {
        Intrinsics.checkNotNullParameter(exposure, "exposure");
        if (Intrinsics.areEqual(exposure, this.f35442r)) {
            return;
        }
        this.f35442r = exposure;
        this.f35426b.a(new h70(exposure.a(), exposure.b()));
    }

    public final void a(boolean z4) {
        this.f35426b.a(new rh2(z4));
        if (z4) {
            this.f35434j.a();
            return;
        }
        this.f35434j.b();
        f70 a4 = this.f35430f.a(this.f35425a);
        if (Intrinsics.areEqual(a4, this.f35442r)) {
            return;
        }
        this.f35442r = a4;
        this.f35426b.a(new h70(a4.a(), a4.b()));
    }

    public final void a(@Nullable e11 e11Var) {
        this.f35438n = e11Var;
    }

    public final void a(@Nullable f11 f11Var) {
        this.f35437m = f11Var;
    }

    public final void a(@Nullable h21 h21Var) {
        this.f35436l = h21Var;
    }

    public final void a(@Nullable re1 re1Var) {
        this.f35439o = re1Var;
    }

    public final void a(@Nullable ke2 ke2Var) {
        this.f35440p = ke2Var;
    }
}
