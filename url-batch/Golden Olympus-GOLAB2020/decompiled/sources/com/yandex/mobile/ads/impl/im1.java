package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class im1 implements zc0<C1926ff> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f27250a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2151p4 f27251b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2116nf f27252c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private js f27253d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private InterfaceC2034k4 f27254e;

    public im1(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2105n4 adLoadingPhasesManager, @NotNull Handler handler, @NotNull C2151p4 adLoadingResultReporter, @NotNull C2116nf appOpenAdShowApiControllerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(adLoadingResultReporter, "adLoadingResultReporter");
        Intrinsics.checkNotNullParameter(appOpenAdShowApiControllerFactory, "appOpenAdShowApiControllerFactory");
        this.f27250a = handler;
        this.f27251b = adLoadingResultReporter;
        this.f27252c = appOpenAdShowApiControllerFactory;
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    public final void a(@NotNull final C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f27251b.a(error.c());
        this.f27250a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.L7
            @Override // java.lang.Runnable
            public final void run() {
                im1.a(im1.this, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(im1 this$0, C1866d3 error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        js jsVar = this$0.f27253d;
        if (jsVar != null) {
            jsVar.a(error);
        }
        InterfaceC2034k4 interfaceC2034k4 = this$0.f27254e;
        if (interfaceC2034k4 != null) {
            interfaceC2034k4.a();
        }
    }

    public /* synthetic */ im1(Context context, C2286v2 c2286v2, C2105n4 c2105n4, bd0 bd0Var) {
        this(context, c2286v2, c2105n4, new Handler(Looper.getMainLooper()), new C2151p4(context, c2286v2, c2105n4), new C2116nf(context, bd0Var));
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    public final void a(@NotNull C1926ff ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f27251b.a();
        final C2093mf a4 = this.f27252c.a(ad);
        this.f27250a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.M7
            @Override // java.lang.Runnable
            public final void run() {
                im1.a(im1.this, a4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(im1 this$0, C2093mf appOpenAdApiController) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appOpenAdApiController, "$appOpenAdApiController");
        js jsVar = this$0.f27253d;
        if (jsVar != null) {
            jsVar.a(appOpenAdApiController);
        }
        InterfaceC2034k4 interfaceC2034k4 = this$0.f27254e;
        if (interfaceC2034k4 != null) {
            interfaceC2034k4.a();
        }
    }

    public final void a(@NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f27251b.a(new C1990i7(adConfiguration));
    }

    public final void a(@Nullable js jsVar) {
        this.f27253d = jsVar;
        this.f27251b.a(jsVar);
    }

    public final void a(@NotNull InterfaceC2034k4 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f27254e = listener;
    }

    public final void a(@NotNull yf0 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f27251b.a(reportParameterManager);
    }
}
