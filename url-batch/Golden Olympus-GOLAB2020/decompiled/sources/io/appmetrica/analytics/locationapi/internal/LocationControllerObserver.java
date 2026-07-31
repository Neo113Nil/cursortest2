package io.appmetrica.analytics.locationapi.internal;

import kotlin.Metadata;

@Metadata
/* loaded from: classes3.dex */
public interface LocationControllerObserver {
    void startLocationTracking();

    void stopLocationTracking();
}
