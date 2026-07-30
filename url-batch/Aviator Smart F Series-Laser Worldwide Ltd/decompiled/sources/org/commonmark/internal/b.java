package org.commonmark.internal;

/* loaded from: classes5.dex */
public class b extends org.commonmark.parser.block.c {
    private final boolean finalize;
    private final int newColumn;
    private final int newIndex;

    public b(int i8, int i9, boolean z7) {
        this.newIndex = i8;
        this.newColumn = i9;
        this.finalize = z7;
    }

    public int getNewColumn() {
        return this.newColumn;
    }

    public int getNewIndex() {
        return this.newIndex;
    }

    public boolean isFinalize() {
        return this.finalize;
    }
}
