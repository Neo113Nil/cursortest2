package com.google.zxing.pdf417.encoder;

/* loaded from: classes4.dex */
public final class Dimensions {
    private final int maxCols;
    private final int maxRows;
    private final int minCols;
    private final int minRows;

    public Dimensions(int i8, int i9, int i10, int i11) {
        this.minCols = i8;
        this.maxCols = i9;
        this.minRows = i10;
        this.maxRows = i11;
    }

    public int getMaxCols() {
        return this.maxCols;
    }

    public int getMaxRows() {
        return this.maxRows;
    }

    public int getMinCols() {
        return this.minCols;
    }

    public int getMinRows() {
        return this.minRows;
    }
}
