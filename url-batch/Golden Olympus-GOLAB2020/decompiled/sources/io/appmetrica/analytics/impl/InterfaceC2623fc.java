package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.fc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2623fc extends InterfaceC2702ic, LocationServiceApi {
    @Override // io.appmetrica.analytics.impl.InterfaceC2702ic
    /* synthetic */ void a(@Nullable Location location);

    @Override // io.appmetrica.analytics.impl.InterfaceC2702ic
    /* synthetic */ void a(@NotNull Object obj);

    @Override // io.appmetrica.analytics.impl.InterfaceC2702ic
    /* synthetic */ void a(boolean z4);

    @Override // io.appmetrica.analytics.impl.InterfaceC2702ic
    /* synthetic */ void b(@NotNull Object obj);

    @Override // io.appmetrica.analytics.impl.InterfaceC2702ic
    /* synthetic */ void init();
}
