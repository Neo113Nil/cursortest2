package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;

/* loaded from: classes.dex */
public interface Ha extends SimpleAdvertisingIdGetter, InterfaceC0884om {
    AdvertisingIdsHolder a();

    AdvertisingIdsHolder a(Li li);

    @Override // io.appmetrica.analytics.impl.InterfaceC0884om
    /* synthetic */ void a(C0754jm c0754jm);

    void b(boolean z);

    void c(boolean z);

    AdvertisingIdsHolder getIdentifiers();

    void init();
}
