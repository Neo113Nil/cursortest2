package com.baidu.ar.arplay.core.renderer;

/* loaded from: classes.dex */
public enum OutputFillMode {
    StretchToFill(0),
    KeepRatioFill(1),
    KeepRatioCrop(2);

    private final int value;

    OutputFillMode(int i8) {
        this.value = i8;
    }

    public int getValue() {
        return this.value;
    }
}
