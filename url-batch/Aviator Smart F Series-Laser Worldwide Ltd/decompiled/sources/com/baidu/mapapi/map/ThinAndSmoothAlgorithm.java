package com.baidu.mapapi.map;

/* loaded from: classes2.dex */
public enum ThinAndSmoothAlgorithm {
    ALGORITHM_NONR(1),
    DOUGLAS_PEUCKER(2),
    BEZIER_SMOOTH(32);


    /* renamed from: b, reason: collision with root package name */
    private final int f6373b;

    ThinAndSmoothAlgorithm(int i8) {
        this.f6373b = i8;
    }

    public int getValue() {
        return this.f6373b;
    }
}
