package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;

/* loaded from: classes.dex */
public interface Ha extends SimpleAdvertisingIdGetter, InterfaceC0733om {
    AdvertisingIdsHolder a();

    AdvertisingIdsHolder a(Li li);

    @Override // io.appmetrica.analytics.impl.InterfaceC0733om
    /* synthetic */ void a(C0603jm c0603jm);

    void b(boolean z);

    void c(boolean z);

    AdvertisingIdsHolder getIdentifiers();

    void init();
}
