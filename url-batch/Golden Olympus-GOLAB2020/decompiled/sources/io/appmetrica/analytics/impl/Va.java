package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface Va extends SimpleAdvertisingIdGetter, InterfaceC2763km {
    @NotNull
    AdvertisingIdsHolder a();

    @NotNull
    AdvertisingIdsHolder a(@NotNull Ti ti);

    /* synthetic */ void a(@NonNull C2633fm c2633fm);

    void b(boolean z4);

    void c(boolean z4);

    @NotNull
    AdvertisingIdsHolder getIdentifiers();

    void init();
}
