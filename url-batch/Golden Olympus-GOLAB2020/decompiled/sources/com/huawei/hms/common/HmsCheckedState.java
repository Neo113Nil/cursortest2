package com.huawei.hms.common;

/* loaded from: classes.dex */
public enum HmsCheckedState {
    UNCHECKED(0),
    NOT_NEED_UPDATE(1),
    NEED_UPDATE(2);


    /* renamed from: a, reason: collision with root package name */
    private final int f13996a;

    HmsCheckedState(int i4) {
        this.f13996a = i4;
    }

    public int getState() {
        return this.f13996a;
    }
}
