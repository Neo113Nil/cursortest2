package org.intellij.markdown.ast;

import java.util.List;
import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes6.dex */
public abstract class ASTNodeImpl {
    public final int endOffset;
    public CompositeASTNode parent;
    public final int startOffset;

    /* renamed from: type, reason: collision with root package name */
    public final MarkdownElementType f1630type;

    public ASTNodeImpl(MarkdownElementType markdownElementType, int i, int i2) {
        markdownElementType.getClass();
        this.f1630type = markdownElementType;
        this.startOffset = i;
        this.endOffset = i2;
    }

    public abstract List getChildren();
}
