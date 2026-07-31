package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.ironsource.b9;
import com.yandex.mobile.ads.impl.qi0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ym1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qi0 f35242a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zm1 f35243b;

    public /* synthetic */ ym1(Context context, zi0 zi0Var) {
        this(context, zi0Var, new qi0(context, new an0(true), zi0Var), new zm1());
    }

    public final void a(@NotNull no clickQrcode, @NotNull String clickUrl, @Nullable String str, @NotNull qi0.b listener) {
        Intrinsics.checkNotNullParameter(clickQrcode, "clickQrcode");
        Intrinsics.checkNotNullParameter(clickUrl, "clickUrl");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f35243b.getClass();
        Intrinsics.checkNotNullParameter(clickUrl, "clickUrl");
        Intrinsics.checkNotNullParameter(clickQrcode, "clickQrcode");
        Uri.Builder buildUpon = Uri.parse(clickQrcode.b()).buildUpon();
        buildUpon.appendQueryParameter("click_link", clickUrl);
        buildUpon.appendQueryParameter("size", String.valueOf(clickQrcode.a()));
        Intrinsics.checkNotNull(buildUpon);
        Intrinsics.checkNotNullParameter(buildUpon, "<this>");
        Intrinsics.checkNotNullParameter("brand_logo_link", b9.h.f15463W);
        if (str != null && str.length() != 0) {
            Intrinsics.checkNotNull(buildUpon.appendQueryParameter("brand_logo_link", str));
        }
        String uri = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        this.f35242a.a(new ej0(clickQrcode.a(), clickQrcode.a(), uri, null, 120), listener);
    }

    public ym1(@NotNull Context context, @NotNull zi0 imageProvider, @NotNull qi0 imageForPresentProvider, @NotNull zm1 qrcodeUrlConfigurator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(imageForPresentProvider, "imageForPresentProvider");
        Intrinsics.checkNotNullParameter(qrcodeUrlConfigurator, "qrcodeUrlConfigurator");
        this.f35242a = imageForPresentProvider;
        this.f35243b = qrcodeUrlConfigurator;
    }
}
