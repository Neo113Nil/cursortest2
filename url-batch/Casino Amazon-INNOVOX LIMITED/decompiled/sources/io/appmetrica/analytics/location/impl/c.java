package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import com.onesignal.location.internal.common.LocationConstants;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;

/* loaded from: classes3.dex */
public final class c implements LastKnownLocationExtractorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final String f1612a;

    public c(String str) {
        this.f1612a = str;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    public final LastKnownLocationExtractor getExtractor(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return new b(context, new SinglePermissionStrategy(permissionExtractor, LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING), locationListener, iHandlerExecutor);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    public final String getIdentifier() {
        return this.f1612a;
    }
}
