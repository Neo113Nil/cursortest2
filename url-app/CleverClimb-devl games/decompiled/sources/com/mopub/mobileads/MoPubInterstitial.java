package com.mopub.mobileads;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.text.TextUtils;
import com.mopub.common.AdFormat;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.AdTypeTranslator;
import com.mopub.mobileads.CustomEventInterstitialAdapter;
import com.mopub.mobileads.factories.CustomEventInterstitialAdapterFactory;
import java.util.Map;

/* loaded from: classes2.dex */
public class MoPubInterstitial implements CustomEventInterstitialAdapter.CustomEventInterstitialAdapterListener {
    private Activity mActivity;
    private final Runnable mAdExpiration;
    private volatile InterstitialState mCurrentInterstitialState;
    private CustomEventInterstitialAdapter mCustomEventInterstitialAdapter;
    private Handler mHandler;
    private InterstitialAdListener mInterstitialAdListener;
    private MoPubInterstitialView mInterstitialView;

    public interface InterstitialAdListener {
        void onInterstitialClicked(MoPubInterstitial moPubInterstitial);

        void onInterstitialDismissed(MoPubInterstitial moPubInterstitial);

        void onInterstitialFailed(MoPubInterstitial moPubInterstitial, MoPubErrorCode moPubErrorCode);

        void onInterstitialLoaded(MoPubInterstitial moPubInterstitial);

        void onInterstitialShown(MoPubInterstitial moPubInterstitial);
    }

