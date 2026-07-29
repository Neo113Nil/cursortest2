package com.dancingbogo.skyrolline.ad.c.a;

import android.app.Activity;
import android.util.Log;
import com.cmplay.a.d;
import com.cmplay.base.util.s;
import com.cmplay.policy.gdpr.GDPRController;
import com.dancingbogo.skyrolline.ad.a.b;
import com.mopub.common.MediationSettings;
import com.mopub.common.MoPub;
import com.mopub.common.MoPubReward;
import com.mopub.common.SdkConfiguration;
import com.mopub.common.SdkInitializationListener;
import com.mopub.common.privacy.PersonalInfoManager;
import com.mopub.mobileads.MoPubErrorCode;
import com.mopub.mobileads.MoPubRewardedVideoListener;
import com.mopub.mobileads.MoPubRewardedVideos;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* compiled from: MopubVideoAds.java */
/* loaded from: classes2.dex */
public class a extends com.dancingbogo.skyrolline.ad.a.a {

    /* renamed from: a, reason: collision with root package name */
    private static WeakReference<Activity> f4500a;

    /* renamed from: b, reason: collision with root package name */
    private static a f4501b;
    private static final List<String> g = Arrays.asList("com.mopub.mobileads.UnityRewardedVideo", "com.mopub.mobileads.FacebookRewardedVideo", "com.mopub.mobileads.GooglePlayServicesRewardedVideo", "com.mopub.mobileads.IronSourceRewardedVideo", "com.mopub.mobileads.VungleRewardedVideo", "com.mopub.mobileads.AppLovinRewardedVideo");

    /* renamed from: d, reason: collision with root package name */
    private b f4503d;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4502c = false;
    private int e = 1;
    private boolean f = false;

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void prepare() {
    }

    private a() {
    }

    public Activity a() {
        if (f4500a == null) {
            return null;
        }
        return f4500a.get();
    }

