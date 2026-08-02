package org.commonmark.node;

import org.commonmark.parser.Parser;

/* loaded from: classes10.dex */
public final class Document extends Block {
    public final /* synthetic */ int $r8$classId;

    @Override // org.commonmark.node.Node
    public final void accept(Parser parser) {
        switch (this.$r8$classId) {
            case 0:
                parser.visit(this);
                break;
            default:
                parser.visit(this);
                break;
        }
    }
}
