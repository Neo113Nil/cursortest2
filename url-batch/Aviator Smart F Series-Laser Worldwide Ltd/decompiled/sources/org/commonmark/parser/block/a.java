package org.commonmark.parser.block;

/* loaded from: classes5.dex */
public abstract class a implements d {
    @Override // org.commonmark.parser.block.d
    public void addLine(CharSequence charSequence) {
    }

    @Override // org.commonmark.parser.block.d
    public boolean canContain(org.commonmark.node.a aVar) {
        return false;
    }

    @Override // org.commonmark.parser.block.d
    public boolean canHaveLazyContinuationLines() {
        return false;
    }

    @Override // org.commonmark.parser.block.d
    public void closeBlock() {
    }

    @Override // org.commonmark.parser.block.d
    public abstract /* synthetic */ org.commonmark.node.a getBlock();

    @Override // org.commonmark.parser.block.d
    public boolean isContainer() {
        return false;
    }

    @Override // org.commonmark.parser.block.d
    public void parseInlines(org.commonmark.parser.a aVar) {
    }

    @Override // org.commonmark.parser.block.d
    public abstract /* synthetic */ c tryContinue(h hVar);
}
