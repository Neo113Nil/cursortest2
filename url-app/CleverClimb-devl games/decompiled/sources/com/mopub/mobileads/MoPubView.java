package com.mopub.mobileads;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.mopub.common.AdFormat;
import com.mopub.common.AdReport;
import com.mopub.common.MoPub;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.ManifestUtils;
import com.mopub.common.util.Reflection;
import com.mopub.common.util.Visibility;
import com.mopub.mobileads.factories.AdViewControllerFactory;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class MoPubView extends FrameLayout {
    private static final String CUSTOM_EVENT_BANNER_ADAPTER_FACTORY = "com.mopub.mobileads.factories.CustomEventBannerAdapterFactory";
    protected AdViewController mAdViewController;
    private BannerAdListener mBannerAdListener;
    private Context mContext;
    protected Object mCustomEventBannerAdapter;
    private BroadcastReceiver mScreenStateReceiver;
    private int mScreenVisibility;

    public interface BannerAdListener {
        void onBannerClicked(MoPubView moPubView);

        void onBannerCollapsed(MoPubView moPubView);

        void onBannerExpanded(MoPubView moPubView);

        void onBannerFailed(MoPubView moPubView, MoPubErrorCode moPubErrorCode);

        void onBannerLoaded(MoPubView moPubView);
    }

    @Deprecated
    public String getClickTrackingUrl() {
        return null;
    }

    @Deprecated
    public String getResponseString() {
        return null;
    }

    @Deprecated
    public void setTimeout(int i) {
    }

    public MoPubView(Context context) {
        this(context, null);
    }

    public MoPubView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ManifestUtils.checkWebViewActivitiesDeclared(context);
        this.mContext = context;
        this.mScreenVisibility = getVisibility();
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        this.mAdViewController = AdViewControllerFactory.create(context, this);
        registerScreenStateBroadcastReceiver();
    }

    private void registerScreenStateBroadcastReceiver() {
        this.mScreenStateReceiver = new BroadcastReceiver() { // from class: com.mopub.mobileads.MoPubView.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (!Visibility.isScreenVisible(MoPubView.this.mScreenVisibility) || intent == null) {
                    return;
                }
                String action = intent.getAction();
                if ("android.intent.action.USER_PRESENT".equals(action)) {
                    MoPubView.this.setAdVisibility(0);
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    MoPubView.this.setAdVisibility(8);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.mContext.registerReceiver(this.mScreenStateReceiver, intentFilter);
    }

    private void unregisterScreenStateBroadcastReceiver() {
        try {
            this.mContext.unregisterReceiver(this.mScreenStateReceiver);
        } catch (Exception unused) {
            MoPubLog.d("Failed to unregister screen state broadcast receiver (never registered).");
        }
    }

    public void loadAd() {
        if (this.mAdViewController != null) {
            this.mAdViewController.loadAd();
        }
    }

    public void destroy() {
        unregisterScreenStateBroadcastReceiver();
        removeAllViews();
        if (this.mAdViewController != null) {
            this.mAdViewController.cleanup();
            this.mAdViewController = null;
        }
        if (this.mCustomEventBannerAdapter != null) {
            invalidateAdapter();
            this.mCustomEventBannerAdapter = null;
        }
    }

    private void invalidateAdapter() {
        if (this.mCustomEventBannerAdapter != null) {
            try {
                new Reflection.MethodBuilder(this.mCustomEventBannerAdapter, "invalidate").setAccessible().execute();
            } catch (Exception e) {
                MoPubLog.e("Error invalidating adapter", e);
            }
        }
    }

    Integer getAdTimeoutDelay() {
        if (this.mAdViewController != null) {
            return this.mAdViewController.getAdTimeoutDelay();
        }
        return null;
    }

    protected boolean loadFailUrl(MoPubErrorCode moPubErrorCode) {
        if (this.mAdViewController == null) {
            return false;
        }
        return this.mAdViewController.loadFailUrl(moPubErrorCode);
    }

    protected void loadCustomEvent(String str, Map<String, String> map) {
        if (this.mAdViewController == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MoPubLog.d("Couldn't invoke custom event because the server did not specify one.");
            loadFailUrl(MoPubErrorCode.ADAPTER_NOT_FOUND);
            return;
        }
        if (this.mCustomEventBannerAdapter != null) {
            invalidateAdapter();
        }
        MoPubLog.d("Loading custom event adapter.");
        if (Reflection.classFound(CUSTOM_EVENT_BANNER_ADAPTER_FACTORY)) {
            try {
                this.mCustomEventBannerAdapter = new Reflection.MethodBuilder(null, "create").setStatic(Class.forName(CUSTOM_EVENT_BANNER_ADAPTER_FACTORY)).addParam((Class<Class>) MoPubView.class, (Class) this).addParam((Class<Class>) String.class, (Class) str).addParam((Class<Class>) Map.class, (Class) map).addParam((Class<Class>) Long.TYPE, (Class) Long.valueOf(this.mAdViewController.getBroadcastIdentifier())).addParam((Class<Class>) AdReport.class, (Class) this.mAdViewController.getAdReport()).execute();
                new Reflection.MethodBuilder(this.mCustomEventBannerAdapter, "loadAd").setAccessible().execute();
                return;
            } catch (Exception e) {
                MoPubLog.e("Error loading custom event", e);
                return;
            }
        }
        MoPubLog.e("Could not load custom event -- missing banner module");
    }

    protected void registerClick() {
        if (this.mAdViewController != null) {
            this.mAdViewController.registerClick();
            adClicked();
        }
    }

    protected void trackNativeImpression() {
        MoPubLog.d("Tracking impression for native adapter.");
        if (this.mAdViewController != null) {
            this.mAdViewController.trackImpression();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        if (Visibility.hasScreenVisibilityChanged(this.mScreenVisibility, i)) {
            this.mScreenVisibility = i;
            setAdVisibility(this.mScreenVisibility);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdVisibility(int i) {
        if (this.mAdViewController == null) {
            return;
        }
        if (Visibility.isScreenVisible(i)) {
            this.mAdViewController.resumeRefresh();
        } else {
            this.mAdViewController.pauseRefresh();
        }
    }

    protected void adLoaded() {
        MoPubLog.d("adLoaded");
        if (this.mBannerAdListener != null) {
            this.mBannerAdListener.onBannerLoaded(this);
        }
    }

    protected void adFailed(MoPubErrorCode moPubErrorCode) {
        if (this.mBannerAdListener != null) {
            this.mBannerAdListener.onBannerFailed(this, moPubErrorCode);
        }
    }

    protected void adPresentedOverlay() {
        if (this.mBannerAdListener != null) {
            this.mBannerAdListener.onBannerExpanded(this);
        }
    }

    protected void adClosed() {
        if (this.mBannerAdListener != null) {
            this.mBannerAdListener.onBannerCollapsed(this);
        }
    }

    protected void adClicked() {
        if (this.mBannerAdListener != null) {
            this.mBannerAdListener.onBannerClicked(this);
        }
    }

    protected void nativeAdLoaded() {
        if (this.mAdViewController != null) {
            this.mAdViewController.scheduleRefreshTimerIfEnabled();
        }
        adLoaded();
    }

    public void setAdUnitId(String str) {
        if (this.mAdViewController != null) {
            this.mAdViewController.setAdUnitId(str);
        }
    }

    public String getAdUnitId() {
        if (this.mAdViewController != null) {
            return this.mAdViewController.getAdUnitId();
        }
        return null;
    }

    public void setKeywords(String str) {
        if (this.mAdViewController != null) {
            this.mAdViewController.setKeywords(str);
        }
    }

    public String getKeywords() {
        if (this.mAdViewController != null) {
            return this.mAdViewController.getKeywords();
        }
        return null;
    }

    public void setUserDataKeywords(String str) {
        if (this.mAdViewController == null || !MoPub.canCollectPersonalInformation()) {
            return;
        }
        this.mAdViewController.setUserDataKeywords(str);
    }

    public String getUserDataKeywords() {
        if (this.mAdViewController == null || !MoPub.canCollectPersonalInformation()) {
            return null;
        }
        return this.mAdViewController.getUserDataKeywords();
    }

    public void setLocation(Location location) {
        if (this.mAdViewController == null || !MoPub.canCollectPersonalInformation()) {
            return;
        }
        this.mAdViewController.setLocation(location);
    }

    public Location getLocation() {
        if (this.mAdViewController == null || !MoPub.canCollectPersonalInformation()) {
            return null;
        }
        return this.mAdViewController.getLocation();
    }

    public int getAdWidth() {
        if (this.mAdViewController != null) {
            return this.mAdViewController.getAdWidth();
        }
        return 0;
    }

    public int getAdHeight() {
        if (this.mAdViewController != null) {
            return this.mAdViewController.getAdHeight();
        }
        return 0;
    }

    public Activity getActivity() {
        return (Activity) this.mContext;
    }

    public void setBannerAdListener(BannerAdListener bannerAdListener) {
        this.mBannerAdListener = bannerAdListener;
    }

    public BannerAdListener getBannerAdListener() {
        return this.mBannerAdListener;
    }

    public void setLocalExtras(Map<String, Object> map) {
        if (this.mAdViewController != null) {
            this.mAdViewController.setLocalExtras(map);
        }
    }

    public Map<String, Object> getLocalExtras() {
        if (this.mAdViewController != null) {
            return this.mAdViewController.getLocalExtras();
        }
        return new TreeMap();
    }

    public void setAutorefreshEnabled(boolean z) {
        if (this.mAdViewController != null) {
            this.mAdViewController.setShouldAllowAutoRefresh(z);
        }
    }

    public boolean getAutorefreshEnabled() {
        if (this.mAdViewController != null) {
            return this.mAdViewController.getCurrentAutoRefreshStatus();
        }
        MoPubLog.d("Can't get autorefresh status for destroyed MoPubView. Returning false.");
        return false;
    }

    public void setAdContentView(View view) {
        if (this.mAdViewController != null) {
            this.mAdViewController.setAdContentView(view);
        }
    }

    public void setTesting(boolean z) {
        if (this.mAdViewController != null) {
            this.mAdViewController.setTesting(z);
        }
    }

    public boolean getTesting() {
        if (this.mAdViewController != null) {
            return this.mAdViewController.getTesting();
        }
        MoPubLog.d("Can't get testing status for destroyed MoPubView. Returning false.");
        return false;
    }

    public void forceRefresh() {
        if (this.mCustomEventBannerAdapter != null) {
            invalidateAdapter();
            this.mCustomEventBannerAdapter = null;
        }
        if (this.mAdViewController != null) {
            this.mAdViewController.forceRefresh();
        }
    }

    AdViewController getAdViewController() {
        return this.mAdViewController;
    }

    public AdFormat getAdFormat() {
        return AdFormat.BANNER;
    }
}
