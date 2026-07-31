package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ib, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1994ib {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f27148a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2089mb f27149b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2203rb f27150c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1970hb f27151d;

    public /* synthetic */ C1994ib(Context context, C2089mb c2089mb) {
        this(context, c2089mb, new C2203rb(), new C1970hb(context, true, 12));
    }

    @SuppressLint({"InflateParams"})
    @NotNull
    public final ViewGroup a() {
        View inflate = LayoutInflater.from(this.f27148a).inflate(R.layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup adTuneContainer = (ViewGroup) inflate;
        this.f27150c.getClass();
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) adTuneContainer.findViewById(R.id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(this.f27151d);
        }
        this.f27150c.getClass();
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        ViewGroup viewGroup = (ViewGroup) adTuneContainer.findViewById(R.id.adtune_webview_container);
        if (viewGroup != null) {
            viewGroup.addView(this.f27149b);
        }
        return adTuneContainer;
    }

    public C1994ib(@NotNull Context context, @NotNull C2089mb adtuneOptOutWebView, @NotNull C2203rb adtuneViewProvider, @NotNull C1970hb adtuneMeasureSpecProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adtuneOptOutWebView, "adtuneOptOutWebView");
        Intrinsics.checkNotNullParameter(adtuneViewProvider, "adtuneViewProvider");
        Intrinsics.checkNotNullParameter(adtuneMeasureSpecProvider, "adtuneMeasureSpecProvider");
        this.f27148a = context;
        this.f27149b = adtuneOptOutWebView;
        this.f27150c = adtuneViewProvider;
        this.f27151d = adtuneMeasureSpecProvider;
    }
}
