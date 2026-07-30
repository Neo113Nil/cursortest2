package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface ComponentContainer {
    default <T> T get(Qualified<T> qualified) {
        Provider<T> provider = getProvider(qualified);
        if (provider == null) {
            return null;
        }
        return provider.get();
    }

    <T> Deferred<T> getDeferred(Qualified<T> qualified);

    default <T> Deferred<T> getDeferred(Class<T> cls) {
        return getDeferred(Qualified.unqualified(cls));
    }

    <T> Provider<T> getProvider(Qualified<T> qualified);

    default <T> Provider<T> getProvider(Class<T> cls) {
        return getProvider(Qualified.unqualified(cls));
    }

    default <T> Set<T> setOf(Qualified<T> qualified) {
        return setOfProvider(qualified).get();
    }

    <T> Provider<Set<T>> setOfProvider(Qualified<T> qualified);

    default <T> Provider<Set<T>> setOfProvider(Class<T> cls) {
        return setOfProvider(Qualified.unqualified(cls));
    }

    default <T> Set<T> setOf(Class<T> cls) {
        return setOf(Qualified.unqualified(cls));
    }

    default <T> T get(Class<T> cls) {
        return (T) get(Qualified.unqualified(cls));
    }
}
