package org.intellij.markdown.parser.markerblocks.impl;

import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
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
public final class AtxHeaderMarkerBlock extends MarkerBlockImpl {
    public final MarkdownElementType nodeType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtxHeaderMarkerBlock(CommonMarkdownConstraints commonMarkdownConstraints, BlockContent blockContent, IntRange intRange, int i, int i2) {
        super(new BlockContent(blockContent), commonMarkdownConstraints);
        MarkdownElementType markdownElementType = MarkdownTokenTypes.ATX_6;
        commonMarkdownConstraints.getClass();
        int i3 = blockContent.lineCount;
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        int i4 = intRange.first;
        int i5 = i3 + i4;
        int i6 = intRange.last;
        int i7 = i3 + i6 + 1;
        IntRange intRange2 = new IntRange(i5, i7, 1);
        MarkdownElementType markdownElementType2 = MarkdownTokenTypes.ATX_HEADER;
        createListBuilder.add(new SequentialParser.Node(intRange2, markdownElementType2));
        if (i7 != i) {
            createListBuilder.add(new SequentialParser.Node(new IntRange(i7, i, 1), MarkdownTokenTypes.ATX_CONTENT));
        }
        if (i != i2) {
            createListBuilder.add(new SequentialParser.Node(new IntRange(i, i2, 1), markdownElementType2));
        }
        blockContent.addProduction(CollectionsKt__CollectionsJVMKt.build(createListBuilder));
        switch ((i6 - i4) + 1) {
            case 1:
                markdownElementType = MarkdownTokenTypes.ATX_1;
                break;
            case 2:
                markdownElementType = MarkdownTokenTypes.ATX_2;
                break;
            case 3:
                markdownElementType = MarkdownTokenTypes.ATX_3;
                break;
            case 4:
                markdownElementType = MarkdownTokenTypes.ATX_4;
                break;
            case 5:
                markdownElementType = MarkdownTokenTypes.ATX_5;
                break;
        }
        this.nodeType = markdownElementType;
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
        commonMarkdownConstraints.getClass();
        return lookaheadText$Position.localPos == -1 ? new MarkerBlock$ProcessingResult(2, 1, 1) : MarkerBlock$ProcessingResult.CANCEL;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final MarkdownElementType getDefaultNodeType() {
        return this.nodeType;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final boolean isInterestingOffset(LookaheadText$Position lookaheadText$Position) {
        return true;
    }
}