    @VisibleForTesting
    enum InterstitialState {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MoPubInterstitial(Activity activity, String str) {
        this.mActivity = activity;
        this.mInterstitialView = new MoPubInterstitialView(this.mActivity);
        this.mInterstitialView.setAdUnitId(str);
        this.mCurrentInterstitialState = InterstitialState.IDLE;
        this.mHandler = new Handler();
        this.mAdExpiration = new Runnable() { // from class: com.mopub.mobileads.MoPubInterstitial.1
            @Override // java.lang.Runnable
            public void run() {
                MoPubLog.d("Expiring unused Interstitial ad.");
                MoPubInterstitial.this.attemptStateTransition(InterstitialState.IDLE, true);
                if (InterstitialState.SHOWING.equals(MoPubInterstitial.this.mCurrentInterstitialState) || InterstitialState.DESTROYED.equals(MoPubInterstitial.this.mCurrentInterstitialState)) {
                    return;
                }
                MoPubInterstitial.this.mInterstitialView.adFailed(MoPubErrorCode.EXPIRED);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean attemptStateTransition(InterstitialState interstitialState) {
        return attemptStateTransition(interstitialState, false);
    }

    @VisibleForTesting
    synchronized boolean attemptStateTransition(InterstitialState interstitialState, boolean z) {
        Preconditions.checkNotNull(interstitialState);
        switch (this.mCurrentInterstitialState) {
            case LOADING:
                switch (interstitialState) {
                    case LOADING:
                        if (!z) {
                            MoPubLog.d("Already loading an interstitial.");
                        }
                        return false;
                    case SHOWING:
                        MoPubLog.d("Interstitial is not ready to be shown yet.");
                        return false;
                    case DESTROYED:
                        setInterstitialStateDestroyed();
                        return true;
                    case IDLE:
                        invalidateInterstitialAdapter();
                        this.mCurrentInterstitialState = InterstitialState.IDLE;
                        return true;
                    case READY:
                        this.mCurrentInterstitialState = InterstitialState.READY;
                        if (AdTypeTranslator.CustomEventType.isMoPubSpecific(this.mInterstitialView.getCustomEventClassName())) {
                            this.mHandler.postDelayed(this.mAdExpiration, 14400000L);
                        }
                        return true;
                    default:
                        return false;
                }
            case SHOWING:
                switch (interstitialState) {
                    case LOADING:
                        if (!z) {
                            MoPubLog.d("Interstitial already showing. Not loading another.");
                        }
                        return false;
                    case SHOWING:
                        MoPubLog.d("Already showing an interstitial. Cannot show it again.");
                        return false;
                    case DESTROYED:
                        setInterstitialStateDestroyed();
                        return true;
                    case IDLE:
                        if (z) {
                            MoPubLog.d("Cannot force refresh while showing an interstitial.");
                            return false;
                        }
                        invalidateInterstitialAdapter();
                        this.mCurrentInterstitialState = InterstitialState.IDLE;
                        return true;
                    default:
                        return false;
                }
            case DESTROYED:
                MoPubLog.d("MoPubInterstitial destroyed. Ignoring all requests.");
                return false;
            case IDLE:
                switch (interstitialState) {
                    case LOADING:
                        invalidateInterstitialAdapter();
                        this.mCurrentInterstitialState = InterstitialState.LOADING;
                        if (z) {
                            this.mInterstitialView.forceRefresh();
                        } else {
                            this.mInterstitialView.loadAd();
                        }
                        return true;
                    case SHOWING:
                        MoPubLog.d("No interstitial loading or loaded.");
                        return false;
                    case DESTROYED:
                        setInterstitialStateDestroyed();
                        return true;
                    default:
                        return false;
                }
            case READY:
                switch (interstitialState) {
                    case LOADING:
                        MoPubLog.d("Interstitial already loaded. Not loading another.");
                        if (this.mInterstitialAdListener != null) {
                            this.mInterstitialAdListener.onInterstitialLoaded(this);
                        }
                        return false;
                    case SHOWING:
                        showCustomEventInterstitial();
                        this.mCurrentInterstitialState = InterstitialState.SHOWING;
                        this.mHandler.removeCallbacks(this.mAdExpiration);
                        return true;
                    case DESTROYED:
                        setInterstitialStateDestroyed();
                        return true;
                    case IDLE:
                        if (!z) {
                            return false;
                        }
                        invalidateInterstitialAdapter();
                        this.mCurrentInterstitialState = InterstitialState.IDLE;
                        return true;
                    default:
                        return false;
                }
            default:
                return false;
        }
    }

    private void setInterstitialStateDestroyed() {
        invalidateInterstitialAdapter();
        this.mInterstitialView.setBannerAdListener(null);
        this.mInterstitialView.destroy();
        this.mHandler.removeCallbacks(this.mAdExpiration);
        this.mCurrentInterstitialState = InterstitialState.DESTROYED;
    }

    public void load() {
        attemptStateTransition(InterstitialState.LOADING);
    }

    public boolean show() {
        return attemptStateTransition(InterstitialState.SHOWING);
    }

    public void forceRefresh() {
        attemptStateTransition(InterstitialState.IDLE, true);
        attemptStateTransition(InterstitialState.LOADING, true);
    }

    public boolean isReady() {
        return this.mCurrentInterstitialState == InterstitialState.READY;
    }

    boolean isDestroyed() {
        return this.mCurrentInterstitialState == InterstitialState.DESTROYED;
    }

    Integer getAdTimeoutDelay() {
        return this.mInterstitialView.getAdTimeoutDelay();
    }

    MoPubInterstitialView getMoPubInterstitialView() {
        return this.mInterstitialView;
    }

    private void showCustomEventInterstitial() {
        if (this.mCustomEventInterstitialAdapter != null) {
            this.mCustomEventInterstitialAdapter.showInterstitial();
        }
    }

    private void invalidateInterstitialAdapter() {
        if (this.mCustomEventInterstitialAdapter != null) {
            this.mCustomEventInterstitialAdapter.invalidate();
            this.mCustomEventInterstitialAdapter = null;
        }
    }

    public void setKeywords(String str) {
        this.mInterstitialView.setKeywords(str);
    }

    public String getKeywords() {
        return this.mInterstitialView.getKeywords();
    }

    public void setUserDataKeywords(String str) {
        this.mInterstitialView.setUserDataKeywords(str);
    }

    public String getUserDataKeywords() {
        return this.mInterstitialView.getUserDataKeywords();
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    public Location getLocation() {
        return this.mInterstitialView.getLocation();
    }

    public void destroy() {
        attemptStateTransition(InterstitialState.DESTROYED);
    }

    public void setInterstitialAdListener(InterstitialAdListener interstitialAdListener) {
        this.mInterstitialAdListener = interstitialAdListener;
    }

    public InterstitialAdListener getInterstitialAdListener() {
        return this.mInterstitialAdListener;
    }

    public void setTesting(boolean z) {
        this.mInterstitialView.setTesting(z);
    }

    public boolean getTesting() {
        return this.mInterstitialView.getTesting();
    }

    public void setLocalExtras(Map<String, Object> map) {
        this.mInterstitialView.setLocalExtras(map);
    }

    public Map<String, Object> getLocalExtras() {
        return this.mInterstitialView.getLocalExtras();
    }

    @Override // com.mopub.mobileads.CustomEventInterstitialAdapter.CustomEventInterstitialAdapterListener
    public void onCustomEventInterstitialLoaded() {
        if (isDestroyed()) {
            return;
        }
        attemptStateTransition(InterstitialState.READY);
        if (this.mInterstitialAdListener != null) {
            this.mInterstitialAdListener.onInterstitialLoaded(this);
        }
    }

    @Override // com.mopub.mobileads.CustomEventInterstitialAdapter.CustomEventInterstitialAdapterListener
    public void onCustomEventInterstitialFailed(MoPubErrorCode moPubErrorCode) {
        if (isDestroyed() || this.mInterstitialView.loadFailUrl(moPubErrorCode)) {
            return;
        }
        attemptStateTransition(InterstitialState.IDLE);
    }

    @Override // com.mopub.mobileads.CustomEventInterstitialAdapter.CustomEventInterstitialAdapterListener
    public void onCustomEventInterstitialShown() {
        if (isDestroyed()) {
            return;
        }
        this.mInterstitialView.trackImpression();
        if (this.mInterstitialAdListener != null) {
            this.mInterstitialAdListener.onInterstitialShown(this);
        }
    }

    @Override // com.mopub.mobileads.CustomEventInterstitialAdapter.CustomEventInterstitialAdapterListener
    public void onCustomEventInterstitialClicked() {
        if (isDestroyed()) {
            return;
        }
        this.mInterstitialView.registerClick();
        if (this.mInterstitialAdListener != null) {
            this.mInterstitialAdListener.onInterstitialClicked(this);
        }
    }

    @Override // com.mopub.mobileads.CustomEventInterstitialAdapter.CustomEventInterstitialAdapterListener
    public void onCustomEventInterstitialDismissed() {
        if (isDestroyed()) {
            return;
        }
        attemptStateTransition(InterstitialState.IDLE);
        if (this.mInterstitialAdListener != null) {
            this.mInterstitialAdListener.onInterstitialDismissed(this);
        }
    }

    public class MoPubInterstitialView extends MoPubView {
        public MoPubInterstitialView(Context context) {
            super(context);
            setAutorefreshEnabled(false);
        }

        String getCustomEventClassName() {
            return this.mAdViewController.getCustomEventClassName();
        }

        @Override // com.mopub.mobileads.MoPubView
        public AdFormat getAdFormat() {
            return AdFormat.INTERSTITIAL;
        }

        @Override // com.mopub.mobileads.MoPubView
        protected void loadCustomEvent(String str, Map<String, String> map) {
            if (this.mAdViewController == null) {
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                if (MoPubInterstitial.this.mCustomEventInterstitialAdapter != null) {
                    MoPubInterstitial.this.mCustomEventInterstitialAdapter.invalidate();
                }
                MoPubLog.d("Loading custom event interstitial adapter.");
                MoPubInterstitial.this.mCustomEventInterstitialAdapter = CustomEventInterstitialAdapterFactory.create(MoPubInterstitial.this, str, map, this.mAdViewController.getBroadcastIdentifier(), this.mAdViewController.getAdReport());
                MoPubInterstitial.this.mCustomEventInterstitialAdapter.setAdapterListener(MoPubInterstitial.this);
                MoPubInterstitial.this.mCustomEventInterstitialAdapter.loadInterstitial();
                return;
            }
            MoPubLog.d("Couldn't invoke custom event because the server did not specify one.");
            loadFailUrl(MoPubErrorCode.ADAPTER_NOT_FOUND);
        }

        protected void trackImpression() {
            MoPubLog.d("Tracking impression for interstitial.");
            if (this.mAdViewController != null) {
                this.mAdViewController.trackImpression();
            }
        }

        @Override // com.mopub.mobileads.MoPubView
        protected void adFailed(MoPubErrorCode moPubErrorCode) {
            MoPubInterstitial.this.attemptStateTransition(InterstitialState.IDLE);
            if (MoPubInterstitial.this.mInterstitialAdListener != null) {
                MoPubInterstitial.this.mInterstitialAdListener.onInterstitialFailed(MoPubInterstitial.this, moPubErrorCode);
            }
        }
    }

    @VisibleForTesting
    @Deprecated
    void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    @VisibleForTesting
    @Deprecated
    void setInterstitialView(MoPubInterstitialView moPubInterstitialView) {
        this.mInterstitialView = moPubInterstitialView;
    }

    @VisibleForTesting
    @Deprecated
    void setCurrentInterstitialState(InterstitialState interstitialState) {
        this.mCurrentInterstitialState = interstitialState;
    }

    @VisibleForTesting
    @Deprecated
    InterstitialState getCurrentInterstitialState() {
        return this.mCurrentInterstitialState;
    }

    @VisibleForTesting
    @Deprecated
    void setCustomEventInterstitialAdapter(CustomEventInterstitialAdapter customEventInterstitialAdapter) {
        this.mCustomEventInterstitialAdapter = customEventInterstitialAdapter;
    }
}
