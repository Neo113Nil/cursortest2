package com.aiming.mdt.mobileads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.aiming.mdt.mediation.InitListener;
import com.aiming.mdt.mediation.InitModel;
import com.aiming.mdt.utils.AdLog;
import com.aiming.mdt.utils.Constants;
import com.chartboost.sdk.Chartboost;
import java.util.Map;

/* loaded from: classes.dex */
public class ChartboostInit extends InitModel {
    private static final String ADT_VERSION = "5.5.3";

    @Override // com.aiming.mdt.mediation.InitModel
    public String mediation() {
        return Constants.IIMPR;
    }

    @Override // com.aiming.mdt.mediation.InitModel
    public void init(final Activity activity, Map<String, Object> map, final InitListener initListener) throws Throwable {
        super.init(activity, map, initListener);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.aiming.mdt.mobileads.ChartboostInit.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!TextUtils.isEmpty(ChartboostInit.this.mAppKey)) {
                        String[] split = ChartboostInit.this.mAppKey.split("#");
                        String str = split[0];
                        String str2 = split[1];
                        Chartboost.setActivityCallbacks(false);
                        Chartboost.setPIDataUseConsent(activity, Chartboost.CBPIDataUseConsent.YES_BEHAVIORAL);
                        Chartboost.startWithAppId(activity, str, str2);
                        Chartboost.setMediation(Chartboost.CBMediation.CBMediationOther, ChartboostInit.ADT_VERSION);
                        Chartboost.setShouldRequestInterstitialsInFirstSession(false);
                        Chartboost.setShouldPrefetchVideoContent(false);
                        Chartboost.setAutoCacheAds(true);
                        Chartboost.setDelegate(ChartboostCallback.getInstance());
                        initListener.onSuccess(ChartboostInit.this.mediation());
                        AdLog.getSingleton().LogD("Adt-Chartboost", "Chartboost init success");
                        return;
                    }
                    initListener.onError("appKey is empty");
                } catch (Throwable th) {
                    AdLog.getSingleton().LogE("init Chartboost error", th);
                    initListener.onError("init chartboost error : " + th.getLocalizedMessage());
                }
            }
        }, 0L);
    }
}
