package com.mopub.mobileads;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.b.d.b;
import com.ironsource.b.f.f;
import com.ironsource.b.k;
import com.mopub.common.LifecycleListener;
import com.mopub.common.MoPub;
import com.mopub.common.MoPubLifecycleManager;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.CustomEventInterstitial;
import java.util.Map;

/* loaded from: classes2.dex */
public class IronSourceInterstitial extends CustomEventInterstitial implements f {
    private static final String ADAPTER_VERSION = "300";
    private static final String APPLICATION_KEY = "applicationKey";
    private static final String INSTANCE_ID_KEY = "instanceId";
    private static final String MEDIATION_TYPE = "mopub";
    private static final String PLACEMENT_KEY = "placementName";
    private static LifecycleListener lifecycleListener = new LifecycleListener() { // from class: com.mopub.mobileads.IronSourceInterstitial.6
        @Override // com.mopub.common.LifecycleListener
        public void onBackPressed(Activity activity) {
        }

        @Override // com.mopub.common.LifecycleListener
        public void onCreate(Activity activity) {
        }

        @Override // com.mopub.common.LifecycleListener
        public void onDestroy(Activity activity) {
        }

        @Override // com.mopub.common.LifecycleListener
        public void onRestart(Activity activity) {
        }

        @Override // com.mopub.common.LifecycleListener
        public void onStart(Activity activity) {
        }

        @Override // com.mopub.common.LifecycleListener
        public void onStop(Activity activity) {
        }

        @Override // com.mopub.common.LifecycleListener
        public void onPause(Activity activity) {
            k.b(activity);
        }

        @Override // com.mopub.common.LifecycleListener
        public void onResume(Activity activity) {
            k.a(activity);
        }
    };
    private static boolean mInitInterstitialSuccessfully;
    private static CustomEventInterstitial.CustomEventInterstitialListener mMoPubListener;
    private static Handler sHandler;
    private String mInstanceId = "0";
    private String mPlacementName = null;

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdShowSucceeded(String str) {
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial
    protected void loadInterstitial(Context context, CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener, Map<String, Object> map, Map<String, String> map2) {
        String str;
        MoPubLifecycleManager.getInstance((Activity) context).addLifecycleListener(lifecycleListener);
        k.a(MoPub.canCollectPersonalInformation());
        try {
            mMoPubListener = customEventInterstitialListener;
            sHandler = new Handler(Looper.getMainLooper());
            if (!(context instanceof Activity)) {
                MoPubLog.d("IronSource load interstitial must be called from an Activity context");
                sendMoPubInterstitialFailed(MoPubErrorCode.INTERNAL_ERROR);
                return;
            }
            str = "";
            if (map2 != null) {
                str = map2.get(APPLICATION_KEY) != null ? map2.get(APPLICATION_KEY) : "";
                if (map2.get(PLACEMENT_KEY) != null) {
                    this.mPlacementName = map2.get(PLACEMENT_KEY);
                }
                if (map2.get(INSTANCE_ID_KEY) != null && !TextUtils.isEmpty(map2.get(INSTANCE_ID_KEY))) {
                    this.mInstanceId = map2.get(INSTANCE_ID_KEY);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                initIronSourceSDK((Activity) context, str);
                loadInterstitial();
            } else {
                MoPubLog.d("IronSource initialization failed, make sure that 'applicationKey' server parameter is added");
                sendMoPubInterstitialFailed(MoPubErrorCode.INTERNAL_ERROR);
            }
        } catch (Exception e) {
            MoPubLog.d(e.toString());
            sendMoPubInterstitialFailed(MoPubErrorCode.INTERNAL_ERROR);
        }
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial
    protected void showInterstitial() {
        try {
            if (k.g(this.mInstanceId)) {
                if (TextUtils.isEmpty(this.mPlacementName)) {
                    k.f(this.mInstanceId);
                } else {
                    k.b(this.mInstanceId, this.mPlacementName);
                }
            } else {
                sendMoPubInterstitialFailed(MoPubErrorCode.NO_FILL);
            }
        } catch (Exception e) {
            MoPubLog.d(e.toString());
            sendMoPubInterstitialFailed(MoPubErrorCode.INTERNAL_ERROR);
        }
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial
    protected void onInvalidate() {
        mMoPubListener = null;
    }

    private void initIronSourceSDK(Activity activity, String str) {
        k.a(this);
        if (mInitInterstitialSuccessfully) {
            return;
        }
        MoPubLog.d("IronSource initialization succeeded for Interstitial");
        k.a("mopub300");
        k.b(activity, str, k.a.INTERSTITIAL);
        mInitInterstitialSuccessfully = true;
    }

    private void loadInterstitial() {
        if (k.g(this.mInstanceId)) {
            onInterstitialAdReady(this.mInstanceId);
        } else {
            k.e(this.mInstanceId);
        }
    }

    private void sendMoPubInterstitialFailed(final MoPubErrorCode moPubErrorCode) {
        sHandler.post(new Runnable() { // from class: com.mopub.mobileads.IronSourceInterstitial.1
            @Override // java.lang.Runnable
            public void run() {
                if (IronSourceInterstitial.mMoPubListener != null) {
                    IronSourceInterstitial.mMoPubListener.onInterstitialFailed(moPubErrorCode);
                }
            }
        });
    }

    private MoPubErrorCode getMoPubErrorMessage(b bVar) {
        if (bVar == null) {
            return MoPubErrorCode.INTERNAL_ERROR;
        }
        switch (bVar.a()) {
            case 501:
            case 505:
            case 506:
            case 508:
                return MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR;
            case 502:
                return MoPubErrorCode.VIDEO_CACHE_ERROR;
            case 509:
                return MoPubErrorCode.NETWORK_NO_FILL;
            case 510:
                return MoPubErrorCode.INTERNAL_ERROR;
            case 520:
                return MoPubErrorCode.NO_CONNECTION;
            default:
                return MoPubErrorCode.UNSPECIFIED;
        }
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdReady(String str) {
        MoPubLog.d("IronSource Interstitial loaded successfully for instance " + this.mInstanceId);
        if (this.mInstanceId.equals(str)) {
            sHandler.post(new Runnable() { // from class: com.mopub.mobileads.IronSourceInterstitial.2
                @Override // java.lang.Runnable
                public void run() {
                    if (IronSourceInterstitial.mMoPubListener != null) {
                        IronSourceInterstitial.mMoPubListener.onInterstitialLoaded();
                    }
                }
            });
        }
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdLoadFailed(String str, b bVar) {
        MoPubLog.d("IronSource Interstitial failed to load for instance " + this.mInstanceId + " Error: " + bVar.b());
        if (this.mInstanceId.equals(str)) {
            sendMoPubInterstitialFailed(getMoPubErrorMessage(bVar));
        }
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdOpened(String str) {
        MoPubLog.d("IronSource Interstitial opened ad for instance " + str);
        sHandler.post(new Runnable() { // from class: com.mopub.mobileads.IronSourceInterstitial.3
            @Override // java.lang.Runnable
            public void run() {
                if (IronSourceInterstitial.mMoPubListener != null) {
                    IronSourceInterstitial.mMoPubListener.onInterstitialShown();
                }
            }
        });
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdClosed(String str) {
        MoPubLog.d("IronSource Interstitial closed ad for instance " + str);
        sHandler.post(new Runnable() { // from class: com.mopub.mobileads.IronSourceInterstitial.4
            @Override // java.lang.Runnable
            public void run() {
                if (IronSourceInterstitial.mMoPubListener != null) {
                    IronSourceInterstitial.mMoPubListener.onInterstitialDismissed();
                }
            }
        });
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdShowFailed(String str, b bVar) {
        MoPubLog.d("IronSource Interstitial failed to show for instance " + str);
        sendMoPubInterstitialFailed(MoPubErrorCode.INTERNAL_ERROR);
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdClicked(String str) {
        MoPubLog.d("IronSource Interstitial clicked ad for instance " + str);
        sHandler.post(new Runnable() { // from class: com.mopub.mobileads.IronSourceInterstitial.5
            @Override // java.lang.Runnable
            public void run() {
                if (IronSourceInterstitial.mMoPubListener != null) {
                    IronSourceInterstitial.mMoPubListener.onInterstitialClicked();
                }
            }
        });
    }
}
