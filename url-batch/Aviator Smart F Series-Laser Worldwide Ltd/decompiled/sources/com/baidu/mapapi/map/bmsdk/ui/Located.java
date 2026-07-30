package com.baidu.mapapi.map.bmsdk.ui;

/* loaded from: classes2.dex */
public enum Located {
    CENTER(1),
    TOP(2),
    BOTTOM(4),
    LEFT(8),
    RIGHT(16),
    LEFT_TOP(10),
    LEFT_BOTTOM(12),
    RIGHT_TOP(18),
    RIGHT_BOTTOM(20);


    /* renamed from: b, reason: collision with root package name */
    private int f6487b;

    Located(int i8) {
        this.f6487b = i8;
    }

    public int getNumber() {
        return this.f6487b;
    }
}
