package com.squareup.picasso;

/* loaded from: classes4.dex */
public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);

    final int index;

    NetworkPolicy(int i8) {
        this.index = i8;
    }

    public static boolean isOfflineOnly(int i8) {
        return (i8 & OFFLINE.index) != 0;
    }

    public static boolean shouldReadFromDiskCache(int i8) {
        return (i8 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToDiskCache(int i8) {
        return (i8 & NO_STORE.index) == 0;
    }
}
