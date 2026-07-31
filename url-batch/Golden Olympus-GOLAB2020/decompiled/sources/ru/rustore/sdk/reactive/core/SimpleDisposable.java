package ru.rustore.sdk.reactive.core;

import kotlin.Metadata;

@Metadata
/* loaded from: classes3.dex */
public final class SimpleDisposable implements Disposable {
    private volatile boolean disposed;

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public void dispose() {
        this.disposed = true;
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public boolean isDisposed() {
        return this.disposed;
    }
}
