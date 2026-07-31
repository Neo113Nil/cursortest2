package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ei, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1905ei extends w52 {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final vo0 f25305k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC2302vi f25306l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final qs0 f25307m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f25308n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1905ei(@NotNull Context context, @NotNull C2360y7<String> adResponse, @NotNull C2286v2 adConfiguration, @NotNull vo0 adView, @NotNull InterfaceC2302vi bannerShowEventListener, @NotNull qs0 mainThreadHandler) {
        super(context, new C1897ea(adView), adResponse, adConfiguration);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(bannerShowEventListener, "bannerShowEventListener");
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        this.f25305k = adView;
        this.f25306l = bannerShowEventListener;
        this.f25307m = mainThreadHandler;
    }

    @Override // com.yandex.mobile.ads.impl.w52
    protected final boolean a(int i4) {
        return lh2.a(this.f25305k.findViewById(2), i4);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1954gj
    public final void c() {
        this.f25307m.a();
        super.c();
    }

    @Override // com.yandex.mobile.ads.impl.w52
    protected final boolean k() {
        return lh2.c(this.f25305k.findViewById(2));
    }

    @Override // com.yandex.mobile.ads.impl.w52
    protected final boolean l() {
        View findViewById = this.f25305k.findViewById(2);
        return findViewById != null && lh2.b(findViewById) >= 1;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2006j0
    public final void onLeftApplication() {
        this.f25306l.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2006j0
    public final void onReturnedToApplication() {
        this.f25306l.onReturnedToApplication();
    }

    @Override // com.yandex.mobile.ads.impl.yj0.a
    public final void a(@Nullable C1795a4 c1795a4) {
        if (this.f25308n) {
            return;
        }
        this.f25308n = true;
        this.f25306l.a(c1795a4);
    }
}
