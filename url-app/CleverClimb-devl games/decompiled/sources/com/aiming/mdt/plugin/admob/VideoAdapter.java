package com.aiming.mdt.plugin.admob;

import android.content.Context;
import com.aiming.mdt.sdk.ad.videoad.adapter.AdmobVideoAdapter;
import com.aiming.mdt.utils.AdLog;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import java.util.List;

/* loaded from: classes.dex */
public class VideoAdapter extends AdmobVideoAdapter {
    @Override // com.aiming.mdt.sdk.ad.videoad.adapter.AdmobVideoAdapter
    public VersionInfo getSDKVersionInfo() {
        return super.getSDKVersionInfo();
    }

    @Override // com.aiming.mdt.sdk.ad.videoad.adapter.AdmobVideoAdapter
    public VersionInfo getVersionInfo() {
        return super.getVersionInfo();
    }

    @Override // com.aiming.mdt.sdk.ad.videoad.adapter.AdmobVideoAdapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        super.initialize(context, initializationCompleteCallback, list);
        AdLog.getSingleton().LogD("VideoAdapter----initialize---new api---");
    }

    @Override // com.aiming.mdt.sdk.ad.videoad.adapter.AdmobVideoAdapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        super.loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.aiming.mdt.sdk.ad.videoad.adapter.AdmobVideoAdapter, com.google.android.gms.ads.mediation.OnContextChangedListener
    public void onContextChanged(Context context) {
        super.onContextChanged(context);
    }

    @Override // com.aiming.mdt.sdk.ad.videoad.adapter.AdmobVideoAdapter
    public void showAd(Context context) {
        super.showAd(context);
    }
}
