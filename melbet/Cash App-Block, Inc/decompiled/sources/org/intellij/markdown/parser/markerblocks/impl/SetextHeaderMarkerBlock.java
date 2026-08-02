package org.intellij.markdown.parser.markerblocks.impl;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlock$ProcessingResult;
import org.intellij.markdown.parser.markerblocks.MarkerBlockImpl;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes10.dex */
public final class SetextHeaderMarkerBlock extends MarkerBlockImpl {
    public final BlockContent contentMarker;
    public MarkdownElementType nodeType;
    public final BlockContent productionHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetextHeaderMarkerBlock(BlockContent blockContent, CommonMarkdownConstraints commonMarkdownConstraints) {
        super(new BlockContent(blockContent), commonMarkdownConstraints);
        commonMarkdownConstraints.getClass();
        this.productionHolder = blockContent;
        this.contentMarker = new BlockContent(blockContent);
        this.nodeType = MarkdownTokenTypes.SETEXT_1$1;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final boolean allowsSubBlocks() {
        return false;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final int calcNextInterestingOffset(LookaheadText$Position lookaheadText$Position) {
        return lookaheadText$Position.getNextLineOrEofOffset();
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final MarkerBlock$ProcessingResult doProcessToken(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints) {
        MarkdownElementType markdownElementType = MarkdownTokenTypes.SETEXT_2$1;
        commonMarkdownConstraints.getClass();
        if (lookaheadText$Position.localPos != -1) {
            return MarkerBlock$ProcessingResult.CANCEL;
        }
        Integer charsToNonWhitespace = lookaheadText$Position.charsToNonWhitespace();
        if (charsToNonWhitespace == null) {
            return new MarkerBlock$ProcessingResult(2, 2, 1);
        }
        LookaheadText$Position nextPosition = lookaheadText$Position.nextPosition(charsToNonWhitespace.intValue());
        if (nextPosition != null && ((CharSequence) nextPosition.this$0.parser).charAt(nextPosition.globalPos) == '-') {
            this.nodeType = markdownElementType;
        }
        int i = nextPosition != null ? nextPosition.globalPos : lookaheadText$Position.globalPos;
        MarkdownElementType markdownElementType2 = Intrinsics.areEqual(this.nodeType, markdownElementType) ? MarkdownTokenTypes.SETEXT_2 : MarkdownTokenTypes.SETEXT_1;
        MarkdownElementType markdownElementType3 = MarkdownTokenTypes.SETEXT_CONTENT;
        BlockContent blockContent = this.contentMarker;
        blockContent.getClass();
        markdownElementType3.getClass();
        BlockContent blockContent2 = (BlockContent) blockContent.sb;
        ((ArrayList) blockContent2.sb).add(new SequentialParser.Node(new IntRange(blockContent.lineCount, blockContent2.lineCount, 1), markdownElementType3));
        this.productionHolder.addProduction(CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(new IntRange(i, lookaheadText$Position.getNextLineOrEofOffset(), 1), markdownElementType2)));
        int nextLineOrEofOffset = lookaheadText$Position.getNextLineOrEofOffset();
        MarkerBlock$ProcessingResult markerBlock$ProcessingResult = MarkerBlock$ProcessingResult.DEFAULT;
        markerBlock$ProcessingResult.getClass();
        this.lastInterestingOffset = nextLineOrEofOffset;
        this.scheduledResult = markerBlock$ProcessingResult;
        return MarkerBlock$ProcessingResult.CANCEL;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final MarkdownElementType getDefaultNodeType() {
        return this.nodeType;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final boolean isInterestingOffset(LookaheadText$Position lookaheadText$Position) {
        return lookaheadText$Position.localPos == -1;
    }
}
