package org.commonmark.node;

import org.commonmark.parser.Parser;

/* loaded from: classes10.dex */
public final class LinkReferenceDefinition extends Node {
    public String destination;
    public String label;
    public String title;

    @Override // org.commonmark.node.Node
    public final void accept(Parser parser) {
        parser.visit(this);
    }
}
