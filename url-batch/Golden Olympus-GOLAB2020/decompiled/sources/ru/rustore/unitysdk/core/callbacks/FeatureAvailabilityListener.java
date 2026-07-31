package ru.rustore.unitysdk.core.callbacks;

import ru.rustore.sdk.core.feature.model.FeatureAvailabilityResult;

/* loaded from: classes3.dex */
public interface FeatureAvailabilityListener {
    void OnFailure(Throwable th);

    void OnSuccess(FeatureAvailabilityResult featureAvailabilityResult);
}
