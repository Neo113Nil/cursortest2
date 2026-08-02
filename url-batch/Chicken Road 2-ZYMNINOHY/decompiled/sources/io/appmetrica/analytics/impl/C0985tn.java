package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.tn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0985tn implements TempCacheStorage {

    /* renamed from: a, reason: collision with root package name */
    public final TempCacheStorage f12792a;

    public C0985tn(Context context, Sm sm, TempCacheStorage tempCacheStorage) {
        this.f12792a = tempCacheStorage;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final TempCacheStorage.Entry get(String str) {
        return this.f12792a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(String str, long j4, byte[] bArr) {
        return this.f12792a.put(str, j4, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j4) {
        this.f12792a.remove(j4);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(String str, long j4) {
        this.f12792a.removeOlderThan(str, j4);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final Collection<TempCacheStorage.Entry> get(String str, int i4) {
        return this.f12792a.get(str, i4);
    }
}
