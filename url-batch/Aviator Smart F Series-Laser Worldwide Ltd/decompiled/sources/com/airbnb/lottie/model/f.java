package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;

/* loaded from: classes.dex */
public class f {
    private static final f INSTANCE = new f();
    private final LruCache<String, com.airbnb.lottie.h> cache = new LruCache<>(20);

    @VisibleForTesting
    f() {
    }

    public static f getInstance() {
        return INSTANCE;
    }

    public void clear() {
        this.cache.evictAll();
    }

    @Nullable
    public com.airbnb.lottie.h get(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.cache.get(str);
    }

    public void put(@Nullable String str, com.airbnb.lottie.h hVar) {
        if (str == null) {
            return;
        }
        this.cache.put(str, hVar);
    }

    public void resize(int i8) {
        this.cache.resize(i8);
    }
}
