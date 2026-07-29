package com.dancingbogo.skyrolline.ad.c.c;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.aiming.mdt.AdtAds;
import com.aiming.mdt.Callback;
import com.aiming.mdt.video.VideoAd;
import com.aiming.mdt.video.VideoAdListener;
import com.cmplay.a.d;
import com.cmplay.base.util.s;
import com.cmplay.policy.gdpr.GDPRController;
import com.dancingbogo.skyrolline.ad.a.b;
import java.lang.ref.WeakReference;

/* compiled from: AdTimingAds.java */
/* loaded from: classes2.dex */
public class a extends com.dancingbogo.skyrolline.ad.a.a {

    /* renamed from: b, reason: collision with root package name */
    private static a f4511b;

    /* renamed from: c, reason: collision with root package name */
    private static WeakReference<Activity> f4512c;

    /* renamed from: a, reason: collision with root package name */
    private b f4513a;

    /* renamed from: d, reason: collision with root package name */
    private VideoAd f4514d = null;
    private boolean e = false;
    private int f = 0;
    private int g = 8;

    static /* synthetic */ int k(a aVar) {
        int i = aVar.f;
        aVar.f = i + 1;
        return i;
    }

    private a() {
    }

    public static a a() {
        if (f4511b == null) {
            synchronized (a.class) {
                if (f4511b == null) {
                    f4511b = new a();
                }
            }
        }
        return f4511b;
    }

    public Activity b() {
        if (f4512c == null) {
            return null;
        }
        return f4512c.get();
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onCreate(Activity activity) {
        super.onCreate(activity);
        f4512c = new WeakReference<>(activity);
        this.mContext = activity.getApplicationContext();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
        if (!GDPRController.checkIfGDPRAgreedAdStayInformed(activity)) {
            defaultSharedPreferences.edit().putString("IABConsent_SubjectToGDPR", "1").commit();
            Log.d("AdSDK", "IABConsent_SubjectToGDPR1");
        } else {
            defaultSharedPreferences.edit().putString("IABConsent_SubjectToGDPR", "0").commit();
            Log.d("AdSDK", "IABConsent_SubjectToGDPR0");
        }
        a(activity);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onDestroy(Activity activity) {
        if (this.f4514d != null) {
            this.f4514d.destroy();
        }
        super.onDestroy(activity);
    }

    private void a(Activity activity) {
        if (!AdtAds.isInit()) {
            Log.d("AdSDK", "initAdTiming");
            AdtAds.init(activity, "urzqaK23s2c0Tg5skJ8B2XrlAyInyCYx", new Callback() { // from class: com.dancingbogo.skyrolline.ad.c.c.a.1
                @Override // com.aiming.mdt.Callback
                public void onSuccess() {
                    Log.d("AdSDK", "Adtiming SDK init Success");
                    a.this.e = true;
                    a.this.c();
                }

                @Override // com.aiming.mdt.Callback
                public void onError(String str) {
                    Log.d("AdSDK", "Adtiming SDK init Error" + str);
                    a.this.e = false;
                }
            });
        } else {
            this.e = true;
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f4514d == null) {
            Log.d("AdSDK", "initVideoAd");
            this.isRewardedVideoAdLoaded = false;
            this.f4514d = new VideoAd(f4512c.get(), "3989", new VideoAdListener() { // from class: com.dancingbogo.skyrolline.ad.c.c.a.2
                @Override // com.aiming.mdt.video.VideoAdListener
                public void onAdReady() {
                    a.this.isRewardedVideoAdLoaded = true;
                    a.this.isRewardedVideoAdLoading = false;
                    Log.d("AdSDK", "onADReady");
                    new d().a(2, 2, 0, a.this.g, 99);
                    a.this.f = 0;
                    a.this.ReportMagicCtrlAd(4, 5, 0, 103, 15, true, 0, false, 0, 0, 0);
                }

                @Override // com.aiming.mdt.video.VideoAdListener
                public void onAdClicked() {
                    Log.d("AdSDK", "onADClick");
                    a.this.ReportMagicCtrlAd(4, 5, a.this.mSceneOfRewardedVideoAd, 2, 15, true, 0, false, 0, 0, a.this.mIsTryOfRewardedVideoAd);
                }

                @Override // com.aiming.mdt.video.VideoAdListener
                public void onAdClosed(boolean z) {
                    Log.d("AdSDK", "onAdClosed" + z);
                    a.this.ReportMagicCtrlAd(4, 5, a.this.mSceneOfRewardedVideoAd, 7, 15, true, 0, false, 0, 0, a.this.mIsTryOfRewardedVideoAd);
                    a.this.d();
                }

                @Override // com.aiming.mdt.video.VideoAdListener
                public void onAdRewarded() {
                    Log.d("AdSDK", "onAdRewarded");
                    a.this.f4513a.a(false);
                    a.this.ReportMagicCtrlAd(4, 5, a.this.mSceneOfRewardedVideoAd, 4, 15, true, 0, false, 0, 0, a.this.mIsTryOfRewardedVideoAd);
                }

                @Override // com.aiming.mdt.core.AdListener
                public void onAdFailed(String str) {
                    a.this.isRewardedVideoAdLoading = false;
                    Log.d("AdSDK", "onADFail" + str);
                    new d().a(2, 3, 0, a.this.g, 99);
                    a.this.ReportMagicCtrlAd(4, 5, 0, 104, 15, true, 0, false, 0, 0, 0);
                    a.this.d();
                    a.k(a.this);
                }
            });
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Log.d("AdSDK", "loadVideoAd");
        ReportMagicCtrlAd(4, 5, 0, 101, 15, true, 0, false, 0, 0, 0);
        this.lastCallRequestRVTime = getTimeStampMilliSec();
        if (this.f < 1) {
            Log.d("AdSDK", "retryCount < 1");
            if (this.f4514d.isReady()) {
                Log.d("AdSDK", "videoAd isReady");
                ReportMagicCtrlAd(4, 5, 0, 105, 15, true, 0, false, 0, 0, 0);
            } else {
                if (this.isRewardedVideoAdLoading) {
                    ReportMagicCtrlAd(4, 5, 0, 106, 15, true, 0, false, 0, 0, 0);
                    return;
                }
                this.isRewardedVideoAdLoaded = false;
                Log.d("AdSDK", "videoAd loadAd");
                this.f4514d.loadAd();
                this.requestRVTime = getTimeStampMilliSec();
                this.isRewardedVideoAdLoading = true;
                ReportMagicCtrlAd(4, 5, 0, 8, 15, true, 0, false, 0, 0, 0);
                new d().a(2, 1, 0, this.g, 99);
            }
        }
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean canShow(int i) {
        if (!this.e) {
            a(a().b());
            return false;
        }
        return this.f4514d.isReady();
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean show(int i) {
        Log.d("AdSDK", "show");
        this.mSceneOfRewardedVideoAd = i;
        boolean z = false;
        this.mIsTryOfRewardedVideoAd = 0;
        ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 102, 15, true, 0, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        this.lastCallShowRVTime = getTimeStampMilliSec();
        try {
            if (canShow(i)) {
                try {
                    this.f4513a.a();
                    this.f4514d.showAd();
                    new d().a(2, 4, 0, this.g, 99);
                } catch (Exception unused) {
                }
                z = true;
            }
        } catch (Exception unused2) {
        }
        if (!z) {
            ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 10, 15, true, 4 == s.a(this.mContext) ? 2 : 1, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        }
        return z;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void setListener(b bVar) {
        this.f4513a = bVar;
    }
}
