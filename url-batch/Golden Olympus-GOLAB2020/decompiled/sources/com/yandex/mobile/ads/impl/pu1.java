package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.AbstractC2372yj;
import com.yandex.mobile.ads.impl.hu1;
import com.yandex.mobile.ads.impl.iu1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pu1 implements AbstractC2372yj.a<du1>, yp1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ju1 f30579a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final hu1.a f30580b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2105n4 f30581c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Context f30582d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final xq f30583e;

    public pu1(@NotNull Context context, @NotNull ju1 sdkConfigurationProvider, @NotNull iu1.a.b sdkConfigurationLoadListener, @NotNull C2105n4 adLoadingPhasesManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkConfigurationProvider, "sdkConfigurationProvider");
        Intrinsics.checkNotNullParameter(sdkConfigurationLoadListener, "sdkConfigurationLoadListener");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f30579a = sdkConfigurationProvider;
        this.f30580b = sdkConfigurationLoadListener;
        this.f30581c = adLoadingPhasesManager;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f30582d = applicationContext;
        this.f30583e = xq.f34660c;
    }

    @Override // com.yandex.mobile.ads.impl.qq1.a
    public final void a(@NotNull hi2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f30581c.a(EnumC2082m4.f28856m);
        this.f30580b.a(error, this.f30583e);
    }

    @Override // com.yandex.mobile.ads.impl.yp1
    public final void b() {
        this.f30581c.a(EnumC2082m4.f28855l);
        C2105n4 c2105n4 = this.f30581c;
        EnumC2082m4 enumC2082m4 = EnumC2082m4.f28856m;
        C2001ij.a(c2105n4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
    }

    @Override // com.yandex.mobile.ads.impl.qq1.b
    public final void a(Object obj) {
        du1 sdkConfiguration = (du1) obj;
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        this.f30579a.a(this.f30582d, sdkConfiguration);
        this.f30581c.a(EnumC2082m4.f28856m);
        this.f30580b.a(sdkConfiguration, this.f30583e);
    }
}
