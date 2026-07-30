package com.squareup.picasso;

/* loaded from: classes4.dex */
public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);

    final int index;

    MemoryPolicy(int i8) {
        this.index = i8;
    }

    static boolean shouldReadFromMemoryCache(int i8) {
        return (i8 & NO_CACHE.index) == 0;
    }

    static boolean shouldWriteToMemoryCache(int i8) {
        return (i8 & NO_STORE.index) == 0;
    }
}
