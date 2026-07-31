package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wc0 implements jg0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<String> f33995a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final du1 f33996b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ag0 f33997c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2171q1 f33998d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private sr f33999e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private i62 f34000f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f34001g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wc0(Context context, vu1 vu1Var, C2286v2 c2286v2, C2360y7 c2360y7, C1871d8 c1871d8) {
        this(context, vu1Var, c2286v2, c2360y7, c1871d8, ew1.a.a().a(context));
        int i4 = ew1.f25476l;
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final void a(boolean z4) {
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final void a(@NotNull C1866d3 adFetchRequestError) {
        Intrinsics.checkNotNullParameter(adFetchRequestError, "adFetchRequestError");
        sr srVar = this.f33999e;
        if (srVar != null) {
            srVar.a(adFetchRequestError);
        }
    }

    public wc0(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull C2286v2 adConfiguration, @NotNull C2360y7<String> adResponse, @NotNull C1871d8 adResultReceiver, @Nullable du1 du1Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adResultReceiver, "adResultReceiver");
        this.f33995a = adResponse;
        this.f33996b = du1Var;
        this.f33997c = new ag0(context, adConfiguration);
        this.f33998d = new C2171q1(context, adResponse, adResultReceiver, sdkEnvironmentModule, adConfiguration);
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final void a(@NotNull qf1 webView, @NotNull Map trackingParameters) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(trackingParameters, "trackingParameters");
        i62 i62Var = this.f34000f;
        if (i62Var != null) {
            i62Var.a(trackingParameters);
        }
        sr srVar = this.f33999e;
        if (srVar != null) {
            srVar.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        du1 du1Var = this.f33996b;
        if (du1Var == null || !du1Var.V() || this.f34001g) {
            this.f33997c.a(url, this.f33995a, this.f33998d);
            this.f34001g = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final void a() {
        this.f34001g = true;
    }

    public final void a(@Nullable sr srVar) {
        this.f33999e = srVar;
    }

    public final void a(@Nullable pc0 pc0Var) {
        this.f34000f = pc0Var;
    }
}
