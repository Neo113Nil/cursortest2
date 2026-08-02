package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;

/* renamed from: io.appmetrica.analytics.impl.sl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0957sl implements SimpleNetworkApi {

    /* renamed from: a, reason: collision with root package name */
    public final CacheControlHttpsConnectionPerformer f12748a = new CacheControlHttpsConnectionPerformer(((Al) C0817na.k().z()).getSslSocketFactory());

    @Override // io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi
    public final void performRequestWithCacheControl(String str, NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f12748a.performConnection(str, new C0577e3(networkClientWithCacheControl));
    }
}
