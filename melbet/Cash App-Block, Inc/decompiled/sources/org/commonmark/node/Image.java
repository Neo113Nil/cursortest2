package org.commonmark.node;

import org.commonmark.parser.Parser;

/* loaded from: classes10.dex */
public final class Image extends Node {
    public String destination;
    public String title;

    @Override // org.commonmark.node.Node
    public final void accept(Parser parser) {
        parser.visit(this);
    }

    @Override // org.commonmark.node.Node
    public final String toStringAttributes() {
        return "destination=" + this.destination + ", title=" + this.title;
    }
}
