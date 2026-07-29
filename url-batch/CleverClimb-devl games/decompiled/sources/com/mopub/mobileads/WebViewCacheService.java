package com.mopub.mobileads;

import android.annotation.SuppressLint;
import android.os.Handler;
import com.mopub.common.ExternalViewabilitySessionManager;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class WebViewCacheService {

    @VisibleForTesting
    static final int MAX_SIZE = 50;

    @VisibleForTesting
    static final long TRIM_CACHE_FREQUENCY_MILLIS = 900000;

    @SuppressLint({"UseSparseArrays"})
    private static final Map<Long, Config> sWebViewConfigs = Collections.synchronizedMap(new HashMap());

    @VisibleForTesting
    static final TrimCacheRunnable sTrimCacheRunnable = new TrimCacheRunnable();
    private static Handler sHandler = new Handler();

    public static class Config {
        private final ExternalViewabilitySessionManager mViewabilityManager;
        private final WeakReference<Interstitial> mWeakInterstitial;
        private final BaseWebView mWebView;

        Config(BaseWebView baseWebView, Interstitial interstitial, ExternalViewabilitySessionManager externalViewabilitySessionManager) {
            this.mWebView = baseWebView;
            this.mWeakInterstitial = new WeakReference<>(interstitial);
            this.mViewabilityManager = externalViewabilitySessionManager;
        }

        public BaseWebView getWebView() {
            return this.mWebView;
        }

        public WeakReference<Interstitial> getWeakInterstitial() {
            return this.mWeakInterstitial;
        }

        public ExternalViewabilitySessionManager getViewabilityManager() {
            return this.mViewabilityManager;
        }
    }

    private WebViewCacheService() {
    }

    @VisibleForTesting
    public static void storeWebViewConfig(Long l, Interstitial interstitial, BaseWebView baseWebView, ExternalViewabilitySessionManager externalViewabilitySessionManager) {
        Preconditions.checkNotNull(l);
        Preconditions.checkNotNull(interstitial);
        Preconditions.checkNotNull(baseWebView);
        trimCache();
        if (sWebViewConfigs.size() >= 50) {
            MoPubLog.w("Unable to cache web view. Please destroy some via MoPubInterstitial#destroy() and try again.");
        } else {
            sWebViewConfigs.put(l, new Config(baseWebView, interstitial, externalViewabilitySessionManager));
        }
    }

    public static Config popWebViewConfig(Long l) {
        Preconditions.checkNotNull(l);
        return sWebViewConfigs.remove(l);
    }

    @VisibleForTesting
    static synchronized void trimCache() {
        synchronized (WebViewCacheService.class) {
            Iterator<Map.Entry<Long, Config>> it = sWebViewConfigs.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Long, Config> next = it.next();
                if (next.getValue().getWeakInterstitial().get() == null) {
                    next.getValue().getViewabilityManager().endDisplaySession();
                    it.remove();
                }
            }
            if (!sWebViewConfigs.isEmpty()) {
                sHandler.removeCallbacks(sTrimCacheRunnable);
                sHandler.postDelayed(sTrimCacheRunnable, 900000L);
            }
        }
    }

    private static class TrimCacheRunnable implements Runnable {
        private TrimCacheRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WebViewCacheService.trimCache();
        }
    }

    @VisibleForTesting
    @Deprecated
    public static void clearAll() {
        sWebViewConfigs.clear();
        sHandler.removeCallbacks(sTrimCacheRunnable);
    }

    @VisibleForTesting
    @Deprecated
    static Map<Long, Config> getWebViewConfigs() {
        return sWebViewConfigs;
    }

    @VisibleForTesting
    @Deprecated
    static void setHandler(Handler handler) {
        sHandler = handler;
    }
}
