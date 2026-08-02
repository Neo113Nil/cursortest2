package org.commonmark.internal;

/* loaded from: classes10.dex */
public final class BlockContinueImpl {
    public final boolean finalize;
    public final int newColumn;
    public final int newIndex;

    public BlockContinueImpl(int i, int i2, boolean z) {
        this.newIndex = i;
        this.newColumn = i2;
        this.finalize = z;
    }

    public static BlockContinueImpl atIndex(int i) {
        return new BlockContinueImpl(i, -1, false);
    }

    public BlockContinueImpl(int i, boolean z, int i2) {
        this.newIndex = i;
        this.finalize = z;
        this.newColumn = i2;
    }
}
