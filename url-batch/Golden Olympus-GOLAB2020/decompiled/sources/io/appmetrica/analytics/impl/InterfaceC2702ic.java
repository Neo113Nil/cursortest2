package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.ic, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2702ic extends LocationProvider {
    void a(@Nullable Location location);

    void a(@NotNull Object obj);

    void a(boolean z4);

    void b(@NotNull Object obj);

    void init();
}
