package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;

/* loaded from: classes.dex */
public final class v implements LastKnownLocationExtractorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final String f13173a;

    /* renamed from: b, reason: collision with root package name */
    public final s f13174b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13175c;

    public v(String str, s sVar, String str2) {
        this.f13173a = str;
        this.f13174b = sVar;
        this.f13175c = str2;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u getExtractor(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return new u(context, this.f13174b.a(permissionExtractor), locationListener, this.f13173a);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    public final String getIdentifier() {
        return this.f13175c;
    }
}
