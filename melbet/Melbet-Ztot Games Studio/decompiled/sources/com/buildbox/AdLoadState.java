package com.buildbox;

/* loaded from: classes.dex */
public enum AdLoadState {
    NONE(0),
    WAITING(1),
    LOADING(2),
    FAILED(3),
    LOADED(4);

    private final int code;

    AdLoadState(int i) {
        this.code = i;
    }

    public int toInt() {
        return this.code;
    }
}
