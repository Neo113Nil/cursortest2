package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ad2;
import com.yandex.mobile.ads.impl.bd2;
import com.yandex.mobile.ads.impl.eg1;
import com.yandex.mobile.ads.impl.mc2;
import com.yandex.mobile.ads.impl.qc2;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yc2 implements bd2.a, qc2.a {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f35065k = {kotlin.jvm.internal.H.d(new kotlin.jvm.internal.v(yc2.class, "adParameterManager", "getAdParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$ResponseReportParameterManager;", 0)), kotlin.jvm.internal.H.d(new kotlin.jvm.internal.v(yc2.class, "requestParameterManager", "getRequestParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$RequestReportParameterManager;", 0))};

    /* renamed from: l, reason: collision with root package name */
    private static final long f35066l = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2105n4 f35067a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bg2 f35068b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final eg1 f35069c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final bd2 f35070d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final qc2 f35071e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ad2 f35072f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ue2 f35073g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f35074h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final wc2 f35075i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final xc2 f35076j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc2(Context context, C2286v2 c2286v2, C2360y7 c2360y7, ob2 ob2Var, C2105n4 c2105n4, fd2 fd2Var, hg2 hg2Var, jf2 jf2Var, cg2 cg2Var) {
        this(context, c2286v2, c2360y7, ob2Var, c2105n4, fd2Var, hg2Var, jf2Var, cg2Var, eg1.a.a(false));
        int i4 = eg1.f25287a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(yc2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(new mc2(mc2.a.f29010i, new k00()));
    }

    public final void d() {
        this.f35070d.b();
        this.f35071e.b();
        this.f35069c.stop();
    }

    public final void e() {
        this.f35074h = false;
        this.f35072f.b(null);
        this.f35070d.b();
        this.f35071e.b();
        this.f35069c.stop();
    }

    public final void f() {
        this.f35070d.a();
    }

    public final void a(@NotNull mc2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f35070d.b();
        this.f35071e.b();
        this.f35069c.stop();
        if (this.f35074h) {
            return;
        }
        this.f35074h = true;
        String lowerCase = error.a().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String message = error.b().getMessage();
        if (message == null) {
            message = "";
        }
        this.f35072f.a(lowerCase, message);
    }

    public final void c() {
        this.f35070d.b();
        this.f35071e.b();
        this.f35069c.stop();
    }

    public yc2(@NotNull Context context, @NotNull C2286v2 adConfiguration, @Nullable C2360y7 c2360y7, @NotNull ob2 videoAdInfo, @NotNull C2105n4 adLoadingPhasesManager, @NotNull fd2 videoAdStatusController, @NotNull hg2 videoViewProvider, @NotNull jf2 renderValidator, @NotNull cg2 videoTracker, @NotNull eg1 pausableTimer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(videoAdStatusController, "videoAdStatusController");
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        Intrinsics.checkNotNullParameter(renderValidator, "renderValidator");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        this.f35067a = adLoadingPhasesManager;
        this.f35068b = videoTracker;
        this.f35069c = pausableTimer;
        this.f35070d = new bd2(renderValidator, this);
        this.f35071e = new qc2(videoAdStatusController, this);
        this.f35072f = new ad2(context, adConfiguration, c2360y7, adLoadingPhasesManager);
        this.f35073g = new ue2(videoAdInfo, videoViewProvider);
        kotlin.properties.a aVar = kotlin.properties.a.f41165a;
        this.f35075i = new wc2(this);
        this.f35076j = new xc2(this);
    }

    @Override // com.yandex.mobile.ads.impl.qc2.a
    public final void b() {
        this.f35072f.b(this.f35073g.a());
        this.f35067a.a(EnumC2082m4.f28864u);
        if (this.f35074h) {
            return;
        }
        this.f35074h = true;
        this.f35072f.a();
    }

    @Override // com.yandex.mobile.ads.impl.bd2.a
    public final void a() {
        this.f35070d.b();
        C2105n4 c2105n4 = this.f35067a;
        EnumC2082m4 enumC2082m4 = EnumC2082m4.f28864u;
        C2001ij.a(c2105n4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
        this.f35068b.i();
        this.f35071e.a();
        this.f35069c.a(f35066l, new gg1() { // from class: com.yandex.mobile.ads.impl.Tl
            @Override // com.yandex.mobile.ads.impl.gg1
            public final void a() {
                yc2.b(yc2.this);
            }
        });
    }

    public final void a(@Nullable ad2.b bVar) {
        this.f35075i.setValue(this, f35065k[0], bVar);
    }

    public final void a(@Nullable ad2.a aVar) {
        this.f35076j.setValue(this, f35065k[1], aVar);
    }
}
