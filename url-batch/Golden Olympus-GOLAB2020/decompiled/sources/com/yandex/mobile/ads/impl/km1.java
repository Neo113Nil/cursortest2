package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class km1 implements zc0<cp0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final jp0 f28252a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f28253b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2151p4 f28254c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private at f28255d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private InterfaceC2034k4 f28256e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private String f28257f;

    public /* synthetic */ km1(Context context, C2286v2 c2286v2, C2105n4 c2105n4, jp0 jp0Var) {
        this(context, c2286v2, c2105n4, jp0Var, new Handler(Looper.getMainLooper()), new C2151p4(context, c2286v2, c2105n4));
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    public final void a(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f28254c.a(error.c());
        final C1866d3 c1866d3 = new C1866d3(error.b(), error.c(), error.d(), this.f28257f);
        this.f28253b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Y8
            @Override // java.lang.Runnable
            public final void run() {
                km1.a(km1.this, c1866d3);
            }
        });
    }

    public km1(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2105n4 adLoadingPhasesManager, @NotNull jp0 adShowApiControllerFactory, @NotNull Handler handler, @NotNull C2151p4 adLoadingResultReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(adShowApiControllerFactory, "adShowApiControllerFactory");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(adLoadingResultReporter, "adLoadingResultReporter");
        this.f28252a = adShowApiControllerFactory;
        this.f28253b = handler;
        this.f28254c = adLoadingResultReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(km1 this$0, C1866d3 requestError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(requestError, "$requestError");
        at atVar = this$0.f28255d;
        if (atVar != null) {
            atVar.a(requestError);
        }
        InterfaceC2034k4 interfaceC2034k4 = this$0.f28256e;
        if (interfaceC2034k4 != null) {
            interfaceC2034k4.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    public final void a(@NotNull cp0 ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f28254c.a();
        final ip0 a4 = this.f28252a.a(ad);
        this.f28253b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.X8
            @Override // java.lang.Runnable
            public final void run() {
                km1.a(km1.this, a4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(km1 this$0, ip0 interstitial) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interstitial, "$interstitial");
        at atVar = this$0.f28255d;
        if (atVar != null) {
            atVar.a(interstitial);
        }
        InterfaceC2034k4 interfaceC2034k4 = this$0.f28256e;
        if (interfaceC2034k4 != null) {
            interfaceC2034k4.a();
        }
    }

    public final void a(@NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f28254c.a(new C1990i7(adConfiguration));
    }

    public final void a(@Nullable String str) {
        this.f28257f = str;
    }

    public final void a(@NotNull InterfaceC2034k4 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f28256e = listener;
    }

    public final void a(@Nullable at atVar) {
        this.f28255d = atVar;
        this.f28254c.a(atVar);
    }

    public final void a(@NotNull yf0 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f28254c.a(reportParameterManager);
    }
}
