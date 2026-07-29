package com.mopub.common;

import com.mopub.common.Preconditions;
import com.mopub.common.util.MoPubCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class SdkConfiguration {
    private final String mAdUnitId;
    private final List<Class<? extends MoPubAdvancedBidder>> mAdvancedBidders;
    private final MediationSettings[] mMediationSettings;
    private final List<String> mNetworksToInit;

    private SdkConfiguration(String str, List<Class<? extends MoPubAdvancedBidder>> list, MediationSettings[] mediationSettingsArr, List<String> list2) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(list);
        this.mAdUnitId = str;
        this.mAdvancedBidders = list;
        this.mMediationSettings = mediationSettingsArr;
        this.mNetworksToInit = list2;
    }

    public String getAdUnitId() {
        return this.mAdUnitId;
    }

    public List<Class<? extends MoPubAdvancedBidder>> getAdvancedBidders() {
        return Collections.unmodifiableList(this.mAdvancedBidders);
    }

    public MediationSettings[] getMediationSettings() {
        return (MediationSettings[]) Arrays.copyOf(this.mMediationSettings, this.mMediationSettings.length);
    }

    public List<String> getNetworksToInit() {
        if (this.mNetworksToInit == null) {
            return null;
        }
        return Collections.unmodifiableList(this.mNetworksToInit);
    }

    public static class Builder {
        private String adUnitId;
        private final List<Class<? extends MoPubAdvancedBidder>> advancedBidders = new ArrayList();
        private MediationSettings[] mediationSettings = new MediationSettings[0];
        private List<String> networksToInit;

        public Builder(String str) {
            this.adUnitId = str;
        }

        public Builder withAdvancedBidder(Class<? extends MoPubAdvancedBidder> cls) {
            Preconditions.checkNotNull(cls);
            this.advancedBidders.add(cls);
            return this;
        }

        public Builder withAdvancedBidders(Collection<Class<? extends MoPubAdvancedBidder>> collection) {
            Preconditions.NoThrow.checkNotNull(collection);
            MoPubCollections.addAllNonNull(this.advancedBidders, collection);
            return this;
        }

        public Builder withMediationSettings(MediationSettings... mediationSettingsArr) {
            Preconditions.checkNotNull(mediationSettingsArr);
            this.mediationSettings = mediationSettingsArr;
            return this;
        }

        public Builder withNetworksToInit(List<String> list) {
            if (list == null) {
                return this;
            }
            this.networksToInit = new ArrayList();
            MoPubCollections.addAllNonNull(this.networksToInit, list);
            return this;
        }

        public SdkConfiguration build() {
            return new SdkConfiguration(this.adUnitId, this.advancedBidders, this.mediationSettings, this.networksToInit);
        }
    }
}
