package org.commonmark.node;

import org.commonmark.parser.Parser;

/* loaded from: classes10.dex */
public final class OrderedList extends ListBlock {
    public char delimiter;
    public int startNumber;

    @Override // org.commonmark.node.Node
    public final void accept(Parser parser) {
        parser.visit(this);
    }
}
