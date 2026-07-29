package com.mopub.mobileads;

import android.text.TextUtils;
import android.util.Pair;
import com.mopub.common.MoPubReward;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes2.dex */
class RewardedAdData {
    private String mCurrentlyShowingAdUnitId;
    private String mCustomerId;
    private final Map<String, CustomEventRewardedAd> mAdUnitToCustomEventMap = new TreeMap();
    private final Map<String, MoPubReward> mAdUnitToRewardMap = new TreeMap();
    private final Map<String, Set<MoPubReward>> mAdUnitToAvailableRewardsMap = new TreeMap();
    private final Map<String, String> mAdUnitToServerCompletionUrlMap = new TreeMap();
    private final Map<String, String> mAdUnitToCustomDataMap = new TreeMap();
    private final Map<Class<? extends CustomEventRewardedAd>, MoPubReward> mCustomEventToRewardMap = new HashMap();
    private final Map<TwoPartKey, Set<String>> mCustomEventToMoPubIdMap = new HashMap();

    RewardedAdData() {
    }

    CustomEventRewardedAd getCustomEvent(String str) {
        return this.mAdUnitToCustomEventMap.get(str);
    }

    MoPubReward getMoPubReward(String str) {
        return this.mAdUnitToRewardMap.get(str);
    }

    String getCustomData(String str) {
        return this.mAdUnitToCustomDataMap.get(str);
    }

    void addAvailableReward(String str, String str2, String str3) {
        Preconditions.checkNotNull(str);
        if (str2 == null || str3 == null) {
            MoPubLog.e(String.format(Locale.US, "Currency name and amount cannot be null: name = %s, amount = %s", str2, str3));
            return;
        }
        try {
            int parseInt = Integer.parseInt(str3);
            if (parseInt < 0) {
                MoPubLog.e(String.format(Locale.US, "Currency amount cannot be negative: %s", str3));
            } else {
                if (this.mAdUnitToAvailableRewardsMap.containsKey(str)) {
                    this.mAdUnitToAvailableRewardsMap.get(str).add(MoPubReward.success(str2, parseInt));
                    return;
                }
                HashSet hashSet = new HashSet();
                hashSet.add(MoPubReward.success(str2, parseInt));
                this.mAdUnitToAvailableRewardsMap.put(str, hashSet);
            }
        } catch (NumberFormatException unused) {
            MoPubLog.e(String.format(Locale.US, "Currency amount must be an integer: %s", str3));
        }
    }

    Set<MoPubReward> getAvailableRewards(String str) {
        Preconditions.checkNotNull(str);
        Set<MoPubReward> set = this.mAdUnitToAvailableRewardsMap.get(str);
        return set == null ? Collections.emptySet() : set;
    }

