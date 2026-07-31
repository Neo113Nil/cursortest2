package ru.rustore.sdk.reactive.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class EmptyDisposable implements Disposable {

    @NotNull
    public static final EmptyDisposable INSTANCE = new EmptyDisposable();

    private EmptyDisposable() {
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public void dispose() {
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public boolean isDisposed() {
        return false;
    }
}
