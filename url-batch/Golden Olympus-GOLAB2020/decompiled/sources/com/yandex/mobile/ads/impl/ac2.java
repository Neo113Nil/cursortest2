package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.tb2;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ac2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f23226a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2105n4 f23227b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final tb2 f23228c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final q92 f23229d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC3316J f23230e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final jv1 f23231f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ib2 f23232g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Context f23233h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f23234i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ac2(Context context, C2286v2 c2286v2, C2105n4 c2105n4) {
        this(context, c2286v2, c2105n4, r5, r6, r7, r8, r9, r10);
        int i4 = tb2.f32289d;
        tb2 a4 = tb2.a.a(context);
        q92 q92Var = new q92(c2286v2, c2105n4);
        InterfaceC3316J a5 = fu.a((j50) c2286v2.p().c());
        jv1 jv1Var = new jv1(context, c2286v2.p(), a5, c2105n4, null, null, 1048560);
        ib2 ib2Var = new ib2();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    public static final void a(ac2 ac2Var, C1803ac c1803ac, d50 d50Var) {
        ac2Var.f23226a.a(c1803ac);
        ac2Var.f23226a.a(d50Var);
    }

    public final void a(@NotNull w92 configuration, @NotNull nn0 requestConfigurationParametersProvider, @NotNull Object requestTag, @NotNull z92 requestListener) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        Intrinsics.checkNotNullParameter(requestTag, "requestTag");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        wb2 wb2Var = new wb2(this, configuration, requestConfigurationParametersProvider, requestListener, requestTag);
        xb2 xb2Var = new xb2(requestListener);
        if (this.f23234i.contains(requestTag)) {
            wb2Var.invoke();
        } else {
            AbstractC3337k.d(this.f23230e, null, null, new vb2(this, requestTag, wb2Var, xb2Var, null), 3, null);
        }
    }

    public ac2(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2105n4 adLoadingPhasesManager, @NotNull tb2 videoAdLoadNetwork, @NotNull q92 vastDataRequestListenerFactory, @NotNull InterfaceC3316J coroutineScope, @NotNull jv1 sdkInitializer, @NotNull ib2 videoAdErrorProvider, @NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(videoAdLoadNetwork, "videoAdLoadNetwork");
        Intrinsics.checkNotNullParameter(vastDataRequestListenerFactory, "vastDataRequestListenerFactory");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(sdkInitializer, "sdkInitializer");
        Intrinsics.checkNotNullParameter(videoAdErrorProvider, "videoAdErrorProvider");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f23226a = adConfiguration;
        this.f23227b = adLoadingPhasesManager;
        this.f23228c = videoAdLoadNetwork;
        this.f23229d = vastDataRequestListenerFactory;
        this.f23230e = coroutineScope;
        this.f23231f = sdkInitializer;
        this.f23232g = videoAdErrorProvider;
        this.f23233h = applicationContext;
        this.f23234i = new LinkedHashSet();
    }

    public final void a(@NotNull di2 configuration, @NotNull Object requestTag, @NotNull am0 requestListener) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(requestTag, "requestTag");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        yb2 yb2Var = new yb2(this, requestListener, configuration, requestTag);
        zb2 zb2Var = new zb2(requestListener);
        if (this.f23234i.contains(requestTag)) {
            yb2Var.invoke();
        } else {
            AbstractC3337k.d(this.f23230e, null, null, new vb2(this, requestTag, yb2Var, zb2Var, null), 3, null);
        }
    }
}
