package com.yandex.mobile.ads.unity.wrapper.rewarded;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.rewarded.RewardedAdLoader;
import com.yandex.mobile.ads.unity.wrapper.a;

/* loaded from: classes3.dex */
public class RewardedAdLoaderWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f36091a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final b f36092b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final com.yandex.mobile.ads.unity.wrapper.a f36093c;

    public RewardedAdLoaderWrapper(final Context context) {
        this.f36093c = new com.yandex.mobile.ads.unity.wrapper.a(new a.InterfaceC0209a() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.g
            @Override // com.yandex.mobile.ads.unity.wrapper.a.InterfaceC0209a
            public final Object a() {
                RewardedAdLoader a4;
                a4 = RewardedAdLoaderWrapper.this.a(context);
                return a4;
            }
        });
    }

    public void cancelLoading() {
        this.f36091a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.f
            @Override // java.lang.Runnable
            public final void run() {
                RewardedAdLoaderWrapper.this.a();
            }
        });
    }

    public void clearUnityRewardedListener() {
        this.f36091a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.d
            @Override // java.lang.Runnable
            public final void run() {
                RewardedAdLoaderWrapper.this.b();
            }
        });
    }

    public void loadAd(final AdRequestConfiguration adRequestConfiguration) {
        this.f36091a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.h
            @Override // java.lang.Runnable
            public final void run() {
                RewardedAdLoaderWrapper.this.a(adRequestConfiguration);
            }
        });
    }

    public void setUnityRewardedAdLoadListener(final UnityRewardedAdLoadListener unityRewardedAdLoadListener) {
        this.f36091a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.e
            @Override // java.lang.Runnable
            public final void run() {
                RewardedAdLoaderWrapper.this.a(unityRewardedAdLoadListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        com.yandex.mobile.ads.unity.wrapper.a aVar = this.f36093c;
        if (aVar == null) {
            return;
        }
        ((RewardedAdLoader) aVar.a()).cancelLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f36092b.a((UnityRewardedAdLoadListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdRequestConfiguration adRequestConfiguration) {
        com.yandex.mobile.ads.unity.wrapper.a aVar = this.f36093c;
        if (aVar == null) {
            return;
        }
        ((RewardedAdLoader) aVar.a()).loadAd(adRequestConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ RewardedAdLoader a(Context context) {
        return c.a(context, this.f36092b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(UnityRewardedAdLoadListener unityRewardedAdLoadListener) {
        this.f36092b.a(unityRewardedAdLoadListener);
    }
}
