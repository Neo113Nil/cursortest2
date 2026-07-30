package org.commonmark.internal;

/* loaded from: classes5.dex */
public class d extends org.commonmark.parser.block.f {
    private final org.commonmark.parser.block.d[] blockParsers;
    private int newIndex = -1;
    private int newColumn = -1;
    private boolean replaceActiveBlockParser = false;

    public d(org.commonmark.parser.block.d... dVarArr) {
        this.blockParsers = dVarArr;
    }

    @Override // org.commonmark.parser.block.f
    public org.commonmark.parser.block.f atColumn(int i8) {
        this.newColumn = i8;
        return this;
    }

    @Override // org.commonmark.parser.block.f
    public org.commonmark.parser.block.f atIndex(int i8) {
        this.newIndex = i8;
        return this;
    }

    public org.commonmark.parser.block.d[] getBlockParsers() {
        return this.blockParsers;
    }

    public int getNewColumn() {
        return this.newColumn;
    }

    public int getNewIndex() {
        return this.newIndex;
    }

    public boolean isReplaceActiveBlockParser() {
        return this.replaceActiveBlockParser;
    }

    @Override // org.commonmark.parser.block.f
    public org.commonmark.parser.block.f replaceActiveBlockParser() {
        this.replaceActiveBlockParser = true;
        return this;
    }
}
