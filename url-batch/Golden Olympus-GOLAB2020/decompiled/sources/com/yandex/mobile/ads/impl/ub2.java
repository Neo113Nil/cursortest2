package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ub2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f33007a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ac2 f33008b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f33009c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f33010d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ub2(Context context, C2286v2 c2286v2, C2105n4 c2105n4) {
        this(context, c2286v2, c2105n4, r4, r5);
        ac2 ac2Var = new ac2(context, c2286v2, c2105n4);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    public final void a(@NotNull w92 configuration, @NotNull nn0 requestConfigurationParametersProvider, @NotNull t92 requestListener) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        Context context = this.f33009c;
        vu1 p4 = this.f33007a.p();
        bn2 a4 = p4.a();
        this.f33008b.a(configuration, requestConfigurationParametersProvider, this.f33010d, new z92(context, p4, requestListener, new fa2(context, a4, a4.a(context))));
    }

    public ub2(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2105n4 adLoadingPhasesManager, @NotNull ac2 videoAdLoaderController, @NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(videoAdLoaderController, "videoAdLoaderController");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f33007a = adConfiguration;
        this.f33008b = videoAdLoaderController;
        this.f33009c = applicationContext;
        this.f33010d = new Object();
    }

    public final void a(@NotNull di2 vmapRequestConfig, @NotNull am0 requestListener) {
        Intrinsics.checkNotNullParameter(vmapRequestConfig, "vmapRequestConfig");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        this.f33008b.a(vmapRequestConfig, this.f33010d, requestListener);
    }
}
