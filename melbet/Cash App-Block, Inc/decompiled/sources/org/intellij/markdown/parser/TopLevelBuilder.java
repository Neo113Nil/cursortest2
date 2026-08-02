package org.intellij.markdown.parser;

import androidx.credentials.Credential;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import okhttp3.FormBody;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.MarkdownTokenTypes$Companion$WHITE_SPACE$1;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes10.dex */
public final class TopLevelBuilder extends Credential {
    @Override // androidx.credentials.Credential
    public final TreeBuilder$MyASTNodeWrapper createASTNodeOnClosingEvent(TreeBuilder$MyEvent treeBuilder$MyEvent, List list, boolean z) {
        MarkdownTokenTypes$Companion$WHITE_SPACE$1 markdownTokenTypes$Companion$WHITE_SPACE$1 = MarkdownTokenTypes.WHITE_SPACE;
        FormBody.Builder builder = (FormBody.Builder) this.data;
        list.getClass();
        SequentialParser.Node node = treeBuilder$MyEvent.info;
        MarkdownElementType markdownElementType = node.f1633type;
        IntRange intRange = node.range;
        int i = intRange.first;
        int i2 = intRange.last;
        if (markdownElementType != null && markdownElementType.isToken) {
            return new TreeBuilder$MyASTNodeWrapper((ASTNodeImpl) CollectionsKt.first(builder.createLeafNodes(markdownElementType, i, i2)), i, i2);
        }
        ArrayList arrayList = new ArrayList(list.size());
        TreeBuilder$MyASTNodeWrapper treeBuilder$MyASTNodeWrapper = (TreeBuilder$MyASTNodeWrapper) CollectionsKt.firstOrNull(list);
        int i3 = treeBuilder$MyASTNodeWrapper != null ? treeBuilder$MyASTNodeWrapper.startTokenIndex : i2;
        if (i != i3) {
            arrayList.addAll(builder.createLeafNodes(markdownTokenTypes$Companion$WHITE_SPACE$1, i, i3));
        }
        int size = list.size();
        for (int i4 = 1; i4 < size; i4++) {
            TreeBuilder$MyASTNodeWrapper treeBuilder$MyASTNodeWrapper2 = (TreeBuilder$MyASTNodeWrapper) list.get(i4 - 1);
            TreeBuilder$MyASTNodeWrapper treeBuilder$MyASTNodeWrapper3 = (TreeBuilder$MyASTNodeWrapper) list.get(i4);
            arrayList.add(treeBuilder$MyASTNodeWrapper2.astNode);
            int i5 = treeBuilder$MyASTNodeWrapper2.endTokenIndex;
            int i6 = treeBuilder$MyASTNodeWrapper3.startTokenIndex;
            if (i5 != i6) {
                arrayList.addAll(builder.createLeafNodes(markdownTokenTypes$Companion$WHITE_SPACE$1, i5, i6));
            }
        }
        if (!list.isEmpty()) {
            arrayList.add(((TreeBuilder$MyASTNodeWrapper) CollectionsKt.last(list)).astNode);
            int i7 = ((TreeBuilder$MyASTNodeWrapper) CollectionsKt.last(list)).endTokenIndex;
            if (i7 != i2) {
                arrayList.addAll(builder.createLeafNodes(markdownTokenTypes$Companion$WHITE_SPACE$1, i7, i2));
            }
        }
        return new TreeBuilder$MyASTNodeWrapper(builder.createCompositeNode(markdownElementType, arrayList), i, i2);
    }

    @Override // androidx.credentials.Credential
    public final void flushEverythingBeforeEvent(TreeBuilder$MyEvent treeBuilder$MyEvent, List list) {
        treeBuilder$MyEvent.getClass();
    }
}
