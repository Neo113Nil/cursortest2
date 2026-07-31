package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class mm1 implements zc0<ur1> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bs1 f29173a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f29174b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2151p4 f29175c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private String f29176d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private ut f29177e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private InterfaceC2034k4 f29178f;

    public /* synthetic */ mm1(Context context, C2286v2 c2286v2, C2105n4 c2105n4, bs1 bs1Var) {
        this(context, c2286v2, c2105n4, bs1Var, new Handler(Looper.getMainLooper()), new C2151p4(context, c2286v2, c2105n4));
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    public final void a(@NotNull final C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f29175c.a(error.c());
        this.f29174b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.X9
            @Override // java.lang.Runnable
            public final void run() {
                mm1.a(C1866d3.this, this);
            }
        });
    }

    public mm1(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2105n4 adLoadingPhasesManager, @NotNull bs1 rewardedAdShowApiControllerFactoryFactory, @NotNull Handler handler, @NotNull C2151p4 adLoadingResultReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(rewardedAdShowApiControllerFactoryFactory, "rewardedAdShowApiControllerFactoryFactory");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(adLoadingResultReporter, "adLoadingResultReporter");
        this.f29173a = rewardedAdShowApiControllerFactoryFactory;
        this.f29174b = handler;
        this.f29175c = adLoadingResultReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1866d3 error, mm1 this$0) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C1866d3 c1866d3 = new C1866d3(error.b(), error.c(), error.d(), this$0.f29176d);
        ut utVar = this$0.f29177e;
        if (utVar != null) {
            utVar.a(c1866d3);
        }
        InterfaceC2034k4 interfaceC2034k4 = this$0.f29178f;
        if (interfaceC2034k4 != null) {
            interfaceC2034k4.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    public final void a(@NotNull ur1 ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f29175c.a();
        final as1 a4 = this.f29173a.a(ad);
        this.f29174b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Y9
            @Override // java.lang.Runnable
            public final void run() {
                mm1.a(mm1.this, a4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(mm1 this$0, as1 interstitial) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interstitial, "$interstitial");
        ut utVar = this$0.f29177e;
        if (utVar != null) {
            utVar.a(interstitial);
        }
        InterfaceC2034k4 interfaceC2034k4 = this$0.f29178f;
        if (interfaceC2034k4 != null) {
            interfaceC2034k4.a();
        }
    }

    public final void a(@NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f29175c.a(new C1990i7(adConfiguration));
    }

    public final void a(@Nullable String str) {
        this.f29176d = str;
    }

    public final void a(@NotNull InterfaceC2034k4 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f29178f = listener;
    }

    public final void a(@Nullable ut utVar) {
        this.f29177e = utVar;
        this.f29175c.a(utVar);
    }

    public final void a(@NotNull yf0 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f29175c.a(reportParameterManager);
    }
}
