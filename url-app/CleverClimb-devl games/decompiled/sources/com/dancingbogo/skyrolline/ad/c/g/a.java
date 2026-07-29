package com.dancingbogo.skyrolline.ad.c.g;

import android.app.Activity;
import android.util.Log;
import com.cmplay.a.d;
import com.cmplay.base.util.s;
import com.cmplay.policy.gdpr.GDPRController;
import com.dancingbogo.skyrolline.AppActivity;
import com.dancingbogo.skyrolline.ad.a.b;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MetaData;
import com.youappi.sdk.net.model.ProductRequestItem;

/* compiled from: UnityADS.java */
/* loaded from: classes2.dex */
public class a extends com.dancingbogo.skyrolline.ad.a.a implements IUnityAdsListener {

    /* renamed from: b, reason: collision with root package name */
    private static a f4530b;

    /* renamed from: a, reason: collision with root package name */
    private b f4531a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4532c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4533d = false;

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onPaused(Activity activity) {
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onResume(Activity activity) {
    }

    public static a a() {
        if (f4530b == null) {
            synchronized (a.class) {
                if (f4530b == null) {
                    f4530b = new a();
                }
            }
        }
        return f4530b;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onCreate(Activity activity) {
        super.onCreate(activity);
        this.mContext = activity.getApplicationContext();
        b();
    }

    private void b() {
        if (!UnityAds.isSupported() || AppActivity.getActivityRef() == null) {
            return;
        }
        if (GDPRController.checkIfGDPRAgreedAdStayInformed(AppActivity.getActivityRef())) {
            Log.d("checkIfGDPRAgreed", "true");
            MetaData metaData = new MetaData(AppActivity.getActivityRef());
            metaData.set("gdpr.consent", true);
            metaData.commit();
        }
        Log.d("checkIfGDPRAgreed", "false");
        UnityAds.initialize(AppActivity.getActivityRef(), "3918297", this);
        this.f4532c = true;
        Log.d("checkIfGDPRAgreed", "-------------");
        new d().a(2, 1, 0, 2, 99);
        ReportMagicCtrlAd(4, 5, 0, 101, 3, true, 0, false, 0, 0, 0);
        this.lastCallRequestRVTime = getTimeStampMilliSec();
        this.requestRVTime = getTimeStampMilliSec();
        ReportMagicCtrlAd(4, 5, 0, 8, 3, true, 0, false, 0, 0, 0);
    }

    @Override // com.unity3d.ads.IUnityAdsListener
    public void onUnityAdsError(UnityAds.UnityAdsError unityAdsError, String str) {
        new d().a(2, 3, 0, 2, 99);
        ReportMagicCtrlAd(4, 5, 0, 104, 3, true, 0, false, 0, 0, 0);
    }

    @Override // com.unity3d.ads.IUnityAdsListener
    public void onUnityAdsReady(String str) {
        new d().a(2, 2, 0, 2, 99);
        if (this.f4533d) {
            return;
        }
        this.f4533d = true;
        ReportMagicCtrlAd(4, 5, 0, 103, 3, true, 0, false, 0, 0, 0);
    }

    @Override // com.unity3d.ads.IUnityAdsListener
    public void onUnityAdsFinish(String str, UnityAds.FinishState finishState) {
        if (this.f4531a != null) {
            this.f4531a.a(finishState != UnityAds.FinishState.COMPLETED);
        }
        if (finishState == UnityAds.FinishState.COMPLETED) {
            ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 4, 3, true, 0, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        }
    }

    @Override // com.unity3d.ads.IUnityAdsListener
    public void onUnityAdsStart(String str) {
        if (this.f4531a != null) {
            this.f4531a.a();
        }
        ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 3, 3, true, 0, false, 0, 0, this.mIsTryOfRewardedVideoAd);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean canShow(int i) {
        if (this.f4532c) {
            return UnityAds.isReady(ProductRequestItem.PublisherApp.UNIT_TYPE_REWARDED_VIDEO) && UnityAds.isSupported() && AppActivity.getActivityRef() != null;
        }
        b();
        return false;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean show(int i) {
        this.mSceneOfRewardedVideoAd = i;
        boolean z = false;
        this.mIsTryOfRewardedVideoAd = 0;
        ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 102, 3, true, 0, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        this.lastCallShowRVTime = getTimeStampMilliSec();
        com.dancingbogo.skyrolline.util.b.b("UnityADS", "show");
        try {
            if (canShow(i)) {
                UnityAds.show(AppActivity.getActivityRef(), ProductRequestItem.PublisherApp.UNIT_TYPE_REWARDED_VIDEO);
                z = true;
            }
        } catch (Exception unused) {
        }
        if (!z) {
            ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 10, 3, true, 4 == s.a(this.mContext) ? 2 : 1, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        }
        return true;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void setListener(b bVar) {
        this.f4531a = bVar;
    }
}
