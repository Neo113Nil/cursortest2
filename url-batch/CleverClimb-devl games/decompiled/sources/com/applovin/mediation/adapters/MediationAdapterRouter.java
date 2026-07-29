package com.applovin.mediation.adapters;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class MediationAdapterRouter {
    protected MaxAdapter.OnCompletionListener mOnCompletionListener;
    protected final String mTag = getClass().getSimpleName();
    private final Map<String, List<MediationAdapterRouterListenerWrapper>> listeners = new HashMap();
    private final Set<MaxAdapter> loadedAdapters = new HashSet();
    private final Set<MaxAdapter> showingAdapters = new HashSet();

    private final class MediationAdapterRouterListenerWrapper {
        private final View mAdView;
        private final MaxAdapter mAdapter;
        private final MaxAdapterListener mListener;
        private final RouterAdLoadType mLoadType;

        MediationAdapterRouterListenerWrapper(MediationAdapterRouter mediationAdapterRouter, MaxAdapter maxAdapter, MaxAdapterListener maxAdapterListener, RouterAdLoadType routerAdLoadType) {
            this(maxAdapter, maxAdapterListener, routerAdLoadType, null);
        }

        MediationAdapterRouterListenerWrapper(MaxAdapter maxAdapter, MaxAdapterListener maxAdapterListener, RouterAdLoadType routerAdLoadType, View view) {
            this.mAdapter = maxAdapter;
            this.mListener = maxAdapterListener;
            this.mLoadType = routerAdLoadType;
            this.mAdView = view;
        }

        View getAdView() {
            return this.mAdView;
        }

        MaxAdapter getAdapter() {
            return this.mAdapter;
        }

        MaxAdapterListener getListener() {
            return this.mListener;
        }

        RouterAdLoadType getLoadType() {
            return this.mLoadType;
        }
    }

    private enum RouterAdLoadType {
        INTERSTITIAL,
        REWARDED,
        ADVIEW
    }

    protected MediationAdapterRouter() {
    }

    private void addAdapter(MaxAdapter maxAdapter, MaxAdapterListener maxAdapterListener, String str, RouterAdLoadType routerAdLoadType) {
        MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper = new MediationAdapterRouterListenerWrapper(this, maxAdapter, maxAdapterListener, routerAdLoadType);
        List<MediationAdapterRouterListenerWrapper> arrayList = this.listeners.get(str) != null ? this.listeners.get(str) : new ArrayList<>(1);
        arrayList.add(mediationAdapterRouterListenerWrapper);
        this.listeners.put(str, arrayList);
    }

    private void addLoadedAdapter(MaxAdapter maxAdapter) {
        this.loadedAdapters.add(maxAdapter);
    }

    private List<MediationAdapterRouterListenerWrapper> getListenerWrappers(String str) {
        if (this.listeners.containsKey(str)) {
            return new ArrayList(this.listeners.get(str));
        }
        return null;
    }

    private boolean isAdLoaded(MaxAdapter maxAdapter) {
        return this.loadedAdapters.contains(maxAdapter);
    }

    private boolean isAdShowing(MaxAdapter maxAdapter) {
        return this.showingAdapters.contains(maxAdapter);
    }

    private void removeLoadedAdapter(MaxAdapter maxAdapter) {
        this.loadedAdapters.remove(maxAdapter);
    }

    private void removeShowingAdapter(MaxAdapter maxAdapter) {
        this.showingAdapters.remove(maxAdapter);
    }

    void addAdViewAdapter(MaxAdapter maxAdapter, MaxAdViewAdapterListener maxAdViewAdapterListener, String str) {
        addAdapter(maxAdapter, maxAdViewAdapterListener, str, RouterAdLoadType.ADVIEW);
    }

    void addInterstitialAdapter(MaxAdapter maxAdapter, MaxInterstitialAdapterListener maxInterstitialAdapterListener, String str) {
        addAdapter(maxAdapter, maxInterstitialAdapterListener, str, RouterAdLoadType.INTERSTITIAL);
    }

    void addRewardedAdapter(MaxAdapter maxAdapter, MaxRewardedAdapterListener maxRewardedAdapterListener, String str) {
        addAdapter(maxAdapter, maxRewardedAdapterListener, str, RouterAdLoadType.REWARDED);
    }

    void addShowingAdapter(MaxAdapter maxAdapter) {
        this.showingAdapters.add(maxAdapter);
    }

    abstract void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener);

    protected void log(String str) {
        Log.i(this.mTag, str);
    }

    protected void log(String str, Throwable th) {
        Log.i(this.mTag, str, th);
    }

    protected void onAdClicked(String str) {
        List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
        if (listenerWrappers == null || listenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
            if (isAdShowing(mediationAdapterRouterListenerWrapper.getAdapter())) {
                RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
                MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
                if (loadType == RouterAdLoadType.INTERSTITIAL) {
                    log("Interstitial clicked");
                    ((MaxInterstitialAdapterListener) listener).onInterstitialAdClicked();
                } else if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded clicked");
                    ((MaxRewardedAdapterListener) listener).onRewardedAdClicked();
                } else if (loadType == RouterAdLoadType.ADVIEW) {
                    log("AdView clicked");
                    ((MaxAdViewAdapterListener) listener).onAdViewAdClicked();
                }
            }
        }
    }

    protected void onAdDisplayFailed(String str, MaxAdapterError maxAdapterError) {
        List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
        if (listenerWrappers == null || listenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
            if (isAdShowing(mediationAdapterRouterListenerWrapper.getAdapter())) {
                RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
                MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
                if (loadType == RouterAdLoadType.INTERSTITIAL) {
                    log("Interstitial failed to display with error: " + maxAdapterError.toString());
                    ((MaxInterstitialAdapterListener) listener).onInterstitialAdDisplayFailed(maxAdapterError);
                } else if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded failed to display with error: " + maxAdapterError.toString());
                    ((MaxRewardedAdapterListener) listener).onRewardedAdDisplayFailed(maxAdapterError);
                } else if (loadType == RouterAdLoadType.ADVIEW) {
                    log("AdView failed to display with error: " + maxAdapterError.toString());
                    ((MaxAdViewAdapterListener) listener).onAdViewAdDisplayFailed(maxAdapterError);
                }
            }
        }
    }

    protected void onAdDisplayed(String str) {
        List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
        if (listenerWrappers == null || listenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
            if (isAdShowing(mediationAdapterRouterListenerWrapper.getAdapter())) {
                RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
                MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
                if (loadType == RouterAdLoadType.INTERSTITIAL) {
                    log("Interstitial shown");
                    ((MaxInterstitialAdapterListener) listener).onInterstitialAdDisplayed();
                } else if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded shown");
                    ((MaxRewardedAdapterListener) listener).onRewardedAdDisplayed();
                } else if (loadType == RouterAdLoadType.ADVIEW) {
                    log("AdView shown");
                    ((MaxAdViewAdapterListener) listener).onAdViewAdDisplayed();
                }
            }
        }
    }

    protected void onAdHidden(String str) {
        List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
        if (listenerWrappers == null || listenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
            if (isAdShowing(mediationAdapterRouterListenerWrapper.getAdapter())) {
                RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
                MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
                if (loadType == RouterAdLoadType.INTERSTITIAL) {
                    log("Interstitial hidden");
                    ((MaxInterstitialAdapterListener) listener).onInterstitialAdHidden();
                } else if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded hidden");
                    ((MaxRewardedAdapterListener) listener).onRewardedAdHidden();
                } else if (loadType == RouterAdLoadType.ADVIEW) {
                    log("AdView hidden");
                    ((MaxAdViewAdapterListener) listener).onAdViewAdHidden();
                }
            }
        }
    }

    protected void onAdLoadFailed(String str, MaxAdapterError maxAdapterError) {
        List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
        if (listenerWrappers == null || listenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
            if (!isAdLoaded(mediationAdapterRouterListenerWrapper.getAdapter())) {
                RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
                MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
                if (loadType == RouterAdLoadType.INTERSTITIAL) {
                    log("Interstitial failed to load with error: " + maxAdapterError.toString());
                    ((MaxInterstitialAdapterListener) listener).onInterstitialAdLoadFailed(maxAdapterError);
                } else if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded failed to load with error: " + maxAdapterError.toString());
                    ((MaxRewardedAdapterListener) listener).onRewardedAdLoadFailed(maxAdapterError);
                } else if (loadType == RouterAdLoadType.ADVIEW) {
                    log("AdView failed to load with error: " + maxAdapterError.toString());
                    ((MaxAdViewAdapterListener) listener).onAdViewAdLoadFailed(maxAdapterError);
                }
            }
        }
    }

    protected void onAdLoaded(String str) {
        List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
        if (listenerWrappers == null || listenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
            if (!isAdLoaded(mediationAdapterRouterListenerWrapper.getAdapter())) {
                addLoadedAdapter(mediationAdapterRouterListenerWrapper.getAdapter());
                RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
                MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
                if (loadType == RouterAdLoadType.INTERSTITIAL) {
                    log("Interstitial loaded");
                    ((MaxInterstitialAdapterListener) listener).onInterstitialAdLoaded();
                } else if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded loaded");
                    ((MaxRewardedAdapterListener) listener).onRewardedAdLoaded();
                } else if (loadType == RouterAdLoadType.ADVIEW) {
                    log("AdView loaded");
                    ((MaxAdViewAdapterListener) listener).onAdViewAdLoaded(mediationAdapterRouterListenerWrapper.getAdView());
                }
            }
        }
    }

    protected void onAdViewAdCollapsed(String str) {
        List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
        if (listenerWrappers == null || listenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
            if (isAdShowing(mediationAdapterRouterListenerWrapper.getAdapter())) {
                RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
                MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
                if (loadType == RouterAdLoadType.ADVIEW) {
                    log("AdView collapsed");
                    ((MaxAdViewAdapterListener) listener).onAdViewAdCollapsed();
                }
            }
        }
    }

    protected void onAdViewAdExpanded(String str) {
        List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
        if (listenerWrappers == null || listenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
            if (isAdShowing(mediationAdapterRouterListenerWrapper.getAdapter())) {
                RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
                MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
                if (loadType == RouterAdLoadType.ADVIEW) {
                    log("AdView expanded");
                    ((MaxAdViewAdapterListener) listener).onAdViewAdExpanded();
                }
            }
        }
    }

    protected void onRewardedAdVideoCompleted(String str) {
        List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
        if (listenerWrappers == null || listenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
            if (isAdShowing(mediationAdapterRouterListenerWrapper.getAdapter())) {
                RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
                MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
                if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded video completed");
                    ((MaxRewardedAdapterListener) listener).onRewardedAdVideoCompleted();
                }
            }
        }
    }

    protected void onRewardedAdVideoStarted(String str) {
        List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
        if (listenerWrappers == null || listenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
            if (isAdShowing(mediationAdapterRouterListenerWrapper.getAdapter())) {
                RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
                MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
                if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded video started");
                    ((MaxRewardedAdapterListener) listener).onRewardedAdVideoStarted();
                }
            }
        }
    }

    protected void onUserRewarded(String str, MaxReward maxReward) {
        List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
        if (listenerWrappers == null || listenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
            if (isAdShowing(mediationAdapterRouterListenerWrapper.getAdapter())) {
                RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
                MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
                if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded user with reward: " + maxReward);
                    ((MaxRewardedAdapterListener) listener).onUserRewarded(maxReward);
                }
            }
        }
    }

    void removeAdapter(MaxAdapter maxAdapter, String str) {
        removeLoadedAdapter(maxAdapter);
        removeShowingAdapter(maxAdapter);
        List<MediationAdapterRouterListenerWrapper> list = this.listeners.get(str);
        if (list == null || list.size() <= 0) {
            return;
        }
        MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper = null;
        Iterator<MediationAdapterRouterListenerWrapper> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MediationAdapterRouterListenerWrapper next = it.next();
            if (next.getAdapter() == maxAdapter) {
                mediationAdapterRouterListenerWrapper = next;
                break;
            }
        }
        if (mediationAdapterRouterListenerWrapper != null) {
            list.remove(mediationAdapterRouterListenerWrapper);
        }
    }
}
