package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.ui.AdOverlayInfo;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.util.Util;
import com.yandex.mobile.ads.impl.mb2;
import com.yandex.mobile.ads.impl.sr0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class lm0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2357y4 f28644a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2350xk f28645b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2396zk f28646c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final sr0 f28647d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final f60 f28648e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final mj1 f28649f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Player.Listener f28650g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final cb2 f28651h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C1824b9 f28652i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C2311w4 f28653j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final r60 f28654k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final ni1 f28655l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private qs f28656m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    private Player f28657n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    private Object f28658o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f28659p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f28660q;

    public lm0(@NotNull C2384z8 adStateDataController, @NotNull C2357y4 adPlaybackStateCreator, @NotNull C2350xk bindingControllerCreator, @NotNull C2396zk bindingControllerHolder, @NotNull sr0 loadingController, @NotNull li1 playerStateController, @NotNull f60 exoPlayerAdPrepareHandler, @NotNull mj1 positionProviderHolder, @NotNull m60 playerListener, @NotNull cb2 videoAdCreativePlaybackProxyListener, @NotNull C1824b9 adStateHolder, @NotNull C2311w4 adPlaybackStateController, @NotNull r60 currentExoPlayerProvider, @NotNull ni1 playerStateHolder) {
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
        this.f28644a = adPlaybackStateCreator;
        this.f28645b = bindingControllerCreator;
        this.f28646c = bindingControllerHolder;
        this.f28647d = loadingController;
        this.f28648e = exoPlayerAdPrepareHandler;
        this.f28649f = positionProviderHolder;
        this.f28650g = playerListener;
        this.f28651h = videoAdCreativePlaybackProxyListener;
        this.f28652i = adStateHolder;
        this.f28653j = adPlaybackStateController;
        this.f28654k = currentExoPlayerProvider;
        this.f28655l = playerStateHolder;
    }

    public static final void b(lm0 lm0Var, qs qsVar) {
        lm0Var.f28653j.a(lm0Var.f28644a.a(qsVar, lm0Var.f28658o));
    }

    public final void a(int i4, int i5) {
        this.f28648e.a(i4, i5);
    }

    public final void a(int i4, int i5, @NotNull IOException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f28648e.b(i4, i5, exception);
    }

    public final void b() {
        Player a4 = this.f28654k.a();
        if (a4 != null) {
            if (this.f28656m != null) {
                long msToUs = Util.msToUs(a4.getCurrentPosition());
                if (!a4.isPlayingAd()) {
                    msToUs = 0;
                }
                AdPlaybackState withAdResumePositionUs = this.f28653j.a().withAdResumePositionUs(msToUs);
                Intrinsics.checkNotNullExpressionValue(withAdResumePositionUs, "withAdResumePositionUs(...)");
                this.f28653j.a(withAdResumePositionUs);
            }
            a4.removeListener(this.f28650g);
            this.f28653j.a((AdsLoader.EventListener) null);
            this.f28654k.a((Player) null);
            this.f28659p = true;
        }
    }

    public final void a(@Nullable ViewGroup viewGroup, @Nullable List<mb2> list) {
        if (this.f28660q || this.f28656m != null || viewGroup == null) {
            return;
        }
        this.f28660q = true;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        this.f28647d.a(viewGroup, list, new a());
    }

    public final void a() {
        this.f28660q = false;
        this.f28659p = false;
        this.f28656m = null;
        this.f28649f.a((hi1) null);
        this.f28652i.a();
        this.f28652i.a((ui1) null);
        this.f28646c.c();
        this.f28653j.b();
        this.f28647d.a();
        this.f28651h.a((tn0) null);
        C2304vk a4 = this.f28646c.a();
        if (a4 != null) {
            a4.c();
        }
        C2304vk a5 = this.f28646c.a();
        if (a5 != null) {
            a5.d();
        }
    }

    private final class a implements sr0.b {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.sr0.b
        public final void a(@NotNull ViewGroup viewGroup, @NotNull List<mb2> friendlyOverlays, @NotNull qs loadedInstreamAd) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
            Intrinsics.checkNotNullParameter(loadedInstreamAd, "loadedInstreamAd");
            lm0.this.f28660q = false;
            lm0.this.f28656m = loadedInstreamAd;
            qs qsVar = lm0.this.f28656m;
            if (qsVar != null) {
                lm0.this.getClass();
                qsVar.b();
            }
            C2304vk a4 = lm0.this.f28645b.a(viewGroup, friendlyOverlays, loadedInstreamAd);
            lm0.this.f28646c.a(a4);
            a4.a(lm0.this.f28651h);
            a4.c();
            a4.d();
            if (lm0.this.f28654k.b()) {
                lm0.this.f28659p = true;
                lm0.b(lm0.this, loadedInstreamAd);
            }
        }

        @Override // com.yandex.mobile.ads.impl.sr0.b
        public final void a(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            lm0.this.f28660q = false;
            C2311w4 c2311w4 = lm0.this.f28653j;
            AdPlaybackState NONE = AdPlaybackState.NONE;
            Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
            c2311w4.a(NONE);
        }
    }

    public final void a(@Nullable hn2 hn2Var) {
        this.f28651h.a(hn2Var);
    }

    public final void a(@Nullable Player player) {
        this.f28657n = player;
    }

    public final void a(@NotNull AdsLoader.EventListener eventListener, @Nullable AdViewProvider adViewProvider, @Nullable Object obj) {
        mb2.a aVar;
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Player player = this.f28657n;
        this.f28654k.a(player);
        this.f28658o = obj;
        if (player != null) {
            player.addListener(this.f28650g);
            this.f28653j.a(eventListener);
            this.f28649f.a(new hi1(player, this.f28655l));
            if (this.f28659p) {
                this.f28653j.a(this.f28653j.a());
                C2304vk a4 = this.f28646c.a();
                if (a4 != null) {
                    a4.a();
                    return;
                }
                return;
            }
            qs qsVar = this.f28656m;
            if (qsVar != null) {
                this.f28653j.a(this.f28644a.a(qsVar, this.f28658o));
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
