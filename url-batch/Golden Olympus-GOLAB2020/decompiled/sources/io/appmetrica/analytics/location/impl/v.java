package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class v implements LastKnownLocationExtractorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final String f40475a;

    /* renamed from: b, reason: collision with root package name */
    public final s f40476b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40477c;

    public v(@NotNull String str, @NotNull s sVar, @NotNull String str2) {
        this.f40475a = str;
        this.f40476b = sVar;
        this.f40477c = str2;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u getExtractor(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return new u(context, this.f40476b.a(permissionExtractor), locationListener, this.f40475a);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    @NotNull
    public final String getIdentifier() {
        return this.f40477c;
    }
}