    void selectReward(String str, MoPubReward moPubReward) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(moPubReward);
        Set<MoPubReward> set = this.mAdUnitToAvailableRewardsMap.get(str);
        if (set == null || set.isEmpty()) {
            MoPubLog.e(String.format(Locale.US, "AdUnit %s does not have any rewards.", str));
        } else if (set.contains(moPubReward)) {
            updateAdUnitRewardMapping(str, moPubReward.getLabel(), Integer.toString(moPubReward.getAmount()));
        } else {
            MoPubLog.e(String.format(Locale.US, "Selected reward is invalid for AdUnit %s.", str));
        }
    }

    void resetAvailableRewards(String str) {
        Preconditions.checkNotNull(str);
        Set<MoPubReward> set = this.mAdUnitToAvailableRewardsMap.get(str);
        if (set == null || set.isEmpty()) {
            return;
        }
        set.clear();
    }

    void resetSelectedReward(String str) {
        Preconditions.checkNotNull(str);
        updateAdUnitRewardMapping(str, null, null);
    }

    String getServerCompletionUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mAdUnitToServerCompletionUrlMap.get(str);
    }

    MoPubReward getLastShownMoPubReward(Class<? extends CustomEventRewardedAd> cls) {
        return this.mCustomEventToRewardMap.get(cls);
    }

    Set<String> getMoPubIdsForAdNetwork(Class<? extends CustomEventRewardedAd> cls, String str) {
        if (str == null) {
            HashSet hashSet = new HashSet();
            for (Map.Entry<TwoPartKey, Set<String>> entry : this.mCustomEventToMoPubIdMap.entrySet()) {
                if (cls == entry.getKey().customEventClass) {
                    hashSet.addAll(entry.getValue());
                }
            }
            return hashSet;
        }
        TwoPartKey twoPartKey = new TwoPartKey(cls, str);
        if (this.mCustomEventToMoPubIdMap.containsKey(twoPartKey)) {
            return this.mCustomEventToMoPubIdMap.get(twoPartKey);
        }
        return Collections.emptySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void updateAdUnitCustomEventMapping(String str, CustomEventRewardedAd customEventRewardedAd, String str2) {
        this.mAdUnitToCustomEventMap.put(str, customEventRewardedAd);
        associateCustomEventWithMoPubId(customEventRewardedAd.getClass(), str2, str);
    }

    void updateAdUnitRewardMapping(String str, String str2, String str3) {
        Preconditions.checkNotNull(str);
        if (str2 == null || str3 == null) {
            this.mAdUnitToRewardMap.remove(str);
            return;
        }
        try {
            int parseInt = Integer.parseInt(str3);
            if (parseInt < 0) {
                MoPubLog.e(String.format(Locale.US, "Currency amount cannot be negative: %s", str3));
            } else {
                this.mAdUnitToRewardMap.put(str, MoPubReward.success(str2, parseInt));
            }
        } catch (NumberFormatException unused) {
            MoPubLog.e(String.format(Locale.US, "Currency amount must be an integer: %s", str3));
        }
    }

    void updateAdUnitToServerCompletionUrlMapping(String str, String str2) {
        Preconditions.checkNotNull(str);
        this.mAdUnitToServerCompletionUrlMap.put(str, str2);
    }

    void updateCustomEventLastShownRewardMapping(Class<? extends CustomEventRewardedAd> cls, MoPubReward moPubReward) {
        Preconditions.checkNotNull(cls);
        this.mCustomEventToRewardMap.put(cls, moPubReward);
    }

    void associateCustomEventWithMoPubId(Class<? extends CustomEventRewardedAd> cls, String str, String str2) {
        TwoPartKey twoPartKey = new TwoPartKey(cls, str);
        Iterator<Map.Entry<TwoPartKey, Set<String>>> it = this.mCustomEventToMoPubIdMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<TwoPartKey, Set<String>> next = it.next();
            if (!next.getKey().equals(twoPartKey) && next.getValue().contains(str2)) {
                next.getValue().remove(str2);
                if (next.getValue().isEmpty()) {
                    it.remove();
                }
            }
        }
        Set<String> set = this.mCustomEventToMoPubIdMap.get(twoPartKey);
        if (set == null) {
            set = new HashSet<>();
            this.mCustomEventToMoPubIdMap.put(twoPartKey, set);
        }
        set.add(str2);
    }

    void setCurrentlyShowingAdUnitId(String str) {
        this.mCurrentlyShowingAdUnitId = str;
    }

    void updateAdUnitToCustomDataMapping(String str, String str2) {
        Preconditions.NoThrow.checkNotNull(str);
        this.mAdUnitToCustomDataMap.put(str, str2);
    }

    String getCurrentlyShowingAdUnitId() {
        return this.mCurrentlyShowingAdUnitId;
    }

    void setCustomerId(String str) {
        this.mCustomerId = str;
    }

    String getCustomerId() {
        return this.mCustomerId;
    }

    @VisibleForTesting
    @Deprecated
    void clear() {
        this.mAdUnitToCustomEventMap.clear();
        this.mAdUnitToRewardMap.clear();
        this.mAdUnitToAvailableRewardsMap.clear();
        this.mAdUnitToServerCompletionUrlMap.clear();
        this.mAdUnitToCustomDataMap.clear();
        this.mCustomEventToRewardMap.clear();
        this.mCustomEventToMoPubIdMap.clear();
        this.mCurrentlyShowingAdUnitId = null;
        this.mCustomerId = null;
    }

    @VisibleForTesting
    @Deprecated
    boolean existsInAvailableRewards(String str, String str2, int i) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str2);
        for (MoPubReward moPubReward : getAvailableRewards(str)) {
            if (moPubReward.getLabel().equals(str2) && moPubReward.getAmount() == i) {
                return true;
            }
        }
        return false;
    }

    private static class TwoPartKey extends Pair<Class<? extends CustomEventRewardedAd>, String> {
        final String adNetworkId;
        final Class<? extends CustomEventRewardedAd> customEventClass;

        public TwoPartKey(Class<? extends CustomEventRewardedAd> cls, String str) {
            super(cls, str);
            this.customEventClass = cls;
            this.adNetworkId = str;
        }
    }
}
