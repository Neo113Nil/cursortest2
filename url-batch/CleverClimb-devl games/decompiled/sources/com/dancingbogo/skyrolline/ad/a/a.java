package com.dancingbogo.skyrolline.ad.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.cmplay.base.util.h;
import com.cmplay.base.util.s;
import com.cmplay.internalpush.f;
import com.google.ads.mediation.testsuite.dataobjects.AdUnit;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: BaseAds.java */
/* loaded from: classes2.dex */
public class a implements c {
    protected boolean isInterstitialAdLoaded = false;
    protected boolean isRewardedVideoAdLoaded = false;
    protected boolean isBannerAdLoading = false;
    protected boolean isInterstitialAdLoading = false;
    protected boolean isRewardedVideoAdLoading = false;
    protected long requestBannerTime = 0;
    protected long requestISTime = 0;
    protected long requestRVTime = 0;
    protected long lastCallRequestBannerTime = 0;
    protected long lastCallRequestISTime = 0;
    protected long lastCallRequestRVTime = 0;
    protected long lastCallShowBannerTime = 0;
    protected long lastCallShowISTime = 0;
    protected long lastCallShowRVTime = 0;
    protected int mSceneOfRewardedVideoAd = 0;
    protected int mIsTryOfRewardedVideoAd = 0;
    protected int mSceneOfInterstitialAd = 0;
    protected int mIsTryOfInterstitialAd = 0;
    protected Context mContext = null;

    @Override // com.dancingbogo.skyrolline.ad.a.c
    public boolean activityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.c
    public boolean canShow(int i) {
        return false;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.c
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.c
    public void onCreate(Activity activity) {
    }

    @Override // com.dancingbogo.skyrolline.ad.a.c
    public void onDestroy(Activity activity) {
    }

    @Override // com.dancingbogo.skyrolline.ad.a.c
    public void onPaused(Activity activity) {
    }

    @Override // com.dancingbogo.skyrolline.ad.a.c
    public void onResume(Activity activity) {
    }

    @Override // com.dancingbogo.skyrolline.ad.a.c
    public void onStart(Activity activity) {
    }

    @Override // com.dancingbogo.skyrolline.ad.a.c
    public void onStop(Activity activity) {
    }

    @Override // com.dancingbogo.skyrolline.ad.a.c
    public void prepare() {
    }

    @Override // com.dancingbogo.skyrolline.ad.a.c
    public void setListener(b bVar) {
    }

    @Override // com.dancingbogo.skyrolline.ad.a.c
    public boolean show(int i) {
        return false;
    }

    public void ReportMagicCtrlAd(int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2, int i7, int i8, int i9) {
        int i10;
        long duringTime = getDuringTime(i4, i2);
        if (i4 == 10) {
            i10 = ((i2 == 1 && this.isInterstitialAdLoading) || (i2 == 5 && this.isRewardedVideoAdLoading) || (i2 == 6 && this.isBannerAdLoading)) ? 1 : 2;
        } else {
            i10 = 0;
        }
        ReportAd(this.mContext, "", i2, i3, i4, i5, z, i6, z2, duringTime, i10, i7, i8, i9, i);
    }

    public void ReportAdmobAd(int i, String str, int i2, int i3, int i4, boolean z, int i5, boolean z2, int i6, int i7, int i8) {
        int i9;
        long duringTime = getDuringTime(i4, i2);
        if (i4 == 10) {
            i9 = ((i2 == 1 && this.isInterstitialAdLoading) || (i2 == 5 && this.isRewardedVideoAdLoading) || (i2 == 6 && this.isBannerAdLoading)) ? 1 : 2;
        } else {
            i9 = 0;
        }
        ReportAd(this.mContext, str, i2, i3, i4, getAdSourceByAdapterName(str), z, i5, z2, duringTime, i9, i6, i7, i8, i);
    }

    public static void ReportAd(Context context, String str, int i, int i2, int i3, int i4, boolean z, int i5, boolean z2, long j, int i6, int i7, int i8, int i9, int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = "scene=" + i + "&scene1=" + i2 + "&mediation_type=" + i10 + "&retry_show=" + i9 + "&action=" + i3 + "&ad_source=" + i4 + "&commercial=" + (z ? 1 : 0) + "&failure=" + i5 + "&remove_ads=" + (z2 ? 1 : 0) + "&reserve1=" + ((int) j) + "&reserve2=" + i6 + "&reserve3=" + str + "&reserve4=&cid=" + i7 + "&completion=" + i8 + "&uptime2=" + String.valueOf(currentTimeMillis / 1000) + "&player_time=" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(currentTimeMillis)) + "&network=" + String.valueOf(s.a(context));
        f.a("cmplaysdk_ads2", str2);
        h.a("ReportAd", "ReportAd  tableName:cmplaysdk_ads2\nstrParams:" + str2);
    }

