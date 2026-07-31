package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;

/* loaded from: classes3.dex */
public interface Ba extends SimpleAdvertisingIdGetter, InterfaceC0338lm {
    AdvertisingIdsHolder a();

    AdvertisingIdsHolder a(Hi hi);

    @Override // io.appmetrica.analytics.impl.InterfaceC0338lm
    /* synthetic */ void a(C0209gm c0209gm);

    void b(boolean z);

    void c(boolean z);

    AdvertisingIdsHolder getIdentifiers();

    void init();
}
