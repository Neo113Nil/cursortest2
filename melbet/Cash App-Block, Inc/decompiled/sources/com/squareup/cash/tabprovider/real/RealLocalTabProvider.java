package com.squareup.cash.tabprovider.real;

import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.featureflags.FeatureFlagManager;

/* loaded from: classes7.dex */
public final class RealLocalTabProvider {
    public final FeatureFlagManager featureFlagManager;
    public final SyncValueReader syncValueReader;

    public RealLocalTabProvider(SyncValueReader syncValueReader, FeatureFlagManager featureFlagManager) {
        this.featureFlagManager = featureFlagManager;
        this.syncValueReader = syncValueReader;
    }
}
