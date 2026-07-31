package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class e61 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y51 f25114a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f25115b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2151p4 f25116c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private gt f25117d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private nt f25118e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private wt f25119f;

    public e61(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2105n4 adLoadingPhasesManager, @NotNull y51 nativeAdLoadingFinishedListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(nativeAdLoadingFinishedListener, "nativeAdLoadingFinishedListener");
        this.f25114a = nativeAdLoadingFinishedListener;
        this.f25115b = new Handler(Looper.getMainLooper());
        this.f25116c = new C2151p4(context, adConfiguration, adLoadingPhasesManager);
    }

    public final void a() {
        this.f25115b.removeCallbacksAndMessages(null);
    }

    private final void a(final C1866d3 c1866d3) {
        this.f25116c.a(c1866d3.c());
        this.f25115b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.L1
            @Override // java.lang.Runnable
            public final void run() {
                e61.a(e61.this, c1866d3);
            }
        });
    }

    public final void b(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(e61 this$0, C1866d3 error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        gt gtVar = this$0.f25117d;
        if (gtVar != null) {
            gtVar.a(error);
        }
        nt ntVar = this$0.f25118e;
        if (ntVar != null) {
            ntVar.a(error);
        }
        wt wtVar = this$0.f25119f;
        if (wtVar != null) {
            wtVar.a(error);
        }
        this$0.f25114a.a();
    }

    public final void a(@NotNull final f61 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        C1962h3.a(gs.f26283g.b());
        this.f25116c.a();
        this.f25115b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.M1
            @Override // java.lang.Runnable
            public final void run() {
                e61.a(e61.this, nativeAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(e61 this$0, f61 nativeAd) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nativeAd, "$nativeAd");
        gt gtVar = this$0.f25117d;
        if (gtVar != null) {
            if (nativeAd instanceof g91) {
                gtVar.b(nativeAd);
            } else {
                gtVar.a(nativeAd);
            }
        }
        this$0.f25114a.a();
    }

    public final void a(@NotNull final ArrayList nativeAds) {
        Intrinsics.checkNotNullParameter(nativeAds, "nativeAds");
        C1962h3.a(gs.f26283g.b());
        this.f25116c.a();
        this.f25115b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.J1
            @Override // java.lang.Runnable
            public final void run() {
                e61.a(e61.this, nativeAds);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(e61 this$0, List nativeAds) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nativeAds, "$nativeAds");
        nt ntVar = this$0.f25118e;
        if (ntVar != null) {
            ntVar.onAdsLoaded(nativeAds);
        }
        this$0.f25114a.a();
    }

    public final void a(@NotNull final y71 sliderAd) {
        Intrinsics.checkNotNullParameter(sliderAd, "sliderAd");
        C1962h3.a(gs.f26283g.b());
        this.f25116c.a();
        this.f25115b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.K1
            @Override // java.lang.Runnable
            public final void run() {
                e61.a(e61.this, sliderAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(e61 this$0, pz1 sliderAd) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sliderAd, "$sliderAd");
        wt wtVar = this$0.f25119f;
        if (wtVar != null) {
            wtVar.a(sliderAd);
        }
        this$0.f25114a.a();
    }

    public final void a(@NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f25116c.a(new C1990i7(adConfiguration));
    }

    public final void a(@Nullable gt gtVar) {
        this.f25117d = gtVar;
        this.f25116c.a(gtVar, this.f25118e, this.f25119f);
    }

    public final void a(@Nullable nt ntVar) {
        this.f25118e = ntVar;
        this.f25116c.a(this.f25117d, ntVar, this.f25119f);
    }

    public final void a(@NotNull s61 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f25116c.a(reportParameterManager);
    }

    public final void a(@Nullable wt wtVar) {
        this.f25119f = wtVar;
        this.f25116c.a(this.f25117d, this.f25118e, wtVar);
    }
}
