package com.onesignal.core.internal.features;

import Q4.y;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface IFeatureManager {
    List<String> enabledFeatureKeys();

    boolean isEnabled(FeatureFlag featureFlag);

    Map<String, y> remoteFeatureFlagMetadata();
}
