package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;

/* renamed from: io.appmetrica.analytics.impl.f3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0164f3 implements CacheControlHttpsConnectionPerformer.Client {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkClientWithCacheControl f1248a;

    public C0164f3(NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f1248a = networkClientWithCacheControl;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final String getOldETag() {
        return this.f1248a.getETag();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onError() {
        this.f1248a.onError();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onNotModified() {
        this.f1248a.onNotModified();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onResponse(String str, byte[] bArr) {
        this.f1248a.onResponse(str, bArr);
    }
}
