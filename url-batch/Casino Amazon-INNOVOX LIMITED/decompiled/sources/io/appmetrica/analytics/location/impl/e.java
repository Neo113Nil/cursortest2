package io.appmetrica.analytics.location.impl;

import com.onesignal.location.internal.common.LocationConstants;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;

/* loaded from: classes3.dex */
public final class e implements s {
    @Override // io.appmetrica.analytics.location.impl.s
    public final PermissionResolutionStrategy a(PermissionExtractor permissionExtractor) {
        return new SinglePermissionStrategy(permissionExtractor, LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING);
    }
}
