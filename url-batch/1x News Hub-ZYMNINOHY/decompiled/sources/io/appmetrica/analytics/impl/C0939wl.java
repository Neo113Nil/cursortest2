package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;

/* renamed from: io.appmetrica.analytics.impl.wl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0939wl implements SimpleNetworkApi {

    /* renamed from: a, reason: collision with root package name */
    public final CacheControlHttpsConnectionPerformer f8595a = new CacheControlHttpsConnectionPerformer(((El) C0876ua.k().A()).getSslSocketFactory());

    @Override // io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi
    public final void performRequestWithCacheControl(String str, NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f8595a.performConnection(str, new C0662m3(networkClientWithCacheControl));
    }
}
