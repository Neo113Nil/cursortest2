package com.google.firebase.inject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface Deferred<T> {

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface DeferredHandler<T> {
        void handle(Provider<T> provider);
    }

    void whenAvailable(DeferredHandler<T> deferredHandler);
}
