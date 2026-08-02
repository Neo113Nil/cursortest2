package org.commonmark.node;

import org.commonmark.parser.Parser;

/* loaded from: classes10.dex */
public final class Text extends Node {
    public String literal;

    public Text(String str) {
        this.literal = str;
    }

    @Override // org.commonmark.node.Node
    public final void accept(Parser parser) {
        parser.visit(this);
    }

    @Override // org.commonmark.node.Node
    public final String toStringAttributes() {
        return "literal=" + this.literal;
    }
}
