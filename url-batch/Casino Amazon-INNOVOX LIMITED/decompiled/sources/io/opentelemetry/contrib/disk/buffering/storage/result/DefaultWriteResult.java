package io.opentelemetry.contrib.disk.buffering.storage.result;

import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class DefaultWriteResult implements WriteResult {

    @Nullable
    private final Throwable error;
    private final boolean successful;

    DefaultWriteResult(boolean z, @Nullable Throwable th) {
        this.successful = z;
        this.error = th;
    }

    @Override // io.opentelemetry.contrib.disk.buffering.storage.result.WriteResult
    public boolean isSuccessful() {
        return this.successful;
    }

    @Override // io.opentelemetry.contrib.disk.buffering.storage.result.WriteResult
    @Nullable
    public Throwable getError() {
        return this.error;
    }
}
