package io.appmetrica.analytics.coreapi.internal.data;

import java.util.Collection;

/* loaded from: classes.dex */
public interface TempCacheStorage {

    public interface Entry {
        byte[] getData();

        long getId();

        String getScope();

        long getTimestamp();
    }

    Entry get(String str);

    Collection<Entry> get(String str, int i4);

    long put(String str, long j4, byte[] bArr);

    void remove(long j4);

    void removeOlderThan(String str, long j4);
}
