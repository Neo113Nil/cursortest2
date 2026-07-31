package com.squareup.picasso;

/* loaded from: classes2.dex */
public enum m {
    NO_CACHE(1),
    NO_STORE(2);


    /* renamed from: b, reason: collision with root package name */
    final int f21743b;

    m(int i4) {
        this.f21743b = i4;
    }

    static boolean a(int i4) {
        return (i4 & NO_CACHE.f21743b) == 0;
    }

    static boolean b(int i4) {
        return (i4 & NO_STORE.f21743b) == 0;
    }
}
