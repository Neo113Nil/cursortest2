package org.intellij.markdown.parser;

import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes10.dex */
public final class TreeBuilder$MyASTNodeWrapper {
    public final ASTNodeImpl astNode;
    public final int endTokenIndex;
    public final int startTokenIndex;

    public TreeBuilder$MyASTNodeWrapper(ASTNodeImpl aSTNodeImpl, int i, int i2) {
        aSTNodeImpl.getClass();
        this.astNode = aSTNodeImpl;
        this.startTokenIndex = i;
        this.endTokenIndex = i2;
    }
}
