package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.AdOverlayInfo;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.Player;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import com.yandex.mobile.ads.impl.mb2;
import com.yandex.mobile.ads.impl.tr0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class mm0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2334x4 f29155a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2327wk f29156b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2373yk f29157c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final tr0 f29158d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final e60 f29159e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final lj1 f29160f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Player.Listener f29161g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final cb2 f29162h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C1800a9 f29163i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C2288v4 f29164j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final q60 f29165k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final mi1 f29166l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private qs f29167m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    private Player f29168n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    private Object f29169o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f29170p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f29171q;

    public mm0(@NotNull C2361y8 adStateDataController, @NotNull C2334x4 adPlaybackStateCreator, @NotNull C2327wk bindingControllerCreator, @NotNull C2373yk bindingControllerHolder, @NotNull tr0 loadingController, @NotNull ki1 playerStateController, @NotNull e60 exoPlayerAdPrepareHandler, @NotNull lj1 positionProviderHolder, @NotNull l60 playerListener, @NotNull cb2 videoAdCreativePlaybackProxyListener, @NotNull C1800a9 adStateHolder, @NotNull C2288v4 adPlaybackStateController, @NotNull q60 currentExoPlayerProvider, @NotNull mi1 playerStateHolder) {
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(adPlaybackStateCreator, "adPlaybackStateCreator");
        Intrinsics.checkNotNullParameter(bindingControllerCreator, "bindingControllerCreator");
        Intrinsics.checkNotNullParameter(bindingControllerHolder, "bindingControllerHolder");
        Intrinsics.checkNotNullParameter(loadingController, "loadingController");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(exoPlayerAdPrepareHandler, "exoPlayerAdPrepareHandler");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(playerListener, "playerListener");
        Intrinsics.checkNotNullParameter(videoAdCreativePlaybackProxyListener, "videoAdCreativePlaybackProxyListener");
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(currentExoPlayerProvider, "currentExoPlayerProvider");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        this.f29155a = adPlaybackStateCreator;
        this.f29156b = bindingControllerCreator;
        this.f29157c = bindingControllerHolder;
        this.f29158d = loadingController;
        this.f29159e = exoPlayerAdPrepareHandler;
        this.f29160f = positionProviderHolder;
        this.f29161g = playerListener;
        this.f29162h = videoAdCreativePlaybackProxyListener;
        this.f29163i = adStateHolder;
        this.f29164j = adPlaybackStateController;
        this.f29165k = currentExoPlayerProvider;
        this.f29166l = playerStateHolder;
    }

    public static final void b(mm0 mm0Var, qs qsVar) {
        mm0Var.f29164j.a(mm0Var.f29155a.a(qsVar, mm0Var.f29169o));
    }

    public final void a(int i4, int i5) {
        this.f29159e.a(i4, i5);
    }

    public final void a(int i4, int i5, @NotNull IOException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f29159e.b(i4, i5, exception);
    }

    public final void b() {
        Player a4 = this.f29165k.a();
        if (a4 != null) {
            if (this.f29167m != null) {
                long msToUs = Util.msToUs(a4.getCurrentPosition());
                if (!a4.isPlayingAd()) {
                    msToUs = 0;
                }
                AdPlaybackState withAdResumePositionUs = this.f29164j.a().withAdResumePositionUs(msToUs);
                Intrinsics.checkNotNullExpressionValue(withAdResumePositionUs, "withAdResumePositionUs(...)");
                this.f29164j.a(withAdResumePositionUs);
            }
            a4.removeListener(this.f29161g);
            this.f29164j.a((AdsLoader.EventListener) null);
            this.f29165k.a((Player) null);
            this.f29170p = true;
        }
    }

    public final void a(@Nullable ViewGroup viewGroup, @Nullable List<mb2> list) {
        if (this.f29171q || this.f29167m != null || viewGroup == null) {
            return;
        }
        this.f29171q = true;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        this.f29158d.a(viewGroup, list, new a());
    }

    public final void a() {
        this.f29171q = false;
        this.f29170p = false;
        this.f29167m = null;
        this.f29160f.a((gi1) null);
        this.f29163i.a();
        this.f29163i.a((ti1) null);
        this.f29157c.c();
        this.f29164j.b();
        this.f29158d.a();
        this.f29162h.a((tn0) null);
        C2281uk a4 = this.f29157c.a();
        if (a4 != null) {
            a4.c();
        }
        C2281uk a5 = this.f29157c.a();
        if (a5 != null) {
            a5.d();
        }
    }

    private final class a implements tr0.b {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.tr0.b
        public final void a(@NotNull ViewGroup viewGroup, @NotNull List<mb2> friendlyOverlays, @NotNull qs loadedInstreamAd) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
            Intrinsics.checkNotNullParameter(loadedInstreamAd, "loadedInstreamAd");
            mm0.this.f29171q = false;
            mm0.this.f29167m = loadedInstreamAd;
            qs qsVar = mm0.this.f29167m;
            if (qsVar != null) {
                mm0.this.getClass();
                qsVar.b();
            }
            C2281uk a4 = mm0.this.f29156b.a(viewGroup, friendlyOverlays, loadedInstreamAd);
            mm0.this.f29157c.a(a4);
            a4.a(mm0.this.f29162h);
            a4.c();
            a4.d();
            if (mm0.this.f29165k.b()) {
                mm0.this.f29170p = true;
                mm0.b(mm0.this, loadedInstreamAd);
            }
        }

        @Override // com.yandex.mobile.ads.impl.tr0.b
        public final void a(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            mm0.this.f29171q = false;
            C2288v4 c2288v4 = mm0.this.f29164j;
            AdPlaybackState NONE = AdPlaybackState.NONE;
            Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
            c2288v4.a(NONE);
        }
    }

    public final void a(@Nullable hn2 hn2Var) {
        this.f29162h.a(hn2Var);
    }

    public final void a(@Nullable Player player) {
        this.f29168n = player;
    }

    public final void a(@NotNull AdsLoader.EventListener eventListener, @Nullable AdViewProvider adViewProvider, @Nullable Object obj) {
        mb2.a aVar;
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Player player = this.f29168n;
        this.f29165k.a(player);
        this.f29169o = obj;
        if (player != null) {
            player.addListener(this.f29161g);
            this.f29164j.a(eventListener);
            this.f29160f.a(new gi1(player, this.f29166l));
            if (this.f29170p) {
                this.f29164j.a(this.f29164j.a());
                C2281uk a4 = this.f29157c.a();
                if (a4 != null) {
                    a4.a();
                    return;
                }
                return;
            }
            qs qsVar = this.f29167m;
            if (qsVar != null) {
                this.f29164j.a(this.f29155a.a(qsVar, this.f29169o));
                return;
            }
            if (adViewProvider != null) {
                ViewGroup adViewGroup = adViewProvider.getAdViewGroup();
                ArrayList arrayList = new ArrayList();
                for (AdOverlayInfo adOverlayInfo : adViewProvider.getAdOverlayInfos()) {
                    Intrinsics.checkNotNull(adOverlayInfo);
                    Intrinsics.checkNotNullParameter(adOverlayInfo, "adOverlayInfo");
                    View view = adOverlayInfo.view;
                    Intrinsics.checkNotNullExpressionValue(view, "view");
                    int i4 = adOverlayInfo.purpose;
                    if (i4 == 1) {
                        aVar = mb2.a.f28983b;
                    } else if (i4 == 2) {
                        aVar = mb2.a.f28984c;
                    } else if (i4 != 4) {
                        aVar = mb2.a.f28986e;
                    } else {
                        aVar = mb2.a.f28985d;
                    }
                    arrayList.add(new mb2(view, aVar, adOverlayInfo.reasonDetail));
                }
                a(adViewGroup, arrayList);
            }
        }
    }
}
