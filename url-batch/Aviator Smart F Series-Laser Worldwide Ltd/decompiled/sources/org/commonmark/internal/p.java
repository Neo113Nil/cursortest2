package org.commonmark.internal;

import org.commonmark.node.t;
import org.commonmark.node.w;

/* loaded from: classes5.dex */
public class p extends org.commonmark.parser.block.a {
    private final t block = new t();
    private int contentIndent;
    private boolean hadBlankLine;

    public p(int i8) {
        this.contentIndent = i8;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean canContain(org.commonmark.node.a aVar) {
        if (!this.hadBlankLine) {
            return true;
        }
        org.commonmark.node.a parent = this.block.getParent();
        if (!(parent instanceof org.commonmark.node.s)) {
            return true;
        }
        ((org.commonmark.node.s) parent).setTight(false);
        return true;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.node.a getBlock() {
        return this.block;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean isContainer() {
        return true;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.parser.block.c tryContinue(org.commonmark.parser.block.h hVar) {
        if (!hVar.isBlank()) {
            return hVar.getIndent() >= this.contentIndent ? org.commonmark.parser.block.c.atColumn(hVar.getColumn() + this.contentIndent) : org.commonmark.parser.block.c.none();
        }
        if (this.block.getFirstChild() == null) {
            return org.commonmark.parser.block.c.none();
        }
        org.commonmark.node.a block = hVar.getActiveBlockParser().getBlock();
        this.hadBlankLine = (block instanceof w) || (block instanceof t);
        return org.commonmark.parser.block.c.atIndex(hVar.getNextNonSpaceIndex());
    }
}
