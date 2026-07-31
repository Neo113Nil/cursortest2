package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ou1 implements bq1<du1> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ew1 f30206a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final br1<du1> f30207b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mu1 f30208c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Context f30209d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ou1(Context context, mp1 mp1Var) {
        this(context, mp1Var, ew1.a.a(), new ru1(mp1Var), new mu1());
        int i4 = ew1.f25476l;
    }

    @Override // com.yandex.mobile.ads.impl.bq1
    public final du1 a(lc1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        return this.f30207b.a(networkResponse);
    }

    @Override // com.yandex.mobile.ads.impl.bq1
    public final boolean a() {
        du1 a4 = this.f30206a.a(this.f30209d);
        return a4 == null || this.f30208c.a(a4);
    }

    public ou1(@NotNull Context context, @NotNull mp1 reporter, @NotNull ew1 sdkSettings, @NotNull br1<du1> sdkConfigurationResponseParser, @NotNull mu1 sdkConfigurationRefreshChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        Intrinsics.checkNotNullParameter(sdkConfigurationResponseParser, "sdkConfigurationResponseParser");
        Intrinsics.checkNotNullParameter(sdkConfigurationRefreshChecker, "sdkConfigurationRefreshChecker");
        this.f30206a = sdkSettings;
        this.f30207b = sdkConfigurationResponseParser;
        this.f30208c = sdkConfigurationRefreshChecker;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f30209d = applicationContext;
    }
}
