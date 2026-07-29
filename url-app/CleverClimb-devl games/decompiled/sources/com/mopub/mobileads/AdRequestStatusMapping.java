package com.mopub.mobileads;

import android.text.TextUtils;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class AdRequestStatusMapping {
    private final Map<String, AdRequestStatus> mAdUnitToAdRequestStatus = new TreeMap();

    private enum LoadingStatus {
        LOADING,
        LOADED,
        PLAYED
    }

    void markFail(String str) {
        this.mAdUnitToAdRequestStatus.remove(str);
    }

    void markLoading(String str) {
        this.mAdUnitToAdRequestStatus.put(str, new AdRequestStatus(LoadingStatus.LOADING));
    }

    void markLoaded(String str, String str2, String str3, String str4) {
        this.mAdUnitToAdRequestStatus.put(str, new AdRequestStatus(LoadingStatus.LOADED, str2, str3, str4));
    }

    void markPlayed(String str) {
        if (!this.mAdUnitToAdRequestStatus.containsKey(str)) {
            this.mAdUnitToAdRequestStatus.put(str, new AdRequestStatus(LoadingStatus.PLAYED));
        } else {
            this.mAdUnitToAdRequestStatus.get(str).setStatus(LoadingStatus.PLAYED);
        }
    }

    boolean canPlay(String str) {
        AdRequestStatus adRequestStatus = this.mAdUnitToAdRequestStatus.get(str);
        return adRequestStatus != null && LoadingStatus.LOADED.equals(adRequestStatus.getStatus());
    }

    boolean isLoading(String str) {
        return this.mAdUnitToAdRequestStatus.containsKey(str) && this.mAdUnitToAdRequestStatus.get(str).getStatus() == LoadingStatus.LOADING;
    }

    String getFailoverUrl(String str) {
        if (this.mAdUnitToAdRequestStatus.containsKey(str)) {
            return this.mAdUnitToAdRequestStatus.get(str).getFailurl();
        }
        return null;
    }

    String getImpressionTrackerUrlString(String str) {
        if (this.mAdUnitToAdRequestStatus.containsKey(str)) {
            return this.mAdUnitToAdRequestStatus.get(str).getImpressionUrl();
        }
        return null;
    }

    String getClickTrackerUrlString(String str) {
        if (this.mAdUnitToAdRequestStatus.containsKey(str)) {
            return this.mAdUnitToAdRequestStatus.get(str).getClickUrl();
        }
        return null;
    }

    void clearImpressionUrl(String str) {
        if (this.mAdUnitToAdRequestStatus.containsKey(str)) {
            this.mAdUnitToAdRequestStatus.get(str).setImpressionUrl(null);
        }
    }

    void clearClickUrl(String str) {
        if (this.mAdUnitToAdRequestStatus.containsKey(str)) {
            this.mAdUnitToAdRequestStatus.get(str).setClickUrl(null);
        }
    }

    @VisibleForTesting
    @Deprecated
    void clearMapping() {
        this.mAdUnitToAdRequestStatus.clear();
    }

    private static class AdRequestStatus {
        private String mClickUrl;
        private String mFailUrl;
        private String mImpressionUrl;
        private LoadingStatus mLoadingStatus;

        public AdRequestStatus(LoadingStatus loadingStatus) {
            this(loadingStatus, null, null, null);
        }

        public AdRequestStatus(LoadingStatus loadingStatus, String str, String str2, String str3) {
            Preconditions.checkNotNull(loadingStatus);
            this.mLoadingStatus = loadingStatus;
            this.mFailUrl = str;
            this.mImpressionUrl = str2;
            this.mClickUrl = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public LoadingStatus getStatus() {
            return this.mLoadingStatus;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(LoadingStatus loadingStatus) {
            this.mLoadingStatus = loadingStatus;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getFailurl() {
            return this.mFailUrl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getImpressionUrl() {
            return this.mImpressionUrl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionUrl(String str) {
            this.mImpressionUrl = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getClickUrl() {
            return this.mClickUrl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickUrl(String str) {
            this.mClickUrl = str;
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdRequestStatus)) {
                return false;
            }
            AdRequestStatus adRequestStatus = (AdRequestStatus) obj;
            return this.mLoadingStatus.equals(adRequestStatus.mLoadingStatus) && TextUtils.equals(this.mFailUrl, adRequestStatus.mFailUrl) && TextUtils.equals(this.mImpressionUrl, adRequestStatus.mImpressionUrl) && TextUtils.equals(this.mClickUrl, adRequestStatus.mClickUrl);
        }

        public int hashCode() {
            return ((((((899 + this.mLoadingStatus.ordinal()) * 31) + (this.mFailUrl != null ? this.mFailUrl.hashCode() : 0)) * 31) + (this.mImpressionUrl != null ? this.mImpressionUrl.hashCode() : 0)) * 31) + (this.mClickUrl != null ? this.mClickUrl.hashCode() : 0);
        }
    }
}
