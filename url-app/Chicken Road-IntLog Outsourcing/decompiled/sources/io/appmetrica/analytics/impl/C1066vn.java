package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.vn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1066vn implements TempCacheStorage {

    /* renamed from: a, reason: collision with root package name */
    public final TempCacheStorage f9489a;

    public C1066vn(Context context, Wm wm, TempCacheStorage tempCacheStorage) {
        this.f9489a = tempCacheStorage;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final TempCacheStorage.Entry get(String str) {
        return this.f9489a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(String str, long j2, byte[] bArr) {
        return this.f9489a.put(str, j2, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j2) {
        this.f9489a.remove(j2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(String str, long j2) {
        this.f9489a.removeOlderThan(str, j2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final Collection<TempCacheStorage.Entry> get(String str, int i2) {
        return this.f9489a.get(str, i2);
    }
}
