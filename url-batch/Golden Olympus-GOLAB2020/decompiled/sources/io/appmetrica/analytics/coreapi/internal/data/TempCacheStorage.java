package io.appmetrica.analytics.coreapi.internal.data;

import java.util.Collection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface TempCacheStorage {

    @Metadata
    public interface Entry {
        @NotNull
        byte[] getData();

        long getId();

        @NotNull
        String getScope();

        long getTimestamp();
    }

    @Nullable
    Entry get(@NotNull String str);

    @NotNull
    Collection<Entry> get(@NotNull String str, int i4);

    long put(@NotNull String str, long j4, @NotNull byte[] bArr);

    void remove(long j4);

    void removeOlderThan(@NotNull String str, long j4);
}
