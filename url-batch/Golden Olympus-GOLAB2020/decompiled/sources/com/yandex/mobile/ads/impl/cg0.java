package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class cg0 extends qf1 implements kg0 {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f24197k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final yf1 f24198l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private jg0 f24199m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f24200n;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final yf1 f24201a;

        public a(@NotNull Context context, @NotNull yf1 partnerCodeAdRenderer) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(partnerCodeAdRenderer, "partnerCodeAdRenderer");
            this.f24201a = partnerCodeAdRenderer;
            new WeakReference(context);
        }

        @JavascriptInterface
        @NotNull
        public final String getBannerInfo() {
            return "{\"isDelicate\": false}";
        }

        @JavascriptInterface
        public final void onAdRender(int i4, @Nullable String str) {
            this.f24201a.a(i4, str);
        }
    }

    public /* synthetic */ cg0(Context context, C2360y7 c2360y7, C2286v2 c2286v2) {
        this(context, c2360y7, c2286v2, new zf1());
    }

    @Override // com.yandex.mobile.ads.impl.kg0
    public final void a(int i4, @Nullable String str) {
        ap0.d(new Object[0]);
        b(i4, str);
        super.a();
    }

    @SuppressLint({"AddJavascriptInterface"})
    protected abstract void a(@NotNull Context context, @NotNull C2286v2 c2286v2);

    @NotNull
    public final a b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new a(context, this.f24198l);
    }

    @Override // com.yandex.mobile.ads.impl.qf1, com.yandex.mobile.ads.impl.AbstractC1883dk
    @NotNull
    public String c() {
        String c4 = super.c();
        String b4 = gj2.b();
        if (!Intrinsics.areEqual("partner-code", this.f24197k.k())) {
            b4 = null;
        }
        if (b4 == null) {
            b4 = "";
        }
        return c4 + b4;
    }

    @Override // com.yandex.mobile.ads.impl.qf1, com.yandex.mobile.ads.impl.AbstractC1883dk
    public final void d() {
        this.f24198l.a();
        super.d();
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    @Nullable
    public final jg0 j() {
        return this.f24199m;
    }

    @NotNull
    public final C2360y7<?> k() {
        return this.f24197k;
    }

    @NotNull
    public final LinkedHashMap l() {
        return this.f24200n;
    }

    protected final boolean m() {
        return Intrinsics.areEqual("partner-code", this.f24197k.k());
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        Objects.toString(newConfig);
        ap0.d(new Object[0]);
        Intrinsics.checkNotNullParameter("AdPerformActionsJSI", "jsName");
        Object obj = this.f24653a.get("AdPerformActionsJSI");
        if (obj != null && (obj instanceof a)) {
            ap0.d(new Object[0]);
        }
        super.onConfigurationChanged(newConfig);
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public void setHtmlWebViewListener(@Nullable jg0 jg0Var) {
        this.f24198l.a(jg0Var);
        this.f24199m = jg0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected cg0(@NotNull Context context, @NotNull C2360y7<?> adResponse, @NotNull C2286v2 adConfiguration, @NotNull zf1 partnerCodeAdRendererFactory) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(partnerCodeAdRendererFactory, "partnerCodeAdRendererFactory");
        this.f24197k = adResponse;
        partnerCodeAdRendererFactory.getClass();
        this.f24198l = zf1.a(this);
        this.f24200n = new LinkedHashMap();
        a(context, adConfiguration);
    }

    public void b(int i4, @Nullable String str) {
        if (str == null || str.length() == 0 || Intrinsics.areEqual(str, StringUtils.UNDEFINED)) {
            return;
        }
        this.f24200n.put("test-tag", str);
    }

    @Override // com.yandex.mobile.ads.impl.qf1, com.yandex.mobile.ads.impl.hg0
    public final void a() {
        if (Intrinsics.areEqual("partner-code", this.f24197k.k())) {
            this.f24198l.b();
        } else {
            super.a();
        }
    }
}
