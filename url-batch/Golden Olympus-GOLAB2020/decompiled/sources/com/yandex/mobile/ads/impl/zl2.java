package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.mobile.ads.impl.mc2;
import com.yandex.mobile.ads.impl.yl2;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zl2 implements InstreamAdPlayerListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ws f35621a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bm2 f35622b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final yl2 f35623c;

    public zl2(@NotNull sl0 coreInstreamAdPlayerListener, @NotNull bm2 videoAdCache, @NotNull yl2 adPlayerErrorAdapter) {
        Intrinsics.checkNotNullParameter(coreInstreamAdPlayerListener, "coreInstreamAdPlayerListener");
        Intrinsics.checkNotNullParameter(videoAdCache, "videoAdCache");
        Intrinsics.checkNotNullParameter(adPlayerErrorAdapter, "adPlayerErrorAdapter");
        this.f35621a = coreInstreamAdPlayerListener;
        this.f35622b = videoAdCache;
        this.f35623c = adPlayerErrorAdapter;
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdBufferingFinished(@NotNull VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        on0 a4 = this.f35622b.a(videoAd);
        if (a4 != null) {
            this.f35621a.h(a4);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdBufferingStarted(@NotNull VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        on0 a4 = this.f35622b.a(videoAd);
        if (a4 != null) {
            this.f35621a.i(a4);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdCompleted(@NotNull VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        on0 a4 = this.f35622b.a(videoAd);
        if (a4 != null) {
            this.f35621a.g(a4);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdPaused(@NotNull VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        on0 a4 = this.f35622b.a(videoAd);
        if (a4 != null) {
            this.f35621a.c(a4);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdPrepared(@NotNull VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        on0 a4 = this.f35622b.a(videoAd);
        if (a4 != null) {
            this.f35621a.b(a4);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdResumed(@NotNull VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        on0 a4 = this.f35622b.a(videoAd);
        if (a4 != null) {
            this.f35621a.e(a4);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdSkipped(@NotNull VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        on0 a4 = this.f35622b.a(videoAd);
        if (a4 != null) {
            this.f35621a.a(a4);
            this.f35622b.b(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdStarted(@NotNull VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        on0 a4 = this.f35622b.a(videoAd);
        if (a4 != null) {
            this.f35621a.d(a4);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdStopped(@NotNull VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        on0 a4 = this.f35622b.a(videoAd);
        if (a4 != null) {
            this.f35621a.f(a4);
            this.f35622b.b(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onError(@NotNull VideoAd videoAd, @NotNull InstreamAdPlayerError instreamAdPlayerError) {
        mc2.a aVar;
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(instreamAdPlayerError, "error");
        on0 a4 = this.f35622b.a(videoAd);
        if (a4 != null) {
            this.f35623c.getClass();
            Intrinsics.checkNotNullParameter(instreamAdPlayerError, "instreamAdPlayerError");
            switch (yl2.a.f35239a[instreamAdPlayerError.getReason().ordinal()]) {
                case 1:
                    aVar = mc2.a.f29003b;
                    break;
                case 2:
                    aVar = mc2.a.f29004c;
                    break;
                case 3:
                    aVar = mc2.a.f29005d;
                    break;
                case 4:
                    aVar = mc2.a.f29006e;
                    break;
                case 5:
                    aVar = mc2.a.f29007f;
                    break;
                case 6:
                    aVar = mc2.a.f29008g;
                    break;
                case 7:
                    aVar = mc2.a.f29009h;
                    break;
                case 8:
                    aVar = mc2.a.f29010i;
                    break;
                case 9:
                    aVar = mc2.a.f29011j;
                    break;
                case 10:
                    aVar = mc2.a.f29012k;
                    break;
                case 11:
                    aVar = mc2.a.f29013l;
                    break;
                case 12:
                    aVar = mc2.a.f29014m;
                    break;
                case 13:
                    aVar = mc2.a.f29015n;
                    break;
                case 14:
                    aVar = mc2.a.f29016o;
                    break;
                case 15:
                    aVar = mc2.a.f29017p;
                    break;
                case 16:
                    aVar = mc2.a.f29018q;
                    break;
                case 17:
                    aVar = mc2.a.f29019r;
                    break;
                case 18:
                    aVar = mc2.a.f29020s;
                    break;
                case 19:
                    aVar = mc2.a.f29021t;
                    break;
                case 20:
                    aVar = mc2.a.f29022u;
                    break;
                case 21:
                    aVar = mc2.a.f29023v;
                    break;
                case 22:
                    aVar = mc2.a.f29024w;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    aVar = mc2.a.f29025x;
                    break;
                case 24:
                    aVar = mc2.a.f29026y;
                    break;
                case 25:
                    aVar = mc2.a.f29027z;
                    break;
                case 26:
                    aVar = mc2.a.f28996A;
                    break;
                case 27:
                    aVar = mc2.a.f28997B;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    aVar = mc2.a.f28998C;
                    break;
                case 29:
                    aVar = mc2.a.f28999D;
                    break;
                default:
                    throw new W1.m();
            }
            this.f35621a.a(a4, new mc2(aVar, instreamAdPlayerError.getUnderlyingError()));
            this.f35622b.b(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onVolumeChanged(@NotNull VideoAd videoAd, float f4) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        on0 a4 = this.f35622b.a(videoAd);
        if (a4 != null) {
            this.f35621a.a(a4, f4);
        }
    }
}
