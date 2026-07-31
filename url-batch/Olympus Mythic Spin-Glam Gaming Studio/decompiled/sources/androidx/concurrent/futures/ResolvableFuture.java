package androidx.concurrent.futures;

import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes14.dex */
public final class ResolvableFuture<V> extends AbstractResolvableFuture<V> {
    public static ResolvableFuture create() {
        return new ResolvableFuture();
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean set(Object obj) {
        return super.set(obj);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    private ResolvableFuture() {
    }
}
