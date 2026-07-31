package io.opentelemetry.contrib.disk.buffering.storage.result;

import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface WriteResult {
    @Nullable
    Throwable getError();

    boolean isSuccessful();

    static WriteResult successful() {
        return new DefaultWriteResult(true, null);
    }

    static WriteResult error(@Nullable Throwable th) {
        return new DefaultWriteResult(false, th);
    }
}
