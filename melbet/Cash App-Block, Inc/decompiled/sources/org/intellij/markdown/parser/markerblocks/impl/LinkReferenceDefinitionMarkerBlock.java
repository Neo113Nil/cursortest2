package org.intellij.markdown.parser.markerblocks.impl;

import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlock$ProcessingResult;
import org.intellij.markdown.parser.markerblocks.MarkerBlockImpl;

/* loaded from: classes10.dex */
public final class LinkReferenceDefinitionMarkerBlock extends MarkerBlockImpl {
    public final int endPosition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkReferenceDefinitionMarkerBlock(CommonMarkdownConstraints commonMarkdownConstraints, BlockContent blockContent, int i) {
        super(blockContent, commonMarkdownConstraints);
        commonMarkdownConstraints.getClass();
        this.endPosition = i;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final boolean allowsSubBlocks() {
        return false;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final int calcNextInterestingOffset(LookaheadText$Position lookaheadText$Position) {
        return this.endPosition;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final MarkerBlock$ProcessingResult doProcessToken(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints) {
        commonMarkdownConstraints.getClass();
        return lookaheadText$Position.globalPos < this.endPosition ? MarkerBlock$ProcessingResult.CANCEL : MarkerBlock$ProcessingResult.DEFAULT;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final MarkdownElementType getDefaultNodeType() {
        return MarkdownTokenTypes.LINK_DEFINITION;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final boolean isInterestingOffset(LookaheadText$Position lookaheadText$Position) {
        return true;
    }
}
