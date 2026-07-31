package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class tb2 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f32287b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private static volatile tb2 f32288c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f32289d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final cq1 f32290a;

    public static final class a {
        @NotNull
        public static tb2 a(@NotNull Context context) {
            tb2 tb2Var;
            Intrinsics.checkNotNullParameter(context, "context");
            tb2 tb2Var2 = tb2.f32288c;
            if (tb2Var2 != null) {
                return tb2Var2;
            }
            synchronized (tb2.f32287b) {
                tb2Var = tb2.f32288c;
                if (tb2Var == null) {
                    tb2Var = new tb2(xk2.a(context, 1));
                    tb2.f32288c = tb2Var;
                }
            }
            return tb2Var;
        }
    }

    public tb2(@NotNull cq1 requestQueue) {
        Intrinsics.checkNotNullParameter(requestQueue, "requestQueue");
        this.f32290a = requestQueue;
    }

    public final void a(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull w92 requestConfiguration, @NotNull x92 requestConfigurationParametersProvider, @NotNull Object requestTag, @NotNull p92 requestListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        Intrinsics.checkNotNullParameter(requestTag, "requestTag");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        Intrinsics.checkNotNullParameter(requestTag, "requestTag");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        this.f32290a.a(new y92(new ea2()).a(context, adConfiguration, requestConfiguration, requestConfigurationParametersProvider, requestTag, requestListener));
    }

    public final void a(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull x92 requestConfigurationParametersProvider, @NotNull bb2 wrapperAd, @NotNull cd2 reportParametersProvider, @NotNull gk2 requestListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        Intrinsics.checkNotNullParameter(wrapperAd, "wrapperAd");
        Intrinsics.checkNotNullParameter(reportParametersProvider, "reportParametersProvider");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        Intrinsics.checkNotNullParameter(wrapperAd, "wrapperAd");
        Intrinsics.checkNotNullParameter(reportParametersProvider, "reportParametersProvider");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        this.f32290a.a(new ok2(new ea2(), new zm0()).a(context, adConfiguration, requestConfigurationParametersProvider, wrapperAd, reportParametersProvider, requestListener));
    }

    public final void a(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull di2 requestConfiguration, @NotNull Object requestTag, @NotNull fi2 requestListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(requestTag, "requestTag");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(requestTag, "requestTag");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        C2061l7 c2061l7 = new C2061l7();
        gi2 gi2Var = new gi2();
        vp1 vp1Var = new vp1();
        this.f32290a.a(new ei2(c2061l7, gi2Var, vp1Var, new up(vp1Var), new z40(), new zw1()).a(context, adConfiguration, requestConfiguration, requestTag, requestListener));
    }
}
