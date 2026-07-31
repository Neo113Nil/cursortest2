package io.appmetrica.analytics.locationapi.internal;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface LocationClient extends LocationControllerObserver, LocationProvider {
    @NotNull
    LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory();

    @NotNull
    LocationReceiverProviderFactory getLocationReceiverProviderFactory();

    void init(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull List<? extends Consumer<Location>> list);

    void registerSystemLocationSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider);

    void registerSystemLocationSource(@NotNull LocationReceiverProvider locationReceiverProvider);

    void unregisterSystemLocationSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider);

    void unregisterSystemLocationSource(@NotNull LocationReceiverProvider locationReceiverProvider);

    void updateCacheArguments(@NotNull CacheArguments cacheArguments);

    void updateLocationFilter(@NotNull LocationFilter locationFilter);

    void updateUserLocation(@Nullable Location location);
}
