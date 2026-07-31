package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z92 implements xp1<o92> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xp1<List<bb2>> f35513a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final fa2 f35514b;

    public z92(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull t92 adsRequestListener, @NotNull fa2 verificationResourcesLoader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adsRequestListener, "adsRequestListener");
        Intrinsics.checkNotNullParameter(verificationResourcesLoader, "verificationResourcesLoader");
        this.f35513a = adsRequestListener;
        this.f35514b = verificationResourcesLoader;
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(@NotNull hb2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f35513a.a(error);
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(@NotNull o92 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        final List<bb2> b4 = result.b().b();
        this.f35514b.a(b4, new ra2() { // from class: com.yandex.mobile.ads.impl.Fm
            @Override // com.yandex.mobile.ads.impl.ra2
            public final void a() {
                z92.a(z92.this, b4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(z92 this$0, List videoAds) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(videoAds, "$videoAds");
        this$0.f35513a.a((xp1<List<bb2>>) videoAds);
    }
}
