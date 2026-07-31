package com.squareup.picasso;

/* loaded from: classes2.dex */
public enum n {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);


    /* renamed from: b, reason: collision with root package name */
    final int f21748b;

    n(int i4) {
        this.f21748b = i4;
    }

    public static boolean a(int i4) {
        return (i4 & OFFLINE.f21748b) != 0;
    }

    public static boolean b(int i4) {
        return (i4 & NO_CACHE.f21748b) == 0;
    }

    public static boolean c(int i4) {
        return (i4 & NO_STORE.f21748b) == 0;
    }
}
