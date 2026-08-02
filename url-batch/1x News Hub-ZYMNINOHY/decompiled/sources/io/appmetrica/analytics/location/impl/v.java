package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;

/* loaded from: classes.dex */
public final class v implements LastKnownLocationExtractorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final String f8777a;

    /* renamed from: b, reason: collision with root package name */
    public final s f8778b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8779c;

    public v(String str, s sVar, String str2) {
        this.f8777a = str;
        this.f8778b = sVar;
        this.f8779c = str2;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u getExtractor(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return new u(context, this.f8778b.a(permissionExtractor), locationListener, this.f8777a);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    public final String getIdentifier() {
        return this.f8779c;
    }
}
