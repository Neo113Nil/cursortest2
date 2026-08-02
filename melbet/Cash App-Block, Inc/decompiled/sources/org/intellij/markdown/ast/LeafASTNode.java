package org.intellij.markdown.ast;

import java.util.ArrayList;
import java.util.List;
import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes9.dex */
public final class LeafASTNode extends ASTNodeImpl {
    public static final ArrayList EMPTY_CHILDREN = new ArrayList(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeafASTNode(MarkdownElementType markdownElementType, int i, int i2) {
        super(markdownElementType, i, i2);
        markdownElementType.getClass();
    }

    @Override // org.intellij.markdown.ast.ASTNodeImpl
    public final List getChildren() {
        return EMPTY_CHILDREN;
    }
}
