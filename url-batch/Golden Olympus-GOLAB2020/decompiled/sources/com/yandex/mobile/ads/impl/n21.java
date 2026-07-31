package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ew1;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class n21 implements jg0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final j21 f29358a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a21 f29359b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final fe2 f29360c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final kj2 f29361d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final y11 f29362e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final fg0 f29363f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final du1 f29364g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private io f29365h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f29366i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ n21(j21 j21Var, a21 a21Var) {
        this(j21Var, a21Var, r3, r4, r5, r6, ew1.a.a().a(j21Var.i()));
        fe2 fe2Var = new fe2();
        kj2 kj2Var = new kj2(j21Var);
        y11 y11Var = new y11();
        fg0 fg0Var = new fg0();
        int i4 = ew1.f25476l;
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final void a(boolean z4) {
    }

    public final void b(@NotNull String htmlResponse) {
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        this.f29362e.getClass();
        boolean a4 = y11.a(htmlResponse);
        this.f29363f.getClass();
        eg0 d21Var = a4 ? new d21() : new C2280uj();
        j21 j21Var = this.f29358a;
        fe2 fe2Var = this.f29360c;
        a21 a21Var = this.f29359b;
        d21Var.a(j21Var, this, fe2Var, a21Var, a21Var, a21Var).a(htmlResponse);
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final void a(@NotNull C1866d3 adFetchRequestError) {
        Intrinsics.checkNotNullParameter(adFetchRequestError, "adFetchRequestError");
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final void a(@NotNull qf1 webView, @NotNull Map trackingParameters) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(trackingParameters, "trackingParameters");
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final void a(@NotNull String customUrl) {
        Intrinsics.checkNotNullParameter(customUrl, "customUrl");
        du1 du1Var = this.f29364g;
        if (du1Var == null || !du1Var.V() || this.f29366i) {
            io ioVar = this.f29365h;
            if (ioVar != null) {
                ioVar.a(this.f29358a, customUrl);
            }
            this.f29366i = false;
        }
    }

    public n21(@NotNull j21 mraidWebView, @NotNull a21 mraidEventsObservable, @NotNull fe2 videoEventController, @NotNull kj2 webViewLoadingNotifier, @NotNull y11 mraidCompatibilityDetector, @NotNull fg0 htmlWebViewAdapterFactoryProvider, @Nullable du1 du1Var) {
        Intrinsics.checkNotNullParameter(mraidWebView, "mraidWebView");
        Intrinsics.checkNotNullParameter(mraidEventsObservable, "mraidEventsObservable");
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        Intrinsics.checkNotNullParameter(webViewLoadingNotifier, "webViewLoadingNotifier");
        Intrinsics.checkNotNullParameter(mraidCompatibilityDetector, "mraidCompatibilityDetector");
        Intrinsics.checkNotNullParameter(htmlWebViewAdapterFactoryProvider, "htmlWebViewAdapterFactoryProvider");
        this.f29358a = mraidWebView;
        this.f29359b = mraidEventsObservable;
        this.f29360c = videoEventController;
        this.f29361d = webViewLoadingNotifier;
        this.f29362e = mraidCompatibilityDetector;
        this.f29363f = htmlWebViewAdapterFactoryProvider;
        this.f29364g = du1Var;
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final void a() {
        this.f29366i = true;
    }

    public final void a(@Nullable io ioVar) {
        this.f29365h = ioVar;
    }

    public final void b() {
        this.f29361d.a(MapsKt.emptyMap());
    }
}
