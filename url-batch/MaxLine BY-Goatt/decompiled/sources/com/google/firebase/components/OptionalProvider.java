package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import defpackage.lh;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
class OptionalProvider<T> implements Provider<T>, Deferred<T> {
    private volatile Provider<T> delegate;
    private Deferred.DeferredHandler<T> handler;
    private static final Deferred.DeferredHandler<Object> NOOP_HANDLER = new b();
    private static final Provider<Object> EMPTY_PROVIDER = new c();

    private OptionalProvider(Deferred.DeferredHandler<T> deferredHandler, Provider<T> provider) {
        this.handler = deferredHandler;
        this.delegate = provider;
    }

    public static <T> OptionalProvider<T> empty() {
        return new OptionalProvider<>(NOOP_HANDLER, EMPTY_PROVIDER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$1() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$whenAvailable$2(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        deferredHandler.handle(provider);
        deferredHandler2.handle(provider);
    }

    public static <T> OptionalProvider<T> of(Provider<T> provider) {
        return new OptionalProvider<>(null, provider);
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        return this.delegate.get();
    }

    public void set(Provider<T> provider) {
        Deferred.DeferredHandler<T> deferredHandler;
        if (this.delegate != EMPTY_PROVIDER) {
            lh.g("provide() can be called only once.");
            return;
        }
        synchronized (this) {
            deferredHandler = this.handler;
            this.handler = null;
            this.delegate = provider;
        }
        deferredHandler.handle(provider);
    }

    @Override // com.google.firebase.inject.Deferred
    public void whenAvailable(final Deferred.DeferredHandler<T> deferredHandler) {
        Provider<T> provider;
        Provider<T> provider2;
        Provider<T> provider3 = this.delegate;
        Provider<Object> provider4 = EMPTY_PROVIDER;
        if (provider3 != provider4) {
            deferredHandler.handle(provider3);
            return;
        }
        synchronized (this) {
            provider = this.delegate;
            if (provider != provider4) {
                provider2 = provider;
            } else {
                final Deferred.DeferredHandler<T> deferredHandler2 = this.handler;
                this.handler = new Deferred.DeferredHandler() { // from class: com.google.firebase.components.d
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void handle(Provider provider5) {
                        OptionalProvider.lambda$whenAvailable$2(Deferred.DeferredHandler.this, deferredHandler, provider5);
                    }
                };
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferredHandler.handle(provider);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Provider provider) {
    }
}
