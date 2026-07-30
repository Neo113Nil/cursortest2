package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public final class SettableFuture<V> extends AbstractFuture.TrustedFuture<V> {
    private SettableFuture() {
    }

    public static <V> SettableFuture<V> create() {
        return new SettableFuture<>();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture.TrustedFuture, com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
    public /* bridge */ /* synthetic */ void addListener(Runnable runnable, Executor executor) {
        super.addListener(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture.TrustedFuture, com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public /* bridge */ /* synthetic */ boolean cancel(boolean z7) {
        return super.cancel(z7);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture.TrustedFuture, com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public /* bridge */ /* synthetic */ Object get() {
        return super.get();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture.TrustedFuture, com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public /* bridge */ /* synthetic */ boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CanIgnoreReturnValue
    public boolean set(@ParametricNullness V v7) {
        return super.set(v7);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CanIgnoreReturnValue
    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CanIgnoreReturnValue
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        return super.setFuture(listenableFuture);
    }
}
