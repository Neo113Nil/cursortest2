package com.baidu.mapapi.map.bmsdk.ui;

/* loaded from: classes2.dex */
public enum UIGravity {
    LEFT(1),
    TOP(2),
    RIGHT(4),
    BOTTOM(8),
    CENTER_HORIZONTAL(16),
    CENTER_VERTICAL(32),
    CENTER(48);


    /* renamed from: b, reason: collision with root package name */
    private int f6491b;

    UIGravity(int i8) {
        this.f6491b = i8;
    }

    public int getNumber() {
        return this.f6491b;
    }
}
