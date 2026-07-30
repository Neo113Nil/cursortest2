package com.anythink.rewardvideo.a;

import android.content.Context;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdRevenueListener;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.t;
import com.anythink.rewardvideo.api.ATRewardVideoAutoEventListener;
import com.anythink.rewardvideo.api.ATRewardVideoExListener;

/* loaded from: classes.dex */
public final class b implements ATRewardVideoExListener {

    /* renamed from: a, reason: collision with root package name */
    ATRewardVideoAutoEventListener f23405a;

    /* renamed from: b, reason: collision with root package name */
    ATAdRevenueListener f23406b;

    public b(ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener, ATAdRevenueListener aTAdRevenueListener) {
        this.f23405a = aTRewardVideoAutoEventListener;
        this.f23406b = aTAdRevenueListener;
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
    public final void onAgainReward(final ATAdInfo aTAdInfo) {
        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.13
            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = b.this.f23405a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onAgainReward(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
    public final void onAgainRewardFailed(final ATAdInfo aTAdInfo) {
        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.14
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = b.this.f23405a;
                    if (aTRewardVideoAutoEventListener != null) {
                        aTRewardVideoAutoEventListener.onAgainRewardFailed(aTAdInfo);
                    }
                } catch (Throwable th) {
                    Log.w("anythink", "onAgainRewardFailed: " + th.getMessage());
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
    public final void onDeeplinkCallback(final ATAdInfo aTAdInfo, final boolean z8) {
        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = b.this.f23405a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onDeeplinkCallback(aTAdInfo, z8);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
    public final void onDownloadConfirm(final Context context, final ATAdInfo aTAdInfo, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.8
            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = b.this.f23405a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onDownloadConfirm(context, aTAdInfo, aTNetworkConfirmInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
    public final void onReward(final ATAdInfo aTAdInfo) {
        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.7
            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = b.this.f23405a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onReward(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
    public final void onRewardFailed(final ATAdInfo aTAdInfo) {
        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.15
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = b.this.f23405a;
                    if (aTRewardVideoAutoEventListener != null) {
                        aTRewardVideoAutoEventListener.onRewardFailed(aTAdInfo);
                    }
                } catch (Throwable th) {
                    Log.w("anythink", "onRewardFailed: " + th.getMessage());
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
    public final void onRewardedVideoAdAgainPlayClicked(final ATAdInfo aTAdInfo) {
        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.12
            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = b.this.f23405a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdAgainPlayClicked(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
    public final void onRewardedVideoAdAgainPlayEnd(final ATAdInfo aTAdInfo) {
        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.10
            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = b.this.f23405a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdAgainPlayEnd(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
    public final void onRewardedVideoAdAgainPlayFailed(final AdError adError, final ATAdInfo aTAdInfo) {
        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.11
            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = b.this.f23405a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdAgainPlayFailed(adError, aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
    public final void onRewardedVideoAdAgainPlayStart(final ATAdInfo aTAdInfo) {
        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.9
            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = b.this.f23405a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdAgainPlayStart(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
    public final void onRewardedVideoAdClosed(final ATAdInfo aTAdInfo) {
        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.5
            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = b.this.f23405a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdClosed(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
    public final void onRewardedVideoAdFailed(AdError adError) {
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
    public final void onRewardedVideoAdLoaded() {
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
    public final void onRewardedVideoAdPlayClicked(final ATAdInfo aTAdInfo) {
        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.6
            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = b.this.f23405a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdPlayClicked(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
    public final void onRewardedVideoAdPlayEnd(final ATAdInfo aTAdInfo) {
        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.3
            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = b.this.f23405a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdPlayEnd(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
    public final void onRewardedVideoAdPlayFailed(final AdError adError, final ATAdInfo aTAdInfo) {
        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.4
            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = b.this.f23405a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdPlayFailed(adError, aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
    public final void onRewardedVideoAdPlayStart(final ATAdInfo aTAdInfo) {
        t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.2
            @Override // java.lang.Runnable
            public final void run() {
                ATAdRevenueListener aTAdRevenueListener = b.this.f23406b;
                if (aTAdRevenueListener != null) {
                    aTAdRevenueListener.onAdRevenuePaid(aTAdInfo);
                }
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = b.this.f23405a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdPlayStart(aTAdInfo);
                }
            }
        });
    }
}
