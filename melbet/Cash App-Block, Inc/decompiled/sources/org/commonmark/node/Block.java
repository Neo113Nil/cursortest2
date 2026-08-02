package org.commonmark.node;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public abstract class Block extends Node {
    @Override // org.commonmark.node.Node
    public final Node getParent() {
        return (Block) ((Node) this.parent);
    }

    @Override // org.commonmark.node.Node
    public final void setParent(Node node) {
        if (node instanceof Block) {
            this.parent = node;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Parent of block must also be block (can not be inline)");
        }
    }
}
