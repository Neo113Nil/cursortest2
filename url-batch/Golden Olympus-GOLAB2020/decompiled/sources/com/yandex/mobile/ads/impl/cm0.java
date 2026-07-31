package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.am0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cm0 implements am0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f24254a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2105n4 f24255b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final bm0 f24256c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Handler f24257d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2151p4 f24258e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private us f24259f;

    public /* synthetic */ cm0(Context context, C2286v2 c2286v2, C2105n4 c2105n4, bm0 bm0Var) {
        this(context, c2286v2, c2105n4, bm0Var, new Handler(Looper.getMainLooper()), new C2151p4(context, c2286v2, c2105n4));
    }

    @Override // com.yandex.mobile.ads.impl.am0.a
    public final void a(@NotNull final String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f24255b.a(EnumC2082m4.f28848e);
        this.f24258e.a(error);
        this.f24257d.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Q0
            @Override // java.lang.Runnable
            public final void run() {
                cm0.a(cm0.this, error);
            }
        });
    }

    public cm0(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2105n4 adLoadingPhasesManager, @NotNull bm0 requestFinishedListener, @NotNull Handler handler, @NotNull C2151p4 adLoadingResultReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(requestFinishedListener, "requestFinishedListener");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(adLoadingResultReporter, "adLoadingResultReporter");
        this.f24254a = adConfiguration;
        this.f24255b = adLoadingPhasesManager;
        this.f24256c = requestFinishedListener;
        this.f24257d = handler;
        this.f24258e = adLoadingResultReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cm0 this$0, String error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        us usVar = this$0.f24259f;
        if (usVar != null) {
            usVar.onInstreamAdFailedToLoad(error);
        }
        this$0.f24256c.a();
    }

    @Override // com.yandex.mobile.ads.impl.am0.a
    public final void a(@NotNull final qs instreamAd) {
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        C1962h3.a(this.f24254a.b().b());
        this.f24255b.a(EnumC2082m4.f28848e);
        this.f24258e.a();
        this.f24257d.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.P0
            @Override // java.lang.Runnable
            public final void run() {
                cm0.a(cm0.this, instreamAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cm0 this$0, qs instreamAd) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instreamAd, "$instreamAd");
        us usVar = this$0.f24259f;
        if (usVar != null) {
            usVar.a(instreamAd);
        }
        this$0.f24256c.a();
    }

    public final void a(@Nullable us usVar) {
        this.f24259f = usVar;
        this.f24258e.a(usVar);
    }

    public final void a(@NotNull di2 requestConfig) {
        Intrinsics.checkNotNullParameter(requestConfig, "requestConfig");
        this.f24258e.a(new go0(requestConfig));
    }
}
