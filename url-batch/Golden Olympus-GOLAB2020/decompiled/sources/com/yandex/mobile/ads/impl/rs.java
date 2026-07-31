package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.cl0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rs implements w72 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vs f31337a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final yt f31338b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final hn0 f31339c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final cl0 f31340d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final cb2 f31341e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final il0 f31342f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final tl0 f31343g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final xn0 f31344h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final bo0 f31345i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ rs(Context context, vu1 vu1Var, qs qsVar, vs vsVar, yt ytVar) {
        this(context, vu1Var, qsVar, vsVar, ytVar, r6, r7, r8, cl0.a.a(), new cb2(), new il0());
        vl0 vl0Var = new vl0();
        yn0 yn0Var = new yn0();
        hn0 hn0Var = new hn0();
        int i4 = cl0.f24243d;
    }

    public final void a(@NotNull j70 instreamAdView, @NotNull List<mb2> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        rs a4 = this.f31340d.a(instreamAdView);
        if (!Intrinsics.areEqual(this, a4)) {
            if (a4 != null && a4.f31340d.a(a4)) {
                a4.f31345i.d();
            }
            if (this.f31340d.a(this)) {
                this.f31345i.d();
            }
            this.f31340d.a(instreamAdView, this);
        }
        this.f31343g.a(this.f31337a);
        this.f31344h.a(this.f31338b);
        this.f31345i.a(instreamAdView, friendlyOverlays);
    }

    public final void b() {
        this.f31345i.c();
    }

    public final void c() {
        this.f31342f.b();
    }

    public final void d() {
        this.f31342f.c();
    }

    public final void e() {
        if (this.f31340d.a(this)) {
            this.f31345i.d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.w72
    public final void invalidateAdPlayer() {
        this.f31343g.b(this.f31337a);
        this.f31345i.a();
    }

    public rs(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull qs instreamAd, @NotNull vs instreamAdPlayer, @NotNull yt videoPlayer, @NotNull vl0 instreamAdPlayerReuseControllerFactory, @NotNull yn0 instreamVideoPlayerReuseControllerFactory, @NotNull hn0 playbackEventListener, @NotNull cl0 bindingManager, @NotNull cb2 playbackProxyListener, @NotNull il0 customUiElementsHolder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(instreamAdPlayerReuseControllerFactory, "instreamAdPlayerReuseControllerFactory");
        Intrinsics.checkNotNullParameter(instreamVideoPlayerReuseControllerFactory, "instreamVideoPlayerReuseControllerFactory");
        Intrinsics.checkNotNullParameter(playbackEventListener, "playbackEventListener");
        Intrinsics.checkNotNullParameter(bindingManager, "bindingManager");
        Intrinsics.checkNotNullParameter(playbackProxyListener, "playbackProxyListener");
        Intrinsics.checkNotNullParameter(customUiElementsHolder, "customUiElementsHolder");
        this.f31337a = instreamAdPlayer;
        this.f31338b = videoPlayer;
        this.f31339c = playbackEventListener;
        this.f31340d = bindingManager;
        this.f31341e = playbackProxyListener;
        this.f31342f = customUiElementsHolder;
        instreamAdPlayerReuseControllerFactory.getClass();
        this.f31343g = vl0.a(this);
        instreamVideoPlayerReuseControllerFactory.getClass();
        this.f31344h = yn0.a(this);
        bo0 bo0Var = new bo0(context, sdkEnvironmentModule, instreamAd, new rl0(instreamAdPlayer), new ve2(videoPlayer), customUiElementsHolder);
        this.f31345i = bo0Var;
        bo0Var.a(playbackEventListener);
        bo0Var.a(playbackProxyListener);
    }

    public final void a() {
        this.f31344h.b(this.f31338b);
        this.f31345i.b();
    }

    public final void a(@Nullable tn0 tn0Var) {
        this.f31341e.a(tn0Var);
    }

    public final void a(@Nullable vl2 vl2Var) {
        this.f31339c.a(vl2Var);
    }
}
