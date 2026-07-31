package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.yf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2368yf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ob2<on0> f35087a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xe1 f35088b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final bg2 f35089c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final vn0 f35090d;

    public C2368yf(@NotNull ob2<on0> videoAdInfo, @NotNull xe1 adClickHandler, @NotNull bg2 videoTracker) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(adClickHandler, "adClickHandler");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        this.f35087a = videoAdInfo;
        this.f35088b = adClickHandler;
        this.f35089c = videoTracker;
        this.f35090d = new vn0(new iu());
    }

    public final void a(@NotNull View view, @Nullable C2276uf<?> c2276uf) {
        String a4;
        Intrinsics.checkNotNullParameter(view, "view");
        if (c2276uf == null || !c2276uf.e() || (a4 = this.f35090d.a(this.f35087a.b(), c2276uf.b()).a()) == null) {
            return;
        }
        view.setOnClickListener(new ViewOnClickListenerC2046kg(this.f35088b, a4, c2276uf.b(), this.f35089c));
    }
}
