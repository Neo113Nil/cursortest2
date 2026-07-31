package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ik2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f27230a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x92 f27231b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final cd2 f27232c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Context f27233d;

    /* renamed from: e, reason: collision with root package name */
    private int f27234e;

    public ik2(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull x92 requestConfigurationParametersProvider, @NotNull cd2 reportParametersProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        Intrinsics.checkNotNullParameter(reportParametersProvider, "reportParametersProvider");
        this.f27230a = adConfiguration;
        this.f27231b = requestConfigurationParametersProvider;
        this.f27232c = reportParametersProvider;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f27233d = applicationContext;
    }

    public final void a(@NotNull Context context, @NotNull List<bb2> wrapperAds, @NotNull xp1<List<bb2>> listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrapperAds, "wrapperAds");
        Intrinsics.checkNotNullParameter(listener, "listener");
        int i4 = this.f27234e + 1;
        this.f27234e = i4;
        if (i4 > 5) {
            Intrinsics.checkNotNullParameter("Maximum count of VAST wrapper requests exceeded.", "description");
            listener.a(new hb2(1, "Maximum count of VAST wrapper requests exceeded."));
            return;
        }
        Context context2 = this.f27233d;
        C2286v2 c2286v2 = this.f27230a;
        cd2 cd2Var = this.f27232c;
        x92 x92Var = this.f27231b;
        new jk2(context2, c2286v2, cd2Var, x92Var, new fk2(context2, c2286v2, x92Var, cd2Var)).a(context, wrapperAds, listener);
    }
}
