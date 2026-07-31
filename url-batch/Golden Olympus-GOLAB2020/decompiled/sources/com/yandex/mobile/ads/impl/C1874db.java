package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.WindowInsetsCompat;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.db, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1874db {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f24535a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2226sb f24536b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2203rb f24537c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1970hb f24538d;

    public /* synthetic */ C1874db(Activity activity, C2226sb c2226sb) {
        this(activity, c2226sb, new C2203rb(), new C1970hb(activity, false, 14));
    }

    private static void a(ViewGroup viewGroup) {
        AbstractC1281a0.E0(viewGroup, new androidx.core.view.J() { // from class: com.yandex.mobile.ads.impl.Y0
            @Override // androidx.core.view.J
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat a4;
                a4 = C1874db.a(view, windowInsetsCompat);
                return a4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat a(View v4, WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(v4, "v");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        v4.setPadding(v4.getPaddingLeft(), v4.getPaddingTop(), v4.getPaddingRight(), insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    public C1874db(@NotNull Activity context, @NotNull C2226sb adtuneWebView, @NotNull C2203rb adtuneViewProvider, @NotNull C1970hb adtuneMeasureSpecProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adtuneWebView, "adtuneWebView");
        Intrinsics.checkNotNullParameter(adtuneViewProvider, "adtuneViewProvider");
        Intrinsics.checkNotNullParameter(adtuneMeasureSpecProvider, "adtuneMeasureSpecProvider");
        this.f24535a = context;
        this.f24536b = adtuneWebView;
        this.f24537c = adtuneViewProvider;
        this.f24538d = adtuneMeasureSpecProvider;
    }

    @SuppressLint({"InflateParams"})
    @NotNull
    public final ViewGroup a() {
        View inflate = LayoutInflater.from(this.f24535a).inflate(R.layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup adTuneContainer = (ViewGroup) inflate;
        this.f24537c.getClass();
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) adTuneContainer.findViewById(R.id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(this.f24538d);
        }
        this.f24537c.getClass();
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        ViewGroup viewGroup = (ViewGroup) adTuneContainer.findViewById(R.id.adtune_webview_container);
        if (viewGroup != null) {
            if (C2385z9.a(35)) {
                a(viewGroup);
            }
            viewGroup.addView(this.f24536b);
        }
        return adTuneContainer;
    }
}
