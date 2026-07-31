package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.sf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2230sf {

    /* renamed from: a, reason: collision with root package name */
    private final float f31723a;

    public C2230sf(float f4) {
        this.f31723a = f4 == 0.0f ? 1.7777778f : f4;
    }

    public final int a(int i4) {
        return Math.round(i4 / this.f31723a);
    }

    public final int b(int i4) {
        return Math.round(i4 * this.f31723a);
    }
}
