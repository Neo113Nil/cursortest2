package com.aiming.mdt.mobileads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.aiming.mdt.mediation.CustomInterstitialEvent;
import com.aiming.mdt.utils.AdLog;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJConnectListener;
import com.tapjoy.TJError;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.Tapjoy;
import java.util.Map;

/* loaded from: classes.dex */
public class TapjoyInterstitial extends CustomInterstitialEvent implements TJPlacementListener {
    private static final String ADT_MEDIATION_ADAPTER_VERSION = "3.0.1";
    private static final String ADT_MEDIATION_NAME = "AdTiming";
    private Handler mHandler;
    private TJPlacement mInterstitialAd;

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public int getMediation() {
        return 10;
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
    }

    @Override // com.aiming.mdt.mediation.CustomInterstitialEvent
    public boolean isReady() {
        return this.mInterstitialAd != null && this.mInterstitialAd.isContentReady();
    }

    @Override // com.aiming.mdt.mediation.CustomInterstitialEvent
    public boolean show(Activity activity) {
        if (!isReady()) {
            return false;
        }
        this.mInterstitialAd.showContent();
        return true;
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void loadAd(Activity activity, Map<String, String> map) throws Throwable {
        super.loadAd(activity, map);
        if (check(activity, map)) {
            if (this.mHandler == null) {
                this.mHandler = new Handler(Looper.getMainLooper());
            }
            if (!Tapjoy.isLimitedConnected()) {
                if (!TextUtils.isEmpty(TapjoyInit.getAppKey())) {
                    Tapjoy.limitedConnect(activity.getApplicationContext(), TapjoyInit.getAppKey(), new TJConnectListener() { // from class: com.aiming.mdt.mobileads.TapjoyInterstitial.1
                        @Override // com.tapjoy.TJConnectListener
                        public void onConnectSuccess() {
                            TapjoyInterstitial.this.requestAd(TapjoyInterstitial.this.mInstancesKey);
                        }

                        @Override // com.tapjoy.TJConnectListener
                        public void onConnectFailure() {
                            TapjoyInterstitial.this.callbackOnUIThread(1, "init tapjoy error", null);
                            AdLog.getSingleton().LogD("Adt-Tapjoy", "Tapjoy interstitial is initialized failed'. \" +\n\"You must call Tapjoy.connect() ");
                        }
                    });
                    return;
                } else {
                    callbackOnUIThread(1, "init tapjoy error", null);
                    return;
                }
            }
            requestAd(this.mInstancesKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestAd(String str) {
        if (this.mInterstitialAd == null) {
            this.mInterstitialAd = Tapjoy.getLimitedPlacement(str, this);
            this.mInterstitialAd.setMediationName(ADT_MEDIATION_NAME);
            this.mInterstitialAd.setAdapterVersion(ADT_MEDIATION_ADAPTER_VERSION);
        }
        this.mInterstitialAd.requestContent();
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void destroy(Activity activity) {
        this.mInterstitialAd = null;
        if (this.mHandler != null) {
            this.mHandler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        this.isDestroyed = true;
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onRequestSuccess(TJPlacement tJPlacement) {
        if (this.isDestroyed || tJPlacement.isContentAvailable()) {
            return;
        }
        callbackOnUIThread(1, "no fill", null);
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onRequestFailure(TJPlacement tJPlacement, TJError tJError) {
        if (this.isDestroyed) {
            return;
        }
        callbackOnUIThread(1, tJError.message, null);
        AdLog.getSingleton().LogD("Adt-Tapjoy", "Tapjoy Interstitial ad load failed " + tJError.message);
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onContentReady(TJPlacement tJPlacement) {
        if (this.isDestroyed) {
            return;
        }
        callbackOnUIThread(0, null, tJPlacement);
        AdLog.getSingleton().LogD("Adt-Tapjoy", "Tapjoy Interstitial ad load success ");
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onContentShow(TJPlacement tJPlacement) {
        if (this.isDestroyed) {
            return;
        }
        callbackOnUIThread(4, null, tJPlacement);
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onContentDismiss(TJPlacement tJPlacement) {
        if (this.isDestroyed) {
            return;
        }
        callbackOnUIThread(3, null, null);
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onClick(TJPlacement tJPlacement) {
        callbackOnUIThread(2, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackOnUIThread(final int i, final String str, final Object obj) {
        this.mHandler.postDelayed(new Runnable() { // from class: com.aiming.mdt.mobileads.TapjoyInterstitial.2
            @Override // java.lang.Runnable
            public void run() {
                switch (i) {
                    case 0:
                        TapjoyInterstitial.this.onInsReady(obj);
                        break;
                    case 1:
                        TapjoyInterstitial.this.onInsError(str);
                        break;
                    case 2:
                        TapjoyInterstitial.this.onInsClicked();
                        break;
                    case 3:
                        TapjoyInterstitial.this.onInsClose(true);
                        break;
                    case 4:
                        TapjoyInterstitial.this.onInsShow(obj);
                        break;
                }
            }
        }, 0L);
    }
}