    private long getDuringTime(int i, int i2) {
        long timeStampMilliSec = getTimeStampMilliSec();
        if (i == 103 || i == 104) {
            if (i2 == 1) {
                return timeStampMilliSec - this.requestISTime;
            }
            if (i2 == 5) {
                return timeStampMilliSec - this.requestRVTime;
            }
            if (i2 == 6) {
                return timeStampMilliSec - this.requestBannerTime;
            }
            return 0L;
        }
        if (i == 101) {
            if (i2 == 1 && this.lastCallRequestISTime > 0) {
                return timeStampMilliSec - this.lastCallRequestISTime;
            }
            if (i2 == 5 && this.lastCallRequestRVTime > 0) {
                return timeStampMilliSec - this.lastCallRequestRVTime;
            }
            if (i2 != 6 || this.lastCallRequestBannerTime <= 0) {
                return 0L;
            }
            return timeStampMilliSec - this.lastCallRequestBannerTime;
        }
        if (i != 102) {
            return 0L;
        }
        if (i2 == 1 && this.lastCallShowISTime > 0) {
            return timeStampMilliSec - this.lastCallShowISTime;
        }
        if (i2 == 5 && this.lastCallShowRVTime > 0) {
            return timeStampMilliSec - this.lastCallShowRVTime;
        }
        if (i2 != 6 || this.lastCallShowBannerTime <= 0) {
            return 0L;
        }
        return timeStampMilliSec - this.lastCallShowBannerTime;
    }

    public static int getAdSourceByAdapterName(String str) {
        if (AdUnit.GOOGLE_ADAPTER_CLASS.equalsIgnoreCase(str)) {
            return 1;
        }
        if ("com.cmplay.ad.Interstitial.AdxAds".equalsIgnoreCase(str) || "com.dancingbogo.skyrolline.ad.interstitial.AdxAds".equalsIgnoreCase(str) || AdUnit.CUSTOM_EVENT_ADAPTER_CLASS.equalsIgnoreCase(str)) {
            return 2;
        }
        if ("com.google.ads.mediation.unity.UnityAdapter".equalsIgnoreCase(str)) {
            return 3;
        }
        if ("com.google.ads.mediation.ironsource.IronSourceAdapter".equalsIgnoreCase(str) || "com.google.ads.mediation.ironsource.IronSourceRewardedAdapter".equalsIgnoreCase(str)) {
            return 4;
        }
        if ("com.vungle.mediation.VungleAdapter".equalsIgnoreCase(str)) {
            return 5;
        }
        if ("com.applovin.mediation.ApplovinAdapter".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("com.google.ads.mediation.facebook.FacebookAdapter".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("com.mopub.mobileads.dfp.adapters.MoPubAdapter".equalsIgnoreCase(str)) {
            return 8;
        }
        if ("com.google.ads.mediation.chartboost.ChartboostAdapter".equalsIgnoreCase(str)) {
            return 9;
        }
        if ("com.jirbo.adcolony.AdColonyAdapter".equalsIgnoreCase(str)) {
            return 11;
        }
        if ("com.google.ads.mediation.tapjoy.TapjoyAdapter".equalsIgnoreCase(str)) {
            return 12;
        }
        if ("com.aidem.BatMobiAdapter".equalsIgnoreCase(str)) {
            return 13;
        }
        if ("com.cmplay.dancingline.ad.admob.Mobvista.interstitialvideoanativedapter.MintegralCustomEventInterstitialVideoNative".equalsIgnoreCase(str) || "com.cmplay.dancingline.ad.admob.Mobvista.rewardadapter.MTGToAdmobRewardVideoAdapter".equalsIgnoreCase(str)) {
            return 14;
        }
        return ("com.aiming.mdt.sdk.ad.interstitialAd.adapter.AdmobInterstitialAdapter".equalsIgnoreCase(str) || "com.aiming.mdt.sdk.ad.videoad.adapter.AdmobVideoAdapter".equalsIgnoreCase(str)) ? 15 : 0;
    }

    public static long getTimeStampSec() {
        return System.currentTimeMillis() / 1000;
    }

    public static long getTimeStampMilliSec() {
        return System.currentTimeMillis();
    }
}
