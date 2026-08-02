package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;

/* loaded from: classes.dex */
public interface Aa extends SimpleAdvertisingIdGetter, InterfaceC0751km {
    AdvertisingIdsHolder a();

    AdvertisingIdsHolder a(Gi gi);

    @Override // io.appmetrica.analytics.impl.InterfaceC0751km
    /* synthetic */ void a(C0622fm c0622fm);

    void b(boolean z);

    void c(boolean z);

    AdvertisingIdsHolder getIdentifiers();

    void init();
}