    public static a b() {
        if (f4501b == null) {
            synchronized (a.class) {
                if (f4501b == null) {
                    f4501b = new a();
                }
            }
        }
        return f4501b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        a("loadRewardedVideoAd");
        ReportMagicCtrlAd(4, 5, 0, 101, 8, true, 0, false, 0, 0, 0);
        this.lastCallRequestRVTime = getTimeStampMilliSec();
        if (a() != null) {
            if (MoPubRewardedVideos.hasRewardedVideo("33157815b789439eaf36717938f00bbe")) {
                ReportMagicCtrlAd(4, 5, 0, 105, 8, true, 0, false, 0, 0, 0);
                return;
            }
            if (this.isRewardedVideoAdLoading) {
                ReportMagicCtrlAd(4, 5, 0, 106, 8, true, 0, false, 0, 0, 0);
                return;
            }
            this.isRewardedVideoAdLoaded = false;
            MoPubRewardedVideos.loadRewardedVideo("33157815b789439eaf36717938f00bbe", new MediationSettings[0]);
            this.requestRVTime = getTimeStampMilliSec();
            this.isRewardedVideoAdLoading = true;
            ReportMagicCtrlAd(4, 5, 0, 8, 8, true, 0, false, 0, 0, 0);
            new d().a(2, 1, 0, 20, 99);
        }
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onCreate(Activity activity) {
        super.onCreate(activity);
        f4500a = new WeakReference<>(activity);
        this.mContext = activity.getApplicationContext();
        MoPub.initializeSdk(activity, new SdkConfiguration.Builder("33157815b789439eaf36717938f00bbe").build(), new SdkInitializationListener() { // from class: com.dancingbogo.skyrolline.ad.c.a.a.1
            @Override // com.mopub.common.SdkInitializationListener
            public void onInitializationFinished() {
                Log.d("MoPub", "onInitializationFinished#");
                a.this.c();
            }
        });
        PersonalInfoManager personalInformationManager = MoPub.getPersonalInformationManager();
        if (GDPRController.checkIfGDPRAgreedAdStayInformed(activity)) {
            personalInformationManager.grantConsent();
        } else {
            personalInformationManager.revokeConsent();
        }
        MoPub.onCreate(f4500a.get());
        MoPubRewardedVideos.setRewardedVideoListener(new MoPubRewardedVideoListener() { // from class: com.dancingbogo.skyrolline.ad.c.a.a.2
            @Override // com.mopub.mobileads.MoPubRewardedVideoListener
            public void onRewardedVideoPlaybackError(String str, MoPubErrorCode moPubErrorCode) {
            }

            @Override // com.mopub.mobileads.MoPubRewardedVideoListener
            public void onRewardedVideoLoadSuccess(String str) {
                a.this.isRewardedVideoAdLoaded = true;
                a.this.isRewardedVideoAdLoading = false;
                a.this.ReportMagicCtrlAd(4, 5, 0, 103, 8, true, 0, false, 0, 0, 0);
                new d().a(2, 2, 0, 20, 99);
            }

            @Override // com.mopub.mobileads.MoPubRewardedVideoListener
            public void onRewardedVideoLoadFailure(String str, MoPubErrorCode moPubErrorCode) {
                int i;
                a.this.isRewardedVideoAdLoading = false;
                if (MoPubErrorCode.NO_FILL.equals(moPubErrorCode)) {
                    i = 1;
                } else {
                    i = MoPubErrorCode.NO_CONNECTION.equals(moPubErrorCode) ? 2 : 4;
                }
                a.this.ReportMagicCtrlAd(4, 5, 0, 104, 8, true, i, false, 0, 0, 0);
                new d().a(2, 3, 0, 20, 99);
            }

            @Override // com.mopub.mobileads.MoPubRewardedVideoListener
            public void onRewardedVideoStarted(String str) {
                new d().a(2, 4, 0, 20, 99);
                if (a.this.f4503d != null) {
                    a.this.f4503d.a();
                }
                a.this.ReportMagicCtrlAd(4, 5, a.this.mSceneOfRewardedVideoAd, 3, 8, true, 0, false, 0, 0, a.this.mIsTryOfRewardedVideoAd);
            }

            @Override // com.mopub.mobileads.MoPubRewardedVideoListener
            public void onRewardedVideoClicked(String str) {
                a.this.ReportMagicCtrlAd(4, 5, a.this.mSceneOfRewardedVideoAd, 2, 8, true, 0, false, 0, 0, a.this.mIsTryOfRewardedVideoAd);
            }

            @Override // com.mopub.mobileads.MoPubRewardedVideoListener
            public void onRewardedVideoClosed(String str) {
                if (a.this.f4503d != null) {
                    a.this.f4503d.a(false);
                }
                a.this.ReportMagicCtrlAd(4, 5, a.this.mSceneOfRewardedVideoAd, 7, 8, true, 0, false, 0, 0, a.this.mIsTryOfRewardedVideoAd);
                a.this.c();
            }

            @Override // com.mopub.mobileads.MoPubRewardedVideoListener
            public void onRewardedVideoCompleted(Set<String> set, MoPubReward moPubReward) {
                a.this.ReportMagicCtrlAd(4, 5, a.this.mSceneOfRewardedVideoAd, 4, 8, true, 0, false, 0, 0, a.this.mIsTryOfRewardedVideoAd);
            }
        });
        this.e = 1;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onResume(Activity activity) {
        MoPub.onResume(activity);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onPaused(Activity activity) {
        MoPub.onPause(activity);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onStart(Activity activity) {
        MoPub.onStart(activity);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onStop(Activity activity) {
        MoPub.onStop(activity);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean canShow(int i) {
        return MoPubRewardedVideos.hasRewardedVideo("33157815b789439eaf36717938f00bbe");
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean show(int i) {
        this.mSceneOfRewardedVideoAd = i;
        boolean z = false;
        this.mIsTryOfRewardedVideoAd = 0;
        ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 102, 8, true, 0, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        this.lastCallShowRVTime = getTimeStampMilliSec();
        if (MoPubRewardedVideos.hasRewardedVideo("33157815b789439eaf36717938f00bbe")) {
            MoPubRewardedVideos.showRewardedVideo("33157815b789439eaf36717938f00bbe");
            z = true;
        }
        if (!z) {
            ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 10, 8, true, 4 == s.a(this.mContext) ? 2 : 1, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        }
        return z;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void setListener(b bVar) {
        this.f4503d = bVar;
    }

    private void a(String str) {
        if (this.f4502c) {
            Log.d("MopubVideoAds", str);
        }
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onDestroy(Activity activity) {
        super.onDestroy(activity);
    }
}
