package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.gi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1953gi implements InterfaceC1794a3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f26159a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2151p4 f26160b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private ls f26161c;

    public /* synthetic */ C1953gi(Context context, C2286v2 c2286v2, C2105n4 c2105n4) {
        this(context, c2286v2, c2105n4, new Handler(Looper.getMainLooper()), new C2151p4(context, c2286v2, c2105n4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C1953gi this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ls lsVar = this$0.f26161c;
        if (lsVar != null) {
            lsVar.onAdLoaded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C1953gi this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ls lsVar = this$0.f26161c;
        if (lsVar != null) {
            lsVar.onAdClicked();
            lsVar.onLeftApplication();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1953gi this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ls lsVar = this$0.f26161c;
        if (lsVar != null) {
            lsVar.onReturnedToApplication();
        }
    }

    public final void a() {
        this.f26159a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.R3
            @Override // java.lang.Runnable
            public final void run() {
                C1953gi.a(C1953gi.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1794a3
    public final void onAdLoaded() {
        this.f26160b.a();
        this.f26159a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.S3
            @Override // java.lang.Runnable
            public final void run() {
                C1953gi.b(C1953gi.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1953gi this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ls lsVar = this$0.f26161c;
        if (lsVar != null) {
            lsVar.closeBannerAd();
        }
    }

    public final void b() {
        this.f26159a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.P3
            @Override // java.lang.Runnable
            public final void run() {
                C1953gi.c(C1953gi.this);
            }
        });
    }

    public C1953gi(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2105n4 adLoadingPhasesManager, @NotNull Handler handler, @NotNull C2151p4 adLoadingResultReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(adLoadingResultReporter, "adLoadingResultReporter");
        this.f26159a = handler;
        this.f26160b = adLoadingResultReporter;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1794a3
    public final void a(@NotNull final C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f26160b.a(error.c());
        this.f26159a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.N3
            @Override // java.lang.Runnable
            public final void run() {
                C1953gi.a(C1953gi.this, error);
            }
        });
    }

    public final void c() {
        this.f26159a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Q3
            @Override // java.lang.Runnable
            public final void run() {
                C1953gi.d(C1953gi.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1953gi this$0, C1866d3 error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        ls lsVar = this$0.f26161c;
        if (lsVar != null) {
            lsVar.a(error);
        }
    }

    public final void a(@Nullable final C1795a4 c1795a4) {
        this.f26159a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.O3
            @Override // java.lang.Runnable
            public final void run() {
                C1953gi.a(C1953gi.this, c1795a4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1953gi this$0, C1795a4 c1795a4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ls lsVar = this$0.f26161c;
        if (lsVar != null) {
            lsVar.a(c1795a4);
        }
    }

    public final void a(@NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f26160b.a(new C1990i7(adConfiguration));
    }

    public final void a(@Nullable ls lsVar) {
        this.f26161c = lsVar;
        this.f26160b.a(lsVar);
    }

    public final void a(@NotNull yf0 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f26160b.a(reportParameterManager);
    }
}
