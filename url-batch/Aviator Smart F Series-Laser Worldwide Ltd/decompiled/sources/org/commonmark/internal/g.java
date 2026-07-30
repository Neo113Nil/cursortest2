package org.commonmark.internal;

/* loaded from: classes5.dex */
public class g extends org.commonmark.parser.block.a {
    private final org.commonmark.node.h document = new org.commonmark.node.h();

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void addLine(CharSequence charSequence) {
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean canContain(org.commonmark.node.a aVar) {
        return true;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.node.h getBlock() {
        return this.document;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean isContainer() {
        return true;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.parser.block.c tryContinue(org.commonmark.parser.block.h hVar) {
        return org.commonmark.parser.block.c.atIndex(hVar.getIndex());
    }
}
