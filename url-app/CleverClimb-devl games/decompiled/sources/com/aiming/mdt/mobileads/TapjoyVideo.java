package com.aiming.mdt.mobileads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.aiming.mdt.mediation.CustomVideoEvent;
import com.aiming.mdt.utils.AdLog;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJConnectListener;
import com.tapjoy.TJError;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.Tapjoy;
import java.util.Map;

/* loaded from: classes.dex */
public class TapjoyVideo extends CustomVideoEvent {
    private static final String ADT_MEDIATION_ADAPTER_VERSION = "3.0.1";
    private static final String ADT_MEDIATION_NAME = "AdTiming";
    private boolean isFullyWatched;
    private Handler mHandler;
    private TJPlacement mVideoAd;

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public int getMediation() {
        return 10;
    }

    @Override // com.aiming.mdt.mediation.CustomVideoEvent
    public boolean isReady() {
        return this.mVideoAd != null && this.mVideoAd.isContentReady();
    }

    @Override // com.aiming.mdt.mediation.CustomVideoEvent
    public boolean show(Activity activity) {
        if (isReady()) {
            this.mVideoAd.showContent();
            return true;
        }
        AdLog.getSingleton().LogD("Adt-Tapjoy", "Tapjoy Video ad not ready ");
        return false;
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
                    Tapjoy.limitedConnect(activity.getApplicationContext(), TapjoyInit.getAppKey(), new TJConnectListener() { // from class: com.aiming.mdt.mobileads.TapjoyVideo.1
                        @Override // com.tapjoy.TJConnectListener
                        public void onConnectSuccess() {
                            TapjoyVideo.this.requestAd(TapjoyVideo.this.mInstancesKey);
                        }

                        @Override // com.tapjoy.TJConnectListener
                        public void onConnectFailure() {
                            TapjoyVideo.this.callbackOnUIThread(1, "init tapjoy error", null);
                            AdLog.getSingleton().LogD("Adt-Tapjoy", "Tapjoy Video is initialized failed'. \" +\n\"You must call Tapjoy.connect() ");
                        }
                    });
                    return;
                } else {
                    callbackOnUIThread(1, "empty tapjoy appkey", null);
                    return;
                }
            }
            requestAd(this.mInstancesKey);
        }
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void destroy(Activity activity) {
        this.mVideoAd = null;
        if (this.mHandler != null) {
            this.mHandler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        this.isDestroyed = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestAd(String str) {
        if (this.mVideoAd == null) {
            this.mVideoAd = Tapjoy.getLimitedPlacement(str, new TapjoyRewardedPlacementListener());
            this.mVideoAd.setVideoListener(new TapjoyRewardVideoListener());
            this.mVideoAd.setMediationName(ADT_MEDIATION_NAME);
            this.mVideoAd.setAdapterVersion(ADT_MEDIATION_ADAPTER_VERSION);
        }
        this.mVideoAd.requestContent();
    }

    private class TapjoyRewardedPlacementListener implements TJPlacementListener {
        @Override // com.tapjoy.TJPlacementListener
        public void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
        }

        private TapjoyRewardedPlacementListener() {
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onRequestSuccess(TJPlacement tJPlacement) {
            if (TapjoyVideo.this.isDestroyed || tJPlacement.isContentAvailable()) {
                return;
            }
            TapjoyVideo.this.callbackOnUIThread(1, "no fill", null);
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onRequestFailure(TJPlacement tJPlacement, TJError tJError) {
            if (TapjoyVideo.this.isDestroyed) {
                return;
            }
            TapjoyVideo.this.callbackOnUIThread(1, tJError.message, null);
            AdLog.getSingleton().LogD("Adt-Tapjoy", "Tapjoy video ad load failed " + tJError.message);
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onContentReady(TJPlacement tJPlacement) {
            if (TapjoyVideo.this.isDestroyed) {
                return;
            }
            TapjoyVideo.this.callbackOnUIThread(0, null, tJPlacement);
            AdLog.getSingleton().LogD("Adt-Tapjoy", "Tapjoy video ad load success ");
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onContentShow(TJPlacement tJPlacement) {
            if (TapjoyVideo.this.isDestroyed) {
                return;
            }
            TapjoyVideo.this.callbackOnUIThread(4, null, tJPlacement);
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onContentDismiss(TJPlacement tJPlacement) {
            if (TapjoyVideo.this.isDestroyed) {
                return;
            }
            TapjoyVideo.this.callbackOnUIThread(3, null, null);
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
            AdLog.getSingleton().LogD("Adt-Tapjoy", "Tapjoy video ad reward request " + str);
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onClick(TJPlacement tJPlacement) {
            TapjoyVideo.this.callbackOnUIThread(2, null, null);
        }
    }

    private class TapjoyRewardVideoListener implements TJPlacementVideoListener {
        @Override // com.tapjoy.TJPlacementVideoListener
        public void onVideoError(TJPlacement tJPlacement, String str) {
        }

        @Override // com.tapjoy.TJPlacementVideoListener
        public void onVideoStart(TJPlacement tJPlacement) {
        }

        private TapjoyRewardVideoListener() {
        }

        @Override // com.tapjoy.TJPlacementVideoListener
        public void onVideoComplete(TJPlacement tJPlacement) {
            TapjoyVideo.this.isFullyWatched = true;
            TapjoyVideo.this.callbackOnUIThread(5, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackOnUIThread(final int i, final String str, final Object obj) {
        this.mHandler.postDelayed(new Runnable() { // from class: com.aiming.mdt.mobileads.TapjoyVideo.2
            @Override // java.lang.Runnable
            public void run() {
                switch (i) {
                    case 0:
                        TapjoyVideo.this.onInsReady(obj);
                        break;
                    case 1:
                        TapjoyVideo.this.onInsError(str);
                        break;
                    case 2:
                        TapjoyVideo.this.onInsClicked();
                        break;
                    case 3:
                        TapjoyVideo.this.onInsClose(TapjoyVideo.this.isFullyWatched);
                        break;
                    case 4:
                        TapjoyVideo.this.onInsShow(obj);
                        break;
                    case 5:
                        TapjoyVideo.this.callbackInsRewarded();
                        break;
                }
            }
        }, 0L);
    }
}
