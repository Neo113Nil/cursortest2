package org.commonmark.node;

import org.commonmark.parser.Parser;

/* loaded from: classes10.dex */
public final class Link extends Node {
    public final String destination;
    public final String title;

    public Link(String str, String str2) {
        this.destination = str;
        this.title = str2;
    }

    @Override // org.commonmark.node.Node
    public final void accept(Parser parser) {
        parser.visit(this);
    }

    @Override // org.commonmark.node.Node
    public final String toStringAttributes() {
        return "destination=" + this.destination + ", title=" + this.title;
    }
}
