package io.appmetrica.analytics.locationapi.internal;

import android.location.Location;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface LocationProvider {
    @Nullable
    Location getSystemLocation();

    @Nullable
    Location getUserLocation();
}
