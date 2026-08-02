package org.intellij.markdown.parser;

import androidx.credentials.Credential;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import net.idrnd.face.iad.capture.internal.p0;
import okhttp3.FormBody;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes10.dex */
public final class InlineBuilder extends Credential {
    public int currentTokenPosition;
    public final p0 tokensCache;

    public InlineBuilder(FormBody.Builder builder, p0 p0Var) {
        super(builder);
        this.tokensCache = p0Var;
        this.currentTokenPosition = -1;
    }

    public final void addRawTokens(p0 p0Var, ArrayList arrayList, int i, int i2, int i3) {
        BlockContent blockContent = new BlockContent(p0Var, i, 6);
        int i4 = 0;
        while (true) {
            int i5 = i4 + i2;
            if (blockContent.info(i5).f1632type == null || blockContent.info(i5).tokenStart == i3) {
                break;
            } else {
                i4 = i5;
            }
        }
        while (i4 != 0) {
            MarkdownElementType markdownElementType = blockContent.info(i4).f1632type;
            markdownElementType.getClass();
            arrayList.addAll(((FormBody.Builder) this.data).createLeafNodes(markdownElementType, blockContent.info(i4).tokenStart, blockContent.info(i4 + 1).tokenStart));
            i4 -= i2;
        }
    }

    @Override // androidx.credentials.Credential
    public final TreeBuilder$MyASTNodeWrapper createASTNodeOnClosingEvent(TreeBuilder$MyEvent treeBuilder$MyEvent, List list, boolean z) {
        InlineBuilder inlineBuilder;
        list.getClass();
        SequentialParser.Node node = treeBuilder$MyEvent.info;
        MarkdownElementType markdownElementType = node.f1633type;
        IntRange intRange = node.range;
        int i = intRange.first;
        int i2 = intRange.last;
        ArrayList arrayList = new ArrayList(list.size());
        if (z) {
            addRawTokens(this.tokensCache, arrayList, i, -1, -1);
            inlineBuilder = this;
        } else {
            inlineBuilder = this;
        }
        int size = list.size();
        for (int i3 = 1; i3 < size; i3++) {
            TreeBuilder$MyASTNodeWrapper treeBuilder$MyASTNodeWrapper = (TreeBuilder$MyASTNodeWrapper) list.get(i3 - 1);
            TreeBuilder$MyASTNodeWrapper treeBuilder$MyASTNodeWrapper2 = (TreeBuilder$MyASTNodeWrapper) list.get(i3);
            arrayList.add(treeBuilder$MyASTNodeWrapper.astNode);
            int i4 = treeBuilder$MyASTNodeWrapper.endTokenIndex - 1;
            int i5 = treeBuilder$MyASTNodeWrapper2.startTokenIndex;
            p0 p0Var = inlineBuilder.tokensCache;
            inlineBuilder.addRawTokens(p0Var, arrayList, i4, 1, new BlockContent(p0Var, i5, 6).info(0).tokenStart);
        }
        if (!list.isEmpty()) {
            arrayList.add(((TreeBuilder$MyASTNodeWrapper) CollectionsKt.last(list)).astNode);
        }
        if (z) {
            p0 p0Var2 = inlineBuilder.tokensCache;
            inlineBuilder.addRawTokens(p0Var2, arrayList, i2 - 1, 1, new BlockContent(p0Var2, i2, 6).info(0).tokenStart);
        }
        return new TreeBuilder$MyASTNodeWrapper(((FormBody.Builder) inlineBuilder.data).createCompositeNode(markdownElementType, arrayList), i, i2);
    }

    @Override // androidx.credentials.Credential
    public final void flushEverythingBeforeEvent(TreeBuilder$MyEvent treeBuilder$MyEvent, List list) {
        treeBuilder$MyEvent.getClass();
        int i = treeBuilder$MyEvent.position;
        if (this.currentTokenPosition == -1) {
            this.currentTokenPosition = i;
        }
        while (true) {
            int i2 = this.currentTokenPosition;
            if (i2 >= i) {
                return;
            }
            BlockContent blockContent = new BlockContent(this.tokensCache, i2, 6);
            if (blockContent.getType() == null) {
                throw new MarkdownParsingException("");
            }
            FormBody.Builder builder = (FormBody.Builder) this.data;
            MarkdownElementType type2 = blockContent.getType();
            type2.getClass();
            for (ASTNodeImpl aSTNodeImpl : builder.createLeafNodes(type2, blockContent.info(0).tokenStart, blockContent.info(0).tokenEnd)) {
                if (list != null) {
                    int i3 = blockContent.lineCount;
                    list.add(new TreeBuilder$MyASTNodeWrapper(aSTNodeImpl, i3, i3 + 1));
                }
            }
            this.currentTokenPosition++;
        }
    }
}
