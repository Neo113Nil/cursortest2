package org.intellij.markdown.ast;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes9.dex */
public class CompositeASTNode extends ASTNodeImpl {
    public final List children;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CompositeASTNode(List list, MarkdownElementType markdownElementType) {
        super(markdownElementType, r0, r2 != null ? r2.endOffset : 0);
        markdownElementType.getClass();
        list.getClass();
        ASTNodeImpl aSTNodeImpl = (ASTNodeImpl) CollectionsKt.firstOrNull(list);
        int i = aSTNodeImpl != null ? aSTNodeImpl.startOffset : 0;
        ASTNodeImpl aSTNodeImpl2 = (ASTNodeImpl) CollectionsKt.lastOrNull(list);
        this.children = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ASTNodeImpl aSTNodeImpl3 = (ASTNodeImpl) it.next();
            if (aSTNodeImpl3 != null) {
                aSTNodeImpl3.parent = this;
            }
        }
    }

    @Override // org.intellij.markdown.ast.ASTNodeImpl
    public final List getChildren() {
        return this.children;
    }
}
