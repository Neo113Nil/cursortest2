package org.commonmark.node;

import org.commonmark.parser.Parser;

/* loaded from: classes10.dex */
public final class FencedCodeBlock extends Block {
    public char fenceChar;
    public int fenceIndent;
    public int fenceLength;
    public String info;
    public String literal;

    @Override // org.commonmark.node.Node
    public final void accept(Parser parser) {
        parser.visit(this);
    }
}
